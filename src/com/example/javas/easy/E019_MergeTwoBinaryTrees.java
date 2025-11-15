/*
EASY PROBLEM (Simplified for 15 min):
Merge Two Binary Trees

REQUIREMENTS:
- Given two binary trees root1 and root2
- Merge them into a new tree
- Merging rule: If nodes overlap, sum their values; otherwise, use non-null node

APPROACH:
- Use recursive DFS
- At each position, sum values if both exist, or use whichever exists

TIME COMPLEXITY: O(n) where n is total number of nodes
SPACE COMPLEXITY: O(h) where h is height (recursion stack)
*/

package com.example.javas.easy;

public class E019_MergeTwoBinaryTrees {
    
    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // TODO: Implement tree merger
        // 1. If both are null, return null
        // 2. If one is null, return the other
        // 3. Create new node with sum of both values
        // 4. Recursively merge left subtrees
        // 5. Recursively merge right subtrees
        // 6. Return new node
        
        return null;
    }
    
    // Helper to print tree (pre-order traversal)
    private static void printPreOrder(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(root.val + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Tree 1:  1         Tree 2:  2
        //         / \                / \
        //        3   2              1   3
        //       /                    \   \
        //      5                      4   7
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
        
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);
        
        TreeNode merged = mergeTrees(root1, root2);
        System.out.print("Merged tree (pre-order): ");
        printPreOrder(merged);
        System.out.println();
        
        // Merge with null
        TreeNode root3 = new TreeNode(1);
        TreeNode merged2 = mergeTrees(root3, null);
        System.out.print("Merge [1] with null: ");
        printPreOrder(merged2);
        System.out.println();
    }
}
