"""
M019: Pacific Atlantic Water Flow

Summary:
Find cells where water can flow to both Pacific and Atlantic oceans.

Requirements:
Given height matrix, find cells that can reach both oceans.
Water flows from higher to equal/lower cells.

Approach:
DFS from Pacific edges, DFS from Atlantic edges, find intersection.

Data Structures:
- 2D boolean arrays for ocean reachability
- list[list[int]]: result coordinates

Big O Analysis:
Time Complexity: O(m * n)
Space Complexity: O(m * n)
"""


def pacific_atlantic(heights: list[list[int]]) -> list[list[int]]:
    """
    TODO: Find cells reachable by both oceans
    1. Check for empty grid
    2. Create pacific and atlantic boolean arrays
    3. DFS from Pacific edges (top row, left column)
    4. DFS from Atlantic edges (bottom row, right column)
    5. Find cells where both are True
    6. Return result
    """
    pass


def dfs(heights: list[list[int]], ocean: list[list[bool]], i: int, j: int) -> None:
    """
    TODO: DFS for ocean reachability
    1. Mark current cell as reachable
    2. Check all 4 neighbors:
       - If in bounds, not visited, and height >= current:
         - Recursively DFS
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: 5x5 grid")
    heights1 = [
        [1, 2, 2, 3, 5],
        [3, 2, 3, 4, 4],
        [2, 4, 5, 3, 1],
        [6, 7, 1, 4, 5],
        [5, 1, 1, 2, 4]
    ]
    result1 = pacific_atlantic(heights1)
    print(f"Pacific Atlantic cells: {result1}")
    # Expected: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
    
    print("\nTest 2: Single cell")
    heights2 = [[1]]
    print(f"Pacific Atlantic cells: {pacific_atlantic(heights2)}")  # Expected: [[0,0]]
    
    print("\nTest 3: 3x3 grid")
    heights3 = [
        [1, 2, 3],
        [8, 9, 4],
        [7, 6, 5]
    ]
    print(f"Pacific Atlantic cells: {pacific_atlantic(heights3)}")
