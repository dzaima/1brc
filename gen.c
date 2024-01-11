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

static void si_f2_core_1brc(int32_t v0_ident, uint64_t* v1_buf0, uint32_t v2_hash_mask, int8_t* v3_map_exp, uint32_t* v4_map_hash, int64_t* v5_map_data, int8_t* v6_inp, uint64_t v7_inpOff) {
  uint64_t v8_off = ((uint64_t)132ull);
  uint64_t v9_off = ((uint64_t)1136ull);
  uint64_t v10_off = ((uint64_t)2140ull);
  uint64_t v11_off = ((uint64_t)3144ull);
  uint64_t v12_off = ((uint64_t)4148ull);
  uint64_t v13_off = v12_off;
  uint64_t v14_off = v7_inpOff;
  uint64_t v15_off = v7_inpOff + ((uint64_t)32ull);
  uint64_t v16_off = v7_inpOff + ((uint64_t)64ull);
  uint64_t v17_off = v7_inpOff + ((uint64_t)96ull);
  uint64_t v18_i = ((uint64_t)0ull);
l0:;
  bool v19 = v18_i < ((uint64_t)83ull);
  if (!(v19)) goto l1;
  int8_t* v20 = v6_inp + v14_off;
  __m256i* v21 = (__m256i*)v20;
  __m256i* v22 = v21 + ((int64_t)0ll);
  __m256i v23 = _mm256_loadu_si256(v22);
  __m256i v24 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v25 = _mm256_cmpeq_epi8(v24, v23);
  uint32_t v26 = _mm256_movemask_epi8(v25);
  int8_t* v27 = v6_inp + v15_off;
  __m256i* v28 = (__m256i*)v27;
  __m256i* v29 = v28 + ((int64_t)0ll);
  __m256i v30 = _mm256_loadu_si256(v29);
  __m256i v31 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v32 = _mm256_cmpeq_epi8(v31, v30);
  uint32_t v33 = _mm256_movemask_epi8(v32);
  int8_t* v34 = v6_inp + v16_off;
  __m256i* v35 = (__m256i*)v34;
  __m256i* v36 = v35 + ((int64_t)0ll);
  __m256i v37 = _mm256_loadu_si256(v36);
  __m256i v38 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v39 = _mm256_cmpeq_epi8(v38, v37);
  uint32_t v40 = _mm256_movemask_epi8(v39);
  int8_t* v41 = v6_inp + v17_off;
  __m256i* v42 = (__m256i*)v41;
  __m256i* v43 = v42 + ((int64_t)0ll);
  __m256i v44 = _mm256_loadu_si256(v43);
  __m256i v45 = _mm256_set1_epi8(((int8_t)59ll));
  __m256i v46 = _mm256_cmpeq_epi8(v45, v44);
  uint32_t v47 = _mm256_movemask_epi8(v46);
  uint32_t v48_m = v26;
  uint32_t v49_m = v33;
  uint32_t v50_m = v40;
  uint32_t v51_m = v47;
  uint32_t v52 = v48_m - ((uint32_t)1ull);
  uint32_t v53_m2 = v48_m & v52;
  uint64_t v54 = __builtin_ctz(v48_m);
  uint64_t v55 = v14_off + v54;
  v1_buf0[v8_off] = v55;
  v48_m = v53_m2;
  uint32_t v57 = v49_m - ((uint32_t)1ull);
  uint32_t v58_m2 = v49_m & v57;
  uint64_t v59 = __builtin_ctz(v49_m);
  uint64_t v60 = v15_off + v59;
  v1_buf0[v9_off] = v60;
  v49_m = v58_m2;
  uint32_t v62 = v50_m - ((uint32_t)1ull);
  uint32_t v63_m2 = v50_m & v62;
  uint64_t v64 = __builtin_ctz(v50_m);
  uint64_t v65 = v16_off + v64;
  v1_buf0[v10_off] = v65;
  v50_m = v63_m2;
  uint32_t v67 = v51_m - ((uint32_t)1ull);
  uint32_t v68_m2 = v51_m & v67;
  uint64_t v69 = __builtin_ctz(v51_m);
  uint64_t v70 = v17_off + v69;
  v1_buf0[v11_off] = v70;
  v51_m = v68_m2;
  uint32_t v72 = v48_m - ((uint32_t)1ull);
  uint32_t v73_m2 = v48_m & v72;
  uint64_t v74 = __builtin_ctz(v48_m);
  uint64_t v75 = v14_off + v74;
  uint64_t v76 = v8_off + ((uint64_t)1ull);
  v1_buf0[v76] = v75;
  v48_m = v73_m2;
  uint32_t v78 = v49_m - ((uint32_t)1ull);
  uint32_t v79_m2 = v49_m & v78;
  uint64_t v80 = __builtin_ctz(v49_m);
  uint64_t v81 = v15_off + v80;
  uint64_t v82 = v9_off + ((uint64_t)1ull);
  v1_buf0[v82] = v81;
  v49_m = v79_m2;
  uint32_t v84 = v50_m - ((uint32_t)1ull);
  uint32_t v85_m2 = v50_m & v84;
  uint64_t v86 = __builtin_ctz(v50_m);
  uint64_t v87 = v16_off + v86;
  uint64_t v88 = v10_off + ((uint64_t)1ull);
  v1_buf0[v88] = v87;
  v50_m = v85_m2;
  uint32_t v90 = v51_m - ((uint32_t)1ull);
  uint32_t v91_m2 = v51_m & v90;
  uint64_t v92 = __builtin_ctz(v51_m);
  uint64_t v93 = v17_off + v92;
  uint64_t v94 = v11_off + ((uint64_t)1ull);
  v1_buf0[v94] = v93;
  v51_m = v91_m2;
  uint32_t v96 = v48_m - ((uint32_t)1ull);
  uint32_t v97_m2 = v48_m & v96;
  uint64_t v98 = __builtin_ctz(v48_m);
  uint64_t v99 = v14_off + v98;
  uint64_t v100 = v8_off + ((uint64_t)2ull);
  v1_buf0[v100] = v99;
  v48_m = v97_m2;
  uint32_t v102 = v49_m - ((uint32_t)1ull);
  uint32_t v103_m2 = v49_m & v102;
  uint64_t v104 = __builtin_ctz(v49_m);
  uint64_t v105 = v15_off + v104;
  uint64_t v106 = v9_off + ((uint64_t)2ull);
  v1_buf0[v106] = v105;
  v49_m = v103_m2;
  uint32_t v108 = v50_m - ((uint32_t)1ull);
  uint32_t v109_m2 = v50_m & v108;
  uint64_t v110 = __builtin_ctz(v50_m);
  uint64_t v111 = v16_off + v110;
  uint64_t v112 = v10_off + ((uint64_t)2ull);
  v1_buf0[v112] = v111;
  v50_m = v109_m2;
  uint32_t v114 = v51_m - ((uint32_t)1ull);
  uint32_t v115_m2 = v51_m & v114;
  uint64_t v116 = __builtin_ctz(v51_m);
  uint64_t v117 = v17_off + v116;
  uint64_t v118 = v11_off + ((uint64_t)2ull);
  v1_buf0[v118] = v117;
  v51_m = v115_m2;
  uint64_t v120_pop = __builtin_popcount(v26);
  bool v121 = v120_pop > ((uint64_t)3ull);
  bool v122 = __builtin_expect(v121, 0);
  if (!(v122)) goto l2;
  v8_off = v8_off + ((uint64_t)3ull);
l3:;
  uint32_t v123 = v48_m - ((uint32_t)1ull);
  uint32_t v124_m2 = v48_m & v123;
  uint64_t v125 = __builtin_ctz(v48_m);
  uint64_t v126 = v14_off + v125;
  v1_buf0[v8_off] = v126;
  v48_m = v124_m2;
  v8_off = v8_off + ((uint64_t)1ull);
  bool v128 = v48_m != ((uint32_t)0ull);
  if (v128) goto l3;
  goto l4;
l2:;
  v8_off = v8_off + v120_pop;
l4:;
  v14_off = v14_off + ((uint64_t)128ull);
  uint64_t v129_pop = __builtin_popcount(v33);
  bool v130 = v129_pop > ((uint64_t)3ull);
  bool v131 = __builtin_expect(v130, 0);
  if (!(v131)) goto l5;
  v9_off = v9_off + ((uint64_t)3ull);
l6:;
  uint32_t v132 = v49_m - ((uint32_t)1ull);
  uint32_t v133_m2 = v49_m & v132;
  uint64_t v134 = __builtin_ctz(v49_m);
  uint64_t v135 = v15_off + v134;
  v1_buf0[v9_off] = v135;
  v49_m = v133_m2;
  v9_off = v9_off + ((uint64_t)1ull);
  bool v137 = v49_m != ((uint32_t)0ull);
  if (v137) goto l6;
  goto l7;
l5:;
  v9_off = v9_off + v129_pop;
l7:;
  v15_off = v15_off + ((uint64_t)128ull);
  uint64_t v138_pop = __builtin_popcount(v40);
  bool v139 = v138_pop > ((uint64_t)3ull);
  bool v140 = __builtin_expect(v139, 0);
  if (!(v140)) goto l8;
  v10_off = v10_off + ((uint64_t)3ull);
l9:;
  uint32_t v141 = v50_m - ((uint32_t)1ull);
  uint32_t v142_m2 = v50_m & v141;
  uint64_t v143 = __builtin_ctz(v50_m);
  uint64_t v144 = v16_off + v143;
  v1_buf0[v10_off] = v144;
  v50_m = v142_m2;
  v10_off = v10_off + ((uint64_t)1ull);
  bool v146 = v50_m != ((uint32_t)0ull);
  if (v146) goto l9;
  goto l10;
l8:;
  v10_off = v10_off + v138_pop;
l10:;
  v16_off = v16_off + ((uint64_t)128ull);
  uint64_t v147_pop = __builtin_popcount(v47);
  bool v148 = v147_pop > ((uint64_t)3ull);
  bool v149 = __builtin_expect(v148, 0);
  if (!(v149)) goto l11;
  v11_off = v11_off + ((uint64_t)3ull);
l12:;
  uint32_t v150 = v51_m - ((uint32_t)1ull);
  uint32_t v151_m2 = v51_m & v150;
  uint64_t v152 = __builtin_ctz(v51_m);
  uint64_t v153 = v17_off + v152;
  v1_buf0[v11_off] = v153;
  v51_m = v151_m2;
  v11_off = v11_off + ((uint64_t)1ull);
  bool v155 = v51_m != ((uint32_t)0ull);
  if (v155) goto l12;
  goto l13;
l11:;
  v11_off = v11_off + v147_pop;
l13:;
  v17_off = v17_off + ((uint64_t)128ull);
  v18_i = v18_i + ((uint64_t)1ull);
  goto l0;
l1:;
  uint64_t v156_off = ((uint64_t)128ull);
  v1_buf0[v156_off] = v8_off;
  v1_buf0[v8_off] = ((uint64_t)16ull);
  uint64_t v159 = v8_off + ((uint64_t)1ull);
  v1_buf0[v159] = ((uint64_t)16ull);
  uint64_t v161 = v8_off + ((uint64_t)2ull);
  v1_buf0[v161] = ((uint64_t)16ull);
  uint64_t v163 = v8_off + ((uint64_t)3ull);
  v1_buf0[v163] = ((uint64_t)16ull);
  uint64_t v165_off = ((uint64_t)128ull);
  uint64_t v166 = v165_off + ((uint64_t)1ull);
  v1_buf0[v166] = v9_off;
  v1_buf0[v9_off] = ((uint64_t)16ull);
  uint64_t v169 = v9_off + ((uint64_t)1ull);
  v1_buf0[v169] = ((uint64_t)16ull);
  uint64_t v171 = v9_off + ((uint64_t)2ull);
  v1_buf0[v171] = ((uint64_t)16ull);
  uint64_t v173 = v9_off + ((uint64_t)3ull);
  v1_buf0[v173] = ((uint64_t)16ull);
  uint64_t v175_off = ((uint64_t)128ull);
  uint64_t v176 = v175_off + ((uint64_t)2ull);
  v1_buf0[v176] = v10_off;
  v1_buf0[v10_off] = ((uint64_t)16ull);
  uint64_t v179 = v10_off + ((uint64_t)1ull);
  v1_buf0[v179] = ((uint64_t)16ull);
  uint64_t v181 = v10_off + ((uint64_t)2ull);
  v1_buf0[v181] = ((uint64_t)16ull);
  uint64_t v183 = v10_off + ((uint64_t)3ull);
  v1_buf0[v183] = ((uint64_t)16ull);
  uint64_t v185_off = ((uint64_t)128ull);
  uint64_t v186 = v185_off + ((uint64_t)3ull);
  v1_buf0[v186] = v11_off;
  v1_buf0[v11_off] = ((uint64_t)16ull);
  uint64_t v189 = v11_off + ((uint64_t)1ull);
  v1_buf0[v189] = ((uint64_t)16ull);
  uint64_t v191 = v11_off + ((uint64_t)2ull);
  v1_buf0[v191] = ((uint64_t)16ull);
  uint64_t v193 = v11_off + ((uint64_t)3ull);
  v1_buf0[v193] = ((uint64_t)16ull);
  int16_t v195_buf_[] = {((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll),((int16_t)0ll)}; int16_t* v195_buf = v195_buf_;
  int8_t v196_buf_[] = {((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)0ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll),((int8_t)-1ll)}; int8_t* v196_buf = v196_buf_;
  uint64_t v197_i = ((uint64_t)0ull);
l14:;
  bool v198 = v197_i < ((uint64_t)4ull);
  if (!(v198)) goto l15;
  uint64_t v199 = ((uint64_t)1004ull) * v197_i;
  uint64_t v200_off = ((uint64_t)132ull) + v199;
  uint64_t v201_off = ((uint64_t)128ull);
  uint64_t v202 = v201_off + v197_i;
  uint64_t v203_off = v1_buf0[v202];
  uint64_t v204_retctr = ((uint64_t)0ull);
l17:;
  bool v205 = v200_off < v203_off;
  if (!(v205)) goto l18;
  uint64_t* v206 = v1_buf0 + v200_off;
  __m256i* v207 = (__m256i*)v206;
  __m256i* v208 = v207 + ((int64_t)0ll);
  __m256i v209_idxs = _mm256_loadu_si256(v208);
  __m256i v210 = _mm256_set1_epi64x(((int64_t)1ll));
  __m256i v211 = v210;
  __m256i v212 = _mm256_add_epi64(v209_idxs, v211);
  int8_t* v213 = v6_inp + ((int64_t)0ll);
  __m256i v214 = _mm256_i64gather_epi64(v213, v212, 1);
  __m256i v215_nums = v214;
  __m256i v216 = _mm256_set1_epi8(((int8_t)46ll));
  __m256i v217 = _mm256_cmpeq_epi8(v216, v215_nums);
  __m256i v218 = v217;
  __m256i v219 = _mm256_srai_epi32(v218, 23);
  __m256i v220 = v219;
  __m256i v221 = _mm256_set1_epi64x(((int64_t)3ll));
  __m256i v222 = _mm256_and_si256(v220, v221);
  __m256i v223_off = v222;
  __m256i v224 = _mm256_setr_epi8(((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll));
  v223_off = _mm256_shuffle_epi8(v223_off, v224);
  __m256i v225 = v215_nums;
  __m256i v226 = _mm256_set1_epi64x(((int64_t)0x00ffffffffffffffll));
  __m256i v227 = _mm256_and_si256(v225, v226);
  v215_nums = v227;
  __m256i v228 = _mm256_setr_epi8(((int8_t)0ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)7ll), ((int8_t)7ll));
  v223_off = _mm256_or_si256(v223_off, v228);
  __m256i v229 = _mm256_setr_epi8(((int8_t)-1ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)2ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)10ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)-1ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)2ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)0ll), ((int8_t)7ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)10ll), ((int8_t)8ll), ((int8_t)8ll), ((int8_t)8ll));
  v223_off = _mm256_add_epi8(v223_off, v229);
  __m256i v230 = _mm256_shuffle_epi8(v215_nums, v223_off);
  __m256i v231_aligned16 = v230;
  __m256i v232 = v231_aligned16;
  __m256i v233 = _mm256_set1_epi8(((int8_t)48ll));
  __m256i v234 = v233;
  __m256i v235 = _mm256_subs_epu8(v232, v234);
  v231_aligned16 = v235;
  __m256i v236 = _mm256_setr_epi16(((int16_t)100ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)0ll), ((int16_t)100ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)0ll), ((int16_t)100ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)0ll), ((int16_t)100ll), ((int16_t)10ll), ((int16_t)1ll), ((int16_t)0ll));
  v231_aligned16 = _mm256_mullo_epi16(v231_aligned16, v236);
  __m256i v237 = v231_aligned16;
  __m256i v238 = _mm256_srli_epi64(v237, 32);
  __m256i v239 = v238;
  v231_aligned16 = _mm256_add_epi16(v231_aligned16, v239);
  __m256i v240 = v231_aligned16;
  __m256i v241 = _mm256_srli_epi64(v240, 16);
  __m256i v242 = v241;
  v231_aligned16 = _mm256_add_epi16(v231_aligned16, v242);
  __m256i v243 = _mm256_set1_epi8(((int8_t)45ll));
  __m256i v244 = _mm256_cmpeq_epi8(v243, v215_nums);
  __m256i v245 = v244;
  __m256i v246 = _mm256_set1_epi16(((int16_t)0ll));
  __m256i v247 = _mm256_cmpeq_epi16(v245, v246);
  uint16_t v248 = ~(((uint16_t)0ull));
  int16_t v249 = (int16_t)v248;
  __m256i v250 = _mm256_set1_epi16(v249);
  __m256i v251 = v250;
  __m256i v252 = _mm256_xor_si256(v247, v251);
  __m256i v253_neg = v252;
  v231_aligned16 = _mm256_xor_si256(v231_aligned16, v253_neg);
  v231_aligned16 = _mm256_sub_epi16(v231_aligned16, v253_neg);
  int16_t* v254 = v195_buf + ((int64_t)0ll);
  __m256i* v255 = (__m256i*)v254;
  __m256i* v256 = v255 + ((int64_t)0ll);
  _mm256_storeu_si256(v256, v231_aligned16);
  uint64_t v258 = v203_off - v200_off;
  uint64_t v259_i = ((uint64_t)0ull);
