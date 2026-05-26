#!/bin/bash

javac -d ./build *.java
cd build
java Main
cd ..
rm -rf build