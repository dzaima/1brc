package gen;
import jdk.incubator.vector.*;

public class Gen {

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
private final static byte[] arr_3 = new byte[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
private final int[] arr_4 = new int[8000];
private final long[] arr_5 = new long[4];
private final static byte[] arr_6 = new byte[]{0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,16,16,16,16,16,16,16,16,24,24,24,24,24,24,24,24};
private final static byte[] arr_7 = new byte[]{0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7};
private final static byte[] arr_8 = new byte[]{-1,0,0,0,2,0,0,0,7,8,8,8,10,8,8,8,15,16,16,16,18,16,16,16,23,24,24,24,26,24,24,24};
private final static short[] arr_9 = new short[]{100,10,1,0,100,10,1,0,100,10,1,0,100,10,1,0};
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
    byte[] v176_tail_mask = arr_3;
    int[] v177_failbuf = arr_4;
    int v178_failposS = 0;
    int v179_failposC = 0;
    int v180_i = 0;
    l15: {
      l14: while(true) {
        boolean v181 = v180_i < 4;
        if (!v181) break l15;
        int v182_bufS = v180_i * 1004;
        int v183_bufE = v12_bufEnds[v180_i];
        int v184_retctr = 0;
        l16: {
          l18: {
            l17: while(true) {
              boolean v185 = v182_bufS < v183_bufE;
              if (!v185) break l18;
              IntVector v186_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_bufdata, v182_bufS);
              int v187 = v186_idxs.lane(0);
              int v188 = 1 + v187;
              ByteVector v189 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v188);
              LongVector v190 = v189.reinterpretAsLongs();
              long v191 = v190.lane(0);
              int v192 = v186_idxs.lane(1);
              int v193 = 1 + v192;
              ByteVector v194 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v193);
              LongVector v195 = v194.reinterpretAsLongs();
              long v196 = v195.lane(0);
              int v197 = v186_idxs.lane(2);
              int v198 = 1 + v197;
              ByteVector v199 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v198);
              LongVector v200 = v199.reinterpretAsLongs();
              long v201 = v200.lane(0);
              int v202 = v186_idxs.lane(3);
              int v203 = 1 + v202;
              ByteVector v204 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v203);
              LongVector v205 = v204.reinterpretAsLongs();
              long v206 = v205.lane(0);
              long[] v207 = arr_5;
              v207[0] = v191;
              v207[1] = v196;
              v207[2] = v201;
              v207[3] = v206;
              LongVector v212 = (LongVector) LongVector.SPECIES_256.fromArray(v207, 0);
              ByteVector v213_nums = v212.reinterpretAsBytes();
              ByteVector v214 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
              VectorMask<?> v215 = v213_nums.compare(VectorOperators.EQ, v214);
              ByteVector v216 = (ByteVector) v215.toVector();
              IntVector v217 = v216.reinterpretAsInts();
              IntVector v218 = v217.lanewise(VectorOperators.ASHR, 23);
              ByteVector v219 = v218.reinterpretAsBytes();
              ByteVector v220 = (v219);
              LongVector v221 = v220.reinterpretAsLongs();
              LongVector v222 = (LongVector) LongVector.SPECIES_256.broadcast(3L);
              LongVector v223 = v221.and(v222);
              ByteVector v224_off = v223.reinterpretAsBytes();
              LongVector v225 = v213_nums.reinterpretAsLongs();
              LongVector v226 = (LongVector) LongVector.SPECIES_256.broadcast(0x00ffffffffffffffL);
              LongVector v227 = v225.and(v226);
              v213_nums = v227.reinterpretAsBytes();
              byte[] v228 = arr_6;
              ByteVector v229 = (ByteVector) ByteVector.SPECIES_256.fromArray(v228, 0);
              v224_off = v229.selectFrom(v224_off);
              byte[] v230 = arr_7;
              ByteVector v231 = (ByteVector) ByteVector.SPECIES_256.fromArray(v230, 0);
              v224_off = v224_off.or(v231);
              byte[] v232 = arr_8;
              ByteVector v233 = (ByteVector) ByteVector.SPECIES_256.fromArray(v232, 0);
              v224_off = v224_off.add(v233);
              ByteVector v234 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31);
              v224_off = v224_off.and(v234);
              ByteVector v235 = v224_off.selectFrom(v213_nums);
              ShortVector v236_aligned16 = v235.reinterpretAsShorts();
              ByteVector v237 = v236_aligned16.reinterpretAsBytes();
              ByteVector v238 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
              ByteVector v239 = v237.sub(v238);
              ShortVector v240 = v239.reinterpretAsShorts();
              ByteVector v241 = v240.reinterpretAsBytes();
              ByteVector v242 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
              ByteVector v243 = v241.max(v242);
              v236_aligned16 = v243.reinterpretAsShorts();
              short[] v244 = arr_9;
              ShortVector v245 = (ShortVector) ShortVector.SPECIES_256.fromArray(v244, 0);
              v236_aligned16 = v236_aligned16.mul(v245);
              LongVector v246 = v236_aligned16.reinterpretAsLongs();
              LongVector v247 = v246.lanewise(VectorOperators.LSHR, 32);
              ShortVector v248 = v247.reinterpretAsShorts();
              v236_aligned16 = v236_aligned16.add(v248);
              LongVector v249 = v236_aligned16.reinterpretAsLongs();
              LongVector v250 = v249.lanewise(VectorOperators.LSHR, 16);
              ShortVector v251 = v250.reinterpretAsShorts();
              v236_aligned16 = v236_aligned16.add(v251);
              ByteVector v252 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
              VectorMask<?> v253 = v213_nums.compare(VectorOperators.EQ, v252);
              ByteVector v254 = (ByteVector) v253.toVector();
              LongVector v255 = v254.reinterpretAsLongs();
              LongVector v256 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
              VectorMask<?> v257 = v255.compare(VectorOperators.NE, v256);
              LongVector v258 = (LongVector) v257.toVector();
              ByteVector v259 = v258.reinterpretAsBytes();
              ShortVector v260_neg = v259.reinterpretAsShorts();
              ShortVector v261_each16n = v236_aligned16.lanewise(VectorOperators.XOR, v260_neg);
              v261_each16n = v261_each16n.sub(v260_neg);
              v261_each16n.intoArray(v175_temp_buf, 0);
              int v263 = v183_bufE - v182_bufS;
              int v264_i = 0;
              l20: {
                l19: while(true) {
                  boolean v265 = v264_i < 4;
                  if (!v265) break l20;
                  int v266 = v264_i * 1;
                  int v267 = v182_bufS + v266;
                  int v268_off = v1_bufdata[v267];
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
                  ByteVector v280 = (ByteVector) ByteVector.SPECIES_128.fromArray(v176_tail_mask, v275_c);
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
                  IntVector v293_hv = v282_hv;
                  boolean v294 = v266 >= v263;
                  l22: {
                    if (!v294) break l22;
                    if (1==1) break l16;
                  }
                  int v295_hash = v293_hv.lane(0);
                  int v296 = v295_hash & v2_hash_mask;
                  int v297_idx = (int) v296;
                  IntVector v298 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v297_idx);
                  IntVector v299 = (IntVector) IntVector.SPECIES_128.broadcast(v295_hash);
                  VectorMask<?> v300 = v299.compare(VectorOperators.EQ, v298);
                  long v301 = v300.toLong();
                  byte v302_m = (byte) v301;
                  boolean v303 = v302_m == (byte)0;
                  l24: {
                    l23: {
                      if (!v303) break l23;
                      int v304 = v182_bufS + v266;
                      int v305 = v1_bufdata[v304];
                      v177_failbuf[v179_failposC] = v305;
                      int v307 = v179_failposC + 1;
                      int v308 = v266 * 4;
                      short v309 = v175_temp_buf[v308];
                      int v310 = (int) v309;
                      v177_failbuf[v307] = v310;
                      v179_failposC = v179_failposC + 2;
                      if (1==1) break l24;
                    }
                    int v312 = Integer.numberOfTrailingZeros(v302_m);
                    v297_idx = v297_idx + v312;
                    int v313 = v297_idx * 16;
                    ByteVector v314_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v313);
                    boolean v315 = v314_exp.equals(v281);
                    boolean v316 = !(v315);
                    l26: {
                      l25: {
                        if (!v316) break l25;
                        int v317 = v182_bufS + v266;
                        int v318 = v1_bufdata[v317];
                        v177_failbuf[v179_failposC] = v318;
                        int v320 = v179_failposC + 1;
                        int v321 = v266 * 4;
                        short v322 = v175_temp_buf[v321];
                        int v323 = (int) v322;
                        v177_failbuf[v320] = v323;
                        v179_failposC = v179_failposC + 2;
                        if (1==1) break l26;
                      }
                      int v325_dataoff = v297_idx * 4;
                      int v326 = v266 * 4;
                      short v327 = v175_temp_buf[v326];
                      long v328_temp = (long) v327;
                      int v329 = v325_dataoff + 2;
                      long v330 = v5_map_data[v329];
                      long v331 = Math.min(v330, v328_temp);
                      v5_map_data[v329] = v331;
                      int v333 = v325_dataoff + 3;
                      long v334 = v5_map_data[v333];
                      long v335 = Math.max(v334, v328_temp);
                      v5_map_data[v333] = v335;
                      long v337 = v5_map_data[v325_dataoff];
                      long v338 = v337 + v328_temp;
                      v5_map_data[v325_dataoff] = v338;
                      int v340 = v325_dataoff + 1;
                      long v341 = v5_map_data[v340];
                      long v342 = v341 + 1L;
                      v5_map_data[v340] = v342;
                    }
                  }
                  v264_i = v264_i + 1;
                  if (1==1) continue l19;
                  break;
                }
              }
              v182_bufS = v182_bufS + 4;
              if (1==1) continue l17;
              break;
            }
          }
        }
        v180_i = v180_i + 1;
        if (1==1) continue l14;
        break;
      }
    }
    l28: {
      l27: while(true) {
        boolean v344 = v178_failposS < v179_failposC;
        if (!v344) break l28;
        int v345 = v177_failbuf[v178_failposS];
        int v346 = v178_failposS + 1;
        int v347 = v177_failbuf[v346];
        v178_failposS = v178_failposS + 2;
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
          ByteVector v373 = (ByteVector) ByteVector.SPECIES_128.fromArray(v176_tail_mask, v371_c);
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
// todo export

}
