/*
MEDIUM PROBLEM (Simplified for 25 min):
Binary Tree Maximum Path Sum

REQUIREMENTS:
- Given a binary tree, find the maximum path sum
- A path is a sequence of nodes where each pair of adjacent nodes has an edge
- Path can start and end at any node (doesn't have to go through root)
- Each node value is included only once in the path

APPROACH:
- Use recursive DFS
- At each node, calculate max path sum including that node
- Track global maximum

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(h) where h is height (recursion stack)
*/

package com.example.javas.medium;

public class M015_BinaryTreeMaxPathSum {
    
    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    private static int maxSum;
    
    public static int maxPathSum(TreeNode root) {
        // TODO: Implement max path sum finder
        // 1. Initialize maxSum to Integer.MIN_VALUE
        // 2. Call helper function
        // 3. Return maxSum
        
        return 0;
    }
    
    private static int maxGain(TreeNode node) {
        // TODO: Implement recursive helper
        // 1. Base case: if node is null, return 0
        // 2. Recursively get max gain from left and right subtrees
        //    - Take max(0, gain) to ignore negative paths
        // 3. Calculate path sum through current node:
        //    - priceNewPath = node.val + leftGain + rightGain
        // 4. Update maxSum if priceNewPath is larger
        // 5. Return max gain if we continue path through this node:
        //    - node.val + max(leftGain, rightGain)
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Tree 1:    1
        //           / \
        //          2   3
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);
        System.out.println("Max path sum [1,2,3]: " + maxPathSum(tree1));
        
        // Tree 2:   -10
        //           /  \
        //          9   20
        //             /  \
        //            15   7
        TreeNode tree2 = new TreeNode(-10);
        tree2.left = new TreeNode(9);
        tree2.right = new TreeNode(20);
        tree2.right.left = new TreeNode(15);
        tree2.right.right = new TreeNode(7);
        System.out.println("Max path sum [-10,9,20,15,7]: " + maxPathSum(tree2));
        
        // Tree 3: -3
        TreeNode tree3 = new TreeNode(-3);
        System.out.println("Max path sum [-3]: " + maxPathSum(tree3));
    }
}
