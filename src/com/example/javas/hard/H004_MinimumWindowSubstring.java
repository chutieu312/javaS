/*
HARD PROBLEM (Simplified for 25 min):
Minimum Window Substring

REQUIREMENTS:
- Given string s and string t, find the minimum window in s that contains all characters from t
- Return the minimum window substring, or "" if no such window exists
- If multiple windows exist, return any one

APPROACH:
- Use sliding window with two HashMaps
- Expand window to include all characters from t
- Shrink window to find minimum length

DATA STRUCTURES:
- HashMap<Character, Integer>: frequency maps for t and current window

TIME COMPLEXITY: O(m + n) where m = s.length, n = t.length
SPACE COMPLEXITY: O(m + n)
*/

package com.example.javas.hard;

import java.util.*;

public class H004_MinimumWindowSubstring {
    
    public static String minWindow(String s, String t) {
        // TODO: Implement minimum window finder
        // 1. Create frequency map for t
        // 2. Initialize window map, left = 0, minLen = Integer.MAX_VALUE, minStart = 0
        // 3. Track how many unique chars from t are satisfied (have)
        // 4. Expand with right pointer:
        //    - Add char to window map
        //    - If char frequency matches t, increment have
        // 5. When have == need, shrink with left pointer:
        //    - Update minimum window if smaller
        //    - Remove char from window, decrement have if needed
        // 6. Return substring or ""
        
        return "";
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("s=\"ADOBECODEBANC\", t=\"ABC\" -> \"" + minWindow("ADOBECODEBANC", "ABC") + "\"");
        System.out.println("s=\"a\", t=\"a\" -> \"" + minWindow("a", "a") + "\"");
        System.out.println("s=\"a\", t=\"aa\" -> \"" + minWindow("a", "aa") + "\"");
        System.out.println("s=\"ab\", t=\"b\" -> \"" + minWindow("ab", "b") + "\"");
    }
}
