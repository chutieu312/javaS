/*
EASY PROBLEM (Simplified for 15 min):
Find Center of Star Graph

REQUIREMENTS:
- A star graph is a graph with one center node connected to every other node
- Given an undirected star graph with n nodes (labeled 1 to n)
- Given edges array where edges[i] = [u, v] indicates edge between u and v
- Return the center node of the star graph

APPROACH:
- The center node appears in every edge
- Check first two edges - the common node is the center

TIME COMPLEXITY: O(1)
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

public class E012_CenterOfStarGraph {
    
    public static int findCenter(int[][] edges) {
        // TODO: Implement center finder
        // 1. Compare first two edges: edges[0] and edges[1]
        // 2. Find the common node between them
        // 3. If edges[0][0] appears in edges[1], it's the center
        // 4. Otherwise, edges[0][1] is the center
        
        return -1;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Star graph: 2 is center
        //    1
        //    |
        //    2---3
        //    |
        //    4
        int[][] edges1 = {{1,2}, {2,3}, {4,2}};
        System.out.println("Center of star graph: " + findCenter(edges1));
        
        // Star graph: 1 is center
        //    2
        //    |
        //    1---3
        //    |
        //    4
        int[][] edges2 = {{1,2}, {1,3}, {1,4}};
        System.out.println("Center of star graph: " + findCenter(edges2));
        
        // Minimum star graph: 2 is center
        int[][] edges3 = {{1,2}, {2,3}};
        System.out.println("Center of star graph (min): " + findCenter(edges3));
    }
}
