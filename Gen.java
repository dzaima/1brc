package gen;
import jdk.incubator.vector.*;

public class Gen {

public int core_1brc_buf_elts() {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    return 4272;
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
private final int[] arr_1 = new int[4];
private final short[] arr_2 = new short[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
private final static byte[] arr_3 = new byte[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
private final int[] arr_4 = new int[8000];
private final long[] arr_5 = new long[4];
private final static byte[] arr_6 = new byte[]{0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,16,16,16,16,16,16,16,16,24,24,24,24,24,24,24,24};
private final static byte[] arr_7 = new byte[]{0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7};
private final static byte[] arr_8 = new byte[]{-1,0,0,0,2,0,0,0,7,8,8,8,10,8,8,8,15,16,16,16,18,16,16,16,23,24,24,24,26,24,24,24};
private final static short[] arr_9 = new short[]{100,10,1,0,100,10,1,0,100,10,1,0,100,10,1,0};
public void core_1brc(int v0_ident, int[] v1_buf0, int v2_hash_mask, byte[] v3_map_exp, int[] v4_map_hash, long[] v5_map_data, byte[] v6_inp, int v7_inpOff) {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    int v8_off = 128;
    int v9_off = 1132;
    int v10_off = 2136;
    int v11_off = 3140;
    int[] v12_bufEnds = arr_1;
    int v13_off = v7_inpOff;
    int v14_off = v7_inpOff + 32;
    int v15_off = v7_inpOff + 64;
    int v16_off = v7_inpOff + 96;
    int v17_i = 0;
    l1: {
      l0: while(true) {
        boolean v18 = v17_i < 83;
        if (!v18) break l1;
        ByteVector v19 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v13_off);
        ByteVector v20 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v21 = v19.compare(VectorOperators.EQ, v20);
        long v22 = v21.toLong();
        int v23 = (int) v22;
        ByteVector v24 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v14_off);
        ByteVector v25 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v26 = v24.compare(VectorOperators.EQ, v25);
        long v27 = v26.toLong();
        int v28 = (int) v27;
        ByteVector v29 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v15_off);
        ByteVector v30 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v31 = v29.compare(VectorOperators.EQ, v30);
        long v32 = v31.toLong();
        int v33 = (int) v32;
        ByteVector v34 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v16_off);
        ByteVector v35 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v36 = v34.compare(VectorOperators.EQ, v35);
        long v37 = v36.toLong();
        int v38 = (int) v37;
        int v39_m = v23;
        int v40_m = v28;
        int v41_m = v33;
        int v42_m = v38;
        int v43 = v39_m - 1;
        int v44_m2 = v39_m & v43;
        int v45 = Integer.numberOfTrailingZeros(v39_m);
        int v46 = v13_off + v45;
        v1_buf0[v8_off] = v46;
        v39_m = v44_m2;
        int v48 = v40_m - 1;
        int v49_m2 = v40_m & v48;
        int v50 = Integer.numberOfTrailingZeros(v40_m);
        int v51 = v14_off + v50;
        v1_buf0[v9_off] = v51;
        v40_m = v49_m2;
        int v53 = v41_m - 1;
        int v54_m2 = v41_m & v53;
        int v55 = Integer.numberOfTrailingZeros(v41_m);
        int v56 = v15_off + v55;
        v1_buf0[v10_off] = v56;
        v41_m = v54_m2;
        int v58 = v42_m - 1;
        int v59_m2 = v42_m & v58;
        int v60 = Integer.numberOfTrailingZeros(v42_m);
        int v61 = v16_off + v60;
        v1_buf0[v11_off] = v61;
        v42_m = v59_m2;
        int v63 = v39_m - 1;
        int v64_m2 = v39_m & v63;
        int v65 = Integer.numberOfTrailingZeros(v39_m);
        int v66 = v13_off + v65;
        int v67 = v8_off + 1;
        v1_buf0[v67] = v66;
        v39_m = v64_m2;
        int v69 = v40_m - 1;
        int v70_m2 = v40_m & v69;
        int v71 = Integer.numberOfTrailingZeros(v40_m);
        int v72 = v14_off + v71;
        int v73 = v9_off + 1;
        v1_buf0[v73] = v72;
        v40_m = v70_m2;
        int v75 = v41_m - 1;
        int v76_m2 = v41_m & v75;
        int v77 = Integer.numberOfTrailingZeros(v41_m);
        int v78 = v15_off + v77;
        int v79 = v10_off + 1;
        v1_buf0[v79] = v78;
        v41_m = v76_m2;
        int v81 = v42_m - 1;
        int v82_m2 = v42_m & v81;
        int v83 = Integer.numberOfTrailingZeros(v42_m);
        int v84 = v16_off + v83;
        int v85 = v11_off + 1;
        v1_buf0[v85] = v84;
        v42_m = v82_m2;
        int v87 = v39_m - 1;
        int v88_m2 = v39_m & v87;
        int v89 = Integer.numberOfTrailingZeros(v39_m);
        int v90 = v13_off + v89;
        int v91 = v8_off + 2;
        v1_buf0[v91] = v90;
        v39_m = v88_m2;
        int v93 = v40_m - 1;
        int v94_m2 = v40_m & v93;
        int v95 = Integer.numberOfTrailingZeros(v40_m);
        int v96 = v14_off + v95;
        int v97 = v9_off + 2;
        v1_buf0[v97] = v96;
        v40_m = v94_m2;
        int v99 = v41_m - 1;
        int v100_m2 = v41_m & v99;
        int v101 = Integer.numberOfTrailingZeros(v41_m);
        int v102 = v15_off + v101;
        int v103 = v10_off + 2;
        v1_buf0[v103] = v102;
        v41_m = v100_m2;
        int v105 = v42_m - 1;
        int v106_m2 = v42_m & v105;
        int v107 = Integer.numberOfTrailingZeros(v42_m);
        int v108 = v16_off + v107;
        int v109 = v11_off + 2;
        v1_buf0[v109] = v108;
        v42_m = v106_m2;
        int v111_pop = Integer.bitCount(v23);
        boolean v112 = v111_pop > 3;
        l4: {
          l2: {
            if (!v112) break l2;
            v8_off = v8_off + 3;
            l3: while(true) {
              int v113 = v39_m - 1;
              int v114_m2 = v39_m & v113;
              int v115 = Integer.numberOfTrailingZeros(v39_m);
              int v116 = v13_off + v115;
              v1_buf0[v8_off] = v116;
              v39_m = v114_m2;
              v8_off = v8_off + 1;
              boolean v118 = v39_m != 0;
              if (v118) continue l3;
              break;
            }
            if (1==1) break l4;
          }
          v8_off = v8_off + v111_pop;
        }
        v13_off = v13_off + 128;
        int v119_pop = Integer.bitCount(v28);
        boolean v120 = v119_pop > 3;
        l7: {
          l5: {
            if (!v120) break l5;
            v9_off = v9_off + 3;
            l6: while(true) {
              int v121 = v40_m - 1;
              int v122_m2 = v40_m & v121;
              int v123 = Integer.numberOfTrailingZeros(v40_m);
              int v124 = v14_off + v123;
              v1_buf0[v9_off] = v124;
              v40_m = v122_m2;
              v9_off = v9_off + 1;
              boolean v126 = v40_m != 0;
              if (v126) continue l6;
              break;
            }
            if (1==1) break l7;
          }
          v9_off = v9_off + v119_pop;
        }
        v14_off = v14_off + 128;
        int v127_pop = Integer.bitCount(v33);
        boolean v128 = v127_pop > 3;
        l10: {
          l8: {
            if (!v128) break l8;
            v10_off = v10_off + 3;
            l9: while(true) {
              int v129 = v41_m - 1;
              int v130_m2 = v41_m & v129;
              int v131 = Integer.numberOfTrailingZeros(v41_m);
              int v132 = v15_off + v131;
              v1_buf0[v10_off] = v132;
              v41_m = v130_m2;
              v10_off = v10_off + 1;
              boolean v134 = v41_m != 0;
              if (v134) continue l9;
              break;
            }
            if (1==1) break l10;
          }
          v10_off = v10_off + v127_pop;
        }
        v15_off = v15_off + 128;
        int v135_pop = Integer.bitCount(v38);
        boolean v136 = v135_pop > 3;
        l13: {
          l11: {
            if (!v136) break l11;
            v11_off = v11_off + 3;
            l12: while(true) {
              int v137 = v42_m - 1;
              int v138_m2 = v42_m & v137;
              int v139 = Integer.numberOfTrailingZeros(v42_m);
              int v140 = v16_off + v139;
              v1_buf0[v11_off] = v140;
              v42_m = v138_m2;
              v11_off = v11_off + 1;
              boolean v142 = v42_m != 0;
              if (v142) continue l12;
              break;
            }
            if (1==1) break l13;
          }
          v11_off = v11_off + v135_pop;
        }
        v16_off = v16_off + 128;
        v17_i = v17_i + 1;
        if (1==1) continue l0;
        break;
      }
    }
    v12_bufEnds[0] = v8_off;
    v1_buf0[v8_off] = 16;
    int v145 = v8_off + 1;
    v1_buf0[v145] = 16;
    int v147 = v8_off + 2;
    v1_buf0[v147] = 16;
    int v149 = v8_off + 3;
    v1_buf0[v149] = 16;
    v12_bufEnds[1] = v9_off;
    v1_buf0[v9_off] = 16;
    int v153 = v9_off + 1;
    v1_buf0[v153] = 16;
    int v155 = v9_off + 2;
    v1_buf0[v155] = 16;
    int v157 = v9_off + 3;
    v1_buf0[v157] = 16;
    v12_bufEnds[2] = v10_off;
    v1_buf0[v10_off] = 16;
    int v161 = v10_off + 1;
    v1_buf0[v161] = 16;
    int v163 = v10_off + 2;
    v1_buf0[v163] = 16;
    int v165 = v10_off + 3;
    v1_buf0[v165] = 16;
    v12_bufEnds[3] = v11_off;
    v1_buf0[v11_off] = 16;
    int v169 = v11_off + 1;
    v1_buf0[v169] = 16;
    int v171 = v11_off + 2;
    v1_buf0[v171] = 16;
    int v173 = v11_off + 3;
    v1_buf0[v173] = 16;
    short[] v175_temp_buf = arr_2;
    byte[] v176_tail_mask = arr_3;
    int[] v177_failbuf = arr_4;
    int v178_failposS = 0;
    int v179_failposC = 0;
    int v180_i = 0;
    l15: {
      l14: while(true) {
        boolean v181 = v180_i < 4;
        if (!v181) break l15;
        int v182 = 1004 * v180_i;
        int v183_off = 128 + v182;
        int v184_off = v12_bufEnds[v180_i];
        int v185_retctr = 0;
        l16: {
          l18: {
            l17: while(true) {
              boolean v186 = v183_off < v184_off;
              if (!v186) break l18;
              IntVector v187_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_buf0, v183_off);
              int v188 = v187_idxs.lane(0);
              int v189 = 1 + v188;
              ByteVector v190 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v189);
              LongVector v191 = v190.reinterpretAsLongs();
              long v192 = v191.lane(0);
              int v193 = v187_idxs.lane(1);
              int v194 = 1 + v193;
              ByteVector v195 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v194);
              LongVector v196 = v195.reinterpretAsLongs();
              long v197 = v196.lane(0);
              int v198 = v187_idxs.lane(2);
              int v199 = 1 + v198;
              ByteVector v200 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v199);
              LongVector v201 = v200.reinterpretAsLongs();
              long v202 = v201.lane(0);
              int v203 = v187_idxs.lane(3);
              int v204 = 1 + v203;
              ByteVector v205 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v204);
              LongVector v206 = v205.reinterpretAsLongs();
              long v207 = v206.lane(0);
              long[] v208 = arr_5;
              v208[0] = v192;
              v208[1] = v197;
              v208[2] = v202;
              v208[3] = v207;
              LongVector v213 = (LongVector) LongVector.SPECIES_256.fromArray(v208, 0);
              ByteVector v214_nums = v213.reinterpretAsBytes();
              LongVector v215 = v214_nums.reinterpretAsLongs();
              LongVector v216 = (LongVector) LongVector.SPECIES_256.broadcast(0x00ffffffffffffffL);
              LongVector v217 = v215.and(v216);
              v214_nums = v217.reinterpretAsBytes();
              ByteVector v218 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
              VectorMask<?> v219 = v214_nums.compare(VectorOperators.EQ, v218);
              ByteVector v220 = (ByteVector) v219.toVector();
              IntVector v221 = v220.reinterpretAsInts();
              IntVector v222 = v221.lanewise(VectorOperators.ASHR, 23);
              ByteVector v223 = v222.reinterpretAsBytes();
              ByteVector v224 = (v223);
              LongVector v225 = v224.reinterpretAsLongs();
              LongVector v226 = (LongVector) LongVector.SPECIES_256.broadcast(3L);
              LongVector v227 = v225.and(v226);
              ByteVector v228_off = v227.reinterpretAsBytes();
              byte[] v229 = arr_6;
              ByteVector v230 = (ByteVector) ByteVector.SPECIES_256.fromArray(v229, 0);
              v228_off = v230.selectFrom(v228_off);
              byte[] v231 = arr_7;
              ByteVector v232 = (ByteVector) ByteVector.SPECIES_256.fromArray(v231, 0);
              v228_off = v228_off.or(v232);
              byte[] v233 = arr_8;
              ByteVector v234 = (ByteVector) ByteVector.SPECIES_256.fromArray(v233, 0);
              v228_off = v228_off.add(v234);
              ByteVector v235 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31);
              v228_off = v228_off.and(v235);
              ByteVector v236 = v228_off.selectFrom(v214_nums);
              ShortVector v237_aligned16 = v236.reinterpretAsShorts();
              ByteVector v238 = v237_aligned16.reinterpretAsBytes();
              ByteVector v239 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
              ByteVector v240 = v238.sub(v239);
              ShortVector v241 = v240.reinterpretAsShorts();
              ByteVector v242 = v241.reinterpretAsBytes();
              ByteVector v243 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
              ByteVector v244 = v242.max(v243);
              v237_aligned16 = v244.reinterpretAsShorts();
              short[] v245 = arr_9;
              ShortVector v246 = (ShortVector) ShortVector.SPECIES_256.fromArray(v245, 0);
              v237_aligned16 = v237_aligned16.mul(v246);
              LongVector v247 = v237_aligned16.reinterpretAsLongs();
              LongVector v248 = v247.lanewise(VectorOperators.LSHR, 32);
              ShortVector v249 = v248.reinterpretAsShorts();
              v237_aligned16 = v237_aligned16.add(v249);
              LongVector v250 = v237_aligned16.reinterpretAsLongs();
              LongVector v251 = v250.lanewise(VectorOperators.LSHR, 16);
              ShortVector v252 = v251.reinterpretAsShorts();
              v237_aligned16 = v237_aligned16.add(v252);
              ShortVector v253_each16 = v237_aligned16;
              ByteVector v254 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
              VectorMask<?> v255 = v214_nums.compare(VectorOperators.EQ, v254);
              ByteVector v256 = (ByteVector) v255.toVector();
              ShortVector v257 = v256.reinterpretAsShorts();
              ShortVector v258 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0);
              VectorMask<?> v259 = v257.compare(VectorOperators.NE, v258);
              ShortVector v260 = (ShortVector) v259.toVector();
              ByteVector v261 = v260.reinterpretAsBytes();
              ShortVector v262_neg = v261.reinterpretAsShorts();
              v253_each16 = v253_each16.lanewise(VectorOperators.XOR, v262_neg);
              v253_each16 = v253_each16.sub(v262_neg);
              v253_each16.intoArray(v175_temp_buf, 0);
              int v264 = v184_off - v183_off;
              int v265_i = 0;
              l20: {
                l19: while(true) {
                  boolean v266 = v265_i < 4;
                  if (!v266) break l20;
                  int v267 = v265_i * 1;
                  int v268 = v183_off + v267;
                  int v269_off = v1_buf0[v268];
                  int v270 = v269_off - 16;
                  ByteVector v271 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v270);
                  ByteVector v272 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                  VectorMask<?> v273 = v271.compare(VectorOperators.EQ, v272);
                  long v274 = v273.toLong();
                  short v275_mc = (short) v274;
                  int v276_c = 16;
                  boolean v277 = v275_mc != (short)0;
                  l21: {
                    if (!v277) break l21;
                    int v278 = (int) v275_mc;
                    int v279 = v278 & 65535;
                    int v280 = Integer.numberOfLeadingZeros(v279);
                    v276_c = v280 - 16;
                  }
                  ByteVector v281 = (ByteVector) ByteVector.SPECIES_128.fromArray(v176_tail_mask, v276_c);
                  ByteVector v282 = v271.and(v281);
                  IntVector v283_hv = v282.reinterpretAsInts();
                  LongVector v284 = v283_hv.reinterpretAsLongs();
                  long v285 = v284.lane(1);
                  LongVector v286 = (LongVector) LongVector.SPECIES_128.broadcast(v285);
                  IntVector v287 = v286.reinterpretAsInts();
                  v283_hv = v283_hv.lanewise(VectorOperators.XOR, v287);
                  LongVector v288 = v283_hv.reinterpretAsLongs();
                  LongVector v289 = v288.lanewise(VectorOperators.LSHR, 32);
                  IntVector v290 = v289.reinterpretAsInts();
                  v283_hv = v283_hv.lanewise(VectorOperators.XOR, v290);
                  IntVector v291 = (v283_hv);
                  IntVector v292 = v291.lanewise(VectorOperators.ASHR, 16);
                  IntVector v293 = (v292);
                  v283_hv = v283_hv.lanewise(VectorOperators.XOR, v293);
                  IntVector v294_hv = v283_hv;
                  boolean v295 = v267 >= v264;
                  l22: {
                    if (!v295) break l22;
                    if (1==1) break l16;
                  }
                  int v296_hash = v294_hv.lane(0);
                  int v297 = v296_hash & v2_hash_mask;
                  int v298_idx = (int) v297;
                  IntVector v299 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v298_idx);
                  IntVector v300 = (IntVector) IntVector.SPECIES_128.broadcast(v296_hash);
                  VectorMask<?> v301 = v300.compare(VectorOperators.EQ, v299);
                  long v302 = v301.toLong();
                  byte v303_m = (byte) v302;
                  boolean v304 = v303_m == (byte)0;
                  l24: {
                    l23: {
                      if (!v304) break l23;
                      int v305 = v183_off + v267;
                      int v306 = v1_buf0[v305];
                      v177_failbuf[v179_failposC] = v306;
                      int v308 = v179_failposC + 1;
                      int v309 = v267 * 4;
                      short v310 = v175_temp_buf[v309];
                      int v311 = (int) v310;
                      v177_failbuf[v308] = v311;
                      v179_failposC = v179_failposC + 2;
                      if (1==1) break l24;
                    }
                    int v313 = Integer.numberOfTrailingZeros(v303_m);
                    v298_idx = v298_idx + v313;
                    int v314 = v298_idx * 16;
                    ByteVector v315_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v314);
                    boolean v316 = v315_exp.equals(v282);
                    boolean v317 = !(v316);
                    l26: {
                      l25: {
                        if (!v317) break l25;
                        int v318 = v183_off + v267;
                        int v319 = v1_buf0[v318];
                        v177_failbuf[v179_failposC] = v319;
                        int v321 = v179_failposC + 1;
                        int v322 = v267 * 4;
                        short v323 = v175_temp_buf[v322];
                        int v324 = (int) v323;
                        v177_failbuf[v321] = v324;
                        v179_failposC = v179_failposC + 2;
                        if (1==1) break l26;
                      }
                      int v326_dataoff = v298_idx * 4;
                      int v327 = v267 * 4;
                      short v328 = v175_temp_buf[v327];
                      long v329_temp = (long) v328;
                      int v330 = v326_dataoff + 2;
                      long v331 = v5_map_data[v330];
                      long v332 = Math.min(v331, v329_temp);
                      v5_map_data[v330] = v332;
                      int v334 = v326_dataoff + 3;
                      long v335 = v5_map_data[v334];
                      long v336 = Math.max(v335, v329_temp);
                      v5_map_data[v334] = v336;
                      long v338 = v5_map_data[v326_dataoff];
                      long v339 = v338 + v329_temp;
                      v5_map_data[v326_dataoff] = v339;
                      int v341 = v326_dataoff + 1;
                      long v342 = v5_map_data[v341];
                      long v343 = v342 + 1L;
                      v5_map_data[v341] = v343;
                    }
                  }
                  v265_i = v265_i + 1;
                  if (1==1) continue l19;
                  break;
                }
              }
              v183_off = v183_off + 4;
              if (1==1) continue l17;
              break;
            }
          }
        }
        v180_i = v180_i + 1;
        if (1==1) continue l14;
        break;
      }
    }
    l28: {
      l27: while(true) {
        boolean v345 = v178_failposS < v179_failposC;
        if (!v345) break l28;
        int v346 = v177_failbuf[v178_failposS];
        int v347 = v178_failposS + 1;
        int v348 = v177_failbuf[v347];
        v178_failposS = v178_failposS + 2;
        int v349 = v346 - 16;
        ByteVector v350 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v349);
        ByteVector v351 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
        VectorMask<?> v352 = v350.compare(VectorOperators.EQ, v351);
        long v353 = v352.toLong();
        short v354_m = (short) v353;
        boolean v355 = v354_m == (short)0;
        l31: {
          l29: {
            if (!v355) break l29;
            int v356_start = v346;
            l30: while(true) {
              v356_start = v356_start - 16;
              int v357 = v356_start - 16;
              ByteVector v358 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v357);
              ByteVector v359 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
              VectorMask<?> v360 = v358.compare(VectorOperators.EQ, v359);
              long v361 = v360.toLong();
              v354_m = (short) v361;
              boolean v362 = v354_m == (short)0;
              if (v362) continue l30;
              break;
            }
            int v363 = (int) v354_m;
            int v364 = v363 & 65535;
            int v365 = Integer.numberOfLeadingZeros(v364);
            int v366 = v365 - 16;
            int v367 = v356_start - v366;
            main.Main.failed_long(v0_ident, v367, v346, v348);
            if (1==1) break l31;
          }
          int v369 = (int) v354_m;
          int v370 = v369 & 65535;
          int v371 = Integer.numberOfLeadingZeros(v370);
          int v372_c = v371 - 16;
          int v373 = v346 - v372_c;
          ByteVector v374 = (ByteVector) ByteVector.SPECIES_128.fromArray(v176_tail_mask, v372_c);
          ByteVector v375 = v350.and(v374);
          IntVector v376_hv = v375.reinterpretAsInts();
          LongVector v377 = v376_hv.reinterpretAsLongs();
          long v378 = v377.lane(1);
          LongVector v379 = (LongVector) LongVector.SPECIES_128.broadcast(v378);
          IntVector v380 = v379.reinterpretAsInts();
          v376_hv = v376_hv.lanewise(VectorOperators.XOR, v380);
          LongVector v381 = v376_hv.reinterpretAsLongs();
          LongVector v382 = v381.lanewise(VectorOperators.LSHR, 32);
          IntVector v383 = v382.reinterpretAsInts();
          v376_hv = v376_hv.lanewise(VectorOperators.XOR, v383);
          IntVector v384 = (v376_hv);
          IntVector v385 = v384.lanewise(VectorOperators.ASHR, 16);
          IntVector v386 = (v385);
          v376_hv = v376_hv.lanewise(VectorOperators.XOR, v386);
          int v387 = v376_hv.lane(0);
          main.Main.failed_short(v0_ident, v373, v346, v348, v387);
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
