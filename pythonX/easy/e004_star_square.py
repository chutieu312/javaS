"""
E004: Star Square

Summary:
Output a square of stars with 'sides' sides. One star looks like this:
 /\\
< >
 \\/

Input:
- Line 1: An integer 'sides' for the sides of the square

Output:
- The square of stars

Constraints:
- 1 ≤ sides ≤ 10

Approach:
Pattern-based printing:
- Each star is 3 lines tall and 3 characters wide
- For a square of 'sides' stars, we need:
  * Height: sides × 3 lines
  * Width: sides × 3 characters per line
- Print pattern row by row:
  * Row 0, 3, 6, ... (top of stars): " /\\ " repeated
  * Row 1, 4, 7, ... (middle of stars): "< >" repeated
  * Row 2, 5, 8, ... (bottom of stars): " \\/ " repeated
- Time: O(sides²), Space: O(1)

Big O Analysis:
Time Complexity: O(sides²) - We iterate through sides rows, and for each row we print sides stars
Space Complexity: O(1) - Only using constant extra space for loop variables
"""

def solution(sides: int) -> None:
    """
    TODO: Implement the star square printing logic
    For each row of stars (0 to sides-1):
      1. Print top line: " /\\ " repeated 'sides' times
      2. Print middle line: "< >" repeated 'sides' times
      3. Print bottom line: " \\/ " repeated 'sides' times
    """
    pass


if __name__ == "__main__":
    # Read input
    sides = int(input())
    
    # Call solution
    solution(sides)
