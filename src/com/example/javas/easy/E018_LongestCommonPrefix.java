/*
EASY PROBLEM (Simplified for 15 min):
Longest Common Prefix

REQUIREMENTS:
- Given an array of strings
- Find the longest common prefix string amongst all strings
- Return empty string "" if there is no common prefix

APPROACH:
- Use the first string as reference
- Compare each character position across all strings
- Stop when mismatch found or end of any string reached

TIME COMPLEXITY: O(n * m) where n = number of strings, m = length of shortest string
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

public class E018_LongestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        // TODO: Implement longest common prefix finder
        // 1. If array is empty, return ""
        // 2. Use first string as reference
        // 3. Loop through each character position i in reference string:
        //    - For each string in array:
        //      - If i >= string length OR char doesn't match reference[i]:
        //        - Return substring(0, i)
        // 4. Return entire reference string (all match)
        
        return "";
    }
    
    // TEST CASES
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Common prefix of [flower, flow, flight]: \"" + longestCommonPrefix(strs1) + "\"");
        
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Common prefix of [dog, racecar, car]: \"" + longestCommonPrefix(strs2) + "\"");
        
        String[] strs3 = {"interspecies", "interstellar", "interstate"};
        System.out.println("Common prefix of [interspecies, interstellar, interstate]: \"" + longestCommonPrefix(strs3) + "\"");
        
        String[] strs4 = {"a"};
        System.out.println("Common prefix of [a]: \"" + longestCommonPrefix(strs4) + "\"");
        
        String[] strs5 = {"", "b"};
        System.out.println("Common prefix of [\"\", b]: \"" + longestCommonPrefix(strs5) + "\"");
    }
}
