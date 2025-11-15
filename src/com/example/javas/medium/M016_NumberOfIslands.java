/*
MEDIUM PROBLEM (Simplified for 25 min):
Number of Islands (Graph/Matrix DFS)

REQUIREMENTS:
- Given a 2D grid of '1's (land) and '0's (water)
- Count the number of islands
- An island is surrounded by water and formed by connecting adjacent lands horizontally or vertically

APPROACH:
- Use DFS to mark visited land cells
- Iterate through grid, when '1' is found, increment island count and DFS to mark all connected land

TIME COMPLEXITY: O(m * n) where m, n are grid dimensions
SPACE COMPLEXITY: O(m * n) for recursion stack in worst case
*/

package com.example.javas.medium;

public class M016_NumberOfIslands {
    
    public static int numIslands(char[][] grid) {
        // TODO: Implement island counter
        // 1. If grid is empty, return 0
        // 2. Initialize count = 0
        // 3. Loop through each cell (i, j):
        //    - If grid[i][j] == '1':
        //      - Increment count
        //      - Call dfs(grid, i, j) to mark entire island
        // 4. Return count
        
        return 0;
    }
    
    private static void dfs(char[][] grid, int i, int j) {
        // TODO: Implement DFS to mark island
        // 1. Check boundaries: if i or j out of bounds, return
        // 2. If grid[i][j] != '1', return (water or already visited)
        // 3. Mark current cell as visited: grid[i][j] = '0'
        // 4. Recursively visit 4 neighbors:
        //    - dfs(grid, i+1, j) // down
        //    - dfs(grid, i-1, j) // up
        //    - dfs(grid, i, j+1) // right
        //    - dfs(grid, i, j-1) // left
        
    }
    
    // TEST CASES
    public static void main(String[] args) {
        char[][] grid1 = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        System.out.println("Number of islands in grid1: " + numIslands(grid1));
        
        char[][] grid2 = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        System.out.println("Number of islands in grid2: " + numIslands(grid2));
        
        char[][] grid3 = {
            {'1','0','1','0','1'},
            {'0','1','0','1','0'},
            {'1','0','1','0','1'}
        };
        System.out.println("Number of islands in grid3: " + numIslands(grid3));
    }
}
