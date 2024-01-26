#include "header.h"

#include <immintrin.h>
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
bool expanded_map = false;
#ifndef DEBUG
  #define DEBUG 0
#endif
#if DEBUG
  #define STAT_INC(N,d) stat_##N+= d
  long long stat_fs_cam, stat_fs_new, stat_fs_ndsum; // failed_short call amount, count of successful inserts, and sum of delta of those
  long long stat_fl_cam, stat_fl_gdsum, stat_fl_ndsum; // failed_long (or, really, get_data) call amount, get delta sum, insert delta sum
#else
  #define STAT_INC(...)
#endif


constexpr bool global_mmap = false;
int num_threads = 8;
static int thread_n = 0; // current thread number
#define RARE(X) __builtin_expect(X, 0)
#define LIKELY(X) __builtin_expect(X, 1)
#define assert(X) ({ if (!(X)) abort(); })

// copied from main.singeli:
constexpr int hashv_count = 4;
constexpr int exp_bulk = 16;
constexpr int dt_sum = 0;
constexpr int dt_num = 1;
constexpr int dt_min = 2;
constexpr int dt_max = 3;

constexpr ux hash_size_max = hash_mask_max + hashv_count + 1; // 1 reserved as placeholder for branchless writes
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

uint8_t name_not[256];
static __m256i loadu(const char* ptr) { return _mm256_loadu_si256((__m256i*)ptr); }
static bool eqname(const char* a, const char* b, ux n) {
  // return memcmp(a,b,n)==0;
  char* mask_start = (char*)(name_not+128-n);
  __m256i ok0 = _mm256_cmpeq_epi8(loadu(a   ), loadu(b   )) | loadu(mask_start);
  __m256i ok1 = _mm256_cmpeq_epi8(loadu(a+32), loadu(b+32)) | loadu(mask_start+32);
  __m256i ok2 = _mm256_cmpeq_epi8(loadu(a+64), loadu(b+64)) | loadu(mask_start+64);
  if (RARE(n>=96)) ok2 = _mm256_and_si256(ok2,
                _mm256_cmpeq_epi8(loadu(a+96), loadu(b+96)) | loadu(mask_start+96));
  __m256i ok = _mm256_and_si256(_mm256_and_si256(ok0,ok1), ok2);
  return _mm256_movemask_epi8(ok) == 0xffffffff;
}

