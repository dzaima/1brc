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
              LongVector v225 = v224.reinterpretAsLongs();
              LongVector v226 = (LongVector) LongVector.SPECIES_256.broadcast(3L);
              LongVector v227 = v225.and(v226);
              ByteVector v228_off = v227.reinterpretAsBytes();
              byte[] v229 = arr_4;
              ByteVector v230 = (ByteVector) ByteVector.SPECIES_256.fromArray(v229, 0);
              v228_off = v230.selectFrom(v228_off);
              LongVector v231 = v219_nums.reinterpretAsLongs();
              LongVector v232 = (LongVector) LongVector.SPECIES_256.broadcast(0x00ffffffffffffffL);
              LongVector v233 = v231.and(v232);
              v219_nums = v233.reinterpretAsBytes();
              byte[] v234 = arr_5;
              ByteVector v235 = (ByteVector) ByteVector.SPECIES_256.fromArray(v234, 0);
              v228_off = v228_off.or(v235);
              byte[] v236 = arr_6;
              ByteVector v237 = (ByteVector) ByteVector.SPECIES_256.fromArray(v236, 0);
              v228_off = v228_off.add(v237);
              ByteVector v238 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31);
              v228_off = v228_off.and(v238);
              ByteVector v239 = v228_off.selectFrom(v219_nums);
              ShortVector v240_aligned16 = v239.reinterpretAsShorts();
              ByteVector v241 = v240_aligned16.reinterpretAsBytes();
              ByteVector v242 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
              ByteVector v243 = v241.sub(v242);
              ByteVector v244 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
              ByteVector v245 = v243.max(v244);
              v240_aligned16 = v245.reinterpretAsShorts();
              short[] v246 = arr_7;
              ShortVector v247 = (ShortVector) ShortVector.SPECIES_256.fromArray(v246, 0);
              v240_aligned16 = v240_aligned16.mul(v247);
              LongVector v248 = v240_aligned16.reinterpretAsLongs();
              LongVector v249 = v248.lanewise(VectorOperators.LSHR, 32);
              ShortVector v250 = v249.reinterpretAsShorts();
              v240_aligned16 = v240_aligned16.add(v250);
              LongVector v251 = v240_aligned16.reinterpretAsLongs();
              LongVector v252 = v251.lanewise(VectorOperators.LSHR, 16);
              ShortVector v253 = v252.reinterpretAsShorts();
              v240_aligned16 = v240_aligned16.add(v253);
              ByteVector v254 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
              VectorMask<?> v255 = v219_nums.compare(VectorOperators.EQ, v254);
              ByteVector v256 = (ByteVector) v255.toVector();
              ShortVector v257 = v256.reinterpretAsShorts();
              ShortVector v258 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0);
              VectorMask<?> v259 = v257.compare(VectorOperators.NE, v258);
              ShortVector v260 = (ShortVector) v259.toVector();
              ShortVector v261_neg = (v260);
              v240_aligned16 = v240_aligned16.lanewise(VectorOperators.XOR, v261_neg);
              v240_aligned16 = v240_aligned16.sub(v261_neg);
              v240_aligned16.intoArray(v183_temp_buf, 0);
              int v263 = v191_off - v188_off;
              int v264_i = 0;
              l20: {
                l19: while(true) {
                  boolean v265 = v264_i < 4;
                  if (!v265) break l20;
                  int v266 = v264_i * 1;
                  int v267 = v188_off + v266;
                  int v268_off = v1_buf0[v267];
                  int v269 = v268_off - 16;
                  ByteVector v270 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v269);
                  ByteVector v271 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                  VectorMask<?> v272 = v270.compare(VectorOperators.EQ, v271);
                  long v273 = v272.toLong();
                  short v274_mc = (short) v273;
                  int v275_c = 16;
                  boolean v276 = v274_mc != (short)0;
                  l21: {
                    if (!v276) break l21;
                    int v277 = (int) v274_mc;
                    int v278 = v277 & 65535;
                    int v279 = Integer.numberOfLeadingZeros(v278);
                    v275_c = v279 - 16;
                  }
                  ByteVector v280 = (ByteVector) ByteVector.SPECIES_128.fromArray(v184_tail_mask, v275_c);
                  ByteVector v281 = v270.and(v280);
                  IntVector v282_hv = v281.reinterpretAsInts();
                  LongVector v283 = v282_hv.reinterpretAsLongs();
                  long v284 = v283.lane(1);
                  LongVector v285 = (LongVector) LongVector.SPECIES_128.broadcast(v284);
                  IntVector v286 = v285.reinterpretAsInts();
                  v282_hv = v282_hv.lanewise(VectorOperators.XOR, v286);
                  LongVector v287 = v282_hv.reinterpretAsLongs();
                  LongVector v288 = v287.lanewise(VectorOperators.LSHR, 32);
                  IntVector v289 = v288.reinterpretAsInts();
                  v282_hv = v282_hv.lanewise(VectorOperators.XOR, v289);
                  IntVector v290 = (v282_hv);
                  IntVector v291 = v290.lanewise(VectorOperators.ASHR, 16);
                  IntVector v292 = (v291);
                  v282_hv = v282_hv.lanewise(VectorOperators.XOR, v292);
                  int v293 = v264_i * 1;
                  boolean v294 = v293 >= v263;
                  l22: {
                    if (!v294) break l22;
                    if (1==1) break l16;
                  }
                  int v295_hash = v282_hv.lane(0);
                  int v296 = v295_hash & v2_hash_mask;
                  int v297_idx = (int) v296;
                  IntVector v298 = (IntVector) IntVector.SPECIES_128.broadcast(v295_hash);
                  IntVector v299 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v297_idx);
                  VectorMask<?> v300 = v298.compare(VectorOperators.EQ, v299);
                  long v301 = v300.toLong();
                  byte v302_m = (byte) v301;
                  boolean v303 = v302_m == (byte)0;
                  l24: {
                    l23: {
                      if (!v303) break l23;
                      int v304 = v188_off + v293;
                      int v305 = v1_buf0[v304];
                      v1_buf0[v13_off] = v305;
                      int v307 = v293 * 4;
                      short v308 = v183_temp_buf[v307];
                      int v309 = (int) v308;
                      int v310 = v309 << 1;
                      short v311 = (short) v310;
                      int v312 = (int) v311;
                      int v313 = v312 | 0;
                      int v314 = v13_off + 1;
                      v1_buf0[v314] = v313;
                      v13_off = v13_off + 2;
                      if (1==1) break l24;
                    }
                    int v316 = Integer.numberOfTrailingZeros(v302_m);
                    v297_idx = v297_idx + v316;
                    int v317 = v297_idx * 16;
                    ByteVector v318_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v317);
                    boolean v319 = v318_exp.equals(v281);
                    boolean v320 = !(v319);
                    l26: {
                      l25: {
                        if (!v320) break l25;
                        int v321 = v188_off + v293;
                        int v322 = v1_buf0[v321];
                        v1_buf0[v13_off] = v322;
                        int v324 = v293 * 4;
                        short v325 = v183_temp_buf[v324];
                        int v326 = (int) v325;
                        int v327 = v326 << 1;
                        short v328 = (short) v327;
                        int v329 = (int) v328;
                        int v330 = v329 | 0;
                        int v331 = v13_off + 1;
                        v1_buf0[v331] = v330;
                        v13_off = v13_off + 2;
                        if (1==1) break l26;
                      }
                      int v333_dataoff = v297_idx * 4;
                      int v334 = v293 * 4;
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
                  v264_i = v264_i + 1;
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
        int v356 = v355 & 1;
        boolean v357 = v356 != 0;
        int v358 = v355 >> 1;
        l30: {
          l29: {
            if (!v357) break l29;
            main.Main.failed_long(v0_ident, v353, v358);
            if (1==1) break l30;
          }
          main.Main.failed_short(v0_ident, v353, v358);
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
