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
  v12_bufEnds[0] = v8_pos;
  v1_bufdata[v8_pos] = 16;
  int v145 = v8_pos + 1;
  v1_bufdata[v145] = 16;
  int v147 = v8_pos + 2;
  v1_bufdata[v147] = 16;
  int v149 = v8_pos + 3;
  v1_bufdata[v149] = 16;
  v12_bufEnds[1] = v9_pos;
  v1_bufdata[v9_pos] = 16;
  int v153 = v9_pos + 1;
  v1_bufdata[v153] = 16;
  int v155 = v9_pos + 2;
  v1_bufdata[v155] = 16;
  int v157 = v9_pos + 3;
  v1_bufdata[v157] = 16;
  v12_bufEnds[2] = v10_pos;
  v1_bufdata[v10_pos] = 16;
  int v161 = v10_pos + 1;
  v1_bufdata[v161] = 16;
  int v163 = v10_pos + 2;
  v1_bufdata[v163] = 16;
  int v165 = v10_pos + 3;
  v1_bufdata[v165] = 16;
  v12_bufEnds[3] = v11_pos;
  v1_bufdata[v11_pos] = 16;
  int v169 = v11_pos + 1;
  v1_bufdata[v169] = 16;
  int v171 = v11_pos + 2;
  v1_bufdata[v171] = 16;
  int v173 = v11_pos + 3;
  v1_bufdata[v173] = 16;
  short[] v175_temp_buf = arr_2;
  int[] v176_failbuf = arr_3;
  int v177_failposS = 0;
  int v178_failposC = 0;
  int v179_i = 0;
  l15: {
    l14: while(true) {
      boolean v180 = v179_i < 4;
      if (!v180) break l15;
      int v181_bufS = v179_i * 1004;
      int v182_bufE = v12_bufEnds[v179_i];
      int v183_retctr = 0;
      l16: {
        l18: {
          l17: while(true) {
            boolean v184 = v181_bufS < v182_bufE;
            if (!v184) break l18;
            IntVector v185_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_bufdata, v181_bufS);
            int v186 = v185_idxs.lane(0);
            int v187 = 1 + v186;
            ByteVector v188 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v187);
            LongVector v189 = v188.reinterpretAsLongs();
            long v190 = v189.lane(0);
            int v191 = v185_idxs.lane(1);
            int v192 = 1 + v191;
            ByteVector v193 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v192);
            LongVector v194 = v193.reinterpretAsLongs();
            long v195 = v194.lane(0);
            int v196 = v185_idxs.lane(2);
            int v197 = 1 + v196;
            ByteVector v198 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v197);
            LongVector v199 = v198.reinterpretAsLongs();
            long v200 = v199.lane(0);
            int v201 = v185_idxs.lane(3);
            int v202 = 1 + v201;
            ByteVector v203 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v202);
            LongVector v204 = v203.reinterpretAsLongs();
            long v205 = v204.lane(0);
            long[] v206 = arr_4;
            v206[0] = v190;
            v206[1] = v195;
            v206[2] = v200;
            v206[3] = v205;
            LongVector v211 = (LongVector) LongVector.SPECIES_256.fromArray(v206, 0);
            ByteVector v212_nums = v211.reinterpretAsBytes();
            ByteVector v213 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
            VectorMask<?> v214 = v212_nums.compare(VectorOperators.EQ, v213);
            ByteVector v215 = (ByteVector) v214.toVector();
            ByteVector v216 = (v215);
            IntVector v217 = v216.reinterpretAsInts();
            IntVector v218 = v217.lanewise(VectorOperators.ASHR, 20);
            ByteVector v219 = v218.reinterpretAsBytes();
            LongVector v220 = v219.reinterpretAsLongs();
            LongVector v221 = (LongVector) LongVector.SPECIES_256.broadcast(24L);
            LongVector v222 = v220.and(v221);
            ByteVector v223_off = v222.reinterpretAsBytes();
            LongVector v224 = (LongVector) LongVector.SPECIES_256.broadcast(40L);
            LongVector v225 = v223_off.reinterpretAsLongs();
            LongVector v226 = v224.sub(v225);
            ByteVector v227 = v226.reinterpretAsBytes();
            LongVector v228 = v212_nums.reinterpretAsLongs();
            LongVector v229 = v227.reinterpretAsLongs();
            LongVector v230 = v228.lanewise(VectorOperators.LSHL, v229);
            v212_nums = v230.reinterpretAsBytes();
            ByteVector v231 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
            ByteVector v232 = v212_nums.sub(v231);
            ByteVector v233 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
            ByteVector v234_aligned = v232.max(v233);
            ShortVector v235 = v234_aligned.reinterpretAsShorts();
            IntVector v236 = v235.reinterpretAsInts();
            IntVector v237 = (IntVector) IntVector.SPECIES_256.broadcast(255);
            IntVector v238 = v236.and(v237);
            ShortVector v239 = v238.reinterpretAsShorts();
            ShortVector v240 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)100);
            ShortVector v241_r = v239.mul(v240);
            ShortVector v242 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)10);
            ShortVector v243 = v235.mul(v242);
            ShortVector v244 = v243.lanewise(VectorOperators.LSHR, 8);
            v241_r = v241_r.add(v244);
            IntVector v245 = v235.reinterpretAsInts();
            IntVector v246 = v245.lanewise(VectorOperators.LSHR, 24);
            ShortVector v247 = v246.reinterpretAsShorts();
            v241_r = v241_r.add(v247);
            ShortVector v248 = (v241_r);
            ByteVector v249 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
            VectorMask<?> v250 = v212_nums.compare(VectorOperators.EQ, v249);
            ByteVector v251 = (ByteVector) v250.toVector();
            LongVector v252 = v251.reinterpretAsLongs();
            LongVector v253 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
            VectorMask<?> v254 = v252.compare(VectorOperators.NE, v253);
            LongVector v255 = (LongVector) v254.toVector();
            ByteVector v256 = v255.reinterpretAsBytes();
            ShortVector v257_neg = v256.reinterpretAsShorts();
            ShortVector v258_each16n = v248.lanewise(VectorOperators.XOR, v257_neg);
            v258_each16n = v258_each16n.sub(v257_neg);
            v258_each16n.intoArray(v175_temp_buf, 0);
            int v260 = v182_bufE - v181_bufS;
            int v261_i = 0;
            l20: {
              l19: while(true) {
                boolean v262 = v261_i < 4;
                if (!v262) break l20;
                int v263 = v261_i * 1;
                int v264 = v181_bufS + v263;
                int v265_off = v1_bufdata[v264];
                int v266 = v265_off - 16;
                ByteVector v267 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v266);
                ByteVector v268 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                VectorMask<?> v269 = v267.compare(VectorOperators.EQ, v268);
                long v270 = v269.toLong();
                short v271_mc = (short) v270;
                int v272_c = 16;
                boolean v273 = v271_mc != (short)0;
                l21: {
                  if (!v273) break l21;
                  int v274 = (int) v271_mc;
                  int v275 = v274 & 65535;
                  int v276 = Integer.numberOfLeadingZeros(v275);
                  v272_c = v276 - 16;
                }
                ByteVector v277 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v272_c);
                ByteVector v278 = v267.and(v277);
                IntVector v279_hv = v278.reinterpretAsInts();
                LongVector v280 = v279_hv.reinterpretAsLongs();
                long v281 = v280.lane(1);
                LongVector v282 = (LongVector) LongVector.SPECIES_128.broadcast(v281);
                IntVector v283 = v282.reinterpretAsInts();
                v279_hv = v279_hv.lanewise(VectorOperators.XOR, v283);
                LongVector v284 = v279_hv.reinterpretAsLongs();
                LongVector v285 = v284.lanewise(VectorOperators.LSHR, 32);
                IntVector v286 = v285.reinterpretAsInts();
                v279_hv = v279_hv.lanewise(VectorOperators.XOR, v286);
                IntVector v287 = (v279_hv);
                IntVector v288 = v287.lanewise(VectorOperators.ASHR, 16);
                IntVector v289 = (v288);
                v279_hv = v279_hv.lanewise(VectorOperators.XOR, v289);
                IntVector v290_hv = v279_hv;
                boolean v291 = v263 >= v260;
                l22: {
                  if (!v291) break l22;
                  if (1==1) break l16;
                }
                int v292_hash = v290_hv.lane(0);
                int v293 = v292_hash & v2_hash_mask;
                int v294_idx = (int) v293;
                IntVector v295 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v294_idx);
                IntVector v296 = (IntVector) IntVector.SPECIES_128.broadcast(v292_hash);
                VectorMask<?> v297 = v296.compare(VectorOperators.EQ, v295);
                long v298 = v297.toLong();
                byte v299_m = (byte) v298;
                boolean v300 = v299_m == (byte)0;
                l24: {
                  l23: {
                    if (!v300) break l23;
                    int v301 = v181_bufS + v263;
                    int v302 = v1_bufdata[v301];
                    v176_failbuf[v178_failposC] = v302;
                    int v304 = v178_failposC + 1;
                    int v305 = v263 * 4;
                    int v306 = v305 + 2;
                    short v307 = v175_temp_buf[v306];
                    int v308 = (int) v307;
                    v176_failbuf[v304] = v308;
                    v178_failposC = v178_failposC + 2;
                    if (1==1) break l24;
                  }
                  int v310 = Integer.numberOfTrailingZeros(v299_m);
                  v294_idx = v294_idx + v310;
                  int v311 = v294_idx * 16;
                  ByteVector v312_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v311);
                  boolean v313 = v312_exp.equals(v278);
                  boolean v314 = !(v313);
                  l26: {
                    l25: {
                      if (!v314) break l25;
                      int v315 = v181_bufS + v263;
                      int v316 = v1_bufdata[v315];
                      v176_failbuf[v178_failposC] = v316;
                      int v318 = v178_failposC + 1;
                      int v319 = v263 * 4;
                      int v320 = v319 + 2;
                      short v321 = v175_temp_buf[v320];
                      int v322 = (int) v321;
                      v176_failbuf[v318] = v322;
                      v178_failposC = v178_failposC + 2;
                      if (1==1) break l26;
                    }
                    int v324_dataoff = v294_idx * 4;
                    int v325 = v263 * 4;
                    int v326 = v325 + 2;
                    short v327 = v175_temp_buf[v326];
                    long v328_temp = (long) v327;
                    int v329 = v324_dataoff + 2;
                    long v330 = v5_map_data[v329];
                    long v331 = Math.min(v330, v328_temp);
                    v5_map_data[v329] = v331;
                    int v333 = v324_dataoff + 3;
                    long v334 = v5_map_data[v333];
                    long v335 = Math.max(v334, v328_temp);
                    v5_map_data[v333] = v335;
                    long v337 = v5_map_data[v324_dataoff];
                    long v338 = v337 + v328_temp;
                    v5_map_data[v324_dataoff] = v338;
                    int v340 = v324_dataoff + 1;
                    long v341 = v5_map_data[v340];
                    long v342 = v341 + 1L;
                    v5_map_data[v340] = v342;
                  }
                }
                v261_i = v261_i + 1;
                if (1==1) continue l19;
                break;
              }
            }
            v181_bufS = v181_bufS + 4;
            if (1==1) continue l17;
            break;
          }
        }
      }
      v179_i = v179_i + 1;
      if (1==1) continue l14;
      break;
    }
  }
  l28: {
    l27: while(true) {
      boolean v344 = v177_failposS < v178_failposC;
      if (!v344) break l28;
      int v345 = v176_failbuf[v177_failposS];
      int v346 = v177_failposS + 1;
      int v347 = v176_failbuf[v346];
      v177_failposS = v177_failposS + 2;
      int v348 = v345 - 16;
      ByteVector v349 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v348);
      ByteVector v350 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
      VectorMask<?> v351 = v349.compare(VectorOperators.EQ, v350);
      long v352 = v351.toLong();
      short v353_m = (short) v352;
      boolean v354 = v353_m == (short)0;
      l31: {
        l29: {
          if (!v354) break l29;
          int v355_start = v345;
          l30: while(true) {
            v355_start = v355_start - 16;
            int v356 = v355_start - 16;
            ByteVector v357 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v356);
            ByteVector v358 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v359 = v357.compare(VectorOperators.EQ, v358);
            long v360 = v359.toLong();
            v353_m = (short) v360;
            boolean v361 = v353_m == (short)0;
            if (v361) continue l30;
            break;
          }
          int v362 = (int) v353_m;
          int v363 = v362 & 65535;
          int v364 = Integer.numberOfLeadingZeros(v363);
          int v365 = v364 - 16;
          int v366 = v355_start - v365;
          main.Main.failed_long(v0_ident, v366, v345, v347);
          if (1==1) break l31;
        }
        int v368 = (int) v353_m;
        int v369 = v368 & 65535;
        int v370 = Integer.numberOfLeadingZeros(v369);
        int v371_c = v370 - 16;
        int v372 = v345 - v371_c;
        ByteVector v373 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v371_c);
        ByteVector v374 = v349.and(v373);
        IntVector v375_hv = v374.reinterpretAsInts();
        LongVector v376 = v375_hv.reinterpretAsLongs();
        long v377 = v376.lane(1);
        LongVector v378 = (LongVector) LongVector.SPECIES_128.broadcast(v377);
        IntVector v379 = v378.reinterpretAsInts();
        v375_hv = v375_hv.lanewise(VectorOperators.XOR, v379);
        LongVector v380 = v375_hv.reinterpretAsLongs();
        LongVector v381 = v380.lanewise(VectorOperators.LSHR, 32);
        IntVector v382 = v381.reinterpretAsInts();
        v375_hv = v375_hv.lanewise(VectorOperators.XOR, v382);
        IntVector v383 = (v375_hv);
        IntVector v384 = v383.lanewise(VectorOperators.ASHR, 16);
        IntVector v385 = (v384);
        v375_hv = v375_hv.lanewise(VectorOperators.XOR, v385);
        int v386 = v375_hv.lane(0);
        main.Main.failed_short(v0_ident, v372, v345, v347, v386);
      }
      if (1==1) continue l27;
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
