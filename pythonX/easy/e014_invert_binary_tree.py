"""
E014: Invert Binary Tree

Summary:
Invert Binary Tree

Requirements:
- Given the root of a binary tree
- Invert the tree (mirror it)
- Return the root of the inverted tree

Approach:
- Use recursive DFS
- Swap left and right children at each node

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


def invert_tree(root: Optional[TreeNode]) -> Optional[TreeNode]:
    """
    TODO: Implement tree inverter
    1. Base case: if root is None, return None
    2. Swap left and right children
    3. Recursively invert left subtree
    4. Recursively invert right subtree
    5. Return root
    """
    pass


def print_in_order(root: Optional[TreeNode]) -> None:
    """Helper to print tree (in-order traversal)."""
    if root is None:
        return
    print_in_order(root.left)
    print(root.val, end=" ")
    print_in_order(root.right)


if __name__ == "__main__":
    # Test Cases
    
    # Tree 1:    4
    #           / \
    #          2   7
    #         / \ / \
    #        1  3 6  9
    root1 = TreeNode(4)
    root1.left = TreeNode(2)
    root1.right = TreeNode(7)
    root1.left.left = TreeNode(1)
    root1.left.right = TreeNode(3)
    root1.right.left = TreeNode(6)
    root1.right.right = TreeNode(9)
    
    print("Original tree (in-order): ", end="")
    print_in_order(root1)
    print()
    
    inverted1 = invert_tree(root1)
    print("Inverted tree (in-order): ", end="")
    print_in_order(inverted1)
    print("\n")
    
    # Tree 2: single node
    root2 = TreeNode(1)
    inverted2 = invert_tree(root2)
    print(f"Inverted single node: {inverted2.val if inverted2 else 'None'}")
    
    # Tree 3: None
    inverted3 = invert_tree(None)
    print(f"Inverted null tree: {'None' if inverted3 is None else 'not None'}")
