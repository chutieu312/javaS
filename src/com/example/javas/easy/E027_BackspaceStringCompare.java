/*
EASY PROBLEM (Simplified for 15 min):
Backspace String Compare

REQUIREMENTS:
- Given two strings s and t containing lowercase letters and '#' characters
- '#' means a backspace character
- Return true if they are equal after processing backspaces

APPROACH:
- Use stack to process each string (simulating backspace)
- Push characters, pop when encountering '#'
- Compare final results

DATA STRUCTURES:
- Stack<Character>: to process backspaces

TIME COMPLEXITY: O(n + m) where n, m are string lengths
SPACE COMPLEXITY: O(n + m)
*/

package com.example.javas.easy;

import java.util.*;

public class E027_BackspaceStringCompare {
    
    public static boolean backspaceCompare(String s, String t) {
        // TODO: Implement backspace string compare
        // 1. Process both strings with helper function
        // 2. Compare the results using .equals()
        
        return false;
    }
    
    private static String processString(String str) {
        // TODO: Implement string processor with stack
        // 1. Create Stack<Character>
        // 2. For each char in string:
        //    - If char is '#':
        //      - If stack not empty, pop
        //    - Otherwise: push char to stack
        // 3. Build string from stack and return
        
        return "";
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("\"ab#c\" vs \"ad#c\": " + backspaceCompare("ab#c", "ad#c")); // true
        System.out.println("\"ab##\" vs \"c#d#\": " + backspaceCompare("ab##", "c#d#")); // true
        System.out.println("\"a#c\" vs \"b\": " + backspaceCompare("a#c", "b")); // false
        System.out.println("\"a##c\" vs \"#a#c\": " + backspaceCompare("a##c", "#a#c")); // true
        System.out.println("\"abc\" vs \"abc\": " + backspaceCompare("abc", "abc")); // true
    }
}
