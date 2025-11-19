package com.example.javas.easy;

import java.util.ArrayList;

/**
 * E035: Design HashSet
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a HashSet without using any built-in hash table libraries.
 * 
 * Requirements:
 * Implement MyHashSet class:
 * - void add(int key) Inserts the value key into the HashSet
 * - boolean contains(int key) Returns whether the value key exists in the HashSet or not
 * - void remove(int key) Removes the value key in the HashSet. If key does not exist, do nothing
 * 
 * Constraints:
 * - 0 <= key <= 10^6
 * - At most 10^4 calls will be made to add, remove, and contains
 * 
 * Examples:
 * MyHashSet myHashSet = new MyHashSet();
 * myHashSet.add(1);      // set = [1]
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(1); // return true
 * myHashSet.contains(3); // return false (not found)
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(2); // return true
 * myHashSet.remove(2);   // set = [1]
 * myHashSet.contains(2); // return false (already removed)
 * 
 * Approach:
 * Simple approach using a boolean array:
 * 1. Use a boolean array of size 10^6 + 1
 * 2. add(key): set array[key] = true
 * 3. remove(key): set array[key] = false
 * 4. contains(key): return array[key]
 * 
 * Alternative approach (more memory efficient):
 * - Use array of buckets (LinkedLists)
 * - Hash function: key % bucketSize
 * - Each bucket stores keys that hash to same value
 * 
 * Data Structures:
 * - boolean[] array (simple approach)
 * - Or ArrayList<LinkedList<Integer>> for bucket approach
 * 
 * Time Complexity: O(1) for all operations (array approach)
 * Space Complexity: O(10^6) for array approach, O(n) for bucket approach
 */
public class E035_DesignHashSet {
    
    static class MyHashSet {
        
        private static final int BUCKET_SIZE = 1000;
        private ArrayList<Integer>[] buckets;
        
        @SuppressWarnings("unchecked")
        public MyHashSet() {
            this.buckets = new ArrayList[BUCKET_SIZE];

            for (int i = 0; i < buckets.length; i++) 
                buckets[i] = new ArrayList<>();
        }

        private int hash(int key) {
            return key%BUCKET_SIZE;
        }
        
        public void add(int key) {
            int bucket = hash(key);

            if (!buckets[bucket].contains(key)) 
                buckets[bucket].add(key);
        }

        public void remove(int key) {
            buckets[hash(key)].remove(Integer.valueOf(key));
        }
        
        public boolean contains(int key) {
            return buckets[hash(key)].contains(key);
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic functionality
        System.out.println("Test 1: Basic operations");
        MyHashSet set1 = new MyHashSet();
        set1.add(1);
        set1.add(2);
        System.out.println(set1.contains(1)); // Expected: true
        System.out.println(set1.contains(3)); // Expected: false
        set1.add(2);
        System.out.println(set1.contains(2)); // Expected: true
        set1.remove(2);
        System.out.println(set1.contains(2)); // Expected: false
        
        // Test case 2: Multiple adds and removes
        System.out.println("\nTest 2: Multiple operations");
        MyHashSet set2 = new MyHashSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println(set2.contains(1)); // Expected: true
        System.out.println(set2.contains(2)); // Expected: true
        System.out.println(set2.contains(3)); // Expected: true
        set2.remove(1);
        System.out.println(set2.contains(1)); // Expected: false
        set2.remove(2);
        System.out.println(set2.contains(2)); // Expected: false
        
        // Test case 3: Remove non-existent key
        System.out.println("\nTest 3: Remove non-existent");
        MyHashSet set3 = new MyHashSet();
        set3.remove(100); // Should not crash
        System.out.println(set3.contains(100)); // Expected: false
        
        // Test case 4: Add duplicate
        System.out.println("\nTest 4: Add duplicate");
        MyHashSet set4 = new MyHashSet();
        set4.add(5);
        set4.add(5);
        set4.add(5);
        System.out.println(set4.contains(5)); // Expected: true
        set4.remove(5);
        System.out.println(set4.contains(5)); // Expected: false
        
        // Test case 5: Large keys
        System.out.println("\nTest 5: Large keys");
        MyHashSet set5 = new MyHashSet();
        set5.add(1000000);
        System.out.println(set5.contains(1000000)); // Expected: true
        set5.remove(1000000);
        System.out.println(set5.contains(1000000)); // Expected: false
    }
}
