/*
EASY PROBLEM (Simplified for 15 min):
Number of Recent Calls

REQUIREMENTS:
- Design a class RecentCounter to count recent requests
- Write RecentCounter class with ping(t) method:
  - Adds a new request at time t (in milliseconds)
  - Returns the number of requests in the past 3000 milliseconds (including current)
  - Time t is strictly increasing

APPROACH:
- Use Queue to store request timestamps
- For each ping, add new timestamp and remove old ones (older than t - 3000)
- Return queue size

DATA STRUCTURES:
- Queue<Integer>: to store request timestamps

TIME COMPLEXITY: O(1) amortized per ping
SPACE COMPLEXITY: O(W) where W is window size (3000ms)
*/

package com.example.javas.easy;

import java.util.*;

public class E029_NumberOfRecentCalls {
    
    static class RecentCounter {
        private Queue<Integer> queue;
        
        public RecentCounter() {
            // TODO: Initialize queue (use LinkedList)
            
        }
        
        public int ping(int t) {
            // TODO: Implement ping
            // 1. Add t to queue
            // 2. Remove all timestamps older than (t - 3000) from front
            // 3. Return queue size
            
            return 0;
        }
    }
    
    // TEST CASES
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        
        System.out.println("ping(1): " + counter.ping(1));       // 1
        System.out.println("ping(100): " + counter.ping(100));   // 2
        System.out.println("ping(3001): " + counter.ping(3001)); // 3
        System.out.println("ping(3002): " + counter.ping(3002)); // 3 (1 is outside window)
        
        System.out.println();
        
        RecentCounter counter2 = new RecentCounter();
        System.out.println("ping(1): " + counter2.ping(1));      // 1
        System.out.println("ping(2000): " + counter2.ping(2000)); // 2
        System.out.println("ping(3000): " + counter2.ping(3000)); // 3
        System.out.println("ping(4000): " + counter2.ping(4000)); // 4
        System.out.println("ping(5000): " + counter2.ping(5000)); // 3 (1 is outside)
    }
}
