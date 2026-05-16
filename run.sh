#!/bin/bash

mkdir -p target
gcc -o target/main main.c -fopenmp -O3
target/main
