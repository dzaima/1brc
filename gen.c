#include<stdint.h>
#include<stdbool.h>
#include<immintrin.h>
#include<stdio.h>
#include<inttypes.h>
#include<stdlib.h>
#include<header.h>
#include<string.h>

static uint64_t si_f0_core_1brc_buf_elts() {
  return ((uint64_t)4016ull);
}

static uint64_t si_f1_core_1brc_periter() {
  return ((uint64_t)10624ull);
}

static uint32_t si_f2_hash_1brc(int8_t* v0_arr) {
  int8_t* v1 = v0_arr + ((uint64_t)0ull);
  __m128i* v2 = (__m128i*)v1;
  __m128i* v3 = v2 + ((int64_t)0ll);
  __m128i v4 = _mm_loadu_si128(v3);
  __m128i v5_hv = v4;
  __m128i v6 = _mm_shuffle_epi32(v5_hv, 238);
  v5_hv = _mm_xor_si128(v5_hv, v6);
  __m128i v7 = v5_hv;
  __m128i v8 = _mm_srli_epi64(v7, 32);
  __m128i v9 = v8;
  v5_hv = _mm_xor_si128(v5_hv, v9);
  __m128i v10 = v5_hv;
  __m128i v11 = _mm_srai_epi32(v10, 16);
  __m128i v12 = v11;
  v5_hv = _mm_xor_si128(v5_hv, v12);
  __m128i v13 = v5_hv;
  int32_t v14 = _mm_extract_epi32(v13, 0);
  uint32_t v15 = (uint32_t)v14;
  return v15;
}

