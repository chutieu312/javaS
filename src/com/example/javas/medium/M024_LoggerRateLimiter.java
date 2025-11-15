package com.example.javas.medium;

import java.util.*;

/**
 * M024: Design Logger Rate Limiter
 * Difficulty: Medium (System Design)
 * Time Target: 25 minutes
 * 
 * Problem:
 * Design a logger system that receives a stream of messages along with their timestamps. 
 * Each unique message should only be printed at most every 10 seconds (i.e., a message 
 * printed at timestamp t will prevent other identical messages from being printed until 
 * timestamp t + 10).
 * 
 * All messages will come in chronological order. Several messages may arrive at the same timestamp.
 * 
 * Requirements:
 * Implement the Logger class:
 * - Logger() Initializes the logger object
 * - boolean shouldPrintMessage(int timestamp, String message)
 *   Returns true if the message should be printed in the given timestamp, otherwise false
 * 
 * Constraints:
 * - 0 <= timestamp <= 10^9
 * - Every timestamp will be in non-decreasing order (chronological order)
 * - 1 <= message.length <= 30
 * - At most 10^4 calls will be made to shouldPrintMessage
 * 
 * Examples:
 * Logger logger = new Logger();
 * 
 * logger.shouldPrintMessage(1, "foo");  // return true, print "foo" at timestamp 1
 * logger.shouldPrintMessage(2, "bar");  // return true, print "bar" at timestamp 2
 * logger.shouldPrintMessage(3, "foo");  // return false, "foo" was printed at t=1, only 2 seconds passed
 * logger.shouldPrintMessage(8, "bar");  // return false, "bar" was printed at t=2, only 6 seconds passed
 * logger.shouldPrintMessage(10, "foo"); // return false, "foo" was printed at t=1, only 9 seconds passed
 * logger.shouldPrintMessage(11, "foo"); // return true, "foo" last printed at t=1, 10 seconds passed
 * 
 * Approach:
 * Use a HashMap to track the last print timestamp for each message:
 * 1. Key: message string
 * 2. Value: last timestamp when this message was printed
 * 3. For each shouldPrintMessage call:
 *    - Check if message exists in map and if less than 10 seconds passed
 *    - If can print: update map with new timestamp and return true
 *    - If cannot print: return false
 * 
 * Follow-up (optional):
 * - What if messages can arrive out of order?
 * - How would you clean up old entries to prevent unlimited memory growth?
 * 
 * Data Structures:
 * - HashMap<String, Integer> to map message -> last print timestamp
 * 
 * Time Complexity: O(1) for shouldPrintMessage
 * Space Complexity: O(M) where M is number of unique messages
 */
public class M024_LoggerRateLimiter {
    
    static class Logger {
        
        // TODO: Declare a HashMap to store message and its last print timestamp
        
        public Logger() {
            // TODO: Initialize the HashMap
        }
        
        public boolean shouldPrintMessage(int timestamp, String message) {
            // TODO: Implement rate limiting logic
            // 1. Check if message exists in the map
            // 2. If message not in map OR (current timestamp - last timestamp) >= 10:
            //    - Update map with current timestamp
            //    - Return true (should print)
            // 3. Otherwise:
            //    - Return false (still in cooldown period)
            
            return false;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic functionality
        System.out.println("Test 1: Basic rate limiting");
        Logger logger1 = new Logger();
        System.out.println(logger1.shouldPrintMessage(1, "foo"));  // true
        System.out.println(logger1.shouldPrintMessage(2, "bar"));  // true
        System.out.println(logger1.shouldPrintMessage(3, "foo"));  // false (only 2 sec)
        System.out.println(logger1.shouldPrintMessage(8, "bar"));  // false (only 6 sec)
        System.out.println(logger1.shouldPrintMessage(10, "foo")); // false (only 9 sec)
        System.out.println(logger1.shouldPrintMessage(11, "foo")); // true (10 sec passed)
        
        // Test case 2: Multiple different messages
        System.out.println("\nTest 2: Multiple messages");
        Logger logger2 = new Logger();
        System.out.println(logger2.shouldPrintMessage(0, "a"));    // true
        System.out.println(logger2.shouldPrintMessage(0, "b"));    // true
        System.out.println(logger2.shouldPrintMessage(0, "c"));    // true
        System.out.println(logger2.shouldPrintMessage(5, "a"));    // false
        System.out.println(logger2.shouldPrintMessage(10, "a"));   // true
        System.out.println(logger2.shouldPrintMessage(10, "b"));   // true
        
        // Test case 3: Same message at exact 10 second boundary
        System.out.println("\nTest 3: Exact 10 second boundary");
        Logger logger3 = new Logger();
        System.out.println(logger3.shouldPrintMessage(5, "test"));  // true
        System.out.println(logger3.shouldPrintMessage(14, "test")); // false (only 9 sec)
        System.out.println(logger3.shouldPrintMessage(15, "test")); // true (exactly 10 sec)
        
        // Test case 4: Messages at same timestamp
        System.out.println("\nTest 4: Same timestamp");
        Logger logger4 = new Logger();
        System.out.println(logger4.shouldPrintMessage(1, "x"));  // true
        System.out.println(logger4.shouldPrintMessage(1, "x"));  // false (same time)
        System.out.println(logger4.shouldPrintMessage(1, "y"));  // true (different msg)
    }
}
