#!/bin/sh
JAVA_PATH="./.jdk/bin"
$JAVA_PATH/javac *.java
$JAVA_PATH/java Main $0 $@
