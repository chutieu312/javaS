/*
EASY PROBLEM (Simplified for 15 min):
Implement Queue using Stacks

REQUIREMENTS:
- Implement a first in first out (FIFO) queue using only two stacks
- Implement MyQueue class with:
  - push(x): Push element x to the back of queue
  - pop(): Remove element from front of queue and return it
  - peek(): Get the front element
  - empty(): Return whether the queue is empty

APPROACH:
- Use two stacks: input stack and output stack
- Push operations go to input stack
- Pop/peek operations use output stack (transfer if needed)

DATA STRUCTURES:
- Stack<Integer>: input stack
- Stack<Integer>: output stack

TIME COMPLEXITY: 
- push: O(1)
- pop/peek: O(1) amortized
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.easy;

import java.util.*;

public class E028_QueueUsingStacks {
    
    static class MyQueue {
        private Stack<Integer> inputStack;
        private Stack<Integer> outputStack;
        
        public MyQueue() {
            // TODO: Initialize both stacks
            
        }
        
        public void push(int x) {
            // TODO: Implement push
            // Simply push to inputStack
            
        }
        
        public int pop() {
            // TODO: Implement pop
            // 1. Call peek() to ensure outputStack has elements
            // 2. Pop and return from outputStack
            
            return 0;
        }
        
        public int peek() {
            // TODO: Implement peek
            // 1. If outputStack is empty:
            //    - Transfer all elements from inputStack to outputStack
            // 2. Return top of outputStack (without removing)
            
            return 0;
        }
        
        public boolean empty() {
            // TODO: Check if both stacks are empty
            
            return false;
        }
    }
    
    // TEST CASES
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        
        queue.push(1);
        queue.push(2);
        System.out.println("Peek: " + queue.peek());  // 1
        System.out.println("Pop: " + queue.pop());    // 1
        System.out.println("Empty: " + queue.empty()); // false
        System.out.println("Peek: " + queue.peek());  // 2
        
        System.out.println();
        
        MyQueue queue2 = new MyQueue();
        queue2.push(1);
        queue2.push(2);
        queue2.push(3);
        System.out.println("Pop: " + queue2.pop());   // 1
        queue2.push(4);
        System.out.println("Pop: " + queue2.pop());   // 2
        System.out.println("Pop: " + queue2.pop());   // 3
        System.out.println("Pop: " + queue2.pop());   // 4
        System.out.println("Empty: " + queue2.empty()); // true
    }
}
