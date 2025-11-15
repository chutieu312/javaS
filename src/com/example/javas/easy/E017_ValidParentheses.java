/*
EASY PROBLEM (Simplified for 15 min):
Valid Parentheses

REQUIREMENTS:
- Given a string containing just the characters '(', ')', '{', '}', '[' and ']'
- Determine if the input string is valid
- Valid means:
  1. Open brackets must be closed by the same type of brackets
  2. Open brackets must be closed in the correct order

APPROACH:
- Use a Stack to track opening brackets
- Push opening brackets onto stack
- For closing brackets, check if they match the top of stack

DATA STRUCTURES:
- Stack<Character>: to track opening brackets

TIME COMPLEXITY: O(n) where n is string length
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.easy;

import java.util.*;

public class E017_ValidParentheses {
    
    public static boolean isValid(String s) {
        // TODO: Implement valid parentheses checker
        // 1. Create a Stack
        // 2. Loop through each character:
        //    - If opening bracket '(', '[', '{': push to stack
        //    - If closing bracket:
        //      - If stack is empty, return false (no match)
        //      - Pop from stack and check if it matches
        //      - If not matching, return false
        // 3. After loop, return true if stack is empty, false otherwise
        
        return false;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("\"()\" -> " + isValid("()"));
        System.out.println("\"()[]{}\" -> " + isValid("()[]{}"));
        System.out.println("\"(]\" -> " + isValid("(]"));
        System.out.println("\"([)]\" -> " + isValid("([)]"));
        System.out.println("\"{[]}\" -> " + isValid("{[]}"));
        System.out.println("\"((\" -> " + isValid("(("));
        System.out.println("\"))\" -> " + isValid("))"));
    }
}
