"""
M012: Binary Tree Level Order Traversal

Summary:
Return level order traversal of binary tree.

Requirements:
Return list of lists, each representing one level.

Approach:
Use BFS with queue, track level size.

Data Structures:
- deque: for BFS traversal
- list[list[int]]: result

Big O Analysis:
Time Complexity: O(n) where n is number of nodes
Space Complexity: O(n)
"""

from collections import deque
from typing import Optional


class TreeNode:
    def __init__(self, val: int = 0, left: 'Optional[TreeNode]' = None, right: 'Optional[TreeNode]' = None):
        self.val = val
        self.left = left
        self.right = right


def level_order(root: Optional[TreeNode]) -> list[list[int]]:
    """
    TODO: Implement level order traversal
    1. Create result list
    2. If root is None, return empty list
    3. Create deque and add root
    4. While queue not empty:
       - Get level size
       - Create current level list
       - For level_size times:
         - Pop node from queue
         - Add val to current level
         - Add children to queue
       - Add current level to result
    5. Return result
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Complete tree")
    # Tree:    3
    #         / \
    #        9  20
    #          /  \
    #         15   7
    root1 = TreeNode(3)
    root1.left = TreeNode(9)
    root1.right = TreeNode(20)
    root1.right.left = TreeNode(15)
    root1.right.right = TreeNode(7)
    print(f"Level order [3,9,20,15,7]: {level_order(root1)}")  # Expected: [[3], [9,20], [15,7]]
    
    print("\nTest 2: Single node")
    root2 = TreeNode(1)
    print(f"Level order [1]: {level_order(root2)}")            # Expected: [[1]]
    
    print("\nTest 3: Empty tree")
    print(f"Level order []: {level_order(None)}")              # Expected: []
