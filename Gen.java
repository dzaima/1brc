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
              ByteVector v220 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
              VectorMask<?> v221 = v219_nums.compare(VectorOperators.EQ, v220);
              ByteVector v222 = (ByteVector) v221.toVector();
              IntVector v223 = v222.reinterpretAsInts();
              IntVector v224 = v223.lanewise(VectorOperators.ASHR, 23);
              ByteVector v225 = v224.reinterpretAsBytes();
              ByteVector v226 = (v225);
              LongVector v227 = v226.reinterpretAsLongs();
              LongVector v228 = (LongVector) LongVector.SPECIES_256.broadcast(3L);
              LongVector v229 = v227.and(v228);
              ByteVector v230_off = v229.reinterpretAsBytes();
              byte[] v231 = arr_4;
              ByteVector v232 = (ByteVector) ByteVector.SPECIES_256.fromArray(v231, 0);
              v230_off = v232.selectFrom(v230_off);
              LongVector v233 = v219_nums.reinterpretAsLongs();
              LongVector v234 = (LongVector) LongVector.SPECIES_256.broadcast(0x00ffffffffffffffL);
              LongVector v235 = v233.and(v234);
              v219_nums = v235.reinterpretAsBytes();
              byte[] v236 = arr_5;
              ByteVector v237 = (ByteVector) ByteVector.SPECIES_256.fromArray(v236, 0);
              v230_off = v230_off.or(v237);
              byte[] v238 = arr_6;
              ByteVector v239 = (ByteVector) ByteVector.SPECIES_256.fromArray(v238, 0);
              v230_off = v230_off.add(v239);
              ByteVector v240 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31);
              v230_off = v230_off.and(v240);
              ByteVector v241 = v230_off.selectFrom(v219_nums);
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
              ByteVector v258 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
              VectorMask<?> v259 = v219_nums.compare(VectorOperators.EQ, v258);
              ByteVector v260 = (ByteVector) v259.toVector();
              ShortVector v261 = v260.reinterpretAsShorts();
              ShortVector v262 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0);
              VectorMask<?> v263 = v261.compare(VectorOperators.NE, v262);
              ShortVector v264_neg = (ShortVector) v263.toVector();
              ShortVector v265 = (v264_neg);
              v242_aligned16 = v242_aligned16.lanewise(VectorOperators.XOR, v265);
              ShortVector v266 = (v264_neg);
              v242_aligned16 = v242_aligned16.sub(v266);
              v242_aligned16.intoArray(v183_temp_buf, 0);
              int v268 = v191_off - v188_off;
              int v269_i = 0;
              l20: {
                l19: while(true) {
                  boolean v270 = v269_i < 4;
                  if (!v270) break l20;
                  int v271 = v269_i * 1;
                  int v272 = v188_off + v271;
                  int v273_off = v1_buf0[v272];
                  int v274 = v273_off - 16;
                  ByteVector v275 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v274);
                  ByteVector v276 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                  VectorMask<?> v277 = v275.compare(VectorOperators.EQ, v276);
                  long v278 = v277.toLong();
                  short v279_mc = (short) v278;
                  int v280_c = 16;
                  boolean v281 = v279_mc != (short)0;
                  l21: {
                    if (!v281) break l21;
                    int v282 = (int) v279_mc;
                    int v283 = v282 & 65535;
                    int v284 = Integer.numberOfLeadingZeros(v283);
                    v280_c = v284 - 16;
                  }
                  ByteVector v285 = (ByteVector) ByteVector.SPECIES_128.fromArray(v184_tail_mask, v280_c);
                  ByteVector v286 = v275.and(v285);
                  IntVector v287_hv = v286.reinterpretAsInts();
                  LongVector v288 = v287_hv.reinterpretAsLongs();
                  long v289 = v288.lane(1);
                  LongVector v290 = (LongVector) LongVector.SPECIES_128.broadcast(v289);
                  IntVector v291 = v290.reinterpretAsInts();
                  v287_hv = v287_hv.lanewise(VectorOperators.XOR, v291);
                  LongVector v292 = v287_hv.reinterpretAsLongs();
                  LongVector v293 = v292.lanewise(VectorOperators.LSHR, 32);
                  IntVector v294 = v293.reinterpretAsInts();
                  v287_hv = v287_hv.lanewise(VectorOperators.XOR, v294);
                  IntVector v295 = (v287_hv);
                  IntVector v296 = v295.lanewise(VectorOperators.ASHR, 16);
                  IntVector v297 = (v296);
                  v287_hv = v287_hv.lanewise(VectorOperators.XOR, v297);
                  IntVector v298_hv = v287_hv;
                  boolean v299 = v271 >= v268;
                  l22: {
                    if (!v299) break l22;
                    if (1==1) break l16;
                  }
                  int v300_hash = v298_hv.lane(0);
                  int v301 = v300_hash & v2_hash_mask;
                  int v302_idx = (int) v301;
                  IntVector v303 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v302_idx);
                  IntVector v304 = (IntVector) IntVector.SPECIES_128.broadcast(v300_hash);
                  VectorMask<?> v305 = v304.compare(VectorOperators.EQ, v303);
                  long v306 = v305.toLong();
                  byte v307_m = (byte) v306;
                  boolean v308 = v307_m == (byte)0;
                  l24: {
                    l23: {
                      if (!v308) break l23;
                      int v309 = v188_off + v271;
                      int v310 = v1_buf0[v309];
                      v1_buf0[v13_off] = v310;
                      int v312 = v271 * 4;
                      short v313 = v183_temp_buf[v312];
                      int v314 = (int) v313;
                      int v315 = v13_off + 1;
                      v1_buf0[v315] = v314;
                      v13_off = v13_off + 2;
                      if (1==1) break l24;
                    }
                    int v317 = Integer.numberOfTrailingZeros(v307_m);
                    v302_idx = v302_idx + v317;
                    int v318 = v302_idx * 16;
                    ByteVector v319_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v318);
                    boolean v320 = v319_exp.equals(v286);
                    boolean v321 = !(v320);
                    l26: {
                      l25: {
                        if (!v321) break l25;
                        int v322 = v188_off + v271;
                        int v323 = v1_buf0[v322];
                        v1_buf0[v13_off] = v323;
                        int v325 = v271 * 4;
                        short v326 = v183_temp_buf[v325];
                        int v327 = (int) v326;
                        int v328 = v13_off + 1;
                        v1_buf0[v328] = v327;
                        v13_off = v13_off + 2;
                        if (1==1) break l26;
                      }
                      int v330_dataoff = v302_idx * 4;
                      int v331 = v271 * 4;
                      short v332 = v183_temp_buf[v331];
                      long v333_temp = (long) v332;
                      int v334 = v330_dataoff + 2;
                      long v335 = v5_map_data[v334];
                      long v336 = Math.min(v335, v333_temp);
                      v5_map_data[v334] = v336;
                      int v338 = v330_dataoff + 3;
                      long v339 = v5_map_data[v338];
                      long v340 = Math.max(v339, v333_temp);
                      v5_map_data[v338] = v340;
                      long v342 = v5_map_data[v330_dataoff];
                      long v343 = v342 + v333_temp;
                      v5_map_data[v330_dataoff] = v343;
                      int v345 = v330_dataoff + 1;
                      long v346 = v5_map_data[v345];
                      long v347 = v346 + 1L;
                      v5_map_data[v345] = v347;
                    }
                  }
                  v269_i = v269_i + 1;
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
        boolean v349 = v12_off < v13_off;
        if (!v349) break l28;
        int v350 = v1_buf0[v12_off];
        int v351 = v12_off + 1;
        int v352 = v1_buf0[v351];
        v12_off = v12_off + 2;
        int v353 = v350 - 16;
        ByteVector v354 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v353);
        ByteVector v355 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
        VectorMask<?> v356 = v354.compare(VectorOperators.EQ, v355);
        long v357 = v356.toLong();
        short v358_m = (short) v357;
        boolean v359 = v358_m == (short)0;
        l31: {
          l29: {
            if (!v359) break l29;
            int v360_start = v350;
            l30: while(true) {
              v360_start = v360_start - 16;
              int v361 = v360_start - 16;
              ByteVector v362 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v361);
              ByteVector v363 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
              VectorMask<?> v364 = v362.compare(VectorOperators.EQ, v363);
              long v365 = v364.toLong();
              v358_m = (short) v365;
              boolean v366 = v358_m == (short)0;
              if (v366) continue l30;
              break;
            }
            int v367 = (int) v358_m;
            int v368 = v367 & 65535;
            int v369 = Integer.numberOfLeadingZeros(v368);
            int v370 = v369 - 16;
            int v371 = v360_start - v370;
            main.Main.failed_long(v0_ident, v371, v350, v352);
            if (1==1) break l31;
          }
          int v373 = (int) v358_m;
          int v374 = v373 & 65535;
          int v375 = Integer.numberOfLeadingZeros(v374);
          int v376_c = v375 - 16;
          int v377 = v350 - v376_c;
          ByteVector v378 = (ByteVector) ByteVector.SPECIES_128.fromArray(v184_tail_mask, v376_c);
          ByteVector v379 = v354.and(v378);
          IntVector v380_hv = v379.reinterpretAsInts();
          LongVector v381 = v380_hv.reinterpretAsLongs();
          long v382 = v381.lane(1);
          LongVector v383 = (LongVector) LongVector.SPECIES_128.broadcast(v382);
          IntVector v384 = v383.reinterpretAsInts();
          v380_hv = v380_hv.lanewise(VectorOperators.XOR, v384);
          LongVector v385 = v380_hv.reinterpretAsLongs();
          LongVector v386 = v385.lanewise(VectorOperators.LSHR, 32);
          IntVector v387 = v386.reinterpretAsInts();
          v380_hv = v380_hv.lanewise(VectorOperators.XOR, v387);
          IntVector v388 = (v380_hv);
          IntVector v389 = v388.lanewise(VectorOperators.ASHR, 16);
          IntVector v390 = (v389);
          v380_hv = v380_hv.lanewise(VectorOperators.XOR, v390);
          int v391 = v380_hv.lane(0);
          main.Main.failed_short(v0_ident, v377, v350, v352, v391);
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
