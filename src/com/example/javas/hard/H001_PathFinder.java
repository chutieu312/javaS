package com.example.javas.hard;

public class H001_PathFinder {
    private static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public static void main(String[] args) {
        int[][] maze = {
            {0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 1, 0}
        };
        
        boolean pathExists = findPath(maze, 0, 0, 4, 4);
        System.out.println("Path exists: " + pathExists);
    }
    
    public static boolean findPath(int[][] maze, int startX, int startY, int endX, int endY) {
        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        return dfs(maze, startX, startY, endX, endY, visited);
    }
    
    private static boolean dfs(int[][] maze, int x, int y, int endX, int endY, boolean[][] visited) {
        if (x == endX && y == endY) {
            return true;
        }
        
        visited[x][y] = true;
        
        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];
            
            if (isValid(maze, newX, newY, visited)) {
                if (dfs(maze, newX, newY, endX, endY, visited)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private static boolean isValid(int[][] maze, int x, int y, boolean[][] visited) {
        return x >= 0 && x < maze.length && 
               y >= 0 && y < maze[0].length && 
               maze[x][y] == 0 && !visited[x][y];
    }
}