l19:;
  bool v260 = v259_i < ((uint64_t)2ull);
  if (!(v260)) goto l20;
  uint64_t v261 = v259_i * ((uint64_t)2ull);
  uint64_t v262 = v200_off + v261;
  uint64_t v263_off = v1_buf0[v262];
  uint64_t v264 = v263_off - ((uint64_t)16ull);
  int8_t* v265 = v6_inp + v264;
  __m128i* v266 = (__m128i*)v265;
  __m128i* v267 = v266 + ((int64_t)0ll);
  __m128i v268 = _mm_loadu_si128(v267);
  uint64_t v269 = v261 + ((uint64_t)1ull);
  uint64_t v270 = v200_off + v269;
  uint64_t v271_off = v1_buf0[v270];
  uint64_t v272 = v271_off - ((uint64_t)16ull);
  int8_t* v273 = v6_inp + v272;
  __m128i* v274 = (__m128i*)v273;
  __m128i* v275 = v274 + ((int64_t)0ll);
  __m128i v276 = _mm_loadu_si128(v275);
  __m128i v277 = v268;
  __m128i v278 = v276;
  __m256i v279 = _mm256_setr_m128i(v277, v278);
  __m256i v280 = v279;
  __m256i v281 = _mm256_set1_epi8(((int8_t)10ll));
  __m256i v282 = _mm256_cmpeq_epi8(v281, v280);
  __m256i v283_a = v282;
  __m256i v284_l = _mm256_bsrli_epi128(v283_a, 8);
  __m256i v285 = _mm256_set1_epi64x(((int64_t)0ll));
  __m256i v286 = v285;
  __m256i v287 = _mm256_cmpeq_epi64(v284_l, v286);
  uint64_t v288 = ~(((uint64_t)0ull));
  int64_t v289 = (int64_t)v288;
  __m256i v290 = _mm256_set1_epi64x(v289);
  __m256i v291 = v290;
  __m256i v292 = _mm256_xor_si256(v287, v291);
  v283_a = _mm256_or_si256(v283_a, v292);
  __m256i v293 = _mm256_srli_epi64(v283_a, 4);
  __m256i v294 = _mm256_srli_epi64(v283_a, 20);
  __m256i v295 = _mm256_srli_epi64(v283_a, 36);
  __m256i v296 = _mm256_srli_epi64(v283_a, 52);
  __m256i v297 = _mm256_or_si256(v293, v294);
  __m256i v298 = _mm256_or_si256(v295, v296);
  v283_a = _mm256_or_si256(v297, v298);
  __m256i v299 = v283_a;
  __m256i v300 = _mm256_set1_epi8(((int8_t)0ll));
  __m256i v301 = _mm256_cmpeq_epi8(v300, v299);
  __m256i v302 = v301;
  __m256i v303 = _mm256_and_si256(v280, v302);
  __m256i v304 = v303;
  __m128i v305 = _mm256_castsi256_si128(v304);
  __m256i v306 = v303;
  __m128i v307 = _mm256_extracti128_si256(v306, 1);
  __m256i v308_hv = v303;
  __m256d v309; {__m256i v309_ = v308_hv; memcpy(&v309, &v309_, sizeof(__m256i));};
  __m256d v310 = _mm256_permute_pd(v309, 15);
  __m256i v311; {__m256d v311_ = v310; memcpy(&v311, &v311_, sizeof(__m256d));};
  v308_hv = _mm256_xor_si256(v308_hv, v311);
  __m256i v312 = v308_hv;
  __m256i v313 = _mm256_srli_epi64(v312, 32);
  __m256i v314 = v313;
  v308_hv = _mm256_xor_si256(v308_hv, v314);
  __m256i v315 = v308_hv;
  __m256i v316 = _mm256_srai_epi32(v315, 16);
  __m256i v317 = v316;
  v308_hv = _mm256_xor_si256(v308_hv, v317);
  __m256i v318_hv = v308_hv;
  __m256i v319 = v318_hv;
  __m256i v320 = _mm256_shuffle_epi32(v319, 0);
  __m256i v321_hx = v320;
  int32_t v322 = (int32_t)v2_hash_mask;
  __m256i v323 = _mm256_set1_epi32(v322);
  __m256i v324 = v323;
  __m256i v325_idxv = _mm256_and_si256(v318_hv, v324);
  __m256i v326 = v325_idxv;
  int32_t v327 = _mm256_extract_epi32(v326, 0);
  uint32_t v328 = (uint32_t)v327;
  uint64_t v329_idxs = (uint64_t)v328;
  __m256i v330 = v325_idxv;
  int32_t v331 = _mm256_extract_epi32(v330, 4);
  uint32_t v332 = (uint32_t)v331;
  uint64_t v333_idxs = (uint64_t)v332;
  uint32_t* v334 = v4_map_hash + v329_idxs;
  __m128i* v335 = (__m128i*)v334;
  __m128i* v336 = v335 + ((int64_t)0ll);
  __m128i v337 = _mm_loadu_si128(v336);
  uint32_t* v338 = v4_map_hash + v333_idxs;
  __m128i* v339 = (__m128i*)v338;
  __m128i* v340 = v339 + ((int64_t)0ll);
  __m128i v341 = _mm_loadu_si128(v340);
  __m128i v342 = v337;
  __m128i v343 = v341;
  __m256i v344 = _mm256_setr_m128i(v342, v343);
  __m256i v345_hashes = v344;
  __m256i v346 = _mm256_cmpeq_epi32(v321_hx, v345_hashes);
  __m256 v347; {__m256i v347_ = v346; memcpy(&v347, &v347_, sizeof(__m256i));};
  uint8_t v348_m = _mm256_movemask_ps(v347);
  uint8_t v349 = v348_m - ((uint8_t)1ull);
  uint8_t v350_m2 = v348_m & v349;
  bool v351 = v350_m2 == ((uint8_t)0ull);
  bool v352 = __builtin_expect(v351, 0);
  if (!(v352)) goto l21;
  uint64_t v353 = __builtin_ctz(v348_m);
  uint64_t v354 = v329_idxs + v353;
  uint64_t v355 = v333_idxs + v353;
  uint64_t v356 = v355 - ((uint64_t)4ull);
  v329_idxs = v354;
  v333_idxs = v356;
  goto l22;
