#include "header.h"

#include <cinttypes>
#include <climits>
#include <cmath>
#include <string.h>
#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <sys/mman.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

typedef uint64_t ux;

// hash table size minus one; start out small, expand to big one on a bunch of collisions
constexpr uint32_t hash_mask_max = 0xffff;
uint32_t hash_mask = 0xfff;
#ifndef DEBUG
  #define DEBUG 0
#endif


constexpr bool global_mmap = false;
int num_threads = 8;
static int thread_n = 0; // current thread number
#define RARE(X) __builtin_expect(X, 0)
#define assert(X) ({ if (!(X)) abort(); })

// copied from main.singeli:
constexpr int hashv_count = 4;
constexpr int exp_bulk = 16;
constexpr int dt_sum = 0;
constexpr int dt_num = 1;
constexpr int dt_min = 2;
constexpr int dt_max = 3;

constexpr ux hash_size_max = hash_mask_max + hashv_count;
static ux hash_size() { return hash_mask + hashv_count; }
char exp_zeroes[exp_bulk];

char* input;
char* inputEnd;
int64_t     mapg_sum   [hash_size_max]; // full-width sum
int32_t     mapg_data  [hash_size_max*4];
int8_t      mapg_exp   [hash_size_max*exp_bulk];
uint32_t    mapg_hash  [hash_size_max*exp_bulk];
std::string mapg_string[hash_size_max];



struct slow_ent {
  char* name;
  ux name_len;
  int64_t data[4];
};

constexpr uint32_t slow_mask = 0xffff;
constexpr ux slow_size = slow_mask + 10000 + 128; // enough space for all names having hash 0xffff, plus a buffer for overread

uint32_t slow_hash[slow_size]; // if 0, empty
slow_ent slow_table[slow_size];

uint32_t slow_filled_idxs[10000]; // for iterations over the slow table to be faster
ux slow_count = 0;


static __attribute__((noinline)) int64_t* get_data_new(std::string_view k, uint32_t hash, uint32_t idx) {
  slow_filled_idxs[slow_count++] = idx;
  
  slow_hash[idx] = hash;
  
  slow_ent& r = slow_table[idx];
  r.name = (new std::string(k))->data();
  r.name_len = k.size();
  r.data[dt_min] = -9999;
  r.data[dt_max] = -9999;
  return r.data;
}
static int64_t* get_data(std::string_view k, uint32_t hash) {
  ux len = k.size();
  // uint32_t hash = 0;
  // for (ux i = 0; i < len; i++) hash = hash*31 + k[i];
  if (RARE(hash==0)) hash = 1; // hash 0 is used as default
  ux idx = hash & slow_mask;
  while (true) {
    uint32_t found = slow_hash[idx];
    if (RARE(found == 0)) return get_data_new(k, hash, idx);
    if (found == hash) {
      slow_ent& r = slow_table[idx];
      if (r.name_len == len && memcmp(r.name, k.data(), len)==0) {
        return r.data;
      }
    }
    idx++;
  }
}

static void add_long(ux nameStart, ux nameEnd, int sample, uint32_t hash) {
  std::string_view k{input+nameStart, nameEnd-nameStart};
  int64_t* map_data = get_data(k, hash);
  
  int didx = 0;
  map_data[didx+dt_sum]+= sample;
  map_data[didx+dt_num]+= 1;
  map_data[didx+dt_min] = std::max(map_data[didx+dt_min], -(int64_t)sample);
  map_data[didx+dt_max] = std::max(map_data[didx+dt_max], (int64_t)sample);
}
static uint32_t long_hash(char* ptr) {
  return info_1brc_long((int8_t*)ptr)>>32;
}
static void add_long(ux nameStart, ux nameEnd, int sample) {
  add_long(nameStart, nameEnd, sample, long_hash(input+nameEnd));
}

static char name_buf[512];
static void merge_ent(std::string k, int64_t* new_data) {
  char* end = name_buf+512;
  char* start = end - k.size();
  start[0] = 10;
  memcpy(start+1, k.data(), k.size());
  int64_t* map_data = get_data(k, long_hash(end));
  
  map_data[dt_sum]+= new_data[dt_sum];
  map_data[dt_num]+= new_data[dt_num];
  map_data[dt_min] = std::max(map_data[dt_min], new_data[dt_min]);
  map_data[dt_max] = std::max(map_data[dt_max], new_data[dt_max]);
}


