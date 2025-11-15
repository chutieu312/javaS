/*
EASY PROBLEM (Simplified for 15 min):
Count the number of vowels in a string

REQUIREMENTS:
- Count vowels (a, e, i, o, u) in a given string
- Case-insensitive (both 'A' and 'a' count as vowels)

APPROACH:
- Loop through each character in the string
- Check if it's a vowel (ignoring case)
- Increment counter if it is

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

public class E008_CountVowels {
    
    public static int countVowels(String s) {
        // TODO: Implement vowel counter
        // 1. Initialize count = 0
        // 2. Loop through each character
        // 3. Convert to lowercase and check if it's a vowel
        // 4. Increment count if vowel found
        // 5. Return count
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("\"hello\" -> " + countVowels("hello"));
        System.out.println("\"AEIOU\" -> " + countVowels("AEIOU"));
        System.out.println("\"Java Programming\" -> " + countVowels("Java Programming"));
        System.out.println("\"xyz\" -> " + countVowels("xyz"));
        System.out.println("\"\" -> " + countVowels(""));
    }
}