l21:;
  uint8_t v357 = v350_m2 >> ((uint8_t)4ull);
  uint64_t v358 = __builtin_ctz(v348_m);
  uint64_t v359 = v329_idxs + v358;
  uint64_t v360 = __builtin_ctz(v357);
  uint64_t v361 = v333_idxs + v360;
  v329_idxs = v359;
  v333_idxs = v361;
l22:;
  bool v362 = v261 >= v258;
  bool v363 = __builtin_expect(v362, 0);
  if (!(v363)) goto l23;
  goto l16;
l23:;
  uint64_t v364 = v329_idxs * ((uint64_t)16ull);
  int8_t* v365 = v3_map_exp + v364;
  __m128i* v366 = (__m128i*)v365;
  __m128i* v367 = v366 + ((int64_t)0ll);
  __m128i v368_exp = _mm_loadu_si128(v367);
  __m128i v369 = _mm_cmpeq_epi8(v305, v368_exp);
  uint16_t v370 = _mm_movemask_epi8(v369);
  bool v371 = v370 == ((uint16_t)65535ull);
  bool v372 = !(v371);
  if (!(v372)) goto l24;
  uint64_t v373 = v200_off + v261;
  uint64_t v374 = v1_buf0[v373];
  v1_buf0[v13_off] = v374;
  uint64_t v376 = v261 * ((uint64_t)4ull);
  int16_t v377 = v195_buf[v376];
  uint64_t v378 = (uint64_t)v377;
  uint64_t v379 = v13_off + ((uint64_t)1ull);
  v1_buf0[v379] = v378;
  v13_off = v13_off + ((uint64_t)2ull);
  goto l25;