int def_hash(int i) { // hash to put at mapg_hash[i] such that it's never the expected one
  return i + hashv_count;
}

static bool Arrays_equals(char* a1, ux s1, ux e1, char* a2, ux s2, ux e2) {
  return memcmp(a1+s1, a2+s2, e1-s1) == 0;
}

static void add_short(ux nameStart, ux nameEnd, int sample, uint32_t hash) {
  ux len = nameEnd-nameStart;
  ux hashm = hash & hash_mask;
  ux idx = hashm;
  while (true) {
    int exp_end = (idx+1)*exp_bulk;
    int exp_start = exp_end - len;
    if (mapg_hash[idx] == hash && // already present
        Arrays_equals((char*)mapg_exp, exp_start, exp_end,            input, nameStart, nameEnd) &&
        Arrays_equals((char*)mapg_exp, exp_end-exp_bulk, exp_start,   exp_zeroes, 0, exp_bulk-len)) {
      break;
    }
    if (mapg_hash[idx] == def_hash(idx)) { // empty spot
      mapg_hash[idx] = hash;
      memcpy((char*)mapg_exp + (idx+1)*exp_bulk - len, input+nameStart, len);
      mapg_string[idx] = {input+nameStart, len};
      break;
    }
    if (++idx == hashm + hashv_count) { // too many collisions, fall back to long map
      if (hash_mask == hash_mask_max) {
        add_long(nameStart, nameEnd, sample);
      } else {
        if (DEBUG) printf("[t%d] too many collisions! expanding\n", thread_n);
        hash_mask = hash_mask_max; // 93% of existing hashmap entries essentially become dead sentinels. ¯\_(ツ)_/¯
        add_short(nameStart, nameEnd, sample, hash); // try short path again, why not
      }
      return;
    }
  }
  
  ux didx = idx*4;
  int32_t* map_data = mapg_data;
  map_data[didx+dt_sum]+= sample;
  map_data[didx+dt_num]+= 1;
  map_data[didx+dt_min] = std::max(map_data[didx+dt_min], -(int32_t)sample);
  map_data[didx+dt_max] = std::max(map_data[didx+dt_max], (int32_t)sample);
}
extern "C" void failed_short(ux nameStart, ux nameEnd, int sample, int hash) {
  add_short(nameStart, nameEnd, sample, hash);
}
extern "C" void failed_long(ux nameStart, ux nameEnd, int sample, uint32_t hash) {
  add_long(nameStart, nameEnd, sample, hash);
}


constexpr ux lbound = 256; // to fit in a 100-byte name, plus SIMD overread
constexpr ux rbound = 64; // to fit in number after semicolon, and also SIMD read-past-the-end
ux periter;
ux* core_buf;

static void call_core(ux start) {
  core_1brc(
    0, core_buf,
    hash_mask,
    mapg_exp, mapg_hash, mapg_data,
    (int8_t*)input, start
  );
}
void basic_core(ux start, ux end) {
  char* input0 = input;
  ux len = end-start;
  // get actually available data bounds
  ux clb = std::min(start, lbound);
  ux crb = std::min(inputEnd-input - end, rbound);
  if (DEBUG) printf("[t%d] basic core range: %" SCNu64 "..%" SCNu64 "; max %" SCNu64 "\n", thread_n, start, end, (ux)(inputEnd-input));
  if (DEBUG) printf("[t%d] basic core bounds: %" SCNu64 " & %" SCNu64 "\n", thread_n, clb, crb);
  
  // create a buffer that looks like a real subset of the input
  ux nstart = lbound;
  ux nend = nstart + len;
  input = (char*)calloc(len + periter + lbound + rbound, 1); // trailing null bytes are fine
  // don't bother updating nameEnd
  
  char* cpyDst = input+nstart - clb;
  ux cpyLen = len+clb+crb;
  memcpy(cpyDst, input0+start - clb, cpyLen);
  if (cpyDst > input) cpyDst[-1] = 10; // ensure an always available newline before the first name
  ux nendReal = cpyDst+cpyLen - input;
  for (ux i = nend; i < nendReal; i++) if (input[i]==';') input[i] = 0; // ensure no semicolons outside parsed range
  while (nstart < nend) {
    call_core(nstart);
    nstart+= periter;
  }
  free(input);
  
  input = input0;
}

