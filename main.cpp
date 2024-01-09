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

typedef uint64_t ux;
constexpr int hash_mask = 0xfff; // i.e. hash table size minus one

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
static void failed_long(ux nameStart, ux nameEnd, int sample) {
  std::string k{input+nameStart, nameEnd-nameStart};
  
  if (!long_entries.count(k)) {
    int64_t* p = long_entries[k] = new long[4];
    p[dt_min] = 9999;
  }
  int64_t* map_data = long_entries[k];
  
  int didx = 0;
  map_data[didx+dt_sum]+= sample;
  map_data[didx+dt_num]+= 1;
  map_data[didx+dt_min] = std::min(map_data[didx+dt_min], (int64_t)sample);
  map_data[didx+dt_max] = std::max(map_data[didx+dt_max], (int64_t)sample);
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
  while (true) {
    ux prev = nameStart-1;
    if (prev<0 || input[prev]=='\n') break;
    nameStart = prev;
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
    failed_long(nameEnd, sample);
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


int main(int argc, char* argv[]) {
  int fd = open(argc==1? "measurements.txt" : argv[1], 0);
  if (fd == -1) {
    std::cout << "couldn't open file" << std::endl;
    exit(1);
  }
  ux flen = lseek(fd, 0, SEEK_END);
  input = (char*)mmap(0, flen, 1, 1, fd, 0);
  
  for (ux i = 0; i < hash_size; i++) mapg_hash[i] = def_hash(i);
  for (ux i = 0; i < hash_size; i++) mapg_data[i*4 + dt_min] = 9999;
  
  
  
  int periter = core_1brc_periter();
  
  int lbound = 128; // to fit in a 100-byte name
  int rbound = 64; // to fit in number after semicolon, and also SIMD read-past-the-end
  
  
  // parse head the slow way
  int init = lbound; // for fast path
  init+= 130000; // process some entries here, to perhaps make sure JIT doesn't think that the not-found path is common
  if (init > flen) init = (int)flen;
  basic_core(0, init);
  
  ux start = init;
  
  ux* buf = new ux[core_1brc_buf_elts()];
  
  ux inpsize = lbound + periter + rbound;
  while (start+inpsize < flen) {
    core_1brc(
      0, buf,
      hash_mask,
      mapg_exp, mapg_hash, mapg_data,
      (int8_t*)input, start
    );
    start+= periter;
  }
  
  
  ux left = flen-start;
  if (left > 0) basic_core(flen-left, flen);
  
  std::vector<std::pair<std::string, int64_t*>> ents;
  for (auto ent : long_entries) {
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
  for (auto ent : ents) {
    if (first) first = false;
    else std::cout << ", ";
    int64_t* buf = ent.second;
    std::cout << ent.first << '=' << fmt(buf[dt_min]) << '/' << fmt(buf[dt_sum]*1.0 / buf[dt_num]) << '/' << fmt(buf[dt_max]);
  }
  std::cout << '}' << std::endl;
}