package main;
import jdk.incubator.vector.*;
import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.nio.channels.FileChannel;
import java.nio.MappedByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;
import gen.Gen;

public class Main {
  static int num_threads = 8;
  static final int hash_mask = 0xfff; // i.e. hash table size minus one
  
  static final boolean DEBUG = false;
  
  // copied from main.singeli:
  static final int hashv_count = 4;
  static final int exp_bulk = 16;
  static final int dt_sum = 0;
  static final int dt_num = 1;
  static final int dt_min = 2;
  static final int dt_max = 3;
  
  static final int hash_size = hash_mask + hashv_count;
  
  
  static final ReadWriteLock glock_rw = new ReentrantReadWriteLock();
  static final Lock glock_w = glock_rw.writeLock(); 
  static final Lock glock_r = glock_rw.readLock();
  
  // under global lock:
  static String[] mapg_string;
  static byte[] mapg_exp;
  static int[]  mapg_hash;
  
  static long[][] map_data_per;
  static byte[][] inputs;
  
  static HashMap<String, long[]>[] long_entries;
  
  public static void failed_long(int ident, int nameEnd, int sample) { // called by Gen.java
    failed_long(ident, inputs[ident], nameEnd, sample);
  }
  public static void failed_short(int ident, int nameEnd, int sample) { // called by Gen.java
    hash_slow(ident, inputs[ident], nameEnd, sample);
  }
  
  private static int def_hash(int i) { // hash to put at mapg_hash[i] such that it's never the expected one
    return i + hashv_count;
  }
  
  public static void failed_long(int ident, byte[] input, int nameStart, int nameEnd, int sample) {
    if (DEBUG && input[nameEnd]!=';') {
      System.out.println("No semi at "+nameEnd+" ("+(nameEnd)+")");
      throw new Error();
    }
    String k = new String(input, nameStart, nameEnd-nameStart);
    if (DEBUG) System.out.println("failed_long "+k+" "+sample);
    
    long[] map_data = long_entries[ident].computeIfAbsent(k, k2 -> {
      long[] t = new long[4];
      t[dt_min] = 9999;
      t[dt_max] = -9999;
      return t;
    });
    
    int didx = 0;
    map_data[didx+dt_sum]+= sample;
    map_data[didx+dt_num]+= 1;
    map_data[didx+dt_min] = Math.min(map_data[didx+dt_min], sample);
    map_data[didx+dt_max] = Math.max(map_data[didx+dt_max], sample);
  }
  
  public static void failed_long(int ident, byte[] input, int nameEnd, int sample) {
    int nameStart = nameEnd;
    while (true) {
      int prev = nameStart-1;
      if (prev<0 || input[prev]=='\n') break;
      nameStart = prev;
    }
    failed_long(ident, input, nameStart, nameEnd, sample);
  }
  
  static int read_sample(byte[] arr, int semiPos) {
    int i = semiPos+1;
    boolean neg = false;
    if (arr[i]=='-') {
      i++;
      neg = true;
    }
    int res = arr[i++]-'0';
    
    int c = arr[i++];
    if (c!='.') {
      res = res*10 + c-'0';
      i++; // skip '.'
    }
    res = res*10 + arr[i]-'0';
    
    return neg? -res : res;
  }
  
