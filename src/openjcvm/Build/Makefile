# Project: openjcvm

CPP  = g++
CC   = gcc
WINDRES = windres
RES  = 
OBJ  = ../vm_core/jni.o ../vm_core/installer.o ../vm_core/JavaClass.o ../vm_core/JavaLang.o ../vm_core/library.o ../vm_core/vm.o ../vm_shell/openJCVM.o ../vm_shell/readIJC.o ../vm_tests/Unit/testReadUx.o $(RES)
LINKOBJ  = ../vm_core/jni.o ../vm_core/installer.o ../vm_core/JavaClass.o ../vm_core/JavaLang.o ../vm_core/library.o ../vm_core/vm.o ../vm_shell/openJCVM.o ../vm_shell/readIJC.o ../vm_tests/Unit/testReadUx.o $(RES)
LIBS =  -L”/sw/lib”  
INCS =  -I”/sw/include” 
CXXINCS =  -I”/sw/include”
BIN  = openjcvm
CXXFLAGS = $(CXXINCS)  
CFLAGS = $(INCS)  
RM = rm -f

.PHONY: all all-before all-after clean clean-custom

all: all-before openjcvm all-after


clean: clean-custom
	${RM} $(OBJ) $(BIN)

$(BIN): $(OBJ)
	$(CPP) $(LINKOBJ) -o "openjcvm" $(LIBS)

oj/vm_core/installer.o: oj/vm_core/installer.cpp
	$(CPP) -c oj/vm_core/installer.cpp -o oj/vm_core/installer.o $(CXXFLAGS)

oj/vm_core/jni.o: oj/vm_core/jni.cpp
	$(CPP) -c oj/vm_core/jni.cpp -o oj/vm_core/jni.o $(CXXFLAGS)

oj/vm_core/JavaClass.o: oj/vm_core/JavaClass.cpp
	$(CPP) -c oj/vm_core/JavaClass.cpp -o oj/vm_core/JavaClass.o $(CXXFLAGS)

oj/vm_core/JavaLang.o: oj/vm_core/JavaLang.cpp
	$(CPP) -c oj/vm_core/JavaLang.cpp -o oj/vm_core/JavaLang.o $(CXXFLAGS)

oj/vm_core/library.o: oj/vm_core/library.cpp
	$(CPP) -c oj/vm_core/library.cpp -o oj/vm_core/library.o $(CXXFLAGS)

oj/vm_core/vm.o: oj/vm_core/vm.cpp
	$(CPP) -c oj/vm_core/vm.cpp -o oj/vm_core/vm.o $(CXXFLAGS)

oj/vm_shell/openJCVM.o: oj/vm_shell/openJCVM.cpp
	$(CPP) -c oj/vm_shell/openJCVM.cpp -o oj/vm_shell/openJCVM.o $(CXXFLAGS)

oj/vm_shell/readIJC.o: oj/vm_shell/readIJC.cpp
	$(CPP) -c oj/vm_shell/readIJC.cpp -o oj/vm_shell/readIJC.o $(CXXFLAGS)

oj/vm_tests/Unit/testReadUx.o: oj/vm_tests/Unit/testReadUx.cpp
	$(CPP) -c oj/vm_tests/Unit/testReadUx.cpp -o oj/vm_tests/Unit/testReadUx.o $(CXXFLAGS)
