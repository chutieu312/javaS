#!/bin/bash

# run.sh - Script to run any Java problem easily
# Usage: ./run.sh <category> <problem_name>
# Example: ./run.sh easy E001_HelloWorld

if [ $# -ne 2 ]; then
    echo "Usage: $0 <category> <problem_name>"
    echo "Categories: easy, medium, hard, utils"
    echo "Example: $0 easy E001_HelloWorld"
    exit 1
fi

CATEGORY=$1
PROBLEM=$2
SRC_DIR="src"
PACKAGE_PATH="com/example/javas"
CLASS_PATH="$SRC_DIR/$PACKAGE_PATH/$CATEGORY"

# Check if the category directory exists
if [ ! -d "$CLASS_PATH" ]; then
    echo "Error: Category '$CATEGORY' not found in $CLASS_PATH"
    exit 1
fi

# Check if the Java file exists
JAVA_FILE="$CLASS_PATH/$PROBLEM.java"
if [ ! -f "$JAVA_FILE" ]; then
    echo "Error: Java file '$JAVA_FILE' not found"
    exit 1
fi

echo "Compiling $JAVA_FILE..."
javac -cp "$SRC_DIR" "$JAVA_FILE"

if [ $? -eq 0 ]; then
    echo "Compilation successful. Running $PROBLEM..."
    echo "----------------------------------------"
    java -cp "$SRC_DIR" "com.example.javas.$CATEGORY.$PROBLEM"
else
    echo "Compilation failed!"
    exit 1
fi