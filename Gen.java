package gen;
import jdk.incubator.vector.*;

public class Gen {

public int core_1brc_buf_elts() {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    return 12276;
  }
}
public int core_1brc_periter() {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    return 10624;
  }
}
public int hash_1brc(byte[] v0_arr) {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    ByteVector v1 = (ByteVector) ByteVector.SPECIES_128.fromArray(v0_arr, 0);
    IntVector v2_hv = v1.reinterpretAsInts();
    LongVector v3 = v2_hv.reinterpretAsLongs();
    long v4 = v3.lane(1);
    LongVector v5 = (LongVector) LongVector.SPECIES_128.broadcast(v4);
    IntVector v6 = v5.reinterpretAsInts();
    v2_hv = v2_hv.lanewise(VectorOperators.XOR, v6);
    LongVector v7 = v2_hv.reinterpretAsLongs();
    LongVector v8 = v7.lanewise(VectorOperators.LSHR, 32);
    IntVector v9 = v8.reinterpretAsInts();
    v2_hv = v2_hv.lanewise(VectorOperators.XOR, v9);
    IntVector v10 = (v2_hv);
    IntVector v11 = v10.lanewise(VectorOperators.ASHR, 16);
    IntVector v12 = (v11);
    v2_hv = v2_hv.lanewise(VectorOperators.XOR, v12);
    int v13 = v2_hv.lane(0);
    return v13;
  }
}
private final short[] arr_1 = new short[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
private final static byte[] arr_2 = new byte[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
private final int[] arr_3 = new int[8000];
private final long[] arr_4 = new long[4];
private final static byte[] arr_5 = new byte[]{0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,16,16,16,16,16,16,16,16,24,24,24,24,24,24,24,24};
private final static byte[] arr_6 = new byte[]{0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7};
private final static byte[] arr_7 = new byte[]{-1,0,0,0,2,0,0,0,7,8,8,8,10,8,8,8,15,16,16,16,18,16,16,16,23,24,24,24,26,24,24,24};
private final static short[] arr_8 = new short[]{100,10,1,0,100,10,1,0,100,10,1,0,100,10,1,0};
public void core_1brc(int v0_ident, int[] v1_buf0, int v2_hash_mask, byte[] v3_map_exp, int[] v4_map_hash, long[] v5_map_data, byte[] v6_inp, int v7_inpOff) {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    int v8_off = 132;
    int v9_off = 1136;
    int v10_off = 2140;
    int v11_off = 3144;
    int v12_off = v7_inpOff;
    int v13_off = v7_inpOff + 32;
    int v14_off = v7_inpOff + 64;
    int v15_off = v7_inpOff + 96;
    int v16_i = 0;
    l1: {
      l0: while(true) {
        boolean v17 = v16_i < 83;
        if (!v17) break l1;
        ByteVector v18 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v12_off);
        ByteVector v19 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v20 = v18.compare(VectorOperators.EQ, v19);
        long v21 = v20.toLong();
        int v22 = (int) v21;
        ByteVector v23 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v13_off);
        ByteVector v24 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v25 = v23.compare(VectorOperators.EQ, v24);
        long v26 = v25.toLong();
        int v27 = (int) v26;
        ByteVector v28 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v14_off);
        ByteVector v29 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v30 = v28.compare(VectorOperators.EQ, v29);
        long v31 = v30.toLong();
        int v32 = (int) v31;
        ByteVector v33 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v15_off);
        ByteVector v34 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v35 = v33.compare(VectorOperators.EQ, v34);
        long v36 = v35.toLong();
        int v37 = (int) v36;
        int v38_m = v22;
        int v39_m = v27;
        int v40_m = v32;
        int v41_m = v37;
        int v42 = v38_m - 1;
        int v43_m2 = v38_m & v42;
        int v44 = Integer.numberOfTrailingZeros(v38_m);
        int v45 = v12_off + v44;
        v1_buf0[v8_off] = v45;
        v38_m = v43_m2;
        int v47 = v39_m - 1;
        int v48_m2 = v39_m & v47;
        int v49 = Integer.numberOfTrailingZeros(v39_m);
        int v50 = v13_off + v49;
        v1_buf0[v9_off] = v50;
        v39_m = v48_m2;
        int v52 = v40_m - 1;
        int v53_m2 = v40_m & v52;
        int v54 = Integer.numberOfTrailingZeros(v40_m);
        int v55 = v14_off + v54;
        v1_buf0[v10_off] = v55;
        v40_m = v53_m2;
        int v57 = v41_m - 1;
        int v58_m2 = v41_m & v57;
        int v59 = Integer.numberOfTrailingZeros(v41_m);
        int v60 = v15_off + v59;
        v1_buf0[v11_off] = v60;
        v41_m = v58_m2;
        int v62 = v38_m - 1;
        int v63_m2 = v38_m & v62;
        int v64 = Integer.numberOfTrailingZeros(v38_m);
        int v65 = v12_off + v64;
        int v66 = v8_off + 1;
        v1_buf0[v66] = v65;
        v38_m = v63_m2;
        int v68 = v39_m - 1;
        int v69_m2 = v39_m & v68;
        int v70 = Integer.numberOfTrailingZeros(v39_m);
        int v71 = v13_off + v70;
        int v72 = v9_off + 1;
        v1_buf0[v72] = v71;
        v39_m = v69_m2;
        int v74 = v40_m - 1;
        int v75_m2 = v40_m & v74;
        int v76 = Integer.numberOfTrailingZeros(v40_m);
        int v77 = v14_off + v76;
        int v78 = v10_off + 1;
        v1_buf0[v78] = v77;
        v40_m = v75_m2;
        int v80 = v41_m - 1;
        int v81_m2 = v41_m & v80;
        int v82 = Integer.numberOfTrailingZeros(v41_m);
        int v83 = v15_off + v82;
        int v84 = v11_off + 1;
        v1_buf0[v84] = v83;
        v41_m = v81_m2;
        int v86 = v38_m - 1;
        int v87_m2 = v38_m & v86;
        int v88 = Integer.numberOfTrailingZeros(v38_m);
        int v89 = v12_off + v88;
        int v90 = v8_off + 2;
        v1_buf0[v90] = v89;
        v38_m = v87_m2;
        int v92 = v39_m - 1;
        int v93_m2 = v39_m & v92;
        int v94 = Integer.numberOfTrailingZeros(v39_m);
        int v95 = v13_off + v94;
        int v96 = v9_off + 2;
        v1_buf0[v96] = v95;
        v39_m = v93_m2;
        int v98 = v40_m - 1;
        int v99_m2 = v40_m & v98;
        int v100 = Integer.numberOfTrailingZeros(v40_m);
        int v101 = v14_off + v100;
        int v102 = v10_off + 2;
        v1_buf0[v102] = v101;
        v40_m = v99_m2;
        int v104 = v41_m - 1;
        int v105_m2 = v41_m & v104;
        int v106 = Integer.numberOfTrailingZeros(v41_m);
        int v107 = v15_off + v106;
        int v108 = v11_off + 2;
        v1_buf0[v108] = v107;
        v41_m = v105_m2;
        int v110_pop = Integer.bitCount(v22);
        boolean v111 = v110_pop > 3;
        l4: {
          l2: {
            if (!v111) break l2;
            v8_off = v8_off + 3;
            l3: while(true) {
              int v112 = v38_m - 1;
              int v113_m2 = v38_m & v112;
              int v114 = Integer.numberOfTrailingZeros(v38_m);
              int v115 = v12_off + v114;
              v1_buf0[v8_off] = v115;
              v38_m = v113_m2;
              v8_off = v8_off + 1;
              boolean v117 = v38_m != 0;
              if (v117) continue l3;
              break;
            }
            if (1==1) break l4;
          }
          v8_off = v8_off + v110_pop;
        }
        v12_off = v12_off + 128;
        int v118_pop = Integer.bitCount(v27);
        boolean v119 = v118_pop > 3;
        l7: {
          l5: {
            if (!v119) break l5;
            v9_off = v9_off + 3;
            l6: while(true) {
              int v120 = v39_m - 1;
              int v121_m2 = v39_m & v120;
              int v122 = Integer.numberOfTrailingZeros(v39_m);
              int v123 = v13_off + v122;
              v1_buf0[v9_off] = v123;
              v39_m = v121_m2;
              v9_off = v9_off + 1;
              boolean v125 = v39_m != 0;
              if (v125) continue l6;
              break;
            }
            if (1==1) break l7;
          }
          v9_off = v9_off + v118_pop;
        }
        v13_off = v13_off + 128;
        int v126_pop = Integer.bitCount(v32);
        boolean v127 = v126_pop > 3;
        l10: {
          l8: {
            if (!v127) break l8;
            v10_off = v10_off + 3;
            l9: while(true) {
              int v128 = v40_m - 1;
              int v129_m2 = v40_m & v128;
              int v130 = Integer.numberOfTrailingZeros(v40_m);
              int v131 = v14_off + v130;
              v1_buf0[v10_off] = v131;
              v40_m = v129_m2;
              v10_off = v10_off + 1;
              boolean v133 = v40_m != 0;
              if (v133) continue l9;
              break;
            }
            if (1==1) break l10;
          }
          v10_off = v10_off + v126_pop;
        }
        v14_off = v14_off + 128;
        int v134_pop = Integer.bitCount(v37);
        boolean v135 = v134_pop > 3;
        l13: {
          l11: {
            if (!v135) break l11;
            v11_off = v11_off + 3;
            l12: while(true) {
              int v136 = v41_m - 1;
              int v137_m2 = v41_m & v136;
              int v138 = Integer.numberOfTrailingZeros(v41_m);
              int v139 = v15_off + v138;
              v1_buf0[v11_off] = v139;
              v41_m = v137_m2;
              v11_off = v11_off + 1;
              boolean v141 = v41_m != 0;
              if (v141) continue l12;
              break;
            }
            if (1==1) break l13;
          }
          v11_off = v11_off + v134_pop;
        }
        v15_off = v15_off + 128;
        v16_i = v16_i + 1;
        if (1==1) continue l0;
        break;
      }
    }
    int v142_off = 128;
    v1_buf0[v142_off] = v8_off;
    v1_buf0[v8_off] = 16;
    int v145 = v8_off + 1;
    v1_buf0[v145] = 16;
    int v147 = v8_off + 2;
    v1_buf0[v147] = 16;
    int v149 = v8_off + 3;
    v1_buf0[v149] = 16;
    int v151_off = 128;
    int v152 = v151_off + 1;
    v1_buf0[v152] = v9_off;
    v1_buf0[v9_off] = 16;
    int v155 = v9_off + 1;
    v1_buf0[v155] = 16;
    int v157 = v9_off + 2;
    v1_buf0[v157] = 16;
    int v159 = v9_off + 3;
    v1_buf0[v159] = 16;
    int v161_off = 128;
    int v162 = v161_off + 2;
    v1_buf0[v162] = v10_off;
    v1_buf0[v10_off] = 16;
    int v165 = v10_off + 1;
    v1_buf0[v165] = 16;
    int v167 = v10_off + 2;
    v1_buf0[v167] = 16;
    int v169 = v10_off + 3;
    v1_buf0[v169] = 16;
    int v171_off = 128;
    int v172 = v171_off + 3;
    v1_buf0[v172] = v11_off;
    v1_buf0[v11_off] = 16;
    int v175 = v11_off + 1;
    v1_buf0[v175] = 16;
    int v177 = v11_off + 2;
    v1_buf0[v177] = 16;
    int v179 = v11_off + 3;
    v1_buf0[v179] = 16;
    short[] v181_temp_buf = arr_1;
    byte[] v182_tail_mask = arr_2;
    int[] v183_failbuf = arr_3;
    int v184_failposS = 0;
    int v185_failposC = 0;
    int v186_i = 0;
    l15: {
      l14: while(true) {
        boolean v187 = v186_i < 4;
        if (!v187) break l15;
        int v188 = 1004 * v186_i;
        int v189_off = 132 + v188;
        int v190_off = 128;
        int v191 = v190_off + v186_i;
        int v192_off = v1_buf0[v191];
        int v193_retctr = 0;
        l16: {
          l18: {
            l17: while(true) {
              boolean v194 = v189_off < v192_off;
              if (!v194) break l18;
              IntVector v195_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_buf0, v189_off);
              int v196 = v195_idxs.lane(0);
              int v197 = 1 + v196;
              ByteVector v198 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v197);
              LongVector v199 = v198.reinterpretAsLongs();
              long v200 = v199.lane(0);
              int v201 = v195_idxs.lane(1);
              int v202 = 1 + v201;
              ByteVector v203 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v202);
              LongVector v204 = v203.reinterpretAsLongs();
              long v205 = v204.lane(0);
              int v206 = v195_idxs.lane(2);
              int v207 = 1 + v206;
              ByteVector v208 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v207);
              LongVector v209 = v208.reinterpretAsLongs();
              long v210 = v209.lane(0);
              int v211 = v195_idxs.lane(3);
              int v212 = 1 + v211;
              ByteVector v213 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v212);
              LongVector v214 = v213.reinterpretAsLongs();
              long v215 = v214.lane(0);
              long[] v216 = arr_4;
              v216[0] = v200;
              v216[1] = v205;
              v216[2] = v210;
              v216[3] = v215;
              LongVector v221 = (LongVector) LongVector.SPECIES_256.fromArray(v216, 0);
              ByteVector v222_nums = v221.reinterpretAsBytes();
              LongVector v223 = v222_nums.reinterpretAsLongs();
              LongVector v224 = (LongVector) LongVector.SPECIES_256.broadcast(0x00ffffffffffffffL);
              LongVector v225 = v223.and(v224);
              v222_nums = v225.reinterpretAsBytes();
              ByteVector v226 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
              VectorMask<?> v227 = v222_nums.compare(VectorOperators.EQ, v226);
              ByteVector v228 = (ByteVector) v227.toVector();
              IntVector v229 = v228.reinterpretAsInts();
              IntVector v230 = v229.lanewise(VectorOperators.ASHR, 23);
              ByteVector v231 = v230.reinterpretAsBytes();
              ByteVector v232 = (v231);
              LongVector v233 = v232.reinterpretAsLongs();
              LongVector v234 = (LongVector) LongVector.SPECIES_256.broadcast(3L);
              LongVector v235 = v233.and(v234);
              ByteVector v236_off = v235.reinterpretAsBytes();
              byte[] v237 = arr_5;
              ByteVector v238 = (ByteVector) ByteVector.SPECIES_256.fromArray(v237, 0);
              v236_off = v238.selectFrom(v236_off);
              byte[] v239 = arr_6;
              ByteVector v240 = (ByteVector) ByteVector.SPECIES_256.fromArray(v239, 0);
              v236_off = v236_off.or(v240);
              byte[] v241 = arr_7;
              ByteVector v242 = (ByteVector) ByteVector.SPECIES_256.fromArray(v241, 0);
              v236_off = v236_off.add(v242);
              ByteVector v243 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31);
              v236_off = v236_off.and(v243);
              ByteVector v244 = v236_off.selectFrom(v222_nums);
              ShortVector v245_aligned16 = v244.reinterpretAsShorts();
              ByteVector v246 = v245_aligned16.reinterpretAsBytes();
              ByteVector v247 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
              ByteVector v248 = v246.sub(v247);
              ShortVector v249 = v248.reinterpretAsShorts();
              ByteVector v250 = v249.reinterpretAsBytes();
              ByteVector v251 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
              ByteVector v252 = v250.max(v251);
              v245_aligned16 = v252.reinterpretAsShorts();
              short[] v253 = arr_8;
              ShortVector v254 = (ShortVector) ShortVector.SPECIES_256.fromArray(v253, 0);
              v245_aligned16 = v245_aligned16.mul(v254);
              LongVector v255 = v245_aligned16.reinterpretAsLongs();
              LongVector v256 = v255.lanewise(VectorOperators.LSHR, 32);
              ShortVector v257 = v256.reinterpretAsShorts();
              v245_aligned16 = v245_aligned16.add(v257);
              LongVector v258 = v245_aligned16.reinterpretAsLongs();
              LongVector v259 = v258.lanewise(VectorOperators.LSHR, 16);
              ShortVector v260 = v259.reinterpretAsShorts();
              v245_aligned16 = v245_aligned16.add(v260);
              ShortVector v261_each16 = v245_aligned16;
              ByteVector v262 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
              VectorMask<?> v263 = v222_nums.compare(VectorOperators.EQ, v262);
              ByteVector v264 = (ByteVector) v263.toVector();
              ShortVector v265 = v264.reinterpretAsShorts();
              ShortVector v266 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0);
              VectorMask<?> v267 = v265.compare(VectorOperators.NE, v266);
              ShortVector v268 = (ShortVector) v267.toVector();
              ByteVector v269 = v268.reinterpretAsBytes();
              ShortVector v270_neg = v269.reinterpretAsShorts();
              v261_each16 = v261_each16.lanewise(VectorOperators.XOR, v270_neg);
              v261_each16 = v261_each16.sub(v270_neg);
              v261_each16.intoArray(v181_temp_buf, 0);
              int v272 = v192_off - v189_off;
              int v273_i = 0;
              l20: {
                l19: while(true) {
                  boolean v274 = v273_i < 4;
                  if (!v274) break l20;
                  int v275 = v273_i * 1;
                  int v276 = v189_off + v275;
                  int v277_off = v1_buf0[v276];
                  int v278 = v277_off - 16;
                  ByteVector v279 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v278);
                  ByteVector v280 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                  VectorMask<?> v281 = v279.compare(VectorOperators.EQ, v280);
                  long v282 = v281.toLong();
                  short v283_mc = (short) v282;
                  int v284_c = 16;
                  boolean v285 = v283_mc != (short)0;
                  l21: {
                    if (!v285) break l21;
                    int v286 = (int) v283_mc;
                    int v287 = v286 & 65535;
                    int v288 = Integer.numberOfLeadingZeros(v287);
                    v284_c = v288 - 16;
                  }
                  ByteVector v289 = (ByteVector) ByteVector.SPECIES_128.fromArray(v182_tail_mask, v284_c);
                  ByteVector v290 = v279.and(v289);
                  IntVector v291_hv = v290.reinterpretAsInts();
                  LongVector v292 = v291_hv.reinterpretAsLongs();
                  long v293 = v292.lane(1);
                  LongVector v294 = (LongVector) LongVector.SPECIES_128.broadcast(v293);
                  IntVector v295 = v294.reinterpretAsInts();
                  v291_hv = v291_hv.lanewise(VectorOperators.XOR, v295);
                  LongVector v296 = v291_hv.reinterpretAsLongs();
                  LongVector v297 = v296.lanewise(VectorOperators.LSHR, 32);
                  IntVector v298 = v297.reinterpretAsInts();
                  v291_hv = v291_hv.lanewise(VectorOperators.XOR, v298);
                  IntVector v299 = (v291_hv);
                  IntVector v300 = v299.lanewise(VectorOperators.ASHR, 16);
                  IntVector v301 = (v300);
                  v291_hv = v291_hv.lanewise(VectorOperators.XOR, v301);
                  IntVector v302_hv = v291_hv;
                  boolean v303 = v275 >= v272;
                  l22: {
                    if (!v303) break l22;
                    if (1==1) break l16;
                  }
                  int v304_hash = v302_hv.lane(0);
                  int v305 = v304_hash & v2_hash_mask;
                  int v306_idx = (int) v305;
                  IntVector v307 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v306_idx);
                  IntVector v308 = (IntVector) IntVector.SPECIES_128.broadcast(v304_hash);
                  VectorMask<?> v309 = v308.compare(VectorOperators.EQ, v307);
                  long v310 = v309.toLong();
                  byte v311_m = (byte) v310;
                  boolean v312 = v311_m == (byte)0;
                  l24: {
                    l23: {
                      if (!v312) break l23;
                      int v313 = v189_off + v275;
                      int v314 = v1_buf0[v313];
                      v183_failbuf[v185_failposC] = v314;
                      int v316 = v185_failposC + 1;
                      int v317 = v275 * 4;
                      short v318 = v181_temp_buf[v317];
                      int v319 = (int) v318;
                      v183_failbuf[v316] = v319;
                      v185_failposC = v185_failposC + 2;
                      if (1==1) break l24;
                    }
                    int v321 = Integer.numberOfTrailingZeros(v311_m);
                    v306_idx = v306_idx + v321;
                    int v322 = v306_idx * 16;
                    ByteVector v323_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v322);
                    boolean v324 = v323_exp.equals(v290);
                    boolean v325 = !(v324);
                    l26: {
                      l25: {
                        if (!v325) break l25;
                        int v326 = v189_off + v275;
                        int v327 = v1_buf0[v326];
                        v183_failbuf[v185_failposC] = v327;
                        int v329 = v185_failposC + 1;
                        int v330 = v275 * 4;
                        short v331 = v181_temp_buf[v330];
                        int v332 = (int) v331;
                        v183_failbuf[v329] = v332;
                        v185_failposC = v185_failposC + 2;
                        if (1==1) break l26;
                      }
                      int v334_dataoff = v306_idx * 4;
                      int v335 = v275 * 4;
                      short v336 = v181_temp_buf[v335];
                      long v337_temp = (long) v336;
                      int v338 = v334_dataoff + 2;
                      long v339 = v5_map_data[v338];
                      long v340 = Math.min(v339, v337_temp);
                      v5_map_data[v338] = v340;
                      int v342 = v334_dataoff + 3;
                      long v343 = v5_map_data[v342];
                      long v344 = Math.max(v343, v337_temp);
                      v5_map_data[v342] = v344;
                      long v346 = v5_map_data[v334_dataoff];
                      long v347 = v346 + v337_temp;
                      v5_map_data[v334_dataoff] = v347;
                      int v349 = v334_dataoff + 1;
                      long v350 = v5_map_data[v349];
                      long v351 = v350 + 1L;
                      v5_map_data[v349] = v351;
                    }
                  }
                  v273_i = v273_i + 1;
                  if (1==1) continue l19;
                  break;
                }
              }
              v189_off = v189_off + 4;
              if (1==1) continue l17;
              break;
            }
          }
        }
        v186_i = v186_i + 1;
        if (1==1) continue l14;
        break;
      }
    }
    l28: {
      l27: while(true) {
        boolean v353 = v184_failposS < v185_failposC;
        if (!v353) break l28;
        int v354 = v183_failbuf[v184_failposS];
        int v355 = v184_failposS + 1;
        int v356 = v183_failbuf[v355];
        v184_failposS = v184_failposS + 2;
        int v357 = v354 - 16;
        ByteVector v358 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v357);
        ByteVector v359 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
        VectorMask<?> v360 = v358.compare(VectorOperators.EQ, v359);
        long v361 = v360.toLong();
        short v362_m = (short) v361;
        boolean v363 = v362_m == (short)0;
        l31: {
          l29: {
            if (!v363) break l29;
            int v364_start = v354;
            l30: while(true) {
              v364_start = v364_start - 16;
              int v365 = v364_start - 16;
              ByteVector v366 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v365);
              ByteVector v367 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
              VectorMask<?> v368 = v366.compare(VectorOperators.EQ, v367);
              long v369 = v368.toLong();
              v362_m = (short) v369;
              boolean v370 = v362_m == (short)0;
              if (v370) continue l30;
              break;
            }
            int v371 = (int) v362_m;
            int v372 = v371 & 65535;
            int v373 = Integer.numberOfLeadingZeros(v372);
            int v374 = v373 - 16;
            int v375 = v364_start - v374;
            main.Main.failed_long(v0_ident, v375, v354, v356);
            if (1==1) break l31;
          }
          int v377 = (int) v362_m;
          int v378 = v377 & 65535;
          int v379 = Integer.numberOfLeadingZeros(v378);
          int v380_c = v379 - 16;
          int v381 = v354 - v380_c;
          ByteVector v382 = (ByteVector) ByteVector.SPECIES_128.fromArray(v182_tail_mask, v380_c);
          ByteVector v383 = v358.and(v382);
          IntVector v384_hv = v383.reinterpretAsInts();
          LongVector v385 = v384_hv.reinterpretAsLongs();
          long v386 = v385.lane(1);
          LongVector v387 = (LongVector) LongVector.SPECIES_128.broadcast(v386);
          IntVector v388 = v387.reinterpretAsInts();
          v384_hv = v384_hv.lanewise(VectorOperators.XOR, v388);
          LongVector v389 = v384_hv.reinterpretAsLongs();
          LongVector v390 = v389.lanewise(VectorOperators.LSHR, 32);
          IntVector v391 = v390.reinterpretAsInts();
          v384_hv = v384_hv.lanewise(VectorOperators.XOR, v391);
          IntVector v392 = (v384_hv);
          IntVector v393 = v392.lanewise(VectorOperators.ASHR, 16);
          IntVector v394 = (v393);
          v384_hv = v384_hv.lanewise(VectorOperators.XOR, v394);
          int v395 = v384_hv.lane(0);
          main.Main.failed_short(v0_ident, v381, v354, v356, v395);
        }
        if (1==1) continue l27;
        break;
      }
    }
    return;
  }
}
public void minibench(byte[] v0_ai8, short[] v1_ai16, int[] v2_ai32, long[] v3_ai64) {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    int v4_i = 0;
    l1: {
      l0: while(true) {
        boolean v5 = v4_i < 1000;
        if (!v5) break l1;
        int v6 = v4_i * 16;
        ByteVector v7_v = (ByteVector) ByteVector.SPECIES_128.fromArray(v0_ai8, v6);
        v7_v.intoArray(v0_ai8, v6);
        v4_i = v4_i + 1;
        if (1==1) continue l0;
        break;
      }
    }
    return;
  }
}
// todo export
// todo export
// todo export
// todo export
// todo export

}
