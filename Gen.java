package gen;
import jdk.incubator.vector.*;

public class Gen {

public int core_1brc_buf_elts() {
  int switch_num = 0;
  
  while(true) switch(switch_num) {
  case 0:
    return (int)4276L;
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
  long[] v8=null; int v9_off=0; int v10_off=0; int v11_off=0; int v12_off=0; int v13_off=0; int v14_off=0; int v15_off=0; int v16_off=0; int v17_i=0; int v28=0; int v33=0; int v38=0; int v39_m=0; int v40_m=0; int v41_m=0; int v42_m=0; int v111_pop=0; int v119_pop=0; int v127_pop=0; int v135_pop=0; short[] v154_sample_buf=null; byte[] v158_exp_mask=null; int v159_i=0; int v162_off=0; int v165_off=0; int v237=0; int v238_i=0; int v241_off=0; ByteVector v243_x=null; short v247_m=0; int v267_idx=0; byte v271_m=0;
  while(true) switch(switch_num) {
  case 0:
    v8 = new long[16];
    v9_off = (int)132L;
    v10_off = (int)1136L;
    v11_off = (int)2140L;
    v12_off = (int)3144L;
    v13_off = v7_inpOff;
    v14_off = v7_inpOff + (int)32L;
    v15_off = v7_inpOff + (int)64L;
    v16_off = v7_inpOff + (int)96L;
    v17_i = (int)0L;
  case 1:
    boolean v18 = v17_i < (int)83L;
    if (!v18) { switch_num = 2; break; }
    ByteVector v19 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v13_off);
    ByteVector v20 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
    VectorMask<?> v21 = v19.compare(VectorOperators.EQ, v20);
    long v22 = v21.toLong();
    int v23 = (int) v22;
    ByteVector v24 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v14_off);
    ByteVector v25 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
    VectorMask<?> v26 = v24.compare(VectorOperators.EQ, v25);
    long v27 = v26.toLong();
    v28 = (int) v27;
    ByteVector v29 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v15_off);
    ByteVector v30 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
    VectorMask<?> v31 = v29.compare(VectorOperators.EQ, v30);
    long v32 = v31.toLong();
    v33 = (int) v32;
    ByteVector v34 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v16_off);
    ByteVector v35 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
    VectorMask<?> v36 = v34.compare(VectorOperators.EQ, v35);
    long v37 = v36.toLong();
    v38 = (int) v37;
    v39_m = v23;
    v40_m = v28;
    v41_m = v33;
    v42_m = v38;
    int v43 = v39_m - (int)1L;
    int v44_m2 = v39_m & v43;
    int v45 = Integer.numberOfTrailingZeros(v39_m);
    int v46 = v13_off + v45;
    v1_buf0[v9_off] = v46;
    v39_m = v44_m2;
    int v48 = v40_m - (int)1L;
    int v49_m2 = v40_m & v48;
    int v50 = Integer.numberOfTrailingZeros(v40_m);
    int v51 = v14_off + v50;
    v1_buf0[v10_off] = v51;
    v40_m = v49_m2;
    int v53 = v41_m - (int)1L;
    int v54_m2 = v41_m & v53;
    int v55 = Integer.numberOfTrailingZeros(v41_m);
    int v56 = v15_off + v55;
    v1_buf0[v11_off] = v56;
    v41_m = v54_m2;
    int v58 = v42_m - (int)1L;
    int v59_m2 = v42_m & v58;
    int v60 = Integer.numberOfTrailingZeros(v42_m);
    int v61 = v16_off + v60;
    v1_buf0[v12_off] = v61;
    v42_m = v59_m2;
    int v63 = v39_m - (int)1L;
    int v64_m2 = v39_m & v63;
    int v65 = Integer.numberOfTrailingZeros(v39_m);
    int v66 = v13_off + v65;
    int v67 = v9_off + (int)1L;
    v1_buf0[v67] = v66;
    v39_m = v64_m2;
    int v69 = v40_m - (int)1L;
    int v70_m2 = v40_m & v69;
    int v71 = Integer.numberOfTrailingZeros(v40_m);
    int v72 = v14_off + v71;
    int v73 = v10_off + (int)1L;
    v1_buf0[v73] = v72;
    v40_m = v70_m2;
    int v75 = v41_m - (int)1L;
    int v76_m2 = v41_m & v75;
    int v77 = Integer.numberOfTrailingZeros(v41_m);
    int v78 = v15_off + v77;
    int v79 = v11_off + (int)1L;
    v1_buf0[v79] = v78;
    v41_m = v76_m2;
    int v81 = v42_m - (int)1L;
    int v82_m2 = v42_m & v81;
    int v83 = Integer.numberOfTrailingZeros(v42_m);
    int v84 = v16_off + v83;
    int v85 = v12_off + (int)1L;
    v1_buf0[v85] = v84;
    v42_m = v82_m2;
    int v87 = v39_m - (int)1L;
    int v88_m2 = v39_m & v87;
    int v89 = Integer.numberOfTrailingZeros(v39_m);
    int v90 = v13_off + v89;
    int v91 = v9_off + (int)2L;
    v1_buf0[v91] = v90;
    v39_m = v88_m2;
    int v93 = v40_m - (int)1L;
    int v94_m2 = v40_m & v93;
    int v95 = Integer.numberOfTrailingZeros(v40_m);
    int v96 = v14_off + v95;
    int v97 = v10_off + (int)2L;
    v1_buf0[v97] = v96;
    v40_m = v94_m2;
    int v99 = v41_m - (int)1L;
    int v100_m2 = v41_m & v99;
    int v101 = Integer.numberOfTrailingZeros(v41_m);
    int v102 = v15_off + v101;
    int v103 = v11_off + (int)2L;
    v1_buf0[v103] = v102;
    v41_m = v100_m2;
    int v105 = v42_m - (int)1L;
    int v106_m2 = v42_m & v105;
    int v107 = Integer.numberOfTrailingZeros(v42_m);
    int v108 = v16_off + v107;
    int v109 = v12_off + (int)2L;
    v1_buf0[v109] = v108;
    v42_m = v106_m2;
    v111_pop = Integer.bitCount(v23);
    boolean v112 = v111_pop > (int)3L;
    if (!v112) { switch_num = 3; break; }
    v9_off = v9_off + (int)3L;
  case 4:
    int v113 = v39_m - (int)1L;
    int v114_m2 = v39_m & v113;
    int v115 = Integer.numberOfTrailingZeros(v39_m);
    int v116 = v13_off + v115;
    v1_buf0[v9_off] = v116;
    v39_m = v114_m2;
    v9_off = v9_off + (int)1L;
    boolean v118 = v39_m != (int)0L;
    if (v118) { switch_num = 4; break; }
    if (1==1) { switch_num = 5; break; }
  case 3:
    v9_off = v9_off + v111_pop;
  case 5:
    v13_off = v13_off + (int)128L;
    v119_pop = Integer.bitCount(v28);
    boolean v120 = v119_pop > (int)3L;
    if (!v120) { switch_num = 6; break; }
    v10_off = v10_off + (int)3L;
  case 7:
    int v121 = v40_m - (int)1L;
    int v122_m2 = v40_m & v121;
    int v123 = Integer.numberOfTrailingZeros(v40_m);
    int v124 = v14_off + v123;
    v1_buf0[v10_off] = v124;
    v40_m = v122_m2;
    v10_off = v10_off + (int)1L;
    boolean v126 = v40_m != (int)0L;
    if (v126) { switch_num = 7; break; }
    if (1==1) { switch_num = 8; break; }
  case 6:
    v10_off = v10_off + v119_pop;
  case 8:
    v14_off = v14_off + (int)128L;
    v127_pop = Integer.bitCount(v33);
    boolean v128 = v127_pop > (int)3L;
    if (!v128) { switch_num = 9; break; }
    v11_off = v11_off + (int)3L;
  case 10:
    int v129 = v41_m - (int)1L;
    int v130_m2 = v41_m & v129;
    int v131 = Integer.numberOfTrailingZeros(v41_m);
    int v132 = v15_off + v131;
    v1_buf0[v11_off] = v132;
    v41_m = v130_m2;
    v11_off = v11_off + (int)1L;
    boolean v134 = v41_m != (int)0L;
    if (v134) { switch_num = 10; break; }
    if (1==1) { switch_num = 11; break; }
  case 9:
    v11_off = v11_off + v127_pop;
  case 11:
    v15_off = v15_off + (int)128L;
    v135_pop = Integer.bitCount(v38);
    boolean v136 = v135_pop > (int)3L;
    if (!v136) { switch_num = 12; break; }
    v12_off = v12_off + (int)3L;
  case 13:
    int v137 = v42_m - (int)1L;
    int v138_m2 = v42_m & v137;
    int v139 = Integer.numberOfTrailingZeros(v42_m);
    int v140 = v16_off + v139;
    v1_buf0[v12_off] = v140;
    v42_m = v138_m2;
    v12_off = v12_off + (int)1L;
    boolean v142 = v42_m != (int)0L;
    if (v142) { switch_num = 13; break; }
    if (1==1) { switch_num = 14; break; }
  case 12:
    v12_off = v12_off + v135_pop;
  case 14:
    v16_off = v16_off + (int)128L;
    v17_i = v17_i + (int)1L;
    if (1==1) { switch_num = 1; break; }
  case 2:
    int v143_off = (int)128L;
    v1_buf0[v143_off] = v9_off;
    int v145_off = (int)128L;
    int v146 = v145_off + (int)1L;
    v1_buf0[v146] = v10_off;
    int v148_off = (int)128L;
    int v149 = v148_off + (int)2L;
    v1_buf0[v149] = v11_off;
    int v151_off = (int)128L;
    int v152 = v151_off + (int)3L;
    v1_buf0[v152] = v12_off;
    v154_sample_buf = constarr_1;
    byte[] v155_hash_tmp = constarr_2;
    int[] v156_hash_buf = constarr_3;
    byte[] v157_status_buf = constarr_4;
    v158_exp_mask = constarr_5;
    v159_i = (int)0L;
  case 15:
    boolean v160 = v159_i < (int)4L;
    if (!v160) { switch_num = 16; break; }
    int v161 = (int)1004L * v159_i;
    v162_off = (int)132L + v161;
    int v163_off = (int)128L;
    int v164 = v163_off + v159_i;
    v165_off = v1_buf0[v164];
    int v166_retctr = (int)0L;
  case 17:
    boolean v167 = v162_off < v165_off;
    if (!v167) { switch_num = 18; break; }
    IntVector v168_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_buf0, v162_off);
    IntVector v169 = (IntVector) IntVector.SPECIES_128.broadcast((int)1L);
    IntVector v170 = v168_idxs.add(v169);
    int v171 = v170.lane(0);
    ByteVector v172 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v171);
    LongVector v173 = v172.reinterpretAsLongs();
    long v174 = v173.lane(0);
    int v175 = v170.lane(1);
    ByteVector v176 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v175);
    LongVector v177 = v176.reinterpretAsLongs();
    long v178 = v177.lane(0);
    int v179 = v170.lane(2);
    ByteVector v180 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v179);
    LongVector v181 = v180.reinterpretAsLongs();
    long v182 = v181.lane(0);
    int v183 = v170.lane(3);
    ByteVector v184 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v183);
    LongVector v185 = v184.reinterpretAsLongs();
    long v186 = v185.lane(0);
    v8[0] = v174;
    v8[1] = v178;
    v8[2] = v182;
    v8[3] = v186;
    LongVector v191 = (LongVector) LongVector.SPECIES_256.fromArray(v8, 0);
    ByteVector v192_nums = v191.reinterpretAsBytes();
    ByteVector v193 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46L);
    VectorMask<?> v194 = v192_nums.compare(VectorOperators.EQ, v193);
    ByteVector v195 = (ByteVector) v194.toVector();
    IntVector v196 = v195.reinterpretAsInts();
    IntVector v197 = v196.lanewise(VectorOperators.ASHR, 23);
    LongVector v198 = v197.reinterpretAsLongs();
    LongVector v199 = (LongVector) LongVector.SPECIES_256.broadcast((long)3L);
    LongVector v200 = v198.and(v199);
    ByteVector v201_off = v200.reinterpretAsBytes();
    byte[] v202 = constarr_6;
    ByteVector v203 = (ByteVector) ByteVector.SPECIES_256.fromArray(v202, 0);
    v201_off = v203.selectFrom(v201_off);
    LongVector v204 = v192_nums.reinterpretAsLongs();
    LongVector v205 = (LongVector) LongVector.SPECIES_256.broadcast((long)0x00ffffffffffffffL);
    LongVector v206 = v204.and(v205);
    v192_nums = v206.reinterpretAsBytes();
    byte[] v207 = constarr_7;
    ByteVector v208 = (ByteVector) ByteVector.SPECIES_256.fromArray(v207, 0);
    v201_off = v201_off.or(v208);
    byte[] v209 = constarr_8;
    ByteVector v210 = (ByteVector) ByteVector.SPECIES_256.fromArray(v209, 0);
    v201_off = v201_off.add(v210);
    ByteVector v211 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31L);
    v201_off = v201_off.and(v211);
    ByteVector v212 = v201_off.selectFrom(v192_nums);
    ShortVector v213_aligned16 = v212.reinterpretAsShorts();
    ByteVector v214 = v213_aligned16.reinterpretAsBytes();
    ByteVector v215 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48L);
    ByteVector v216 = v214.sub(v215);
    ByteVector v217 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0L);
    ByteVector v218 = v216.max(v217);
    v213_aligned16 = v218.reinterpretAsShorts();
    short[] v219 = constarr_9;
    ShortVector v220 = (ShortVector) ShortVector.SPECIES_256.fromArray(v219, 0);
    v213_aligned16 = v213_aligned16.mul(v220);
    LongVector v221 = v213_aligned16.reinterpretAsLongs();
    LongVector v222 = v221.lanewise(VectorOperators.LSHR, 32);
    ShortVector v223 = v222.reinterpretAsShorts();
    v213_aligned16 = v213_aligned16.add(v223);
    LongVector v224 = v213_aligned16.reinterpretAsLongs();
    LongVector v225 = v224.lanewise(VectorOperators.LSHR, 16);
    ShortVector v226 = v225.reinterpretAsShorts();
    v213_aligned16 = v213_aligned16.add(v226);
    ByteVector v227 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45L);
    VectorMask<?> v228 = v192_nums.compare(VectorOperators.EQ, v227);
    ByteVector v229 = (ByteVector) v228.toVector();
    ShortVector v230 = v229.reinterpretAsShorts();
    ShortVector v231 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0L);
    VectorMask<?> v232 = v230.compare(VectorOperators.NE, v231);
    ShortVector v233 = (ShortVector) v232.toVector();
    ShortVector v234_neg = (v233);
    v213_aligned16 = v213_aligned16.lanewise(VectorOperators.XOR, v234_neg);
    v213_aligned16 = v213_aligned16.sub(v234_neg);
    v213_aligned16.intoArray(v154_sample_buf, 0);
    int v236 = v165_off - v162_off;
    v237 = Math.min(v236, (int)4L);
    v238_i = (int)0L;
  case 19:
    boolean v239 = v238_i < v237;
    if (!v239) { switch_num = 20; break; }
    int v240 = v162_off + v238_i;
    v241_off = v1_buf0[v240];
    int v242 = v241_off - (int)16L;
    v243_x = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v242);
    ByteVector v244 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10L);
    VectorMask<?> v245 = v243_x.compare(VectorOperators.EQ, v244);
    long v246 = v245.toLong();
    v247_m = (short) v246;
    boolean v248 = v247_m == (short)0L;
    if (!v248) { switch_num = 21; break; }
    int v249 = v238_i * (int)4L;
    short v250 = v154_sample_buf[v249];
    main.Main.failed_long(v0_ident, v241_off, v250);
    if (1==1) { switch_num = 22; break; }
  case 21:
    int v252 = (int) v247_m;
    int v253 = v252 & (int)65535L;
    int v254 = Integer.numberOfLeadingZeros(v253);
    int v255 = v254 - (int)16L;
    ByteVector v256 = (ByteVector) ByteVector.SPECIES_128.fromArray(v158_exp_mask, v255);
    v243_x = v243_x.and(v256);
    IntVector v257_hv = v243_x.reinterpretAsInts();
    VectorShuffle<Integer> v258 = IntVector.SPECIES_128.shuffleFromValues(2, 3, 2, 3);
    IntVector v259 = v257_hv.rearrange(v258);
    v257_hv = v257_hv.lanewise(VectorOperators.XOR, v259);
    LongVector v260 = v257_hv.reinterpretAsLongs();
    LongVector v261 = v260.lanewise(VectorOperators.LSHR, 32);
    IntVector v262 = v261.reinterpretAsInts();
    v257_hv = v257_hv.lanewise(VectorOperators.XOR, v262);
    IntVector v263 = (v257_hv);
    IntVector v264 = v263.lanewise(VectorOperators.ASHR, 16);
    IntVector v265 = (v264);
    v257_hv = v257_hv.lanewise(VectorOperators.XOR, v265);
    int v266_hash = v257_hv.lane(0);
    v257_hv = (IntVector) IntVector.SPECIES_128.broadcast(v266_hash);
    v267_idx = v266_hash & v2_hash_mask;
    IntVector v268 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v267_idx);
    VectorMask<?> v269 = v257_hv.compare(VectorOperators.EQ, v268);
    long v270 = v269.toLong();
    v271_m = (byte) v270;
    boolean v272 = v271_m == (byte)0L;
    if (!v272) { switch_num = 23; break; }
    int v273 = v238_i * (int)4L;
    short v274 = v154_sample_buf[v273];
    main.Main.failed_short(v0_ident, v241_off, v274);
    if (1==1) { switch_num = 24; break; }
  case 23:
    int v276 = Integer.numberOfTrailingZeros(v271_m);
    int v277 = (int) v276;
    v267_idx = v267_idx + v277;
    int v278 = v267_idx * (int)16L;
    ByteVector v279_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v278);
    boolean v280 = v243_x.equals(v279_exp);
    boolean v281 = !(v280);
    if (!v281) { switch_num = 25; break; }
    int v282 = v238_i * (int)4L;
    short v283 = v154_sample_buf[v282];
    main.Main.failed_short(v0_ident, v241_off, v283);
    if (1==1) { switch_num = 26; break; }
  case 25:
    int v285_dataoff = v267_idx * (int)4L;
    int v286 = v238_i * (int)4L;
    short v287 = v154_sample_buf[v286];
    long v288_sample = (long) v287;
    int v289 = v285_dataoff + (int)2L;
    long v290 = v5_map_data[v289];
    long v291 = Math.min(v290, v288_sample);
    v5_map_data[v289] = v291;
    int v293 = v285_dataoff + (int)3L;
    long v294 = v5_map_data[v293];
    long v295 = Math.max(v294, v288_sample);
    v5_map_data[v293] = v295;
    long v297 = v5_map_data[v285_dataoff];
    long v298 = v297 + v288_sample;
    v5_map_data[v285_dataoff] = v298;
    int v300 = v285_dataoff + (int)1L;
    long v301 = v5_map_data[v300];
    long v302 = v301 + (long)1L;
    v5_map_data[v300] = v302;
  case 26:
  case 24:
  case 22:
    v238_i = v238_i + (int)1L;
    if (1==1) { switch_num = 19; break; }
  case 20:
    v162_off = v162_off + (int)4L;
    if (1==1) { switch_num = 17; break; }
  case 18:
    v159_i = v159_i + (int)1L;
    if (1==1) { switch_num = 15; break; }
  case 16:
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