l24:;
  uint64_t v381_dataoff = v329_idxs * ((uint64_t)4ull);
  uint64_t v382 = v261 * ((uint64_t)4ull);
  int16_t v383 = v195_buf[v382];
  int64_t v384_temp = (int64_t)v383;
  uint64_t v385 = v381_dataoff + ((uint64_t)2ull);
  int64_t v386 = v5_map_data[v385];
  bool v387 = v386 > v384_temp;
  int64_t v388_r = v386;
  if (!(v387)) goto l26;
  v388_r = v384_temp;
l26:;
  v5_map_data[v385] = v388_r;
  uint64_t v390 = v381_dataoff + ((uint64_t)3ull);
  int64_t v391 = v5_map_data[v390];
  bool v392 = v391 > v384_temp;
  int64_t v393_r = v384_temp;
  if (!(v392)) goto l27;
  v393_r = v391;
l27:;
  v5_map_data[v390] = v393_r;
  int64_t v395 = v5_map_data[v381_dataoff];
  int64_t v396 = v395 + v384_temp;
  v5_map_data[v381_dataoff] = v396;
  uint64_t v398 = v381_dataoff + ((uint64_t)1ull);
  int64_t v399 = v5_map_data[v398];
  int64_t v400 = v399 + ((int64_t)1ll);
  v5_map_data[v398] = v400;
