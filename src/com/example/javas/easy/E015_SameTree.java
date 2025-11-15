/*
EASY PROBLEM (Simplified for 15 min):
Same Tree - Check if Two Binary Trees are Identical

REQUIREMENTS:
- Given roots of two binary trees p and q
- Return true if they are identical, false otherwise
- Two trees are identical if they have the same structure and same node values

APPROACH:
- Use recursive comparison
- Check if current nodes are equal, then check left and right subtrees

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(h) where h is height (recursion stack)
*/

package com.example.javas.easy;

public class E015_SameTree {
    
    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // TODO: Implement same tree checker
        // 1. If both are null, return true
        // 2. If one is null and other is not, return false
        // 3. If values are different, return false
        // 4. Recursively check left subtrees AND right subtrees
        
        return false;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Tree 1 and Tree 2: both are [1,2,3]
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);
        
        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);
        System.out.println("Same tree [1,2,3] vs [1,2,3]: " + isSameTree(p1, q1));
        
        // Tree 3: [1,2] vs Tree 4: [1,null,2]
        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        
        TreeNode q2 = new TreeNode(1);
        q2.right = new TreeNode(2);
        System.out.println("Same tree [1,2] vs [1,null,2]: " + isSameTree(p2, q2));
        
        // Tree 5: [1,2,1] vs Tree 6: [1,1,2]
        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(1);
        
        TreeNode q3 = new TreeNode(1);
        q3.left = new TreeNode(1);
        q3.right = new TreeNode(2);
        System.out.println("Same tree [1,2,1] vs [1,1,2]: " + isSameTree(p3, q3));
        
        // Both null
        System.out.println("Same tree null vs null: " + isSameTree(null, null));
    }
}
