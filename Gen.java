package gen;
import jdk.incubator.vector.*;

public class Gen {

public int core_1brc_buf_elts() {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    return (int)12276L;
  }
}
public int core_1brc_periter() {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    return (int)10624L;
  }
}
private final short[] constarr_1 = new short[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
private final static byte[] constarr_2 = new byte[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
private final static byte[] constarr_3 = new byte[]{0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,16,16,16,16,16,16,16,16,24,24,24,24,24,24,24,24};
private final static byte[] constarr_4 = new byte[]{0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7,0,7,0,7,0,7,7,7};
private final static byte[] constarr_5 = new byte[]{-1,0,0,0,2,0,0,0,7,8,8,8,10,8,8,8,15,16,16,16,18,16,16,16,23,24,24,24,26,24,24,24};
private final static short[] constarr_6 = new short[]{100,10,1,0,100,10,1,0,100,10,1,0,100,10,1,0};
public void core_1brc(int v0_ident, int[] v1_buf0, int v2_hash_mask, byte[] v3_map_exp, int[] v4_map_hash, long[] v5_map_data, byte[] v6_inp, int v7_inpOff) {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    long[] v8 = new long[16];
    int v9_off = (int)132L;
    int v10_off = (int)1136L;
    int v11_off = (int)2140L;
    int v12_off = (int)3144L;
    int v13_off = (int)4148L;
    int v14_off = v13_off;
    int v15_off = v7_inpOff;
    int v16_off = v7_inpOff + (int)32L;
    int v17_off = v7_inpOff + (int)64L;
    int v18_off = v7_inpOff + (int)96L;
    int v19_i = (int)0L;
    l1: {
      l0: while(true) {
        boolean v20 = v19_i < (int)83L;
        if (!v20) break l1;
        ByteVector v21 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v15_off);
        ByteVector v22 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
        VectorMask<?> v23 = v21.compare(VectorOperators.EQ, v22);
        long v24 = v23.toLong();
        int v25 = (int) v24;
        ByteVector v26 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v16_off);
        ByteVector v27 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
        VectorMask<?> v28 = v26.compare(VectorOperators.EQ, v27);
        long v29 = v28.toLong();
        int v30 = (int) v29;
        ByteVector v31 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v17_off);
        ByteVector v32 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
        VectorMask<?> v33 = v31.compare(VectorOperators.EQ, v32);
        long v34 = v33.toLong();
        int v35 = (int) v34;
        ByteVector v36 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v18_off);
        ByteVector v37 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59L);
        VectorMask<?> v38 = v36.compare(VectorOperators.EQ, v37);
        long v39 = v38.toLong();
        int v40 = (int) v39;
        int v41_m = v25;
        int v42_m = v30;
        int v43_m = v35;
        int v44_m = v40;
        int v45 = v41_m - (int)1L;
        int v46_m2 = v41_m & v45;
        int v47 = Integer.numberOfTrailingZeros(v41_m);
        int v48 = v15_off + v47;
        v1_buf0[v9_off] = v48;
        v41_m = v46_m2;
        int v50 = v42_m - (int)1L;
        int v51_m2 = v42_m & v50;
        int v52 = Integer.numberOfTrailingZeros(v42_m);
        int v53 = v16_off + v52;
        v1_buf0[v10_off] = v53;
        v42_m = v51_m2;
        int v55 = v43_m - (int)1L;
        int v56_m2 = v43_m & v55;
        int v57 = Integer.numberOfTrailingZeros(v43_m);
        int v58 = v17_off + v57;
        v1_buf0[v11_off] = v58;
        v43_m = v56_m2;
        int v60 = v44_m - (int)1L;
        int v61_m2 = v44_m & v60;
        int v62 = Integer.numberOfTrailingZeros(v44_m);
        int v63 = v18_off + v62;
        v1_buf0[v12_off] = v63;
        v44_m = v61_m2;
        int v65 = v41_m - (int)1L;
        int v66_m2 = v41_m & v65;
        int v67 = Integer.numberOfTrailingZeros(v41_m);
        int v68 = v15_off + v67;
        int v69 = v9_off + (int)1L;
        v1_buf0[v69] = v68;
        v41_m = v66_m2;
        int v71 = v42_m - (int)1L;
        int v72_m2 = v42_m & v71;
        int v73 = Integer.numberOfTrailingZeros(v42_m);
        int v74 = v16_off + v73;
        int v75 = v10_off + (int)1L;
        v1_buf0[v75] = v74;
        v42_m = v72_m2;
        int v77 = v43_m - (int)1L;
        int v78_m2 = v43_m & v77;
        int v79 = Integer.numberOfTrailingZeros(v43_m);
        int v80 = v17_off + v79;
        int v81 = v11_off + (int)1L;
        v1_buf0[v81] = v80;
        v43_m = v78_m2;
        int v83 = v44_m - (int)1L;
        int v84_m2 = v44_m & v83;
        int v85 = Integer.numberOfTrailingZeros(v44_m);
        int v86 = v18_off + v85;
        int v87 = v12_off + (int)1L;
        v1_buf0[v87] = v86;
        v44_m = v84_m2;
        int v89 = v41_m - (int)1L;
        int v90_m2 = v41_m & v89;
        int v91 = Integer.numberOfTrailingZeros(v41_m);
        int v92 = v15_off + v91;
        int v93 = v9_off + (int)2L;
        v1_buf0[v93] = v92;
        v41_m = v90_m2;
        int v95 = v42_m - (int)1L;
        int v96_m2 = v42_m & v95;
        int v97 = Integer.numberOfTrailingZeros(v42_m);
        int v98 = v16_off + v97;
        int v99 = v10_off + (int)2L;
        v1_buf0[v99] = v98;
        v42_m = v96_m2;
        int v101 = v43_m - (int)1L;
        int v102_m2 = v43_m & v101;
        int v103 = Integer.numberOfTrailingZeros(v43_m);
        int v104 = v17_off + v103;
        int v105 = v11_off + (int)2L;
        v1_buf0[v105] = v104;
        v43_m = v102_m2;
        int v107 = v44_m - (int)1L;
        int v108_m2 = v44_m & v107;
        int v109 = Integer.numberOfTrailingZeros(v44_m);
        int v110 = v18_off + v109;
        int v111 = v12_off + (int)2L;
        v1_buf0[v111] = v110;
        v44_m = v108_m2;
        int v113_pop = Integer.bitCount(v25);
        boolean v114 = v113_pop > (int)3L;
        l4: {
          l2: {
            if (!v114) break l2;
            v9_off = v9_off + (int)3L;
            l3: while(true) {
              int v115 = v41_m - (int)1L;
              int v116_m2 = v41_m & v115;
              int v117 = Integer.numberOfTrailingZeros(v41_m);
              int v118 = v15_off + v117;
              v1_buf0[v9_off] = v118;
              v41_m = v116_m2;
              v9_off = v9_off + (int)1L;
              boolean v120 = v41_m != (int)0L;
              if (v120) continue l3;
              break;
            }
            if (1==1) break l4;
          }
          v9_off = v9_off + v113_pop;
        }
        v15_off = v15_off + (int)128L;
        int v121_pop = Integer.bitCount(v30);
        boolean v122 = v121_pop > (int)3L;
        l7: {
          l5: {
            if (!v122) break l5;
            v10_off = v10_off + (int)3L;
            l6: while(true) {
              int v123 = v42_m - (int)1L;
              int v124_m2 = v42_m & v123;
              int v125 = Integer.numberOfTrailingZeros(v42_m);
              int v126 = v16_off + v125;
              v1_buf0[v10_off] = v126;
              v42_m = v124_m2;
              v10_off = v10_off + (int)1L;
              boolean v128 = v42_m != (int)0L;
              if (v128) continue l6;
              break;
            }
            if (1==1) break l7;
          }
          v10_off = v10_off + v121_pop;
        }
        v16_off = v16_off + (int)128L;
        int v129_pop = Integer.bitCount(v35);
        boolean v130 = v129_pop > (int)3L;
        l10: {
          l8: {
            if (!v130) break l8;
            v11_off = v11_off + (int)3L;
            l9: while(true) {
              int v131 = v43_m - (int)1L;
              int v132_m2 = v43_m & v131;
              int v133 = Integer.numberOfTrailingZeros(v43_m);
              int v134 = v17_off + v133;
              v1_buf0[v11_off] = v134;
              v43_m = v132_m2;
              v11_off = v11_off + (int)1L;
              boolean v136 = v43_m != (int)0L;
              if (v136) continue l9;
              break;
            }
            if (1==1) break l10;
          }
          v11_off = v11_off + v129_pop;
        }
        v17_off = v17_off + (int)128L;
        int v137_pop = Integer.bitCount(v40);
        boolean v138 = v137_pop > (int)3L;
        l13: {
          l11: {
            if (!v138) break l11;
            v12_off = v12_off + (int)3L;
            l12: while(true) {
              int v139 = v44_m - (int)1L;
              int v140_m2 = v44_m & v139;
              int v141 = Integer.numberOfTrailingZeros(v44_m);
              int v142 = v18_off + v141;
              v1_buf0[v12_off] = v142;
              v44_m = v140_m2;
              v12_off = v12_off + (int)1L;
              boolean v144 = v44_m != (int)0L;
              if (v144) continue l12;
              break;
            }
            if (1==1) break l13;
          }
          v12_off = v12_off + v137_pop;
        }
        v18_off = v18_off + (int)128L;
        v19_i = v19_i + (int)1L;
        if (1==1) continue l0;
        break;
      }
    }
    int v145_off = (int)128L;
    v1_buf0[v145_off] = v9_off;
    int v147_off = (int)128L;
    int v148 = v147_off + (int)1L;
    v1_buf0[v148] = v10_off;
    int v150_off = (int)128L;
    int v151 = v150_off + (int)2L;
    v1_buf0[v151] = v11_off;
    int v153_off = (int)128L;
    int v154 = v153_off + (int)3L;
    v1_buf0[v154] = v12_off;
    short[] v156_temp_buf = constarr_1;
    byte[] v157_exp_mask = constarr_2;
    int v158_i = (int)0L;
    l15: {
      l14: while(true) {
        boolean v159 = v158_i < (int)4L;
        if (!v159) break l15;
        int v160 = (int)1004L * v158_i;
        int v161_off = (int)132L + v160;
        int v162_off = (int)128L;
        int v163 = v162_off + v158_i;
        int v164_off = v1_buf0[v163];
        int v165_retctr = (int)0L;
        l17: {
          l16: while(true) {
            boolean v166 = v161_off < v164_off;
            if (!v166) break l17;
            IntVector v167_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_buf0, v161_off);
            IntVector v168 = (IntVector) IntVector.SPECIES_128.broadcast((int)1L);
            IntVector v169 = v167_idxs.add(v168);
            int v170 = v169.lane(0);
            ByteVector v171 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v170);
            LongVector v172 = v171.reinterpretAsLongs();
            long v173 = v172.lane(0);
            int v174 = v169.lane(1);
            ByteVector v175 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v174);
            LongVector v176 = v175.reinterpretAsLongs();
            long v177 = v176.lane(0);
            int v178 = v169.lane(2);
            ByteVector v179 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v178);
            LongVector v180 = v179.reinterpretAsLongs();
            long v181 = v180.lane(0);
            int v182 = v169.lane(3);
            ByteVector v183 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v182);
            LongVector v184 = v183.reinterpretAsLongs();
            long v185 = v184.lane(0);
            v8[0] = v173;
            v8[1] = v177;
            v8[2] = v181;
            v8[3] = v185;
            LongVector v190 = (LongVector) LongVector.SPECIES_256.fromArray(v8, 0);
            ByteVector v191_nums = v190.reinterpretAsBytes();
            ByteVector v192 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46L);
            VectorMask<?> v193 = v191_nums.compare(VectorOperators.EQ, v192);
            ByteVector v194 = (ByteVector) v193.toVector();
            IntVector v195 = v194.reinterpretAsInts();
            IntVector v196 = v195.lanewise(VectorOperators.ASHR, 23);
            LongVector v197 = v196.reinterpretAsLongs();
            LongVector v198 = (LongVector) LongVector.SPECIES_256.broadcast((long)3L);
            LongVector v199 = v197.and(v198);
            ByteVector v200_off = v199.reinterpretAsBytes();
            byte[] v201 = constarr_3;
            ByteVector v202 = (ByteVector) ByteVector.SPECIES_256.fromArray(v201, 0);
            v200_off = v202.selectFrom(v200_off);
            LongVector v203 = v191_nums.reinterpretAsLongs();
            LongVector v204 = (LongVector) LongVector.SPECIES_256.broadcast((long)0x00ffffffffffffffL);
            LongVector v205 = v203.and(v204);
            v191_nums = v205.reinterpretAsBytes();
            byte[] v206 = constarr_4;
            ByteVector v207 = (ByteVector) ByteVector.SPECIES_256.fromArray(v206, 0);
            v200_off = v200_off.or(v207);
            byte[] v208 = constarr_5;
            ByteVector v209 = (ByteVector) ByteVector.SPECIES_256.fromArray(v208, 0);
            v200_off = v200_off.add(v209);
            ByteVector v210 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)31L);
            v200_off = v200_off.and(v210);
            ByteVector v211 = v200_off.selectFrom(v191_nums);
            ShortVector v212_aligned16 = v211.reinterpretAsShorts();
            ByteVector v213 = v212_aligned16.reinterpretAsBytes();
            ByteVector v214 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48L);
            ByteVector v215 = v213.sub(v214);
            ByteVector v216 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0L);
            ByteVector v217 = v215.max(v216);
            v212_aligned16 = v217.reinterpretAsShorts();
            short[] v218 = constarr_6;
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
            ByteVector v226 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45L);
            VectorMask<?> v227 = v191_nums.compare(VectorOperators.EQ, v226);
            ByteVector v228 = (ByteVector) v227.toVector();
            ShortVector v229 = v228.reinterpretAsShorts();
            ShortVector v230 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)0L);
            VectorMask<?> v231 = v229.compare(VectorOperators.NE, v230);
            ShortVector v232 = (ShortVector) v231.toVector();
            ShortVector v233_neg = (v232);
            v212_aligned16 = v212_aligned16.lanewise(VectorOperators.XOR, v233_neg);
            v212_aligned16 = v212_aligned16.sub(v233_neg);
            v212_aligned16.intoArray(v156_temp_buf, 0);
            int v235 = v164_off - v161_off;
            int v236 = Math.min(v235, (int)4L);
            int v237_i = (int)0L;
            l19: {
              l18: while(true) {
                boolean v238 = v237_i < v236;
                if (!v238) break l19;
                int v239 = v161_off + v237_i;
                int v240_off = v1_buf0[v239];
                int v241 = v240_off - (int)16L;
                ByteVector v242_x = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v241);
                ByteVector v243 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10L);
                VectorMask<?> v244 = v242_x.compare(VectorOperators.EQ, v243);
                long v245 = v244.toLong();
                short v246_m = (short) v245;
                boolean v247 = v246_m == (short)0L;
                l21: {
                  l20: {
                    if (!v247) break l20;
                    v1_buf0[v14_off] = v240_off;
                    int v249 = v237_i * (int)4L;
                    short v250 = v156_temp_buf[v249];
                    int v251 = (int) v250;
                    int v252 = v251 << (int)1L;
                    short v253 = (short) v252;
                    int v254 = (int) v253;
                    int v255 = v254 | (int)1L;
                    int v256 = v14_off + (int)1L;
                    v1_buf0[v256] = v255;
                    v14_off = v14_off + (int)2L;
                    if (1==1) break l21;
                  }
                  int v258 = (int) v246_m;
                  int v259 = v258 & (int)65535L;
                  int v260 = Integer.numberOfLeadingZeros(v259);
                  int v261 = v260 - (int)16L;
                  ByteVector v262 = (ByteVector) ByteVector.SPECIES_128.fromArray(v157_exp_mask, v261);
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
                  boolean v278 = v277_m == (byte)0L;
                  l23: {
                    l22: {
                      if (!v278) break l22;
                      v1_buf0[v14_off] = v240_off;
                      int v280 = v237_i * (int)4L;
                      short v281 = v156_temp_buf[v280];
                      int v282 = (int) v281;
                      int v283 = v282 << (int)1L;
                      short v284 = (short) v283;
                      int v285 = (int) v284;
                      int v286 = v285 | (int)0L;
                      int v287 = v14_off + (int)1L;
                      v1_buf0[v287] = v286;
                      v14_off = v14_off + (int)2L;
                      if (1==1) break l23;
                    }
                    int v289 = Integer.numberOfTrailingZeros(v277_m);
                    int v290 = (int) v289;
                    v273_idx = v273_idx + v290;
                    int v291 = v273_idx * (int)16L;
                    ByteVector v292_exp = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v291);
                    boolean v293 = v242_x.equals(v292_exp);
                    boolean v294 = !(v293);
                    l25: {
                      l24: {
                        if (!v294) break l24;
                        v1_buf0[v14_off] = v240_off;
                        int v296 = v237_i * (int)4L;
                        short v297 = v156_temp_buf[v296];
                        int v298 = (int) v297;
                        int v299 = v298 << (int)1L;
                        short v300 = (short) v299;
                        int v301 = (int) v300;
                        int v302 = v301 | (int)0L;
                        int v303 = v14_off + (int)1L;
                        v1_buf0[v303] = v302;
                        v14_off = v14_off + (int)2L;
                        if (1==1) break l25;
                      }
                      int v305_dataoff = v273_idx * (int)4L;
                      int v306 = v237_i * (int)4L;
                      short v307 = v156_temp_buf[v306];
                      long v308_temp = (long) v307;
                      int v309 = v305_dataoff + (int)2L;
                      long v310 = v5_map_data[v309];
                      long v311 = Math.min(v310, v308_temp);
                      v5_map_data[v309] = v311;
                      int v313 = v305_dataoff + (int)3L;
                      long v314 = v5_map_data[v313];
                      long v315 = Math.max(v314, v308_temp);
                      v5_map_data[v313] = v315;
                      long v317 = v5_map_data[v305_dataoff];
                      long v318 = v317 + v308_temp;
                      v5_map_data[v305_dataoff] = v318;
                      int v320 = v305_dataoff + (int)1L;
                      long v321 = v5_map_data[v320];
                      long v322 = v321 + (long)1L;
                      v5_map_data[v320] = v322;
                    }
                  }
                }
                v237_i = v237_i + (int)1L;
                if (1==1) continue l18;
                break;
              }
            }
            v161_off = v161_off + (int)4L;
            if (1==1) continue l16;
            break;
          }
        }
        v158_i = v158_i + (int)1L;
        if (1==1) continue l14;
        break;
      }
    }
    l27: {
      l26: while(true) {
        boolean v324 = v13_off < v14_off;
        if (!v324) break l27;
        int v325 = v1_buf0[v13_off];
        int v326 = v13_off + (int)1L;
        int v327 = v1_buf0[v326];
        v13_off = v13_off + (int)2L;
        int v328 = v327 & (int)1L;
        boolean v329 = v328 != (int)0L;
        int v330 = v327 >> (int)1L;
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
private final static byte[] constarr_7 = new byte[]{0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,16,16,16,16,16,16,16,16,24,24,24,24,24,24,24,24};
public void minibench(byte[] v0_ai8, short[] v1_ai16, int[] v2_ai32, long[] v3_ai64) {
  int switch_num = 0;
  
  switch_loop: while(true) switch(switch_num) {
  case 0:
    long[] v4 = new long[16];
    int v5_i = (int)0L;
    l1: {
      l0: while(true) {
        boolean v6 = v5_i < (int)1000L;
        if (!v6) break l1;
        int v7 = v5_i * (int)16L;
        ShortVector v8_v = (ShortVector) ShortVector.SPECIES_256.fromArray(v1_ai16, v7);
        byte[] v9 = constarr_7;
        ByteVector v10 = (ByteVector) ByteVector.SPECIES_256.fromArray(v9, 0);
        ByteVector v11 = v8_v.reinterpretAsBytes();
        ByteVector v12 = v10.selectFrom(v11);
        v8_v = v12.reinterpretAsShorts();
        v8_v.intoArray(v1_ai16, v7);
        v5_i = v5_i + (int)1L;
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
