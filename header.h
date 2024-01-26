#include <stdint.h>

#if !__has_builtin(__builtin_unpredictable)
  #define __builtin_unpredictable(x) x
#endif

#define hash_mask_max 0x7fff

#define OFENCE_G(X) ({ __auto_type x_ = (X); __asm__("" : "=r"(x_) : "0"(x_)); x_; })
#define OFENCE_V(X) ({ __auto_type x_ = (X); __asm__("" : "=x"(x_) : "0"(x_)); x_; })
#define CMOV_DAMMIT(COND, T, F) ({ __auto_type r_ = (F); asm volatile ("  test %2, %2\n  cmovne %1, %0" : "+r" (r_) : "r" (T), "r" (COND) : "cc"); r_; })

#ifdef __cplusplus
extern "C" {
#endif

extern void (*const core_1brc)(int32_t,uint64_t*,uint32_t,int8_t*,uint32_t*,int32_t*,int8_t*,uint64_t);
extern void (*const core_1brc_branchless_fail)(int32_t,uint64_t*,uint32_t,int8_t*,uint32_t*,int32_t*,int8_t*,uint64_t);
extern uint64_t (*const core_1brc_buf_elts)();
extern uint64_t (*const core_1brc_periter)();
extern uint32_t (*const hash_1brc_short)(int8_t*);
extern uint32_t (*const hash_1brc_long)(int8_t*);

void failed_short(uint64_t nameStart, uint64_t nameEnd, int sample, uint32_t hash);
void failed_long(uint64_t nameStart, uint64_t nameEnd, int sample, uint32_t hash);
  
#ifdef __cplusplus
}
#endif
