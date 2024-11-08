SHELL = /usr/bin/env bash -o pipefail

SINGELI = $(SINGELI_PATH)/singeli
SIJAVA = ./singeli-java
IR_PASS = bqn -e '•Out¨ (•Import"$(SINGELI_PATH)/ir.bqn").Restructure •FLines"/dev/stdin"'

java-build: classes/main/Main.class

JAVA_RUN = java --add-modules=jdk.incubator.vector --enable-preview
# JAVA_RUN+= -XX:+UnlockDiagnosticVMOptions -XX:CompileCommand=print,gen.Gen::core_1brc
# JAVA_RUN+= -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly
JAVA_RUN+= -cp classes main.Main

run: java-build
	@$(JAVA_RUN) 2> >(grep -v 'WARNING: Using incubator modules: jdk.incubator.vector' >&2) "$$file"

run-cmd:
	@echo $(JAVA_RUN)

f = -O3
ifeq ($(DEBUG_SYMBOLS),1)
	f += -g
endif
TARGET = -march=native
obj/gen.o: gen.c gen_x86.c gen_arm.c header.h
	@mkdir -p obj
	$(CC)  $(f) $(TARGET) -fno-strict-aliasing -c -I. -o obj/gen.o gen.c
obj/main.o: main.cpp header.h
	@mkdir -p obj
	$(CXX) $(f) $(TARGET) -fno-strict-aliasing -c -o obj/main.o main.cpp
a.out: obj/gen.o obj/main.o
	$(CXX) $(f) $(TARGET) -o a.out obj/gen.o obj/main.o

classes/main/Main.class: Gen.java Main.java
	@mkdir -p classes
	@javac -d classes --enable-preview --release 21 --add-modules=jdk.incubator.vector Gen.java Main.java

ifeq ($(GEN),1)
GEN_JAVA_DEPS = $(SIJAVA)/emit_java.bqn $(SIJAVA)/java.singeli $(SIJAVA)/base.singeli main.singeli
GEN_C_DEPS = $(SIJAVA)/java.singeli $(SIJAVA)/base.singeli main.singeli
endif

Gen.java: $(GEN_JAVA_DEPS)
	@$(SINGELI) -a x86_64 -t ir -l singeli-java=$(SIJAVA) main.singeli | $(IR_PASS) | ./$(SIJAVA)/emit_java.bqn Gen.java

gen_x86.c: $(GEN_C_DEPS)
	@$(SINGELI) -a avx2 -l singeli-java=$(SIJAVA) main.singeli -o gen_x86.c

gen_arm.c: $(GEN_C_DEPS)
	@$(SINGELI) -a aarch64 -l singeli-java=$(SIJAVA) main.singeli -o gen_arm.c


gen-all:
	@"$(MAKE)" gen-all-internal GEN=1
gen-all-internal: Gen.java gen_x86.c gen_arm.c

java-ir:
	@$(SINGELI) -a x86_64 -t ir -l singeli-java=$(SIJAVA) main.singeli | $(IR_PASS)

.PHONY: java-build java-ir run run-cmd

clean:
	rm -rf obj/ classes/