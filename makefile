SHELL = /usr/bin/env bash
SINGELI = singeli

SIJAVA = ./singeli-java

build-java: classes/main/Main.class

.PHONY: build-java java-ir run
run: build-java
	@java --add-modules=jdk.incubator.vector -cp classes main.Main 2> >(grep -v 'WARNING: Using incubator modules: jdk.incubator.vector' >&2) "$$file"

a.out: main.cpp
	@mkdir -p obj
	$(CC)  -O3 -mavx2 -c -I. -o obj/gen.o gen.c
	$(CXX) -O3 -mavx2 -c -o obj/main.o main.cpp
	$(CXX) -o a.out obj/gen.o obj/main.o

classes/main/Main.class: Main.java
	@mkdir -p classes
	@javac -d classes --add-modules=jdk.incubator.vector Gen.java Main.java

Gen.java: $(SIJAVA)/emit_java.bqn $(SIJAVA)/java.singeli $(SIJAVA)/base.singeli main.singeli
	@$(SINGELI) -a x86_64 -t ir -l singeli-java=$(SIJAVA) main.singeli | ./$(SIJAVA)/emit_java.bqn Gen.java

gen.c: $(SIJAVA)/java.singeli $(SIJAVA)/base.singeli main.singeli
	@$(SINGELI) -a avx2 -l singeli-java=$(SIJAVA) main.singeli -o gen.c


java-ir:
	@$(SINGELI) -a x86_64 -t ir -l singeli-java=$(SIJAVA) main.singeli
