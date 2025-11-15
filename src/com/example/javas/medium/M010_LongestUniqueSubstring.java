/*
MEDIUM PROBLEM (Simplified for 25 min):
Find the longest substring without repeating characters

REQUIREMENTS:
- Given a string, find the length of the longest substring without repeating characters
- Return the length (not the substring itself)

APPROACH:
- Use sliding window technique with HashSet
- Expand window by adding characters
- Shrink window when duplicate found

DATA STRUCTURES:
- HashSet<Character>: to track characters in current window

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(min(n, m)) where m is character set size
*/

package com.example.javas.medium;

import java.util.*;

public class M010_LongestUniqueSubstring {
    
    public static int longestUniqueSubstring(String s) {
        // TODO: Implement sliding window
        // 1. Create HashSet and initialize maxLength = 0, left = 0
        // 2. Loop with right pointer from 0 to s.length():
        //    - While s.charAt(right) is in set:
        //      - Remove s.charAt(left) from set
        //      - Increment left
        //    - Add s.charAt(right) to set
        //    - Update maxLength = Math.max(maxLength, right - left + 1)
        // 3. Return maxLength
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("\"abcabcbb\" -> " + longestUniqueSubstring("abcabcbb"));
        System.out.println("\"bbbbb\" -> " + longestUniqueSubstring("bbbbb"));
        System.out.println("\"pwwkew\" -> " + longestUniqueSubstring("pwwkew"));
        System.out.println("\"\" -> " + longestUniqueSubstring(""));
        System.out.println("\"abcdef\" -> " + longestUniqueSubstring("abcdef"));
    }
}
