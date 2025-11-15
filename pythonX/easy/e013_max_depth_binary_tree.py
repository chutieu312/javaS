"""
E013: Maximum Depth of Binary Tree

Summary:
Maximum Depth of Binary Tree

Requirements:
- Given the root of a binary tree
- Return the maximum depth (number of nodes along the longest path from root to leaf)

Approach:
- Use recursive DFS
- Depth = 1 + max(left depth, right depth)

Big O Analysis:
Time Complexity: O(n) where n is number of nodes
Space Complexity: O(h) where h is height (recursion stack)
"""

from typing import Optional


class TreeNode:
    """Definition for a binary tree node."""
    def __init__(self, val: int = 0, left: 'Optional[TreeNode]' = None, right: 'Optional[TreeNode]' = None):
        self.val = val
        self.left = left
        self.right = right


def max_depth(root: Optional[TreeNode]) -> int:
    """
    TODO: Implement max depth finder
    1. Base case: if root is None, return 0
    2. Recursively get left subtree depth
    3. Recursively get right subtree depth
    4. Return 1 + max(left depth, right depth)
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    # Tree 1:    3
    #           / \
    #          9  20
    #            /  \
    #           15   7
    root1 = TreeNode(3)
    root1.left = TreeNode(9)
    root1.right = TreeNode(20)
    root1.right.left = TreeNode(15)
    root1.right.right = TreeNode(7)
    print(f"Max depth of tree1: {max_depth(root1)}")
    
    # Tree 2: 1
    #          \
    #           2
    root2 = TreeNode(1)
    root2.right = TreeNode(2)
    print(f"Max depth of tree2: {max_depth(root2)}")
    
    # Tree 3: None
    print(f"Max depth of null tree: {max_depth(None)}")
    
    # Tree 4: single node
    root4 = TreeNode(0)
    print(f"Max depth of single node: {max_depth(root4)}")
