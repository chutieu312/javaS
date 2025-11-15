"""
M015: Binary Tree Maximum Path Sum

Summary:
Find the maximum path sum in a binary tree.

Requirements:
Path can start and end at any node.
Each node appears only once in path.

Approach:
Use recursive DFS, track global maximum.

Data Structures:
- TreeNode: binary tree structure
- int: global max_sum tracker

Big O Analysis:
Time Complexity: O(n) where n is number of nodes
Space Complexity: O(h) where h is height (recursion stack)
"""

from typing import Optional


class TreeNode:
    def __init__(self, val: int = 0, left: 'Optional[TreeNode]' = None, right: 'Optional[TreeNode]' = None):
        self.val = val
        self.left = left
        self.right = right


max_sum = float('-inf')


def max_path_sum(root: Optional[TreeNode]) -> int:
    """
    TODO: Find max path sum
    1. Initialize global max_sum to -infinity
    2. Call helper function
    3. Return max_sum
    """
    pass


def max_gain(node: Optional[TreeNode]) -> int:
    """
    TODO: Recursive helper
    1. Base case: if None, return 0
    2. Get max gain from left and right (ignore negative)
    3. Calculate path sum through current node
    4. Update global max_sum
    5. Return max gain continuing through this node
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Simple tree")
    # Tree:  1
    #       / \
    #      2   3
    tree1 = TreeNode(1)
    tree1.left = TreeNode(2)
    tree1.right = TreeNode(3)
    print(f"Max path sum [1,2,3]: {max_path_sum(tree1)}")     # Expected: 6
    
    print("\nTest 2: Tree with negative values")
    # Tree:   -10
    #         /  \
    #        9   20
    #           /  \
    #          15   7
    tree2 = TreeNode(-10)
    tree2.left = TreeNode(9)
    tree2.right = TreeNode(20)
    tree2.right.left = TreeNode(15)
    tree2.right.right = TreeNode(7)
    print(f"Max path sum [-10,9,20,15,7]: {max_path_sum(tree2)}")  # Expected: 42
    
    print("\nTest 3: Single negative node")
    tree3 = TreeNode(-3)
    print(f"Max path sum [-3]: {max_path_sum(tree3)}")        # Expected: -3
