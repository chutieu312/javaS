/*
MEDIUM PROBLEM (Simplified for 25 min):
Binary Tree Level Order Traversal

REQUIREMENTS:
- Given a binary tree, return level order traversal (level by level, left to right)
- Return as list of lists, where each inner list represents one level

APPROACH:
- Use BFS (Breadth-First Search) with Queue
- Track level size to separate levels

DATA STRUCTURES:
- Queue<TreeNode>: for BFS traversal
- List<List<Integer>>: to store result

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.medium;

import java.util.*;

public class M012_BinaryTreeLevelOrder {
    
    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: Implement level order traversal
        // 1. Create result list
        // 2. If root is null, return empty list
        // 3. Create Queue and add root
        // 4. While queue not empty:
        //    - Get level size = queue.size()
        //    - Create current level list
        //    - For level size times:
        //      - Poll node
        //      - Add node.val to current level
        //      - Add left and right children to queue if not null
        //    - Add current level to result
        // 5. Return result
        
        return new ArrayList<>();
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
        System.out.println("Level order [3,9,20,15,7]: " + levelOrder(root1));
        
        // Tree 2: 1
        TreeNode root2 = new TreeNode(1);
        System.out.println("Level order [1]: " + levelOrder(root2));
        
        // Tree 3: null
        System.out.println("Level order []: " + levelOrder(null));
    }
}
