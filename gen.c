#ifdef __aarch64__
  #include "gen_arm.c"
#else
  #include "gen_x86.c"
#endif