/*
EASY PROBLEM (Simplified for 15 min):
Check if a string is a palindrome (reads same forwards and backwards)

REQUIREMENTS:
- Return true if string is palindrome, false otherwise
- Case-sensitive, no special handling needed

APPROACH:
- Use StringBuilder to reverse the string
- Compare original with reversed

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.easy;

public class E006_PalindromeChecker {
    
    public static boolean isPalindrome(String s) {
        // DONE: Implement palindrome check
        // 1. Reverse the string using StringBuilder
        // 2. Compare original with reversed using .equals()
        
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("\"racecar\" -> " + isPalindrome("racecar"));
        System.out.println("\"hello\" -> " + isPalindrome("hello"));
        System.out.println("\"level\" -> " + isPalindrome("level"));
        System.out.println("\"abc\" -> " + isPalindrome("abc"));
    }
}
