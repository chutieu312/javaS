/*
EASY PROBLEM (Simplified for 15 min):
Find if Path Exists in Graph

REQUIREMENTS:
- Given n nodes (0 to n-1), list of edges, source node, and destination node
- Determine if there is a valid path from source to destination
- Graph is bidirectional (undirected)

APPROACH:
- Build adjacency list from edges
- Use DFS to check if destination is reachable from source

DATA STRUCTURES:
- List<List<Integer>>: adjacency list
- boolean[]: visited array

TIME COMPLEXITY: O(V + E) where V = nodes, E = edges
SPACE COMPLEXITY: O(V + E)
*/

package com.example.javas.easy;

import java.util.*;

public class E010_PathExistsInGraph {
    
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        // TODO: Implement path finder
        // 1. Build adjacency list graph
        // 2. Create visited array
        // 3. Call DFS from source
        // 4. Return true if destination was visited
        
        return false;
    }
    
    private static boolean dfs(List<List<Integer>> graph, boolean[] visited, int current, int destination) {
        // TODO: Implement DFS
        // 1. If current == destination, return true
        // 2. Mark current as visited
        // 3. For each neighbor of current:
        //    - If not visited and dfs(neighbor) returns true, return true
        // 4. Return false
        
        return false;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Graph: 0--1--2
        //           |
        //           3
        int[][] edges1 = {{0,1}, {1,2}, {1,3}};
        System.out.println("Path exists 0->2: " + validPath(4, edges1, 0, 2));
        System.out.println("Path exists 0->3: " + validPath(4, edges1, 0, 3));
        
        // Graph: 0--1  2--3 (disconnected)
        int[][] edges2 = {{0,1}, {2,3}};
        System.out.println("Path exists 0->3: " + validPath(4, edges2, 0, 3));
        
        // Single node
        int[][] edges3 = {};
        System.out.println("Path exists 0->0: " + validPath(1, edges3, 0, 0));
    }
}
