"""
E003: Grid Player Movement

Summary:
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

Approach:
Simulation approach:
- Parse the grid and store it as a 2D list of characters
- Track the current player position
- For each movement:
  * Clear the player's current position (replace P with _)
  * Update player coordinates (add MoveX to x, MoveY to y)
  * Place P at the new position
  * Print the entire grid
- Simple and straightforward
- Time: O(NumMovements × Width × Height), Space: O(Width × Height)

Big O Analysis:
Time Complexity: O(NumMovements × Height × Width) - For each movement, we print the entire grid
Space Complexity: O(Height × Width) - For storing the grid
"""

def solution(grid: list[list[str]], current_x: int, current_y: int, move_x: int, move_y: int) -> None:
    """
    TODO: Implement grid player movement
    1. Clear the current position (set to '_')
    2. Calculate new position (current + move)
    3. Place 'P' at the new position
    """
    pass


if __name__ == "__main__":
    # Read dimensions
    width, height = map(int, input().split())
    
    # Read player position
    player_x, player_y = map(int, input().split())
    
    # Read number of movements
    num_movements = int(input())
    
    # Read grid
    grid = []
    for _ in range(height):
        line = input()
        grid.append(list(line))
    
    # Read movements and update grid
    for _ in range(num_movements):
        move_x, move_y = map(int, input().split())
        
        # Call solution
        solution(grid, player_x, player_y, move_x, move_y)
        
        # Update player position
        player_x += move_x
        player_y += move_y
        
        # Print current grid state
        for row in grid:
            print(''.join(row))
