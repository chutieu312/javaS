/*
EASY PROBLEM (Simplified for 15 min):
Min Stack - Design a Stack with Min Operation

REQUIREMENTS:
- Design a stack that supports push, pop, top, and retrieving the minimum element
- All operations must run in O(1) time
- Implement MinStack class with:
  - push(val): Push element val onto stack
  - pop(): Remove the element on top of the stack
  - top(): Get the top element
  - getMin(): Retrieve the minimum element in the stack

APPROACH:
- Use two stacks: one for values, one for minimums
- Track minimum at each level

DATA STRUCTURES:
- Stack<Integer>: main stack for values
- Stack<Integer>: auxiliary stack for minimums

TIME COMPLEXITY: O(1) for all operations
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.easy;

import java.util.*;

public class E025_MinStack {
    
    static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;
        
        public MinStack() {
            // TODO: Initialize both stacks
            
        }
        
        public void push(int val) {
            // TODO: Implement push
            // 1. Push val to main stack
            // 2. If minStack is empty or val <= current min:
            //    - Push val to minStack
            
        }
        
        public void pop() {
            // TODO: Implement pop
            // 1. Pop from main stack
            // 2. If popped value equals top of minStack:
            //    - Pop from minStack too
            
        }
        
        public int top() {
            // TODO: Return top element from main stack
            
            return 0;
        }
        
        public int getMin() {
            // TODO: Return top element from minStack
            
            return 0;
        }
    }
    
    // TEST CASES
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Get min: " + minStack.getMin());  // -3
        
        minStack.pop();
        System.out.println("Top: " + minStack.top());         // 0
        System.out.println("Get min: " + minStack.getMin());  // -2
        
        System.out.println();
        
        MinStack minStack2 = new MinStack();
        minStack2.push(1);
        minStack2.push(2);
        minStack2.push(-1);
        System.out.println("Get min: " + minStack2.getMin()); // -1
        minStack2.pop();
        System.out.println("Get min: " + minStack2.getMin()); // 1
    }
}
