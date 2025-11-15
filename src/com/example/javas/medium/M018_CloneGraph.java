/*
MEDIUM PROBLEM (Simplified for 25 min):
Clone Graph (Deep Copy of Graph)

REQUIREMENTS:
- Given a reference to a node in a connected undirected graph
- Return a deep copy (clone) of the graph
- Each node contains a value and a list of neighbors

APPROACH:
- Use DFS with HashMap to track cloned nodes
- HashMap maps original node -> cloned node
- Recursively clone all neighbors

DATA STRUCTURES:
- HashMap<Node, Node>: original -> clone mapping
- Node class with val and neighbors list

TIME COMPLEXITY: O(V + E) where V = nodes, E = edges
SPACE COMPLEXITY: O(V)
*/

package com.example.javas.medium;

import java.util.*;

public class M018_CloneGraph {
    
    // Node definition
    static class Node {
        public int val;
        public List<Node> neighbors;
        
        public Node(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }
    }
    
    public static Node cloneGraph(Node node) {
        // TODO: Implement graph cloning
        // 1. If node is null, return null
        // 2. Create HashMap for tracking cloned nodes
        // 3. Call helper DFS function
        
        return null;
    }
    
    private static Node clone(Node node, HashMap<Node, Node> visited) {
        // TODO: Implement recursive clone helper
        // 1. If node already in visited map, return cloned node
        // 2. Create new node with same value
        // 3. Add to visited map
        // 4. For each neighbor:
        //    - Recursively clone neighbor
        //    - Add cloned neighbor to new node's neighbors list
        // 5. Return new node
        
        return null;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Graph 1: 1--2
        //          |  |
        //          4--3
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        
        Node cloned1 = cloneGraph(node1);
        System.out.println("Cloned graph 1, node value: " + (cloned1 != null ? cloned1.val : "null"));
        System.out.println("Is different object: " + (cloned1 != node1));
        System.out.println("Has same neighbors count: " + (cloned1 != null && cloned1.neighbors.size() == 2));
        
        // Graph 2: single node
        Node single = new Node(1);
        Node clonedSingle = cloneGraph(single);
        System.out.println("\nCloned single node: " + (clonedSingle != null ? clonedSingle.val : "null"));
        
        // Graph 3: null
        Node clonedNull = cloneGraph(null);
        System.out.println("Cloned null: " + (clonedNull == null ? "null" : "not null"));
    }
}