static std::string fmt(double x) {
  int i = lround(x);
  if (x-i == 0.5 && i<0) i++; // emulate a round-to-positive-infinity, i.e. what Java's Math.round does, for ease of testing
  char buf[6]; // "-10.1\0"
  char* c = buf;
  if (i<0) { *c++='-'; i = -i; }
  if (i>=100) { *c++ = '0' + i/100; }
  *c++ = '0' + (i/10)%10;
  *c++ = '.';
  *c++ = '0' + i%10;
  *c++ = '\0';
  
  return std::string(buf);
}
static int64_t* expand_stats(ux idx) {
  int32_t* ptr = mapg_data + idx*4;
  int64_t sum1 = mapg_sum[idx];
  return new long[]{ptr[0]+sum1, ptr[1], ptr[2], ptr[3]};
}
void print_stats() {
  std::vector<std::pair<std::string, int64_t*>> ents;
  for (ux i = 0; i < slow_count; i++) {
    slow_ent& r = slow_table[slow_filled_idxs[i]];
    ents.emplace_back(r.name, r.data);
  }
  
  for (int i = 0; i < hash_size(); i++) {
    if (mapg_hash[i] != def_hash(i)) {
      ents.emplace_back(mapg_string[i], expand_stats(i));
    }
  }
  std::sort(ents.begin(), ents.end());
  
  std::cout << '{';
  bool first = true;
  for (auto& ent : ents) {
    if (first) first = false;
    else std::cout << ", ";
    int64_t* buf = ent.second;
    std::cout << ent.first << '=' << fmt(-buf[dt_min]) << '/' << fmt(buf[dt_sum]*1.0 / buf[dt_num]) << '/' << fmt(buf[dt_max]);
  }
  std::cout << '}' << std::endl;
}

