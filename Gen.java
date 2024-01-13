package gen;
import jdk.incubator.vector.*;

public class Gen {

private static final byte[] c0_tail_mask = new byte[]{(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1};
public int core_1brc_buf_elts() {
  return 4016;
}
public int core_1brc_periter() {
  return 10624;
}
public int hash_1brc(byte[] v0_arr) {
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
private final int[] arr_1 = new int[4];
private final short[] arr_2 = new short[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
private final int[] arr_3 = new int[8000];
private final long[] arr_4 = new long[4];
public void core_1brc(int v0_ident, int[] v1_bufdata, int v2_hash_mask, byte[] v3_map_exp, int[] v4_map_hash, long[] v5_map_data, byte[] v6_inp, int v7_inpOff) {
  int v8_pos = 0;
  int v9_pos = 1004;
  int v10_pos = 2008;
  int v11_pos = 3012;
  int[] v12_bufEnds = arr_1;
  int v13_pos = v7_inpOff;
  int v14_pos = v7_inpOff + 32;
  int v15_pos = v7_inpOff + 64;
  int v16_pos = v7_inpOff + 96;
  int v17_i = 0;
  l1: {
    l0: while(true) {
      boolean v18 = v17_i < 83;
      if (!v18) break l1;
      ByteVector v19 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v13_pos);
      ByteVector v20 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v21 = v19.compare(VectorOperators.EQ, v20);
      long v22 = v21.toLong();
      int v23 = (int) v22;
      ByteVector v24 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v14_pos);
      ByteVector v25 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v26 = v24.compare(VectorOperators.EQ, v25);
      long v27 = v26.toLong();
      int v28 = (int) v27;
      ByteVector v29 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v15_pos);
      ByteVector v30 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v31 = v29.compare(VectorOperators.EQ, v30);
      long v32 = v31.toLong();
      int v33 = (int) v32;
      ByteVector v34 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v16_pos);
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
      int v46 = v13_pos + v45;
      v1_bufdata[v8_pos] = v46;
      v39_m = v44_m2;
      int v48 = v40_m - 1;
      int v49_m2 = v40_m & v48;
      int v50 = Integer.numberOfTrailingZeros(v40_m);
      int v51 = v14_pos + v50;
      v1_bufdata[v9_pos] = v51;
      v40_m = v49_m2;
      int v53 = v41_m - 1;
      int v54_m2 = v41_m & v53;
      int v55 = Integer.numberOfTrailingZeros(v41_m);
      int v56 = v15_pos + v55;
      v1_bufdata[v10_pos] = v56;
      v41_m = v54_m2;
      int v58 = v42_m - 1;
      int v59_m2 = v42_m & v58;
      int v60 = Integer.numberOfTrailingZeros(v42_m);
      int v61 = v16_pos + v60;
      v1_bufdata[v11_pos] = v61;
      v42_m = v59_m2;
      int v63 = v39_m - 1;
      int v64_m2 = v39_m & v63;
      int v65 = v8_pos + 1;
      int v66 = Integer.numberOfTrailingZeros(v39_m);
      int v67 = v13_pos + v66;
      v1_bufdata[v65] = v67;
      v39_m = v64_m2;
      int v69 = v40_m - 1;
      int v70_m2 = v40_m & v69;
      int v71 = v9_pos + 1;
      int v72 = Integer.numberOfTrailingZeros(v40_m);
      int v73 = v14_pos + v72;
      v1_bufdata[v71] = v73;
      v40_m = v70_m2;
      int v75 = v41_m - 1;
      int v76_m2 = v41_m & v75;
      int v77 = v10_pos + 1;
      int v78 = Integer.numberOfTrailingZeros(v41_m);
      int v79 = v15_pos + v78;
      v1_bufdata[v77] = v79;
      v41_m = v76_m2;
      int v81 = v42_m - 1;
      int v82_m2 = v42_m & v81;
      int v83 = v11_pos + 1;
      int v84 = Integer.numberOfTrailingZeros(v42_m);
      int v85 = v16_pos + v84;
      v1_bufdata[v83] = v85;
      v42_m = v82_m2;
      int v87 = v39_m - 1;
      int v88_m2 = v39_m & v87;
      int v89 = v8_pos + 2;
      int v90 = Integer.numberOfTrailingZeros(v39_m);
      int v91 = v13_pos + v90;
      v1_bufdata[v89] = v91;
      v39_m = v88_m2;
      int v93 = v40_m - 1;
      int v94_m2 = v40_m & v93;
      int v95 = v9_pos + 2;
      int v96 = Integer.numberOfTrailingZeros(v40_m);
      int v97 = v14_pos + v96;
      v1_bufdata[v95] = v97;
      v40_m = v94_m2;
      int v99 = v41_m - 1;
      int v100_m2 = v41_m & v99;
      int v101 = v10_pos + 2;
      int v102 = Integer.numberOfTrailingZeros(v41_m);
      int v103 = v15_pos + v102;
      v1_bufdata[v101] = v103;
      v41_m = v100_m2;
      int v105 = v42_m - 1;
      int v106_m2 = v42_m & v105;
      int v107 = v11_pos + 2;
      int v108 = Integer.numberOfTrailingZeros(v42_m);
      int v109 = v16_pos + v108;
      v1_bufdata[v107] = v109;
      v42_m = v106_m2;
      int v111_pop = Integer.bitCount(v23);
      boolean v112 = v111_pop > 3;
      l4: {
        l2: {
          if (!v112) break l2;
          v8_pos = v8_pos + 3;
          l3: while(true) {
            int v113 = v39_m - 1;
            int v114_m2 = v39_m & v113;
            int v115 = Integer.numberOfTrailingZeros(v39_m);
            int v116 = v13_pos + v115;
            v1_bufdata[v8_pos] = v116;
            v39_m = v114_m2;
            v8_pos = v8_pos + 1;
            boolean v118 = v39_m != 0;
            if (v118) continue l3;
            break;
          }
          if (1==1) break l4;
        }
        v8_pos = v8_pos + v111_pop;
      }
      v13_pos = v13_pos + 128;
      int v119_pop = Integer.bitCount(v28);
      boolean v120 = v119_pop > 3;
      l7: {
        l5: {
          if (!v120) break l5;
          v9_pos = v9_pos + 3;
          l6: while(true) {
            int v121 = v40_m - 1;
            int v122_m2 = v40_m & v121;
            int v123 = Integer.numberOfTrailingZeros(v40_m);
            int v124 = v14_pos + v123;
            v1_bufdata[v9_pos] = v124;
            v40_m = v122_m2;
            v9_pos = v9_pos + 1;
            boolean v126 = v40_m != 0;
            if (v126) continue l6;
            break;
          }
          if (1==1) break l7;
        }
        v9_pos = v9_pos + v119_pop;
      }
      v14_pos = v14_pos + 128;
      int v127_pop = Integer.bitCount(v33);
      boolean v128 = v127_pop > 3;
      l10: {
        l8: {
          if (!v128) break l8;
          v10_pos = v10_pos + 3;
          l9: while(true) {
            int v129 = v41_m - 1;
            int v130_m2 = v41_m & v129;
            int v131 = Integer.numberOfTrailingZeros(v41_m);
            int v132 = v15_pos + v131;
            v1_bufdata[v10_pos] = v132;
            v41_m = v130_m2;
            v10_pos = v10_pos + 1;
            boolean v134 = v41_m != 0;
            if (v134) continue l9;
            break;
          }
          if (1==1) break l10;
        }
        v10_pos = v10_pos + v127_pop;
      }
      v15_pos = v15_pos + 128;
      int v135_pop = Integer.bitCount(v38);
      boolean v136 = v135_pop > 3;
      l13: {
        l11: {
          if (!v136) break l11;
          v11_pos = v11_pos + 3;
          l12: while(true) {
            int v137 = v42_m - 1;
            int v138_m2 = v42_m & v137;
            int v139 = Integer.numberOfTrailingZeros(v42_m);
            int v140 = v16_pos + v139;
            v1_bufdata[v11_pos] = v140;
            v42_m = v138_m2;
            v11_pos = v11_pos + 1;
            boolean v142 = v42_m != 0;
            if (v142) continue l12;
            break;
          }
          if (1==1) break l13;
        }
        v11_pos = v11_pos + v135_pop;
      }
      v16_pos = v16_pos + 128;
      v17_i = v17_i + 1;
      if (1==1) continue l0;
      break;
    }
  }
  int v143_semi = 0;
  boolean v144 = 0 != v8_pos;
  l14: {
    if (!v144) break l14;
    v143_semi = v1_bufdata[0];
  }
  boolean v145 = 1004 != v9_pos;
  l15: {
    if (!v145) break l15;
    v143_semi = v1_bufdata[1004];
  }
  boolean v146 = 2008 != v10_pos;
  l16: {
    if (!v146) break l16;
    v143_semi = v1_bufdata[2008];
  }
  boolean v147 = 3012 != v11_pos;
  l17: {
    if (!v147) break l17;
    v143_semi = v1_bufdata[3012];
  }
  v12_bufEnds[0] = v8_pos;
  int v149 = v143_semi + 1;
  v1_bufdata[v8_pos] = v149;
  int v151 = v8_pos + 1;
  int v152 = v143_semi + 1;
  v1_bufdata[v151] = v152;
  int v154 = v8_pos + 2;
  int v155 = v143_semi + 1;
  v1_bufdata[v154] = v155;
  int v157 = v8_pos + 3;
  int v158 = v143_semi + 1;
  v1_bufdata[v157] = v158;
  v12_bufEnds[1] = v9_pos;
  int v161 = v143_semi + 1;
  v1_bufdata[v9_pos] = v161;
  int v163 = v9_pos + 1;
  int v164 = v143_semi + 1;
  v1_bufdata[v163] = v164;
  int v166 = v9_pos + 2;
  int v167 = v143_semi + 1;
  v1_bufdata[v166] = v167;
  int v169 = v9_pos + 3;
  int v170 = v143_semi + 1;
  v1_bufdata[v169] = v170;
  v12_bufEnds[2] = v10_pos;
  int v173 = v143_semi + 1;
  v1_bufdata[v10_pos] = v173;
  int v175 = v10_pos + 1;
  int v176 = v143_semi + 1;
  v1_bufdata[v175] = v176;
  int v178 = v10_pos + 2;
  int v179 = v143_semi + 1;
  v1_bufdata[v178] = v179;
  int v181 = v10_pos + 3;
  int v182 = v143_semi + 1;
  v1_bufdata[v181] = v182;
  v12_bufEnds[3] = v11_pos;
  int v185 = v143_semi + 1;
  v1_bufdata[v11_pos] = v185;
  int v187 = v11_pos + 1;
  int v188 = v143_semi + 1;
  v1_bufdata[v187] = v188;
  int v190 = v11_pos + 2;
  int v191 = v143_semi + 1;
  v1_bufdata[v190] = v191;
  int v193 = v11_pos + 3;
  int v194 = v143_semi + 1;
  v1_bufdata[v193] = v194;
  short[] v196_temp_buf = arr_2;
  int[] v197_failbuf = arr_3;
  int v198_failposS = 0;
  int v199_failposC = 0;
  int v200_i = 0;
  l19: {
    l18: while(true) {
      boolean v201 = v200_i < 4;
      if (!v201) break l19;
      int v202_bufS = v200_i * 1004;
      int v203_bufE = v12_bufEnds[v200_i];
      int v204_retctr = 0;
      l20: {
        l22: {
          l21: while(true) {
            boolean v205 = v202_bufS < v203_bufE;
            if (!v205) break l22;
            int v206 = v203_bufE - v202_bufS;
            IntVector v207_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_bufdata, v202_bufS);
            int v208 = v207_idxs.lane(0);
            int v209 = 1 + v208;
            ByteVector v210 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v209);
            LongVector v211 = v210.reinterpretAsLongs();
            long v212 = v211.lane(0);
            int v213 = v207_idxs.lane(1);
            int v214 = 1 + v213;
            ByteVector v215 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v214);
            LongVector v216 = v215.reinterpretAsLongs();
            long v217 = v216.lane(0);
            int v218 = v207_idxs.lane(2);
            int v219 = 1 + v218;
            ByteVector v220 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v219);
            LongVector v221 = v220.reinterpretAsLongs();
            long v222 = v221.lane(0);
            int v223 = v207_idxs.lane(3);
            int v224 = 1 + v223;
            ByteVector v225 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v224);
            LongVector v226 = v225.reinterpretAsLongs();
            long v227 = v226.lane(0);
            long[] v228 = arr_4;
            v228[0] = v212;
            v228[1] = v217;
            v228[2] = v222;
            v228[3] = v227;
            LongVector v233 = (LongVector) LongVector.SPECIES_256.fromArray(v228, 0);
            ByteVector v234_nums = v233.reinterpretAsBytes();
            ByteVector v235 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
            VectorMask<?> v236 = v234_nums.compare(VectorOperators.EQ, v235);
            ByteVector v237 = (ByteVector) v236.toVector();
            ByteVector v238 = (v237);
            IntVector v239 = v238.reinterpretAsInts();
            IntVector v240 = v239.lanewise(VectorOperators.ASHR, 20);
            ByteVector v241 = v240.reinterpretAsBytes();
            LongVector v242 = v241.reinterpretAsLongs();
            LongVector v243 = (LongVector) LongVector.SPECIES_256.broadcast(24L);
            LongVector v244 = v242.and(v243);
            ByteVector v245_off = v244.reinterpretAsBytes();
            LongVector v246 = (LongVector) LongVector.SPECIES_256.broadcast(40L);
            LongVector v247 = v245_off.reinterpretAsLongs();
            LongVector v248 = v246.sub(v247);
            ByteVector v249 = v248.reinterpretAsBytes();
            LongVector v250 = v234_nums.reinterpretAsLongs();
            LongVector v251 = v249.reinterpretAsLongs();
            LongVector v252 = v250.lanewise(VectorOperators.LSHL, v251);
            v234_nums = v252.reinterpretAsBytes();
            ByteVector v253 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
            ByteVector v254 = v234_nums.sub(v253);
            ByteVector v255 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
            ByteVector v256_aligned = v254.max(v255);
            ShortVector v257 = v256_aligned.reinterpretAsShorts();
            IntVector v258 = v257.reinterpretAsInts();
            IntVector v259 = (IntVector) IntVector.SPECIES_256.broadcast(255);
            IntVector v260 = v258.and(v259);
            ShortVector v261 = v260.reinterpretAsShorts();
            ShortVector v262 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)100);
            ShortVector v263_r = v261.mul(v262);
            ShortVector v264 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)10);
            ShortVector v265 = v257.mul(v264);
            ShortVector v266 = v265.lanewise(VectorOperators.LSHR, 8);
            v263_r = v263_r.add(v266);
            IntVector v267 = v257.reinterpretAsInts();
            IntVector v268 = v267.lanewise(VectorOperators.LSHR, 24);
            ShortVector v269 = v268.reinterpretAsShorts();
            v263_r = v263_r.add(v269);
            ShortVector v270 = (v263_r);
            ByteVector v271 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
            VectorMask<?> v272 = v234_nums.compare(VectorOperators.EQ, v271);
            ByteVector v273 = (ByteVector) v272.toVector();
            LongVector v274 = v273.reinterpretAsLongs();
            LongVector v275 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
            VectorMask<?> v276 = v274.compare(VectorOperators.NE, v275);
            LongVector v277 = (LongVector) v276.toVector();
            ByteVector v278 = v277.reinterpretAsBytes();
            ShortVector v279_neg = v278.reinterpretAsShorts();
            ShortVector v280_each16n = v270.lanewise(VectorOperators.XOR, v279_neg);
            v280_each16n = v280_each16n.sub(v279_neg);
            v280_each16n.intoArray(v196_temp_buf, 0);
            int v282_i = 0;
            l24: {
              l23: while(true) {
                boolean v283 = v282_i < 4;
                if (!v283) break l24;
                int v284 = v282_i * 1;
                int v285 = v202_bufS + v284;
                int v286_off = v1_bufdata[v285];
                int v287 = v286_off - 16;
                ByteVector v288 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v287);
                ByteVector v289 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                VectorMask<?> v290 = v288.compare(VectorOperators.EQ, v289);
                long v291 = v290.toLong();
                short v292_mc = (short) v291;
                int v293_c = 16;
                boolean v294 = v292_mc != (short)0;
                l25: {
                  if (!v294) break l25;
                  int v295 = (int) v292_mc;
                  int v296 = v295 & 65535;
                  int v297 = Integer.numberOfLeadingZeros(v296);
                  v293_c = v297 - 16;
                }
                ByteVector v298 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v293_c);
                ByteVector v299 = v288.and(v298);
                IntVector v300_hv = v299.reinterpretAsInts();
                LongVector v301 = v300_hv.reinterpretAsLongs();
                long v302 = v301.lane(1);
                LongVector v303 = (LongVector) LongVector.SPECIES_128.broadcast(v302);
                IntVector v304 = v303.reinterpretAsInts();
                v300_hv = v300_hv.lanewise(VectorOperators.XOR, v304);
                LongVector v305 = v300_hv.reinterpretAsLongs();
                LongVector v306 = v305.lanewise(VectorOperators.LSHR, 32);
                IntVector v307 = v306.reinterpretAsInts();
                v300_hv = v300_hv.lanewise(VectorOperators.XOR, v307);
                IntVector v308 = (v300_hv);
                IntVector v309 = v308.lanewise(VectorOperators.ASHR, 16);
                IntVector v310 = (v309);
                v300_hv = v300_hv.lanewise(VectorOperators.XOR, v310);
                IntVector v311_hv = v300_hv;
                boolean v312 = v284 >= v206;
                l26: {
                  if (!v312) break l26;
                  if (1==1) break l20;
                }
                int v313_hash = v311_hv.lane(0);
                int v314 = v313_hash & v2_hash_mask;
                int v315_idx = (int) v314;
                IntVector v316 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v315_idx);
                IntVector v317 = (IntVector) IntVector.SPECIES_128.broadcast(v313_hash);
                VectorMask<?> v318 = v317.compare(VectorOperators.EQ, v316);
                long v319 = v318.toLong();
                byte v320_m = (byte) v319;
                boolean v321 = v320_m == (byte)0;
                l29: {
                  l27: {
                    if (!v321) break l27;
                    boolean v322 = v284 >= v206;
                    l28: {
                      if (!v322) break l28;
                      if (1==1) break l20;
                    }
                    int v323 = v202_bufS + v284;
                    int v324 = v1_bufdata[v323];
                    v197_failbuf[v199_failposC] = v324;
                    int v326 = v199_failposC + 1;
                    int v327 = v284 * 4;
                    int v328 = v327 + 2;
                    short v329 = v196_temp_buf[v328];
                    int v330 = (int) v329;
                    v197_failbuf[v326] = v330;
                    v199_failposC = v199_failposC + 2;
                    if (1==1) break l29;
                  }
                  int v332 = Integer.numberOfTrailingZeros(v320_m);
                  v315_idx = v315_idx + v332;
                  int v333 = v315_idx * 16;
                  ByteVector v334_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v333);
                  boolean v335 = v334_exp.equals(v299);
                  boolean v336 = !(v335);
                  l32: {
                    l30: {
                      if (!v336) break l30;
                      boolean v337 = v284 >= v206;
                      l31: {
                        if (!v337) break l31;
                        if (1==1) break l20;
                      }
                      int v338 = v202_bufS + v284;
                      int v339 = v1_bufdata[v338];
                      v197_failbuf[v199_failposC] = v339;
                      int v341 = v199_failposC + 1;
                      int v342 = v284 * 4;
                      int v343 = v342 + 2;
                      short v344 = v196_temp_buf[v343];
                      int v345 = (int) v344;
                      v197_failbuf[v341] = v345;
                      v199_failposC = v199_failposC + 2;
                      if (1==1) break l32;
                    }
                    int v347_dataoff = v315_idx * 4;
                    int v348 = v284 * 4;
                    int v349 = v348 + 2;
                    short v350 = v196_temp_buf[v349];
                    long v351_temp = (long) v350;
                    int v352 = v347_dataoff + 2;
                    long v353 = v5_map_data[v352];
                    long v354 = Math.min(v353, v351_temp);
                    v5_map_data[v352] = v354;
                    int v356 = v347_dataoff + 3;
                    long v357 = v5_map_data[v356];
                    long v358 = Math.max(v357, v351_temp);
                    v5_map_data[v356] = v358;
                    long v360 = v5_map_data[v347_dataoff];
                    long v361 = v360 + v351_temp;
                    v5_map_data[v347_dataoff] = v361;
                    int v363 = v347_dataoff + 1;
                    long v364 = v5_map_data[v363];
                    long v365 = v364 + 1L;
                    v5_map_data[v363] = v365;
                  }
                }
                v282_i = v282_i + 1;
                if (1==1) continue l23;
                break;
              }
            }
            v202_bufS = v202_bufS + 4;
            if (1==1) continue l21;
            break;
          }
        }
      }
      v200_i = v200_i + 1;
      if (1==1) continue l18;
      break;
    }
  }
  l34: {
    l33: while(true) {
      boolean v367 = v198_failposS < v199_failposC;
      if (!v367) break l34;
      int v368 = v197_failbuf[v198_failposS];
      int v369 = v198_failposS + 1;
      int v370 = v197_failbuf[v369];
      v198_failposS = v198_failposS + 2;
      int v371 = v368 - 16;
      ByteVector v372 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v371);
      ByteVector v373 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
      VectorMask<?> v374 = v372.compare(VectorOperators.EQ, v373);
      long v375 = v374.toLong();
      short v376_m = (short) v375;
      boolean v377 = v376_m == (short)0;
      l37: {
        l35: {
          if (!v377) break l35;
          int v378_start = v368;
          l36: while(true) {
            v378_start = v378_start - 16;
            int v379 = v378_start - 16;
            ByteVector v380 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v379);
            ByteVector v381 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v382 = v380.compare(VectorOperators.EQ, v381);
            long v383 = v382.toLong();
            v376_m = (short) v383;
            boolean v384 = v376_m == (short)0;
            if (v384) continue l36;
            break;
          }
          int v385 = (int) v376_m;
          int v386 = v385 & 65535;
          int v387 = Integer.numberOfLeadingZeros(v386);
          int v388 = v387 - 16;
          int v389 = v378_start - v388;
          main.Main.failed_long(v0_ident, v389, v368, v370);
          if (1==1) break l37;
        }
        int v391 = (int) v376_m;
        int v392 = v391 & 65535;
        int v393 = Integer.numberOfLeadingZeros(v392);
        int v394_c = v393 - 16;
        int v395 = v368 - v394_c;
        ByteVector v396 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v394_c);
        ByteVector v397 = v372.and(v396);
        IntVector v398_hv = v397.reinterpretAsInts();
        LongVector v399 = v398_hv.reinterpretAsLongs();
        long v400 = v399.lane(1);
        LongVector v401 = (LongVector) LongVector.SPECIES_128.broadcast(v400);
        IntVector v402 = v401.reinterpretAsInts();
        v398_hv = v398_hv.lanewise(VectorOperators.XOR, v402);
        LongVector v403 = v398_hv.reinterpretAsLongs();
        LongVector v404 = v403.lanewise(VectorOperators.LSHR, 32);
        IntVector v405 = v404.reinterpretAsInts();
        v398_hv = v398_hv.lanewise(VectorOperators.XOR, v405);
        IntVector v406 = (v398_hv);
        IntVector v407 = v406.lanewise(VectorOperators.ASHR, 16);
        IntVector v408 = (v407);
        v398_hv = v398_hv.lanewise(VectorOperators.XOR, v408);
        int v409 = v398_hv.lane(0);
        main.Main.failed_short(v0_ident, v395, v368, v370, v409);
      }
      if (1==1) continue l33;
      break;
    }
  }
  return;
}
public void minibench(byte[] v0_ai8, short[] v1_ai16, int[] v2_ai32, long[] v3_ai64) {
  VectorShuffle<Integer> v9 = IntVector.SPECIES_256.shuffleFromValues(0, 0, 0, 0, 4, 4, 4, 4);
  VectorShuffle<Integer> v12 = IntVector.SPECIES_256.shuffleFromValues(0, 0, 0, 0, 4, 4, 4, 4);
  VectorShuffle<Integer> v15 = IntVector.SPECIES_256.shuffleFromValues(0, 0, 0, 0, 4, 4, 4, 4);
  VectorShuffle<Integer> v18 = IntVector.SPECIES_256.shuffleFromValues(0, 0, 0, 0, 4, 4, 4, 4);
  int v4_i = 0;
  l1: {
    l0: while(true) {
      boolean v5 = v4_i < 1000;
      if (!v5) break l1;
      int v6 = v4_i * 8;
      IntVector v7_v = (IntVector) IntVector.SPECIES_256.fromArray(v2_ai32, v6);
      IntVector v8 = (v7_v);
      IntVector v10 = v8.rearrange(v9);
      v7_v = (v10);
      IntVector v11 = (v7_v);
      IntVector v13 = v11.rearrange(v12);
      v7_v = (v13);
      IntVector v14 = (v7_v);
      IntVector v16 = v14.rearrange(v15);
      v7_v = (v16);
      IntVector v17 = (v7_v);
      IntVector v19 = v17.rearrange(v18);
      v7_v = (v19);
      v7_v.intoArray(v2_ai32, v6);
      v4_i = v4_i + 1;
      if (1==1) continue l0;
      break;
    }
  }
  return;
}
// todo export
// todo export
// todo export
// todo export
// todo export

}
