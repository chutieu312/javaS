"""
M013: Validate Binary Search Tree

Summary:
Determine if binary tree is a valid BST.

Requirements:
Check BST properties:
- Left subtree values < node value
- Right subtree values > node value
- Both subtrees are BSTs

Approach:
Use recursive validation with min/max bounds.

Data Structures:
- TreeNode: binary tree structure

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


def is_valid_bst(root: Optional[TreeNode]) -> bool:
    """
    TODO: Validate BST
    Call helper with initial bounds: float('-inf') and float('inf')
    """
    pass


def is_valid_bst_helper(node: Optional[TreeNode], min_val: float, max_val: float) -> bool:
    """
    TODO: Recursive helper
    1. If node is None, return True
    2. If node.val <= min_val or node.val >= max_val, return False
    3. Recursively validate left and right subtrees
    4. Return True if both valid
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Valid BST")
    # Tree:  2
    #       / \
    #      1   3
    tree1 = TreeNode(2)
    tree1.left = TreeNode(1)
    tree1.right = TreeNode(3)
    print(f"Valid BST [2,1,3]: {is_valid_bst(tree1)}")        # Expected: True
    
    print("\nTest 2: Invalid BST")
    # Tree:  5
    #       / \
    #      1   4
    #         / \
    #        3   6
    tree2 = TreeNode(5)
    tree2.left = TreeNode(1)
    tree2.right = TreeNode(4)
    tree2.right.left = TreeNode(3)
    tree2.right.right = TreeNode(6)
    print(f"Valid BST [5,1,4,3,6]: {is_valid_bst(tree2)}")    # Expected: False
    
    print("\nTest 3: Single node")
    tree3 = TreeNode(1)
    print(f"Valid BST [1]: {is_valid_bst(tree3)}")            # Expected: True
    
    print("\nTest 4: Empty tree")
    print(f"Valid BST []: {is_valid_bst(None)}")              # Expected: True
