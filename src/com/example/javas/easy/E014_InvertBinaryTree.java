/*
EASY PROBLEM (Simplified for 15 min):
Invert Binary Tree

REQUIREMENTS:
- Given the root of a binary tree
- Invert the tree (mirror it)
- Return the root of the inverted tree

APPROACH:
- Use recursive DFS
- Swap left and right children at each node

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(h) where h is height (recursion stack)
*/

package com.example.javas.easy;

public class E014_InvertBinaryTree {
    
    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static TreeNode invertTree(TreeNode root) {
        // TODO: Implement tree inverter
        // 1. Base case: if root is null, return null
        // 2. Swap left and right children
        // 3. Recursively invert left subtree
        // 4. Recursively invert right subtree
        // 5. Return root
        
        return null;
    }
    
    // Helper to print tree (in-order traversal)
    private static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Tree 1:    4
        //           / \
        //          2   7
        //         / \ / \
        //        1  3 6  9
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(9);
        
        System.out.print("Original tree (in-order): ");
        printInOrder(root1);
        System.out.println();
        
        TreeNode inverted1 = invertTree(root1);
        System.out.print("Inverted tree (in-order): ");
        printInOrder(inverted1);
        System.out.println();
        
        // Tree 2: single node
        TreeNode root2 = new TreeNode(1);
        TreeNode inverted2 = invertTree(root2);
        System.out.println("\nInverted single node: " + (inverted2 != null ? inverted2.val : "null"));
        
        // Tree 3: null
        TreeNode inverted3 = invertTree(null);
        System.out.println("Inverted null tree: " + (inverted3 == null ? "null" : "not null"));
    }
}