l25:;
  uint64_t v402 = v261 + ((uint64_t)1ull);
  bool v403 = v402 >= v258;
  bool v404 = __builtin_expect(v403, 0);
  if (!(v404)) goto l28;
  goto l16;
l28:;
  uint64_t v405 = v333_idxs * ((uint64_t)16ull);
  int8_t* v406 = v3_map_exp + v405;
  __m128i* v407 = (__m128i*)v406;
  __m128i* v408 = v407 + ((int64_t)0ll);
  __m128i v409_exp = _mm_loadu_si128(v408);
  __m128i v410 = _mm_cmpeq_epi8(v307, v409_exp);
  uint16_t v411 = _mm_movemask_epi8(v410);
  bool v412 = v411 == ((uint16_t)65535ull);
  bool v413 = !(v412);
  if (!(v413)) goto l29;
  uint64_t v414 = v200_off + v402;
  uint64_t v415 = v1_buf0[v414];
  v1_buf0[v13_off] = v415;
  uint64_t v417 = v402 * ((uint64_t)4ull);
  int16_t v418 = v195_buf[v417];
  uint64_t v419 = (uint64_t)v418;
  uint64_t v420 = v13_off + ((uint64_t)1ull);
  v1_buf0[v420] = v419;
  v13_off = v13_off + ((uint64_t)2ull);
  goto l30;