int main(int argc, char* argv[]) {
  char* num_str = std::getenv("THREADS_1BRC");
  if (num_str!=nullptr) num_threads = atoi(num_str);
  
  int fd = open(argc==1? "measurements.txt" : argv[1], 0);
  if (fd == -1) {
    std::cout << "couldn't open file" << std::endl;
    exit(1);
  }
  
  bool quiet = argc<3? false : argv[2][0]=='q';
  
  ux flen = lseek(fd, 0, SEEK_END);
  if (global_mmap) {
    input = (char*)mmap(0, flen, PROT_READ, MAP_SHARED, fd, 0);
    inputEnd = input+flen;
  }
  
  for (ux i = 0; i < hash_size_max; i++) mapg_hash[i] = def_hash(i);
  for (ux i = 0; i < hash_size_max; i++) {
    mapg_data[i*4 + dt_min] = -9999;
    mapg_data[i*4 + dt_max] = -9999;
  }
  
  
  periter = core_1brc_periter();
  
  ux start = 0;
  ux end = flen;
  
  
  
  char* thread_stats = nullptr;
  if (num_threads > 1) {
    char** all_stats = new char*[num_threads];
    int* pids = new int[num_threads];
    int max_names = 10000;
    int max_ent_length = 100 + 1 + 4*8; // name + ";" + 4 × u64
    int stat_len = max_names*max_ent_length;
    
    for (int i = 0; i < num_threads; i++) {
      thread_stats = (char*) mmap(nullptr, stat_len, PROT_READ|PROT_WRITE, MAP_ANONYMOUS|MAP_SHARED, -1, 0);
      all_stats[i] = thread_stats;
      thread_n = i;
      int chpid = fork();
      if (chpid==0) {
        start = (flen *  i   ) / num_threads;
        end   = (flen * (i+1)) / num_threads;
        goto run_core;
      }
      pids[i] = chpid;
    }
    
    // aggregate stats
    int status;
    for (int i = 0; i < num_threads; i++) {
      waitpid(pids[i], &status, 0);
      char* curr = all_stats[i];
      
      while (*curr != ';') {
        char* name_start = curr;
        while (*curr != ';') curr++;
        std::string name{name_start, (size_t)(curr-name_start)};
        curr++;
        
        int64_t* data = new int64_t[4];
        for (int i = 0; i < 4; i++) {
          memcpy(data+i, curr, sizeof(int64_t));
          curr+= sizeof(int64_t);
        }
        merge_ent(name, data);
      }
    }
    
    if (!quiet) print_stats();
    return 0;
    
    run_core:;
  }
  
  constexpr ux map_size = 32<<20; // 32MiB
  ux map_off = 0;
  constexpr ux align = 4096;
  assert(align >= lbound);
  constexpr ux alignm = align - 1;
  auto ensure_input = [&fd, &map_off, &start, &end](ux s, ux e) { // potentiall updates input & start & end
    if (global_mmap) return;
    if (RARE(input==nullptr) || RARE(e>=map_size)) {
      if (e+rbound >= map_size) {
        ux delta = s & ~alignm;
        assert(delta!=0);
        delta-= align; // as align>=lbound, guarantees lbound stays
        start-= delta;
        end-= delta;
        map_off+= delta;
        assert(e-delta + rbound < map_size);
      }
      // if (input!=nullptr) munmap(input, map_size);
      // std::cout << "req "<<s<<".."<<e<<": mapping off=" << map_off << "; start=" << start << ", end=" << end << std::endl;
      input = (char*)mmap(input, map_size, PROT_READ, MAP_PRIVATE | (input==nullptr? 0 : MAP_FIXED) | MAP_POPULATE, fd, map_off);
      inputEnd = input+map_size;
    }
  };
  
  core_buf = new ux[core_1brc_buf_elts()];
  // parse head the slow way
  ux init_end = start + lbound;
  init_end = (init_end + alignm) & ~alignm;
  if (init_end > end) init_end = (ux)end;
  ux init_len = init_end - start;
  
  ensure_input(start, init_end);
  basic_core(start, start+init_len);
  start+= init_len;
  
  
  if (DEBUG) printf("[t%d] processing %" SCNu64 "..%" SCNu64 "\n", thread_n, start, end);
  
  ux inpsize = lbound + periter + rbound;
  ux bulkchars = 0;
  while (start+inpsize < end) {
    ensure_input(start, start+periter);
    call_core(start);
    start+= periter;
    bulkchars+= periter;
    if (bulkchars > 12800000) { // (2⋆31)÷999 records are needed to overflow the int32_t sum. At max there's one record per 6 chars "a;0.0\n", so 6×(2⋆31)÷999; round down for head/tail to fit
      ux n = hash_size();
      for (ux i = 0; i < n; i++) {
        mapg_sum[i]+= mapg_data[i*4 + dt_sum];
        mapg_data[i*4 + dt_sum] = 0;
      }
      bulkchars = 0;
    }
  }
  
  
  ux left = end-start;
  if (left > 0) {
    ensure_input(end-left, end);
    basic_core(end-left, end);
  }
  
  if (DEBUG) printf("[t%d] total slowtable entries: %d\n", thread_n, (int)slow_count);
  
  if (thread_stats == nullptr) {
    if (!quiet) print_stats();
  } else {
    auto add = [&thread_stats](std::string_view name, int64_t* data){
      int nlen = name.size();
      memcpy(thread_stats, name.data(), nlen);
      thread_stats+= nlen;
      *thread_stats++ = ';';
      
      for (int i = 0; i < 4; i++) {
        memcpy(thread_stats, data+i, sizeof(int64_t));
        thread_stats+= sizeof(int64_t);
      }
    };
    
    for (ux i = 0; i < slow_count; i++) {
      slow_ent& r = slow_table[slow_filled_idxs[i]];
      add(r.name, r.data);
    }
    
    ux n = hash_size();
    for (int i = 0; i < n; i++) {
      if (mapg_hash[i] != def_hash(i)) add(mapg_string[i], expand_stats(i));
    }
    
    *thread_stats++ = ';';
  }
}