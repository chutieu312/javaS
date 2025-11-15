package com.example.javas.easy;

import java.util.*;

/**
 * E036: Design HashMap
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a HashMap without using any built-in hash table libraries.
 * 
 * Requirements:
 * Implement MyHashMap class:
 * - void put(int key, int value) Inserts a (key, value) pair into the HashMap. 
 *   If the key already exists, update the corresponding value
 * - int get(int key) Returns the value to which the specified key is mapped, 
 *   or -1 if this map contains no mapping for the key
 * - void remove(int key) Removes the key and its corresponding value if the map 
 *   contains the mapping for the key
 * 
 * Constraints:
 * - 0 <= key, value <= 10^6
 * - At most 10^4 calls will be made to put, get, and remove
 * 
 * Examples:
 * MyHashMap myHashMap = new MyHashMap();
 * myHashMap.put(1, 1);     // map = {1=1}
 * myHashMap.put(2, 2);     // map = {1=1, 2=2}
 * myHashMap.get(1);        // return 1
 * myHashMap.get(3);        // return -1 (not found)
 * myHashMap.put(2, 1);     // map = {1=1, 2=1} (update existing key)
 * myHashMap.get(2);        // return 1
 * myHashMap.remove(2);     // map = {1=1}
 * myHashMap.get(2);        // return -1
 * 
 * Approach:
 * Simple approach using two arrays:
 * 1. Use two arrays of size 10^6 + 1
 * 2. One boolean array to track if key exists
 * 3. One int array to store values
 * 4. put(key, value): set exists[key]=true, values[key]=value
 * 5. get(key): return exists[key] ? values[key] : -1
 * 6. remove(key): set exists[key]=false
 * 
 * Alternative approach (more space efficient):
 * - Use array of buckets (LinkedLists of key-value pairs)
 * - Hash function: key % bucketSize
 * - Each bucket stores entries that hash to same value
 * 
 * Data Structures:
 * - boolean[] and int[] arrays (simple approach)
 * - Or ArrayList<LinkedList<Entry>> for bucket approach
 * 
 * Time Complexity: O(1) for all operations (array approach)
 * Space Complexity: O(10^6) for array approach
 */
public class E036_DesignHashMap {
    
    static class MyHashMap {
        
        // TODO: Declare data structures
        // Simple approach:
        // - boolean array to track if key exists
        // - int array to store values
        
        public MyHashMap() {
            // TODO: Initialize the data structures
            // Create arrays of size 1000001
        }
        
        public void put(int key, int value) {
            // TODO: Insert or update key-value pair
            // 1. Mark key as existing
            // 2. Store value at key index
        }
        
        public int get(int key) {
            // TODO: Get value for key
            // 1. Check if key exists
            // 2. If yes, return value; if no, return -1
            
            return -1;
        }
        
        public void remove(int key) {
            // TODO: Remove key
            // Mark key as not existing
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic functionality
        System.out.println("Test 1: Basic operations");
        MyHashMap map1 = new MyHashMap();
        map1.put(1, 1);
        map1.put(2, 2);
        System.out.println(map1.get(1));    // Expected: 1
        System.out.println(map1.get(3));    // Expected: -1
        map1.put(2, 1);
        System.out.println(map1.get(2));    // Expected: 1
        map1.remove(2);
        System.out.println(map1.get(2));    // Expected: -1
        
        // Test case 2: Update existing key
        System.out.println("\nTest 2: Update values");
        MyHashMap map2 = new MyHashMap();
        map2.put(5, 100);
        System.out.println(map2.get(5));    // Expected: 100
        map2.put(5, 200);
        System.out.println(map2.get(5));    // Expected: 200
        map2.put(5, 300);
        System.out.println(map2.get(5));    // Expected: 300
        
        // Test case 3: Remove non-existent key
        System.out.println("\nTest 3: Remove non-existent");
        MyHashMap map3 = new MyHashMap();
        map3.remove(100); // Should not crash
        System.out.println(map3.get(100));  // Expected: -1
        
        // Test case 4: Multiple keys
        System.out.println("\nTest 4: Multiple keys");
        MyHashMap map4 = new MyHashMap();
        map4.put(1, 10);
        map4.put(2, 20);
        map4.put(3, 30);
        System.out.println(map4.get(1));    // Expected: 10
        System.out.println(map4.get(2));    // Expected: 20
        System.out.println(map4.get(3));    // Expected: 30
        map4.remove(2);
        System.out.println(map4.get(2));    // Expected: -1
        System.out.println(map4.get(1));    // Expected: 10
        System.out.println(map4.get(3));    // Expected: 30
        
        // Test case 5: Zero values
        System.out.println("\nTest 5: Zero values");
        MyHashMap map5 = new MyHashMap();
        map5.put(0, 0);
        System.out.println(map5.get(0));    // Expected: 0
        map5.put(10, 0);
        System.out.println(map5.get(10));   // Expected: 0
    }
}
