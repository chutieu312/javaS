"""
M014: Lowest Common Ancestor in Binary Tree

Summary:
Find the lowest common ancestor of two nodes.

Requirements:
LCA is the lowest node that has both p and q as descendants.

Approach:
Use recursive DFS traversal.

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


def lowest_common_ancestor(root: Optional[TreeNode], p: TreeNode, q: TreeNode) -> Optional[TreeNode]:
    """
    TODO: Find LCA
    1. Base case: if root is None or equals p or q, return root
    2. Recursively search left and right subtrees
    3. If both return non-None, current root is LCA
    4. If only left is non-None, return left
    5. Otherwise, return right
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: LCA of nodes in different subtrees")
    # Tree:        3
    #             / \
    #            5   1
    #           / \ / \
    #          6  2 0  8
    #            / \
    #           7   4
    root = TreeNode(3)
    root.left = TreeNode(5)
    root.right = TreeNode(1)
    root.left.left = TreeNode(6)
    root.left.right = TreeNode(2)
    root.right.left = TreeNode(0)
    root.right.right = TreeNode(8)
    root.left.right.left = TreeNode(7)
    root.left.right.right = TreeNode(4)
    
    p1 = root.left        # node 5
    q1 = root.right       # node 1
    lca1 = lowest_common_ancestor(root, p1, q1)
    print(f"LCA of 5 and 1: {lca1.val if lca1 else 'null'}")  # Expected: 3
    
    print("\nTest 2: LCA where one node is ancestor of other")
    p2 = root.left        # node 5
    q2 = root.left.right.right  # node 4
    lca2 = lowest_common_ancestor(root, p2, q2)
    print(f"LCA of 5 and 4: {lca2.val if lca2 else 'null'}")  # Expected: 5
    
    print("\nTest 3: LCA of sibling nodes")
    p3 = root.left.left   # node 6
    q3 = root.left.right.left  # node 7
    lca3 = lowest_common_ancestor(root, p3, q3)
    print(f"LCA of 6 and 7: {lca3.val if lca3 else 'null'}")  # Expected: 5
