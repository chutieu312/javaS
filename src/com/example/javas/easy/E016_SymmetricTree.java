/*
EASY PROBLEM (Simplified for 15 min):
Symmetric Tree - Check if Binary Tree is Mirror of Itself

REQUIREMENTS:
- Given the root of a binary tree
- Return true if the tree is symmetric (mirror of itself around center)
- Check both structure and values

APPROACH:
- Use recursive helper to compare left and right subtrees
- Left subtree's left should match right subtree's right
- Left subtree's right should match right subtree's left

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(h) where h is height (recursion stack)
*/

package com.example.javas.easy;

public class E016_SymmetricTree {
    
    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static boolean isSymmetric(TreeNode root) {
        // TODO: Implement symmetric checker
        // 1. If root is null, return true
        // 2. Call helper to compare left and right subtrees
        
        return false;
    }
    
    private static boolean isMirror(TreeNode left, TreeNode right) {
        // TODO: Implement mirror checker
        // 1. If both null, return true
        // 2. If one null, return false
        // 3. If values different, return false
        // 4. Recursively check:
        //    - left.left vs right.right AND
        //    - left.right vs right.left
        
        return false;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Symmetric tree:    1
        //                   / \
        //                  2   2
        //                 / \ / \
        //                3  4 4  3
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);
        System.out.println("Symmetric tree [1,2,2,3,4,4,3]: " + isSymmetric(root1));
        
        // Not symmetric:  1
        //                / \
        //               2   2
        //                \   \
        //                 3   3
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);
        System.out.println("Symmetric tree [1,2,2,null,3,null,3]: " + isSymmetric(root2));
        
        // Single node
        TreeNode root3 = new TreeNode(1);
        System.out.println("Symmetric single node: " + isSymmetric(root3));
        
        // Null tree
        System.out.println("Symmetric null tree: " + isSymmetric(null));
    }
}
