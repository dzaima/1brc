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
private final long[] arr_3 = new long[4];
private final static byte[] arr_4 = new byte[]{0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,16,16,16,16,16,16,16,16,24,24,24,24,24,24,24,24};
private final static byte[] arr_5 = new byte[]{0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7};
private final static byte[] arr_6 = new byte[]{-1,0,0,0,2,0,0,0,7,8,8,8,10,8,8,8,15,16,16,16,18,16,16,16,23,24,24,24,26,24,24,24};
private final static short[] arr_7 = new short[]{100,10,1,0,100,10,1,0,100,10,1,0,100,10,1,0};
public void core_1brc(int v0_ident, int[] v1_buf0, int v2_hash_mask, byte[] v3_map_exp, int[] v4_map_hash, long[] v5_map_data, byte[] v6_inp, int v7_inpOff) {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    int v8_off = 132;
    int v9_off = 1136;
    int v10_off = 2140;
    int v11_off = 3144;
    int v12_off = 4148;
    int v13_off = v12_off;
    int v14_off = v7_inpOff;
    int v15_off = v7_inpOff + 32;
    int v16_off = v7_inpOff + 64;
    int v17_off = v7_inpOff + 96;
    int v18_i = 0;
    l1: {
      l0: while(true) {
        boolean v19 = v18_i < 83;
        if (!v19) break l1;
        ByteVector v20 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v14_off);
        ByteVector v21 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v22 = v20.compare(VectorOperators.EQ, v21);
        long v23 = v22.toLong();
        int v24 = (int) v23;
        ByteVector v25 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v15_off);
        ByteVector v26 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v27 = v25.compare(VectorOperators.EQ, v26);
        long v28 = v27.toLong();
        int v29 = (int) v28;
        ByteVector v30 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v16_off);
        ByteVector v31 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v32 = v30.compare(VectorOperators.EQ, v31);
        long v33 = v32.toLong();
        int v34 = (int) v33;
        ByteVector v35 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v17_off);
        ByteVector v36 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
        VectorMask<?> v37 = v35.compare(VectorOperators.EQ, v36);
        long v38 = v37.toLong();
        int v39 = (int) v38;
        int v40_m = v24;
        int v41_m = v29;
        int v42_m = v34;
        int v43_m = v39;
        int v44 = v40_m - 1;
        int v45_m2 = v40_m & v44;
        int v46 = Integer.numberOfTrailingZeros(v40_m);
        int v47 = v14_off + v46;
        v1_buf0[v8_off] = v47;
        v40_m = v45_m2;
        int v49 = v41_m - 1;
        int v50_m2 = v41_m & v49;
        int v51 = Integer.numberOfTrailingZeros(v41_m);
        int v52 = v15_off + v51;
        v1_buf0[v9_off] = v52;
        v41_m = v50_m2;
        int v54 = v42_m - 1;
        int v55_m2 = v42_m & v54;
        int v56 = Integer.numberOfTrailingZeros(v42_m);
        int v57 = v16_off + v56;
        v1_buf0[v10_off] = v57;
        v42_m = v55_m2;
        int v59 = v43_m - 1;
        int v60_m2 = v43_m & v59;
        int v61 = Integer.numberOfTrailingZeros(v43_m);
        int v62 = v17_off + v61;
        v1_buf0[v11_off] = v62;
        v43_m = v60_m2;
        int v64 = v40_m - 1;
        int v65_m2 = v40_m & v64;
        int v66 = Integer.numberOfTrailingZeros(v40_m);
        int v67 = v14_off + v66;
        int v68 = v8_off + 1;
        v1_buf0[v68] = v67;
        v40_m = v65_m2;
        int v70 = v41_m - 1;
        int v71_m2 = v41_m & v70;
        int v72 = Integer.numberOfTrailingZeros(v41_m);
        int v73 = v15_off + v72;
        int v74 = v9_off + 1;
        v1_buf0[v74] = v73;
        v41_m = v71_m2;
        int v76 = v42_m - 1;
        int v77_m2 = v42_m & v76;
        int v78 = Integer.numberOfTrailingZeros(v42_m);
        int v79 = v16_off + v78;
        int v80 = v10_off + 1;
        v1_buf0[v80] = v79;
        v42_m = v77_m2;
        int v82 = v43_m - 1;
        int v83_m2 = v43_m & v82;
        int v84 = Integer.numberOfTrailingZeros(v43_m);
        int v85 = v17_off + v84;
        int v86 = v11_off + 1;
        v1_buf0[v86] = v85;
        v43_m = v83_m2;
        int v88 = v40_m - 1;
        int v89_m2 = v40_m & v88;
        int v90 = Integer.numberOfTrailingZeros(v40_m);
        int v91 = v14_off + v90;
        int v92 = v8_off + 2;
        v1_buf0[v92] = v91;
        v40_m = v89_m2;
        int v94 = v41_m - 1;
        int v95_m2 = v41_m & v94;
        int v96 = Integer.numberOfTrailingZeros(v41_m);
        int v97 = v15_off + v96;
        int v98 = v9_off + 2;
        v1_buf0[v98] = v97;
        v41_m = v95_m2;
        int v100 = v42_m - 1;
        int v101_m2 = v42_m & v100;
        int v102 = Integer.numberOfTrailingZeros(v42_m);
        int v103 = v16_off + v102;
        int v104 = v10_off + 2;
        v1_buf0[v104] = v103;
        v42_m = v101_m2;
        int v106 = v43_m - 1;
        int v107_m2 = v43_m & v106;
        int v108 = Integer.numberOfTrailingZeros(v43_m);
        int v109 = v17_off + v108;
        int v110 = v11_off + 2;
        v1_buf0[v110] = v109;
        v43_m = v107_m2;
        int v112_pop = Integer.bitCount(v24);
        boolean v113 = v112_pop > 3;
        l4: {
          l2: {
            if (!v113) break l2;
            v8_off = v8_off + 3;
            l3: while(true) {
              int v114 = v40_m - 1;
              int v115_m2 = v40_m & v114;
              int v116 = Integer.numberOfTrailingZeros(v40_m);
              int v117 = v14_off + v116;
              v1_buf0[v8_off] = v117;
              v40_m = v115_m2;
              v8_off = v8_off + 1;
              boolean v119 = v40_m != 0;
              if (v119) continue l3;
              break;
            }
            if (1==1) break l4;
          }
          v8_off = v8_off + v112_pop;
        }
        v14_off = v14_off + 128;
        int v120_pop = Integer.bitCount(v29);
        boolean v121 = v120_pop > 3;
        l7: {
          l5: {
            if (!v121) break l5;
            v9_off = v9_off + 3;
            l6: while(true) {
              int v122 = v41_m - 1;
              int v123_m2 = v41_m & v122;
              int v124 = Integer.numberOfTrailingZeros(v41_m);
              int v125 = v15_off + v124;
              v1_buf0[v9_off] = v125;
              v41_m = v123_m2;
              v9_off = v9_off + 1;
              boolean v127 = v41_m != 0;
              if (v127) continue l6;
              break;
            }
            if (1==1) break l7;
          }
          v9_off = v9_off + v120_pop;
        }
        v15_off = v15_off + 128;
        int v128_pop = Integer.bitCount(v34);
        boolean v129 = v128_pop > 3;
        l10: {
          l8: {
            if (!v129) break l8;
            v10_off = v10_off + 3;
            l9: while(true) {
              int v130 = v42_m - 1;
              int v131_m2 = v42_m & v130;
              int v132 = Integer.numberOfTrailingZeros(v42_m);
              int v133 = v16_off + v132;
              v1_buf0[v10_off] = v133;
              v42_m = v131_m2;
              v10_off = v10_off + 1;
              boolean v135 = v42_m != 0;
              if (v135) continue l9;
              break;
            }
            if (1==1) break l10;
          }
          v10_off = v10_off + v128_pop;
        }
        v16_off = v16_off + 128;
        int v136_pop = Integer.bitCount(v39);
        boolean v137 = v136_pop > 3;
        l13: {
          l11: {
            if (!v137) break l11;
            v11_off = v11_off + 3;
            l12: while(true) {
              int v138 = v43_m - 1;
              int v139_m2 = v43_m & v138;
              int v140 = Integer.numberOfTrailingZeros(v43_m);
              int v141 = v17_off + v140;
              v1_buf0[v11_off] = v141;
              v43_m = v139_m2;
              v11_off = v11_off + 1;
              boolean v143 = v43_m != 0;
              if (v143) continue l12;
              break;
            }
            if (1==1) break l13;
          }
          v11_off = v11_off + v136_pop;
        }
        v17_off = v17_off + 128;
        v18_i = v18_i + 1;
        if (1==1) continue l0;
        break;
      }
    }
    int v144_off = 128;
    v1_buf0[v144_off] = v8_off;
    v1_buf0[v8_off] = 16;
    int v147 = v8_off + 1;
    v1_buf0[v147] = 16;
    int v149 = v8_off + 2;
    v1_buf0[v149] = 16;
    int v151 = v8_off + 3;
    v1_buf0[v151] = 16;
    int v153_off = 128;
    int v154 = v153_off + 1;
    v1_buf0[v154] = v9_off;
    v1_buf0[v9_off] = 16;
    int v157 = v9_off + 1;
    v1_buf0[v157] = 16;
    int v159 = v9_off + 2;
    v1_buf0[v159] = 16;
    int v161 = v9_off + 3;
    v1_buf0[v161] = 16;
    int v163_off = 128;
    int v164 = v163_off + 2;
    v1_buf0[v164] = v10_off;
    v1_buf0[v10_off] = 16;
    int v167 = v10_off + 1;
    v1_buf0[v167] = 16;
    int v169 = v10_off + 2;
    v1_buf0[v169] = 16;
    int v171 = v10_off + 3;
    v1_buf0[v171] = 16;
    int v173_off = 128;
    int v174 = v173_off + 3;
    v1_buf0[v174] = v11_off;
    v1_buf0[v11_off] = 16;
    int v177 = v11_off + 1;
    v1_buf0[v177] = 16;
    int v179 = v11_off + 2;
    v1_buf0[v179] = 16;
    int v181 = v11_off + 3;
    v1_buf0[v181] = 16;
    short[] v183_temp_buf = arr_1;
    byte[] v184_tail_mask = arr_2;
    int v185_i = 0;
    l15: {
      l14: while(true) {
        boolean v186 = v185_i < 4;
        if (!v186) break l15;
        int v187 = 1004 * v185_i;
        int v188_off = 132 + v187;
        int v189_off = 128;
        int v190 = v189_off + v185_i;
        int v191_off = v1_buf0[v190];
        int v192_retctr = 0;
        l16: {
          l18: {
            l17: while(true) {
              boolean v193 = v188_off < v191_off;
              if (!v193) break l18;
              IntVector v194_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_buf0, v188_off);
              int v195 = v194_idxs.lane(0);
              int v196 = 1 + v195;
              ByteVector v197 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v196);
              LongVector v198 = v197.reinterpretAsLongs();
              long v199 = v198.lane(0);
              int v200 = v194_idxs.lane(1);
              int v201 = 1 + v200;
              ByteVector v202 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v201);
              LongVector v203 = v202.reinterpretAsLongs();
              long v204 = v203.lane(0);
              int v205 = v194_idxs.lane(2);
              int v206 = 1 + v205;
              ByteVector v207 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v206);
              LongVector v208 = v207.reinterpretAsLongs();
              long v209 = v208.lane(0);
              int v210 = v194_idxs.lane(3);
              int v211 = 1 + v210;
              ByteVector v212 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v211);
              LongVector v213 = v212.reinterpretAsLongs();
              long v214 = v213.lane(0);
              long[] v215 = arr_3;
              v215[0] = v199;
              v215[1] = v204;
              v215[2] = v209;
              v215[3] = v214;
              LongVector v220 = (LongVector) LongVector.SPECIES_256.fromArray(v215, 0);
              ByteVector v221_nums = v220.reinterpretAsBytes();
              LongVector v222 = v221_nums.reinterpretAsLongs();
              LongVector v223 = (LongVector) LongVector.SPECIES_256.broadcast(0x00ffffffffffffffL);
              LongVector v224 = v222.and(v223);
              v221_nums = v224.reinterpretAsBytes();
              ByteVector v225 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
              VectorMask<?> v226 = v221_nums.compare(VectorOperators.EQ, v225);
              ByteVector v227 = (ByteVector) v226.toVector();
              IntVector v228 = v227.reinterpretAsInts();
              IntVector v229 = v228.lanewise(VectorOperators.ASHR, 23);
              ByteVector v230 = v229.reinterpretAsBytes();
              ByteVector v231 = (v230);
              LongVector v232 = v231.reinterpretAsLongs();
              LongVector v233 = (LongVector) LongVector.SPECIES_256.broadcast(3L);
              LongVector v234 = v232.and(v233);
              ByteVector v235_off = v234.reinterpretAsBytes();
              byte[] v236 = arr_4;
              ByteVector v237 = (ByteVector) ByteVector.SPECIES_256.fromArray(v236, 0);
              v235_off = v237.selectFrom(v235_off);
              byte[] v238 = arr_5;
              ByteVector v239 = (ByteVector) ByteVector.SPECIES_256.fromArray(v238, 0);
              v235_off = v235_off.or(v239);
              byte[] v240 = arr_6;
              ByteVector v241 = (ByteVector) ByteVector.SPECIES_256.fromArray(v240, 0);
              v235_off = v235_off.add(v241);
              ByteVector v242 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31);
              v235_off = v235_off.and(v242);
              ByteVector v243 = v235_off.selectFrom(v221_nums);
              ShortVector v244_aligned16 = v243.reinterpretAsShorts();
              ByteVector v245 = v244_aligned16.reinterpretAsBytes();
              ByteVector v246 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
              ByteVector v247 = v245.sub(v246);
              ShortVector v248 = v247.reinterpretAsShorts();
              ByteVector v249 = v248.reinterpretAsBytes();
              ByteVector v250 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
              ByteVector v251 = v249.max(v250);
              v244_aligned16 = v251.reinterpretAsShorts();
              short[] v252 = arr_7;
              ShortVector v253 = (ShortVector) ShortVector.SPECIES_256.fromArray(v252, 0);
              v244_aligned16 = v244_aligned16.mul(v253);
              LongVector v254 = v244_aligned16.reinterpretAsLongs();
              LongVector v255 = v254.lanewise(VectorOperators.LSHR, 32);
              ShortVector v256 = v255.reinterpretAsShorts();
              v244_aligned16 = v244_aligned16.add(v256);
              LongVector v257 = v244_aligned16.reinterpretAsLongs();
              LongVector v258 = v257.lanewise(VectorOperators.LSHR, 16);
              ShortVector v259 = v258.reinterpretAsShorts();
              v244_aligned16 = v244_aligned16.add(v259);
              ShortVector v260_each16 = v244_aligned16;
              ByteVector v261 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
              VectorMask<?> v262 = v221_nums.compare(VectorOperators.EQ, v261);
              ByteVector v263 = (ByteVector) v262.toVector();
              ShortVector v264 = v263.reinterpretAsShorts();
              ShortVector v265 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0);
              VectorMask<?> v266 = v264.compare(VectorOperators.NE, v265);
              ShortVector v267_neg = (ShortVector) v266.toVector();
              ShortVector v268 = (v267_neg);
              v260_each16 = v260_each16.lanewise(VectorOperators.XOR, v268);
              ShortVector v269 = (v267_neg);
              v260_each16 = v260_each16.sub(v269);
              v260_each16.intoArray(v183_temp_buf, 0);
              int v271 = v191_off - v188_off;
              int v272_i = 0;
              l20: {
                l19: while(true) {
                  boolean v273 = v272_i < 4;
                  if (!v273) break l20;
                  int v274 = v272_i * 1;
                  int v275 = v188_off + v274;
                  int v276_off = v1_buf0[v275];
                  int v277 = v276_off - 16;
                  ByteVector v278 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v277);
                  ByteVector v279 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                  VectorMask<?> v280 = v278.compare(VectorOperators.EQ, v279);
                  long v281 = v280.toLong();
                  short v282_mc = (short) v281;
                  int v283_c = 16;
                  boolean v284 = v282_mc != (short)0;
                  l21: {
                    if (!v284) break l21;
                    int v285 = (int) v282_mc;
                    int v286 = v285 & 65535;
                    int v287 = Integer.numberOfLeadingZeros(v286);
                    v283_c = v287 - 16;
                  }
                  ByteVector v288 = (ByteVector) ByteVector.SPECIES_128.fromArray(v184_tail_mask, v283_c);
                  ByteVector v289 = v278.and(v288);
                  IntVector v290_hv = v289.reinterpretAsInts();
                  LongVector v291 = v290_hv.reinterpretAsLongs();
                  long v292 = v291.lane(1);
                  LongVector v293 = (LongVector) LongVector.SPECIES_128.broadcast(v292);
                  IntVector v294 = v293.reinterpretAsInts();
                  v290_hv = v290_hv.lanewise(VectorOperators.XOR, v294);
                  LongVector v295 = v290_hv.reinterpretAsLongs();
                  LongVector v296 = v295.lanewise(VectorOperators.LSHR, 32);
                  IntVector v297 = v296.reinterpretAsInts();
                  v290_hv = v290_hv.lanewise(VectorOperators.XOR, v297);
                  IntVector v298 = (v290_hv);
                  IntVector v299 = v298.lanewise(VectorOperators.ASHR, 16);
                  IntVector v300 = (v299);
                  v290_hv = v290_hv.lanewise(VectorOperators.XOR, v300);
                  IntVector v301_hv = v290_hv;
                  boolean v302 = v274 >= v271;
                  l22: {
                    if (!v302) break l22;
                    if (1==1) break l16;
                  }
                  int v303_hash = v301_hv.lane(0);
                  int v304 = v303_hash & v2_hash_mask;
                  int v305_idx = (int) v304;
                  IntVector v306 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v305_idx);
                  IntVector v307 = (IntVector) IntVector.SPECIES_128.broadcast(v303_hash);
                  VectorMask<?> v308 = v307.compare(VectorOperators.EQ, v306);
                  long v309 = v308.toLong();
                  byte v310_m = (byte) v309;
                  boolean v311 = v310_m == (byte)0;
                  l24: {
                    l23: {
                      if (!v311) break l23;
                      int v312 = v188_off + v274;
                      int v313 = v1_buf0[v312];
                      v1_buf0[v13_off] = v313;
                      int v315 = v274 * 4;
                      short v316 = v183_temp_buf[v315];
                      int v317 = (int) v316;
                      int v318 = v13_off + 1;
                      v1_buf0[v318] = v317;
                      v13_off = v13_off + 2;
                      if (1==1) break l24;
                    }
                    int v320 = Integer.numberOfTrailingZeros(v310_m);
                    v305_idx = v305_idx + v320;
                    int v321 = v305_idx * 16;
                    ByteVector v322_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v321);
                    boolean v323 = v322_exp.equals(v289);
                    boolean v324 = !(v323);
                    l26: {
                      l25: {
                        if (!v324) break l25;
                        int v325 = v188_off + v274;
                        int v326 = v1_buf0[v325];
                        v1_buf0[v13_off] = v326;
                        int v328 = v274 * 4;
                        short v329 = v183_temp_buf[v328];
                        int v330 = (int) v329;
                        int v331 = v13_off + 1;
                        v1_buf0[v331] = v330;
                        v13_off = v13_off + 2;
                        if (1==1) break l26;
                      }
                      int v333_dataoff = v305_idx * 4;
                      int v334 = v274 * 4;
                      short v335 = v183_temp_buf[v334];
                      long v336_temp = (long) v335;
                      int v337 = v333_dataoff + 2;
                      long v338 = v5_map_data[v337];
                      long v339 = Math.min(v338, v336_temp);
                      v5_map_data[v337] = v339;
                      int v341 = v333_dataoff + 3;
                      long v342 = v5_map_data[v341];
                      long v343 = Math.max(v342, v336_temp);
                      v5_map_data[v341] = v343;
                      long v345 = v5_map_data[v333_dataoff];
                      long v346 = v345 + v336_temp;
                      v5_map_data[v333_dataoff] = v346;
                      int v348 = v333_dataoff + 1;
                      long v349 = v5_map_data[v348];
                      long v350 = v349 + 1L;
                      v5_map_data[v348] = v350;
                    }
                  }
                  v272_i = v272_i + 1;
                  if (1==1) continue l19;
                  break;
                }
              }
              v188_off = v188_off + 4;
              if (1==1) continue l17;
              break;
            }
          }
        }
        v185_i = v185_i + 1;
        if (1==1) continue l14;
        break;
      }
    }
    l28: {
      l27: while(true) {
        boolean v352 = v12_off < v13_off;
        if (!v352) break l28;
        int v353 = v1_buf0[v12_off];
        int v354 = v12_off + 1;
        int v355 = v1_buf0[v354];
        v12_off = v12_off + 2;
        int v356 = v353 - 16;
        ByteVector v357 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v356);
        ByteVector v358 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
        VectorMask<?> v359 = v357.compare(VectorOperators.EQ, v358);
        long v360 = v359.toLong();
        short v361_m = (short) v360;
        boolean v362 = v361_m == (short)0;
        l31: {
          l29: {
            if (!v362) break l29;
            int v363_start = v353;
            l30: while(true) {
              v363_start = v363_start - 16;
              int v364 = v363_start - 16;
              ByteVector v365 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v364);
              ByteVector v366 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
              VectorMask<?> v367 = v365.compare(VectorOperators.EQ, v366);
              long v368 = v367.toLong();
              v361_m = (short) v368;
              boolean v369 = v361_m == (short)0;
              if (v369) continue l30;
              break;
            }
            int v370 = (int) v361_m;
            int v371 = v370 & 65535;
            int v372 = Integer.numberOfLeadingZeros(v371);
            int v373 = v372 - 16;
            int v374 = v363_start - v373;
            main.Main.failed_long(v0_ident, v374, v353, v355);
            if (1==1) break l31;
          }
          int v376 = (int) v361_m;
          int v377 = v376 & 65535;
          int v378 = Integer.numberOfLeadingZeros(v377);
          int v379_c = v378 - 16;
          int v380 = v353 - v379_c;
          ByteVector v381 = (ByteVector) ByteVector.SPECIES_128.fromArray(v184_tail_mask, v379_c);
          ByteVector v382 = v357.and(v381);
          IntVector v383_hv = v382.reinterpretAsInts();
          LongVector v384 = v383_hv.reinterpretAsLongs();
          long v385 = v384.lane(1);
          LongVector v386 = (LongVector) LongVector.SPECIES_128.broadcast(v385);
          IntVector v387 = v386.reinterpretAsInts();
          v383_hv = v383_hv.lanewise(VectorOperators.XOR, v387);
          LongVector v388 = v383_hv.reinterpretAsLongs();
          LongVector v389 = v388.lanewise(VectorOperators.LSHR, 32);
          IntVector v390 = v389.reinterpretAsInts();
          v383_hv = v383_hv.lanewise(VectorOperators.XOR, v390);
          IntVector v391 = (v383_hv);
          IntVector v392 = v391.lanewise(VectorOperators.ASHR, 16);
          IntVector v393 = (v392);
          v383_hv = v383_hv.lanewise(VectorOperators.XOR, v393);
          int v394 = v383_hv.lane(0);
          main.Main.failed_short(v0_ident, v380, v353, v355, v394);
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
