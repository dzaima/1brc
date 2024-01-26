#include <stdint.h>

#define OFENCE_G(X) ({ __auto_type x_ = (X); __asm__("" : "=r"(x_) : "0"(x_)); x_; })
#define OFENCE_V(X) ({ __auto_type x_ = (X); __asm__("" : "=x"(x_) : "0"(x_)); x_; })

#ifdef __cplusplus
extern "C" {
#endif

extern void (*const core_1brc)(int32_t,uint64_t*,uint32_t,int8_t*,uint32_t*,int32_t*,int8_t*,uint64_t);
extern uint64_t (*const core_1brc_buf_elts)();
extern uint64_t (*const core_1brc_periter)();
extern uint32_t (*const hash_1brc)(int8_t*);

void failed_short(uint64_t nameStart, uint64_t nameEnd, int sample, int hash);
void failed_long(uint64_t nameStart, uint64_t nameEnd, int sample);
  
#ifdef __cplusplus
}
#endif
