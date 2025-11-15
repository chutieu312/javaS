/*
EASY PROBLEM (Simplified for 15 min):
Baseball Game - Calculate Score

REQUIREMENTS:
- You're keeping score for a baseball game with special rules
- Given a list of strings ops, apply the following operations:
  - Integer (like "5" or "-2"): Record a new score of that value
  - "+": Record sum of previous two scores
  - "D": Record double of previous score
  - "C": Remove previous score (invalidate)
- Return the sum of all scores after all operations

APPROACH:
- Use a Stack to track valid scores
- Process each operation and update stack accordingly
- Sum all remaining scores in stack

DATA STRUCTURES:
- Stack<Integer>: to track scores

TIME COMPLEXITY: O(n) where n is number of operations
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.easy;

import java.util.*;

public class E026_BaseballGame {
    
    public static int calPoints(String[] operations) {
        // TODO: Implement baseball game scorer
        // 1. Create Stack<Integer>
        // 2. For each operation:
        //    - If "+": push (top + second top) to stack
        //    - If "D": push (top * 2) to stack
        //    - If "C": pop from stack
        //    - Otherwise: push Integer.parseInt(operation) to stack
        // 3. Sum all values in stack and return
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println("Operations [5,2,C,D,+]: " + calPoints(ops1)); // 30
        
        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println("Operations [5,-2,4,C,D,9,+,+]: " + calPoints(ops2)); // 27
        
        String[] ops3 = {"1", "C"};
        System.out.println("Operations [1,C]: " + calPoints(ops3)); // 0
        
        String[] ops4 = {"1"};
        System.out.println("Operations [1]: " + calPoints(ops4)); // 1
    }
}
