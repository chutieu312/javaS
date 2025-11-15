package com.example.javas.medium;

import java.util.*;

/**
 * M023: Design Hit Counter
 * Difficulty: Medium (System Design)
 * Time Target: 25 minutes
 * 
 * Problem:
 * Design a hit counter which counts the number of hits received in the past 5 minutes (300 seconds).
 * 
 * Your system should accept a timestamp parameter (in seconds granularity), and you may 
 * assume that calls are being made to the system in chronological order (i.e., timestamp 
 * is monotonically increasing). Several hits may arrive at the same timestamp.
 * 
 * Requirements:
 * Implement the HitCounter class:
 * - HitCounter() Initializes the object
 * - void hit(int timestamp) Records a hit that happened at timestamp (in seconds)
 * - int getHits(int timestamp) Returns the number of hits in the past 5 minutes 
 *   from timestamp (i.e., past 300 seconds, including the current second)
 * 
 * Constraints:
 * - 1 <= timestamp <= 2 * 10^9
 * - All timestamps will be in chronological order
 * - At most 300 calls total to hit and getHits
 * 
 * Examples:
 * HitCounter counter = new HitCounter();
 * counter.hit(1);       // hit at timestamp 1
 * counter.hit(2);       // hit at timestamp 2
 * counter.hit(3);       // hit at timestamp 3
 * counter.getHits(4);   // get hits at timestamp 4, return 3 (hits at 1,2,3 are within 300 seconds)
 * counter.hit(300);     // hit at timestamp 300
 * counter.getHits(300); // return 4 (hits at 1,2,3,300)
 * counter.getHits(301); // return 3 (hits at 2,3,300, hit at 1 is older than 300 seconds)
 * 
 * Approach:
 * Use a Queue to store timestamps of hits:
 * 1. hit(timestamp): Add timestamp to the queue
 * 2. getHits(timestamp): 
 *    - Remove all timestamps older than (timestamp - 300) from front of queue
 *    - Return queue size (remaining hits are all within 5 minutes)
 * 
 * Alternative approach (more space efficient):
 * Use circular array with 300 buckets (one per second):
 * - Each bucket stores: timestamp and hit count for that second
 * - hit(timestamp): Update the bucket at (timestamp % 300)
 * - getHits(timestamp): Sum all valid buckets within 300 seconds
 * 
 * Data Structures:
 * - Queue<Integer> to store hit timestamps (simple approach)
 * - Alternative: int[] times and int[] hits arrays (circular buffer)
 * 
 * Time Complexity:
 * - hit(): O(1)
 * - getHits(): O(n) where n is hits in last 300 seconds (Queue approach)
 *              O(300) = O(1) (Circular array approach)
 * 
 * Space Complexity: 
 * - O(n) for Queue approach
 * - O(300) = O(1) for circular array approach
 */
public class M023_HitCounter {
    
    static class HitCounter {
        
        // TODO: Declare a Queue to store hit timestamps
        
        public HitCounter() {
            // TODO: Initialize the queue (use LinkedList implementation)
        }
        
        public void hit(int timestamp) {
            // TODO: Add the timestamp to the queue
        }
        
        public int getHits(int timestamp) {
            // TODO: Remove expired hits and count valid ones
            // 1. Calculate cutoff time (current timestamp - 300 seconds)
            // 2. Remove all timestamps from queue front that are <= cutoff time
            // 3. Return the size of remaining queue (all valid hits)
            
            return 0;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic functionality
        System.out.println("Test 1: Basic hits");
        HitCounter counter1 = new HitCounter();
        counter1.hit(1);
        counter1.hit(2);
        counter1.hit(3);
        System.out.println("Hits at t=4: " + counter1.getHits(4)); // Expected: 3
        counter1.hit(300);
        System.out.println("Hits at t=300: " + counter1.getHits(300)); // Expected: 4
        System.out.println("Hits at t=301: " + counter1.getHits(301)); // Expected: 3
        
        // Test case 2: Multiple hits at same timestamp
        System.out.println("\nTest 2: Multiple hits at same time");
        HitCounter counter2 = new HitCounter();
        counter2.hit(1);
        counter2.hit(1);
        counter2.hit(1);
        System.out.println("Hits at t=2: " + counter2.getHits(2)); // Expected: 3
        
        // Test case 3: Hits expire
        System.out.println("\nTest 3: Expiration");
        HitCounter counter3 = new HitCounter();
        counter3.hit(1);
        counter3.hit(100);
        counter3.hit(200);
        counter3.hit(300);
        System.out.println("Hits at t=300: " + counter3.getHits(300)); // Expected: 4
        System.out.println("Hits at t=301: " + counter3.getHits(301)); // Expected: 3 (1 expired)
        System.out.println("Hits at t=400: " + counter3.getHits(400)); // Expected: 2 (1,100 expired)
        System.out.println("Hits at t=500: " + counter3.getHits(500)); // Expected: 1 (200 expired)
        System.out.println("Hits at t=601: " + counter3.getHits(601)); // Expected: 0 (all expired)
    }
}
