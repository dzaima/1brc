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
              IntVector v195 = (IntVector) IntVector.SPECIES_128.broadcast(1);
              IntVector v196 = v194_idxs.add(v195);
              int v197 = v196.lane(0);
              ByteVector v198 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v197);
              LongVector v199 = v198.reinterpretAsLongs();
              long v200 = v199.lane(0);
              int v201 = v196.lane(1);
              ByteVector v202 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v201);
              LongVector v203 = v202.reinterpretAsLongs();
              long v204 = v203.lane(0);
              int v205 = v196.lane(2);
              ByteVector v206 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v205);
              LongVector v207 = v206.reinterpretAsLongs();
              long v208 = v207.lane(0);
              int v209 = v196.lane(3);
              ByteVector v210 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v209);
              LongVector v211 = v210.reinterpretAsLongs();
              long v212 = v211.lane(0);
              long[] v213 = arr_3;
              v213[0] = v200;
              v213[1] = v204;
              v213[2] = v208;
              v213[3] = v212;
              LongVector v218 = (LongVector) LongVector.SPECIES_256.fromArray(v213, 0);
              ByteVector v219_nums = v218.reinterpretAsBytes();
              LongVector v220 = v219_nums.reinterpretAsLongs();
              LongVector v221 = (LongVector) LongVector.SPECIES_256.broadcast(0x00ffffffffffffffL);
              LongVector v222 = v220.and(v221);
              v219_nums = v222.reinterpretAsBytes();
              ByteVector v223 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
              VectorMask<?> v224 = v219_nums.compare(VectorOperators.EQ, v223);
              ByteVector v225 = (ByteVector) v224.toVector();
              IntVector v226 = v225.reinterpretAsInts();
              IntVector v227 = v226.lanewise(VectorOperators.ASHR, 23);
              ByteVector v228 = v227.reinterpretAsBytes();
              ByteVector v229 = (v228);
              LongVector v230 = v229.reinterpretAsLongs();
              LongVector v231 = (LongVector) LongVector.SPECIES_256.broadcast(3L);
              LongVector v232 = v230.and(v231);
              ByteVector v233_off = v232.reinterpretAsBytes();
              byte[] v234 = arr_4;
              ByteVector v235 = (ByteVector) ByteVector.SPECIES_256.fromArray(v234, 0);
              v233_off = v235.selectFrom(v233_off);
              byte[] v236 = arr_5;
              ByteVector v237 = (ByteVector) ByteVector.SPECIES_256.fromArray(v236, 0);
              v233_off = v233_off.or(v237);
              byte[] v238 = arr_6;
              ByteVector v239 = (ByteVector) ByteVector.SPECIES_256.fromArray(v238, 0);
              v233_off = v233_off.add(v239);
              ByteVector v240 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31);
              v233_off = v233_off.and(v240);
              ByteVector v241 = v233_off.selectFrom(v219_nums);
              ShortVector v242_aligned16 = v241.reinterpretAsShorts();
              ByteVector v243 = v242_aligned16.reinterpretAsBytes();
              ByteVector v244 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
              ByteVector v245 = v243.sub(v244);
              ShortVector v246 = v245.reinterpretAsShorts();
              ByteVector v247 = v246.reinterpretAsBytes();
              ByteVector v248 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
              ByteVector v249 = v247.max(v248);
              v242_aligned16 = v249.reinterpretAsShorts();
              short[] v250 = arr_7;
              ShortVector v251 = (ShortVector) ShortVector.SPECIES_256.fromArray(v250, 0);
              v242_aligned16 = v242_aligned16.mul(v251);
              LongVector v252 = v242_aligned16.reinterpretAsLongs();
              LongVector v253 = v252.lanewise(VectorOperators.LSHR, 32);
              ShortVector v254 = v253.reinterpretAsShorts();
              v242_aligned16 = v242_aligned16.add(v254);
              LongVector v255 = v242_aligned16.reinterpretAsLongs();
              LongVector v256 = v255.lanewise(VectorOperators.LSHR, 16);
              ShortVector v257 = v256.reinterpretAsShorts();
              v242_aligned16 = v242_aligned16.add(v257);
              ShortVector v258_each16 = v242_aligned16;
              ByteVector v259 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
              VectorMask<?> v260 = v219_nums.compare(VectorOperators.EQ, v259);
              ByteVector v261 = (ByteVector) v260.toVector();
              ShortVector v262 = v261.reinterpretAsShorts();
              ShortVector v263 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0);
              VectorMask<?> v264 = v262.compare(VectorOperators.NE, v263);
              ShortVector v265_neg = (ShortVector) v264.toVector();
              ShortVector v266 = (v265_neg);
              v258_each16 = v258_each16.lanewise(VectorOperators.XOR, v266);
              ShortVector v267 = (v265_neg);
              v258_each16 = v258_each16.sub(v267);
              v258_each16.intoArray(v183_temp_buf, 0);
              int v269 = v191_off - v188_off;
              int v270_i = 0;
              l20: {
                l19: while(true) {
                  boolean v271 = v270_i < 4;
                  if (!v271) break l20;
                  int v272 = v270_i * 1;
                  int v273 = v188_off + v272;
                  int v274_off = v1_buf0[v273];
                  int v275 = v274_off - 16;
                  ByteVector v276 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v275);
                  ByteVector v277 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                  VectorMask<?> v278 = v276.compare(VectorOperators.EQ, v277);
                  long v279 = v278.toLong();
                  short v280_mc = (short) v279;
                  int v281_c = 16;
                  boolean v282 = v280_mc != (short)0;
                  l21: {
                    if (!v282) break l21;
                    int v283 = (int) v280_mc;
                    int v284 = v283 & 65535;
                    int v285 = Integer.numberOfLeadingZeros(v284);
                    v281_c = v285 - 16;
                  }
                  ByteVector v286 = (ByteVector) ByteVector.SPECIES_128.fromArray(v184_tail_mask, v281_c);
                  ByteVector v287 = v276.and(v286);
                  IntVector v288_hv = v287.reinterpretAsInts();
                  LongVector v289 = v288_hv.reinterpretAsLongs();
                  long v290 = v289.lane(1);
                  LongVector v291 = (LongVector) LongVector.SPECIES_128.broadcast(v290);
                  IntVector v292 = v291.reinterpretAsInts();
                  v288_hv = v288_hv.lanewise(VectorOperators.XOR, v292);
                  LongVector v293 = v288_hv.reinterpretAsLongs();
                  LongVector v294 = v293.lanewise(VectorOperators.LSHR, 32);
                  IntVector v295 = v294.reinterpretAsInts();
                  v288_hv = v288_hv.lanewise(VectorOperators.XOR, v295);
                  IntVector v296 = (v288_hv);
                  IntVector v297 = v296.lanewise(VectorOperators.ASHR, 16);
                  IntVector v298 = (v297);
                  v288_hv = v288_hv.lanewise(VectorOperators.XOR, v298);
                  IntVector v299_hv = v288_hv;
                  boolean v300 = v272 >= v269;
                  l22: {
                    if (!v300) break l22;
                    if (1==1) break l16;
                  }
                  int v301_hash = v299_hv.lane(0);
                  int v302 = v301_hash & v2_hash_mask;
                  int v303_idx = (int) v302;
                  IntVector v304 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v303_idx);
                  IntVector v305 = (IntVector) IntVector.SPECIES_128.broadcast(v301_hash);
                  VectorMask<?> v306 = v305.compare(VectorOperators.EQ, v304);
                  long v307 = v306.toLong();
                  byte v308_m = (byte) v307;
                  boolean v309 = v308_m == (byte)0;
                  l24: {
                    l23: {
                      if (!v309) break l23;
                      int v310 = v188_off + v272;
                      int v311 = v1_buf0[v310];
                      v1_buf0[v13_off] = v311;
                      int v313 = v272 * 4;
                      short v314 = v183_temp_buf[v313];
                      int v315 = (int) v314;
                      int v316 = v13_off + 1;
                      v1_buf0[v316] = v315;
                      v13_off = v13_off + 2;
                      if (1==1) break l24;
                    }
                    int v318 = Integer.numberOfTrailingZeros(v308_m);
                    v303_idx = v303_idx + v318;
                    int v319 = v303_idx * 16;
                    ByteVector v320_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v319);
                    boolean v321 = v320_exp.equals(v287);
                    boolean v322 = !(v321);
                    l26: {
                      l25: {
                        if (!v322) break l25;
                        int v323 = v188_off + v272;
                        int v324 = v1_buf0[v323];
                        v1_buf0[v13_off] = v324;
                        int v326 = v272 * 4;
                        short v327 = v183_temp_buf[v326];
                        int v328 = (int) v327;
                        int v329 = v13_off + 1;
                        v1_buf0[v329] = v328;
                        v13_off = v13_off + 2;
                        if (1==1) break l26;
                      }
                      int v331_dataoff = v303_idx * 4;
                      int v332 = v272 * 4;
                      short v333 = v183_temp_buf[v332];
                      long v334_temp = (long) v333;
                      int v335 = v331_dataoff + 2;
                      long v336 = v5_map_data[v335];
                      long v337 = Math.min(v336, v334_temp);
                      v5_map_data[v335] = v337;
                      int v339 = v331_dataoff + 3;
                      long v340 = v5_map_data[v339];
                      long v341 = Math.max(v340, v334_temp);
                      v5_map_data[v339] = v341;
                      long v343 = v5_map_data[v331_dataoff];
                      long v344 = v343 + v334_temp;
                      v5_map_data[v331_dataoff] = v344;
                      int v346 = v331_dataoff + 1;
                      long v347 = v5_map_data[v346];
                      long v348 = v347 + 1L;
                      v5_map_data[v346] = v348;
                    }
                  }
                  v270_i = v270_i + 1;
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
        boolean v350 = v12_off < v13_off;
        if (!v350) break l28;
        int v351 = v1_buf0[v12_off];
        int v352 = v12_off + 1;
        int v353 = v1_buf0[v352];
        v12_off = v12_off + 2;
        int v354 = v351 - 16;
        ByteVector v355 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v354);
        ByteVector v356 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
        VectorMask<?> v357 = v355.compare(VectorOperators.EQ, v356);
        long v358 = v357.toLong();
        short v359_m = (short) v358;
        boolean v360 = v359_m == (short)0;
        l31: {
          l29: {
            if (!v360) break l29;
            int v361_start = v351;
            l30: while(true) {
              v361_start = v361_start - 16;
              int v362 = v361_start - 16;
              ByteVector v363 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v362);
              ByteVector v364 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
              VectorMask<?> v365 = v363.compare(VectorOperators.EQ, v364);
              long v366 = v365.toLong();
              v359_m = (short) v366;
              boolean v367 = v359_m == (short)0;
              if (v367) continue l30;
              break;
            }
            int v368 = (int) v359_m;
            int v369 = v368 & 65535;
            int v370 = Integer.numberOfLeadingZeros(v369);
            int v371 = v370 - 16;
            int v372 = v361_start - v371;
            main.Main.failed_long(v0_ident, v372, v351, v353);
            if (1==1) break l31;
          }
          int v374 = (int) v359_m;
          int v375 = v374 & 65535;
          int v376 = Integer.numberOfLeadingZeros(v375);
          int v377_c = v376 - 16;
          int v378 = v351 - v377_c;
          ByteVector v379 = (ByteVector) ByteVector.SPECIES_128.fromArray(v184_tail_mask, v377_c);
          ByteVector v380 = v355.and(v379);
          IntVector v381_hv = v380.reinterpretAsInts();
          LongVector v382 = v381_hv.reinterpretAsLongs();
          long v383 = v382.lane(1);
          LongVector v384 = (LongVector) LongVector.SPECIES_128.broadcast(v383);
          IntVector v385 = v384.reinterpretAsInts();
          v381_hv = v381_hv.lanewise(VectorOperators.XOR, v385);
          LongVector v386 = v381_hv.reinterpretAsLongs();
          LongVector v387 = v386.lanewise(VectorOperators.LSHR, 32);
          IntVector v388 = v387.reinterpretAsInts();
          v381_hv = v381_hv.lanewise(VectorOperators.XOR, v388);
          IntVector v389 = (v381_hv);
          IntVector v390 = v389.lanewise(VectorOperators.ASHR, 16);
          IntVector v391 = (v390);
          v381_hv = v381_hv.lanewise(VectorOperators.XOR, v391);
          int v392 = v381_hv.lane(0);
          main.Main.failed_short(v0_ident, v378, v351, v353, v392);
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

}
