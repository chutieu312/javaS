/*
Summary

Given a grid world state with a player and the player's movements, print the resulting 
grid world states after each movement is done.

The world consists of 3 parts (all ASCII characters):
- Walls are represented as |, -, and + (pipe, minus, and plus)
- The player is represented as P
- The floor is represented as _ (underscore)

(0, 0) is the top-left of the grid world.

Input:
- Line 1: Two nonnegative integers Width and Height separated by a space (size of the world)
- Line 2: Two nonnegative integers PlayerX and PlayerY separated by a space (player's location)
- Line 3: A nonnegative integer NumMovements (number of movement inputs)
- Next Height Lines: Width characters representing the world
- Next NumMovements Lines: Two integers MoveX and MoveY separated by a space (movement the player makes)

Output:
- Height × NumMovements Lines: For each movement input, print out the world with the player's new position

Constraints:
- 3 ≤ Width ≤ 10
- 3 ≤ Height ≤ 10
- 1 ≤ PlayerX < Width - 1
- 1 ≤ PlayerY < Height - 1
- 1 ≤ NumMovements ≤ 15
- -1 ≤ MoveX ≤ 1
- -1 ≤ MoveY ≤ 1
- Player position and movements will always be valid and never bump into a wall or go outside the world

Approach Exploration

Simulation approach (chosen):
- Parse the grid and store it as a 2D character array
- Track the current player position
- For each movement:
  * Clear the player's current position (replace P with _)
  * Update player coordinates (add MoveX to x, MoveY to y)
  * Place P at the new position
  * Print the entire grid
- Simple and straightforward
- Time: O(NumMovements × Width × Height), Space: O(Width × Height)

State-based approach:
- Store grid states for each movement
- More memory intensive
- Not necessary for this problem

Coordinate tracking only:
- Only track player position without modifying grid
- Reconstruct grid for each print
- More complex logic

Plan (with Example)

For a 5×5 grid with player at (1,1) and 3 movements:

Initial grid:
```
+---+
|P__|
|___|
|___|
+---+
```

Movement (1, 0) - move right:
- Clear (1,1) → place '_'
- New position: (2,1)
- Place 'P' at (2,1)

Movement (0, 1) - move down:
- Clear (2,1)
- New position: (2,2)
- Place 'P' at (2,2)

Movement (1, 1) - move diagonally down-right:
- Clear (2,2)
- New position: (3,3)
- Place 'P' at (3,3)

Pseudocode
read width, height
read playerX, playerY
read numMovements
create grid[height][width]
for i = 0 to height-1:
    read grid[i] as string

for each movement:
    read moveX, moveY
    grid[playerY][playerX] = '_'  // clear old position
    playerX += moveX
    playerY += moveY
    grid[playerY][playerX] = 'P'  // place at new position
    
    // print current grid state
    for i = 0 to height-1:
        print grid[i]

Big O Analysis

Time Complexity:
O(NumMovements × Height × Width) - For each movement, we print the entire grid
O(Height × Width) - For reading initial grid
Overall: O(NumMovements × Height × Width)

Space Complexity:
O(Height × Width) - For storing the grid
*/

package com.example.javas.easy;

import java.util.Scanner;

public class E003_GridPlayerMovement {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read dimensions
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        
        // Read player position
        int playerX = scanner.nextInt();
        int playerY = scanner.nextInt();
        
        // Read number of movements
        int numMovements = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // Read grid
        char[][] grid = new char[height][width];
        for (int i = 0; i < height; i++) {
            String line = scanner.nextLine();
            grid[i] = line.toCharArray();
        }
        
        // Read movements and update grid
        for (int i = 0; i < numMovements; i++) {
            int moveX = scanner.nextInt();
            int moveY = scanner.nextInt();
            
            // Call solution
            solution(grid, playerX, playerY, moveX, moveY);
            
            // Update player position
            playerX += moveX;
            playerY += moveY;
            
            // Print current grid state
            for (int row = 0; row < height; row++) {
                System.out.println(new String(grid[row]));
            }
        }
        
        scanner.close();
    }
    
    public static void solution(char[][] grid, int currentX, int currentY, int moveX, int moveY) {
        // 1. Clear the current position (set to '_')
        grid[currentY][currentX] = '_';
        
        // 2. Calculate new position
        int newX = currentX + moveX;
        int newY = currentY + moveY;
        
        // 3. Place 'P' at the new position
        grid[newY][newX] = 'P';
    }
}
