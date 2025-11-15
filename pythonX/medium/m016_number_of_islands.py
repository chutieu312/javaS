"""
M016: Number of Islands

Summary:
Count number of islands in 2D grid (DFS/BFS).

Requirements:
Given grid of '1's (land) and '0's (water), count islands.
Islands formed by connecting adjacent lands horizontally/vertically.

Approach:
Use DFS to mark visited land cells.

Data Structures:
- 2D grid (list[list[str]])

Big O Analysis:
Time Complexity: O(m * n)
Space Complexity: O(m * n) for recursion stack
"""


def num_islands(grid: list[list[str]]) -> int:
    """
    TODO: Count islands
    1. If grid empty, return 0
    2. Initialize count = 0
    3. Loop through each cell:
       - If grid[i][j] == '1':
         - Increment count
         - Call dfs to mark entire island
    4. Return count
    """
    pass


def dfs(grid: list[list[str]], i: int, j: int) -> None:
    """
    TODO: DFS to mark island
    1. Check boundaries
    2. If not '1', return
    3. Mark as visited (set to '0')
    4. Recursively visit 4 neighbors
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Single large island")
    grid1 = [
        ['1','1','1','1','0'],
        ['1','1','0','1','0'],
        ['1','1','0','0','0'],
        ['0','0','0','0','0']
    ]
    print(f"Number of islands: {num_islands(grid1)}")  # Expected: 1
    
    print("\nTest 2: Multiple islands")
    grid2 = [
        ['1','1','0','0','0'],
        ['1','1','0','0','0'],
        ['0','0','1','0','0'],
        ['0','0','0','1','1']
    ]
    print(f"Number of islands: {num_islands(grid2)}")  # Expected: 3
    
    print("\nTest 3: Checkerboard pattern")
    grid3 = [
        ['1','0','1','0','1'],
        ['0','1','0','1','0'],
        ['1','0','1','0','1']
    ]
    print(f"Number of islands: {num_islands(grid3)}")  # Expected: 9
