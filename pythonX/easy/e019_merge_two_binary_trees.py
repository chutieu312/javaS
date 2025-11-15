"""
E019: Merge Two Binary Trees

Summary:
Merge Two Binary Trees

Requirements:
- Given two binary trees root1 and root2
- Merge them into a new tree
- Merging rule: If nodes overlap, sum their values; otherwise, use non-null node

Approach:
- Use recursive DFS
- At each position, sum values if both exist, or use whichever exists

Big O Analysis:
Time Complexity: O(n) where n is total number of nodes
Space Complexity: O(h) where h is height (recursion stack)
"""

from typing import Optional


class TreeNode:
    """Definition for a binary tree node."""
    def __init__(self, val: int = 0, left: 'Optional[TreeNode]' = None, right: 'Optional[TreeNode]' = None):
        self.val = val
        self.left = left
        self.right = right


def merge_trees(root1: Optional[TreeNode], root2: Optional[TreeNode]) -> Optional[TreeNode]:
    """
    TODO: Implement tree merger
    1. If both are None, return None
    2. If one is None, return the other
    3. Create new node with sum of both values
    4. Recursively merge left subtrees
    5. Recursively merge right subtrees
    6. Return new node
    """
    pass


def print_pre_order(root: Optional[TreeNode]) -> None:
    """Helper to print tree (pre-order traversal)."""
    if root is None:
        print("null", end=" ")
        return
    print(root.val, end=" ")
    print_pre_order(root.left)
    print_pre_order(root.right)


if __name__ == "__main__":
    # Test Cases
    
    # Tree 1:  1         Tree 2:  2
    #         / \                / \
    #        3   2              1   3
    #       /                    \   \
    #      5                      4   7
    root1 = TreeNode(1)
    root1.left = TreeNode(3)
    root1.right = TreeNode(2)
    root1.left.left = TreeNode(5)
    
    root2 = TreeNode(2)
    root2.left = TreeNode(1)
    root2.right = TreeNode(3)
    root2.left.right = TreeNode(4)
    root2.right.right = TreeNode(7)
    
    merged = merge_trees(root1, root2)
    print("Merged tree (pre-order): ", end="")
    print_pre_order(merged)
    print("\n")
    
    # Merge with None
    root3 = TreeNode(1)
    merged2 = merge_trees(root3, None)
    print("Merge [1] with None: ", end="")
    print_pre_order(merged2)
    print()
