/*
EASY PROBLEM (Simplified for 15 min):
Find the maximum number in an array

REQUIREMENTS:
- Given an array of integers, return the maximum value
- Array will have at least one element

APPROACH:
- Initialize max with first element
- Loop through array and update max if larger value found

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

public class E007_FindMaximum {
    
    public static int findMax(int[] arr) {
        // TODO: Implement find maximum
        // 1. Initialize max with first element (arr[0])
        // 2. Loop through array starting from index 1
        // 3. Update max if current element is greater
        // 4. Return max
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        System.out.println("Max of [3, 7, 2, 9, 1]: " + findMax(new int[]{3, 7, 2, 9, 1}));
        System.out.println("Max of [5]: " + findMax(new int[]{5}));
        System.out.println("Max of [-3, -7, -2, -9]: " + findMax(new int[]{-3, -7, -2, -9}));
        System.out.println("Max of [10, 10, 10]: " + findMax(new int[]{10, 10, 10}));
    }
}
