/*
MEDIUM PROBLEM (Simplified for 25 min):
Find the Lowest Common Ancestor (LCA) in a Binary Tree

REQUIREMENTS:
- Given a binary tree and two nodes p and q
- Find the lowest common ancestor (LCA) of p and q
- LCA: the lowest node that has both p and q as descendants

APPROACH:
- Use recursive DFS traversal
- If current node is p or q, return current node
- Search in left and right subtrees
- If both return non-null, current node is LCA

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(h) where h is height (recursion stack)
*/

package com.example.javas.medium;

public class M014_LowestCommonAncestor {
    
    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TODO: Implement LCA finder
        // 1. Base case: if root is null or equals p or q, return root
        // 2. Recursively search in left subtree
        // 3. Recursively search in right subtree
        // 4. If both left and right are non-null, current root is LCA
        // 5. If only left is non-null, return left
        // 6. Otherwise, return right
        
        return null;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Tree:        3
        //             / \
        //            5   1
        //           / \ / \
        //          6  2 0  8
        //            / \
        //           7   4
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        
        TreeNode p1 = root.left;        // node 5
        TreeNode q1 = root.right;       // node 1
        TreeNode lca1 = lowestCommonAncestor(root, p1, q1);
        System.out.println("LCA of 5 and 1: " + (lca1 != null ? lca1.val : "null"));
        
        TreeNode p2 = root.left;        // node 5
        TreeNode q2 = root.left.right.right; // node 4
        TreeNode lca2 = lowestCommonAncestor(root, p2, q2);
        System.out.println("LCA of 5 and 4: " + (lca2 != null ? lca2.val : "null"));
        
        TreeNode p3 = root.left.left;   // node 6
        TreeNode q3 = root.left.right.left; // node 7
        TreeNode lca3 = lowestCommonAncestor(root, p3, q3);
        System.out.println("LCA of 6 and 7: " + (lca3 != null ? lca3.val : "null"));
    }
}
