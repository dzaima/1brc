#include "header.h"

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
constexpr int hash_mask = 0xfff; // i.e. hash table size minus one
int num_threads = 8;

// copied from main.singeli:
constexpr int hashv_count = 4;
constexpr int exp_bulk = 16;
constexpr int dt_sum = 0;
constexpr int dt_num = 1;
constexpr int dt_min = 2;
constexpr int dt_max = 3;

constexpr int hash_size = hash_mask + hashv_count;

char* input;
int64_t     mapg_data  [hash_size*4];
int8_t      mapg_exp   [hash_size*exp_bulk];
uint32_t    mapg_hash  [hash_size*exp_bulk];
std::string mapg_string[hash_size];



std::unordered_map<std::string, int64_t*> long_entries;
static int64_t* get_data(std::string& k) {
  if (!long_entries.count(k)) {
    int64_t* p = long_entries[k] = new int64_t[4]();
    p[dt_min] = 9999;
    p[dt_max] = -9999;
  }
  return long_entries[k];
}

static void failed_long(ux nameStart, ux nameEnd, int sample) {
  std::string k{input+nameStart, nameEnd-nameStart};
  int64_t* map_data = get_data(k);
  
  int didx = 0;
  map_data[didx+dt_sum]+= sample;
  map_data[didx+dt_num]+= 1;
  map_data[didx+dt_min] = std::min(map_data[didx+dt_min], (int64_t)sample);
  map_data[didx+dt_max] = std::max(map_data[didx+dt_max], (int64_t)sample);
}
static void merge_ent(std::string k, int64_t* new_data) {
  int64_t* map_data = get_data(k);
  
  map_data[dt_sum]+= new_data[dt_sum];
  map_data[dt_num]+= new_data[dt_num];
  map_data[dt_min] = std::min(map_data[dt_min], new_data[dt_min]);
  map_data[dt_max] = std::max(map_data[dt_max], new_data[dt_max]);
}


int def_hash(int i) { // hash to put at mapg_hash[i] such that it's never the expected one
  return i + hashv_count;
}

static int read_sample(ux semiPos) {
  ux i = semiPos+1;
  bool neg = false;
  if (input[i]=='-') {
    i++;
    neg = true;
  }
  int res = input[i++]-'0';
  
  int c = input[i++];
  if (c!='.') {
    res = res*10 + c-'0';
    i++; // skip '.'
  }
  res = res*10 + input[i]-'0';
  
  return neg? -res : res;
}


extern "C" void failed_long(ux nameEnd, int sample) {
  ux nameStart = nameEnd;
  while (nameStart != 0) {
    if (input[nameStart-1]=='\n') break;
    nameStart--;
  }
  failed_long(nameStart, nameEnd, sample);
}
extern "C" void hash_slow(ux nameEnd, int sample) {
  uint32_t hash = 0;
  uint8_t sh = 24;
  ux nameStart = nameEnd;
  while (nameStart>=1) {
    char c = input[nameStart-1];
    if (c=='\n') break;
    hash^= (c&0xff) << sh;
    nameStart--;
    sh-= 8;
  }
  if (nameEnd-nameStart >= exp_bulk) {
    failed_long(nameStart, nameEnd, sample);
    return;
  }
  hash^= (uint32_t)(((int32_t)hash) >> 16);
  
  ux hashm = hash & hash_mask;
  ux idx = hashm;
  while (mapg_hash[idx] != def_hash(idx) && mapg_hash[idx]!=hash) {
    if (++idx == hashm + hashv_count) {
      failed_long(nameStart, nameEnd, sample);
      return;
    }
  }
  
  mapg_hash[idx] = hash;
  ux len = nameEnd-nameStart;
  memcpy((char*)mapg_exp + (idx+1)*exp_bulk - len, input+nameStart, len);
  mapg_string[idx] = {input+nameStart, nameEnd-nameStart};
  
  ux didx = idx*4;
  int64_t* map_data = mapg_data;
  map_data[didx+dt_sum]+= sample;
  map_data[didx+dt_num]+= 1;
  map_data[didx+dt_min] = std::min(map_data[didx+dt_min], (int64_t)sample);
  map_data[didx+dt_max] = std::max(map_data[didx+dt_max], (int64_t)sample);
}
void failed_short(ux nameEnd, int sample) {
  hash_slow(nameEnd, sample);
}