l29:;
  uint64_t v422_dataoff = v333_idxs * ((uint64_t)4ull);
  uint64_t v423 = v402 * ((uint64_t)4ull);
  int16_t v424 = v195_buf[v423];
  int64_t v425_temp = (int64_t)v424;
  uint64_t v426 = v422_dataoff + ((uint64_t)2ull);
  int64_t v427 = v5_map_data[v426];
  bool v428 = v427 > v425_temp;
  int64_t v429_r = v427;
  if (!(v428)) goto l31;
  v429_r = v425_temp;
l31:;
  v5_map_data[v426] = v429_r;
  uint64_t v431 = v422_dataoff + ((uint64_t)3ull);
  int64_t v432 = v5_map_data[v431];
  bool v433 = v432 > v425_temp;
  int64_t v434_r = v425_temp;
  if (!(v433)) goto l32;
  v434_r = v432;
l32:;
  v5_map_data[v431] = v434_r;
  int64_t v436 = v5_map_data[v422_dataoff];
  int64_t v437 = v436 + v425_temp;
  v5_map_data[v422_dataoff] = v437;
  uint64_t v439 = v422_dataoff + ((uint64_t)1ull);
  int64_t v440 = v5_map_data[v439];
  int64_t v441 = v440 + ((int64_t)1ll);
  v5_map_data[v439] = v441;