  public static void hash_slow(int ident, byte[] input, int nameEnd, int sample) {
    if (DEBUG && sample != read_sample(input,nameEnd)) throw new Error("exp "+read_sample(input,nameEnd)+", got "+sample);
    
    int hash = 0;
    int sh = 24;
    int nameStart = nameEnd;
    while (nameStart>=1) {
      byte c = input[nameStart-1];
      if (c=='\n') break;
      hash^= (c&0xff) << sh;
      nameStart--;
      sh-= 8;
    }
    if (nameEnd-nameStart >= exp_bulk) {
      failed_long(ident, input, nameEnd, sample);
      return;
    }
    hash^= hash>>16;
    if (DEBUG) System.out.println("hash_slow "+new String(input, nameStart, nameEnd-nameStart)+" "+sample);
    
    int hashm = hash & hash_mask;
    int idx = hashm;
    while (mapg_hash[idx] != def_hash(idx) && mapg_hash[idx]!=hash) {
      if (++idx == hashm + hashv_count) {
        failed_long(ident, input, nameStart, nameEnd, sample);
        return;
      }
    }
    
    glock_w.lock();
    mapg_hash[idx] = hash;
    int len = nameEnd-nameStart;
    System.arraycopy(input, nameStart, mapg_exp, (idx+1)*exp_bulk - len, len);
    mapg_string[idx] = new String(input, nameStart, nameEnd-nameStart);
    glock_w.unlock();
    
    long[] map_data = map_data_per[ident];
    int didx = idx*4;
    map_data[didx+dt_sum]+= sample;
    map_data[didx+dt_num]+= 1;
    map_data[didx+dt_min] = Math.min(map_data[didx+dt_min], sample);
    map_data[didx+dt_max] = Math.max(map_data[didx+dt_max], sample);
  }
  
  
  
  record Ent(String k, long[] stats) { }
  static double fmt(double x) {
    return Math.round(x)/10d;
  }
  
  static void basic_core(byte[] arr, int start, int end) {
    int ident = num_threads;
    for (int i = start; i < end; i++) {
      if (arr[i] == ';') hash_slow(ident, arr, i, read_sample(arr, i));
    }
  }
  static long[] new_map_data() {
    long[] r = new long[hash_size*4];
    for (int i = 0; i < hash_size; i++) {
      r[i*4 + dt_min] = 9999;
      r[i*4 + dt_max] = -9999;
    }
    return r;
  }
  
