package com.example.javas.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * M020: Longest Substring with At Most K Distinct Characters
 * Difficulty: Medium
 * Time Target: 25 minutes
 * 
 * Problem:
 * Given a string s and an integer k, return the length of the longest substring 
 * of s that contains at most k distinct characters.
 * 
 * Requirements:
 * - Find the longest substring with at most k distinct characters
 * - 1 <= s.length <= 5 * 10^4
 * - 0 <= k <= 50
 * - s consists of English letters
 * 
 * Examples:
 * Input: s = "eceba", k = 2
 * Output: 3
 * Explanation: The substring is "ece" with length 3
 * 
 * Input: s = "aa", k = 1
 * Output: 2
 * Explanation: The substring is "aa" with length 2
 * 
 * Input: s = "abcadcacacaca", k = 3
 * Output: 11
 * Explanation: The substring is "cadcacacaca" with length 11
 * 
 * Input: s = "a", k = 2
 * Output: 1
 * 
 * Approach:
 * Use sliding window technique with a HashMap to track character frequencies:
 * 1. Expand window by moving right pointer and adding characters
 * 2. When distinct characters exceed k, shrink window from left
 * 3. Track the maximum window size seen
 * 
 * Key insight: Use HashMap to count character frequencies in current window.
 * When a character count becomes 0, remove it from the map.
 * The map size tells us the number of distinct characters.
 * 
 * Data Structures:
 * - HashMap<Character, Integer> to track character frequencies
 * - Two pointers (left, right) for sliding window
 * 
 * Time Complexity: O(n) where n is the length of string
 * - Each character is visited at most twice (once by right, once by left)
 * 
 * Space Complexity: O(k) for the HashMap
 * - At most k distinct characters in the map
 */
public class M020_LongestSubstringKDistinct {
    
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        // TODO: Implement sliding window with HashMap
        // 1. Handle edge cases (empty string or k = 0)
        // 2. Initialize HashMap<Character, Integer> for character frequencies
        // 3. Initialize left pointer and maxLength
        // 4. Iterate with right pointer through the string:
        //    - Add current character to window (update frequency in map)
        //    - While distinct characters > k: shrink window from left
        //    - Update maxLength with current window size
        // 5. Return maxLength
        
        return -1;
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic case
        String s1 = "eceba";
        System.out.println("Test 1: " + lengthOfLongestSubstringKDistinct(s1, 2)); // Expected: 3
        
        // Test case 2: All same characters
        String s2 = "aa";
        System.out.println("Test 2: " + lengthOfLongestSubstringKDistinct(s2, 1)); // Expected: 2
        
        // Test case 3: Longer string
        String s3 = "abcadcacacaca";
        System.out.println("Test 3: " + lengthOfLongestSubstringKDistinct(s3, 3)); // Expected: 11
        
        // Test case 4: k larger than distinct characters
        String s4 = "a";
        System.out.println("Test 4: " + lengthOfLongestSubstringKDistinct(s4, 2)); // Expected: 1
        
        // Test case 5: k = 0
        String s5 = "abc";
        System.out.println("Test 5: " + lengthOfLongestSubstringKDistinct(s5, 0)); // Expected: 0
        
        // Test case 6: Complex pattern
        String s6 = "aaabbccd";
        System.out.println("Test 6: " + lengthOfLongestSubstringKDistinct(s6, 2)); // Expected: 5 ("aabbc")
    }
}
