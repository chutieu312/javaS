package com.example.javas.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * M022: Group Anagrams
 * Difficulty: Medium
 * Time Target: 25 minutes
 * 
 * Problem:
 * Given an array of strings, group the anagrams together. You can return the answer 
 * in any order.
 * An anagram is a word or phrase formed by rearranging the letters of a different 
 * word or phrase, typically using all the original letters exactly once.
 * 
 * Requirements:
 * - Group strings that are anagrams of each other
 * - Return list of groups (each group is a list of anagrams)
 * - Order of groups and strings within groups doesn't matter
 * - 1 <= strs.length <= 10^4
 * - 0 <= strs[i].length <= 100
 * - strs[i] consists of lowercase English letters
 * 
 * Examples:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Explanation: 
 * - "eat", "tea", "ate" are anagrams
 * - "tan", "nat" are anagrams
 * - "bat" is alone
 * 
 * Input: strs = [""]
 * Output: [[""]]
 * 
 * Input: strs = ["a"]
 * Output: [["a"]]
 * 
 * Input: strs = ["abc","bca","cab","xyz","zyx","yxz"]
 * Output: [["abc","bca","cab"],["xyz","zyx","yxz"]]
 * 
 * Approach:
 * Use a HashMap where the key is a signature of the anagram group:
 * 1. For each string, create a signature (e.g., sorted characters or frequency count)
 * 2. Anagrams will have the same signature
 * 3. Group strings by their signature using HashMap
 * 4. Return all groups as a list
 * 
 * Two common signature methods:
 * - Sort characters: "eat" -> "aet", "tea" -> "aet" (same signature)
 * - Character count: "eat" -> [1,0,0,0,1,0...1] (26-length array)
 * 
 * Data Structures:
 * - HashMap<String, List<String>> to group anagrams by signature
 * - For each string, compute signature (sorted or count-based)
 * 
 * Time Complexity: O(n * k log k) where n is number of strings, k is max string length
 * - For sorting approach: O(k log k) to sort each string
 * - For count approach: O(n * k) is possible
 * 
 * Space Complexity: O(n * k) to store all strings in the map
 */
public class M022_GroupAnagrams {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        // TODO: Implement anagram grouping
        // 1. Create HashMap<String, List<String>> to map signature -> list of anagrams
        // 2. For each string in strs:
        //    a) Compute signature (sort characters or use frequency count)
        //    b) Add string to the list for that signature in the map
        //       - If signature not in map, create new ArrayList for it
        // 3. Return all values from the map as a list
        
        return new ArrayList<>();
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Multiple anagram groups
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Test 1: " + groupAnagrams(strs1));
        // Expected: [["bat"],["nat","tan"],["ate","eat","tea"]] (order may vary)
        
        // Test case 2: Empty string
        String[] strs2 = {""};
        System.out.println("Test 2: " + groupAnagrams(strs2));
        // Expected: [[""]]
        
        // Test case 3: Single string
        String[] strs3 = {"a"};
        System.out.println("Test 3: " + groupAnagrams(strs3));
        // Expected: [["a"]]
        
        // Test case 4: Two groups
        String[] strs4 = {"abc", "bca", "cab", "xyz", "zyx", "yxz"};
        System.out.println("Test 4: " + groupAnagrams(strs4));
        // Expected: [["abc","bca","cab"],["xyz","zyx","yxz"]] (order may vary)
        
        // Test case 5: All different
        String[] strs5 = {"a", "b", "c"};
        System.out.println("Test 5: " + groupAnagrams(strs5));
        // Expected: [["a"],["b"],["c"]] (order may vary)
    }
}
