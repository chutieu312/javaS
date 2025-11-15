/*
EASY PROBLEM (Simplified for 15 min):
Roman to Integer

REQUIREMENTS:
- Given a Roman numeral string, convert it to an integer
- Roman numerals: I=1, V=5, X=10, L=50, C=100, D=500, M=1000
- Subtraction cases: IV=4, IX=9, XL=40, XC=90, CD=400, CM=900
- When smaller value appears before larger, subtract it

APPROACH:
- Use HashMap to map Roman characters to values
- Iterate through string, compare current with next
- If current < next, subtract; otherwise add

DATA STRUCTURES:
- HashMap<Character, Integer>: Roman char -> value mapping

TIME COMPLEXITY: O(n) where n is string length
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

import java.util.*;

public class E020_RomanToInteger {
    
    public static int romanToInt(String s) {
        // TODO: Implement Roman to Integer converter
        // 1. Create HashMap with Roman numeral mappings
        // 2. Initialize result = 0
        // 3. Loop through string (i from 0 to length-1):
        //    - Get current value from map
        //    - If i < length-1 and current < next value:
        //      - Subtract current from result
        //    - Else:
        //      - Add current to result
        // 4. Return result
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("\"III\" -> " + romanToInt("III"));
        System.out.println("\"IV\" -> " + romanToInt("IV"));
        System.out.println("\"IX\" -> " + romanToInt("IX"));
        System.out.println("\"LVIII\" -> " + romanToInt("LVIII"));
        System.out.println("\"MCMXCIV\" -> " + romanToInt("MCMXCIV"));
        System.out.println("\"CDXLIV\" -> " + romanToInt("CDXLIV"));
    }
}