  @SuppressWarnings("unchecked")
  static void sol(String path) throws Exception {
    Gen g0 = new Gen();
    
    mapg_exp    = new byte[hash_size*exp_bulk];
    mapg_hash   = new int[hash_size*exp_bulk];
    mapg_string = new String[hash_size];
    for (int i = 0; i < hash_size; i++) mapg_hash[i] = def_hash(i);
    
    inputs       = new byte[num_threads][];
    map_data_per = new long[num_threads+1][];
    long_entries = (HashMap<String,long[]>[])new HashMap[num_threads+1];
    
    int periter_one = g0.core_1brc_periter();
    int periter_bulk = 50;
    int periter = periter_one * periter_bulk;
    
    int lbound = 128; // to fit in a 100-byte name
    int rbound = 64; // to fit in number after semicolon, and also SIMD read-past-the-end
    
    FileChannel channel = new RandomAccessFile(path, "r").getChannel();
    long flen = channel.size();
    
    
    
    // parse head the slow way
    int init = lbound; // for fast path
    init+= 130000; // process some entries here, to perhaps make sure JIT doesn't think that the not-found path is common
    if (init > flen) init = (int)flen;
    
    byte[] head = new byte[(int) Math.min(init+rbound, flen)];
    channel.map(FileChannel.MapMode.READ_ONLY, 0, head.length).get(head, 0, head.length);
    long_entries[num_threads] = new HashMap<>();
    map_data_per[num_threads] = new_map_data();
    basic_core(head, 0, init);
    
    
    
    // parse core the fast way
    ConcurrentLinkedQueue<Long> todoOffsets = new ConcurrentLinkedQueue<>();
    long start = init;
    int pagesize = 4096;
    int inpsize = lbound + periter + rbound;
    while (start+inpsize < flen) {
      todoOffsets.add(start);
      start+= periter;
    }
    
    ArrayList<Thread> threads = new ArrayList<>();
    for (int i = 0; i < num_threads; i++) {
      int ident = i;
      Runnable run = () -> {
        try {
          Gen g = new Gen();
          long[] map_data = new_map_data();
          byte[] inp = new byte[inpsize];
          
          inputs[ident] = inp;
          map_data_per[ident] = map_data;
          long_entries[ident] = new HashMap<>();
          int[] buf = new int[g.core_1brc_buf_elts()];
          while (true) {
            Long cstart = todoOffsets.poll();
            if (cstart == null) break;
            long off0 = cstart-lbound;
            int roundoff = (int)off0 & (pagesize-1);
            channel.map(FileChannel.MapMode.READ_ONLY, off0-roundoff, inpsize+roundoff).position(roundoff).get(inp, 0, inpsize);
            
            int arr_off = lbound;
            for (int j = 0; j < periter_bulk; j++) {
              glock_r.lock();
              g.core_1brc(
                ident, buf,
                hash_mask,
                mapg_exp, mapg_hash, map_data,
                inp, arr_off
              );
              glock_r.unlock();
              arr_off+= periter_one;
            }
          }
        } catch (Exception e) { e.printStackTrace(); System.exit(1); }
      };
      if (num_threads == 1) {
        run.run();
      } else {
        Thread t = new Thread(run);
        t.start();
        threads.add(t);
      }
    }
    
    
    
    // parse last rbound bytes the slow way
    int left = (int)(flen-start);
    if (left > 0) {
      byte[] tail = new byte[lbound + left];
      channel.map(FileChannel.MapMode.READ_ONLY, start-lbound, tail.length).get(tail, 0, tail.length);
      basic_core(tail, lbound, lbound+left);
    }
    
    for (Thread t : threads) t.join();
    
    HashMap<String, long[]> es = new HashMap<>();
    BiConsumer<String, long[]> add = (k, v) -> {
      long[] prev = es.get(k);
      if (prev!=null) {
        // if (v[dt_max] > 999) throw new Error(k);
        prev[dt_sum]+= v[dt_sum];
        prev[dt_num]+= v[dt_num];
        prev[dt_min] = Math.min(prev[dt_min], v[dt_min]);
        prev[dt_max] = Math.max(prev[dt_max], v[dt_max]);
      } else {
        es.put(k, v);
      }
    };
    for (var long_curr : long_entries) {
      long_curr.forEach((k, v) -> add.accept(k, v));
    }
    for (int j = 0; j < num_threads+1; j++) {
      long[] map_data = map_data_per[j];
      for (int i = 0; i < hash_size; i++) {
        String k = mapg_string[i];
        if (k==null) continue;
        int doff = i*4;
        add.accept(k, Arrays.copyOfRange(map_data, doff, doff+4));
      }
    }
    ArrayList<Ent> vs = new ArrayList<>();
    es.forEach((k,v)->vs.add(new Ent(k,v)));
    vs.sort(Comparator.comparing(c -> c.k));
    
    
    
    System.out.print("{");
    boolean first = true;
    for (Ent e : vs) {
      if (first) first = false;
      else System.out.print(", ");
      long[] s = e.stats;
      System.out.print(e.k + "=" + fmt(s[dt_min]) + "/" + fmt(s[dt_sum]*1d / s[dt_num]) + "/" + fmt(s[dt_max]));
    }
    System.out.println("}");
  }
  
  public static void main(String[] args) throws Exception {
    String num_str = System.getenv("THREADS_1BRC");
    if (num_str!=null && num_str.length()>0) num_threads = Integer.parseInt(num_str);
    if (args.length == 0) args = new String[]{"./measurements.txt"};
    if (args.length==2 && args[1].equals("bench")) {
      Gen g = new Gen();
      for (int i = 0; i < 20; i++) {
        long sns = System.nanoTime();
        int rep = 2000;
        for (int j = 0; j < rep; j++) g.minibench(null, mapg_exp, mapg_hash);
        long ens = System.nanoTime();
        System.out.println((ens-sns)*1d/rep / 10000 + "ns/iter");
      }
      System.exit(0);
    }
    
    if (args.length==2 && args[1].equals("repeat")) {
      for (int i=0;i<10;i++) {
        long sns = System.nanoTime();
        sol(args[0]);
        long ens = System.nanoTime();
        System.out.println((ens-sns)/1e9+" seconds");
      }
      System.exit(0);
    }
    sol(args[0]);
    
    System.exit(0);
  }
}