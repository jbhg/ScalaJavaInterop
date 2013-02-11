sources = $(wildcard *.java)

all: clean compile run

compile:
	mkdir -p bin 
	scalac -d bin src/com/jbhg/scala/*.scala src/com/jbhg/java/*.java
	javac -d bin -classpath /usr/local/scala/lib/scala-library.jar:bin src/com/jbhg/java/*.java
run:
	#!/bin/bash
	java -ea -cp ./bin com.jbhg.java.Main

clean: 
	rm -rf bin 

