#!/bin/bash

# Go to the script's directory
cd "$(dirname "$0")"

# Handle --clean or -r
if [ "$1" == "--clean" ] || [ "$1" == "-c" ]; then
	echo "Cleaning compiled files..."
	if [ -d "out" ]; then
		rm -rf out
		echo "Cleaned all files in 'out/'"
		echo "'out/ directory successfully removed."
	else
		echo "No 'out/' directory found - nothing to clean."
	fi
	exit 0
fi

# Handle --run-only or -r
if [ "$1" == "--run-only" ] || [ "$1" == "-r" ]; then
	echo "Running program..."
	java -cp out application.MOOCRunner
	exit 0
fi

# Default behavior: build and run
echo "Compiling Java files..."

mkdir -p out
find out -name "*class" -delete

# Compile all Java files and output to 'out' inside src
find . -name "*.java" | xargs javac -d out

# Check if compilation failed
if [ $? -ne 0 ]; then
	echo "Compilation failed."
	exit 1
fi

echo "Compilation successful."
echo "Running program..."

java -cp out application.MOOCRunner
