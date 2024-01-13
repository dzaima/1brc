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
  int v8_new = 0;
  int v9_new = 1004;
  int v10_new = 2008;
  int v11_new = 3012;
  int[] v12_bufEnds = arr_1;
  int v13_new = v7_inpOff;
  int v14_new = v7_inpOff + 32;
  int v15_new = v7_inpOff + 64;
  int v16_new = v7_inpOff + 96;
  int v17_i = 0;
  l1: {
    l0: while(true) {
      boolean v18 = v17_i < 83;
      if (!v18) break l1;
      ByteVector v19 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v13_new);
      ByteVector v20 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v21 = v19.compare(VectorOperators.EQ, v20);
      long v22 = v21.toLong();
      ByteVector v23 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v14_new);
      ByteVector v24 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v25 = v23.compare(VectorOperators.EQ, v24);
      long v26 = v25.toLong();
      ByteVector v27 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v15_new);
      ByteVector v28 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v29 = v27.compare(VectorOperators.EQ, v28);
      long v30 = v29.toLong();
      ByteVector v31 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v16_new);
      ByteVector v32 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v33 = v31.compare(VectorOperators.EQ, v32);
      long v34 = v33.toLong();
      long v35_new = v22;
      long v36_new = v26;
      long v37_new = v30;
      long v38_new = v34;
      long v39 = v35_new - 1L;
      long v40_m2 = v35_new & v39;
      int v41 = Long.numberOfTrailingZeros(v35_new);
      int v42 = v13_new + v41;
      v1_bufdata[v8_new] = v42;
      v35_new = v40_m2;
      long v44 = v36_new - 1L;
      long v45_m2 = v36_new & v44;
      int v46 = Long.numberOfTrailingZeros(v36_new);
      int v47 = v14_new + v46;
      v1_bufdata[v9_new] = v47;
      v36_new = v45_m2;
      long v49 = v37_new - 1L;
      long v50_m2 = v37_new & v49;
      int v51 = Long.numberOfTrailingZeros(v37_new);
      int v52 = v15_new + v51;
      v1_bufdata[v10_new] = v52;
      v37_new = v50_m2;
      long v54 = v38_new - 1L;
      long v55_m2 = v38_new & v54;
      int v56 = Long.numberOfTrailingZeros(v38_new);
      int v57 = v16_new + v56;
      v1_bufdata[v11_new] = v57;
      v38_new = v55_m2;
      long v59 = v35_new - 1L;
      long v60_m2 = v35_new & v59;
      int v61 = v8_new + 1;
      int v62 = Long.numberOfTrailingZeros(v35_new);
      int v63 = v13_new + v62;
      v1_bufdata[v61] = v63;
      v35_new = v60_m2;
      long v65 = v36_new - 1L;
      long v66_m2 = v36_new & v65;
      int v67 = v9_new + 1;
      int v68 = Long.numberOfTrailingZeros(v36_new);
      int v69 = v14_new + v68;
      v1_bufdata[v67] = v69;
      v36_new = v66_m2;
      long v71 = v37_new - 1L;
      long v72_m2 = v37_new & v71;
      int v73 = v10_new + 1;
      int v74 = Long.numberOfTrailingZeros(v37_new);
      int v75 = v15_new + v74;
      v1_bufdata[v73] = v75;
      v37_new = v72_m2;
      long v77 = v38_new - 1L;
      long v78_m2 = v38_new & v77;
      int v79 = v11_new + 1;
      int v80 = Long.numberOfTrailingZeros(v38_new);
      int v81 = v16_new + v80;
      v1_bufdata[v79] = v81;
      v38_new = v78_m2;
      long v83 = v35_new - 1L;
      long v84_m2 = v35_new & v83;
      int v85 = v8_new + 2;
      int v86 = Long.numberOfTrailingZeros(v35_new);
      int v87 = v13_new + v86;
      v1_bufdata[v85] = v87;
      v35_new = v84_m2;
      long v89 = v36_new - 1L;
      long v90_m2 = v36_new & v89;
      int v91 = v9_new + 2;
      int v92 = Long.numberOfTrailingZeros(v36_new);
      int v93 = v14_new + v92;
      v1_bufdata[v91] = v93;
      v36_new = v90_m2;
      long v95 = v37_new - 1L;
      long v96_m2 = v37_new & v95;
      int v97 = v10_new + 2;
      int v98 = Long.numberOfTrailingZeros(v37_new);
      int v99 = v15_new + v98;
      v1_bufdata[v97] = v99;
      v37_new = v96_m2;
      long v101 = v38_new - 1L;
      long v102_m2 = v38_new & v101;
      int v103 = v11_new + 2;
      int v104 = Long.numberOfTrailingZeros(v38_new);
      int v105 = v16_new + v104;
      v1_bufdata[v103] = v105;
      v38_new = v102_m2;
      int v107_pop = Long.bitCount(v22);
      boolean v108 = v107_pop > 3;
      l4: {
        l2: {
          if (!v108) break l2;
          v8_new = v8_new + 3;
          l3: while(true) {
            long v109 = v35_new - 1L;
            long v110_m2 = v35_new & v109;
            int v111 = Long.numberOfTrailingZeros(v35_new);
            int v112 = v13_new + v111;
            v1_bufdata[v8_new] = v112;
            v35_new = v110_m2;
            v8_new = v8_new + 1;
            boolean v114 = v35_new != 0L;
            if (v114) continue l3;
            break;
          }
          if (1==1) break l4;
        }
        v8_new = v8_new + v107_pop;
      }
      v13_new = v13_new + 128;
      int v115_pop = Long.bitCount(v26);
      boolean v116 = v115_pop > 3;
      l7: {
        l5: {
          if (!v116) break l5;
          v9_new = v9_new + 3;
          l6: while(true) {
            long v117 = v36_new - 1L;
            long v118_m2 = v36_new & v117;
            int v119 = Long.numberOfTrailingZeros(v36_new);
            int v120 = v14_new + v119;
            v1_bufdata[v9_new] = v120;
            v36_new = v118_m2;
            v9_new = v9_new + 1;
            boolean v122 = v36_new != 0L;
            if (v122) continue l6;
            break;
          }
          if (1==1) break l7;
        }
        v9_new = v9_new + v115_pop;
      }
      v14_new = v14_new + 128;
      int v123_pop = Long.bitCount(v30);
      boolean v124 = v123_pop > 3;
      l10: {
        l8: {
          if (!v124) break l8;
          v10_new = v10_new + 3;
          l9: while(true) {
            long v125 = v37_new - 1L;
            long v126_m2 = v37_new & v125;
            int v127 = Long.numberOfTrailingZeros(v37_new);
            int v128 = v15_new + v127;
            v1_bufdata[v10_new] = v128;
            v37_new = v126_m2;
            v10_new = v10_new + 1;
            boolean v130 = v37_new != 0L;
            if (v130) continue l9;
            break;
          }
          if (1==1) break l10;
        }
        v10_new = v10_new + v123_pop;
      }
      v15_new = v15_new + 128;
      int v131_pop = Long.bitCount(v34);
      boolean v132 = v131_pop > 3;
      l13: {
        l11: {
          if (!v132) break l11;
          v11_new = v11_new + 3;
          l12: while(true) {
            long v133 = v38_new - 1L;
            long v134_m2 = v38_new & v133;
            int v135 = Long.numberOfTrailingZeros(v38_new);
            int v136 = v16_new + v135;
            v1_bufdata[v11_new] = v136;
            v38_new = v134_m2;
            v11_new = v11_new + 1;
            boolean v138 = v38_new != 0L;
            if (v138) continue l12;
            break;
          }
          if (1==1) break l13;
        }
        v11_new = v11_new + v131_pop;
      }
      v16_new = v16_new + 128;
      v17_i = v17_i + 1;
      if (1==1) continue l0;
      break;
    }
  }
  int v139_semi = 0;
  boolean v140 = 0 != v8_new;
  l14: {
    if (!v140) break l14;
    v139_semi = v1_bufdata[0];
  }
  boolean v141 = 1004 != v9_new;
  l15: {
    if (!v141) break l15;
    v139_semi = v1_bufdata[1004];
  }
  boolean v142 = 2008 != v10_new;
  l16: {
    if (!v142) break l16;
    v139_semi = v1_bufdata[2008];
  }
  boolean v143 = 3012 != v11_new;
  l17: {
    if (!v143) break l17;
    v139_semi = v1_bufdata[3012];
  }
  v12_bufEnds[0] = v8_new;
  int v145 = v139_semi + 1;
  v1_bufdata[v8_new] = v145;
  int v147 = v8_new + 1;
  int v148 = v139_semi + 1;
  v1_bufdata[v147] = v148;
  int v150 = v8_new + 2;
  int v151 = v139_semi + 1;
  v1_bufdata[v150] = v151;
  int v153 = v8_new + 3;
  int v154 = v139_semi + 1;
  v1_bufdata[v153] = v154;
  v12_bufEnds[1] = v9_new;
  int v157 = v139_semi + 1;
  v1_bufdata[v9_new] = v157;
  int v159 = v9_new + 1;
  int v160 = v139_semi + 1;
  v1_bufdata[v159] = v160;
  int v162 = v9_new + 2;
  int v163 = v139_semi + 1;
  v1_bufdata[v162] = v163;
  int v165 = v9_new + 3;
  int v166 = v139_semi + 1;
  v1_bufdata[v165] = v166;
  v12_bufEnds[2] = v10_new;
  int v169 = v139_semi + 1;
  v1_bufdata[v10_new] = v169;
  int v171 = v10_new + 1;
  int v172 = v139_semi + 1;
  v1_bufdata[v171] = v172;
  int v174 = v10_new + 2;
  int v175 = v139_semi + 1;
  v1_bufdata[v174] = v175;
  int v177 = v10_new + 3;
  int v178 = v139_semi + 1;
  v1_bufdata[v177] = v178;
  v12_bufEnds[3] = v11_new;
  int v181 = v139_semi + 1;
  v1_bufdata[v11_new] = v181;
  int v183 = v11_new + 1;
  int v184 = v139_semi + 1;
  v1_bufdata[v183] = v184;
  int v186 = v11_new + 2;
  int v187 = v139_semi + 1;
  v1_bufdata[v186] = v187;
  int v189 = v11_new + 3;
  int v190 = v139_semi + 1;
  v1_bufdata[v189] = v190;
  short[] v192_temp_buf = arr_2;
  int[] v193_failbuf = arr_3;
  int v194_failposS = 0;
  int v195_failposC = 0;
  int v196_i = 0;
  l19: {
    l18: while(true) {
      boolean v197 = v196_i < 4;
      if (!v197) break l19;
      int v198_bufS = v196_i * 1004;
      int v199_bufE = v12_bufEnds[v196_i];
      int v200_retctr = 0;
      l20: {
        l22: {
          l21: while(true) {
            boolean v201 = v198_bufS < v199_bufE;
            if (!v201) break l22;
            int v202 = v199_bufE - v198_bufS;
            int v203_off = v1_bufdata[v198_bufS];
            int v204 = v203_off - 16;
            ByteVector v205 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v204);
            ByteVector v206 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v207 = v205.compare(VectorOperators.EQ, v206);
            long v208_mc = v207.toLong();
            int v209_c = 16;
            boolean v210 = v208_mc != 0L;
            l23: {
              if (!v210) break l23;
              int v211 = Long.numberOfLeadingZeros(v208_mc);
              v209_c = v211 - 48;
            }
            ByteVector v212 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v209_c);
            ByteVector v213 = v205.and(v212);
            int v214 = v198_bufS + 1;
            int v215_off = v1_bufdata[v214];
            int v216 = v215_off - 16;
            ByteVector v217 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v216);
            ByteVector v218 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v219 = v217.compare(VectorOperators.EQ, v218);
            long v220_mc = v219.toLong();
            int v221_c = 16;
            boolean v222 = v220_mc != 0L;
            l24: {
              if (!v222) break l24;
              int v223 = Long.numberOfLeadingZeros(v220_mc);
              v221_c = v223 - 48;
            }
            ByteVector v224 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v221_c);
            ByteVector v225 = v217.and(v224);
            int v226 = v198_bufS + 2;
            int v227_off = v1_bufdata[v226];
            int v228 = v227_off - 16;
            ByteVector v229 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v228);
            ByteVector v230 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v231 = v229.compare(VectorOperators.EQ, v230);
            long v232_mc = v231.toLong();
            int v233_c = 16;
            boolean v234 = v232_mc != 0L;
            l25: {
              if (!v234) break l25;
              int v235 = Long.numberOfLeadingZeros(v232_mc);
              v233_c = v235 - 48;
            }
            ByteVector v236 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v233_c);
            ByteVector v237 = v229.and(v236);
            int v238 = v198_bufS + 3;
            int v239_off = v1_bufdata[v238];
            int v240 = v239_off - 16;
            ByteVector v241 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v240);
            ByteVector v242 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v243 = v241.compare(VectorOperators.EQ, v242);
            long v244_mc = v243.toLong();
            int v245_c = 16;
            boolean v246 = v244_mc != 0L;
            l26: {
              if (!v246) break l26;
              int v247 = Long.numberOfLeadingZeros(v244_mc);
              v245_c = v247 - 48;
            }
            ByteVector v248 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v245_c);
            ByteVector v249 = v241.and(v248);
            IntVector v250_hv = v213.reinterpretAsInts();
            LongVector v251 = v250_hv.reinterpretAsLongs();
            long v252 = v251.lane(1);
            LongVector v253 = (LongVector) LongVector.SPECIES_128.broadcast(v252);
            IntVector v254 = v253.reinterpretAsInts();
            v250_hv = v250_hv.lanewise(VectorOperators.XOR, v254);
            LongVector v255 = v250_hv.reinterpretAsLongs();
            LongVector v256 = v255.lanewise(VectorOperators.LSHR, 32);
            IntVector v257 = v256.reinterpretAsInts();
            v250_hv = v250_hv.lanewise(VectorOperators.XOR, v257);
            IntVector v258 = (v250_hv);
            IntVector v259 = v258.lanewise(VectorOperators.ASHR, 16);
            IntVector v260 = (v259);
            v250_hv = v250_hv.lanewise(VectorOperators.XOR, v260);
            IntVector v261_hv = v225.reinterpretAsInts();
            LongVector v262 = v261_hv.reinterpretAsLongs();
            long v263 = v262.lane(1);
            LongVector v264 = (LongVector) LongVector.SPECIES_128.broadcast(v263);
            IntVector v265 = v264.reinterpretAsInts();
            v261_hv = v261_hv.lanewise(VectorOperators.XOR, v265);
            LongVector v266 = v261_hv.reinterpretAsLongs();
            LongVector v267 = v266.lanewise(VectorOperators.LSHR, 32);
            IntVector v268 = v267.reinterpretAsInts();
            v261_hv = v261_hv.lanewise(VectorOperators.XOR, v268);
            IntVector v269 = (v261_hv);
            IntVector v270 = v269.lanewise(VectorOperators.ASHR, 16);
            IntVector v271 = (v270);
            v261_hv = v261_hv.lanewise(VectorOperators.XOR, v271);
            IntVector v272_hv = v237.reinterpretAsInts();
            LongVector v273 = v272_hv.reinterpretAsLongs();
            long v274 = v273.lane(1);
            LongVector v275 = (LongVector) LongVector.SPECIES_128.broadcast(v274);
            IntVector v276 = v275.reinterpretAsInts();
            v272_hv = v272_hv.lanewise(VectorOperators.XOR, v276);
            LongVector v277 = v272_hv.reinterpretAsLongs();
            LongVector v278 = v277.lanewise(VectorOperators.LSHR, 32);
            IntVector v279 = v278.reinterpretAsInts();
            v272_hv = v272_hv.lanewise(VectorOperators.XOR, v279);
            IntVector v280 = (v272_hv);
            IntVector v281 = v280.lanewise(VectorOperators.ASHR, 16);
            IntVector v282 = (v281);
            v272_hv = v272_hv.lanewise(VectorOperators.XOR, v282);
            IntVector v283_hv = v249.reinterpretAsInts();
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
            int v294 = v250_hv.lane(0);
            int v295 = v261_hv.lane(0);
            int v296 = v272_hv.lane(0);
            int v297 = v283_hv.lane(0);
            int v298 = v294 & v2_hash_mask;
            int v299_idx = (int) v298;
            IntVector v300 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v299_idx);
            IntVector v301 = (IntVector) IntVector.SPECIES_128.broadcast(v294);
            VectorMask<?> v302 = v301.compare(VectorOperators.EQ, v300);
            long v303_m = v302.toLong();
            int v304 = Long.numberOfTrailingZeros(v303_m);
            int v305 = v299_idx + v304;
            int v306 = v295 & v2_hash_mask;
            int v307_idx = (int) v306;
            IntVector v308 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v307_idx);
            IntVector v309 = (IntVector) IntVector.SPECIES_128.broadcast(v295);
            VectorMask<?> v310 = v309.compare(VectorOperators.EQ, v308);
            long v311_m = v310.toLong();
            int v312 = Long.numberOfTrailingZeros(v311_m);
            int v313 = v307_idx + v312;
            int v314 = v296 & v2_hash_mask;
            int v315_idx = (int) v314;
            IntVector v316 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v315_idx);
            IntVector v317 = (IntVector) IntVector.SPECIES_128.broadcast(v296);
            VectorMask<?> v318 = v317.compare(VectorOperators.EQ, v316);
            long v319_m = v318.toLong();
            int v320 = Long.numberOfTrailingZeros(v319_m);
            int v321 = v315_idx + v320;
            int v322 = v297 & v2_hash_mask;
            int v323_idx = (int) v322;
            IntVector v324 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v323_idx);
            IntVector v325 = (IntVector) IntVector.SPECIES_128.broadcast(v297);
            VectorMask<?> v326 = v325.compare(VectorOperators.EQ, v324);
            long v327_m = v326.toLong();
            int v328 = Long.numberOfTrailingZeros(v327_m);
            int v329 = v323_idx + v328;
            int v330 = v305 * 16;
            ByteVector v331 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v330);
            int v332 = v313 * 16;
            ByteVector v333 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v332);
            int v334 = v321 * 16;
            ByteVector v335 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v334);
            int v336 = v329 * 16;
            ByteVector v337 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v336);
            IntVector v338_num_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_bufdata, v198_bufS);
            int v339 = v338_num_idxs.lane(0);
            int v340 = 1 + v339;
            ByteVector v341 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v340);
            LongVector v342 = v341.reinterpretAsLongs();
            long v343 = v342.lane(0);
            int v344 = v338_num_idxs.lane(1);
            int v345 = 1 + v344;
            ByteVector v346 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v345);
            LongVector v347 = v346.reinterpretAsLongs();
            long v348 = v347.lane(0);
            int v349 = v338_num_idxs.lane(2);
            int v350 = 1 + v349;
            ByteVector v351 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v350);
            LongVector v352 = v351.reinterpretAsLongs();
            long v353 = v352.lane(0);
            int v354 = v338_num_idxs.lane(3);
            int v355 = 1 + v354;
            ByteVector v356 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v355);
            LongVector v357 = v356.reinterpretAsLongs();
            long v358 = v357.lane(0);
            long[] v359 = arr_4;
            v359[0] = v343;
            v359[1] = v348;
            v359[2] = v353;
            v359[3] = v358;
            LongVector v364 = (LongVector) LongVector.SPECIES_256.fromArray(v359, 0);
            ByteVector v365_nums = v364.reinterpretAsBytes();
            ByteVector v366 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
            VectorMask<?> v367 = v365_nums.compare(VectorOperators.EQ, v366);
            ByteVector v368 = (ByteVector) v367.toVector();
            ByteVector v369 = (v368);
            IntVector v370 = v369.reinterpretAsInts();
            IntVector v371 = v370.lanewise(VectorOperators.ASHR, 20);
            ByteVector v372 = v371.reinterpretAsBytes();
            LongVector v373 = v372.reinterpretAsLongs();
            LongVector v374 = (LongVector) LongVector.SPECIES_256.broadcast(24L);
            LongVector v375 = v373.and(v374);
            ByteVector v376_off = v375.reinterpretAsBytes();
            LongVector v377 = (LongVector) LongVector.SPECIES_256.broadcast(40L);
            LongVector v378 = v376_off.reinterpretAsLongs();
            LongVector v379 = v377.sub(v378);
            ByteVector v380 = v379.reinterpretAsBytes();
            LongVector v381 = v365_nums.reinterpretAsLongs();
            LongVector v382 = v380.reinterpretAsLongs();
            LongVector v383 = v381.lanewise(VectorOperators.LSHL, v382);
            v365_nums = v383.reinterpretAsBytes();
            ByteVector v384 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
            ByteVector v385 = v365_nums.sub(v384);
            ByteVector v386 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
            ByteVector v387_aligned = v385.max(v386);
            ShortVector v388 = v387_aligned.reinterpretAsShorts();
            IntVector v389 = v388.reinterpretAsInts();
            IntVector v390 = (IntVector) IntVector.SPECIES_256.broadcast(255);
            IntVector v391 = v389.and(v390);
            ShortVector v392 = v391.reinterpretAsShorts();
            ShortVector v393 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)100);
            ShortVector v394_r = v392.mul(v393);
            ShortVector v395 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)10);
            ShortVector v396 = v388.mul(v395);
            ShortVector v397 = v396.lanewise(VectorOperators.LSHR, 8);
            v394_r = v394_r.add(v397);
            IntVector v398 = v388.reinterpretAsInts();
            IntVector v399 = v398.lanewise(VectorOperators.LSHR, 24);
            ShortVector v400 = v399.reinterpretAsShorts();
            v394_r = v394_r.add(v400);
            ShortVector v401 = (v394_r);
            ByteVector v402 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
            VectorMask<?> v403 = v365_nums.compare(VectorOperators.EQ, v402);
            ByteVector v404 = (ByteVector) v403.toVector();
            LongVector v405 = v404.reinterpretAsLongs();
            LongVector v406 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
            VectorMask<?> v407 = v405.compare(VectorOperators.NE, v406);
            LongVector v408 = (LongVector) v407.toVector();
            ByteVector v409 = v408.reinterpretAsBytes();
            ShortVector v410_neg = v409.reinterpretAsShorts();
            ShortVector v411_each16n = v401.lanewise(VectorOperators.XOR, v410_neg);
            v411_each16n = v411_each16n.sub(v410_neg);
            v411_each16n.intoArray(v192_temp_buf, 0);
            boolean v413 = v213.equals(v331);
            l28: {
              l27: {
                if (!v413) break l27;
                int v414_dataoff = v305 * 4;
                short v415 = v192_temp_buf[2];
                long v416_temp = (long) v415;
                int v417 = v414_dataoff + 2;
                long v418 = v5_map_data[v417];
                long v419 = Math.min(v418, v416_temp);
                v5_map_data[v417] = v419;
                int v421 = v414_dataoff + 3;
                long v422 = v5_map_data[v421];
                long v423 = Math.max(v422, v416_temp);
                v5_map_data[v421] = v423;
                long v425 = v5_map_data[v414_dataoff];
                long v426 = v425 + v416_temp;
                v5_map_data[v414_dataoff] = v426;
                int v428 = v414_dataoff + 1;
                long v429 = v5_map_data[v428];
                long v430 = v429 + 1L;
                v5_map_data[v428] = v430;
                if (1==1) break l28;
              }
              boolean v432 = 0 >= v202;
              l29: {
                if (!v432) break l29;
                if (1==1) break l20;
              }
              int v433 = v1_bufdata[v198_bufS];
              v193_failbuf[v195_failposC] = v433;
              int v435 = v195_failposC + 1;
              short v436 = v192_temp_buf[2];
              int v437 = (int) v436;
              v193_failbuf[v435] = v437;
              v195_failposC = v195_failposC + 2;
            }
            boolean v439 = v225.equals(v333);
            l31: {
              l30: {
                if (!v439) break l30;
                int v440_dataoff = v313 * 4;
                short v441 = v192_temp_buf[6];
                long v442_temp = (long) v441;
                int v443 = v440_dataoff + 2;
                long v444 = v5_map_data[v443];
                long v445 = Math.min(v444, v442_temp);
                v5_map_data[v443] = v445;
                int v447 = v440_dataoff + 3;
                long v448 = v5_map_data[v447];
                long v449 = Math.max(v448, v442_temp);
                v5_map_data[v447] = v449;
                long v451 = v5_map_data[v440_dataoff];
                long v452 = v451 + v442_temp;
                v5_map_data[v440_dataoff] = v452;
                int v454 = v440_dataoff + 1;
                long v455 = v5_map_data[v454];
                long v456 = v455 + 1L;
                v5_map_data[v454] = v456;
                if (1==1) break l31;
              }
              boolean v458 = 1 >= v202;
              l32: {
                if (!v458) break l32;
                if (1==1) break l20;
              }
              int v459 = v198_bufS + 1;
              int v460 = v1_bufdata[v459];
              v193_failbuf[v195_failposC] = v460;
              int v462 = v195_failposC + 1;
              short v463 = v192_temp_buf[6];
              int v464 = (int) v463;
              v193_failbuf[v462] = v464;
              v195_failposC = v195_failposC + 2;
            }
            boolean v466 = v237.equals(v335);
            l34: {
              l33: {
                if (!v466) break l33;
                int v467_dataoff = v321 * 4;
                short v468 = v192_temp_buf[10];
                long v469_temp = (long) v468;
                int v470 = v467_dataoff + 2;
                long v471 = v5_map_data[v470];
                long v472 = Math.min(v471, v469_temp);
                v5_map_data[v470] = v472;
                int v474 = v467_dataoff + 3;
                long v475 = v5_map_data[v474];
                long v476 = Math.max(v475, v469_temp);
                v5_map_data[v474] = v476;
                long v478 = v5_map_data[v467_dataoff];
                long v479 = v478 + v469_temp;
                v5_map_data[v467_dataoff] = v479;
                int v481 = v467_dataoff + 1;
                long v482 = v5_map_data[v481];
                long v483 = v482 + 1L;
                v5_map_data[v481] = v483;
                if (1==1) break l34;
              }
              boolean v485 = 2 >= v202;
              l35: {
                if (!v485) break l35;
                if (1==1) break l20;
              }
              int v486 = v198_bufS + 2;
              int v487 = v1_bufdata[v486];
              v193_failbuf[v195_failposC] = v487;
              int v489 = v195_failposC + 1;
              short v490 = v192_temp_buf[10];
              int v491 = (int) v490;
              v193_failbuf[v489] = v491;
              v195_failposC = v195_failposC + 2;
            }
            boolean v493 = v249.equals(v337);
            l37: {
              l36: {
                if (!v493) break l36;
                int v494_dataoff = v329 * 4;
                short v495 = v192_temp_buf[14];
                long v496_temp = (long) v495;
                int v497 = v494_dataoff + 2;
                long v498 = v5_map_data[v497];
                long v499 = Math.min(v498, v496_temp);
                v5_map_data[v497] = v499;
                int v501 = v494_dataoff + 3;
                long v502 = v5_map_data[v501];
                long v503 = Math.max(v502, v496_temp);
                v5_map_data[v501] = v503;
                long v505 = v5_map_data[v494_dataoff];
                long v506 = v505 + v496_temp;
                v5_map_data[v494_dataoff] = v506;
                int v508 = v494_dataoff + 1;
                long v509 = v5_map_data[v508];
                long v510 = v509 + 1L;
                v5_map_data[v508] = v510;
                if (1==1) break l37;
              }
              boolean v512 = 3 >= v202;
              l38: {
                if (!v512) break l38;
                if (1==1) break l20;
              }
              int v513 = v198_bufS + 3;
              int v514 = v1_bufdata[v513];
              v193_failbuf[v195_failposC] = v514;
              int v516 = v195_failposC + 1;
              short v517 = v192_temp_buf[14];
              int v518 = (int) v517;
              v193_failbuf[v516] = v518;
              v195_failposC = v195_failposC + 2;
            }
            v198_bufS = v198_bufS + 4;
            if (1==1) continue l21;
            break;
          }
        }
      }
      v196_i = v196_i + 1;
      if (1==1) continue l18;
      break;
    }
  }
  l40: {
    l39: while(true) {
      boolean v520 = v194_failposS < v195_failposC;
      if (!v520) break l40;
      int v521 = v193_failbuf[v194_failposS];
      int v522 = v194_failposS + 1;
      int v523 = v193_failbuf[v522];
      v194_failposS = v194_failposS + 2;
      int v524 = v521 - 16;
      ByteVector v525 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v524);
      ByteVector v526 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
      VectorMask<?> v527 = v525.compare(VectorOperators.EQ, v526);
      long v528_m = v527.toLong();
      boolean v529 = v528_m == 0L;
      l43: {
        l41: {
          if (!v529) break l41;
          int v530_start = v521;
          l42: while(true) {
            v530_start = v530_start - 16;
            int v531 = v530_start - 16;
            ByteVector v532 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v531);
            ByteVector v533 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v534 = v532.compare(VectorOperators.EQ, v533);
            v528_m = v534.toLong();
            boolean v535 = v528_m == 0L;
            if (v535) continue l42;
            break;
          }
          int v536 = Long.numberOfLeadingZeros(v528_m);
          int v537 = v536 - 48;
          int v538 = v530_start - v537;
          main.Main.failed_long(v0_ident, v538, v521, v523);
          if (1==1) break l43;
        }
        int v540 = Long.numberOfLeadingZeros(v528_m);
        int v541_c = v540 - 48;
        int v542 = v521 - v541_c;
        ByteVector v543 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v541_c);
        ByteVector v544 = v525.and(v543);
        IntVector v545_hv = v544.reinterpretAsInts();
        LongVector v546 = v545_hv.reinterpretAsLongs();
        long v547 = v546.lane(1);
        LongVector v548 = (LongVector) LongVector.SPECIES_128.broadcast(v547);
        IntVector v549 = v548.reinterpretAsInts();
        v545_hv = v545_hv.lanewise(VectorOperators.XOR, v549);
        LongVector v550 = v545_hv.reinterpretAsLongs();
        LongVector v551 = v550.lanewise(VectorOperators.LSHR, 32);
        IntVector v552 = v551.reinterpretAsInts();
        v545_hv = v545_hv.lanewise(VectorOperators.XOR, v552);
        IntVector v553 = (v545_hv);
        IntVector v554 = v553.lanewise(VectorOperators.ASHR, 16);
        IntVector v555 = (v554);
        v545_hv = v545_hv.lanewise(VectorOperators.XOR, v555);
        int v556 = v545_hv.lane(0);
        main.Main.failed_short(v0_ident, v542, v521, v523, v556);
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
