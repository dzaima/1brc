package gen;
import jdk.incubator.vector.*;

public class Gen {

private static final byte[] c0_tail_mask = new byte[]{(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1};
public int core_1brc_buf_elts() {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    return 4016;
  }
}
public int core_1brc_periter() {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    return 10624;
  }
}
public int hash_1brc(byte[] v0_arr) {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
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
}
private final int[] arr_1 = new int[4];
private final short[] arr_2 = new short[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
private final int[] arr_3 = new int[8000];
private final long[] arr_4 = new long[4];
private final static byte[] arr_5 = new byte[]{0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,16,16,16,16,16,16,16,16,24,24,24,24,24,24,24,24};
private final static byte[] arr_6 = new byte[]{0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7};
private final static byte[] arr_7 = new byte[]{-1,0,0,0,2,0,0,0,7,8,8,8,10,8,8,8,15,16,16,16,18,16,16,16,23,24,24,24,26,24,24,24};
private final static short[] arr_8 = new short[]{100,10,1,0,100,10,1,0,100,10,1,0,100,10,1,0};
public void core_1brc(int v0_ident, int[] v1_bufdata, int v2_hash_mask, byte[] v3_map_exp, int[] v4_map_hash, long[] v5_map_data, byte[] v6_inp, int v7_inpOff) {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
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
              IntVector v216 = v215.reinterpretAsInts();
              IntVector v217 = v216.lanewise(VectorOperators.ASHR, 23);
              ByteVector v218 = v217.reinterpretAsBytes();
              ByteVector v219 = (v218);
              LongVector v220 = v219.reinterpretAsLongs();
              LongVector v221 = (LongVector) LongVector.SPECIES_256.broadcast(3L);
              LongVector v222 = v220.and(v221);
              ByteVector v223_off = v222.reinterpretAsBytes();
              LongVector v224 = v212_nums.reinterpretAsLongs();
              LongVector v225 = (LongVector) LongVector.SPECIES_256.broadcast(0x00ffffffffffffffL);
              LongVector v226 = v224.and(v225);
              v212_nums = v226.reinterpretAsBytes();
              byte[] v227 = arr_5;
              ByteVector v228 = (ByteVector) ByteVector.SPECIES_256.fromArray(v227, 0);
              v223_off = v228.selectFrom(v223_off);
              byte[] v229 = arr_6;
              ByteVector v230 = (ByteVector) ByteVector.SPECIES_256.fromArray(v229, 0);
              v223_off = v223_off.or(v230);
              byte[] v231 = arr_7;
              ByteVector v232 = (ByteVector) ByteVector.SPECIES_256.fromArray(v231, 0);
              v223_off = v223_off.add(v232);
              ByteVector v233 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31);
              v223_off = v223_off.and(v233);
              ByteVector v234 = v223_off.selectFrom(v212_nums);
              ShortVector v235_aligned16 = v234.reinterpretAsShorts();
              ByteVector v236 = v235_aligned16.reinterpretAsBytes();
              ByteVector v237 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
              ByteVector v238 = v236.sub(v237);
              ShortVector v239 = v238.reinterpretAsShorts();
              ByteVector v240 = v239.reinterpretAsBytes();
              ByteVector v241 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
              ByteVector v242 = v240.max(v241);
              v235_aligned16 = v242.reinterpretAsShorts();
              short[] v243 = arr_8;
              ShortVector v244 = (ShortVector) ShortVector.SPECIES_256.fromArray(v243, 0);
              v235_aligned16 = v235_aligned16.mul(v244);
              LongVector v245 = v235_aligned16.reinterpretAsLongs();
              LongVector v246 = v245.lanewise(VectorOperators.LSHR, 32);
              ShortVector v247 = v246.reinterpretAsShorts();
              v235_aligned16 = v235_aligned16.add(v247);
              LongVector v248 = v235_aligned16.reinterpretAsLongs();
              LongVector v249 = v248.lanewise(VectorOperators.LSHR, 16);
              ShortVector v250 = v249.reinterpretAsShorts();
              v235_aligned16 = v235_aligned16.add(v250);
              ByteVector v251 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
              VectorMask<?> v252 = v212_nums.compare(VectorOperators.EQ, v251);
              ByteVector v253 = (ByteVector) v252.toVector();
              LongVector v254 = v253.reinterpretAsLongs();
              LongVector v255 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
              VectorMask<?> v256 = v254.compare(VectorOperators.NE, v255);
              LongVector v257 = (LongVector) v256.toVector();
              ByteVector v258 = v257.reinterpretAsBytes();
              ShortVector v259_neg = v258.reinterpretAsShorts();
              ShortVector v260_each16n = v235_aligned16.lanewise(VectorOperators.XOR, v259_neg);
              v260_each16n = v260_each16n.sub(v259_neg);
              v260_each16n.intoArray(v175_temp_buf, 0);
              int v262 = v182_bufE - v181_bufS;
              int v263_i = 0;
              l20: {
                l19: while(true) {
                  boolean v264 = v263_i < 4;
                  if (!v264) break l20;
                  int v265 = v263_i * 1;
                  int v266 = v181_bufS + v265;
                  int v267_off = v1_bufdata[v266];
                  int v268 = v267_off - 16;
                  ByteVector v269 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v268);
                  ByteVector v270 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
                  VectorMask<?> v271 = v269.compare(VectorOperators.EQ, v270);
                  long v272 = v271.toLong();
                  short v273_mc = (short) v272;
                  int v274_c = 16;
                  boolean v275 = v273_mc != (short)0;
                  l21: {
                    if (!v275) break l21;
                    int v276 = (int) v273_mc;
                    int v277 = v276 & 65535;
                    int v278 = Integer.numberOfLeadingZeros(v277);
                    v274_c = v278 - 16;
                  }
                  ByteVector v279 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v274_c);
                  ByteVector v280 = v269.and(v279);
                  IntVector v281_hv = v280.reinterpretAsInts();
                  LongVector v282 = v281_hv.reinterpretAsLongs();
                  long v283 = v282.lane(1);
                  LongVector v284 = (LongVector) LongVector.SPECIES_128.broadcast(v283);
                  IntVector v285 = v284.reinterpretAsInts();
                  v281_hv = v281_hv.lanewise(VectorOperators.XOR, v285);
                  LongVector v286 = v281_hv.reinterpretAsLongs();
                  LongVector v287 = v286.lanewise(VectorOperators.LSHR, 32);
                  IntVector v288 = v287.reinterpretAsInts();
                  v281_hv = v281_hv.lanewise(VectorOperators.XOR, v288);
                  IntVector v289 = (v281_hv);
                  IntVector v290 = v289.lanewise(VectorOperators.ASHR, 16);
                  IntVector v291 = (v290);
                  v281_hv = v281_hv.lanewise(VectorOperators.XOR, v291);
                  IntVector v292_hv = v281_hv;
                  boolean v293 = v265 >= v262;
                  l22: {
                    if (!v293) break l22;
                    if (1==1) break l16;
                  }
                  int v294_hash = v292_hv.lane(0);
                  int v295 = v294_hash & v2_hash_mask;
                  int v296_idx = (int) v295;
                  IntVector v297 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v296_idx);
                  IntVector v298 = (IntVector) IntVector.SPECIES_128.broadcast(v294_hash);
                  VectorMask<?> v299 = v298.compare(VectorOperators.EQ, v297);
                  long v300 = v299.toLong();
                  byte v301_m = (byte) v300;
                  boolean v302 = v301_m == (byte)0;
                  l24: {
                    l23: {
                      if (!v302) break l23;
                      int v303 = v181_bufS + v265;
                      int v304 = v1_bufdata[v303];
                      v176_failbuf[v178_failposC] = v304;
                      int v306 = v178_failposC + 1;
                      int v307 = v265 * 4;
                      short v308 = v175_temp_buf[v307];
                      int v309 = (int) v308;
                      v176_failbuf[v306] = v309;
                      v178_failposC = v178_failposC + 2;
                      if (1==1) break l24;
                    }
                    int v311 = Integer.numberOfTrailingZeros(v301_m);
                    v296_idx = v296_idx + v311;
                    int v312 = v296_idx * 16;
                    ByteVector v313_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v312);
                    boolean v314 = v313_exp.equals(v280);
                    boolean v315 = !(v314);
                    l26: {
                      l25: {
                        if (!v315) break l25;
                        int v316 = v181_bufS + v265;
                        int v317 = v1_bufdata[v316];
                        v176_failbuf[v178_failposC] = v317;
                        int v319 = v178_failposC + 1;
                        int v320 = v265 * 4;
                        short v321 = v175_temp_buf[v320];
                        int v322 = (int) v321;
                        v176_failbuf[v319] = v322;
                        v178_failposC = v178_failposC + 2;
                        if (1==1) break l26;
                      }
                      int v324_dataoff = v296_idx * 4;
                      int v325 = v265 * 4;
                      short v326 = v175_temp_buf[v325];
                      long v327_temp = (long) v326;
                      int v328 = v324_dataoff + 2;
                      long v329 = v5_map_data[v328];
                      long v330 = Math.min(v329, v327_temp);
                      v5_map_data[v328] = v330;
                      int v332 = v324_dataoff + 3;
                      long v333 = v5_map_data[v332];
                      long v334 = Math.max(v333, v327_temp);
                      v5_map_data[v332] = v334;
                      long v336 = v5_map_data[v324_dataoff];
                      long v337 = v336 + v327_temp;
                      v5_map_data[v324_dataoff] = v337;
                      int v339 = v324_dataoff + 1;
                      long v340 = v5_map_data[v339];
                      long v341 = v340 + 1L;
                      v5_map_data[v339] = v341;
                    }
                  }
                  v263_i = v263_i + 1;
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
        boolean v343 = v177_failposS < v178_failposC;
        if (!v343) break l28;
        int v344 = v176_failbuf[v177_failposS];
        int v345 = v177_failposS + 1;
        int v346 = v176_failbuf[v345];
        v177_failposS = v177_failposS + 2;
        int v347 = v344 - 16;
        ByteVector v348 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v347);
        ByteVector v349 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
        VectorMask<?> v350 = v348.compare(VectorOperators.EQ, v349);
        long v351 = v350.toLong();
        short v352_m = (short) v351;
        boolean v353 = v352_m == (short)0;
        l31: {
          l29: {
            if (!v353) break l29;
            int v354_start = v344;
            l30: while(true) {
              v354_start = v354_start - 16;
              int v355 = v354_start - 16;
              ByteVector v356 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v355);
              ByteVector v357 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
              VectorMask<?> v358 = v356.compare(VectorOperators.EQ, v357);
              long v359 = v358.toLong();
              v352_m = (short) v359;
              boolean v360 = v352_m == (short)0;
              if (v360) continue l30;
              break;
            }
            int v361 = (int) v352_m;
            int v362 = v361 & 65535;
            int v363 = Integer.numberOfLeadingZeros(v362);
            int v364 = v363 - 16;
            int v365 = v354_start - v364;
            main.Main.failed_long(v0_ident, v365, v344, v346);
            if (1==1) break l31;
          }
          int v367 = (int) v352_m;
          int v368 = v367 & 65535;
          int v369 = Integer.numberOfLeadingZeros(v368);
          int v370_c = v369 - 16;
          int v371 = v344 - v370_c;
          ByteVector v372 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask, v370_c);
          ByteVector v373 = v348.and(v372);
          IntVector v374_hv = v373.reinterpretAsInts();
          LongVector v375 = v374_hv.reinterpretAsLongs();
          long v376 = v375.lane(1);
          LongVector v377 = (LongVector) LongVector.SPECIES_128.broadcast(v376);
          IntVector v378 = v377.reinterpretAsInts();
          v374_hv = v374_hv.lanewise(VectorOperators.XOR, v378);
          LongVector v379 = v374_hv.reinterpretAsLongs();
          LongVector v380 = v379.lanewise(VectorOperators.LSHR, 32);
          IntVector v381 = v380.reinterpretAsInts();
          v374_hv = v374_hv.lanewise(VectorOperators.XOR, v381);
          IntVector v382 = (v374_hv);
          IntVector v383 = v382.lanewise(VectorOperators.ASHR, 16);
          IntVector v384 = (v383);
          v374_hv = v374_hv.lanewise(VectorOperators.XOR, v384);
          int v385 = v374_hv.lane(0);
          main.Main.failed_short(v0_ident, v371, v344, v346, v385);
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
        int v6 = v4_i * 32;
        ByteVector v7_v = (ByteVector) ByteVector.SPECIES_256.fromArray(v0_ai8, v6);
        ByteVector v8 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
        v7_v = v7_v.add(v8);
        ByteVector v9 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)1);
        v7_v = v7_v.add(v9);
        ByteVector v10 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)2);
        v7_v = v7_v.add(v10);
        ByteVector v11 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
        v7_v = v7_v.add(v11);
        ByteVector v12 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)1);
        v7_v = v7_v.add(v12);
        ByteVector v13 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)2);
        v7_v = v7_v.add(v13);
        ByteVector v14 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
        v7_v = v7_v.add(v14);
        ByteVector v15 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)1);
        v7_v = v7_v.add(v15);
        ByteVector v16 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)2);
        v7_v = v7_v.add(v16);
        ByteVector v17 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
        v7_v = v7_v.add(v17);
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
// todo export

}
