SHELL = /usr/bin/env bash
SINGELI = singeli

SIJAVA = ./singeli-java

java-build: classes/main/Main.class

run: java-build
	@java --add-modules=jdk.incubator.vector -cp classes main.Main 2> >(grep -v 'WARNING: Using incubator modules: jdk.incubator.vector' >&2) "$$file"

a.out: gen.c main.cpp
	@mkdir -p obj
	$(CC)  -O3 -mavx2 -fno-strict-aliasing -c -I. -o obj/gen.o gen.c
	$(CXX) -O3 -mavx2 -fno-strict-aliasing -c -o obj/main.o main.cpp
	$(CXX) -o a.out obj/gen.o obj/main.o

classes/main/Main.class: Gen.java Main.java
	@mkdir -p classes
	@javac -d classes --add-modules=jdk.incubator.vector Gen.java Main.java

singeli-Gen.java: $(SIJAVA)/emit_java.bqn $(SIJAVA)/java.singeli $(SIJAVA)/base.singeli main.singeli
	@$(SINGELI) -a x86_64 -t ir -l singeli-java=$(SIJAVA) main.singeli | ./$(SIJAVA)/emit_java.bqn Gen.java

singeli-gen.c: $(SIJAVA)/java.singeli $(SIJAVA)/base.singeli main.singeli
	@$(SINGELI) -a avx2 -l singeli-java=$(SIJAVA) main.singeli -o gen.c

java-ir:
	@$(SINGELI) -a x86_64 -t ir -l singeli-java=$(SIJAVA) main.singeli

.PHONY: java-build java-ir run singeli-Gen.java singeli-gen.c
