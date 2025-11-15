/*
EASY PROBLEM (Simplified for 15 min):
Length of Last Word

REQUIREMENTS:
- Given a string s consisting of words and spaces
- Return the length of the last word in the string
- A word is a maximal substring consisting of non-space characters only

APPROACH:
- Trim trailing spaces
- Find the last space
- Calculate length from last space to end

TIME COMPLEXITY: O(n) where n is string length
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

public class E021_LengthOfLastWord {
    
    public static int lengthOfLastWord(String s) {
        // TODO: Implement last word length finder
        // 1. Trim trailing spaces: s = s.trim()
        // 2. Find index of last space: lastSpace = s.lastIndexOf(' ')
        // 3. Return length from lastSpace + 1 to end
        //    - If no space found (lastSpace = -1), return s.length()
        //    - Otherwise, return s.length() - lastSpace - 1
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("\"Hello World\" -> " + lengthOfLastWord("Hello World"));
        System.out.println("\"   fly me   to   the moon  \" -> " + lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("\"luffy is still joyboy\" -> " + lengthOfLastWord("luffy is still joyboy"));
        System.out.println("\"a\" -> " + lengthOfLastWord("a"));
        System.out.println("\"day\" -> " + lengthOfLastWord("day"));
    }
}
