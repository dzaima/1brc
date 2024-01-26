package gen;
import jdk.incubator.vector.*;

public class Gen {

private static final byte[] c0_tail_mask_16 = new byte[]{(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1};
private static final byte[] c1_tail_mask_32 = new byte[]{(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1};
public int core_1brc_buf_elts() {
  return 4016;
}
public int core_1brc_periter() {
  return 10624;
}
public int hash_1brc_short(byte[] v0_arr) {
  ByteVector v1 = (ByteVector) ByteVector.SPECIES_128.fromArray(v0_arr, 0);
  IntVector v2_hv = v1.reinterpretAsInts();
  LongVector v3 = v2_hv.reinterpretAsLongs();
  long v4 = v3.lane(1);
  LongVector v5 = (LongVector) LongVector.SPECIES_128.broadcast(v4);
  IntVector v6 = v5.reinterpretAsInts();
  v2_hv = v2_hv.lanewise(VectorOperators.XOR, v6);
  IntVector v7_hv = v2_hv;
  LongVector v8 = v7_hv.reinterpretAsLongs();
  LongVector v9 = v8.lanewise(VectorOperators.LSHR, 32);
  IntVector v10 = v9.reinterpretAsInts();
  v7_hv = v7_hv.lanewise(VectorOperators.XOR, v10);
  IntVector v11 = (v7_hv);
  IntVector v12 = v11.lanewise(VectorOperators.ASHR, 16);
  IntVector v13 = (v12);
  v7_hv = v7_hv.lanewise(VectorOperators.XOR, v13);
  int v14 = v7_hv.lane(0);
  return v14;
}
private final int[] arr_1 = new int[4];
private final short[] arr_2 = new short[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
private final int[] arr_3 = new int[8000];
private final long[] arr_4 = new long[4];
public void core_1brc(int v0_ident, int[] v1_bufdata, int v2_hash_mask, byte[] v3_map_exp, int[] v4_map_hash, long[] v5_map_data, byte[] v6_inp, int v7_inpOff) {
  int[] v8_bufEnds = arr_1;
  f4_asfunc_generator_i8_i32_i32_i32(v6_inp, v7_inpOff, v1_bufdata, v8_bufEnds);
  int v10_semi = 0;
  int v11 = v8_bufEnds[0];
  boolean v12 = 0 != v11;
  l0: {
    if (!v12) break l0;
    v10_semi = v1_bufdata[0];
  }
  int v13 = v8_bufEnds[1];
  boolean v14 = 1004 != v13;
  l1: {
    if (!v14) break l1;
    v10_semi = v1_bufdata[1004];
  }
  int v15 = v8_bufEnds[2];
  boolean v16 = 2008 != v15;
  l2: {
    if (!v16) break l2;
    v10_semi = v1_bufdata[2008];
  }
  int v17 = v8_bufEnds[3];
  boolean v18 = 3012 != v17;
  l3: {
    if (!v18) break l3;
    v10_semi = v1_bufdata[3012];
  }
  int v19_pos = v8_bufEnds[0];
  int v20 = v10_semi + 1;
  v1_bufdata[v19_pos] = v20;
  int v22 = v19_pos + 1;
  int v23 = v10_semi + 1;
  v1_bufdata[v22] = v23;
  int v25 = v19_pos + 2;
  int v26 = v10_semi + 1;
  v1_bufdata[v25] = v26;
  int v28 = v19_pos + 3;
  int v29 = v10_semi + 1;
  v1_bufdata[v28] = v29;
  int v31_pos = v8_bufEnds[1];
  int v32 = v10_semi + 1;
  v1_bufdata[v31_pos] = v32;
  int v34 = v31_pos + 1;
  int v35 = v10_semi + 1;
  v1_bufdata[v34] = v35;
  int v37 = v31_pos + 2;
  int v38 = v10_semi + 1;
  v1_bufdata[v37] = v38;
  int v40 = v31_pos + 3;
  int v41 = v10_semi + 1;
  v1_bufdata[v40] = v41;
  int v43_pos = v8_bufEnds[2];
  int v44 = v10_semi + 1;
  v1_bufdata[v43_pos] = v44;
  int v46 = v43_pos + 1;
  int v47 = v10_semi + 1;
  v1_bufdata[v46] = v47;
  int v49 = v43_pos + 2;
  int v50 = v10_semi + 1;
  v1_bufdata[v49] = v50;
  int v52 = v43_pos + 3;
  int v53 = v10_semi + 1;
  v1_bufdata[v52] = v53;
  int v55_pos = v8_bufEnds[3];
  int v56 = v10_semi + 1;
  v1_bufdata[v55_pos] = v56;
  int v58 = v55_pos + 1;
  int v59 = v10_semi + 1;
  v1_bufdata[v58] = v59;
  int v61 = v55_pos + 2;
  int v62 = v10_semi + 1;
  v1_bufdata[v61] = v62;
  int v64 = v55_pos + 3;
  int v65 = v10_semi + 1;
  v1_bufdata[v64] = v65;
  short[] v67_temp_buf = arr_2;
  int[] v68_failbuf = arr_3;
  int v69_failposS = 0;
  int v70_failposC = 0;
  int v71_i = 0;
  l5: {
    l4: while(true) {
      boolean v72 = v71_i < 4;
      if (!v72) break l5;
      int v73_bufS = v71_i * 1004;
      int v74_bufE = v8_bufEnds[v71_i];
      int v75_retctr = 0;
      l6: {
        l8: {
          l7: while(true) {
            boolean v76 = v73_bufS < v74_bufE;
            if (!v76) break l8;
            int v77_off = v1_bufdata[v73_bufS];
            int v78 = v77_off - 16;
            ByteVector v79 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v78);
            ByteVector v80 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v81 = v79.compare(VectorOperators.EQ, v80);
            long v82_mc = v81.toLong();
            int v83_c = 16;
            boolean v84 = v82_mc != 0L;
            l9: {
              if (!v84) break l9;
              int v85 = Long.numberOfLeadingZeros(v82_mc);
              v83_c = v85 - 48;
            }
            ByteVector v86 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v83_c);
            ByteVector v87 = v79.and(v86);
            int v88 = v73_bufS + 1;
            int v89_off = v1_bufdata[v88];
            int v90 = v89_off - 16;
            ByteVector v91 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v90);
            ByteVector v92 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v93 = v91.compare(VectorOperators.EQ, v92);
            long v94_mc = v93.toLong();
            int v95_c = 16;
            boolean v96 = v94_mc != 0L;
            l10: {
              if (!v96) break l10;
              int v97 = Long.numberOfLeadingZeros(v94_mc);
              v95_c = v97 - 48;
            }
            ByteVector v98 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v95_c);
            ByteVector v99 = v91.and(v98);
            int v100 = v73_bufS + 2;
            int v101_off = v1_bufdata[v100];
            int v102 = v101_off - 16;
            ByteVector v103 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v102);
            ByteVector v104 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v105 = v103.compare(VectorOperators.EQ, v104);
            long v106_mc = v105.toLong();
            int v107_c = 16;
            boolean v108 = v106_mc != 0L;
            l11: {
              if (!v108) break l11;
              int v109 = Long.numberOfLeadingZeros(v106_mc);
              v107_c = v109 - 48;
            }
            ByteVector v110 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v107_c);
            ByteVector v111 = v103.and(v110);
            int v112 = v73_bufS + 3;
            int v113_off = v1_bufdata[v112];
            int v114 = v113_off - 16;
            ByteVector v115 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v114);
            ByteVector v116 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v117 = v115.compare(VectorOperators.EQ, v116);
            long v118_mc = v117.toLong();
            int v119_c = 16;
            boolean v120 = v118_mc != 0L;
            l12: {
              if (!v120) break l12;
              int v121 = Long.numberOfLeadingZeros(v118_mc);
              v119_c = v121 - 48;
            }
            ByteVector v122 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v119_c);
            ByteVector v123 = v115.and(v122);
            IntVector v124_hv = v87.reinterpretAsInts();
            LongVector v125 = v124_hv.reinterpretAsLongs();
            long v126 = v125.lane(1);
            LongVector v127 = (LongVector) LongVector.SPECIES_128.broadcast(v126);
            IntVector v128 = v127.reinterpretAsInts();
            v124_hv = v124_hv.lanewise(VectorOperators.XOR, v128);
            IntVector v129_hv = v124_hv;
            LongVector v130 = v129_hv.reinterpretAsLongs();
            LongVector v131 = v130.lanewise(VectorOperators.LSHR, 32);
            IntVector v132 = v131.reinterpretAsInts();
            v129_hv = v129_hv.lanewise(VectorOperators.XOR, v132);
            IntVector v133 = (v129_hv);
            IntVector v134 = v133.lanewise(VectorOperators.ASHR, 16);
            IntVector v135 = (v134);
            v129_hv = v129_hv.lanewise(VectorOperators.XOR, v135);
            IntVector v136_hv = v99.reinterpretAsInts();
            LongVector v137 = v136_hv.reinterpretAsLongs();
            long v138 = v137.lane(1);
            LongVector v139 = (LongVector) LongVector.SPECIES_128.broadcast(v138);
            IntVector v140 = v139.reinterpretAsInts();
            v136_hv = v136_hv.lanewise(VectorOperators.XOR, v140);
            IntVector v141_hv = v136_hv;
            LongVector v142 = v141_hv.reinterpretAsLongs();
            LongVector v143 = v142.lanewise(VectorOperators.LSHR, 32);
            IntVector v144 = v143.reinterpretAsInts();
            v141_hv = v141_hv.lanewise(VectorOperators.XOR, v144);
            IntVector v145 = (v141_hv);
            IntVector v146 = v145.lanewise(VectorOperators.ASHR, 16);
            IntVector v147 = (v146);
            v141_hv = v141_hv.lanewise(VectorOperators.XOR, v147);
            IntVector v148_hv = v111.reinterpretAsInts();
            LongVector v149 = v148_hv.reinterpretAsLongs();
            long v150 = v149.lane(1);
            LongVector v151 = (LongVector) LongVector.SPECIES_128.broadcast(v150);
            IntVector v152 = v151.reinterpretAsInts();
            v148_hv = v148_hv.lanewise(VectorOperators.XOR, v152);
            IntVector v153_hv = v148_hv;
            LongVector v154 = v153_hv.reinterpretAsLongs();
            LongVector v155 = v154.lanewise(VectorOperators.LSHR, 32);
            IntVector v156 = v155.reinterpretAsInts();
            v153_hv = v153_hv.lanewise(VectorOperators.XOR, v156);
            IntVector v157 = (v153_hv);
            IntVector v158 = v157.lanewise(VectorOperators.ASHR, 16);
            IntVector v159 = (v158);
            v153_hv = v153_hv.lanewise(VectorOperators.XOR, v159);
            IntVector v160_hv = v123.reinterpretAsInts();
            LongVector v161 = v160_hv.reinterpretAsLongs();
            long v162 = v161.lane(1);
            LongVector v163 = (LongVector) LongVector.SPECIES_128.broadcast(v162);
            IntVector v164 = v163.reinterpretAsInts();
            v160_hv = v160_hv.lanewise(VectorOperators.XOR, v164);
            IntVector v165_hv = v160_hv;
            LongVector v166 = v165_hv.reinterpretAsLongs();
            LongVector v167 = v166.lanewise(VectorOperators.LSHR, 32);
            IntVector v168 = v167.reinterpretAsInts();
            v165_hv = v165_hv.lanewise(VectorOperators.XOR, v168);
            IntVector v169 = (v165_hv);
            IntVector v170 = v169.lanewise(VectorOperators.ASHR, 16);
            IntVector v171 = (v170);
            v165_hv = v165_hv.lanewise(VectorOperators.XOR, v171);
            int v172 = v129_hv.lane(0);
            int v173 = v172 & v2_hash_mask;
            int v174 = (int) v173;
            IntVector v175 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v174);
            IntVector v176 = (IntVector) IntVector.SPECIES_128.broadcast(v172);
            VectorMask<?> v177 = v176.compare(VectorOperators.EQ, v175);
            long v178 = v177.toLong();
            int v179 = Long.numberOfTrailingZeros(v178);
            int v180 = v174 + v179;
            int v181 = v141_hv.lane(0);
            int v182 = v181 & v2_hash_mask;
            int v183 = (int) v182;
            IntVector v184 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v183);
            IntVector v185 = (IntVector) IntVector.SPECIES_128.broadcast(v181);
            VectorMask<?> v186 = v185.compare(VectorOperators.EQ, v184);
            long v187 = v186.toLong();
            int v188 = Long.numberOfTrailingZeros(v187);
            int v189 = v183 + v188;
            int v190 = v153_hv.lane(0);
            int v191 = v190 & v2_hash_mask;
            int v192 = (int) v191;
            IntVector v193 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v192);
            IntVector v194 = (IntVector) IntVector.SPECIES_128.broadcast(v190);
            VectorMask<?> v195 = v194.compare(VectorOperators.EQ, v193);
            long v196 = v195.toLong();
            int v197 = Long.numberOfTrailingZeros(v196);
            int v198 = v192 + v197;
            int v199 = v165_hv.lane(0);
            int v200 = v199 & v2_hash_mask;
            int v201 = (int) v200;
            IntVector v202 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v201);
            IntVector v203 = (IntVector) IntVector.SPECIES_128.broadcast(v199);
            VectorMask<?> v204 = v203.compare(VectorOperators.EQ, v202);
            long v205 = v204.toLong();
            int v206 = Long.numberOfTrailingZeros(v205);
            int v207 = v201 + v206;
            int v208 = v180 * 16;
            ByteVector v209 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v208);
            int v210 = v189 * 16;
            ByteVector v211 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v210);
            int v212 = v198 * 16;
            ByteVector v213 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v212);
            int v214 = v207 * 16;
            ByteVector v215 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v214);
            IntVector v216_num_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_bufdata, v73_bufS);
            IntVector v217 = (IntVector) IntVector.SPECIES_128.broadcast(1);
            IntVector v218_idxs2 = v216_num_idxs.add(v217);
            int v219 = v218_idxs2.lane(0);
            ByteVector v220 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v219);
            LongVector v221 = v220.reinterpretAsLongs();
            long v222 = v221.lane(0);
            int v223 = v218_idxs2.lane(1);
            ByteVector v224 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v223);
            LongVector v225 = v224.reinterpretAsLongs();
            long v226 = v225.lane(0);
            int v227 = v218_idxs2.lane(2);
            ByteVector v228 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v227);
            LongVector v229 = v228.reinterpretAsLongs();
            long v230 = v229.lane(0);
            int v231 = v218_idxs2.lane(3);
            ByteVector v232 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v231);
            LongVector v233 = v232.reinterpretAsLongs();
            long v234 = v233.lane(0);
            long[] v235 = arr_4;
            v235[0] = v222;
            v235[1] = v226;
            v235[2] = v230;
            v235[3] = v234;
            LongVector v240 = (LongVector) LongVector.SPECIES_256.fromArray(v235, 0);
            ByteVector v241_nums = v240.reinterpretAsBytes();
            ByteVector v242 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
            VectorMask<?> v243 = v241_nums.compare(VectorOperators.EQ, v242);
            ByteVector v244 = (ByteVector) v243.toVector();
            ByteVector v245 = (v244);
            IntVector v246 = v245.reinterpretAsInts();
            IntVector v247 = v246.lanewise(VectorOperators.ASHR, 20);
            ByteVector v248 = v247.reinterpretAsBytes();
            LongVector v249 = v248.reinterpretAsLongs();
            LongVector v250 = (LongVector) LongVector.SPECIES_256.broadcast(24L);
            LongVector v251 = v249.and(v250);
            ByteVector v252_off = v251.reinterpretAsBytes();
            LongVector v253 = (LongVector) LongVector.SPECIES_256.broadcast(40L);
            LongVector v254 = v252_off.reinterpretAsLongs();
            LongVector v255 = v253.sub(v254);
            ByteVector v256 = v255.reinterpretAsBytes();
            LongVector v257 = v241_nums.reinterpretAsLongs();
            LongVector v258 = v256.reinterpretAsLongs();
            LongVector v259 = v257.lanewise(VectorOperators.LSHL, v258);
            v241_nums = v259.reinterpretAsBytes();
            ByteVector v260 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
            ByteVector v261 = v241_nums.sub(v260);
            ByteVector v262 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
            ByteVector v263_aligned = v261.max(v262);
            ShortVector v264 = v263_aligned.reinterpretAsShorts();
            IntVector v265 = v264.reinterpretAsInts();
            IntVector v266 = (IntVector) IntVector.SPECIES_256.broadcast(255);
            IntVector v267 = v265.and(v266);
            ShortVector v268 = v267.reinterpretAsShorts();
            ShortVector v269 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)100);
            ShortVector v270_r = v268.mul(v269);
            ShortVector v271 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)10);
            ShortVector v272 = v264.mul(v271);
            ShortVector v273 = v272.lanewise(VectorOperators.LSHR, 8);
            v270_r = v270_r.add(v273);
            IntVector v274 = v264.reinterpretAsInts();
            IntVector v275 = v274.lanewise(VectorOperators.LSHR, 24);
            ShortVector v276 = v275.reinterpretAsShorts();
            v270_r = v270_r.add(v276);
            ShortVector v277 = (v270_r);
            ByteVector v278 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
            VectorMask<?> v279 = v241_nums.compare(VectorOperators.EQ, v278);
            ByteVector v280 = (ByteVector) v279.toVector();
            LongVector v281 = v280.reinterpretAsLongs();
            LongVector v282 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
            VectorMask<?> v283 = v281.compare(VectorOperators.NE, v282);
            LongVector v284 = (LongVector) v283.toVector();
            ByteVector v285 = v284.reinterpretAsBytes();
            ShortVector v286_neg = v285.reinterpretAsShorts();
            ShortVector v287_each16n = v277.lanewise(VectorOperators.XOR, v286_neg);
            v287_each16n = v287_each16n.sub(v286_neg);
            v287_each16n.intoArray(v67_temp_buf, 0);
            boolean v289 = v87.equals(v209);
            l14: {
              l13: {
                if (!v289) break l13;
                int v290 = v180 * 4;
                short v291 = v67_temp_buf[2];
                long v292_temp = (long) v291;
                int v293 = v290 + 2;
                long v294 = v5_map_data[v293];
                long v295 = Math.min(v294, v292_temp);
                v5_map_data[v293] = v295;
                int v297 = v290 + 3;
                long v298 = v5_map_data[v297];
                long v299 = Math.max(v298, v292_temp);
                v5_map_data[v297] = v299;
                long v301 = v5_map_data[v290];
                long v302 = v301 + v292_temp;
                v5_map_data[v290] = v302;
                int v304 = v290 + 1;
                long v305 = v5_map_data[v304];
                long v306 = v305 + 1L;
                v5_map_data[v304] = v306;
                if (1==1) break l14;
              }
              int v308 = v74_bufE - v73_bufS;
              boolean v309 = 0 >= v308;
              l15: {
                if (!v309) break l15;
                if (1==1) break l6;
              }
              int v310 = v1_bufdata[v73_bufS];
              v68_failbuf[v70_failposC] = v310;
              int v312 = v70_failposC + 1;
              short v313 = v67_temp_buf[2];
              int v314 = (int) v313;
              v68_failbuf[v312] = v314;
              int v316 = 1 << 1;
              v70_failposC = v70_failposC + v316;
            }
            boolean v317 = v99.equals(v211);
            l17: {
              l16: {
                if (!v317) break l16;
                int v318 = v189 * 4;
                short v319 = v67_temp_buf[6];
                long v320_temp = (long) v319;
                int v321 = v318 + 2;
                long v322 = v5_map_data[v321];
                long v323 = Math.min(v322, v320_temp);
                v5_map_data[v321] = v323;
                int v325 = v318 + 3;
                long v326 = v5_map_data[v325];
                long v327 = Math.max(v326, v320_temp);
                v5_map_data[v325] = v327;
                long v329 = v5_map_data[v318];
                long v330 = v329 + v320_temp;
                v5_map_data[v318] = v330;
                int v332 = v318 + 1;
                long v333 = v5_map_data[v332];
                long v334 = v333 + 1L;
                v5_map_data[v332] = v334;
                if (1==1) break l17;
              }
              int v336 = v74_bufE - v73_bufS;
              boolean v337 = 1 >= v336;
              l18: {
                if (!v337) break l18;
                if (1==1) break l6;
              }
              int v338 = v73_bufS + 1;
              int v339 = v1_bufdata[v338];
              v68_failbuf[v70_failposC] = v339;
              int v341 = v70_failposC + 1;
              short v342 = v67_temp_buf[6];
              int v343 = (int) v342;
              v68_failbuf[v341] = v343;
              int v345 = 1 << 1;
              v70_failposC = v70_failposC + v345;
            }
            boolean v346 = v111.equals(v213);
            l20: {
              l19: {
                if (!v346) break l19;
                int v347 = v198 * 4;
                short v348 = v67_temp_buf[10];
                long v349_temp = (long) v348;
                int v350 = v347 + 2;
                long v351 = v5_map_data[v350];
                long v352 = Math.min(v351, v349_temp);
                v5_map_data[v350] = v352;
                int v354 = v347 + 3;
                long v355 = v5_map_data[v354];
                long v356 = Math.max(v355, v349_temp);
                v5_map_data[v354] = v356;
                long v358 = v5_map_data[v347];
                long v359 = v358 + v349_temp;
                v5_map_data[v347] = v359;
                int v361 = v347 + 1;
                long v362 = v5_map_data[v361];
                long v363 = v362 + 1L;
                v5_map_data[v361] = v363;
                if (1==1) break l20;
              }
              int v365 = v74_bufE - v73_bufS;
              boolean v366 = 2 >= v365;
              l21: {
                if (!v366) break l21;
                if (1==1) break l6;
              }
              int v367 = v73_bufS + 2;
              int v368 = v1_bufdata[v367];
              v68_failbuf[v70_failposC] = v368;
              int v370 = v70_failposC + 1;
              short v371 = v67_temp_buf[10];
              int v372 = (int) v371;
              v68_failbuf[v370] = v372;
              int v374 = 1 << 1;
              v70_failposC = v70_failposC + v374;
            }
            boolean v375 = v123.equals(v215);
            l23: {
              l22: {
                if (!v375) break l22;
                int v376 = v207 * 4;
                short v377 = v67_temp_buf[14];
                long v378_temp = (long) v377;
                int v379 = v376 + 2;
                long v380 = v5_map_data[v379];
                long v381 = Math.min(v380, v378_temp);
                v5_map_data[v379] = v381;
                int v383 = v376 + 3;
                long v384 = v5_map_data[v383];
                long v385 = Math.max(v384, v378_temp);
                v5_map_data[v383] = v385;
                long v387 = v5_map_data[v376];
                long v388 = v387 + v378_temp;
                v5_map_data[v376] = v388;
                int v390 = v376 + 1;
                long v391 = v5_map_data[v390];
                long v392 = v391 + 1L;
                v5_map_data[v390] = v392;
                if (1==1) break l23;
              }
              int v394 = v74_bufE - v73_bufS;
              boolean v395 = 3 >= v394;
              l24: {
                if (!v395) break l24;
                if (1==1) break l6;
              }
              int v396 = v73_bufS + 3;
              int v397 = v1_bufdata[v396];
              v68_failbuf[v70_failposC] = v397;
              int v399 = v70_failposC + 1;
              short v400 = v67_temp_buf[14];
              int v401 = (int) v400;
              v68_failbuf[v399] = v401;
              int v403 = 1 << 1;
              v70_failposC = v70_failposC + v403;
            }
            v73_bufS = v73_bufS + 4;
            if (1==1) continue l7;
            break;
          }
        }
      }
      v71_i = v71_i + 1;
      if (1==1) continue l4;
      break;
    }
  }
  l26: {
    l25: while(true) {
      boolean v404 = v69_failposS < v70_failposC;
      if (!v404) break l26;
      int v405 = v68_failbuf[v69_failposS];
      int v406 = v69_failposS + 1;
      int v407 = v68_failbuf[v406];
      v69_failposS = v69_failposS + 2;
      int v408 = v405 - 16;
      ByteVector v409 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v408);
      ByteVector v410 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
      VectorMask<?> v411 = v409.compare(VectorOperators.EQ, v410);
      long v412_m = v411.toLong();
      boolean v413 = v412_m == 0L;
      l31: {
        l27: {
          if (!v413) break l27;
          int v414_start = v405 + 32;
          int v415_hashv = 0;
          boolean v416_cont = true;
          l28: while(true) {
            v414_start = v414_start - 32;
            int v417 = v414_start - 32;
            ByteVector v418 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v417);
            ByteVector v419 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)10);
            VectorMask<?> v420 = v418.compare(VectorOperators.EQ, v419);
            long v421_m = v420.toLong();
            v416_cont = v421_m == 0L;
            l30: {
              l29: {
                if (!v416_cont) break l29;
                if (1==1) break l30;
              }
              int v422 = Long.numberOfLeadingZeros(v421_m);
              int v423_c = v422 - 32;
              v414_start = v414_start - v423_c;
            }
            if (v416_cont) continue l28;
            break;
          }
          main.Main.failed_long(v0_ident, v414_start, v405, v407);
          if (1==1) break l31;
        }
        int v425 = Long.numberOfLeadingZeros(v412_m);
        int v426_c = v425 - 48;
        int v427 = v405 - v426_c;
        ByteVector v428 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v426_c);
        ByteVector v429 = v409.and(v428);
        IntVector v430_hv = v429.reinterpretAsInts();
        LongVector v431 = v430_hv.reinterpretAsLongs();
        long v432 = v431.lane(1);
        LongVector v433 = (LongVector) LongVector.SPECIES_128.broadcast(v432);
        IntVector v434 = v433.reinterpretAsInts();
        v430_hv = v430_hv.lanewise(VectorOperators.XOR, v434);
        IntVector v435_hv = v430_hv;
        LongVector v436 = v435_hv.reinterpretAsLongs();
        LongVector v437 = v436.lanewise(VectorOperators.LSHR, 32);
        IntVector v438 = v437.reinterpretAsInts();
        v435_hv = v435_hv.lanewise(VectorOperators.XOR, v438);
        IntVector v439 = (v435_hv);
        IntVector v440 = v439.lanewise(VectorOperators.ASHR, 16);
        IntVector v441 = (v440);
        v435_hv = v435_hv.lanewise(VectorOperators.XOR, v441);
        int v442 = v435_hv.lane(0);
        main.Main.failed_short(v0_ident, v427, v405, v407, v442);
      }
      if (1==1) continue l25;
      break;
    }
  }
  return;
}
public void f4_asfunc_generator_i8_i32_i32_i32(byte[] v0_a, int v1_a, int[] v2_a, int[] v3_a) {
  int v4_new = 0;
  int v5_new = 1004;
  int v6_new = 2008;
  int v7_new = 3012;
  int v8_new = v1_a;
  int v9_new = v1_a + 32;
  int v10_new = v1_a + 64;
  int v11_new = v1_a + 96;
  int v12_i = 0;
  l1: {
    l0: while(true) {
      boolean v13 = v12_i < 83;
      if (!v13) break l1;
      ByteVector v14 = (ByteVector) ByteVector.SPECIES_256.fromArray(v0_a, v8_new);
      ByteVector v15 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v16 = v14.compare(VectorOperators.EQ, v15);
      long v17 = v16.toLong();
      ByteVector v18 = (ByteVector) ByteVector.SPECIES_256.fromArray(v0_a, v9_new);
      ByteVector v19 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v20 = v18.compare(VectorOperators.EQ, v19);
      long v21 = v20.toLong();
      ByteVector v22 = (ByteVector) ByteVector.SPECIES_256.fromArray(v0_a, v10_new);
      ByteVector v23 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v24 = v22.compare(VectorOperators.EQ, v23);
      long v25 = v24.toLong();
      ByteVector v26 = (ByteVector) ByteVector.SPECIES_256.fromArray(v0_a, v11_new);
      ByteVector v27 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v28 = v26.compare(VectorOperators.EQ, v27);
      long v29 = v28.toLong();
      long v30_new = v17;
      long v31_new = v21;
      long v32_new = v25;
      long v33_new = v29;
      long v34 = v30_new - 1L;
      long v35_m2 = v30_new & v34;
      int v36 = Long.numberOfTrailingZeros(v30_new);
      int v37 = v8_new + v36;
      v2_a[v4_new] = v37;
      v30_new = v35_m2;
      long v39 = v31_new - 1L;
      long v40_m2 = v31_new & v39;
      int v41 = Long.numberOfTrailingZeros(v31_new);
      int v42 = v9_new + v41;
      v2_a[v5_new] = v42;
      v31_new = v40_m2;
      long v44 = v32_new - 1L;
      long v45_m2 = v32_new & v44;
      int v46 = Long.numberOfTrailingZeros(v32_new);
      int v47 = v10_new + v46;
      v2_a[v6_new] = v47;
      v32_new = v45_m2;
      long v49 = v33_new - 1L;
      long v50_m2 = v33_new & v49;
      int v51 = Long.numberOfTrailingZeros(v33_new);
      int v52 = v11_new + v51;
      v2_a[v7_new] = v52;
      v33_new = v50_m2;
      long v54 = v30_new - 1L;
      long v55_m2 = v30_new & v54;
      int v56 = v4_new + 1;
      int v57 = Long.numberOfTrailingZeros(v30_new);
      int v58 = v8_new + v57;
      v2_a[v56] = v58;
      v30_new = v55_m2;
      long v60 = v31_new - 1L;
      long v61_m2 = v31_new & v60;
      int v62 = v5_new + 1;
      int v63 = Long.numberOfTrailingZeros(v31_new);
      int v64 = v9_new + v63;
      v2_a[v62] = v64;
      v31_new = v61_m2;
      long v66 = v32_new - 1L;
      long v67_m2 = v32_new & v66;
      int v68 = v6_new + 1;
      int v69 = Long.numberOfTrailingZeros(v32_new);
      int v70 = v10_new + v69;
      v2_a[v68] = v70;
      v32_new = v67_m2;
      long v72 = v33_new - 1L;
      long v73_m2 = v33_new & v72;
      int v74 = v7_new + 1;
      int v75 = Long.numberOfTrailingZeros(v33_new);
      int v76 = v11_new + v75;
      v2_a[v74] = v76;
      v33_new = v73_m2;
      long v78 = v30_new - 1L;
      long v79_m2 = v30_new & v78;
      int v80 = v4_new + 2;
      int v81 = Long.numberOfTrailingZeros(v30_new);
      int v82 = v8_new + v81;
      v2_a[v80] = v82;
      v30_new = v79_m2;
      long v84 = v31_new - 1L;
      long v85_m2 = v31_new & v84;
      int v86 = v5_new + 2;
      int v87 = Long.numberOfTrailingZeros(v31_new);
      int v88 = v9_new + v87;
      v2_a[v86] = v88;
      v31_new = v85_m2;
      long v90 = v32_new - 1L;
      long v91_m2 = v32_new & v90;
      int v92 = v6_new + 2;
      int v93 = Long.numberOfTrailingZeros(v32_new);
      int v94 = v10_new + v93;
      v2_a[v92] = v94;
      v32_new = v91_m2;
      long v96 = v33_new - 1L;
      long v97_m2 = v33_new & v96;
      int v98 = v7_new + 2;
      int v99 = Long.numberOfTrailingZeros(v33_new);
      int v100 = v11_new + v99;
      v2_a[v98] = v100;
      v33_new = v97_m2;
      int v102_pop = Long.bitCount(v17);
      boolean v103 = v102_pop > 3;
      l4: {
        l2: {
          if (!v103) break l2;
          v4_new = v4_new + 3;
          l3: while(true) {
            long v104 = v30_new - 1L;
            long v105_m2 = v30_new & v104;
            int v106 = Long.numberOfTrailingZeros(v30_new);
            int v107 = v8_new + v106;
            v2_a[v4_new] = v107;
            v30_new = v105_m2;
            v4_new = v4_new + 1;
            boolean v109 = v30_new != 0L;
            if (v109) continue l3;
            break;
          }
          if (1==1) break l4;
        }
        v4_new = v4_new + v102_pop;
      }
      v8_new = v8_new + 128;
      int v110_pop = Long.bitCount(v21);
      boolean v111 = v110_pop > 3;
      l7: {
        l5: {
          if (!v111) break l5;
          v5_new = v5_new + 3;
          l6: while(true) {
            long v112 = v31_new - 1L;
            long v113_m2 = v31_new & v112;
            int v114 = Long.numberOfTrailingZeros(v31_new);
            int v115 = v9_new + v114;
            v2_a[v5_new] = v115;
            v31_new = v113_m2;
            v5_new = v5_new + 1;
            boolean v117 = v31_new != 0L;
            if (v117) continue l6;
            break;
          }
          if (1==1) break l7;
        }
        v5_new = v5_new + v110_pop;
      }
      v9_new = v9_new + 128;
      int v118_pop = Long.bitCount(v25);
      boolean v119 = v118_pop > 3;
      l10: {
        l8: {
          if (!v119) break l8;
          v6_new = v6_new + 3;
          l9: while(true) {
            long v120 = v32_new - 1L;
            long v121_m2 = v32_new & v120;
            int v122 = Long.numberOfTrailingZeros(v32_new);
            int v123 = v10_new + v122;
            v2_a[v6_new] = v123;
            v32_new = v121_m2;
            v6_new = v6_new + 1;
            boolean v125 = v32_new != 0L;
            if (v125) continue l9;
            break;
          }
          if (1==1) break l10;
        }
        v6_new = v6_new + v118_pop;
      }
      v10_new = v10_new + 128;
      int v126_pop = Long.bitCount(v29);
      boolean v127 = v126_pop > 3;
      l13: {
        l11: {
          if (!v127) break l11;
          v7_new = v7_new + 3;
          l12: while(true) {
            long v128 = v33_new - 1L;
            long v129_m2 = v33_new & v128;
            int v130 = Long.numberOfTrailingZeros(v33_new);
            int v131 = v11_new + v130;
            v2_a[v7_new] = v131;
            v33_new = v129_m2;
            v7_new = v7_new + 1;
            boolean v133 = v33_new != 0L;
            if (v133) continue l12;
            break;
          }
          if (1==1) break l13;
        }
        v7_new = v7_new + v126_pop;
      }
      v11_new = v11_new + 128;
      v12_i = v12_i + 1;
      if (1==1) continue l0;
      break;
    }
  }
  v3_a[0] = v4_new;
  v3_a[1] = v5_new;
  v3_a[2] = v6_new;
  v3_a[3] = v7_new;
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
