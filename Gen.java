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
            int v207_off = v1_bufdata[v202_bufS];
            int v208 = v207_off - 16;
            ByteVector v209 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v208);
            ByteVector v210 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v211 = v209.compare(VectorOperators.EQ, v210);
            long v212 = v211.toLong();
            short v213_mc = (short) v212;
            int v214_c = 16;
            boolean v215 = v213_mc != (short)0;
            l23: {
              if (!v215) break l23;
              int v216 = (int) v213_mc;
              int v217 = v216 & 65535;
              int v218 = Integer.numberOfLeadingZeros(v217);
              v214_c = v218 - 16;
            }
            ByteVector v219 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v214_c);
            ByteVector v220 = v209.and(v219);
            int v221 = v202_bufS + 1;
            int v222_off = v1_bufdata[v221];
            int v223 = v222_off - 16;
            ByteVector v224 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v223);
            ByteVector v225 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v226 = v224.compare(VectorOperators.EQ, v225);
            long v227 = v226.toLong();
            short v228_mc = (short) v227;
            int v229_c = 16;
            boolean v230 = v228_mc != (short)0;
            l24: {
              if (!v230) break l24;
              int v231 = (int) v228_mc;
              int v232 = v231 & 65535;
              int v233 = Integer.numberOfLeadingZeros(v232);
              v229_c = v233 - 16;
            }
            ByteVector v234 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v229_c);
            ByteVector v235 = v224.and(v234);
            int v236 = v202_bufS + 2;
            int v237_off = v1_bufdata[v236];
            int v238 = v237_off - 16;
            ByteVector v239 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v238);
            ByteVector v240 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v241 = v239.compare(VectorOperators.EQ, v240);
            long v242 = v241.toLong();
            short v243_mc = (short) v242;
            int v244_c = 16;
            boolean v245 = v243_mc != (short)0;
            l25: {
              if (!v245) break l25;
              int v246 = (int) v243_mc;
              int v247 = v246 & 65535;
              int v248 = Integer.numberOfLeadingZeros(v247);
              v244_c = v248 - 16;
            }
            ByteVector v249 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v244_c);
            ByteVector v250 = v239.and(v249);
            int v251 = v202_bufS + 3;
            int v252_off = v1_bufdata[v251];
            int v253 = v252_off - 16;
            ByteVector v254 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v253);
            ByteVector v255 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v256 = v254.compare(VectorOperators.EQ, v255);
            long v257 = v256.toLong();
            short v258_mc = (short) v257;
            int v259_c = 16;
            boolean v260 = v258_mc != (short)0;
            l26: {
              if (!v260) break l26;
              int v261 = (int) v258_mc;
              int v262 = v261 & 65535;
              int v263 = Integer.numberOfLeadingZeros(v262);
              v259_c = v263 - 16;
            }
            ByteVector v264 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v259_c);
            ByteVector v265 = v254.and(v264);
            IntVector v266_hv = v220.reinterpretAsInts();
            LongVector v267 = v266_hv.reinterpretAsLongs();
            long v268 = v267.lane(1);
            LongVector v269 = (LongVector) LongVector.SPECIES_128.broadcast(v268);
            IntVector v270 = v269.reinterpretAsInts();
            v266_hv = v266_hv.lanewise(VectorOperators.XOR, v270);
            LongVector v271 = v266_hv.reinterpretAsLongs();
            LongVector v272 = v271.lanewise(VectorOperators.LSHR, 32);
            IntVector v273 = v272.reinterpretAsInts();
            v266_hv = v266_hv.lanewise(VectorOperators.XOR, v273);
            IntVector v274 = (v266_hv);
            IntVector v275 = v274.lanewise(VectorOperators.ASHR, 16);
            IntVector v276 = (v275);
            v266_hv = v266_hv.lanewise(VectorOperators.XOR, v276);
            IntVector v277_hv = v235.reinterpretAsInts();
            LongVector v278 = v277_hv.reinterpretAsLongs();
            long v279 = v278.lane(1);
            LongVector v280 = (LongVector) LongVector.SPECIES_128.broadcast(v279);
            IntVector v281 = v280.reinterpretAsInts();
            v277_hv = v277_hv.lanewise(VectorOperators.XOR, v281);
            LongVector v282 = v277_hv.reinterpretAsLongs();
            LongVector v283 = v282.lanewise(VectorOperators.LSHR, 32);
            IntVector v284 = v283.reinterpretAsInts();
            v277_hv = v277_hv.lanewise(VectorOperators.XOR, v284);
            IntVector v285 = (v277_hv);
            IntVector v286 = v285.lanewise(VectorOperators.ASHR, 16);
            IntVector v287 = (v286);
            v277_hv = v277_hv.lanewise(VectorOperators.XOR, v287);
            IntVector v288_hv = v250.reinterpretAsInts();
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
            IntVector v299_hv = v265.reinterpretAsInts();
            LongVector v300 = v299_hv.reinterpretAsLongs();
            long v301 = v300.lane(1);
            LongVector v302 = (LongVector) LongVector.SPECIES_128.broadcast(v301);
            IntVector v303 = v302.reinterpretAsInts();
            v299_hv = v299_hv.lanewise(VectorOperators.XOR, v303);
            LongVector v304 = v299_hv.reinterpretAsLongs();
            LongVector v305 = v304.lanewise(VectorOperators.LSHR, 32);
            IntVector v306 = v305.reinterpretAsInts();
            v299_hv = v299_hv.lanewise(VectorOperators.XOR, v306);
            IntVector v307 = (v299_hv);
            IntVector v308 = v307.lanewise(VectorOperators.ASHR, 16);
            IntVector v309 = (v308);
            v299_hv = v299_hv.lanewise(VectorOperators.XOR, v309);
            int v310_hash = v266_hv.lane(0);
            int v311 = v310_hash & v2_hash_mask;
            int v312_idx = (int) v311;
            IntVector v313 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v312_idx);
            IntVector v314 = (IntVector) IntVector.SPECIES_128.broadcast(v310_hash);
            VectorMask<?> v315 = v314.compare(VectorOperators.EQ, v313);
            long v316 = v315.toLong();
            byte v317_m = (byte) v316;
            int v318 = Integer.numberOfTrailingZeros(v317_m);
            int v319 = v312_idx + v318;
            int v320_hash = v277_hv.lane(0);
            int v321 = v320_hash & v2_hash_mask;
            int v322_idx = (int) v321;
            IntVector v323 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v322_idx);
            IntVector v324 = (IntVector) IntVector.SPECIES_128.broadcast(v320_hash);
            VectorMask<?> v325 = v324.compare(VectorOperators.EQ, v323);
            long v326 = v325.toLong();
            byte v327_m = (byte) v326;
            int v328 = Integer.numberOfTrailingZeros(v327_m);
            int v329 = v322_idx + v328;
            int v330_hash = v288_hv.lane(0);
            int v331 = v330_hash & v2_hash_mask;
            int v332_idx = (int) v331;
            IntVector v333 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v332_idx);
            IntVector v334 = (IntVector) IntVector.SPECIES_128.broadcast(v330_hash);
            VectorMask<?> v335 = v334.compare(VectorOperators.EQ, v333);
            long v336 = v335.toLong();
            byte v337_m = (byte) v336;
            int v338 = Integer.numberOfTrailingZeros(v337_m);
            int v339 = v332_idx + v338;
            int v340_hash = v299_hv.lane(0);
            int v341 = v340_hash & v2_hash_mask;
            int v342_idx = (int) v341;
            IntVector v343 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v342_idx);
            IntVector v344 = (IntVector) IntVector.SPECIES_128.broadcast(v340_hash);
            VectorMask<?> v345 = v344.compare(VectorOperators.EQ, v343);
            long v346 = v345.toLong();
            byte v347_m = (byte) v346;
            int v348 = Integer.numberOfTrailingZeros(v347_m);
            int v349 = v342_idx + v348;
            int v350 = v319 * 16;
            ByteVector v351 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v350);
            int v352 = v329 * 16;
            ByteVector v353 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v352);
            int v354 = v339 * 16;
            ByteVector v355 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v354);
            int v356 = v349 * 16;
            ByteVector v357 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v356);
            IntVector v358_num_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_bufdata, v202_bufS);
            int v359 = v358_num_idxs.lane(0);
            int v360 = 1 + v359;
            ByteVector v361 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v360);
            LongVector v362 = v361.reinterpretAsLongs();
            long v363 = v362.lane(0);
            int v364 = v358_num_idxs.lane(1);
            int v365 = 1 + v364;
            ByteVector v366 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v365);
            LongVector v367 = v366.reinterpretAsLongs();
            long v368 = v367.lane(0);
            int v369 = v358_num_idxs.lane(2);
            int v370 = 1 + v369;
            ByteVector v371 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v370);
            LongVector v372 = v371.reinterpretAsLongs();
            long v373 = v372.lane(0);
            int v374 = v358_num_idxs.lane(3);
            int v375 = 1 + v374;
            ByteVector v376 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v375);
            LongVector v377 = v376.reinterpretAsLongs();
            long v378 = v377.lane(0);
            long[] v379 = arr_4;
            v379[0] = v363;
            v379[1] = v368;
            v379[2] = v373;
            v379[3] = v378;
            LongVector v384 = (LongVector) LongVector.SPECIES_256.fromArray(v379, 0);
            ByteVector v385_nums = v384.reinterpretAsBytes();
            ByteVector v386 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
            VectorMask<?> v387 = v385_nums.compare(VectorOperators.EQ, v386);
            ByteVector v388 = (ByteVector) v387.toVector();
            ByteVector v389 = (v388);
            IntVector v390 = v389.reinterpretAsInts();
            IntVector v391 = v390.lanewise(VectorOperators.ASHR, 20);
            ByteVector v392 = v391.reinterpretAsBytes();
            LongVector v393 = v392.reinterpretAsLongs();
            LongVector v394 = (LongVector) LongVector.SPECIES_256.broadcast(24L);
            LongVector v395 = v393.and(v394);
            ByteVector v396_off = v395.reinterpretAsBytes();
            LongVector v397 = (LongVector) LongVector.SPECIES_256.broadcast(40L);
            LongVector v398 = v396_off.reinterpretAsLongs();
            LongVector v399 = v397.sub(v398);
            ByteVector v400 = v399.reinterpretAsBytes();
            LongVector v401 = v385_nums.reinterpretAsLongs();
            LongVector v402 = v400.reinterpretAsLongs();
            LongVector v403 = v401.lanewise(VectorOperators.LSHL, v402);
            v385_nums = v403.reinterpretAsBytes();
            ByteVector v404 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
            ByteVector v405 = v385_nums.sub(v404);
            ByteVector v406 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
            ByteVector v407_aligned = v405.max(v406);
            ShortVector v408 = v407_aligned.reinterpretAsShorts();
            IntVector v409 = v408.reinterpretAsInts();
            IntVector v410 = (IntVector) IntVector.SPECIES_256.broadcast(255);
            IntVector v411 = v409.and(v410);
            ShortVector v412 = v411.reinterpretAsShorts();
            ShortVector v413 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)100);
            ShortVector v414_r = v412.mul(v413);
            ShortVector v415 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)10);
            ShortVector v416 = v408.mul(v415);
            ShortVector v417 = v416.lanewise(VectorOperators.LSHR, 8);
            v414_r = v414_r.add(v417);
            IntVector v418 = v408.reinterpretAsInts();
            IntVector v419 = v418.lanewise(VectorOperators.LSHR, 24);
            ShortVector v420 = v419.reinterpretAsShorts();
            v414_r = v414_r.add(v420);
            ShortVector v421 = (v414_r);
            ByteVector v422 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
            VectorMask<?> v423 = v385_nums.compare(VectorOperators.EQ, v422);
            ByteVector v424 = (ByteVector) v423.toVector();
            LongVector v425 = v424.reinterpretAsLongs();
            LongVector v426 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
            VectorMask<?> v427 = v425.compare(VectorOperators.NE, v426);
            LongVector v428 = (LongVector) v427.toVector();
            ByteVector v429 = v428.reinterpretAsBytes();
            ShortVector v430_neg = v429.reinterpretAsShorts();
            ShortVector v431_each16n = v421.lanewise(VectorOperators.XOR, v430_neg);
            v431_each16n = v431_each16n.sub(v430_neg);
            v431_each16n.intoArray(v196_temp_buf, 0);
            boolean v433 = v220.equals(v351);
            l28: {
              l27: {
                if (!v433) break l27;
                int v434_dataoff = v319 * 4;
                short v435 = v196_temp_buf[2];
                long v436_temp = (long) v435;
                int v437 = v434_dataoff + 2;
                long v438 = v5_map_data[v437];
                long v439 = Math.min(v438, v436_temp);
                v5_map_data[v437] = v439;
                int v441 = v434_dataoff + 3;
                long v442 = v5_map_data[v441];
                long v443 = Math.max(v442, v436_temp);
                v5_map_data[v441] = v443;
                long v445 = v5_map_data[v434_dataoff];
                long v446 = v445 + v436_temp;
                v5_map_data[v434_dataoff] = v446;
                int v448 = v434_dataoff + 1;
                long v449 = v5_map_data[v448];
                long v450 = v449 + 1L;
                v5_map_data[v448] = v450;
                if (1==1) break l28;
              }
              boolean v452 = 0 >= v206;
              l29: {
                if (!v452) break l29;
                if (1==1) break l20;
              }
              int v453 = v1_bufdata[v202_bufS];
              v197_failbuf[v199_failposC] = v453;
              int v455 = v199_failposC + 1;
              short v456 = v196_temp_buf[2];
              int v457 = (int) v456;
              v197_failbuf[v455] = v457;
              v199_failposC = v199_failposC + 2;
            }
            boolean v459 = v235.equals(v353);
            l31: {
              l30: {
                if (!v459) break l30;
                int v460_dataoff = v329 * 4;
                short v461 = v196_temp_buf[6];
                long v462_temp = (long) v461;
                int v463 = v460_dataoff + 2;
                long v464 = v5_map_data[v463];
                long v465 = Math.min(v464, v462_temp);
                v5_map_data[v463] = v465;
                int v467 = v460_dataoff + 3;
                long v468 = v5_map_data[v467];
                long v469 = Math.max(v468, v462_temp);
                v5_map_data[v467] = v469;
                long v471 = v5_map_data[v460_dataoff];
                long v472 = v471 + v462_temp;
                v5_map_data[v460_dataoff] = v472;
                int v474 = v460_dataoff + 1;
                long v475 = v5_map_data[v474];
                long v476 = v475 + 1L;
                v5_map_data[v474] = v476;
                if (1==1) break l31;
              }
              boolean v478 = 1 >= v206;
              l32: {
                if (!v478) break l32;
                if (1==1) break l20;
              }
              int v479 = v202_bufS + 1;
              int v480 = v1_bufdata[v479];
              v197_failbuf[v199_failposC] = v480;
              int v482 = v199_failposC + 1;
              short v483 = v196_temp_buf[6];
              int v484 = (int) v483;
              v197_failbuf[v482] = v484;
              v199_failposC = v199_failposC + 2;
            }
            boolean v486 = v250.equals(v355);
            l34: {
              l33: {
                if (!v486) break l33;
                int v487_dataoff = v339 * 4;
                short v488 = v196_temp_buf[10];
                long v489_temp = (long) v488;
                int v490 = v487_dataoff + 2;
                long v491 = v5_map_data[v490];
                long v492 = Math.min(v491, v489_temp);
                v5_map_data[v490] = v492;
                int v494 = v487_dataoff + 3;
                long v495 = v5_map_data[v494];
                long v496 = Math.max(v495, v489_temp);
                v5_map_data[v494] = v496;
                long v498 = v5_map_data[v487_dataoff];
                long v499 = v498 + v489_temp;
                v5_map_data[v487_dataoff] = v499;
                int v501 = v487_dataoff + 1;
                long v502 = v5_map_data[v501];
                long v503 = v502 + 1L;
                v5_map_data[v501] = v503;
                if (1==1) break l34;
              }
              boolean v505 = 2 >= v206;
              l35: {
                if (!v505) break l35;
                if (1==1) break l20;
              }
              int v506 = v202_bufS + 2;
              int v507 = v1_bufdata[v506];
              v197_failbuf[v199_failposC] = v507;
              int v509 = v199_failposC + 1;
              short v510 = v196_temp_buf[10];
              int v511 = (int) v510;
              v197_failbuf[v509] = v511;
              v199_failposC = v199_failposC + 2;
            }
            boolean v513 = v265.equals(v357);
            l37: {
              l36: {
                if (!v513) break l36;
                int v514_dataoff = v349 * 4;
                short v515 = v196_temp_buf[14];
                long v516_temp = (long) v515;
                int v517 = v514_dataoff + 2;
                long v518 = v5_map_data[v517];
                long v519 = Math.min(v518, v516_temp);
                v5_map_data[v517] = v519;
                int v521 = v514_dataoff + 3;
                long v522 = v5_map_data[v521];
                long v523 = Math.max(v522, v516_temp);
                v5_map_data[v521] = v523;
                long v525 = v5_map_data[v514_dataoff];
                long v526 = v525 + v516_temp;
                v5_map_data[v514_dataoff] = v526;
                int v528 = v514_dataoff + 1;
                long v529 = v5_map_data[v528];
                long v530 = v529 + 1L;
                v5_map_data[v528] = v530;
                if (1==1) break l37;
              }
              boolean v532 = 3 >= v206;
              l38: {
                if (!v532) break l38;
                if (1==1) break l20;
              }
              int v533 = v202_bufS + 3;
              int v534 = v1_bufdata[v533];
              v197_failbuf[v199_failposC] = v534;
              int v536 = v199_failposC + 1;
              short v537 = v196_temp_buf[14];
              int v538 = (int) v537;
              v197_failbuf[v536] = v538;
              v199_failposC = v199_failposC + 2;
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
  l40: {
    l39: while(true) {
      boolean v540 = v198_failposS < v199_failposC;
      if (!v540) break l40;
      int v541 = v197_failbuf[v198_failposS];
      int v542 = v198_failposS + 1;
      int v543 = v197_failbuf[v542];
      v198_failposS = v198_failposS + 2;
      int v544 = v541 - 16;
      ByteVector v545 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v544);
      ByteVector v546 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
      VectorMask<?> v547 = v545.compare(VectorOperators.EQ, v546);
      long v548 = v547.toLong();
      short v549_m = (short) v548;
      boolean v550 = v549_m == (short)0;
      l43: {
        l41: {
          if (!v550) break l41;
          int v551_start = v541;
          l42: while(true) {
            v551_start = v551_start - 16;
            int v552 = v551_start - 16;
            ByteVector v553 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v552);
            ByteVector v554 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v555 = v553.compare(VectorOperators.EQ, v554);
            long v556 = v555.toLong();
            v549_m = (short) v556;
            boolean v557 = v549_m == (short)0;
            if (v557) continue l42;
            break;
          }
          int v558 = (int) v549_m;
          int v559 = v558 & 65535;
          int v560 = Integer.numberOfLeadingZeros(v559);
          int v561 = v560 - 16;
          int v562 = v551_start - v561;
          main.Main.failed_long(v0_ident, v562, v541, v543);
          if (1==1) break l43;
        }
        int v564 = (int) v549_m;
        int v565 = v564 & 65535;
        int v566 = Integer.numberOfLeadingZeros(v565);
        int v567_c = v566 - 16;
        int v568 = v541 - v567_c;
        ByteVector v569 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v567_c);
        ByteVector v570 = v545.and(v569);
        IntVector v571_hv = v570.reinterpretAsInts();
        LongVector v572 = v571_hv.reinterpretAsLongs();
        long v573 = v572.lane(1);
        LongVector v574 = (LongVector) LongVector.SPECIES_128.broadcast(v573);
        IntVector v575 = v574.reinterpretAsInts();
        v571_hv = v571_hv.lanewise(VectorOperators.XOR, v575);
        LongVector v576 = v571_hv.reinterpretAsLongs();
        LongVector v577 = v576.lanewise(VectorOperators.LSHR, 32);
        IntVector v578 = v577.reinterpretAsInts();
        v571_hv = v571_hv.lanewise(VectorOperators.XOR, v578);
        IntVector v579 = (v571_hv);
        IntVector v580 = v579.lanewise(VectorOperators.ASHR, 16);
        IntVector v581 = (v580);
        v571_hv = v571_hv.lanewise(VectorOperators.XOR, v581);
        int v582 = v571_hv.lane(0);
        main.Main.failed_short(v0_ident, v568, v541, v543, v582);
      }
      if (1==1) continue l39;
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
