/*
Summary

You're given a square grid of characters with dimensions n×n containing 'X', 'x', '.', and 'B'.
Your task is to make the grid symmetric across the main diagonal (top-left to bottom-right).
For every 'X' or 'x' at position (i,j), add the same character at the symmetric position (j,i).
'B' and '.' characters remain fixed and unchanged.

Input:
- First line: integer n (size of the grid)
- Next n lines: strings representing each row of the grid

Output:
- n lines representing the grid with diagonal symmetry applied

Constraints:
- 1 ≤ n ≤ 100
- Grid contains 'X', 'x', '.', and 'B' characters

Approach Exploration

Matrix Transpose (chosen):
- For each 'X' or 'x' at position (i,j), place the same character at (j,i)
- This creates symmetry across the main diagonal (top-left to bottom-right)
- Simple one-pass algorithm
- Time: O(n²), Space: O(1) additional

Store positions approach:
- First pass: collect all 'X'/'x' positions
- Second pass: apply symmetry
- Less efficient due to extra storage

Anti-diagonal approach:
- Formula (n-1-j, n-1-i) creates symmetry across anti-diagonal
- Not what this problem requires

Plan (with Example)

For n = 3 with grid:
```
..x
...
...
```

Step 1: Find 'x' at position (0,2)
Step 2: Calculate symmetric position: (j,i) = (2,0)
Step 3: Place 'x' at (2,0)

Result:
```
..x
...
x..
```

Pseudocode
read n
create grid[n][n]
for i = 0 to n-1:
    read grid[i] as string and convert to char array

for i = 0 to n-1:
    for j = 0 to n-1:
        if grid[i][j] == 'X' or grid[i][j] == 'x':
            symmetric_row = j
            symmetric_col = i
            grid[symmetric_row][symmetric_col] = grid[i][j]

for i = 0 to n-1:
    print grid[i] as string

Big O Analysis

Time Complexity:
O(n²) - Single pass through the entire grid to check each cell

Space Complexity:
O(n²) - For storing the input grid
O(1) - Additional space (modify grid in-place)
*/

package com.example.javas.medium;

import java.util.Scanner;

public class M002_DiagonalSymmetry {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            grid[i] = line.toCharArray();
        }
        
        // Print original grid
        System.out.println("Before:");
        for (int i = 0; i < n; i++) {
            System.out.println(new String(grid[i]));
        }
        
        // Call solution
        char[][] result = solution(grid, n);
        
        // Print result
        System.out.println("\nAfter:");
        for (int i = 0; i < n; i++) {
            System.out.println(new String(result[i]));
        }
        
        scanner.close();
    }
    
    public static char[][] solution(char[][] grid, int n) {
        // Apply diagonal reflection: for each 'X' or 'x' at (i,j), place same character at (j,i)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'X' || grid[i][j] == 'x') {
                    int symmetricRow = j;
                    int symmetricCol = i;
                    grid[symmetricRow][symmetricCol] = grid[i][j]; // Use same character (X or x)
                }
            }
        }
        return grid;
    }
}