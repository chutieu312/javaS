/*
MEDIUM PROBLEM (Simplified for 25 min):
Validate Binary Search Tree

REQUIREMENTS:
- Given a binary tree, determine if it is a valid Binary Search Tree (BST)
- BST properties:
  - Left subtree values < node value
  - Right subtree values > node value
  - Both subtrees must also be BSTs

APPROACH:
- Use recursive validation with min and max bounds
- Each node must be within valid range

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(h) where h is height (recursion stack)
*/

package com.example.javas.medium;

public class M013_ValidateBST {
    
    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static boolean isValidBST(TreeNode root) {
        // TODO: Implement BST validation
        // Call helper with initial bounds: Long.MIN_VALUE and Long.MAX_VALUE
        
        return false;
    }
    
    private static boolean isValidBST(TreeNode node, long min, long max) {
        // TODO: Implement recursive helper
        // 1. If node is null, return true (empty tree is valid)
        // 2. If node.val <= min or node.val >= max, return false
        // 3. Recursively validate:
        //    - Left subtree: isValidBST(node.left, min, node.val)
        //    - Right subtree: isValidBST(node.right, node.val, max)
        // 4. Return true if both subtrees are valid
        
        return false;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Valid BST:    2
        //              / \
        //             1   3
        TreeNode tree1 = new TreeNode(2);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(3);
        System.out.println("Valid BST [2,1,3]: " + isValidBST(tree1));
        
        // Invalid BST:  5
        //              / \
        //             1   4
        //                / \
        //               3   6
        TreeNode tree2 = new TreeNode(5);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(4);
        tree2.right.left = new TreeNode(3);
        tree2.right.right = new TreeNode(6);
        System.out.println("Valid BST [5,1,4,3,6]: " + isValidBST(tree2));
        
        // Single node
        TreeNode tree3 = new TreeNode(1);
        System.out.println("Valid BST [1]: " + isValidBST(tree3));
        
        // Empty tree
        System.out.println("Valid BST []: " + isValidBST(null));
    }
}