l30:;
  v259_i = v259_i + ((uint64_t)1ull);
  goto l19;
l20:;
  v200_off = v200_off + ((uint64_t)4ull);
  goto l17;
l18:;
l16:;
  v197_i = v197_i + ((uint64_t)1ull);
  goto l14;
l15:;
l33:;
  bool v443 = v12_off < v13_off;
  if (!(v443)) goto l34;
  uint64_t v444 = v1_buf0[v12_off];
  uint64_t v445 = v12_off + ((uint64_t)1ull);
  uint64_t v446 = v1_buf0[v445];
  int64_t v447 = (int64_t)v446;
  v12_off = v12_off + ((uint64_t)2ull);
  uint64_t v448 = v444 - ((uint64_t)16ull);
  int8_t* v449 = v6_inp + v448;
  __m128i* v450 = (__m128i*)v449;
  __m128i* v451 = v450 + ((int64_t)0ll);
  __m128i v452 = _mm_loadu_si128(v451);
  __m128i v453 = _mm_set1_epi8(((int8_t)10ll));
  __m128i v454 = _mm_cmpeq_epi8(v453, v452);
  uint16_t v455_m = _mm_movemask_epi8(v454);
  bool v456 = v455_m == ((uint16_t)0ull);
  bool v457 = __builtin_expect(v456, 1);
  if (!(v457)) goto l35;
  uint64_t v458_start = v444;
