"""
E015: Same Tree - Check if Two Binary Trees are Identical

Summary:
Same Tree

Requirements:
- Given roots of two binary trees p and q
- Return true if they are identical, false otherwise
- Two trees are identical if they have the same structure and same node values

Approach:
- Use recursive comparison
- Check if current nodes are equal, then check left and right subtrees

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


def is_same_tree(p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
    """
    TODO: Implement same tree checker
    1. If both are None, return True
    2. If one is None and other is not, return False
    3. If values are different, return False
    4. Recursively check left subtrees AND right subtrees
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    # Tree 1 and Tree 2: both are [1,2,3]
    p1 = TreeNode(1)
    p1.left = TreeNode(2)
    p1.right = TreeNode(3)
    
    q1 = TreeNode(1)
    q1.left = TreeNode(2)
    q1.right = TreeNode(3)
    print(f"Same tree [1,2,3] vs [1,2,3]: {is_same_tree(p1, q1)}")
    
    # Tree 3: [1,2] vs Tree 4: [1,null,2]
    p2 = TreeNode(1)
    p2.left = TreeNode(2)
    
    q2 = TreeNode(1)
    q2.right = TreeNode(2)
    print(f"Same tree [1,2] vs [1,null,2]: {is_same_tree(p2, q2)}")
    
    # Tree 5: [1,2,1] vs Tree 6: [1,1,2]
    p3 = TreeNode(1)
    p3.left = TreeNode(2)
    p3.right = TreeNode(1)
    
    q3 = TreeNode(1)
    q3.left = TreeNode(1)
    q3.right = TreeNode(2)
    print(f"Same tree [1,2,1] vs [1,1,2]: {is_same_tree(p3, q3)}")
    
    # Both None
    print(f"Same tree None vs None: {is_same_tree(None, None)}")
