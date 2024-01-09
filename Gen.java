package gen;
import jdk.incubator.vector.*;

public class Gen {

public int core_1brc_buf_elts() {
  int switch_num = 0;
  
  while(true) switch(switch_num) {
  case 0:
    return (int)12276L;
  }
}
public int core_1brc_periter() {
  int switch_num = 0;
  
  while(true) switch(switch_num) {
  case 0:
    return (int)10624L;
  }
}
private final short[] constarr_1 = new short[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
private final byte[] constarr_2 = new byte[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
private final int[] constarr_3 = new int[]{0,0,0,0};
private final byte[] constarr_4 = new byte[]{0,0,0,0};
private final static byte[] constarr_5 = new byte[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
private final static byte[] constarr_6 = new byte[]{0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,16,16,16,16,16,16,16,16,24,24,24,24,24,24,24,24};
private final static byte[] constarr_7 = new byte[]{0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7};
private final static byte[] constarr_8 = new byte[]{-1,0,0,0,2,0,0,0,7,8,8,8,10,8,8,8,15,16,16,16,18,16,16,16,23,24,24,24,26,24,24,24};
private final static short[] constarr_9 = new short[]{100,10,1,0,100,10,1,0,100,10,1,0,100,10,1,0};
public void core_1brc(int v0_ident, int[] v1_buf0, int v2_hash_mask, byte[] v3_map_exp, int[] v4_map_hash, long[] v5_map_data, byte[] v6_inp, int v7_inpOff) {
  int switch_num = 0;
  long[] v8=null; int v9_off=0; int v10_off=0; int v11_off=0; int v12_off=0; int v13_off=0; int v14_off=0; int v15_off=0; int v16_off=0; int v17_off=0; int v18_off=0; int v19_i=0; int v30=0; int v35=0; int v40=0; int v41_m=0; int v42_m=0; int v43_m=0; int v44_m=0; int v113_pop=0; int v121_pop=0; int v129_pop=0; int v137_pop=0; short[] v156_temp_buf=null; byte[] v160_exp_mask=null; int v161_i=0; int v164_off=0; int v167_off=0; int v239=0; int v240_i=0; int v243_off=0; ByteVector v245_x=null; short v249_m=0; int v276_idx=0; byte v280_m=0; int v328=0; int v333=0;
  while(true) switch(switch_num) {
  case 0:
    v8 = new long[16];
    v9_off = (int)132L;
    v10_off = (int)1136L;
    v11_off = (int)2140L;
    v12_off = (int)3144L;
    v13_off = (int)4148L;
    v14_off = v13_off;
    v15_off = v7_inpOff;
    v16_off = v7_inpOff + (int)32L;
    v17_off = v7_inpOff + (int)64L;
    v18_off = v7_inpOff + (int)96L;
    v19_i = (int)0L;
  case 1:
    boolean v20 = v19_i < (int)83L;
    if (!v20) { switch_num = 2; break; }
    ByteVector v21 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v15_off);
    ByteVector v22 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
    VectorMask<?> v23 = v21.compare(VectorOperators.EQ, v22);
    long v24 = v23.toLong();
    int v25 = (int) v24;
    ByteVector v26 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v16_off);
    ByteVector v27 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
    VectorMask<?> v28 = v26.compare(VectorOperators.EQ, v27);
    long v29 = v28.toLong();
    v30 = (int) v29;
    ByteVector v31 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v17_off);
    ByteVector v32 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
    VectorMask<?> v33 = v31.compare(VectorOperators.EQ, v32);
    long v34 = v33.toLong();
    v35 = (int) v34;
    ByteVector v36 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v18_off);
    ByteVector v37 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
    VectorMask<?> v38 = v36.compare(VectorOperators.EQ, v37);
    long v39 = v38.toLong();
    v40 = (int) v39;
    v41_m = v25;
    v42_m = v30;
    v43_m = v35;
    v44_m = v40;
    int v45 = v41_m - (int)1L;
    int v46_m2 = v41_m & v45;
    int v47 = Integer.numberOfTrailingZeros(v41_m);
    int v48 = v15_off + v47;
    v1_buf0[v9_off] = v48;
    v41_m = v46_m2;
    int v50 = v42_m - (int)1L;
    int v51_m2 = v42_m & v50;
    int v52 = Integer.numberOfTrailingZeros(v42_m);
    int v53 = v16_off + v52;
    v1_buf0[v10_off] = v53;
    v42_m = v51_m2;
    int v55 = v43_m - (int)1L;
    int v56_m2 = v43_m & v55;
    int v57 = Integer.numberOfTrailingZeros(v43_m);
    int v58 = v17_off + v57;
    v1_buf0[v11_off] = v58;
    v43_m = v56_m2;
    int v60 = v44_m - (int)1L;
    int v61_m2 = v44_m & v60;
    int v62 = Integer.numberOfTrailingZeros(v44_m);
    int v63 = v18_off + v62;
    v1_buf0[v12_off] = v63;
    v44_m = v61_m2;
    int v65 = v41_m - (int)1L;
    int v66_m2 = v41_m & v65;
    int v67 = Integer.numberOfTrailingZeros(v41_m);
    int v68 = v15_off + v67;
    int v69 = v9_off + (int)1L;
    v1_buf0[v69] = v68;
    v41_m = v66_m2;
    int v71 = v42_m - (int)1L;
    int v72_m2 = v42_m & v71;
    int v73 = Integer.numberOfTrailingZeros(v42_m);
    int v74 = v16_off + v73;
    int v75 = v10_off + (int)1L;
    v1_buf0[v75] = v74;
    v42_m = v72_m2;
    int v77 = v43_m - (int)1L;
    int v78_m2 = v43_m & v77;
    int v79 = Integer.numberOfTrailingZeros(v43_m);
    int v80 = v17_off + v79;
    int v81 = v11_off + (int)1L;
    v1_buf0[v81] = v80;
    v43_m = v78_m2;
    int v83 = v44_m - (int)1L;
    int v84_m2 = v44_m & v83;
    int v85 = Integer.numberOfTrailingZeros(v44_m);
    int v86 = v18_off + v85;
    int v87 = v12_off + (int)1L;
    v1_buf0[v87] = v86;
    v44_m = v84_m2;
    int v89 = v41_m - (int)1L;
    int v90_m2 = v41_m & v89;
    int v91 = Integer.numberOfTrailingZeros(v41_m);
    int v92 = v15_off + v91;
    int v93 = v9_off + (int)2L;
    v1_buf0[v93] = v92;
    v41_m = v90_m2;
    int v95 = v42_m - (int)1L;
    int v96_m2 = v42_m & v95;
    int v97 = Integer.numberOfTrailingZeros(v42_m);
    int v98 = v16_off + v97;
    int v99 = v10_off + (int)2L;
    v1_buf0[v99] = v98;
    v42_m = v96_m2;
    int v101 = v43_m - (int)1L;
    int v102_m2 = v43_m & v101;
    int v103 = Integer.numberOfTrailingZeros(v43_m);
    int v104 = v17_off + v103;
    int v105 = v11_off + (int)2L;
    v1_buf0[v105] = v104;
    v43_m = v102_m2;
    int v107 = v44_m - (int)1L;
    int v108_m2 = v44_m & v107;
    int v109 = Integer.numberOfTrailingZeros(v44_m);
    int v110 = v18_off + v109;
    int v111 = v12_off + (int)2L;
    v1_buf0[v111] = v110;
    v44_m = v108_m2;
    v113_pop = Integer.bitCount(v25);
    boolean v114 = v113_pop > (int)3L;
    if (!v114) { switch_num = 3; break; }
    v9_off = v9_off + (int)3L;
  case 4:
    int v115 = v41_m - (int)1L;
    int v116_m2 = v41_m & v115;
    int v117 = Integer.numberOfTrailingZeros(v41_m);
    int v118 = v15_off + v117;
    v1_buf0[v9_off] = v118;
    v41_m = v116_m2;
    v9_off = v9_off + (int)1L;
    boolean v120 = v41_m != (int)0L;
    if (v120) { switch_num = 4; break; }
    if (1==1) { switch_num = 5; break; }
  case 3:
    v9_off = v9_off + v113_pop;
  case 5:
    v15_off = v15_off + (int)128L;
    v121_pop = Integer.bitCount(v30);
    boolean v122 = v121_pop > (int)3L;
    if (!v122) { switch_num = 6; break; }
    v10_off = v10_off + (int)3L;
  case 7:
    int v123 = v42_m - (int)1L;
    int v124_m2 = v42_m & v123;
    int v125 = Integer.numberOfTrailingZeros(v42_m);
    int v126 = v16_off + v125;
    v1_buf0[v10_off] = v126;
    v42_m = v124_m2;
    v10_off = v10_off + (int)1L;
    boolean v128 = v42_m != (int)0L;
    if (v128) { switch_num = 7; break; }
    if (1==1) { switch_num = 8; break; }
  case 6:
    v10_off = v10_off + v121_pop;
  case 8:
    v16_off = v16_off + (int)128L;
    v129_pop = Integer.bitCount(v35);
    boolean v130 = v129_pop > (int)3L;
    if (!v130) { switch_num = 9; break; }
    v11_off = v11_off + (int)3L;
  case 10:
    int v131 = v43_m - (int)1L;
    int v132_m2 = v43_m & v131;
    int v133 = Integer.numberOfTrailingZeros(v43_m);
    int v134 = v17_off + v133;
    v1_buf0[v11_off] = v134;
    v43_m = v132_m2;
    v11_off = v11_off + (int)1L;
    boolean v136 = v43_m != (int)0L;
    if (v136) { switch_num = 10; break; }
    if (1==1) { switch_num = 11; break; }
  case 9:
    v11_off = v11_off + v129_pop;
  case 11:
    v17_off = v17_off + (int)128L;
    v137_pop = Integer.bitCount(v40);
    boolean v138 = v137_pop > (int)3L;
    if (!v138) { switch_num = 12; break; }
    v12_off = v12_off + (int)3L;
  case 13:
    int v139 = v44_m - (int)1L;
    int v140_m2 = v44_m & v139;
    int v141 = Integer.numberOfTrailingZeros(v44_m);
    int v142 = v18_off + v141;
    v1_buf0[v12_off] = v142;
    v44_m = v140_m2;
    v12_off = v12_off + (int)1L;
    boolean v144 = v44_m != (int)0L;
    if (v144) { switch_num = 13; break; }
    if (1==1) { switch_num = 14; break; }
  case 12:
    v12_off = v12_off + v137_pop;
  case 14:
    v18_off = v18_off + (int)128L;
    v19_i = v19_i + (int)1L;
    if (1==1) { switch_num = 1; break; }
  case 2:
    int v145_off = (int)128L;
    v1_buf0[v145_off] = v9_off;
    int v147_off = (int)128L;
    int v148 = v147_off + (int)1L;
    v1_buf0[v148] = v10_off;
    int v150_off = (int)128L;
    int v151 = v150_off + (int)2L;
    v1_buf0[v151] = v11_off;
    int v153_off = (int)128L;
    int v154 = v153_off + (int)3L;
    v1_buf0[v154] = v12_off;
    v156_temp_buf = constarr_1;
    byte[] v157_hash_tmp = constarr_2;
    int[] v158_hash_buf = constarr_3;
    byte[] v159_status_buf = constarr_4;
    v160_exp_mask = constarr_5;
    v161_i = (int)0L;
  case 15:
    boolean v162 = v161_i < (int)4L;
    if (!v162) { switch_num = 16; break; }
    int v163 = (int)1004L * v161_i;
    v164_off = (int)132L + v163;
    int v165_off = (int)128L;
    int v166 = v165_off + v161_i;
    v167_off = v1_buf0[v166];
    int v168_retctr = (int)0L;
  case 17:
    boolean v169 = v164_off < v167_off;
    if (!v169) { switch_num = 18; break; }
    IntVector v170_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_buf0, v164_off);
    IntVector v171 = (IntVector) IntVector.SPECIES_128.broadcast((int)1L);
    IntVector v172 = v170_idxs.add(v171);
    int v173 = v172.lane(0);
    ByteVector v174 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v173);
    LongVector v175 = v174.reinterpretAsLongs();
    long v176 = v175.lane(0);
    int v177 = v172.lane(1);
    ByteVector v178 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v177);
    LongVector v179 = v178.reinterpretAsLongs();
    long v180 = v179.lane(0);
    int v181 = v172.lane(2);
    ByteVector v182 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v181);
    LongVector v183 = v182.reinterpretAsLongs();
    long v184 = v183.lane(0);
    int v185 = v172.lane(3);
    ByteVector v186 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v185);
    LongVector v187 = v186.reinterpretAsLongs();
    long v188 = v187.lane(0);
    v8[0] = v176;
    v8[1] = v180;
    v8[2] = v184;
    v8[3] = v188;
    LongVector v193 = (LongVector) LongVector.SPECIES_256.fromArray(v8, 0);
    ByteVector v194_nums = v193.reinterpretAsBytes();
    ByteVector v195 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46L);
    VectorMask<?> v196 = v194_nums.compare(VectorOperators.EQ, v195);
    ByteVector v197 = (ByteVector) v196.toVector();
    IntVector v198 = v197.reinterpretAsInts();
    IntVector v199 = v198.lanewise(VectorOperators.ASHR, 23);
    LongVector v200 = v199.reinterpretAsLongs();
    LongVector v201 = (LongVector) LongVector.SPECIES_256.broadcast((long)3L);
    LongVector v202 = v200.and(v201);
    ByteVector v203_off = v202.reinterpretAsBytes();
    byte[] v204 = constarr_6;
    ByteVector v205 = (ByteVector) ByteVector.SPECIES_256.fromArray(v204, 0);
    v203_off = v205.selectFrom(v203_off);
    LongVector v206 = v194_nums.reinterpretAsLongs();
    LongVector v207 = (LongVector) LongVector.SPECIES_256.broadcast((long)0x00ffffffffffffffL);
    LongVector v208 = v206.and(v207);
    v194_nums = v208.reinterpretAsBytes();
    byte[] v209 = constarr_7;
    ByteVector v210 = (ByteVector) ByteVector.SPECIES_256.fromArray(v209, 0);
    v203_off = v203_off.or(v210);
    byte[] v211 = constarr_8;
    ByteVector v212 = (ByteVector) ByteVector.SPECIES_256.fromArray(v211, 0);
    v203_off = v203_off.add(v212);
    ByteVector v213 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31L);
    v203_off = v203_off.and(v213);
    ByteVector v214 = v203_off.selectFrom(v194_nums);
    ShortVector v215_aligned16 = v214.reinterpretAsShorts();
    ByteVector v216 = v215_aligned16.reinterpretAsBytes();
    ByteVector v217 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48L);
    ByteVector v218 = v216.sub(v217);
    ByteVector v219 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0L);
    ByteVector v220 = v218.max(v219);
    v215_aligned16 = v220.reinterpretAsShorts();
    short[] v221 = constarr_9;
    ShortVector v222 = (ShortVector) ShortVector.SPECIES_256.fromArray(v221, 0);
    v215_aligned16 = v215_aligned16.mul(v222);
    LongVector v223 = v215_aligned16.reinterpretAsLongs();
    LongVector v224 = v223.lanewise(VectorOperators.LSHR, 32);
    ShortVector v225 = v224.reinterpretAsShorts();
    v215_aligned16 = v215_aligned16.add(v225);
    LongVector v226 = v215_aligned16.reinterpretAsLongs();
    LongVector v227 = v226.lanewise(VectorOperators.LSHR, 16);
    ShortVector v228 = v227.reinterpretAsShorts();
    v215_aligned16 = v215_aligned16.add(v228);
    ByteVector v229 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45L);
    VectorMask<?> v230 = v194_nums.compare(VectorOperators.EQ, v229);
    ByteVector v231 = (ByteVector) v230.toVector();
    ShortVector v232 = v231.reinterpretAsShorts();
    ShortVector v233 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0L);
    VectorMask<?> v234 = v232.compare(VectorOperators.NE, v233);
    ShortVector v235 = (ShortVector) v234.toVector();
    ShortVector v236_neg = (v235);
    v215_aligned16 = v215_aligned16.lanewise(VectorOperators.XOR, v236_neg);
    v215_aligned16 = v215_aligned16.sub(v236_neg);
    v215_aligned16.intoArray(v156_temp_buf, 0);
    int v238 = v167_off - v164_off;
    v239 = Math.min(v238, (int)4L);
    v240_i = (int)0L;
  case 19:
    boolean v241 = v240_i < v239;
    if (!v241) { switch_num = 20; break; }
    int v242 = v164_off + v240_i;
    v243_off = v1_buf0[v242];
    int v244 = v243_off - (int)16L;
    v245_x = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v244);
    ByteVector v246 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10L);
    VectorMask<?> v247 = v245_x.compare(VectorOperators.EQ, v246);
    long v248 = v247.toLong();
    v249_m = (short) v248;
    boolean v250 = v249_m == (short)0L;
    if (!v250) { switch_num = 21; break; }
    v1_buf0[v14_off] = v243_off;
    int v252 = v240_i * (int)4L;
    short v253 = v156_temp_buf[v252];
    int v254 = (int) v253;
    int v255 = v254 << (int)1L;
    short v256 = (short) v255;
    int v257 = (int) v256;
    int v258 = v257 | (int)1L;
    int v259 = v14_off + (int)1L;
    v1_buf0[v259] = v258;
    v14_off = v14_off + (int)2L;
    if (1==1) { switch_num = 22; break; }
  case 21:
    int v261 = (int) v249_m;
    int v262 = v261 & (int)65535L;
    int v263 = Integer.numberOfLeadingZeros(v262);
    int v264 = v263 - (int)16L;
    ByteVector v265 = (ByteVector) ByteVector.SPECIES_128.fromArray(v160_exp_mask, v264);
    v245_x = v245_x.and(v265);
    IntVector v266_hv = v245_x.reinterpretAsInts();
    VectorShuffle<Integer> v267 = IntVector.SPECIES_128.shuffleFromValues(2, 3, 2, 3);
    IntVector v268 = v266_hv.rearrange(v267);
    v266_hv = v266_hv.lanewise(VectorOperators.XOR, v268);
    LongVector v269 = v266_hv.reinterpretAsLongs();
    LongVector v270 = v269.lanewise(VectorOperators.LSHR, 32);
    IntVector v271 = v270.reinterpretAsInts();
    v266_hv = v266_hv.lanewise(VectorOperators.XOR, v271);
    IntVector v272 = (v266_hv);
    IntVector v273 = v272.lanewise(VectorOperators.ASHR, 16);
    IntVector v274 = (v273);
    v266_hv = v266_hv.lanewise(VectorOperators.XOR, v274);
    int v275_hash = v266_hv.lane(0);
    v266_hv = (IntVector) IntVector.SPECIES_128.broadcast(v275_hash);
    v276_idx = v275_hash & v2_hash_mask;
    IntVector v277 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v276_idx);
    VectorMask<?> v278 = v266_hv.compare(VectorOperators.EQ, v277);
    long v279 = v278.toLong();
    v280_m = (byte) v279;
    boolean v281 = v280_m == (byte)0L;
    if (!v281) { switch_num = 23; break; }
    v1_buf0[v14_off] = v243_off;
    int v283 = v240_i * (int)4L;
    short v284 = v156_temp_buf[v283];
    int v285 = (int) v284;
    int v286 = v285 << (int)1L;
    short v287 = (short) v286;
    int v288 = (int) v287;
    int v289 = v288 | (int)0L;
    int v290 = v14_off + (int)1L;
    v1_buf0[v290] = v289;
    v14_off = v14_off + (int)2L;
    if (1==1) { switch_num = 24; break; }
  case 23:
    int v292 = Integer.numberOfTrailingZeros(v280_m);
    int v293 = (int) v292;
    v276_idx = v276_idx + v293;
    int v294 = v276_idx * (int)16L;
    ByteVector v295_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v294);
    boolean v296 = v245_x.equals(v295_exp);
    boolean v297 = !(v296);
    if (!v297) { switch_num = 25; break; }
    v1_buf0[v14_off] = v243_off;
    int v299 = v240_i * (int)4L;
    short v300 = v156_temp_buf[v299];
    int v301 = (int) v300;
    int v302 = v301 << (int)1L;
    short v303 = (short) v302;
    int v304 = (int) v303;
    int v305 = v304 | (int)0L;
    int v306 = v14_off + (int)1L;
    v1_buf0[v306] = v305;
    v14_off = v14_off + (int)2L;
    if (1==1) { switch_num = 26; break; }
  case 25:
    int v308_dataoff = v276_idx * (int)4L;
    int v309 = v240_i * (int)4L;
    short v310 = v156_temp_buf[v309];
    long v311_temp = (long) v310;
    int v312 = v308_dataoff + (int)2L;
    long v313 = v5_map_data[v312];
    long v314 = Math.min(v313, v311_temp);
    v5_map_data[v312] = v314;
    int v316 = v308_dataoff + (int)3L;
    long v317 = v5_map_data[v316];
    long v318 = Math.max(v317, v311_temp);
    v5_map_data[v316] = v318;
    long v320 = v5_map_data[v308_dataoff];
    long v321 = v320 + v311_temp;
    v5_map_data[v308_dataoff] = v321;
    int v323 = v308_dataoff + (int)1L;
    long v324 = v5_map_data[v323];
    long v325 = v324 + (long)1L;
    v5_map_data[v323] = v325;
  case 26:
  case 24:
  case 22:
    v240_i = v240_i + (int)1L;
    if (1==1) { switch_num = 19; break; }
  case 20:
    v164_off = v164_off + (int)4L;
    if (1==1) { switch_num = 17; break; }
  case 18:
    v161_i = v161_i + (int)1L;
    if (1==1) { switch_num = 15; break; }
  case 16:
  case 27:
    boolean v327 = v13_off < v14_off;
    if (!v327) { switch_num = 28; break; }
    v328 = v1_buf0[v13_off];
    int v329 = v13_off + (int)1L;
    int v330 = v1_buf0[v329];
    v13_off = v13_off + (int)2L;
    int v331 = v330 & (int)1L;
    boolean v332 = v331 != (int)0L;
    v333 = v330 >> (int)1L;
    if (!v332) { switch_num = 29; break; }
    main.Main.failed_long(v0_ident, v328, v333);
    if (1==1) { switch_num = 30; break; }
  case 29:
    main.Main.failed_short(v0_ident, v328, v333);
  case 30:
    if (1==1) { switch_num = 27; break; }
  case 28:
    return;
  }
}
public void minibench(long[] v0_b_i64, byte[] v1_b_i8, int[] v2_b_i32) {
  int switch_num = 0;
  int v4_i=0;
  while(true) switch(switch_num) {
  case 0:
    long[] v3 = new long[16];
    v4_i = (int)0L;
  case 1:
    boolean v5 = v4_i < (int)10000L;
    if (!v5) { switch_num = 2; break; }
    int v6 = v4_i * (int)32L;
    ByteVector v7_v = (ByteVector) ByteVector.SPECIES_256.fromArray(v1_b_i8, v6);
    v7_v.intoArray(v1_b_i8, v6);
    v4_i = v4_i + (int)1L;
    if (1==1) { switch_num = 1; break; }
  case 2:
    return;
  }
}
// todo export
// todo export
// todo export
// todo export

}
