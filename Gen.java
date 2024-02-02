package gen;
import jdk.incubator.vector.*;

public class Gen {

private static final byte[] c0_tail_mask_16 = new byte[]{(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1};
private static final byte[] c1_tail_mask_32 = new byte[]{(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1,(byte)-1};
public int core_1brc_buf_elts() {
  return 3012;
}
public int core_1brc_periter() {
  return 10656;
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
public void f3_semisearch(byte[] v0_inp, int v1_inpOff, int[] v2_bufdata, int[] v3_bufEnds) {
  int v4_new = 0;
  int v5_new = 1004;
  int v6_new = 2008;
  int v7_new = v1_inpOff;
  int v8_new = v1_inpOff + 32;
  int v9_new = v1_inpOff + 64;
  int v10_i = 0;
  l1: {
    l0: while(true) {
      boolean v11 = v10_i < 111;
      if (!v11) break l1;
      ByteVector v12 = (ByteVector) ByteVector.SPECIES_256.fromArray(v0_inp, v7_new);
      ByteVector v13 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v14 = v12.compare(VectorOperators.EQ, v13);
      long v15 = v14.toLong();
      ByteVector v16 = (ByteVector) ByteVector.SPECIES_256.fromArray(v0_inp, v8_new);
      ByteVector v17 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v18 = v16.compare(VectorOperators.EQ, v17);
      long v19 = v18.toLong();
      ByteVector v20 = (ByteVector) ByteVector.SPECIES_256.fromArray(v0_inp, v9_new);
      ByteVector v21 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)59);
      VectorMask<?> v22 = v20.compare(VectorOperators.EQ, v21);
      long v23 = v22.toLong();
      long v24_new = v15;
      long v25_new = v19;
      long v26_new = v23;
      long v27 = v24_new - 1L;
      long v28_m2 = v24_new & v27;
      int v29 = Long.numberOfTrailingZeros(v24_new);
      int v30 = v7_new + v29;
      v2_bufdata[v4_new] = v30;
      v24_new = v28_m2;
      long v32 = v25_new - 1L;
      long v33_m2 = v25_new & v32;
      int v34 = Long.numberOfTrailingZeros(v25_new);
      int v35 = v8_new + v34;
      v2_bufdata[v5_new] = v35;
      v25_new = v33_m2;
      long v37 = v26_new - 1L;
      long v38_m2 = v26_new & v37;
      int v39 = Long.numberOfTrailingZeros(v26_new);
      int v40 = v9_new + v39;
      v2_bufdata[v6_new] = v40;
      v26_new = v38_m2;
      long v42 = v24_new - 1L;
      long v43_m2 = v24_new & v42;
      int v44 = v4_new + 1;
      int v45 = Long.numberOfTrailingZeros(v24_new);
      int v46 = v7_new + v45;
      v2_bufdata[v44] = v46;
      v24_new = v43_m2;
      long v48 = v25_new - 1L;
      long v49_m2 = v25_new & v48;
      int v50 = v5_new + 1;
      int v51 = Long.numberOfTrailingZeros(v25_new);
      int v52 = v8_new + v51;
      v2_bufdata[v50] = v52;
      v25_new = v49_m2;
      long v54 = v26_new - 1L;
      long v55_m2 = v26_new & v54;
      int v56 = v6_new + 1;
      int v57 = Long.numberOfTrailingZeros(v26_new);
      int v58 = v9_new + v57;
      v2_bufdata[v56] = v58;
      v26_new = v55_m2;
      long v60 = v24_new - 1L;
      long v61_m2 = v24_new & v60;
      int v62 = v4_new + 2;
      int v63 = Long.numberOfTrailingZeros(v24_new);
      int v64 = v7_new + v63;
      v2_bufdata[v62] = v64;
      v24_new = v61_m2;
      long v66 = v25_new - 1L;
      long v67_m2 = v25_new & v66;
      int v68 = v5_new + 2;
      int v69 = Long.numberOfTrailingZeros(v25_new);
      int v70 = v8_new + v69;
      v2_bufdata[v68] = v70;
      v25_new = v67_m2;
      long v72 = v26_new - 1L;
      long v73_m2 = v26_new & v72;
      int v74 = v6_new + 2;
      int v75 = Long.numberOfTrailingZeros(v26_new);
      int v76 = v9_new + v75;
      v2_bufdata[v74] = v76;
      v26_new = v73_m2;
      int v78_pop = Long.bitCount(v15);
      boolean v79 = v78_pop > 3;
      l4: {
        l2: {
          if (!v79) break l2;
          v4_new = v4_new + 3;
          l3: while(true) {
            long v80 = v24_new - 1L;
            long v81_m2 = v24_new & v80;
            int v82 = Long.numberOfTrailingZeros(v24_new);
            int v83 = v7_new + v82;
            v2_bufdata[v4_new] = v83;
            v24_new = v81_m2;
            v4_new = v4_new + 1;
            boolean v85 = v24_new != 0L;
            if (v85) continue l3;
            break;
          }
          if (1==1) break l4;
        }
        v4_new = v4_new + v78_pop;
      }
      v7_new = v7_new + 96;
      int v86_pop = Long.bitCount(v19);
      boolean v87 = v86_pop > 3;
      l7: {
        l5: {
          if (!v87) break l5;
          v5_new = v5_new + 3;
          l6: while(true) {
            long v88 = v25_new - 1L;
            long v89_m2 = v25_new & v88;
            int v90 = Long.numberOfTrailingZeros(v25_new);
            int v91 = v8_new + v90;
            v2_bufdata[v5_new] = v91;
            v25_new = v89_m2;
            v5_new = v5_new + 1;
            boolean v93 = v25_new != 0L;
            if (v93) continue l6;
            break;
          }
          if (1==1) break l7;
        }
        v5_new = v5_new + v86_pop;
      }
      v8_new = v8_new + 96;
      int v94_pop = Long.bitCount(v23);
      boolean v95 = v94_pop > 3;
      l10: {
        l8: {
          if (!v95) break l8;
          v6_new = v6_new + 3;
          l9: while(true) {
            long v96 = v26_new - 1L;
            long v97_m2 = v26_new & v96;
            int v98 = Long.numberOfTrailingZeros(v26_new);
            int v99 = v9_new + v98;
            v2_bufdata[v6_new] = v99;
            v26_new = v97_m2;
            v6_new = v6_new + 1;
            boolean v101 = v26_new != 0L;
            if (v101) continue l9;
            break;
          }
          if (1==1) break l10;
        }
        v6_new = v6_new + v94_pop;
      }
      v9_new = v9_new + 96;
      v10_i = v10_i + 1;
      if (1==1) continue l0;
      break;
    }
  }
  v3_bufEnds[0] = v4_new;
  v3_bufEnds[1] = v5_new;
  v3_bufEnds[2] = v6_new;
  return;
}
private final int[] arr_1 = new int[3];
private final short[] arr_2 = new short[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
private final int[] arr_3 = new int[6000];
private final long[] arr_4 = new long[4];
public void core_1brc(int v0_ident, int[] v1_bufdata, int v2_hash_mask, byte[] v3_map_exp, int[] v4_map_hash, long[] v5_map_data, byte[] v6_inp, int v7_inpOff) {
  int[] v8_bufEnds = arr_1;
  f3_semisearch(v6_inp, v7_inpOff, v1_bufdata, v8_bufEnds);
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
  int v17_pos = v8_bufEnds[0];
  int v18 = v10_semi + 1;
  v1_bufdata[v17_pos] = v18;
  int v20 = v17_pos + 1;
  int v21 = v10_semi + 1;
  v1_bufdata[v20] = v21;
  int v23 = v17_pos + 2;
  int v24 = v10_semi + 1;
  v1_bufdata[v23] = v24;
  int v26 = v17_pos + 3;
  int v27 = v10_semi + 1;
  v1_bufdata[v26] = v27;
  int v29_pos = v8_bufEnds[1];
  int v30 = v10_semi + 1;
  v1_bufdata[v29_pos] = v30;
  int v32 = v29_pos + 1;
  int v33 = v10_semi + 1;
  v1_bufdata[v32] = v33;
  int v35 = v29_pos + 2;
  int v36 = v10_semi + 1;
  v1_bufdata[v35] = v36;
  int v38 = v29_pos + 3;
  int v39 = v10_semi + 1;
  v1_bufdata[v38] = v39;
  int v41_pos = v8_bufEnds[2];
  int v42 = v10_semi + 1;
  v1_bufdata[v41_pos] = v42;
  int v44 = v41_pos + 1;
  int v45 = v10_semi + 1;
  v1_bufdata[v44] = v45;
  int v47 = v41_pos + 2;
  int v48 = v10_semi + 1;
  v1_bufdata[v47] = v48;
  int v50 = v41_pos + 3;
  int v51 = v10_semi + 1;
  v1_bufdata[v50] = v51;
  short[] v53_temp_buf = arr_2;
  int[] v54_failbuf = arr_3;
  int v55_failposS = 0;
  int v56_failposC = 0;
  int v57_i = 0;
  l4: {
    l3: while(true) {
      boolean v58 = v57_i < 3;
      if (!v58) break l4;
      int v59_bufS = v57_i * 1004;
      int v60_bufE = v8_bufEnds[v57_i];
      int v61_retctr = 0;
      l5: {
        l7: {
          l6: while(true) {
            boolean v62 = v59_bufS < v60_bufE;
            if (!v62) break l7;
            int v63_off = v1_bufdata[v59_bufS];
            int v64 = v63_off - 16;
            ByteVector v65 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v64);
            ByteVector v66 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v67 = v65.compare(VectorOperators.EQ, v66);
            long v68_mc = v67.toLong();
            int v69_c = 0;
            boolean v70 = v68_mc != 0L;
            l9: {
              l8: {
                if (!v70) break l8;
                v69_c = Long.numberOfLeadingZeros(v68_mc);
                if (1==1) break l9;
              }
              v69_c = 64;
            }
            v69_c = v69_c - 48;
            ByteVector v71 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v69_c);
            ByteVector v72 = v65.and(v71);
            int v73 = v59_bufS + 1;
            int v74_off = v1_bufdata[v73];
            int v75 = v74_off - 16;
            ByteVector v76 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v75);
            ByteVector v77 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v78 = v76.compare(VectorOperators.EQ, v77);
            long v79_mc = v78.toLong();
            int v80_c = 0;
            boolean v81 = v79_mc != 0L;
            l11: {
              l10: {
                if (!v81) break l10;
                v80_c = Long.numberOfLeadingZeros(v79_mc);
                if (1==1) break l11;
              }
              v80_c = 64;
            }
            v80_c = v80_c - 48;
            ByteVector v82 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v80_c);
            ByteVector v83 = v76.and(v82);
            int v84 = v59_bufS + 2;
            int v85_off = v1_bufdata[v84];
            int v86 = v85_off - 16;
            ByteVector v87 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v86);
            ByteVector v88 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v89 = v87.compare(VectorOperators.EQ, v88);
            long v90_mc = v89.toLong();
            int v91_c = 0;
            boolean v92 = v90_mc != 0L;
            l13: {
              l12: {
                if (!v92) break l12;
                v91_c = Long.numberOfLeadingZeros(v90_mc);
                if (1==1) break l13;
              }
              v91_c = 64;
            }
            v91_c = v91_c - 48;
            ByteVector v93 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v91_c);
            ByteVector v94 = v87.and(v93);
            int v95 = v59_bufS + 3;
            int v96_off = v1_bufdata[v95];
            int v97 = v96_off - 16;
            ByteVector v98 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v97);
            ByteVector v99 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
            VectorMask<?> v100 = v98.compare(VectorOperators.EQ, v99);
            long v101_mc = v100.toLong();
            int v102_c = 0;
            boolean v103 = v101_mc != 0L;
            l15: {
              l14: {
                if (!v103) break l14;
                v102_c = Long.numberOfLeadingZeros(v101_mc);
                if (1==1) break l15;
              }
              v102_c = 64;
            }
            v102_c = v102_c - 48;
            ByteVector v104 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v102_c);
            ByteVector v105 = v98.and(v104);
            IntVector v106_hv = v72.reinterpretAsInts();
            LongVector v107 = v106_hv.reinterpretAsLongs();
            long v108 = v107.lane(1);
            LongVector v109 = (LongVector) LongVector.SPECIES_128.broadcast(v108);
            IntVector v110 = v109.reinterpretAsInts();
            v106_hv = v106_hv.lanewise(VectorOperators.XOR, v110);
            IntVector v111_hv = v106_hv;
            LongVector v112 = v111_hv.reinterpretAsLongs();
            LongVector v113 = v112.lanewise(VectorOperators.LSHR, 32);
            IntVector v114 = v113.reinterpretAsInts();
            v111_hv = v111_hv.lanewise(VectorOperators.XOR, v114);
            IntVector v115 = (v111_hv);
            IntVector v116 = v115.lanewise(VectorOperators.ASHR, 16);
            IntVector v117 = (v116);
            v111_hv = v111_hv.lanewise(VectorOperators.XOR, v117);
            IntVector v118_hv = v83.reinterpretAsInts();
            LongVector v119 = v118_hv.reinterpretAsLongs();
            long v120 = v119.lane(1);
            LongVector v121 = (LongVector) LongVector.SPECIES_128.broadcast(v120);
            IntVector v122 = v121.reinterpretAsInts();
            v118_hv = v118_hv.lanewise(VectorOperators.XOR, v122);
            IntVector v123_hv = v118_hv;
            LongVector v124 = v123_hv.reinterpretAsLongs();
            LongVector v125 = v124.lanewise(VectorOperators.LSHR, 32);
            IntVector v126 = v125.reinterpretAsInts();
            v123_hv = v123_hv.lanewise(VectorOperators.XOR, v126);
            IntVector v127 = (v123_hv);
            IntVector v128 = v127.lanewise(VectorOperators.ASHR, 16);
            IntVector v129 = (v128);
            v123_hv = v123_hv.lanewise(VectorOperators.XOR, v129);
            IntVector v130_hv = v94.reinterpretAsInts();
            LongVector v131 = v130_hv.reinterpretAsLongs();
            long v132 = v131.lane(1);
            LongVector v133 = (LongVector) LongVector.SPECIES_128.broadcast(v132);
            IntVector v134 = v133.reinterpretAsInts();
            v130_hv = v130_hv.lanewise(VectorOperators.XOR, v134);
            IntVector v135_hv = v130_hv;
            LongVector v136 = v135_hv.reinterpretAsLongs();
            LongVector v137 = v136.lanewise(VectorOperators.LSHR, 32);
            IntVector v138 = v137.reinterpretAsInts();
            v135_hv = v135_hv.lanewise(VectorOperators.XOR, v138);
            IntVector v139 = (v135_hv);
            IntVector v140 = v139.lanewise(VectorOperators.ASHR, 16);
            IntVector v141 = (v140);
            v135_hv = v135_hv.lanewise(VectorOperators.XOR, v141);
            IntVector v142_hv = v105.reinterpretAsInts();
            LongVector v143 = v142_hv.reinterpretAsLongs();
            long v144 = v143.lane(1);
            LongVector v145 = (LongVector) LongVector.SPECIES_128.broadcast(v144);
            IntVector v146 = v145.reinterpretAsInts();
            v142_hv = v142_hv.lanewise(VectorOperators.XOR, v146);
            IntVector v147_hv = v142_hv;
            LongVector v148 = v147_hv.reinterpretAsLongs();
            LongVector v149 = v148.lanewise(VectorOperators.LSHR, 32);
            IntVector v150 = v149.reinterpretAsInts();
            v147_hv = v147_hv.lanewise(VectorOperators.XOR, v150);
            IntVector v151 = (v147_hv);
            IntVector v152 = v151.lanewise(VectorOperators.ASHR, 16);
            IntVector v153 = (v152);
            v147_hv = v147_hv.lanewise(VectorOperators.XOR, v153);
            int v154 = v111_hv.lane(0);
            int v155 = v154 & v2_hash_mask;
            int v156 = (int) v155;
            IntVector v157 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v156);
            IntVector v158 = (IntVector) IntVector.SPECIES_128.broadcast(v154);
            VectorMask<?> v159 = v158.compare(VectorOperators.EQ, v157);
            long v160 = v159.toLong();
            int v161 = Long.numberOfTrailingZeros(v160);
            int v162 = v156 + v161;
            int v163 = v123_hv.lane(0);
            int v164 = v163 & v2_hash_mask;
            int v165 = (int) v164;
            IntVector v166 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v165);
            IntVector v167 = (IntVector) IntVector.SPECIES_128.broadcast(v163);
            VectorMask<?> v168 = v167.compare(VectorOperators.EQ, v166);
            long v169 = v168.toLong();
            int v170 = Long.numberOfTrailingZeros(v169);
            int v171 = v165 + v170;
            int v172 = v135_hv.lane(0);
            int v173 = v172 & v2_hash_mask;
            int v174 = (int) v173;
            IntVector v175 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v174);
            IntVector v176 = (IntVector) IntVector.SPECIES_128.broadcast(v172);
            VectorMask<?> v177 = v176.compare(VectorOperators.EQ, v175);
            long v178 = v177.toLong();
            int v179 = Long.numberOfTrailingZeros(v178);
            int v180 = v174 + v179;
            int v181 = v147_hv.lane(0);
            int v182 = v181 & v2_hash_mask;
            int v183 = (int) v182;
            IntVector v184 = (IntVector) IntVector.SPECIES_128.fromArray(v4_map_hash, v183);
            IntVector v185 = (IntVector) IntVector.SPECIES_128.broadcast(v181);
            VectorMask<?> v186 = v185.compare(VectorOperators.EQ, v184);
            long v187 = v186.toLong();
            int v188 = Long.numberOfTrailingZeros(v187);
            int v189 = v183 + v188;
            int v190 = v162 * 16;
            ByteVector v191 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v190);
            int v192 = v171 * 16;
            ByteVector v193 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v192);
            int v194 = v180 * 16;
            ByteVector v195 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v194);
            int v196 = v189 * 16;
            ByteVector v197 = (ByteVector) ByteVector.SPECIES_128.fromArray(v3_map_exp, v196);
            IntVector v198_num_idxs = (IntVector) IntVector.SPECIES_128.fromArray(v1_bufdata, v59_bufS);
            IntVector v199 = (IntVector) IntVector.SPECIES_128.broadcast(1);
            IntVector v200_idxs2 = v198_num_idxs.add(v199);
            int v201 = v200_idxs2.lane(0);
            ByteVector v202 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v201);
            LongVector v203 = v202.reinterpretAsLongs();
            long v204 = v203.lane(0);
            int v205 = v200_idxs2.lane(1);
            ByteVector v206 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v205);
            LongVector v207 = v206.reinterpretAsLongs();
            long v208 = v207.lane(0);
            int v209 = v200_idxs2.lane(2);
            ByteVector v210 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v209);
            LongVector v211 = v210.reinterpretAsLongs();
            long v212 = v211.lane(0);
            int v213 = v200_idxs2.lane(3);
            ByteVector v214 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v213);
            LongVector v215 = v214.reinterpretAsLongs();
            long v216 = v215.lane(0);
            long[] v217 = arr_4;
            v217[0] = v204;
            v217[1] = v208;
            v217[2] = v212;
            v217[3] = v216;
            LongVector v222 = (LongVector) LongVector.SPECIES_256.fromArray(v217, 0);
            ByteVector v223_nums = v222.reinterpretAsBytes();
            ByteVector v224 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)46);
            VectorMask<?> v225 = v223_nums.compare(VectorOperators.EQ, v224);
            ByteVector v226 = (ByteVector) v225.toVector();
            ByteVector v227 = (v226);
            IntVector v228 = v227.reinterpretAsInts();
            IntVector v229 = v228.lanewise(VectorOperators.ASHR, 20);
            ByteVector v230 = v229.reinterpretAsBytes();
            LongVector v231 = v230.reinterpretAsLongs();
            LongVector v232 = (LongVector) LongVector.SPECIES_256.broadcast(24L);
            LongVector v233 = v231.and(v232);
            ByteVector v234_off = v233.reinterpretAsBytes();
            LongVector v235 = (LongVector) LongVector.SPECIES_256.broadcast(40L);
            LongVector v236 = v234_off.reinterpretAsLongs();
            LongVector v237 = v235.sub(v236);
            ByteVector v238 = v237.reinterpretAsBytes();
            LongVector v239 = v223_nums.reinterpretAsLongs();
            LongVector v240 = v238.reinterpretAsLongs();
            LongVector v241 = v239.lanewise(VectorOperators.LSHL, v240);
            v223_nums = v241.reinterpretAsBytes();
            ByteVector v242 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)48);
            ByteVector v243 = v223_nums.sub(v242);
            ByteVector v244 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)0);
            ByteVector v245_aligned = v243.max(v244);
            ShortVector v246 = v245_aligned.reinterpretAsShorts();
            IntVector v247 = v246.reinterpretAsInts();
            IntVector v248 = (IntVector) IntVector.SPECIES_256.broadcast(255);
            IntVector v249 = v247.and(v248);
            ShortVector v250 = v249.reinterpretAsShorts();
            ShortVector v251 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)100);
            ShortVector v252_r = v250.mul(v251);
            ShortVector v253 = (ShortVector) ShortVector.SPECIES_256.broadcast((short)10);
            ShortVector v254 = v246.mul(v253);
            ShortVector v255 = v254.lanewise(VectorOperators.LSHR, 8);
            v252_r = v252_r.add(v255);
            IntVector v256 = v246.reinterpretAsInts();
            IntVector v257 = v256.lanewise(VectorOperators.LSHR, 24);
            ShortVector v258 = v257.reinterpretAsShorts();
            v252_r = v252_r.add(v258);
            ShortVector v259 = (v252_r);
            ByteVector v260 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)45);
            VectorMask<?> v261 = v223_nums.compare(VectorOperators.EQ, v260);
            ByteVector v262 = (ByteVector) v261.toVector();
            LongVector v263 = v262.reinterpretAsLongs();
            LongVector v264 = (LongVector) LongVector.SPECIES_256.broadcast(0L);
            VectorMask<?> v265 = v263.compare(VectorOperators.NE, v264);
            LongVector v266 = (LongVector) v265.toVector();
            ByteVector v267 = v266.reinterpretAsBytes();
            ShortVector v268_neg = v267.reinterpretAsShorts();
            ShortVector v269_each16n = v259.lanewise(VectorOperators.XOR, v268_neg);
            v269_each16n = v269_each16n.sub(v268_neg);
            v269_each16n.intoArray(v53_temp_buf, 0);
            boolean v271 = v72.equals(v191);
            l17: {
              l16: {
                if (!v271) break l16;
                int v272 = v162 * 4;
                short v273 = v53_temp_buf[2];
                long v274_temp = (long) v273;
                int v275 = v272 + 2;
                long v276 = v5_map_data[v275];
                long v277 = Math.min(v276, v274_temp);
                v5_map_data[v275] = v277;
                int v279 = v272 + 3;
                long v280 = v5_map_data[v279];
                long v281 = Math.max(v280, v274_temp);
                v5_map_data[v279] = v281;
                long v283 = v5_map_data[v272];
                long v284 = v283 + v274_temp;
                v5_map_data[v272] = v284;
                int v286 = v272 + 1;
                long v287 = v5_map_data[v286];
                long v288 = v287 + 1L;
                v5_map_data[v286] = v288;
                if (1==1) break l17;
              }
              int v290 = v60_bufE - v59_bufS;
              boolean v291 = 0 >= v290;
              l18: {
                if (!v291) break l18;
                if (1==1) break l5;
              }
              int v292 = v1_bufdata[v59_bufS];
              v54_failbuf[v56_failposC] = v292;
              int v294 = v56_failposC + 1;
              short v295 = v53_temp_buf[2];
              int v296 = (int) v295;
              v54_failbuf[v294] = v296;
              int v298 = 1 << 1;
              v56_failposC = v56_failposC + v298;
            }
            boolean v299 = v83.equals(v193);
            l20: {
              l19: {
                if (!v299) break l19;
                int v300 = v171 * 4;
                short v301 = v53_temp_buf[6];
                long v302_temp = (long) v301;
                int v303 = v300 + 2;
                long v304 = v5_map_data[v303];
                long v305 = Math.min(v304, v302_temp);
                v5_map_data[v303] = v305;
                int v307 = v300 + 3;
                long v308 = v5_map_data[v307];
                long v309 = Math.max(v308, v302_temp);
                v5_map_data[v307] = v309;
                long v311 = v5_map_data[v300];
                long v312 = v311 + v302_temp;
                v5_map_data[v300] = v312;
                int v314 = v300 + 1;
                long v315 = v5_map_data[v314];
                long v316 = v315 + 1L;
                v5_map_data[v314] = v316;
                if (1==1) break l20;
              }
              int v318 = v60_bufE - v59_bufS;
              boolean v319 = 1 >= v318;
              l21: {
                if (!v319) break l21;
                if (1==1) break l5;
              }
              int v320 = v59_bufS + 1;
              int v321 = v1_bufdata[v320];
              v54_failbuf[v56_failposC] = v321;
              int v323 = v56_failposC + 1;
              short v324 = v53_temp_buf[6];
              int v325 = (int) v324;
              v54_failbuf[v323] = v325;
              int v327 = 1 << 1;
              v56_failposC = v56_failposC + v327;
            }
            boolean v328 = v94.equals(v195);
            l23: {
              l22: {
                if (!v328) break l22;
                int v329 = v180 * 4;
                short v330 = v53_temp_buf[10];
                long v331_temp = (long) v330;
                int v332 = v329 + 2;
                long v333 = v5_map_data[v332];
                long v334 = Math.min(v333, v331_temp);
                v5_map_data[v332] = v334;
                int v336 = v329 + 3;
                long v337 = v5_map_data[v336];
                long v338 = Math.max(v337, v331_temp);
                v5_map_data[v336] = v338;
                long v340 = v5_map_data[v329];
                long v341 = v340 + v331_temp;
                v5_map_data[v329] = v341;
                int v343 = v329 + 1;
                long v344 = v5_map_data[v343];
                long v345 = v344 + 1L;
                v5_map_data[v343] = v345;
                if (1==1) break l23;
              }
              int v347 = v60_bufE - v59_bufS;
              boolean v348 = 2 >= v347;
              l24: {
                if (!v348) break l24;
                if (1==1) break l5;
              }
              int v349 = v59_bufS + 2;
              int v350 = v1_bufdata[v349];
              v54_failbuf[v56_failposC] = v350;
              int v352 = v56_failposC + 1;
              short v353 = v53_temp_buf[10];
              int v354 = (int) v353;
              v54_failbuf[v352] = v354;
              int v356 = 1 << 1;
              v56_failposC = v56_failposC + v356;
            }
            boolean v357 = v105.equals(v197);
            l26: {
              l25: {
                if (!v357) break l25;
                int v358 = v189 * 4;
                short v359 = v53_temp_buf[14];
                long v360_temp = (long) v359;
                int v361 = v358 + 2;
                long v362 = v5_map_data[v361];
                long v363 = Math.min(v362, v360_temp);
                v5_map_data[v361] = v363;
                int v365 = v358 + 3;
                long v366 = v5_map_data[v365];
                long v367 = Math.max(v366, v360_temp);
                v5_map_data[v365] = v367;
                long v369 = v5_map_data[v358];
                long v370 = v369 + v360_temp;
                v5_map_data[v358] = v370;
                int v372 = v358 + 1;
                long v373 = v5_map_data[v372];
                long v374 = v373 + 1L;
                v5_map_data[v372] = v374;
                if (1==1) break l26;
              }
              int v376 = v60_bufE - v59_bufS;
              boolean v377 = 3 >= v376;
              l27: {
                if (!v377) break l27;
                if (1==1) break l5;
              }
              int v378 = v59_bufS + 3;
              int v379 = v1_bufdata[v378];
              v54_failbuf[v56_failposC] = v379;
              int v381 = v56_failposC + 1;
              short v382 = v53_temp_buf[14];
              int v383 = (int) v382;
              v54_failbuf[v381] = v383;
              int v385 = 1 << 1;
              v56_failposC = v56_failposC + v385;
            }
            v59_bufS = v59_bufS + 4;
            if (1==1) continue l6;
            break;
          }
        }
      }
      v57_i = v57_i + 1;
      if (1==1) continue l3;
      break;
    }
  }
  l29: {
    l28: while(true) {
      boolean v386 = v55_failposS < v56_failposC;
      if (!v386) break l29;
      int v387 = v54_failbuf[v55_failposS];
      int v388 = v55_failposS + 1;
      int v389 = v54_failbuf[v388];
      v55_failposS = v55_failposS + 2;
      int v390 = v387 - 16;
      ByteVector v391 = (ByteVector) ByteVector.SPECIES_128.fromArray(v6_inp, v390);
      ByteVector v392 = (ByteVector) ByteVector.SPECIES_128.broadcast((byte)10);
      VectorMask<?> v393 = v391.compare(VectorOperators.EQ, v392);
      long v394_m = v393.toLong();
      boolean v395 = v394_m == 0L;
      l34: {
        l30: {
          if (!v395) break l30;
          int v396_start = v387 + 32;
          int v397_hashv = 0;
          boolean v398_cont = true;
          l31: while(true) {
            v396_start = v396_start - 32;
            int v399 = v396_start - 32;
            ByteVector v400 = (ByteVector) ByteVector.SPECIES_256.fromArray(v6_inp, v399);
            ByteVector v401 = (ByteVector) ByteVector.SPECIES_256.broadcast((byte)10);
            VectorMask<?> v402 = v400.compare(VectorOperators.EQ, v401);
            long v403_m = v402.toLong();
            v398_cont = v403_m == 0L;
            l33: {
              l32: {
                if (!v398_cont) break l32;
                if (1==1) break l33;
              }
              int v404 = Long.numberOfLeadingZeros(v403_m);
              int v405_c = v404 - 32;
              v396_start = v396_start - v405_c;
            }
            if (v398_cont) continue l31;
            break;
          }
          main.Main.failed_long(v0_ident, v396_start, v387, v389);
          if (1==1) break l34;
        }
        int v407 = Long.numberOfLeadingZeros(v394_m);
        int v408_c = v407 - 48;
        int v409 = v387 - v408_c;
        ByteVector v410 = (ByteVector) ByteVector.SPECIES_128.fromArray(c0_tail_mask_16, v408_c);
        ByteVector v411 = v391.and(v410);
        IntVector v412_hv = v411.reinterpretAsInts();
        LongVector v413 = v412_hv.reinterpretAsLongs();
        long v414 = v413.lane(1);
        LongVector v415 = (LongVector) LongVector.SPECIES_128.broadcast(v414);
        IntVector v416 = v415.reinterpretAsInts();
        v412_hv = v412_hv.lanewise(VectorOperators.XOR, v416);
        IntVector v417_hv = v412_hv;
        LongVector v418 = v417_hv.reinterpretAsLongs();
        LongVector v419 = v418.lanewise(VectorOperators.LSHR, 32);
        IntVector v420 = v419.reinterpretAsInts();
        v417_hv = v417_hv.lanewise(VectorOperators.XOR, v420);
        IntVector v421 = (v417_hv);
        IntVector v422 = v421.lanewise(VectorOperators.ASHR, 16);
        IntVector v423 = (v422);
        v417_hv = v417_hv.lanewise(VectorOperators.XOR, v423);
        int v424 = v417_hv.lane(0);
        main.Main.failed_short(v0_ident, v409, v387, v389, v424);
      }
      if (1==1) continue l28;
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
      int v6 = v4_i * 4;
      IntVector v7_v = (IntVector) IntVector.SPECIES_128.fromArray(v2_ai32, v6);
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
