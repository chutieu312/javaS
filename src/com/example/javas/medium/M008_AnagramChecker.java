/*
MEDIUM PROBLEM (Simplified for 25 min):
Check if two strings are anagrams

REQUIREMENTS:
- Return true if two strings are anagrams (contain same characters with same frequency)
- Case-insensitive
- Ignore spaces

APPROACH:
- Clean both strings (remove spaces, convert to lowercase)
- Use HashMap to count character frequencies
- Compare the two frequency maps

DATA STRUCTURES:
- HashMap<Character, Integer>: character -> frequency count

TIME COMPLEXITY: O(n + m) where n, m are string lengths
SPACE COMPLEXITY: O(n + m)
*/

package com.example.javas.medium;

import java.util.*;

public class M008_AnagramChecker {
    
    public static boolean isAnagram(String s1, String s2) {
        // TODO: Implement anagram checker
        // 1. Clean both strings: remove spaces, convert to lowercase
        // 2. If lengths differ, return false
        // 3. Create frequency map for first string
        // 4. Create frequency map for second string
        // 5. Compare the two maps using .equals()
        
        return false;
    }
    
    // Helper: create frequency map for a string
    private static HashMap<Character, Integer> getFrequencyMap(String s) {
        // TODO: Implement frequency counter
        // 1. Create HashMap
        // 2. Loop through string
        // 3. Use getOrDefault to increment count
        // 4. Return map
        
        return new HashMap<>();
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("\"listen\" & \"silent\" -> " + isAnagram("listen", "silent"));
        System.out.println("\"hello\" & \"world\" -> " + isAnagram("hello", "world"));
        System.out.println("\"The Eyes\" & \"They See\" -> " + isAnagram("The Eyes", "They See"));
        System.out.println("\"abc\" & \"def\" -> " + isAnagram("abc", "def"));
        System.out.println("\"a\" & \"a\" -> " + isAnagram("a", "a"));
    }
}
