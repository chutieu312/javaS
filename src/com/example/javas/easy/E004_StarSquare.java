/*
Summary

Output a square of stars with 'sides' sides. One star looks like this:
 /\
< >
 \/

Input:
- Line 1: An integer 'sides' for the sides of the square

Output:
- The square of stars

Constraints:
- 1 ≤ sides ≤ 10

Approach Exploration

Pattern-based printing (chosen):
- Each star is 3 lines tall and 3 characters wide
- For a square of 'sides' stars, we need:
  * Height: sides × 3 lines
  * Width: sides × 3 characters per line
- Print pattern row by row:
  * Row 0, 3, 6, ... (top of stars): " /\ " repeated
  * Row 1, 4, 7, ... (middle of stars): "< >" repeated
  * Row 2, 5, 8, ... (bottom of stars): " \/ " repeated (note: \/ needs escape)
- Simple nested loop approach
- Time: O(sides²), Space: O(1)

String building approach:
- Build entire output as one string first
- Then print at once
- More memory usage, same time complexity

Character-by-character:
- Calculate what character to print at each position
- More complex logic but uses less memory

Plan (with Example)

For sides = 1:
```
 /\
< >
 \/
```

For sides = 2:
```
 /\  /\
< >< >
 \/  \/
 /\  /\
< >< >
 \/  \/
```

Pattern breakdown:
- Line 0: top of row 1 stars
- Line 1: middle of row 1 stars
- Line 2: bottom of row 1 stars
- Line 3: top of row 2 stars
- Line 4: middle of row 2 stars
- Line 5: bottom of row 2 stars

For each row of stars (0 to sides-1):
  Print line 0 of stars: " /\ " × sides
  Print line 1 of stars: "< >" × sides
  Print line 2 of stars: " \/ " × sides (escape backslash: " \\/ ")

Pseudocode
read sides

for starRow = 0 to sides-1:
    // Top line of stars
    for i = 0 to sides-1:
        print " /\ "
    print newline
    
    // Middle line of stars
    for i = 0 to sides-1:
        print "< >"
    print newline
    
    // Bottom line of stars
    for i = 0 to sides-1:
        print " \\/ "
    print newline

Big O Analysis

Time Complexity:
O(sides²) - We iterate through sides rows, and for each row we print sides stars
Each star requires constant time to print (3 characters)

Space Complexity:
O(1) - Only using constant extra space for loop variables
Output size is O(sides²) but that's not counted as extra space
*/

package com.example.javas.easy;

import java.util.Scanner;

public class E004_StarSquare {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int sides = scanner.nextInt();
        
        // Call solution
        solution(sides);
        
        scanner.close();
    }
    
    public static void solution(int sides) {
        // done: Implement the star square printing logic
        // For each row of stars (0 to sides-1):
        //   1. Print top line: " /\ " repeated 'sides' times
        //   2. Print middle line: "< >" repeated 'sides' times
        //   3. Print bottom line: " \\/ " repeated 'sides' times (note: escape backslash)
        for (int starRow = 0; starRow < sides; starRow++) {
            // 1. Print top line: " /\ " repeated 'sides' times
            for (int i = 0; i < sides; i++) {
                System.out.print(" /\\ ");
            }
            System.out.println();
            
            // 2. Print middle line: "< >" repeated 'sides' times
            for (int i = 0; i < sides; i++) {
                System.out.print("< >");
            }
            System.out.println();
            
            // 3. Print bottom line: " \/ " repeated 'sides' times
            for (int i = 0; i < sides; i++) {
                System.out.print(" \\/ ");
            }
            System.out.println();
        }
    }
}
