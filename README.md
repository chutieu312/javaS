# JavaS - Java Programming Practice Repository

## About javaS
This repository is designed for:
- Practicing **daily Java coding challenges**
- Learning Java fundamentals through structured problems
- Improving problem-solving skills with different difficulty levels

## Project Structure

```
javaS/
├── src/
│   └── com/
│       └── example/
│           └── javas/
│               ├── easy/          # Beginner-level problems
│               ├── medium/        # Intermediate-level problems
│               ├── hard/          # Advanced-level problems
│               └── utils/         # Utility classes
├── scripts/
│   └── run.sh                     # Easy execution script
├── .gitignore
├── LICENSE
└── README.md
```

## Package Structure
- **com.example.javas.easy** - Easy problems (basic syntax, simple algorithms)
- **com.example.javas.medium** - Medium problems (data structures, algorithms)
- **com.example.javas.hard** - Hard problems (complex algorithms, optimization)
- **com.example.javas.utils** - Utility classes (InputReader, helpers)

## Usage

### Running Programs

#### Option 1: Using the Run Script (Recommended)
```bash
# Navigate to the project directory
cd javaS

# Run any problem using the script
./scripts/run.sh <category> <problem_name>

# Examples:
./scripts/run.sh easy E001_HelloWorld
./scripts/run.sh easy E002_SumTwoNumbers
./scripts/run.sh medium M001_StringReverse
./scripts/run.sh hard H001_PathFinder
```

#### Option 2: Manual Compilation and Execution
```bash
# Compile
javac -cp src src/com/example/javas/easy/E001_HelloWorld.java

# Run
java -cp src com.example.javas.easy.E001_HelloWorld
```

### Available Problems

#### Easy Level
- `E001_HelloWorld` - Basic Hello World program
- `E002_SumTwoNumbers` - Sum two user input numbers

#### Medium Level
- `M001_StringReverse` - String reversal implementation

#### Hard Level
- `H001_PathFinder` - Pathfinding algorithm using DFS in a maze

#### Utils
- `InputReader` - Utility class for faster I/O operations (useful for competitive programming)

## Getting Started

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd javaS
   ```

2. **Make the run script executable** (Linux/Mac)
   ```bash
   chmod +x scripts/run.sh
   ```

3. **Run your first program**
   ```bash
   ./scripts/run.sh easy E001_HelloWorld
   ```

## Adding New Problems

1. **Choose the appropriate difficulty level** (easy/medium/hard)
2. **Create a new Java file** in the corresponding package directory
3. **Follow the naming convention**: `E001_ProblemName.java`, `M001_ProblemName.java`, `H001_ProblemName.java`
4. **Include the proper package declaration**:
   ```java
   package com.example.javas.easy;  // or medium, hard
   ```

## Requirements

- Java 8 or higher
- Any Java IDE or text editor
- Terminal/Command prompt for running scripts

## Contributing

Feel free to add more problems or improve existing solutions. Follow the established package structure and naming conventions.
