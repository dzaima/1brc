#include <stdint.h>

#define OFENCE_G(X) ({ __auto_type x_ = (X); __asm__("" : "=r"(x_) : "0"(x_)); x_; })
#define OFENCE_V(X) ({ __auto_type x_ = (X); __asm__("" : "=x"(x_) : "0"(x_)); x_; })

#ifdef __cplusplus
extern "C" {
#endif

extern void (*const core_1brc)(int32_t,uint64_t*,uint32_t,int8_t*,uint32_t*,int32_t*,int8_t*,uint64_t);
extern uint64_t (*const core_1brc_buf_elts)();
extern uint64_t (*const core_1brc_periter)();
extern uint32_t (*const hash_1brc_short)(int8_t*);
extern uint64_t (*const info_1brc_long)(int8_t*); // len | hash<<32

void failed_short(uint64_t nameStart, uint64_t nameEnd, int sample, uint32_t hash);
void failed_long(uint64_t nameStart, uint64_t nameEnd, int sample, uint32_t hash);
  
#ifdef __cplusplus
}
#endif
