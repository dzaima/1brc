#include<stdint.h>
#include<stdbool.h>
#include<immintrin.h>
#include<stdio.h>
#include<inttypes.h>
#include<stdlib.h>
#include<header.h>
#include<string.h>

static uint64_t si_f0_core_1brc_buf_elts() {
  return ((uint64_t)12276ull);
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

static void si_f3_core_1brc(int32_t v0_ident, uint64_t* v1_buf0, uint32_t v2_hash_mask, int8_t* v3_map_exp, uint32_t* v4_map_hash, int32_t* v5_map_data, int8_t* v6_inp, uint64_t v7_inpOff) {
  uint64_t v8_off = ((uint64_t)132ull);
  uint64_t v9_off = ((uint64_t)1136ull);
  uint64_t v10_off = ((uint64_t)2140ull);
  uint64_t v11_off = ((uint64_t)3144ull);
  uint64_t v12_off = v7_inpOff;
  uint64_t v13_off = v7_inpOff + ((uint64_t)32ull);
  uint64_t v14_off = v7_inpOff + ((uint64_t)64ull);
  uint64_t v15_off = v7_inpOff + ((uint64_t)96ull);
  uint64_t v16_i = ((uint64_t)0ull);
l0:;
  bool v17 = v16_i < ((uint64_t)83ull);
  if (!(v17)) goto l1;
  int8_t* v18 = v6_inp + v12_off;
  __m256i* v19 = (__m256i*)v18;
  __m256i* v20 = v19 + ((int64_t)0ll);
  __m256i v21 = _mm256_loadu_si256(v20);
  __m256i v22 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v23 = _mm256_cmpeq_epi8(v22, v21);
  uint32_t v24 = _mm256_movemask_epi8(v23);
  int8_t* v25 = v6_inp + v13_off;
  __m256i* v26 = (__m256i*)v25;
  __m256i* v27 = v26 + ((int64_t)0ll);
  __m256i v28 = _mm256_loadu_si256(v27);
  __m256i v29 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v30 = _mm256_cmpeq_epi8(v29, v28);
  uint32_t v31 = _mm256_movemask_epi8(v30);
  int8_t* v32 = v6_inp + v14_off;
  __m256i* v33 = (__m256i*)v32;
  __m256i* v34 = v33 + ((int64_t)0ll);
  __m256i v35 = _mm256_loadu_si256(v34);
  __m256i v36 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v37 = _mm256_cmpeq_epi8(v36, v35);
  uint32_t v38 = _mm256_movemask_epi8(v37);
  int8_t* v39 = v6_inp + v15_off;
  __m256i* v40 = (__m256i*)v39;
  __m256i* v41 = v40 + ((int64_t)0ll);
  __m256i v42 = _mm256_loadu_si256(v41);
  __m256i v43 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v44 = _mm256_cmpeq_epi8(v43, v42);
  uint32_t v45 = _mm256_movemask_epi8(v44);
  uint32_t v46_m = v24;
  uint32_t v47_m = v31;
  uint32_t v48_m = v38;
  uint32_t v49_m = v45;
  uint32_t v50 = v46_m - ((uint32_t)1ull);
  uint32_t v51_m2 = v46_m & v50;
  uint64_t v52 = __builtin_ctz(v46_m);
  uint64_t v53 = v12_off + v52;
  v1_buf0[v8_off] = v53;
  v46_m = v51_m2;
  uint32_t v55 = v47_m - ((uint32_t)1ull);
  uint32_t v56_m2 = v47_m & v55;
  uint64_t v57 = __builtin_ctz(v47_m);
  uint64_t v58 = v13_off + v57;
  v1_buf0[v9_off] = v58;
  v47_m = v56_m2;
  uint32_t v60 = v48_m - ((uint32_t)1ull);
  uint32_t v61_m2 = v48_m & v60;
  uint64_t v62 = __builtin_ctz(v48_m);
  uint64_t v63 = v14_off + v62;
  v1_buf0[v10_off] = v63;
  v48_m = v61_m2;
  uint32_t v65 = v49_m - ((uint32_t)1ull);
  uint32_t v66_m2 = v49_m & v65;
  uint64_t v67 = __builtin_ctz(v49_m);
  uint64_t v68 = v15_off + v67;
  v1_buf0[v11_off] = v68;
  v49_m = v66_m2;
  uint32_t v70 = v46_m - ((uint32_t)1ull);
  uint32_t v71_m2 = v46_m & v70;
  uint64_t v72 = __builtin_ctz(v46_m);
  uint64_t v73 = v12_off + v72;
  uint64_t v74 = v8_off + ((uint64_t)1ull);
  v1_buf0[v74] = v73;
  v46_m = v71_m2;
  uint32_t v76 = v47_m - ((uint32_t)1ull);
  uint32_t v77_m2 = v47_m & v76;
  uint64_t v78 = __builtin_ctz(v47_m);
  uint64_t v79 = v13_off + v78;
  uint64_t v80 = v9_off + ((uint64_t)1ull);
  v1_buf0[v80] = v79;
  v47_m = v77_m2;
  uint32_t v82 = v48_m - ((uint32_t)1ull);
  uint32_t v83_m2 = v48_m & v82;
  uint64_t v84 = __builtin_ctz(v48_m);
  uint64_t v85 = v14_off + v84;
  uint64_t v86 = v10_off + ((uint64_t)1ull);
  v1_buf0[v86] = v85;
  v48_m = v83_m2;
  uint32_t v88 = v49_m - ((uint32_t)1ull);
  uint32_t v89_m2 = v49_m & v88;
  uint64_t v90 = __builtin_ctz(v49_m);
  uint64_t v91 = v15_off + v90;
  uint64_t v92 = v11_off + ((uint64_t)1ull);
  v1_buf0[v92] = v91;
  v49_m = v89_m2;
  uint32_t v94 = v46_m - ((uint32_t)1ull);
  uint32_t v95_m2 = v46_m & v94;
  uint64_t v96 = __builtin_ctz(v46_m);
  uint64_t v97 = v12_off + v96;
  uint64_t v98 = v8_off + ((uint64_t)2ull);
  v1_buf0[v98] = v97;
  v46_m = v95_m2;
  uint32_t v100 = v47_m - ((uint32_t)1ull);
  uint32_t v101_m2 = v47_m & v100;
  uint64_t v102 = __builtin_ctz(v47_m);
  uint64_t v103 = v13_off + v102;
  uint64_t v104 = v9_off + ((uint64_t)2ull);
  v1_buf0[v104] = v103;
  v47_m = v101_m2;
  uint32_t v106 = v48_m - ((uint32_t)1ull);
  uint32_t v107_m2 = v48_m & v106;
  uint64_t v108 = __builtin_ctz(v48_m);
  uint64_t v109 = v14_off + v108;
  uint64_t v110 = v10_off + ((uint64_t)2ull);
  v1_buf0[v110] = v109;
  v48_m = v107_m2;
  uint32_t v112 = v49_m - ((uint32_t)1ull);
  uint32_t v113_m2 = v49_m & v112;
  uint64_t v114 = __builtin_ctz(v49_m);
  uint64_t v115 = v15_off + v114;
  uint64_t v116 = v11_off + ((uint64_t)2ull);
  v1_buf0[v116] = v115;
  v49_m = v113_m2;
  uint64_t v118_pop = __builtin_popcount(v24);
  bool v119 = v118_pop > ((uint64_t)3ull);
  bool v120 = __builtin_expect(v119, 0);
  if (!(v120)) goto l2;
  v8_off = v8_off + ((uint64_t)3ull);
l3:;
  uint32_t v121 = v46_m - ((uint32_t)1ull);
  uint32_t v122_m2 = v46_m & v121;
  uint64_t v123 = __builtin_ctz(v46_m);
  uint64_t v124 = v12_off + v123;
  v1_buf0[v8_off] = v124;
  v46_m = v122_m2;
  v8_off = v8_off + ((uint64_t)1ull);
  bool v126 = v46_m != ((uint32_t)0ull);
  if (v126) goto l3;
  goto l4;
l2:;
  v8_off = v8_off + v118_pop;
l4:;
  v12_off = v12_off + ((uint64_t)128ull);
  uint64_t v127_pop = __builtin_popcount(v31);
  bool v128 = v127_pop > ((uint64_t)3ull);
  bool v129 = __builtin_expect(v128, 0);
  if (!(v129)) goto l5;
  v9_off = v9_off + ((uint64_t)3ull);
l6:;
  uint32_t v130 = v47_m - ((uint32_t)1ull);
  uint32_t v131_m2 = v47_m & v130;
  uint64_t v132 = __builtin_ctz(v47_m);
  uint64_t v133 = v13_off + v132;
  v1_buf0[v9_off] = v133;
  v47_m = v131_m2;
  v9_off = v9_off + ((uint64_t)1ull);
  bool v135 = v47_m != ((uint32_t)0ull);
  if (v135) goto l6;
  goto l7;
l5:;
  v9_off = v9_off + v127_pop;
l7:;
  v13_off = v13_off + ((uint64_t)128ull);
  uint64_t v136_pop = __builtin_popcount(v38);
  bool v137 = v136_pop > ((uint64_t)3ull);
  bool v138 = __builtin_expect(v137, 0);
  if (!(v138)) goto l8;
  v10_off = v10_off + ((uint64_t)3ull);
l9:;
  uint32_t v139 = v48_m - ((uint32_t)1ull);
  uint32_t v140_m2 = v48_m & v139;
  uint64_t v141 = __builtin_ctz(v48_m);
  uint64_t v142 = v14_off + v141;
  v1_buf0[v10_off] = v142;
  v48_m = v140_m2;
  v10_off = v10_off + ((uint64_t)1ull);
  bool v144 = v48_m != ((uint32_t)0ull);
  if (v144) goto l9;
  goto l10;
l8:;
  v10_off = v10_off + v136_pop;
l10:;
  v14_off = v14_off + ((uint64_t)128ull);
  uint64_t v145_pop = __builtin_popcount(v45);
  bool v146 = v145_pop > ((uint64_t)3ull);
  bool v147 = __builtin_expect(v146, 0);
  if (!(v147)) goto l11;
  v11_off = v11_off + ((uint64_t)3ull);
l12:;
  uint32_t v148 = v49_m - ((uint32_t)1ull);
  uint32_t v149_m2 = v49_m & v148;
  uint64_t v150 = __builtin_ctz(v49_m);
  uint64_t v151 = v15_off + v150;
  v1_buf0[v11_off] = v151;
  v49_m = v149_m2;
  v11_off = v11_off + ((uint64_t)1ull);
  bool v153 = v49_m != ((uint32_t)0ull);
  if (v153) goto l12;
  goto l13;
l11:;
  v11_off = v11_off + v145_pop;
l13:;
  v15_off = v15_off + ((uint64_t)128ull);
  v16_i = v16_i + ((uint64_t)1ull);
  goto l0;
l1:;
  uint64_t v154_off = ((uint64_t)128ull);
  v1_buf0[v154_off] = v8_off;
  v1_buf0[v8_off] = ((uint64_t)16ull);
  uint64_t v157 = v8_off + ((uint64_t)1ull);
  v1_buf0[v157] = ((uint64_t)16ull);
  uint64_t v159 = v8_off + ((uint64_t)2ull);
  v1_buf0[v159] = ((uint64_t)16ull);
  uint64_t v161 = v8_off + ((uint64_t)3ull);
  v1_buf0[v161] = ((uint64_t)16ull);
  uint64_t v163_off = ((uint64_t)128ull);
  uint64_t v164 = v163_off + ((uint64_t)1ull);
  v1_buf0[v164] = v9_off;
  v1_buf0[v9_off] = ((uint64_t)16ull);
  uint64_t v167 = v9_off + ((uint64_t)1ull);
  v1_buf0[v167] = ((uint64_t)16ull);
  uint64_t v169 = v9_off + ((uint64_t)2ull);
  v1_buf0[v169] = ((uint64_t)16ull);
  uint64_t v171 = v9_off + ((uint64_t)3ull);
  v1_buf0[v171] = ((uint64_t)16ull);
  uint64_t v173_off = ((uint64_t)128ull);
  uint64_t v174 = v173_off + ((uint64_t)2ull);
  v1_buf0[v174] = v10_off;
  v1_buf0[v10_off] = ((uint64_t)16ull);
  uint64_t v177 = v10_off + ((uint64_t)1ull);
  v1_buf0[v177] = ((uint64_t)16ull);
  uint64_t v179 = v10_off + ((uint64_t)2ull);
  v1_buf0[v179] = ((uint64_t)16ull);
  uint64_t v181 = v10_off + ((uint64_t)3ull);
  v1_buf0[v181] = ((uint64_t)16ull);
  uint64_t v183_off = ((uint64_t)128ull);
  uint64_t v184 = v183_off + ((uint64_t)3ull);
  v1_buf0[v184] = v11_off;
  v1_buf0[v11_off] = ((uint64_t)16ull);
  uint64_t v187 = v11_off + ((uint64_t)1ull);
  v1_buf0[v187] = ((uint64_t)16ull);
  uint64_t v189 = v11_off + ((uint64_t)2ull);
  v1_buf0[v189] = ((uint64_t)16ull);
  uint64_t v191 = v11_off + ((uint64_t)3ull);
  v1_buf0[v191] = ((uint64_t)16ull);
  int16_t v193_buf_[] = {((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll)}; int16_t* v193_buf = v193_buf_;
  int8_t v194_buf_[] = {((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll)}; int8_t* v194_buf = v194_buf_;
  uint64_t v195_failbuf_[8000]; uint64_t* v195_failbuf = v195_failbuf_;
  uint64_t v196_failposS = ((uint64_t)0ull);
  uint64_t v197_failposC = ((uint64_t)0ull);
  uint64_t v198_i = ((uint64_t)0ull);
l14:;
  bool v199 = v198_i < ((uint64_t)4ull);
  if (!(v199)) goto l15;
  uint64_t v200 = ((uint64_t)1004ull) * v198_i;
  uint64_t v201_off = ((uint64_t)132ull) + v200;
  uint64_t v202_off = ((uint64_t)128ull);
  uint64_t v203 = v202_off + v198_i;
  uint64_t v204_off = v1_buf0[v203];
  uint64_t v205_retctr = ((uint64_t)0ull);
l17:;
  bool v206 = v201_off < v204_off;
  if (!(v206)) goto l18;
  uint64_t* v207 = v1_buf0 + v201_off;
  __m256i* v208 = (__m256i*)v207;
  __m256i* v209 = v208 + ((int64_t)0ll);
  __m256i v210_idxs = _mm256_loadu_si256(v209);
  int8_t* v211 = v6_inp + ((int64_t)1ll);
  __m256i v212 = _mm256_i64gather_epi64(v211, v210_idxs, 1);
  __m256i v213_nums = v212;
  __m256i v214 = v213_nums;
  __m256i v215 = _mm256_set1_epi64x(((int64_t)0x00ffffffffffffffll));
  __m256i v216 = v215;
  __m256i v217 = _mm256_and_si256(v214, v216);
  v213_nums = v217;
  __m256i v218 = _mm256_set1_epi8(((int8_t)46ll));
  __m256i v219 = _mm256_cmpeq_epi8(v218, v213_nums);
  __m256i v220 = v219;
  __m256i v221 = _mm256_srai_epi32(v220, 23);
  __m256i v222 = v221;
  __m256i v223 = v222;
  __m256i v224 = v223;
  __m256i v225 = _mm256_set1_epi64x(((int64_t)3ll));
  __m256i v226 = v225;
  __m256i v227 = _mm256_and_si256(v224, v226);
  __m256i v228_off = v227;
  __m256i v229 = _mm256_setr_epi8(((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll));
  v228_off = _mm256_shuffle_epi8(v228_off, v229);
  __m256i v230 = _mm256_setr_epi8(((int8_t)-1ll), ((int8_t)0ll), ((int8_t)2ll), ((int8_t)-1ll), ((int8_t)-1ll), ((int8_t)-1ll), ((int8_t)-1ll), ((int8_t)-1ll), ((int8_t)7ll), ((int8_t)8ll), ((int8_t)10ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)-1ll), ((int8_t)0ll), ((int8_t)2ll), ((int8_t)-1ll), ((int8_t)-1ll), ((int8_t)-1ll), ((int8_t)-1ll), ((int8_t)-1ll), ((int8_t)7ll), ((int8_t)8ll), ((int8_t)10ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll));
  v228_off = _mm256_add_epi8(v228_off, v230);
  __m256i v231_aligned = _mm256_shuffle_epi8(v213_nums, v228_off);
  __m256i v232 = v231_aligned;
  __m256i v233 = _mm256_set1_epi8(((int8_t)48ll));
  __m256i v234 = v233;
  __m256i v235 = _mm256_subs_epu8(v232, v234);
  v231_aligned = v235;
  __m256i v236 = v231_aligned;
  __m256i v237 = _mm256_setr_epi8(((int8_t)10ll), ((int8_t)1ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)1ll), ((int8_t)0ll), ((int8_t)10ll), ((int8_t)1ll), ((int8_t)1ll), ((int8_t)0ll));
  __m256i v238_t16 = _mm256_maddubs_epi16(v236, v237);
  __m256i v239 = _mm256_setr_epi16(((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)10ll), ((int16_t)1ll));
  __m256i v240_t32 = _mm256_madd_epi16(v238_t16, v239);
  __m256i v241_each16 = v240_t32;
  __m256i v242 = _mm256_set1_epi8(((int8_t)45ll));
  __m256i v243 = _mm256_cmpeq_epi8(v242, v213_nums);
  __m256i v244 = v243;
  __m256i v245 = _mm256_set1_epi16(((int16_t)0ll));
  __m256i v246 = v245;
  __m256i v247 = _mm256_cmpeq_epi16(v244, v246);
  uint16_t v248 = ~(((uint16_t)0ull));
  int16_t v249 = (int16_t)v248;
  __m256i v250 = _mm256_set1_epi16(v249);
  __m256i v251 = v250;
  __m256i v252 = _mm256_xor_si256(v247, v251);
  __m256i v253 = v252;
  __m256i v254_neg = v253;
  v241_each16 = _mm256_xor_si256(v241_each16, v254_neg);
  v241_each16 = _mm256_sub_epi16(v241_each16, v254_neg);
  int16_t* v255 = v193_buf + ((int64_t)0ll);
  __m256i* v256 = (__m256i*)v255;
  __m256i* v257 = v256 + ((int64_t)0ll);
  _mm256_storeu_si256(v257, v241_each16);
  uint64_t v259 = v204_off - v201_off;
  uint64_t v260_i = ((uint64_t)0ull);
l19:;
  bool v261 = v260_i < ((uint64_t)2ull);
  if (!(v261)) goto l20;
  uint64_t v262 = v260_i * ((uint64_t)2ull);
  uint64_t v263 = v201_off + v262;
  uint64_t v264_off = v1_buf0[v263];
  uint64_t v265 = v264_off - ((uint64_t)16ull);
  int8_t* v266 = v6_inp + v265;
  __m128i* v267 = (__m128i*)v266;
  __m128i* v268 = v267 + ((int64_t)0ll);
  __m128i v269 = _mm_loadu_si128(v268);
  uint64_t v270 = v262 + ((uint64_t)1ull);
  uint64_t v271 = v201_off + v270;
  uint64_t v272_off = v1_buf0[v271];
  uint64_t v273 = v272_off - ((uint64_t)16ull);
  int8_t* v274 = v6_inp + v273;
  __m128i* v275 = (__m128i*)v274;
  __m128i* v276 = v275 + ((int64_t)0ll);
  __m128i v277 = _mm_loadu_si128(v276);
  __m128i v278 = v269;
  __m128i v279 = v277;
  __m256i v280 = _mm256_setr_m128i(v278, v279);
  __m256i v281 = v280;
  __m256i v282 = _mm256_set1_epi8(((int8_t)10ll));
  __m256i v283 = _mm256_cmpeq_epi8(v282, v281);
  __m256i v284_a = v283;
  __m256i v285 = _mm256_bsrli_epi128(v284_a, 8);
  __m256i v286_l = v285;
  __m256i v287 = _mm256_set1_epi64x(((int64_t)0ll));
  __m256i v288 = v287;
  __m256i v289 = _mm256_cmpeq_epi64(v286_l, v288);
  uint64_t v290 = ~(((uint64_t)0ull));
  int64_t v291 = (int64_t)v290;
  __m256i v292 = _mm256_set1_epi64x(v291);
  __m256i v293 = v292;
  __m256i v294 = _mm256_xor_si256(v289, v293);
  v284_a = _mm256_or_si256(v284_a, v294);
  __m256i v295 = _mm256_srli_epi64(v284_a, 4);
  __m256i v296 = _mm256_srli_epi64(v284_a, 20);
  __m256i v297 = _mm256_srli_epi64(v284_a, 36);
  __m256i v298 = _mm256_srli_epi64(v284_a, 52);
  __m256i v299 = _mm256_or_si256(v295, v296);
  __m256i v300 = _mm256_or_si256(v297, v298);
  v284_a = _mm256_or_si256(v299, v300);
  __m256i v301 = v284_a;
  __m256i v302 = _mm256_set1_epi8(((int8_t)0ll));
  __m256i v303 = _mm256_cmpeq_epi8(v302, v301);
  __m256i v304 = v303;
  __m256i v305 = _mm256_and_si256(v281, v304);
  __m256i v306 = v305;
  __m128i v307 = _mm256_castsi256_si128(v306);
  __m256i v308 = v305;
  __m128i v309 = _mm256_extracti128_si256(v308, 1);
  __m256i v310_hv = v305;
  __m256d v311; {__m256i v311_ = v310_hv; memcpy(&v311, &v311_, sizeof(__m256i));};
  __m256d v312 = _mm256_permute_pd(v311, 15);
  __m256i v313; {__m256d v313_ = v312; memcpy(&v313, &v313_, sizeof(__m256d));};
  v310_hv = _mm256_xor_si256(v310_hv, v313);
  __m256i v314 = v310_hv;
  __m256i v315 = _mm256_srli_epi64(v314, 32);
  __m256i v316 = v315;
  v310_hv = _mm256_xor_si256(v310_hv, v316);
  __m256i v317 = v310_hv;
  __m256i v318 = _mm256_srai_epi32(v317, 16);
  __m256i v319 = v318;
  v310_hv = _mm256_xor_si256(v310_hv, v319);
  __m256i v320_hv = v310_hv;
  __m256i v321 = v320_hv;
  __m256i v322 = _mm256_shuffle_epi32(v321, 0);
  __m256i v323_hx = v322;
  int32_t v324 = (int32_t)v2_hash_mask;
  __m256i v325 = _mm256_set1_epi32(v324);
  __m256i v326 = v325;
  __m256i v327_idxv = _mm256_and_si256(v320_hv, v326);
  __m256i v328 = v327_idxv;
  int32_t v329 = _mm256_extract_epi32(v328, 0);
  uint32_t v330 = (uint32_t)v329;
  uint64_t v331_idxs = (uint64_t)v330;
  __m256i v332 = v327_idxv;
  int32_t v333 = _mm256_extract_epi32(v332, 4);
  uint32_t v334 = (uint32_t)v333;
  uint64_t v335_idxs = (uint64_t)v334;
  uint32_t* v336 = v4_map_hash + v331_idxs;
  __m128i* v337 = (__m128i*)v336;
  __m128i* v338 = v337 + ((int64_t)0ll);
  __m128i v339 = _mm_loadu_si128(v338);
  uint32_t* v340 = v4_map_hash + v335_idxs;
  __m128i* v341 = (__m128i*)v340;
  __m128i* v342 = v341 + ((int64_t)0ll);
  __m128i v343 = _mm_loadu_si128(v342);
  __m128i v344 = v339;
  __m128i v345 = v343;
  __m256i v346 = _mm256_setr_m128i(v344, v345);
  __m256i v347_hashes = v346;
  __m256i v348 = _mm256_cmpeq_epi32(v323_hx, v347_hashes);
  __m256 v349; {__m256i v349_ = v348; memcpy(&v349, &v349_, sizeof(__m256i));};
  uint8_t v350_m = _mm256_movemask_ps(v349);
  uint8_t v351 = v350_m - ((uint8_t)1ull);
  uint8_t v352_m2 = v350_m & v351;
  bool v353 = v352_m2 == ((uint8_t)0ull);
  bool v354 = __builtin_expect(v353, 0);
  if (!(v354)) goto l21;
  uint64_t v355 = __builtin_ctz(v350_m);
  uint64_t v356 = v331_idxs + v355;
  uint64_t v357 = v335_idxs + v355;
  uint64_t v358 = v357 - ((uint64_t)4ull);
  v331_idxs = v356;
  v335_idxs = v358;
  goto l22;
l21:;
  uint8_t v359 = v352_m2 >> ((uint8_t)4ull);
  uint64_t v360 = __builtin_ctz(v350_m);
  uint64_t v361 = v331_idxs + v360;
  uint64_t v362 = __builtin_ctz(v359);
  uint64_t v363 = v335_idxs + v362;
  v331_idxs = v361;
  v335_idxs = v363;
l22:;
  bool v364 = v262 >= v259;
  bool v365 = __builtin_expect(v364, 0);
  if (!(v365)) goto l23;
  goto l16;
l23:;
  uint64_t v366 = v331_idxs * ((uint64_t)16ull);
  int8_t* v367 = v3_map_exp + v366;
  __m128i* v368 = (__m128i*)v367;
  __m128i* v369 = v368 + ((int64_t)0ll);
  __m128i v370_exp = _mm_loadu_si128(v369);
  __m128i v371 = _mm_cmpeq_epi8(v307, v370_exp);
  uint16_t v372 = _mm_movemask_epi8(v371);
  bool v373 = v372 == ((uint16_t)65535ull);
  bool v374 = !(v373);
  if (!(v374)) goto l24;
  uint64_t v375 = v201_off + v262;
  uint64_t v376 = v1_buf0[v375];
  v195_failbuf[v197_failposC] = v376;
  uint64_t v378 = v197_failposC + ((uint64_t)1ull);
  uint64_t v379 = v262 * ((uint64_t)4ull);
  int16_t v380 = v193_buf[v379];
  uint64_t v381 = (v380);
  v195_failbuf[v378] = v381;
  v197_failposC = v197_failposC + ((uint64_t)2ull);
  goto l25;
l24:;
  uint64_t v383_dataoff = v331_idxs * ((uint64_t)4ull);
  uint64_t v384 = v262 * ((uint64_t)4ull);
  int16_t v385 = v193_buf[v384];
  int32_t v386_temp = (int32_t)v385;
  uint64_t v387 = v383_dataoff + ((uint64_t)2ull);
  int32_t v388 = v5_map_data[v387];
  int32_t v389 = -(v386_temp);
  bool v390 = v388 > v389;
  int32_t v391_r = v389;
  if (!(v390)) goto l26;
  v391_r = v388;
l26:;
  v5_map_data[v387] = v391_r;
  uint64_t v393 = v383_dataoff + ((uint64_t)3ull);
  int32_t v394 = v5_map_data[v393];
  bool v395 = v394 > v386_temp;
  int32_t v396_r = v386_temp;
  if (!(v395)) goto l27;
  v396_r = v394;
l27:;
  v5_map_data[v393] = v396_r;
  int32_t v398 = v5_map_data[v383_dataoff];
  int32_t v399 = v398 + v386_temp;
  v5_map_data[v383_dataoff] = v399;
  uint64_t v401 = v383_dataoff + ((uint64_t)1ull);
  int32_t v402 = v5_map_data[v401];
  int32_t v403 = v402 + ((int32_t)1ll);
  v5_map_data[v401] = v403;
l25:;
  uint64_t v405 = v262 + ((uint64_t)1ull);
  bool v406 = v405 >= v259;
  bool v407 = __builtin_expect(v406, 0);
  if (!(v407)) goto l28;
  goto l16;
l28:;
  uint64_t v408 = v335_idxs * ((uint64_t)16ull);
  int8_t* v409 = v3_map_exp + v408;
  __m128i* v410 = (__m128i*)v409;
  __m128i* v411 = v410 + ((int64_t)0ll);
  __m128i v412_exp = _mm_loadu_si128(v411);
  __m128i v413 = _mm_cmpeq_epi8(v309, v412_exp);
  uint16_t v414 = _mm_movemask_epi8(v413);
  bool v415 = v414 == ((uint16_t)65535ull);
  bool v416 = !(v415);
  if (!(v416)) goto l29;
  uint64_t v417 = v201_off + v405;
  uint64_t v418 = v1_buf0[v417];
  v195_failbuf[v197_failposC] = v418;
  uint64_t v420 = v197_failposC + ((uint64_t)1ull);
  uint64_t v421 = v405 * ((uint64_t)4ull);
  int16_t v422 = v193_buf[v421];
  uint64_t v423 = (v422);
  v195_failbuf[v420] = v423;
  v197_failposC = v197_failposC + ((uint64_t)2ull);
  goto l30;
l29:;
  uint64_t v425_dataoff = v335_idxs * ((uint64_t)4ull);
  uint64_t v426 = v405 * ((uint64_t)4ull);
  int16_t v427 = v193_buf[v426];
  int32_t v428_temp = (int32_t)v427;
  uint64_t v429 = v425_dataoff + ((uint64_t)2ull);
  int32_t v430 = v5_map_data[v429];
  int32_t v431 = -(v428_temp);
  bool v432 = v430 > v431;
  int32_t v433_r = v431;
  if (!(v432)) goto l31;
  v433_r = v430;
l31:;
  v5_map_data[v429] = v433_r;
  uint64_t v435 = v425_dataoff + ((uint64_t)3ull);
  int32_t v436 = v5_map_data[v435];
  bool v437 = v436 > v428_temp;
  int32_t v438_r = v428_temp;
  if (!(v437)) goto l32;
  v438_r = v436;
l32:;
  v5_map_data[v435] = v438_r;
  int32_t v440 = v5_map_data[v425_dataoff];
  int32_t v441 = v440 + v428_temp;
  v5_map_data[v425_dataoff] = v441;
  uint64_t v443 = v425_dataoff + ((uint64_t)1ull);
  int32_t v444 = v5_map_data[v443];
  int32_t v445 = v444 + ((int32_t)1ll);
  v5_map_data[v443] = v445;
l30:;
  v260_i = v260_i + ((uint64_t)1ull);
  goto l19;
l20:;
  v201_off = v201_off + ((uint64_t)4ull);
  goto l17;
l18:;
l16:;
  v198_i = v198_i + ((uint64_t)1ull);
  goto l14;
l15:;
l33:;
  bool v447 = v196_failposS < v197_failposC;
  if (!(v447)) goto l34;
  uint64_t v448 = v195_failbuf[v196_failposS];
  uint64_t v449 = v196_failposS + ((uint64_t)1ull);
  uint64_t v450 = v195_failbuf[v449];
  int64_t v451 = (int64_t)v450;
  v196_failposS = v196_failposS + ((uint64_t)2ull);
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
  uint64_t v472 = __builtin_clz(v471);
  uint64_t v473 = v472 - ((uint64_t)16ull);
  uint64_t v474 = v462_start - v473;
  failed_long(v474, v448, v451);
  goto l37;
l35:;
  uint32_t v476 = (uint32_t)v459_m;
  uint64_t v477 = __builtin_clz(v476);
  uint64_t v478_c = v477 - ((uint64_t)16ull);
  uint64_t v479 = v448 - v478_c;
  int8_t* v480 = v194_buf + v478_c;
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

