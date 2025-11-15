/*
MEDIUM PROBLEM (Simplified for 25 min):
Pacific Atlantic Water Flow

REQUIREMENTS:
- Given m x n matrix of heights representing an island
- Pacific ocean touches left and top edges
- Atlantic ocean touches right and bottom edges
- Water can flow from cell to adjacent cell if height is equal or lower
- Find all cells where water can flow to both Pacific AND Atlantic oceans

APPROACH:
- Run DFS from Pacific edges to mark reachable cells
- Run DFS from Atlantic edges to mark reachable cells
- Find intersection of both sets

DATA STRUCTURES:
- boolean[][]: to track cells reachable from each ocean
- List<List<Integer>>: to store result coordinates

TIME COMPLEXITY: O(m * n)
SPACE COMPLEXITY: O(m * n)
*/

package com.example.javas.medium;

import java.util.*;

public class M019_PacificAtlanticWaterFlow {
    
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        // TODO: Implement water flow finder
        // 1. Initialize result list and check for empty grid
        // 2. Create two boolean arrays: pacific and atlantic
        // 3. DFS from Pacific edges (top row and left column)
        // 4. DFS from Atlantic edges (bottom row and right column)
        // 5. Find cells where both pacific[i][j] and atlantic[i][j] are true
        // 6. Add those coordinates to result
        
        return new ArrayList<>();
    }
    
    private static void dfs(int[][] heights, boolean[][] ocean, int i, int j) {
        // TODO: Implement DFS for ocean reachability
        // 1. Mark current cell as reachable: ocean[i][j] = true
        // 2. Check all 4 neighbors:
        //    - If neighbor in bounds, not visited, and height >= current height:
        //      - Recursively DFS on neighbor
        
    }
    
    // TEST CASES
    public static void main(String[] args) {
        int[][] heights1 = {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };
        System.out.println("Pacific Atlantic cells: " + pacificAtlantic(heights1));
        
        int[][] heights2 = {
            {1}
        };
        System.out.println("Pacific Atlantic cells (single cell): " + pacificAtlantic(heights2));
        
        int[][] heights3 = {
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
        };
        System.out.println("Pacific Atlantic cells (3x3): " + pacificAtlantic(heights3));
    }
}
