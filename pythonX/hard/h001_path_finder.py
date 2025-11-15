"""
H001: Path Finder in Maze

Summary:
Find if path exists from start to end in maze using DFS.

Requirements:
Given a maze (0=path, 1=wall), find if path exists between two points.

Approach:
Use DFS with visited tracking to explore all possible paths.

Data Structures:
- 2D list for maze
- 2D list for visited tracking
- Directions array for movement

Big O Analysis:
Time Complexity: O(rows * cols)
Space Complexity: O(rows * cols) for visited array and recursion
"""


def find_path(maze: list[list[int]], start_x: int, start_y: int, end_x: int, end_y: int) -> bool:
    """
    TODO: Find path in maze
    1. Get dimensions
    2. Create visited array
    3. Call dfs helper
    """
    pass


def dfs(maze: list[list[int]], x: int, y: int, end_x: int, end_y: int, visited: list[list[bool]]) -> bool:
    """
    TODO: DFS helper
    1. If reached end, return True
    2. Mark as visited
    3. Try all 4 directions:
       - If valid, recursively dfs
       - If any returns True, return True
    4. Return False
    """
    pass


def is_valid(maze: list[list[int]], x: int, y: int, visited: list[list[bool]]) -> bool:
    """
    TODO: Check if position is valid
    Check boundaries, maze value (0), and not visited
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Path exists")
    maze1 = [
        [0, 1, 0, 0, 0],
        [0, 1, 0, 1, 0],
        [0, 0, 0, 1, 0],
        [1, 1, 0, 0, 0],
        [0, 0, 0, 1, 0]
    ]
    print(f"Path exists (0,0) to (4,4): {find_path(maze1, 0, 0, 4, 4)}")  # Expected: True
    
    print("\nTest 2: No path (blocked)")
    maze2 = [
        [0, 0, 0],
        [1, 1, 1],
        [0, 0, 0]
    ]
    print(f"Path exists (0,0) to (2,2): {find_path(maze2, 0, 0, 2, 2)}")  # Expected: False
    
    print("\nTest 3: Simple path")
    maze3 = [
        [0, 0, 0],
        [0, 0, 0],
        [0, 0, 0]
    ]
    print(f"Path exists (0,0) to (2,2): {find_path(maze3, 0, 0, 2, 2)}")  # Expected: True
    
    print("\nTest 4: Start equals end")
    maze4 = [[0]]
    print(f"Path exists (0,0) to (0,0): {find_path(maze4, 0, 0, 0, 0)}")  # Expected: True
