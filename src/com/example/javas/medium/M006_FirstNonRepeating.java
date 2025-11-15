/*
MEDIUM PROBLEM (Simplified for 25 min):
Find the first non-repeating character in a string

REQUIREMENTS:
- Return the first character that appears only once
- Return '\0' (null character) if no such character exists
- Case-sensitive

APPROACH:
- Use HashMap to count frequency of each character
- Loop through string again to find first character with count = 1

DATA STRUCTURES:
- HashMap<Character, Integer>: character -> frequency count

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.medium;

import java.util.*;

public class M006_FirstNonRepeating {
    
    public static char firstNonRepeating(String s) {
        // TODO: Implement first non-repeating character finder
        // 1. Create HashMap to store character frequencies
        // 2. First pass: count frequency of each character
        // 3. Second pass: find first character with frequency = 1
        // 4. Return that character, or '\0' if none found
        
        return '\0';
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("\"leetcode\" -> '" + firstNonRepeating("leetcode") + "'");
        System.out.println("\"loveleetcode\" -> '" + firstNonRepeating("loveleetcode") + "'");
        System.out.println("\"aabb\" -> '" + firstNonRepeating("aabb") + "'");
        System.out.println("\"abcdef\" -> '" + firstNonRepeating("abcdef") + "'");
        System.out.println("\"\" -> '" + firstNonRepeating("") + "'");
    }
}
