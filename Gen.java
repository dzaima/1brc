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
            int v294 = v293 & v2_hash_mask;
            int v295 = (int) v294;
            IntVector v296 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v295);
            IntVector v297 = (IntVector) IntVector.SPECIES_128.broadcast(v293);
            VectorMask<?> v298 = v297.compare(VectorOperators.EQ, v296);
            long v299 = v298.toLong();
            int v300 = Long.numberOfTrailingZeros(v299);
            int v301 = v295 + v300;
            int v302 = v260_hv.lane(0);
            int v303 = v302 & v2_hash_mask;
            int v304 = (int) v303;
            IntVector v305 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v304);
            IntVector v306 = (IntVector) IntVector.SPECIES_128.broadcast(v302);
            VectorMask<?> v307 = v306.compare(VectorOperators.EQ, v305);
            long v308 = v307.toLong();
            int v309 = Long.numberOfTrailingZeros(v308);
            int v310 = v304 + v309;
            int v311 = v271_hv.lane(0);
            int v312 = v311 & v2_hash_mask;
            int v313 = (int) v312;
            IntVector v314 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v313);
            IntVector v315 = (IntVector) IntVector.SPECIES_128.broadcast(v311);
            VectorMask<?> v316 = v315.compare(VectorOperators.EQ, v314);
            long v317 = v316.toLong();
            int v318 = Long.numberOfTrailingZeros(v317);
            int v319 = v313 + v318;
            int v320 = v282_hv.lane(0);
            int v321 = v320 & v2_hash_mask;
            int v322 = (int) v321;
            IntVector v323 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v322);
            IntVector v324 = (IntVector) IntVector.SPECIES_128.broadcast(v320);
            VectorMask<?> v325 = v324.compare(VectorOperators.EQ, v323);
            long v326 = v325.toLong();
            int v327 = Long.numberOfTrailingZeros(v326);
            int v328 = v322 + v327;
            int v329 = v301 * 16;
            ByteVector v330 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v329);
            int v331 = v310 * 16;
            ByteVector v332 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v331);
            int v333 = v319 * 16;
            ByteVector v334 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v333);
            int v335 = v328 * 16;
            ByteVector v336 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v335);
            IntVector v337_num_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_bufdata, v198_bufS);
            IntVector v338 = (IntVector) IntVector.SPECIES_128.broadcast(1);
            IntVector v339_idxs2 = v337_num_idxs.add(v338);
            int v340 = v339_idxs2.lane(0);
            ByteVector v341 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v340);
            LongVector v342 = v341.reinterpretAsLongs();
            long v343 = v342.lane(0);
            int v344 = v339_idxs2.lane(1);
            ByteVector v345 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v344);
            LongVector v346 = v345.reinterpretAsLongs();
            long v347 = v346.lane(0);
            int v348 = v339_idxs2.lane(2);
            ByteVector v349 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v348);
            LongVector v350 = v349.reinterpretAsLongs();
            long v351 = v350.lane(0);
            int v352 = v339_idxs2.lane(3);
            ByteVector v353 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v352);
            LongVector v354 = v353.reinterpretAsLongs();
            long v355 = v354.lane(0);
            long[] v356 = arr_4;
            v356[0] = v343;
            v356[1] = v347;
            v356[2] = v351;
            v356[3] = v355;
            LongVector v361 = (LongVector) LongVector.SPECIES_256.fromArray(v356, 0);
            ByteVector v362_nums = v361.reinterpretAsBytes();
            ByteVector v363 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
            VectorMask<?> v364 = v362_nums.compare(VectorOperators.EQ, v363);
            ByteVector v365 = (ByteVector) v364.toVector();
            ByteVector v366 = (v365);
            IntVector v367 = v366.reinterpretAsInts();
            IntVector v368 = v367.lanewise(VectorOperators.ASHR, 20);
            ByteVector v369 = v368.reinterpretAsBytes();
            LongVector v370 = v369.reinterpretAsLongs();
            LongVector v371 = (LongVector) LongVector.SPECIES_256.broadcast(24L);
            LongVector v372 = v370.and(v371);
            ByteVector v373_off = v372.reinterpretAsBytes();
            LongVector v374 = (LongVector) LongVector.SPECIES_256.broadcast(40L);
            LongVector v375 = v373_off.reinterpretAsLongs();
            LongVector v376 = v374.sub(v375);
            ByteVector v377 = v376.reinterpretAsBytes();
            LongVector v378 = v362_nums.reinterpretAsLongs();
            LongVector v379 = v377.reinterpretAsLongs();
            LongVector v380 = v378.lanewise(VectorOperators.LSHL, v379);
            v362_nums = v380.reinterpretAsBytes();
            ByteVector v381 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
            ByteVector v382 = v362_nums.sub(v381);
            ByteVector v383 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
            ByteVector v384_aligned = v382.max(v383);
            ShortVector v385 = v384_aligned.reinterpretAsShorts();
            IntVector v386 = v385.reinterpretAsInts();
            IntVector v387 = (IntVector) IntVector.SPECIES_256.broadcast(255);
            IntVector v388 = v386.and(v387);
            ShortVector v389 = v388.reinterpretAsShorts();
            ShortVector v390 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)100);
            ShortVector v391_r = v389.mul(v390);
            ShortVector v392 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)10);
            ShortVector v393 = v385.mul(v392);
            ShortVector v394 = v393.lanewise(VectorOperators.LSHR, 8);
            v391_r = v391_r.add(v394);
            IntVector v395 = v385.reinterpretAsInts();
            IntVector v396 = v395.lanewise(VectorOperators.LSHR, 24);
            ShortVector v397 = v396.reinterpretAsShorts();
            v391_r = v391_r.add(v397);
            ShortVector v398 = (v391_r);
            ByteVector v399 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
            VectorMask<?> v400 = v362_nums.compare(VectorOperators.EQ, v399);
            ByteVector v401 = (ByteVector) v400.toVector();
            LongVector v402 = v401.reinterpretAsLongs();
            LongVector v403 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
            VectorMask<?> v404 = v402.compare(VectorOperators.NE, v403);
            LongVector v405 = (LongVector) v404.toVector();
            ByteVector v406 = v405.reinterpretAsBytes();
            ShortVector v407_neg = v406.reinterpretAsShorts();
            ShortVector v408_each16n = v398.lanewise(VectorOperators.XOR, v407_neg);
            v408_each16n = v408_each16n.sub(v407_neg);
            v408_each16n.intoArray(v192_temp_buf, 0);
            boolean v410 = v212.equals(v330);
            l28: {
              l27: {
                if (!v410) break l27;
                int v411_dataoff = v301 * 4;
                short v412 = v192_temp_buf[2];
                long v413_temp = (long) v412;
                int v414 = v411_dataoff + 2;
                long v415 = v5_map_data[v414];
                long v416 = Math.min(v415, v413_temp);
                v5_map_data[v414] = v416;
                int v418 = v411_dataoff + 3;
                long v419 = v5_map_data[v418];
                long v420 = Math.max(v419, v413_temp);
                v5_map_data[v418] = v420;
                long v422 = v5_map_data[v411_dataoff];
                long v423 = v422 + v413_temp;
                v5_map_data[v411_dataoff] = v423;
                int v425 = v411_dataoff + 1;
                long v426 = v5_map_data[v425];
                long v427 = v426 + 1L;
                v5_map_data[v425] = v427;
                if (1==1) break l28;
              }
              int v429 = v199_bufE - v198_bufS;
              boolean v430 = 0 >= v429;
              l29: {
                if (!v430) break l29;
                if (1==1) break l20;
              }
              int v431 = v1_bufdata[v198_bufS];
              v193_failbuf[v195_failposC] = v431;
              int v433 = v195_failposC + 1;
              short v434 = v192_temp_buf[2];
              int v435 = (int) v434;
              v193_failbuf[v433] = v435;
              v195_failposC = v195_failposC + 2;
            }
            boolean v437 = v224.equals(v332);
            l31: {
              l30: {
                if (!v437) break l30;
                int v438_dataoff = v310 * 4;
                short v439 = v192_temp_buf[6];
                long v440_temp = (long) v439;
                int v441 = v438_dataoff + 2;
                long v442 = v5_map_data[v441];
                long v443 = Math.min(v442, v440_temp);
                v5_map_data[v441] = v443;
                int v445 = v438_dataoff + 3;
                long v446 = v5_map_data[v445];
                long v447 = Math.max(v446, v440_temp);
                v5_map_data[v445] = v447;
                long v449 = v5_map_data[v438_dataoff];
                long v450 = v449 + v440_temp;
                v5_map_data[v438_dataoff] = v450;
                int v452 = v438_dataoff + 1;
                long v453 = v5_map_data[v452];
                long v454 = v453 + 1L;
                v5_map_data[v452] = v454;
                if (1==1) break l31;
              }
              int v456 = v199_bufE - v198_bufS;
              boolean v457 = 1 >= v456;
              l32: {
                if (!v457) break l32;
                if (1==1) break l20;
              }
              int v458 = v198_bufS + 1;
              int v459 = v1_bufdata[v458];
              v193_failbuf[v195_failposC] = v459;
              int v461 = v195_failposC + 1;
              short v462 = v192_temp_buf[6];
              int v463 = (int) v462;
              v193_failbuf[v461] = v463;
              v195_failposC = v195_failposC + 2;
            }
            boolean v465 = v236.equals(v334);
            l34: {
              l33: {
                if (!v465) break l33;
                int v466_dataoff = v319 * 4;
                short v467 = v192_temp_buf[10];
                long v468_temp = (long) v467;
                int v469 = v466_dataoff + 2;
                long v470 = v5_map_data[v469];
                long v471 = Math.min(v470, v468_temp);
                v5_map_data[v469] = v471;
                int v473 = v466_dataoff + 3;
                long v474 = v5_map_data[v473];
                long v475 = Math.max(v474, v468_temp);
                v5_map_data[v473] = v475;
                long v477 = v5_map_data[v466_dataoff];
                long v478 = v477 + v468_temp;
                v5_map_data[v466_dataoff] = v478;
                int v480 = v466_dataoff + 1;
                long v481 = v5_map_data[v480];
                long v482 = v481 + 1L;
                v5_map_data[v480] = v482;
                if (1==1) break l34;
              }
              int v484 = v199_bufE - v198_bufS;
              boolean v485 = 2 >= v484;
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
            boolean v493 = v248.equals(v336);
            l37: {
              l36: {
                if (!v493) break l36;
                int v494_dataoff = v328 * 4;
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
              int v512 = v199_bufE - v198_bufS;
              boolean v513 = 3 >= v512;
              l38: {
                if (!v513) break l38;
                if (1==1) break l20;
              }
              int v514 = v198_bufS + 3;
              int v515 = v1_bufdata[v514];
              v193_failbuf[v195_failposC] = v515;
              int v517 = v195_failposC + 1;
              short v518 = v192_temp_buf[14];
              int v519 = (int) v518;
              v193_failbuf[v517] = v519;
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
      boolean v521 = v194_failposS < v195_failposC;
      if (!v521) break l40;
      int v522 = v193_failbuf[v194_failposS];
      int v523 = v194_failposS + 1;
      int v524 = v193_failbuf[v523];
      v194_failposS = v194_failposS + 2;
      int v525 = v522 - 16;
      ByteVector v526 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v525);
      ByteVector v527 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
      VectorMask<?> v528 = v526.compare(VectorOperators.EQ, v527);
      long v529_m = v528.toLong();
      boolean v530 = v529_m == 0L;
      l43: {
        l41: {
          if (!v530) break l41;
          int v531_start = v522;
          l42: while(true) {
            v531_start = v531_start - 16;
            int v532 = v531_start - 16;
            ByteVector v533 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v532);
            ByteVector v534 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v535 = v533.compare(VectorOperators.EQ, v534);
            v529_m = v535.toLong();
            boolean v536 = v529_m == 0L;
            if (v536) continue l42;
            break;
          }
          int v537 = Long.numberOfLeadingZeros(v529_m);
          int v538 = v537 - 48;
          int v539 = v531_start - v538;
          main.Main.failed_long(v0_ident, v539, v522, v524);
          if (1==1) break l43;
        }
        int v541 = Long.numberOfLeadingZeros(v529_m);
        int v542_c = v541 - 48;
        int v543 = v522 - v542_c;
        ByteVector v544 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v542_c);
        ByteVector v545 = v526.and(v544);
        IntVector v546_hv = v545.reinterpretAsInts();
        LongVector v547 = v546_hv.reinterpretAsLongs();
        long v548 = v547.lane(1);
        LongVector v549 = (LongVector) LongVector.SPECIES_128.broadcast(v548);
        IntVector v550 = v549.reinterpretAsInts();
        v546_hv = v546_hv.lanewise(VectorOperators.XOR, v550);
        LongVector v551 = v546_hv.reinterpretAsLongs();
        LongVector v552 = v551.lanewise(VectorOperators.LSHR, 32);
        IntVector v553 = v552.reinterpretAsInts();
        v546_hv = v546_hv.lanewise(VectorOperators.XOR, v553);
        IntVector v554 = (v546_hv);
        IntVector v555 = v554.lanewise(VectorOperators.ASHR, 16);
        IntVector v556 = (v555);
        v546_hv = v546_hv.lanewise(VectorOperators.XOR, v556);
        int v557 = v546_hv.lane(0);
        main.Main.failed_short(v0_ident, v543, v522, v524, v557);
      }
      if (1==1) continue l39;
      break;
    }
  }
  return;
}
public void minibench(byte[] v0_ai8, short[] v1_ai16, int[] v2_ai32, long[] v3_ai64) {
  int v4_i = 0;
  l1: {
    l0: while(true) {
      boolean v5 = v4_i < 1000;
      if (!v5) break l1;
      int v6 = v4_i * 8;
      IntVector v7_v = (IntVector) IntVector.SPECIES_256.fromArray(v2_ai32, v6);
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