void basic_core(ux start, ux end) {
  for (ux i = start; i < end; i++) {
    if (input[i] == ';') hash_slow(i, read_sample(i));
  }
}

static std::string fmt(double x) {
  int i = round(x);
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
void print_stats() {
  std::vector<std::pair<std::string, int64_t*>> ents;
  for (auto& ent : long_entries) {
    ents.emplace_back(ent.first, ent.second);
  }
  
  for (int i = 0; i < hash_size; i++) {
    if (mapg_hash[i] != def_hash(i)) {
      ents.emplace_back(mapg_string[i], mapg_data + i*4);
    }
  }
  std::sort(ents.begin(), ents.end());
  
  std::cout << '{';
  bool first = true;
  for (auto& ent : ents) {
    if (first) first = false;
    else std::cout << ", ";
    int64_t* buf = ent.second;
    std::cout << ent.first << '=' << fmt(buf[dt_min]) << '/' << fmt(buf[dt_sum]*1.0 / buf[dt_num]) << '/' << fmt(buf[dt_max]);
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
  ux flen = lseek(fd, 0, SEEK_END);
  input = (char*)mmap(0, flen, PROT_READ, MAP_SHARED, fd, 0);
  
  for (ux i = 0; i < hash_size; i++) mapg_hash[i] = def_hash(i);
  for (ux i = 0; i < hash_size; i++) {
    mapg_data[i*4 + dt_min] = 9999;
    mapg_data[i*4 + dt_max] = -9999;
  }
  
  
  int periter = core_1brc_periter();
  
  int lbound = 128; // to fit in a 100-byte name
  int rbound = 64; // to fit in number after semicolon, and also SIMD read-past-the-end
  
  ux start = 0;
  ux end = flen;
  
  
  
  char* thread_stats = NULL;
  if (num_threads > 1) {
    char** all_stats = new char*[num_threads];
    int* pids = new int[num_threads];
    int max_names = 10000;
    int max_ent_length = 100 + 1 + 4*8; // name + ";" + 4 × u64
    int stat_len = max_names*max_ent_length;
    
    for (int i = 0; i < num_threads; i++) {
      thread_stats = (char*) mmap(NULL, stat_len, PROT_READ|PROT_WRITE, MAP_ANONYMOUS|MAP_SHARED, -1, 0);
      all_stats[i] = thread_stats;
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
    
    print_stats();
    return 0;
    
    run_core:;
  }
  
  // parse head the slow way
  int init_end = start + lbound;
  if (init_end > end) init_end = (int)end;
  basic_core(start, init_end);
  start = init_end;
  
  
  
  ux* buf = new ux[core_1brc_buf_elts()];
  
  ux inpsize = lbound + periter + rbound;
  while (start+inpsize < end) {
    core_1brc(
      0, buf,
      hash_mask,
      mapg_exp, mapg_hash, mapg_data,
      (int8_t*)input, start
    );
    start+= periter;
  }
  
  
  ux left = end-start;
  if (left > 0) basic_core(end-left, end);
  
  if (thread_stats == NULL) {
    print_stats();
  } else {
    auto add = [&thread_stats](std::string name, int64_t* data){
      int nlen = name.size();
      memcpy(thread_stats, name.data(), nlen);
      thread_stats+= nlen;
      *thread_stats++ = ';';
      
      for (int i = 0; i < 4; i++) {
        memcpy(thread_stats, data+i, sizeof(int64_t));
        thread_stats+= sizeof(int64_t);
      }
    };
    
    for (auto& ent : long_entries) add(ent.first, ent.second);
    
    for (int i = 0; i < hash_size; i++) {
      if (mapg_hash[i] != def_hash(i)) add(mapg_string[i], mapg_data + i*4);
    }
    
    *thread_stats++ = ';';
  }
}