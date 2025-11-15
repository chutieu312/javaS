/*
MEDIUM PROBLEM (Simplified for 25 min):
Course Schedule (Detect Cycle in Directed Graph)

REQUIREMENTS:
- Given numCourses and list of prerequisite pairs [a, b] (must take b before a)
- Determine if you can finish all courses
- Return true if possible, false if there's a circular dependency

APPROACH:
- Build adjacency list graph from prerequisites
- Use DFS with state tracking to detect cycles
- States: unvisited (0), visiting (1), visited (2)

DATA STRUCTURES:
- List<List<Integer>>: adjacency list for graph
- int[]: state array for each node

TIME COMPLEXITY: O(V + E) where V = courses, E = prerequisites
SPACE COMPLEXITY: O(V + E)
*/

package com.example.javas.medium;

import java.util.*;

public class M017_CourseSchedule {
    
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // TODO: Implement course schedule checker
        // 1. Build adjacency list graph
        // 2. Create state array (0 = unvisited, 1 = visiting, 2 = visited)
        // 3. For each course, if unvisited:
        //    - Run DFS to check for cycle
        //    - If cycle found, return false
        // 4. Return true if no cycles
        
        return false;
    }
    
    private static boolean hasCycle(int course, List<List<Integer>> graph, int[] state) {
        // TODO: Implement cycle detection DFS
        // 1. If state[course] == 1 (visiting), cycle detected, return true
        // 2. If state[course] == 2 (visited), already processed, return false
        // 3. Mark state[course] = 1 (visiting)
        // 4. For each neighbor in graph.get(course):
        //    - If hasCycle(neighbor, graph, state), return true
        // 5. Mark state[course] = 2 (visited)
        // 6. Return false (no cycle)
        
        return false;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Test 1: 2 courses, [1,0] - need course 0 before 1
        int[][] prereq1 = {{1, 0}};
        System.out.println("Can finish 2 courses with prereq [[1,0]]: " + canFinish(2, prereq1));
        
        // Test 2: 2 courses, [1,0],[0,1] - circular dependency
        int[][] prereq2 = {{1, 0}, {0, 1}};
        System.out.println("Can finish 2 courses with prereq [[1,0],[0,1]]: " + canFinish(2, prereq2));
        
        // Test 3: 4 courses, linear dependency
        int[][] prereq3 = {{1, 0}, {2, 1}, {3, 2}};
        System.out.println("Can finish 4 courses with prereq [[1,0],[2,1],[3,2]]: " + canFinish(4, prereq3));
        
        // Test 4: No prerequisites
        int[][] prereq4 = {};
        System.out.println("Can finish 3 courses with no prereq: " + canFinish(3, prereq4));
    }
}
