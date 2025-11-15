"""
E016: Symmetric Tree - Check if Binary Tree is Mirror of Itself

Summary:
Symmetric Tree

Requirements:
- Given the root of a binary tree
- Return true if the tree is symmetric (mirror of itself around center)
- Check both structure and values

Approach:
- Use recursive helper to compare left and right subtrees
- Left subtree's left should match right subtree's right
- Left subtree's right should match right subtree's left

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


def is_symmetric(root: Optional[TreeNode]) -> bool:
    """
    TODO: Implement symmetric checker
    1. If root is None, return True
    2. Call helper to compare left and right subtrees
    """
    pass


def is_mirror(left: Optional[TreeNode], right: Optional[TreeNode]) -> bool:
    """
    TODO: Implement mirror checker
    1. If both None, return True
    2. If one None, return False
    3. If values different, return False
    4. Recursively check:
       - left.left vs right.right AND
       - left.right vs right.left
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    # Symmetric tree:    1
    #                   / \
    #                  2   2
    #                 / \ / \
    #                3  4 4  3
    root1 = TreeNode(1)
    root1.left = TreeNode(2)
    root1.right = TreeNode(2)
    root1.left.left = TreeNode(3)
    root1.left.right = TreeNode(4)
    root1.right.left = TreeNode(4)
    root1.right.right = TreeNode(3)
    print(f"Symmetric tree [1,2,2,3,4,4,3]: {is_symmetric(root1)}")
    
    # Not symmetric:  1
    #                / \
    #               2   2
    #                \   \
    #                 3   3
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(2)
    root2.left.right = TreeNode(3)
    root2.right.right = TreeNode(3)
    print(f"Symmetric tree [1,2,2,null,3,null,3]: {is_symmetric(root2)}")
    
    # Single node
    root3 = TreeNode(1)
    print(f"Symmetric single node: {is_symmetric(root3)}")
    
    # None tree
    print(f"Symmetric null tree: {is_symmetric(None)}")
