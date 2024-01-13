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
            int v202_off = v1_bufdata[v198_bufS];
            int v203 = v202_off - 16;
            ByteVector v204 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v203);
            ByteVector v205 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v206 = v204.compare(VectorOperators.EQ, v205);
            long v207_mc = v206.toLong();
            int v208_c = 16;
            boolean v209 = v207_mc != 0L;
            l23: {
              if (!v209) break l23;
              int v210 = Long.numberOfLeadingZeros(v207_mc);
              v208_c = v210 - 48;
            }
            ByteVector v211 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v208_c);
            ByteVector v212 = v204.and(v211);
            int v213 = v198_bufS + 1;
            int v214_off = v1_bufdata[v213];
            int v215 = v214_off - 16;
            ByteVector v216 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v215);
            ByteVector v217 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v218 = v216.compare(VectorOperators.EQ, v217);
            long v219_mc = v218.toLong();
            int v220_c = 16;
            boolean v221 = v219_mc != 0L;
            l24: {
              if (!v221) break l24;
              int v222 = Long.numberOfLeadingZeros(v219_mc);
              v220_c = v222 - 48;
            }
            ByteVector v223 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v220_c);
            ByteVector v224 = v216.and(v223);
            int v225 = v198_bufS + 2;
            int v226_off = v1_bufdata[v225];
            int v227 = v226_off - 16;
            ByteVector v228 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v227);
            ByteVector v229 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v230 = v228.compare(VectorOperators.EQ, v229);
            long v231_mc = v230.toLong();
            int v232_c = 16;
            boolean v233 = v231_mc != 0L;
            l25: {
              if (!v233) break l25;
              int v234 = Long.numberOfLeadingZeros(v231_mc);
              v232_c = v234 - 48;
            }
            ByteVector v235 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v232_c);
            ByteVector v236 = v228.and(v235);
            int v237 = v198_bufS + 3;
            int v238_off = v1_bufdata[v237];
            int v239 = v238_off - 16;
            ByteVector v240 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v239);
            ByteVector v241 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v242 = v240.compare(VectorOperators.EQ, v241);
            long v243_mc = v242.toLong();
            int v244_c = 16;
            boolean v245 = v243_mc != 0L;
            l26: {
              if (!v245) break l26;
              int v246 = Long.numberOfLeadingZeros(v243_mc);
              v244_c = v246 - 48;
            }
            ByteVector v247 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v244_c);
            ByteVector v248 = v240.and(v247);
            IntVector v249_hv = v212.reinterpretAsInts();
            LongVector v250 = v249_hv.reinterpretAsLongs();
            long v251 = v250.lane(1);
            LongVector v252 = (LongVector) LongVector.SPECIES_128.broadcast(v251);
            IntVector v253 = v252.reinterpretAsInts();
            v249_hv = v249_hv.lanewise(VectorOperators.XOR, v253);
            LongVector v254 = v249_hv.reinterpretAsLongs();
            LongVector v255 = v254.lanewise(VectorOperators.LSHR, 32);
            IntVector v256 = v255.reinterpretAsInts();
            v249_hv = v249_hv.lanewise(VectorOperators.XOR, v256);
            IntVector v257 = (v249_hv);
            IntVector v258 = v257.lanewise(VectorOperators.ASHR, 16);
            IntVector v259 = (v258);
            v249_hv = v249_hv.lanewise(VectorOperators.XOR, v259);
            IntVector v260_hv = v224.reinterpretAsInts();
            LongVector v261 = v260_hv.reinterpretAsLongs();
            long v262 = v261.lane(1);
            LongVector v263 = (LongVector) LongVector.SPECIES_128.broadcast(v262);
            IntVector v264 = v263.reinterpretAsInts();
            v260_hv = v260_hv.lanewise(VectorOperators.XOR, v264);
            LongVector v265 = v260_hv.reinterpretAsLongs();
            LongVector v266 = v265.lanewise(VectorOperators.LSHR, 32);
            IntVector v267 = v266.reinterpretAsInts();
            v260_hv = v260_hv.lanewise(VectorOperators.XOR, v267);
            IntVector v268 = (v260_hv);
            IntVector v269 = v268.lanewise(VectorOperators.ASHR, 16);
            IntVector v270 = (v269);
            v260_hv = v260_hv.lanewise(VectorOperators.XOR, v270);
            IntVector v271_hv = v236.reinterpretAsInts();
            LongVector v272 = v271_hv.reinterpretAsLongs();
            long v273 = v272.lane(1);
            LongVector v274 = (LongVector) LongVector.SPECIES_128.broadcast(v273);
            IntVector v275 = v274.reinterpretAsInts();
            v271_hv = v271_hv.lanewise(VectorOperators.XOR, v275);
            LongVector v276 = v271_hv.reinterpretAsLongs();
            LongVector v277 = v276.lanewise(VectorOperators.LSHR, 32);
            IntVector v278 = v277.reinterpretAsInts();
            v271_hv = v271_hv.lanewise(VectorOperators.XOR, v278);
            IntVector v279 = (v271_hv);
            IntVector v280 = v279.lanewise(VectorOperators.ASHR, 16);
            IntVector v281 = (v280);
            v271_hv = v271_hv.lanewise(VectorOperators.XOR, v281);
            IntVector v282_hv = v248.reinterpretAsInts();
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
            int v293 = v249_hv.lane(0);
            int v294 = v260_hv.lane(0);
            int v295 = v271_hv.lane(0);
            int v296 = v282_hv.lane(0);
            int v297 = v293 & v2_hash_mask;
            int v298_idx = (int) v297;
            IntVector v299 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v298_idx);
            IntVector v300 = (IntVector) IntVector.SPECIES_128.broadcast(v293);
            VectorMask<?> v301 = v300.compare(VectorOperators.EQ, v299);
            long v302_m = v301.toLong();
            int v303 = Long.numberOfTrailingZeros(v302_m);
            int v304 = v298_idx + v303;
            int v305 = v294 & v2_hash_mask;
            int v306_idx = (int) v305;
            IntVector v307 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v306_idx);
            IntVector v308 = (IntVector) IntVector.SPECIES_128.broadcast(v294);
            VectorMask<?> v309 = v308.compare(VectorOperators.EQ, v307);
            long v310_m = v309.toLong();
            int v311 = Long.numberOfTrailingZeros(v310_m);
            int v312 = v306_idx + v311;
            int v313 = v295 & v2_hash_mask;
            int v314_idx = (int) v313;
            IntVector v315 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v314_idx);
            IntVector v316 = (IntVector) IntVector.SPECIES_128.broadcast(v295);
            VectorMask<?> v317 = v316.compare(VectorOperators.EQ, v315);
            long v318_m = v317.toLong();
            int v319 = Long.numberOfTrailingZeros(v318_m);
            int v320 = v314_idx + v319;
            int v321 = v296 & v2_hash_mask;
            int v322_idx = (int) v321;
            IntVector v323 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v322_idx);
            IntVector v324 = (IntVector) IntVector.SPECIES_128.broadcast(v296);
            VectorMask<?> v325 = v324.compare(VectorOperators.EQ, v323);
            long v326_m = v325.toLong();
            int v327 = Long.numberOfTrailingZeros(v326_m);
            int v328 = v322_idx + v327;
            int v329 = v304 * 16;
            ByteVector v330 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v329);
            int v331 = v312 * 16;
            ByteVector v332 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v331);
            int v333 = v320 * 16;
            ByteVector v334 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v333);
            int v335 = v328 * 16;
            ByteVector v336 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v335);
            IntVector v337_num_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_bufdata, v198_bufS);
            int v338 = v337_num_idxs.lane(0);
            int v339 = 1 + v338;
            ByteVector v340 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v339);
            LongVector v341 = v340.reinterpretAsLongs();
            long v342 = v341.lane(0);
            int v343 = v337_num_idxs.lane(1);
            int v344 = 1 + v343;
            ByteVector v345 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v344);
            LongVector v346 = v345.reinterpretAsLongs();
            long v347 = v346.lane(0);
            int v348 = v337_num_idxs.lane(2);
            int v349 = 1 + v348;
            ByteVector v350 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v349);
            LongVector v351 = v350.reinterpretAsLongs();
            long v352 = v351.lane(0);
            int v353 = v337_num_idxs.lane(3);
            int v354 = 1 + v353;
            ByteVector v355 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v354);
            LongVector v356 = v355.reinterpretAsLongs();
            long v357 = v356.lane(0);
            long[] v358 = arr_4;
            v358[0] = v342;
            v358[1] = v347;
            v358[2] = v352;
            v358[3] = v357;
            LongVector v363 = (LongVector) LongVector.SPECIES_256.fromArray(v358, 0);
            ByteVector v364_nums = v363.reinterpretAsBytes();
            ByteVector v365 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
            VectorMask<?> v366 = v364_nums.compare(VectorOperators.EQ, v365);
            ByteVector v367 = (ByteVector) v366.toVector();
            ByteVector v368 = (v367);
            IntVector v369 = v368.reinterpretAsInts();
            IntVector v370 = v369.lanewise(VectorOperators.ASHR, 20);
            ByteVector v371 = v370.reinterpretAsBytes();
            LongVector v372 = v371.reinterpretAsLongs();
            LongVector v373 = (LongVector) LongVector.SPECIES_256.broadcast(24L);
            LongVector v374 = v372.and(v373);
            ByteVector v375_off = v374.reinterpretAsBytes();
            LongVector v376 = (LongVector) LongVector.SPECIES_256.broadcast(40L);
            LongVector v377 = v375_off.reinterpretAsLongs();
            LongVector v378 = v376.sub(v377);
            ByteVector v379 = v378.reinterpretAsBytes();
            LongVector v380 = v364_nums.reinterpretAsLongs();
            LongVector v381 = v379.reinterpretAsLongs();
            LongVector v382 = v380.lanewise(VectorOperators.LSHL, v381);
            v364_nums = v382.reinterpretAsBytes();
            ByteVector v383 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
            ByteVector v384 = v364_nums.sub(v383);
            ByteVector v385 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
            ByteVector v386_aligned = v384.max(v385);
            ShortVector v387 = v386_aligned.reinterpretAsShorts();
            IntVector v388 = v387.reinterpretAsInts();
            IntVector v389 = (IntVector) IntVector.SPECIES_256.broadcast(255);
            IntVector v390 = v388.and(v389);
            ShortVector v391 = v390.reinterpretAsShorts();
            ShortVector v392 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)100);
            ShortVector v393_r = v391.mul(v392);
            ShortVector v394 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)10);
            ShortVector v395 = v387.mul(v394);
            ShortVector v396 = v395.lanewise(VectorOperators.LSHR, 8);
            v393_r = v393_r.add(v396);
            IntVector v397 = v387.reinterpretAsInts();
            IntVector v398 = v397.lanewise(VectorOperators.LSHR, 24);
            ShortVector v399 = v398.reinterpretAsShorts();
            v393_r = v393_r.add(v399);
            ShortVector v400 = (v393_r);
            ByteVector v401 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
            VectorMask<?> v402 = v364_nums.compare(VectorOperators.EQ, v401);
            ByteVector v403 = (ByteVector) v402.toVector();
            LongVector v404 = v403.reinterpretAsLongs();
            LongVector v405 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
            VectorMask<?> v406 = v404.compare(VectorOperators.NE, v405);
            LongVector v407 = (LongVector) v406.toVector();
            ByteVector v408 = v407.reinterpretAsBytes();
            ShortVector v409_neg = v408.reinterpretAsShorts();
            ShortVector v410_each16n = v400.lanewise(VectorOperators.XOR, v409_neg);
            v410_each16n = v410_each16n.sub(v409_neg);
            v410_each16n.intoArray(v192_temp_buf, 0);
            boolean v412 = v212.equals(v330);
            l28: {
              l27: {
                if (!v412) break l27;
                int v413_dataoff = v304 * 4;
                short v414 = v192_temp_buf[2];
                long v415_temp = (long) v414;
                int v416 = v413_dataoff + 2;
                long v417 = v5_map_data[v416];
                long v418 = Math.min(v417, v415_temp);
                v5_map_data[v416] = v418;
                int v420 = v413_dataoff + 3;
                long v421 = v5_map_data[v420];
                long v422 = Math.max(v421, v415_temp);
                v5_map_data[v420] = v422;
                long v424 = v5_map_data[v413_dataoff];
                long v425 = v424 + v415_temp;
                v5_map_data[v413_dataoff] = v425;
                int v427 = v413_dataoff + 1;
                long v428 = v5_map_data[v427];
                long v429 = v428 + 1L;
                v5_map_data[v427] = v429;
                if (1==1) break l28;
              }
              int v431 = v199_bufE - v198_bufS;
              boolean v432 = 0 >= v431;
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
            boolean v439 = v224.equals(v332);
            l31: {
              l30: {
                if (!v439) break l30;
                int v440_dataoff = v312 * 4;
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
              int v458 = v199_bufE - v198_bufS;
              boolean v459 = 1 >= v458;
              l32: {
                if (!v459) break l32;
                if (1==1) break l20;
              }
              int v460 = v198_bufS + 1;
              int v461 = v1_bufdata[v460];
              v193_failbuf[v195_failposC] = v461;
              int v463 = v195_failposC + 1;
              short v464 = v192_temp_buf[6];
              int v465 = (int) v464;
              v193_failbuf[v463] = v465;
              v195_failposC = v195_failposC + 2;
            }
            boolean v467 = v236.equals(v334);
            l34: {
              l33: {
                if (!v467) break l33;
                int v468_dataoff = v320 * 4;
                short v469 = v192_temp_buf[10];
                long v470_temp = (long) v469;
                int v471 = v468_dataoff + 2;
                long v472 = v5_map_data[v471];
                long v473 = Math.min(v472, v470_temp);
                v5_map_data[v471] = v473;
                int v475 = v468_dataoff + 3;
                long v476 = v5_map_data[v475];
                long v477 = Math.max(v476, v470_temp);
                v5_map_data[v475] = v477;
                long v479 = v5_map_data[v468_dataoff];
                long v480 = v479 + v470_temp;
                v5_map_data[v468_dataoff] = v480;
                int v482 = v468_dataoff + 1;
                long v483 = v5_map_data[v482];
                long v484 = v483 + 1L;
                v5_map_data[v482] = v484;
                if (1==1) break l34;
              }
              int v486 = v199_bufE - v198_bufS;
              boolean v487 = 2 >= v486;
              l35: {
                if (!v487) break l35;
                if (1==1) break l20;
              }
              int v488 = v198_bufS + 2;
              int v489 = v1_bufdata[v488];
              v193_failbuf[v195_failposC] = v489;
              int v491 = v195_failposC + 1;
              short v492 = v192_temp_buf[10];
              int v493 = (int) v492;
              v193_failbuf[v491] = v493;
              v195_failposC = v195_failposC + 2;
            }
            boolean v495 = v248.equals(v336);
            l37: {
              l36: {
                if (!v495) break l36;
                int v496_dataoff = v328 * 4;
                short v497 = v192_temp_buf[14];
                long v498_temp = (long) v497;
                int v499 = v496_dataoff + 2;
                long v500 = v5_map_data[v499];
                long v501 = Math.min(v500, v498_temp);
                v5_map_data[v499] = v501;
                int v503 = v496_dataoff + 3;
                long v504 = v5_map_data[v503];
                long v505 = Math.max(v504, v498_temp);
                v5_map_data[v503] = v505;
                long v507 = v5_map_data[v496_dataoff];
                long v508 = v507 + v498_temp;
                v5_map_data[v496_dataoff] = v508;
                int v510 = v496_dataoff + 1;
                long v511 = v5_map_data[v510];
                long v512 = v511 + 1L;
                v5_map_data[v510] = v512;
                if (1==1) break l37;
              }
              int v514 = v199_bufE - v198_bufS;
              boolean v515 = 3 >= v514;
              l38: {
                if (!v515) break l38;
                if (1==1) break l20;
              }
              int v516 = v198_bufS + 3;
              int v517 = v1_bufdata[v516];
              v193_failbuf[v195_failposC] = v517;
              int v519 = v195_failposC + 1;
              short v520 = v192_temp_buf[14];
              int v521 = (int) v520;
              v193_failbuf[v519] = v521;
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
      boolean v523 = v194_failposS < v195_failposC;
      if (!v523) break l40;
      int v524 = v193_failbuf[v194_failposS];
      int v525 = v194_failposS + 1;
      int v526 = v193_failbuf[v525];
      v194_failposS = v194_failposS + 2;
      int v527 = v524 - 16;
      ByteVector v528 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v527);
      ByteVector v529 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
      VectorMask<?> v530 = v528.compare(VectorOperators.EQ, v529);
      long v531_m = v530.toLong();
      boolean v532 = v531_m == 0L;
      l43: {
        l41: {
          if (!v532) break l41;
          int v533_start = v524;
          l42: while(true) {
            v533_start = v533_start - 16;
            int v534 = v533_start - 16;
            ByteVector v535 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v534);
            ByteVector v536 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v537 = v535.compare(VectorOperators.EQ, v536);
            v531_m = v537.toLong();
            boolean v538 = v531_m == 0L;
            if (v538) continue l42;
            break;
          }
          int v539 = Long.numberOfLeadingZeros(v531_m);
          int v540 = v539 - 48;
          int v541 = v533_start - v540;
          main.Main.failed_long(v0_ident, v541, v524, v526);
          if (1==1) break l43;
        }
        int v543 = Long.numberOfLeadingZeros(v531_m);
        int v544_c = v543 - 48;
        int v545 = v524 - v544_c;
        ByteVector v546 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v544_c);
        ByteVector v547 = v528.and(v546);
        IntVector v548_hv = v547.reinterpretAsInts();
        LongVector v549 = v548_hv.reinterpretAsLongs();
        long v550 = v549.lane(1);
        LongVector v551 = (LongVector) LongVector.SPECIES_128.broadcast(v550);
        IntVector v552 = v551.reinterpretAsInts();
        v548_hv = v548_hv.lanewise(VectorOperators.XOR, v552);
        LongVector v553 = v548_hv.reinterpretAsLongs();
        LongVector v554 = v553.lanewise(VectorOperators.LSHR, 32);
        IntVector v555 = v554.reinterpretAsInts();
        v548_hv = v548_hv.lanewise(VectorOperators.XOR, v555);
        IntVector v556 = (v548_hv);
        IntVector v557 = v556.lanewise(VectorOperators.ASHR, 16);
        IntVector v558 = (v557);
        v548_hv = v548_hv.lanewise(VectorOperators.XOR, v558);
        int v559 = v548_hv.lane(0);
        main.Main.failed_short(v0_ident, v545, v524, v526, v559);
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
