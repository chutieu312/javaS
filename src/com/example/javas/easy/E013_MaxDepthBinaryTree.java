/*
EASY PROBLEM (Simplified for 15 min):
Maximum Depth of Binary Tree

REQUIREMENTS:
- Given the root of a binary tree
- Return the maximum depth (number of nodes along the longest path from root to leaf)

APPROACH:
- Use recursive DFS
- Depth = 1 + max(left depth, right depth)

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(h) where h is height (recursion stack)
*/

package com.example.javas.easy;

public class E013_MaxDepthBinaryTree {
    
    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static int maxDepth(TreeNode root) {
        // TODO: Implement max depth finder
        // 1. Base case: if root is null, return 0
        // 2. Recursively get left subtree depth
        // 3. Recursively get right subtree depth
        // 4. Return 1 + max(left depth, right depth)
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Tree 1:    3
        //           / \
        //          9  20
        //            /  \
        //           15   7
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        System.out.println("Max depth of tree1: " + maxDepth(root1));
        
        // Tree 2: 1
        //          \
        //           2
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        System.out.println("Max depth of tree2: " + maxDepth(root2));
        
        // Tree 3: null
        System.out.println("Max depth of null tree: " + maxDepth(null));
        
        // Tree 4: single node
        TreeNode root4 = new TreeNode(0);
        System.out.println("Max depth of single node: " + maxDepth(root4));
    }
}