l36:;
  v458_start = v458_start - ((uint64_t)16ull);
  uint64_t v459 = v458_start - ((uint64_t)16ull);
  int8_t* v460 = v6_inp + v459;
  __m128i* v461 = (__m128i*)v460;
  __m128i* v462 = v461 + ((int64_t)0ll);
  __m128i v463 = _mm_loadu_si128(v462);
  __m128i v464 = _mm_set1_epi8(((int8_t)10ll));
  __m128i v465 = _mm_cmpeq_epi8(v464, v463);
  v455_m = _mm_movemask_epi8(v465);
  bool v466 = v455_m == ((uint16_t)0ull);
  if (v466) goto l36;
  uint32_t v467 = (uint32_t)v455_m;
  uint64_t v468 = __builtin_clz(v467);
  uint64_t v469 = v468 - ((uint64_t)16ull);
  uint64_t v470 = v458_start - v469;
  failed_long(v470, v444, v447);
  goto l37;
l35:;
  uint32_t v472 = (uint32_t)v455_m;
  uint64_t v473 = __builtin_clz(v472);
  uint64_t v474_c = v473 - ((uint64_t)16ull);
  uint64_t v475 = v444 - v474_c;
  int8_t* v476 = v196_buf + v474_c;
  __m128i* v477 = (__m128i*)v476;
  __m128i* v478 = v477 + ((int64_t)0ll);
  __m128i v479 = _mm_loadu_si128(v478);
  __m128i v480 = _mm_and_si128(v452, v479);
  __m128i v481_hv = v480;
  __m128i v482 = _mm_shuffle_epi32(v481_hv, 238);
  v481_hv = _mm_xor_si128(v481_hv, v482);
  __m128i v483 = v481_hv;
  __m128i v484 = _mm_srli_epi64(v483, 32);
  __m128i v485 = v484;
  v481_hv = _mm_xor_si128(v481_hv, v485);
  __m128i v486 = v481_hv;
  __m128i v487 = _mm_srai_epi32(v486, 16);
  __m128i v488 = v487;
  v481_hv = _mm_xor_si128(v481_hv, v488);
  __m128i v489 = v481_hv;
  int32_t v490 = _mm_extract_epi32(v489, 0);
  uint32_t v491 = (uint32_t)v490;
  failed_short(v475, v444, v447, v491);
l37:;
  goto l33;
l34:;
}

uint64_t (*const core_1brc_buf_elts)() = si_f0_core_1brc_buf_elts;

uint64_t (*const core_1brc_periter)() = si_f1_core_1brc_periter;

void (*const core_1brc)(int32_t,uint64_t*,uint32_t,int8_t*,uint32_t*,int64_t*,int8_t*,uint64_t) = si_f2_core_1brc;

