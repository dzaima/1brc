# [1BRC](https://github.com/gunnarmorling/1brc) solution with [Singeli](https://github.com/mlochbaum/Singeli)

Java version can be built & run with `make run file=path/to/measurements.txt`, or your favorite way of building & running `Main.java`+`Gen.java` (needs Java 21 & `--add-modules=jdk.incubator.vector`).

C version can be built with `make a.out` and then run with `./a.out [path/to/measurements.txt]`.

By default, the code is configured to use 8 threads. A different count can be chosen with a `THREADS_1BRC=123` environment variable.

The repo comes with `Gen.java` and `gen.c` pre-generated, but they can be regenerated with `make singeli-Gen.java` and `make singeli-gen.c` respectively. This'll need `singeli` in `PATH`, or an extra `SINGELI=path/to/Singeli/singeli` argument, and also `bqn` as [CBQN](https://github.com/dzaima/CBQN).