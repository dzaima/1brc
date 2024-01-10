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
    int v146_off = 128;
    int v147 = v146_off + 1;
    v1_buf0[v147] = v9_off;
    int v149_off = 128;
    int v150 = v149_off + 2;
    v1_buf0[v150] = v10_off;
    int v152_off = 128;
    int v153 = v152_off + 3;
    v1_buf0[v153] = v11_off;
    short[] v155_temp_buf = arr_1;
    byte[] v156_exp_mask = arr_2;
    int v157_i = 0;
    l15: {
      l14: while(true) {
        boolean v158 = v157_i < 4;
        if (!v158) break l15;
        int v159 = 1004 * v157_i;
        int v160_off = 132 + v159;
        int v161_off = 128;
        int v162 = v161_off + v157_i;
        int v163_off = v1_buf0[v162];
        int v164_retctr = 0;
        l17: {
          l16: while(true) {
            boolean v165 = v160_off < v163_off;
            if (!v165) break l17;
            IntVector v166_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_buf0, v160_off);
            IntVector v167 = (IntVector) IntVector.SPECIES_128.broadcast(1);
            IntVector v168 = v166_idxs.add(v167);
            int v169 = v168.lane(0);
            ByteVector v170 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v169);
            LongVector v171 = v170.reinterpretAsLongs();
            long v172 = v171.lane(0);
            int v173 = v168.lane(1);
            ByteVector v174 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v173);
            LongVector v175 = v174.reinterpretAsLongs();
            long v176 = v175.lane(0);
            int v177 = v168.lane(2);
            ByteVector v178 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v177);
            LongVector v179 = v178.reinterpretAsLongs();
            long v180 = v179.lane(0);
            int v181 = v168.lane(3);
            ByteVector v182 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v181);
            LongVector v183 = v182.reinterpretAsLongs();
            long v184 = v183.lane(0);
            long[] v185 = arr_3;
            v185[0] = v172;
            v185[1] = v176;
            v185[2] = v180;
            v185[3] = v184;
            LongVector v190 = (LongVector) LongVector.SPECIES_256.fromArray(v185, 0);
            ByteVector v191_nums = v190.reinterpretAsBytes();
            ByteVector v192 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
            VectorMask<?> v193 = v191_nums.compare(VectorOperators.EQ, v192);
            ByteVector v194 = (ByteVector) v193.toVector();
            IntVector v195 = v194.reinterpretAsInts();
            IntVector v196 = v195.lanewise(VectorOperators.ASHR, 23);
            LongVector v197 = v196.reinterpretAsLongs();
            LongVector v198 = (LongVector) LongVector.SPECIES_256.broadcast(3L);
            LongVector v199 = v197.and(v198);
            ByteVector v200_off = v199.reinterpretAsBytes();
            byte[] v201 = arr_4;
            ByteVector v202 = (ByteVector) ByteVector.SPECIES_256.fromArray(v201, 0);
            v200_off = v202.selectFrom(v200_off);
            LongVector v203 = v191_nums.reinterpretAsLongs();
            LongVector v204 = (LongVector) LongVector.SPECIES_256.broadcast(0x00ffffffffffffffL);
            LongVector v205 = v203.and(v204);
            v191_nums = v205.reinterpretAsBytes();
            byte[] v206 = arr_5;
            ByteVector v207 = (ByteVector) ByteVector.SPECIES_256.fromArray(v206, 0);
            v200_off = v200_off.or(v207);
            byte[] v208 = arr_6;
            ByteVector v209 = (ByteVector) ByteVector.SPECIES_256.fromArray(v208, 0);
            v200_off = v200_off.add(v209);
            ByteVector v210 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31);
            v200_off = v200_off.and(v210);
            ByteVector v211 = v200_off.selectFrom(v191_nums);
            ShortVector v212_aligned16 = v211.reinterpretAsShorts();
            ByteVector v213 = v212_aligned16.reinterpretAsBytes();
            ByteVector v214 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
            ByteVector v215 = v213.sub(v214);
            ByteVector v216 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
            ByteVector v217 = v215.max(v216);
            v212_aligned16 = v217.reinterpretAsShorts();
            short[] v218 = arr_7;
            ShortVector v219 = (ShortVector) ShortVector.SPECIES_256.fromArray(v218, 0);
            v212_aligned16 = v212_aligned16.mul(v219);
            LongVector v220 = v212_aligned16.reinterpretAsLongs();
            LongVector v221 = v220.lanewise(VectorOperators.LSHR, 32);
            ShortVector v222 = v221.reinterpretAsShorts();
            v212_aligned16 = v212_aligned16.add(v222);
            LongVector v223 = v212_aligned16.reinterpretAsLongs();
            LongVector v224 = v223.lanewise(VectorOperators.LSHR, 16);
            ShortVector v225 = v224.reinterpretAsShorts();
            v212_aligned16 = v212_aligned16.add(v225);
            ByteVector v226 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
            VectorMask<?> v227 = v191_nums.compare(VectorOperators.EQ, v226);
            ByteVector v228 = (ByteVector) v227.toVector();
            ShortVector v229 = v228.reinterpretAsShorts();
            ShortVector v230 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0);
            VectorMask<?> v231 = v229.compare(VectorOperators.NE, v230);
            ShortVector v232 = (ShortVector) v231.toVector();
            ShortVector v233_neg = (v232);
            v212_aligned16 = v212_aligned16.lanewise(VectorOperators.XOR, v233_neg);
            v212_aligned16 = v212_aligned16.sub(v233_neg);
            v212_aligned16.intoArray(v155_temp_buf, 0);
            int v235 = v163_off - v160_off;
            int v236 = Math.min(v235, 4);
            int v237_i = 0;
            l19: {
              l18: while(true) {
                boolean v238 = v237_i < v236;
                if (!v238) break l19;
                int v239 = v160_off + v237_i;
                int v240_off = v1_buf0[v239];
                int v241 = v240_off - 16;
                ByteVector v242_x = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v241);
                ByteVector v243 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                VectorMask<?> v244 = v242_x.compare(VectorOperators.EQ, v243);
                long v245 = v244.toLong();
                short v246_m = (short) v245;
                boolean v247 = v246_m == (short)0;
                l21: {
                  l20: {
                    if (!v247) break l20;
                    v1_buf0[v13_off] = v240_off;
                    int v249 = v237_i * 4;
                    short v250 = v155_temp_buf[v249];
                    int v251 = (int) v250;
                    int v252 = v251 << 1;
                    short v253 = (short) v252;
                    int v254 = (int) v253;
                    int v255 = v254 | 1;
                    int v256 = v13_off + 1;
                    v1_buf0[v256] = v255;
                    v13_off = v13_off + 2;
                    if (1==1) break l21;
                  }
                  int v258 = (int) v246_m;
                  int v259 = v258 & 65535;
                  int v260 = Integer.numberOfLeadingZeros(v259);
                  int v261 = v260 - 16;
                  ByteVector v262 = (ByteVector) ByteVector.SPECIES_128.fromArray(v156_exp_mask, v261);
                  v242_x = v242_x.and(v262);
                  IntVector v263_hv = v242_x.reinterpretAsInts();
                  VectorShuffle<Integer> v264 = IntVector.SPECIES_128.shuffleFromValues(2, 3, 2, 3);
                  IntVector v265 = v263_hv.rearrange(v264);
                  v263_hv = v263_hv.lanewise(VectorOperators.XOR, v265);
                  LongVector v266 = v263_hv.reinterpretAsLongs();
                  LongVector v267 = v266.lanewise(VectorOperators.LSHR, 32);
                  IntVector v268 = v267.reinterpretAsInts();
                  v263_hv = v263_hv.lanewise(VectorOperators.XOR, v268);
                  IntVector v269 = (v263_hv);
                  IntVector v270 = v269.lanewise(VectorOperators.ASHR, 16);
                  IntVector v271 = (v270);
                  v263_hv = v263_hv.lanewise(VectorOperators.XOR, v271);
                  int v272_hash = v263_hv.lane(0);
                  v263_hv = (IntVector) IntVector.SPECIES_128.broadcast(v272_hash);
                  int v273_idx = v272_hash & v2_hash_mask;
                  IntVector v274 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v273_idx);
                  VectorMask<?> v275 = v263_hv.compare(VectorOperators.EQ, v274);
                  long v276 = v275.toLong();
                  byte v277_m = (byte) v276;
                  boolean v278 = v277_m == (byte)0;
                  l23: {
                    l22: {
                      if (!v278) break l22;
                      v1_buf0[v13_off] = v240_off;
                      int v280 = v237_i * 4;
                      short v281 = v155_temp_buf[v280];
                      int v282 = (int) v281;
                      int v283 = v282 << 1;
                      short v284 = (short) v283;
                      int v285 = (int) v284;
                      int v286 = v285 | 0;
                      int v287 = v13_off + 1;
                      v1_buf0[v287] = v286;
                      v13_off = v13_off + 2;
                      if (1==1) break l23;
                    }
                    int v289 = Integer.numberOfTrailingZeros(v277_m);
                    int v290 = (int) v289;
                    v273_idx = v273_idx + v290;
                    int v291 = v273_idx * 16;
                    ByteVector v292_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v291);
                    boolean v293 = v242_x.equals(v292_exp);
                    boolean v294 = !(v293);
                    l25: {
                      l24: {
                        if (!v294) break l24;
                        v1_buf0[v13_off] = v240_off;
                        int v296 = v237_i * 4;
                        short v297 = v155_temp_buf[v296];
                        int v298 = (int) v297;
                        int v299 = v298 << 1;
                        short v300 = (short) v299;
                        int v301 = (int) v300;
                        int v302 = v301 | 0;
                        int v303 = v13_off + 1;
                        v1_buf0[v303] = v302;
                        v13_off = v13_off + 2;
                        if (1==1) break l25;
                      }
                      int v305_dataoff = v273_idx * 4;
                      int v306 = v237_i * 4;
                      short v307 = v155_temp_buf[v306];
                      long v308_temp = (long) v307;
                      int v309 = v305_dataoff + 2;
                      long v310 = v5_map_data[v309];
                      long v311 = Math.min(v310, v308_temp);
                      v5_map_data[v309] = v311;
                      int v313 = v305_dataoff + 3;
                      long v314 = v5_map_data[v313];
                      long v315 = Math.max(v314, v308_temp);
                      v5_map_data[v313] = v315;
                      long v317 = v5_map_data[v305_dataoff];
                      long v318 = v317 + v308_temp;
                      v5_map_data[v305_dataoff] = v318;
                      int v320 = v305_dataoff + 1;
                      long v321 = v5_map_data[v320];
                      long v322 = v321 + 1L;
                      v5_map_data[v320] = v322;
                    }
                  }
                }
                v237_i = v237_i + 1;
                if (1==1) continue l18;
                break;
              }
            }
            v160_off = v160_off + 4;
            if (1==1) continue l16;
            break;
          }
        }
        v157_i = v157_i + 1;
        if (1==1) continue l14;
        break;
      }
    }
    l27: {
      l26: while(true) {
        boolean v324 = v12_off < v13_off;
        if (!v324) break l27;
        int v325 = v1_buf0[v12_off];
        int v326 = v12_off + 1;
        int v327 = v1_buf0[v326];
        v12_off = v12_off + 2;
        int v328 = v327 & 1;
        boolean v329 = v328 != 0;
        int v330 = v327 >> 1;
        l29: {
          l28: {
            if (!v329) break l28;
            main.Main.failed_long(v0_ident, v325, v330);
            if (1==1) break l29;
          }
          main.Main.failed_short(v0_ident, v325, v330);
        }
        if (1==1) continue l26;
        break;
      }
    }
    return;
  }
}
private final static byte[] arr_8 = new byte[]{0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,16,16,16,16,16,16,16,16,24,24,24,24,24,24,24,24};
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
        ShortVector v7_v = (ShortVector) ShortVector.SPECIES_256.fromArray(v1_ai16, v6);
        byte[] v8 = arr_8;
        ByteVector v9 = (ByteVector) ByteVector.SPECIES_256.fromArray(v8, 0);
        ByteVector v10 = v7_v.reinterpretAsBytes();
        ByteVector v11 = v9.selectFrom(v10);
        v7_v = v11.reinterpretAsShorts();
        v7_v.intoArray(v1_ai16, v6);
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