static void si_f3_core_1brc(int32_t v0_ident, uint64_t* v1_bufdata, uint32_t v2_hash_mask, int8_t* v3_map_exp, uint32_t* v4_map_hash, int32_t* v5_map_data, int8_t* v6_inp, uint64_t v7_inpOff) {
  uint64_t v8_pos = ((uint64_t)0ull);
  uint64_t v9_pos = ((uint64_t)1004ull);
  uint64_t v10_pos = ((uint64_t)2008ull);
  uint64_t v11_pos = ((uint64_t)3012ull);
  uint64_t v12_bufEnds_[4]; uint64_t* v12_bufEnds = v12_bufEnds_;
  uint64_t v13_pos = v7_inpOff;
  uint64_t v14_pos = v7_inpOff + ((uint64_t)32ull);
  uint64_t v15_pos = v7_inpOff + ((uint64_t)64ull);
  uint64_t v16_pos = v7_inpOff + ((uint64_t)96ull);
  uint64_t v17_i = ((uint64_t)0ull);
l0:;
  bool v18 = v17_i < ((uint64_t)83ull);
  if (!(v18)) goto l1;
  int8_t* v19 = v6_inp + v13_pos;
  __m256i* v20 = (__m256i*)v19;
  __m256i* v21 = v20 + ((int64_t)0ll);
  __m256i v22 = _mm256_loadu_si256(v21);
  __m256i v23 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v24 = _mm256_cmpeq_epi8(v23, v22);
  uint32_t v25 = _mm256_movemask_epi8(v24);
  int8_t* v26 = v6_inp + v14_pos;
  __m256i* v27 = (__m256i*)v26;
  __m256i* v28 = v27 + ((int64_t)0ll);
  __m256i v29 = _mm256_loadu_si256(v28);
  __m256i v30 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v31 = _mm256_cmpeq_epi8(v30, v29);
  uint32_t v32 = _mm256_movemask_epi8(v31);
  int8_t* v33 = v6_inp + v15_pos;
  __m256i* v34 = (__m256i*)v33;
  __m256i* v35 = v34 + ((int64_t)0ll);
  __m256i v36 = _mm256_loadu_si256(v35);
  __m256i v37 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v38 = _mm256_cmpeq_epi8(v37, v36);
  uint32_t v39 = _mm256_movemask_epi8(v38);
  int8_t* v40 = v6_inp + v16_pos;
  __m256i* v41 = (__m256i*)v40;
  __m256i* v42 = v41 + ((int64_t)0ll);
  __m256i v43 = _mm256_loadu_si256(v42);
  __m256i v44 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v45 = _mm256_cmpeq_epi8(v44, v43);
  uint32_t v46 = _mm256_movemask_epi8(v45);
  uint32_t v47_m = v25;
  uint32_t v48_m = v32;
  uint32_t v49_m = v39;
  uint32_t v50_m = v46;
  uint32_t v51 = v47_m - ((uint32_t)1ull);
  uint32_t v52_m2 = v47_m & v51;
  uint64_t v53 = _tzcnt_u32(v47_m);
  uint64_t v54 = v13_pos + v53;
  v1_bufdata[v8_pos] = v54;
  v47_m = v52_m2;
  uint32_t v56 = v48_m - ((uint32_t)1ull);
  uint32_t v57_m2 = v48_m & v56;
  uint64_t v58 = _tzcnt_u32(v48_m);
  uint64_t v59 = v14_pos + v58;
  v1_bufdata[v9_pos] = v59;
  v48_m = v57_m2;
  uint32_t v61 = v49_m - ((uint32_t)1ull);
  uint32_t v62_m2 = v49_m & v61;
  uint64_t v63 = _tzcnt_u32(v49_m);
  uint64_t v64 = v15_pos + v63;
  v1_bufdata[v10_pos] = v64;
  v49_m = v62_m2;
  uint32_t v66 = v50_m - ((uint32_t)1ull);
  uint32_t v67_m2 = v50_m & v66;
  uint64_t v68 = _tzcnt_u32(v50_m);
  uint64_t v69 = v16_pos + v68;
  v1_bufdata[v11_pos] = v69;
  v50_m = v67_m2;
  uint32_t v71 = v47_m - ((uint32_t)1ull);
  uint32_t v72_m2 = v47_m & v71;
  uint64_t v73 = v8_pos + ((uint64_t)1ull);
  uint64_t v74 = _tzcnt_u32(v47_m);
  uint64_t v75 = v13_pos + v74;
  v1_bufdata[v73] = v75;
  v47_m = v72_m2;
  uint32_t v77 = v48_m - ((uint32_t)1ull);
  uint32_t v78_m2 = v48_m & v77;
  uint64_t v79 = v9_pos + ((uint64_t)1ull);
  uint64_t v80 = _tzcnt_u32(v48_m);
  uint64_t v81 = v14_pos + v80;
  v1_bufdata[v79] = v81;
  v48_m = v78_m2;
  uint32_t v83 = v49_m - ((uint32_t)1ull);
  uint32_t v84_m2 = v49_m & v83;
  uint64_t v85 = v10_pos + ((uint64_t)1ull);
  uint64_t v86 = _tzcnt_u32(v49_m);
  uint64_t v87 = v15_pos + v86;
  v1_bufdata[v85] = v87;
  v49_m = v84_m2;
  uint32_t v89 = v50_m - ((uint32_t)1ull);
  uint32_t v90_m2 = v50_m & v89;
  uint64_t v91 = v11_pos + ((uint64_t)1ull);
  uint64_t v92 = _tzcnt_u32(v50_m);
  uint64_t v93 = v16_pos + v92;
  v1_bufdata[v91] = v93;
  v50_m = v90_m2;
  uint32_t v95 = v47_m - ((uint32_t)1ull);
  uint32_t v96_m2 = v47_m & v95;
  uint64_t v97 = v8_pos + ((uint64_t)2ull);
  uint64_t v98 = _tzcnt_u32(v47_m);
  uint64_t v99 = v13_pos + v98;
  v1_bufdata[v97] = v99;
  v47_m = v96_m2;
  uint32_t v101 = v48_m - ((uint32_t)1ull);
  uint32_t v102_m2 = v48_m & v101;
  uint64_t v103 = v9_pos + ((uint64_t)2ull);
  uint64_t v104 = _tzcnt_u32(v48_m);
  uint64_t v105 = v14_pos + v104;
  v1_bufdata[v103] = v105;
  v48_m = v102_m2;
  uint32_t v107 = v49_m - ((uint32_t)1ull);
  uint32_t v108_m2 = v49_m & v107;
  uint64_t v109 = v10_pos + ((uint64_t)2ull);
  uint64_t v110 = _tzcnt_u32(v49_m);
  uint64_t v111 = v15_pos + v110;
  v1_bufdata[v109] = v111;
  v49_m = v108_m2;
  uint32_t v113 = v50_m - ((uint32_t)1ull);
  uint32_t v114_m2 = v50_m & v113;
  uint64_t v115 = v11_pos + ((uint64_t)2ull);
  uint64_t v116 = _tzcnt_u32(v50_m);
  uint64_t v117 = v16_pos + v116;
  v1_bufdata[v115] = v117;
  v50_m = v114_m2;
  uint64_t v119_pop = __builtin_popcount(v25);
  bool v120 = v119_pop > ((uint64_t)3ull);
  bool v121 = __builtin_expect(v120, 0);
  if (!(v121)) goto l2;
  v8_pos = v8_pos + ((uint64_t)3ull);
l3:;
  uint32_t v122 = v47_m - ((uint32_t)1ull);
  uint32_t v123_m2 = v47_m & v122;
  uint64_t v124 = _tzcnt_u32(v47_m);
  uint64_t v125 = v13_pos + v124;
  v1_bufdata[v8_pos] = v125;
  v47_m = v123_m2;
  v8_pos = v8_pos + ((uint64_t)1ull);
  bool v127 = v47_m != ((uint32_t)0ull);
  if (v127) goto l3;
  goto l4;
l2:;
  v8_pos = v8_pos + v119_pop;
l4:;
  v13_pos = v13_pos + ((uint64_t)128ull);
  uint64_t v128_pop = __builtin_popcount(v32);
  bool v129 = v128_pop > ((uint64_t)3ull);
  bool v130 = __builtin_expect(v129, 0);
  if (!(v130)) goto l5;
  v9_pos = v9_pos + ((uint64_t)3ull);
l6:;
  uint32_t v131 = v48_m - ((uint32_t)1ull);
  uint32_t v132_m2 = v48_m & v131;
  uint64_t v133 = _tzcnt_u32(v48_m);
  uint64_t v134 = v14_pos + v133;
  v1_bufdata[v9_pos] = v134;
  v48_m = v132_m2;
  v9_pos = v9_pos + ((uint64_t)1ull);
  bool v136 = v48_m != ((uint32_t)0ull);
  if (v136) goto l6;
  goto l7;
l5:;
  v9_pos = v9_pos + v128_pop;
l7:;
  v14_pos = v14_pos + ((uint64_t)128ull);
  uint64_t v137_pop = __builtin_popcount(v39);
  bool v138 = v137_pop > ((uint64_t)3ull);
  bool v139 = __builtin_expect(v138, 0);
  if (!(v139)) goto l8;
  v10_pos = v10_pos + ((uint64_t)3ull);
l9:;
  uint32_t v140 = v49_m - ((uint32_t)1ull);
  uint32_t v141_m2 = v49_m & v140;
  uint64_t v142 = _tzcnt_u32(v49_m);
  uint64_t v143 = v15_pos + v142;
  v1_bufdata[v10_pos] = v143;
  v49_m = v141_m2;
  v10_pos = v10_pos + ((uint64_t)1ull);
  bool v145 = v49_m != ((uint32_t)0ull);
  if (v145) goto l9;
  goto l10;
l8:;
  v10_pos = v10_pos + v137_pop;
l10:;
  v15_pos = v15_pos + ((uint64_t)128ull);
  uint64_t v146_pop = __builtin_popcount(v46);
  bool v147 = v146_pop > ((uint64_t)3ull);
  bool v148 = __builtin_expect(v147, 0);
  if (!(v148)) goto l11;
  v11_pos = v11_pos + ((uint64_t)3ull);
l12:;
  uint32_t v149 = v50_m - ((uint32_t)1ull);
  uint32_t v150_m2 = v50_m & v149;
  uint64_t v151 = _tzcnt_u32(v50_m);
  uint64_t v152 = v16_pos + v151;
  v1_bufdata[v11_pos] = v152;
  v50_m = v150_m2;
  v11_pos = v11_pos + ((uint64_t)1ull);
  bool v154 = v50_m != ((uint32_t)0ull);
  if (v154) goto l12;
  goto l13;
l11:;
  v11_pos = v11_pos + v146_pop;
l13:;
  v16_pos = v16_pos + ((uint64_t)128ull);
  v17_i = v17_i + ((uint64_t)1ull);
  goto l0;
l1:;
  v12_bufEnds[0] = v8_pos;
  v1_bufdata[v8_pos] = ((uint64_t)16ull);
  uint64_t v157 = v8_pos + ((uint64_t)1ull);
  v1_bufdata[v157] = ((uint64_t)16ull);
  uint64_t v159 = v8_pos + ((uint64_t)2ull);
  v1_bufdata[v159] = ((uint64_t)16ull);
  uint64_t v161 = v8_pos + ((uint64_t)3ull);
  v1_bufdata[v161] = ((uint64_t)16ull);
  v12_bufEnds[1] = v9_pos;
  v1_bufdata[v9_pos] = ((uint64_t)16ull);
  uint64_t v165 = v9_pos + ((uint64_t)1ull);
  v1_bufdata[v165] = ((uint64_t)16ull);
  uint64_t v167 = v9_pos + ((uint64_t)2ull);
  v1_bufdata[v167] = ((uint64_t)16ull);
  uint64_t v169 = v9_pos + ((uint64_t)3ull);
  v1_bufdata[v169] = ((uint64_t)16ull);
  v12_bufEnds[2] = v10_pos;
  v1_bufdata[v10_pos] = ((uint64_t)16ull);
  uint64_t v173 = v10_pos + ((uint64_t)1ull);
  v1_bufdata[v173] = ((uint64_t)16ull);
  uint64_t v175 = v10_pos + ((uint64_t)2ull);
  v1_bufdata[v175] = ((uint64_t)16ull);
  uint64_t v177 = v10_pos + ((uint64_t)3ull);
  v1_bufdata[v177] = ((uint64_t)16ull);
  v12_bufEnds[3] = v11_pos;
  v1_bufdata[v11_pos] = ((uint64_t)16ull);
  uint64_t v181 = v11_pos + ((uint64_t)1ull);
  v1_bufdata[v181] = ((uint64_t)16ull);
  uint64_t v183 = v11_pos + ((uint64_t)2ull);
  v1_bufdata[v183] = ((uint64_t)16ull);
  uint64_t v185 = v11_pos + ((uint64_t)3ull);
  v1_bufdata[v185] = ((uint64_t)16ull);
  int16_t v187_buf_[] = {((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll)}; int16_t* v187_buf = v187_buf_;
  int8_t v188_buf_[] = {((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll)}; int8_t* v188_buf = v188_buf_;
  uint64_t v189_failbuf_[8000]; uint64_t* v189_failbuf = v189_failbuf_;
  uint64_t v190_failposS = ((uint64_t)0ull);
  uint64_t v191_failposC = ((uint64_t)0ull);
  uint64_t v192_i = ((uint64_t)0ull);
l14:;
  bool v193 = v192_i < ((uint64_t)4ull);
  if (!(v193)) goto l15;
  uint64_t v194_bufS = v192_i * ((uint64_t)1004ull);
  uint64_t v195_bufE = v12_bufEnds[v192_i];
  uint64_t v196_retctr = ((uint64_t)0ull);
l17:;
  bool v197 = v194_bufS < v195_bufE;
  if (!(v197)) goto l18;
  uint64_t* v198 = v1_bufdata + v194_bufS;
  __m256i* v199 = (__m256i*)v198;
  __m256i* v200 = v199 + ((int64_t)0ll);
  __m256i v201_idxs = _mm256_loadu_si256(v200);
  int8_t* v202 = v6_inp + ((int64_t)1ll);
  __m256i v203 = _mm256_i64gather_epi64(v202, v201_idxs, 1);
  __m256i v204_nums = v203;
  __m256i v205 = _mm256_set1_epi8(((int8_t)46ll));
  __m256i v206 = _mm256_cmpeq_epi8(v205, v204_nums);
  __m256i v207 = v206;
  __m256i v208 = _mm256_srai_epi32(v207, 20);
  __m256i v209 = v208;
  __m256i v210 = v209;
  __m256i v211 = v210;
  __m256i v212 = _mm256_set1_epi64x(((int64_t)24ll));
  __m256i v213 = v212;
  __m256i v214 = _mm256_and_si256(v211, v213);
  __m256i v215_off = v214;
  __m256i v216 = v204_nums;
  __m256i v217 = v215_off;
  __m256i v218 = _mm256_set1_epi64x(((int64_t)40ll));
  __m256i v219 = v218;
  __m256i v220 = _mm256_sub_epi64(v219, v217);
  __m256i v221 = _mm256_sllv_epi64(v216, v220);
  v204_nums = v221;
  __m256i v222 = v204_nums;
  __m256i v223 = _mm256_set1_epi8(((int8_t)48ll));
  __m256i v224 = v223;
  __m256i v225 = _mm256_subs_epu8(v222, v224);
  __m256i v226_aligned = v225;
  __m256i v227 = v226_aligned;
  __m256i v228 = _mm256_setr_epi8(((int8_t)10ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)1ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)1ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)1ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)1ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)1ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)1ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)1ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)1ll));
  __m256i v229_t16 = _mm256_maddubs_epi16(v227, v228);
  __m256i v230 = _mm256_setr_epi16(((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll));
  __m256i v231_t32 = _mm256_madd_epi16(v229_t16, v230);
  __m256i v232 = v231_t32;
  __m256i v233 = _mm256_set1_epi8(((int8_t)45ll));
  __m256i v234 = _mm256_cmpeq_epi8(v233, v204_nums);
  __m256i v235 = v234;
  __m256i v236 = _mm256_set1_epi64x(((int64_t)0ll));
  __m256i v237 = v236;
  __m256i v238 = _mm256_cmpeq_epi64(v235, v237);
  uint64_t v239 = ~(((uint64_t)0ull));
  int64_t v240 = (int64_t)v239;
  __m256i v241 = _mm256_set1_epi64x(v240);
  __m256i v242 = v241;
  __m256i v243 = _mm256_xor_si256(v238, v242);
  __m256i v244 = v243;
  __m256i v245_neg = v244;
  __m256i v246_each16n = _mm256_xor_si256(v232, v245_neg);
  v246_each16n = _mm256_sub_epi16(v246_each16n, v245_neg);
  int16_t* v247 = v187_buf + ((int64_t)0ll);
  __m256i* v248 = (__m256i*)v247;
  __m256i* v249 = v248 + ((int64_t)0ll);
  _mm256_storeu_si256(v249, v246_each16n);
  uint64_t v251 = v195_bufE - v194_bufS;
  uint64_t v252_i = ((uint64_t)0ull);
l19:;
  bool v253 = v252_i < ((uint64_t)2ull);
  if (!(v253)) goto l20;
  uint64_t v254 = v252_i * ((uint64_t)2ull);
  uint64_t v255 = v194_bufS + v254;
  uint64_t v256_off = v1_bufdata[v255];
  uint64_t v257 = v256_off - ((uint64_t)16ull);
  int8_t* v258 = v6_inp + v257;
  __m128i* v259 = (__m128i*)v258;
  __m128i* v260 = v259 + ((int64_t)0ll);
  __m128i v261 = _mm_loadu_si128(v260);
  uint64_t v262 = v194_bufS + v254;
  uint64_t v263 = v262 + ((uint64_t)1ull);
  uint64_t v264_off = v1_bufdata[v263];
  uint64_t v265 = v264_off - ((uint64_t)16ull);
  int8_t* v266 = v6_inp + v265;
  __m128i* v267 = (__m128i*)v266;
  __m128i* v268 = v267 + ((int64_t)0ll);
  __m128i v269 = _mm_loadu_si128(v268);
  __m128i v270 = v261;
  __m128i v271 = v269;
  __m256i v272 = _mm256_setr_m128i(v270, v271);
  __m256i v273 = v272;
  __m256i v274 = _mm256_set1_epi8(((int8_t)10ll));
  __m256i v275 = _mm256_cmpeq_epi8(v274, v273);
  __m256i v276_a = v275;
  __m256i v277 = _mm256_bsrli_epi128(v276_a, 8);
  __m256i v278_l = v277;
  __m256i v279 = _mm256_set1_epi64x(((int64_t)0ll));
  __m256i v280 = v279;
  __m256i v281 = _mm256_cmpeq_epi64(v278_l, v280);
  uint64_t v282 = ~(((uint64_t)0ull));
  int64_t v283 = (int64_t)v282;
  __m256i v284 = _mm256_set1_epi64x(v283);
  __m256i v285 = v284;
  __m256i v286 = _mm256_xor_si256(v281, v285);
  v276_a = _mm256_or_si256(v276_a, v286);
  __m256i v287 = _mm256_srli_epi64(v276_a, 4);
  __m256i v288 = _mm256_srli_epi64(v276_a, 20);
  __m256i v289 = _mm256_srli_epi64(v276_a, 36);
  __m256i v290 = _mm256_srli_epi64(v276_a, 52);
  __m256i v291 = _mm256_or_si256(v287, v288);
  __m256i v292 = _mm256_or_si256(v289, v290);
  v276_a = _mm256_or_si256(v291, v292);
  __m256i v293 = v276_a;
  __m256i v294 = _mm256_set1_epi8(((int8_t)0ll));
  __m256i v295 = _mm256_cmpeq_epi8(v294, v293);
  __m256i v296 = v295;
  __m256i v297 = _mm256_and_si256(v273, v296);
  __m256i v298 = v297;
  __m128i v299 = _mm256_castsi256_si128(v298);
  __m256i v300 = v297;
  __m128i v301 = _mm256_extracti128_si256(v300, 1);
  __m256i v302_hv = v297;
  __m256d v303; {__m256i v303_ = v302_hv; memcpy(&v303, &v303_, sizeof(__m256i));};
  __m256d v304 = _mm256_permute_pd(v303, 15);
  __m256i v305; {__m256d v305_ = v304; memcpy(&v305, &v305_, sizeof(__m256d));};
  v302_hv = _mm256_xor_si256(v302_hv, v305);
  __m256i v306 = v302_hv;
  __m256i v307 = _mm256_srli_epi64(v306, 32);
  __m256i v308 = v307;
  v302_hv = _mm256_xor_si256(v302_hv, v308);
  __m256i v309 = v302_hv;
  __m256i v310 = _mm256_srai_epi32(v309, 16);
  __m256i v311 = v310;
  v302_hv = _mm256_xor_si256(v302_hv, v311);
  __m256i v312_hv = v302_hv;
  __m256i v313 = v312_hv;
  __m256i v314 = _mm256_shuffle_epi32(v313, 0);
  __m256i v315_hx = v314;
  int32_t v316 = (int32_t)v2_hash_mask;
  __m256i v317 = _mm256_set1_epi32(v316);
  __m256i v318 = v317;
  __m256i v319_idxv = _mm256_and_si256(v312_hv, v318);
  __m256i v320 = v319_idxv;
  int32_t v321 = _mm256_extract_epi32(v320, 0);
  uint32_t v322 = (uint32_t)v321;
  uint64_t v323_idxs = (uint64_t)v322;
  __m256i v324 = v319_idxv;
  int32_t v325 = _mm256_extract_epi32(v324, 4);
  uint32_t v326 = (uint32_t)v325;
  uint64_t v327_idxs = (uint64_t)v326;
  uint32_t* v328 = v4_map_hash + v323_idxs;
  __m128i* v329 = (__m128i*)v328;
  __m128i* v330 = v329 + ((int64_t)0ll);
  __m128i v331 = _mm_loadu_si128(v330);
  uint32_t* v332 = v4_map_hash + v327_idxs;
  __m128i* v333 = (__m128i*)v332;
  __m128i* v334 = v333 + ((int64_t)0ll);
  __m128i v335 = _mm_loadu_si128(v334);
  __m128i v336 = v331;
  __m128i v337 = v335;
  __m256i v338 = _mm256_setr_m128i(v336, v337);
  __m256i v339_hashes = v338;
  __m256i v340 = _mm256_cmpeq_epi32(v315_hx, v339_hashes);
  __m256 v341; {__m256i v341_ = v340; memcpy(&v341, &v341_, sizeof(__m256i));};
  uint8_t v342_m = _mm256_movemask_ps(v341);
  uint8_t v343 = v342_m - ((uint8_t)1ull);
  uint8_t v344_m2 = v342_m & v343;
  bool v345 = v344_m2 == ((uint8_t)0ull);
  bool v346 = __builtin_expect(v345, 0);
  if (!(v346)) goto l21;
  uint64_t v347 = _tzcnt_u32(v342_m);
  uint64_t v348 = v323_idxs + v347;
  uint64_t v349 = v327_idxs + v347;
  uint64_t v350 = v349 - ((uint64_t)4ull);
  v323_idxs = v348;
  v327_idxs = v350;
  uint64_t v351 = (uint64_t)v2_hash_mask;
  uint64_t v352 = v323_idxs & v351;
  uint64_t v353 = (uint64_t)v2_hash_mask;
  uint64_t v354 = v327_idxs & v353;
  v323_idxs = v352;
  v327_idxs = v354;
  goto l22;
l21:;
  uint8_t v355 = v344_m2 >> ((uint8_t)4ull);
  uint64_t v356 = _tzcnt_u32(v342_m);
  uint64_t v357 = v323_idxs + v356;
  uint64_t v358 = _tzcnt_u32(v355);
  uint64_t v359 = v327_idxs + v358;
  v323_idxs = v357;
  v327_idxs = v359;
l22:;
  bool v360 = v254 >= v251;
  bool v361 = __builtin_expect(v360, 0);
  if (!(v361)) goto l23;
  goto l16;
l23:;
  uint64_t v362 = v323_idxs * ((uint64_t)16ull);
  int8_t* v363 = v3_map_exp + v362;
  __m128i* v364 = (__m128i*)v363;
  __m128i* v365 = v364 + ((int64_t)0ll);
  __m128i v366_exp = _mm_loadu_si128(v365);
  __m128i v367 = _mm_cmpeq_epi8(v299, v366_exp);
  uint16_t v368 = _mm_movemask_epi8(v367);
  bool v369 = v368 == ((uint16_t)65535ull);
  bool v370 = !(v369);
  if (!(v370)) goto l24;
  uint64_t v371 = v194_bufS + v254;
  uint64_t v372 = v1_bufdata[v371];
  v189_failbuf[v191_failposC] = v372;
  uint64_t v374 = v191_failposC + ((uint64_t)1ull);
  uint64_t v375 = v254 * ((uint64_t)4ull);
  uint64_t v376 = v375 + ((uint64_t)2ull);
  int16_t v377 = v187_buf[v376];
  uint64_t v378 = (v377);
  v189_failbuf[v374] = v378;
  v191_failposC = v191_failposC + ((uint64_t)2ull);
  goto l25;
l24:;
  uint64_t v380_dataoff = v323_idxs * ((uint64_t)4ull);
  uint64_t v381 = v254 * ((uint64_t)4ull);
  uint64_t v382 = v381 + ((uint64_t)2ull);
  int16_t v383 = v187_buf[v382];
  int32_t v384_temp = (int32_t)v383;
  uint64_t v385 = v380_dataoff + ((uint64_t)2ull);
  int32_t v386 = v5_map_data[v385];
  int32_t v387 = -(v384_temp);
  bool v388 = v386 > v387;
  int32_t v389_r = v387;
  if (!(v388)) goto l26;
  v389_r = v386;
l26:;
  v5_map_data[v385] = v389_r;
  uint64_t v391 = v380_dataoff + ((uint64_t)3ull);
  int32_t v392 = v5_map_data[v391];
  bool v393 = v392 > v384_temp;
  int32_t v394_r = v384_temp;
  if (!(v393)) goto l27;
  v394_r = v392;
l27:;
  v5_map_data[v391] = v394_r;
  int32_t v396 = v5_map_data[v380_dataoff];
  int32_t v397 = v396 + v384_temp;
  v5_map_data[v380_dataoff] = v397;
  uint64_t v399 = v380_dataoff + ((uint64_t)1ull);
  int32_t v400 = v5_map_data[v399];
  int32_t v401 = v400 + ((int32_t)1ll);
  v5_map_data[v399] = v401;
l25:;
  uint64_t v403 = v254 + ((uint64_t)1ull);
  bool v404 = v403 >= v251;
  bool v405 = __builtin_expect(v404, 0);
  if (!(v405)) goto l28;
  goto l16;
l28:;
  uint64_t v406 = v327_idxs * ((uint64_t)16ull);
  int8_t* v407 = v3_map_exp + v406;
  __m128i* v408 = (__m128i*)v407;
  __m128i* v409 = v408 + ((int64_t)0ll);
  __m128i v410_exp = _mm_loadu_si128(v409);
  __m128i v411 = _mm_cmpeq_epi8(v301, v410_exp);
  uint16_t v412 = _mm_movemask_epi8(v411);
  bool v413 = v412 == ((uint16_t)65535ull);
  bool v414 = !(v413);
  if (!(v414)) goto l29;
  uint64_t v415 = v194_bufS + v403;
  uint64_t v416 = v1_bufdata[v415];
  v189_failbuf[v191_failposC] = v416;
  uint64_t v418 = v191_failposC + ((uint64_t)1ull);
  uint64_t v419 = v403 * ((uint64_t)4ull);
  uint64_t v420 = v419 + ((uint64_t)2ull);
  int16_t v421 = v187_buf[v420];
  uint64_t v422 = (v421);
  v189_failbuf[v418] = v422;
  v191_failposC = v191_failposC + ((uint64_t)2ull);
  goto l30;
l29:;
  uint64_t v424_dataoff = v327_idxs * ((uint64_t)4ull);
  uint64_t v425 = v403 * ((uint64_t)4ull);
  uint64_t v426 = v425 + ((uint64_t)2ull);
  int16_t v427 = v187_buf[v426];
  int32_t v428_temp = (int32_t)v427;
  uint64_t v429 = v424_dataoff + ((uint64_t)2ull);
  int32_t v430 = v5_map_data[v429];
  int32_t v431 = -(v428_temp);
  bool v432 = v430 > v431;
  int32_t v433_r = v431;
  if (!(v432)) goto l31;
  v433_r = v430;
l31:;
  v5_map_data[v429] = v433_r;
  uint64_t v435 = v424_dataoff + ((uint64_t)3ull);
  int32_t v436 = v5_map_data[v435];
  bool v437 = v436 > v428_temp;
  int32_t v438_r = v428_temp;
  if (!(v437)) goto l32;
  v438_r = v436;
l32:;
  v5_map_data[v435] = v438_r;
  int32_t v440 = v5_map_data[v424_dataoff];
  int32_t v441 = v440 + v428_temp;
  v5_map_data[v424_dataoff] = v441;
  uint64_t v443 = v424_dataoff + ((uint64_t)1ull);
  int32_t v444 = v5_map_data[v443];
  int32_t v445 = v444 + ((int32_t)1ll);
  v5_map_data[v443] = v445;
l30:;
  v252_i = v252_i + ((uint64_t)1ull);
  goto l19;
l20:;
  v194_bufS = v194_bufS + ((uint64_t)4ull);
  goto l17;
l18:;
l16:;
  v192_i = v192_i + ((uint64_t)1ull);
  goto l14;
l15:;
l33:;
  bool v447 = v190_failposS < v191_failposC;
  if (!(v447)) goto l34;
  uint64_t v448 = v189_failbuf[v190_failposS];
  uint64_t v449 = v190_failposS + ((uint64_t)1ull);
  uint64_t v450 = v189_failbuf[v449];
  int64_t v451 = (int64_t)v450;
  v190_failposS = v190_failposS + ((uint64_t)2ull);
  uint64_t v452 = v448 - ((uint64_t)16ull);
  int8_t* v453 = v6_inp + v452;
  __m128i* v454 = (__m128i*)v453;
  __m128i* v455 = v454 + ((int64_t)0ll);
  __m128i v456 = _mm_loadu_si128(v455);
  __m128i v457 = _mm_set1_epi8(((int8_t)10ll));
  __m128i v458 = _mm_cmpeq_epi8(v457, v456);
  uint16_t v459_m = _mm_movemask_epi8(v458);
  bool v460 = v459_m == ((uint16_t)0ull);
  bool v461 = __builtin_expect(v460, 1);
  if (!(v461)) goto l35;
  uint64_t v462_start = v448;
l36:;
  v462_start = v462_start - ((uint64_t)16ull);
  uint64_t v463 = v462_start - ((uint64_t)16ull);
  int8_t* v464 = v6_inp + v463;
  __m128i* v465 = (__m128i*)v464;
  __m128i* v466 = v465 + ((int64_t)0ll);
  __m128i v467 = _mm_loadu_si128(v466);
  __m128i v468 = _mm_set1_epi8(((int8_t)10ll));
  __m128i v469 = _mm_cmpeq_epi8(v468, v467);
  v459_m = _mm_movemask_epi8(v469);
  bool v470 = v459_m == ((uint16_t)0ull);
  if (v470) goto l36;
  uint32_t v471 = (uint32_t)v459_m;
  uint64_t v472 = _lzcnt_u32(v471);
  uint64_t v473 = v472 - ((uint64_t)16ull);
  uint64_t v474 = v462_start - v473;
  failed_long(v474, v448, v451);
  goto l37;
l35:;
  uint32_t v476 = (uint32_t)v459_m;
  uint64_t v477 = _lzcnt_u32(v476);
  uint64_t v478_c = v477 - ((uint64_t)16ull);
  uint64_t v479 = v448 - v478_c;
  int8_t* v480 = v188_buf + v478_c;
  __m128i* v481 = (__m128i*)v480;
  __m128i* v482 = v481 + ((int64_t)0ll);
  __m128i v483 = _mm_loadu_si128(v482);
  __m128i v484 = _mm_and_si128(v456, v483);
  __m128i v485_hv = v484;
  __m128i v486 = _mm_shuffle_epi32(v485_hv, 238);
  v485_hv = _mm_xor_si128(v485_hv, v486);
  __m128i v487 = v485_hv;
  __m128i v488 = _mm_srli_epi64(v487, 32);
  __m128i v489 = v488;
  v485_hv = _mm_xor_si128(v485_hv, v489);
  __m128i v490 = v485_hv;
  __m128i v491 = _mm_srai_epi32(v490, 16);
  __m128i v492 = v491;
  v485_hv = _mm_xor_si128(v485_hv, v492);
  __m128i v493 = v485_hv;
  int32_t v494 = _mm_extract_epi32(v493, 0);
  uint32_t v495 = (uint32_t)v494;
  failed_short(v479, v448, v451, v495);
l37:;
  goto l33;
l34:;
}

uint64_t (*const core_1brc_buf_elts)() = si_f0_core_1brc_buf_elts;

uint64_t (*const core_1brc_periter)() = si_f1_core_1brc_periter;

uint32_t (*const hash_1brc)(int8_t*) = si_f2_hash_1brc;

void (*const core_1brc)(int32_t,uint64_t*,uint32_t,int8_t*,uint32_t*,int32_t*,int8_t*,uint64_t) = si_f3_core_1brc;

