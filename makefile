SHELL = /usr/bin/env bash

SINGELI = $(SINGELI_PATH)/singeli
SIJAVA = ./singeli-java
IR_PASS = bqn -e '•Out¨ (•Import"$(SINGELI_PATH)/ir.bqn").Restructure •FLines"/dev/stdin"'

java-build: classes/main/Main.class

run: java-build
	@java --add-modules=jdk.incubator.vector --enable-preview -cp classes main.Main 2> >(grep -v 'WARNING: Using incubator modules: jdk.incubator.vector' >&2) "$$file"

a.out: gen.c main.cpp header.h
	@mkdir -p obj
	$(CC)  -O3 -march=native -fno-strict-aliasing -c -I. -o obj/gen.o gen.c
	$(CXX) -O3 -march=native -fno-strict-aliasing -c -o obj/main.o main.cpp
	$(CXX) -o a.out obj/gen.o obj/main.o

classes/main/Main.class: Gen.java Main.java
	@mkdir -p classes
	@javac -d classes --enable-preview --release 21 --add-modules=jdk.incubator.vector Gen.java Main.java

ifeq ($(GEN),1)
GEN_JAVA_DEPS = $(SIJAVA)/emit_java.bqn $(SIJAVA)/java.singeli $(SIJAVA)/base.singeli main.singeli
GEN_C_DEPS = $(SIJAVA)/java.singeli $(SIJAVA)/base.singeli main.singeli
endif

Gen.java: $(GEN_JAVA_DEPS)
	@$(SINGELI) -a x86_64 -t ir -l singeli-java=$(SIJAVA) main.singeli | $(IR_PASS) | ./$(SIJAVA)/emit_java.bqn Gen.java

gen.c: $(GEN_C_DEPS)
	@$(SINGELI) -a avx2 -l singeli-java=$(SIJAVA) main.singeli -o gen.c

java-ir:
	@$(SINGELI) -a x86_64 -t ir -l singeli-java=$(SIJAVA) main.singeli | $(IR_PASS)

.PHONY: java-build java-ir run