static __attribute__((noinline)) int64_t* get_data_new(std::string_view k, uint32_t hash, uint32_t idx) {
  STAT_INC(fl_ndsum, idx - (hash & slow_mask));
  slow_filled_idxs[slow_count++] = idx;
  slow_hash[idx] = hash;
  
  slow_ent& r = slow_table[idx];
  r.name = (char*)calloc(128, 1);
  memcpy(r.name, k.data(), k.size());
  r.name[k.size()] = 0;
  r.name_len = k.size();
  r.data[dt_min] = -9999;
  r.data[dt_max] = -9999;
  return r.data;
}
static int64_t* get_data(std::string_view k, uint32_t hash) {
  STAT_INC(fl_cam, 1);
  ux len = k.size();
  if (RARE(hash==0)) hash = 1; // hash 0 is used as default
  ux idx = hash & slow_mask;
  while (true) {
    uint32_t found = slow_hash[idx];
    if (RARE(found == 0)) return get_data_new(k, hash, idx);
    if (found == hash) {
      slow_ent& r = slow_table[idx];
      if (LIKELY(r.name_len == len) && LIKELY(eqname(r.name, k.data(), len))) {
        STAT_INC(fl_gdsum, idx - (hash & slow_mask));
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
static void add_long(ux nameStart, ux nameEnd, int sample) {
  add_long(nameStart, nameEnd, sample, hash_1brc_long((int8_t*)(input+nameEnd)));
}

static char name_buf[512];
static void merge_ent(std::string_view k, int64_t* new_data) {
  char* end = name_buf+512;
  char* start = end - k.size();
  start[0] = 10;
  memcpy(start+1, k.data(), k.size());
  int64_t* map_data = get_data(k, hash_1brc_long((int8_t*)end));
  
  map_data[dt_sum]+= new_data[dt_sum];
  map_data[dt_num]+= new_data[dt_num];
  map_data[dt_min] = std::max(map_data[dt_min], new_data[dt_min]);
  map_data[dt_max] = std::max(map_data[dt_max], new_data[dt_max]);
}


uint32_t def_hash(ux i) { // hash to put at mapg_hash[i] such that it's never the expected one
  return i + hashv_count;
}

static bool Arrays_equals(char* a1, ux s1, ux e1, char* a2, ux s2, ux e2) {
  return memcmp(a1+s1, a2+s2, e1-s1) == 0;
}

extern "C" void failed_short(ux nameStart, ux nameEnd, int sample, uint32_t hash) {
  STAT_INC(fs_cam, 1);
  
  ux len = nameEnd-nameStart;
  uint32_t hashm = hash & hash_mask;
  ux idx = hashm;
  while (true) {
    if (mapg_hash[idx] == def_hash(idx)) break; // empty spot
    
    if (++idx == hashm + (ux)hashv_count) { // too many collisions, fall back to long map
      // if (DEBUG) printf("[t%d] super-failed short on hash %u/%u\n", thread_n, hashm, hash);
      if (expanded_map) {
        add_long(nameStart, nameEnd, sample);
      } else {
        if (DEBUG) printf("[t%d] too many collisions! expanding\n", thread_n);
        hash_mask = hash_mask_max; // 93% of existing hashmap entries essentially become dead sentinels. ¯\_(ツ)_/¯
        expanded_map = true;
        failed_short(nameStart, nameEnd, sample, hash); // try short path again, why not
      }
      return;
    }
  }
  
  STAT_INC(fs_new, 1);
  STAT_INC(fs_ndsum, idx-hashm);
  
  // if (DEBUG) printf("[t%d] new from failed_short for hash %u/%u\n", thread_n, hashm, hash);
  mapg_hash[idx] = hash;
  memcpy((char*)mapg_exp + (idx+1)*exp_bulk - len, input+nameStart, len);
  mapg_string[idx] = {input+nameStart, len};
  
  ux didx = idx*4;
  int32_t* map_data = mapg_data;
  map_data[didx+dt_sum]+= sample;
  map_data[didx+dt_num]+= 1;
  map_data[didx+dt_min] = std::max(map_data[didx+dt_min], -(int32_t)sample);
  map_data[didx+dt_max] = std::max(map_data[didx+dt_max], (int32_t)sample);
}
extern "C" void failed_long(ux nameStart, ux nameEnd, int sample, uint32_t hash) {
  add_long(nameStart, nameEnd, sample, hash);
}


constexpr ux lbound = 256; // to fit in a 100-byte name, plus SIMD overread
constexpr ux rbound = 64; // to fit in number after semicolon, and also SIMD read-past-the-end
ux periter;
ux* core_buf;

static void call_core(ux start) {
  (expanded_map? core_1brc_branchless_fail : core_1brc)(
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
  if (DEBUG) printf("[t%d] basic core range: %" SCNu64 "..%" SCNu64 "; max %" SCNu64 "; bounds: %" SCNu64 " & %" SCNu64 "\n", thread_n, start, end, (ux)(inputEnd-input), clb, crb);
  
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
  static_assert(hash_size_max-1 == 0xffff+4);
  for (ux i = 128; i < 256; i++) name_not[i] = 0xff;
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
        std::string_view name{name_start, (size_t)(curr-name_start)};
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
  
  if (DEBUG) printf("[t%d] total slice: %" SCNu64 "..%" SCNu64 "\n", thread_n, start, end);
  
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
  
  #if DEBUG
    ux n = 0;
    for (ux i = 0; i < slow_count; i++) n+= slow_table[slow_filled_idxs[i]].data[dt_num];
    for (int i = 0; i < hash_size(); i++) if (mapg_hash[i] != def_hash(i)) n+= mapg_data[i*4 + dt_num];
    
    printf("[t%d] processed row count: %lld\n", thread_n, (long long)n);
    printf("[t%d] short map: %4lld entries; %lld lookups (%.4g%%); avg chain %.3g", thread_n,     stat_fs_new, stat_fs_cam, stat_fs_cam*100.0/n, stat_fs_ndsum*1.0/stat_fs_new);
    printf("; misses: %lld (%.4g%%)\n", stat_fs_cam-stat_fs_new, (stat_fs_cam-stat_fs_new)*100.0/n);
    printf("[t%d] slow map:  %4d entries; %lld lookups (%.4g%%); avg chain %.3g\n", thread_n, (int)slow_count, stat_fl_cam, stat_fl_cam*100.0/n, stat_fl_ndsum*1.0/slow_count);
    
    // printf("short map occupancy: "); for (int i = 0; i < hash_size(); i++) printf("%c", mapg_hash[i]==def_hash(i)? '.' : '#'); printf("\n");
    // printf("slow map occupancy: "); for (int i = 0; i < slow_size; i++) printf("%c", slow_hash[i]==0? '.' : '#'); printf("\n");
  #endif
  
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