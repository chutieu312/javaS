package com.example.javas.medium;

import java.util.*;

/**
 * M025: Design Moving Average from Data Stream
 * Difficulty: Medium (System Design)
 * Time Target: 25 minutes
 * 
 * Problem:
 * Given a stream of integers and a window size, calculate the moving average of all 
 * integers in the sliding window.
 * 
 * Requirements:
 * Implement the MovingAverage class:
 * - MovingAverage(int size) Initializes the object with the size of the window
 * - double next(int val) Returns the moving average of the last size values in the stream
 * 
 * Constraints:
 * - 1 <= size <= 1000
 * - -10^5 <= val <= 10^5
 * - At most 10^4 calls will be made to next
 * 
 * Examples:
 * MovingAverage movingAverage = new MovingAverage(3);
 * movingAverage.next(1);  // return 1.0 = 1 / 1
 * movingAverage.next(10); // return 5.5 = (1 + 10) / 2
 * movingAverage.next(3);  // return 4.66667 = (1 + 10 + 3) / 3
 * movingAverage.next(5);  // return 6.0 = (10 + 3 + 5) / 3 (window slides, 1 is removed)
 * 
 * Example 2:
 * MovingAverage ma = new MovingAverage(2);
 * ma.next(1);  // return 1.0
 * ma.next(3);  // return 2.0 = (1 + 3) / 2
 * ma.next(5);  // return 4.0 = (3 + 5) / 2 (window slides)
 * ma.next(7);  // return 6.0 = (5 + 7) / 2
 * 
 * Approach:
 * Use a Queue to maintain the sliding window of values:
 * 1. Keep a queue of at most 'size' elements
 * 2. Keep a running sum for efficiency
 * 3. When adding a new value:
 *    - If queue is full (size reached), remove oldest value and subtract from sum
 *    - Add new value to queue and add to sum
 *    - Return sum / current queue size
 * 
 * Alternative approach:
 * - Use circular array/buffer for better memory efficiency
 * - Keep sum and count variables
 * 
 * Data Structures:
 * - Queue to store values in the window
 * - Double variable to track sum
 * - Int variable to track window size
 * 
 * Time Complexity: O(1) for next operation
 * Space Complexity: O(size) for the queue
 */
public class M025_MovingAverage {
    
    static class MovingAverage {
        
        // TODO: Declare necessary variables
        // - Queue to store values in the window
        // - Integer for window size limit
        // - Double for running sum
        
        public MovingAverage(int size) {
            // TODO: Initialize the data structures
            // - Create new queue
            // - Store the size limit
            // - Initialize sum to 0
        }
        
        public double next(int val) {
            // TODO: Add new value and calculate moving average
            // 1. If queue size equals window size limit:
            //    - Remove oldest value from queue
            //    - Subtract removed value from sum
            // 2. Add new value to queue
            // 3. Add new value to sum
            // 4. Calculate and return average (sum / queue size)
            
            return 0.0;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic functionality
        System.out.println("Test 1: Window size 3");
        MovingAverage ma1 = new MovingAverage(3);
        System.out.println(ma1.next(1));  // Expected: 1.0
        System.out.println(ma1.next(10)); // Expected: 5.5
        System.out.println(ma1.next(3));  // Expected: 4.666...
        System.out.println(ma1.next(5));  // Expected: 6.0
        
        // Test case 2: Window size 2
        System.out.println("\nTest 2: Window size 2");
        MovingAverage ma2 = new MovingAverage(2);
        System.out.println(ma2.next(1));  // Expected: 1.0
        System.out.println(ma2.next(3));  // Expected: 2.0
        System.out.println(ma2.next(5));  // Expected: 4.0
        System.out.println(ma2.next(7));  // Expected: 6.0
        
        // Test case 3: Window size 1
        System.out.println("\nTest 3: Window size 1");
        MovingAverage ma3 = new MovingAverage(1);
        System.out.println(ma3.next(5));   // Expected: 5.0
        System.out.println(ma3.next(10));  // Expected: 10.0
        System.out.println(ma3.next(15));  // Expected: 15.0
        
        // Test case 4: Negative numbers
        System.out.println("\nTest 4: Negative numbers");
        MovingAverage ma4 = new MovingAverage(3);
        System.out.println(ma4.next(-1));  // Expected: -1.0
        System.out.println(ma4.next(2));   // Expected: 0.5
        System.out.println(ma4.next(-3));  // Expected: -0.666...
        System.out.println(ma4.next(4));   // Expected: 1.0
        
        // Test case 5: Large window
        System.out.println("\nTest 5: Window size 5");
        MovingAverage ma5 = new MovingAverage(5);
        System.out.println(ma5.next(1));   // Expected: 1.0
        System.out.println(ma5.next(2));   // Expected: 1.5
        System.out.println(ma5.next(3));   // Expected: 2.0
        System.out.println(ma5.next(4));   // Expected: 2.5
        System.out.println(ma5.next(5));   // Expected: 3.0
        System.out.println(ma5.next(6));   // Expected: 4.0 (1 removed)
    }
}
