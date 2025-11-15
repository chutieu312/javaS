/*
EASY PROBLEM (Simplified for 15 min):
Reverse an array in-place

REQUIREMENTS:
- Reverse the given array without creating a new array
- Modify the original array

APPROACH:
- Use two pointers: one at start, one at end
- Swap elements and move pointers towards center
- Stop when pointers meet

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

import java.util.Arrays;

public class E009_ReverseArray {
    
    public static void reverseArray(int[] arr) {
        // TODO: Implement array reversal
        // 1. Initialize left = 0, right = arr.length - 1
        // 2. While left < right:
        //    - Swap arr[left] and arr[right]
        //    - Increment left, decrement right
        
    }
    
    // TEST CASES
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        reverseArray(arr1);
        System.out.println("Reversed [1,2,3,4,5]: " + Arrays.toString(arr1));
        
        int[] arr2 = {10, 20};
        reverseArray(arr2);
        System.out.println("Reversed [10,20]: " + Arrays.toString(arr2));
        
        int[] arr3 = {7};
        reverseArray(arr3);
        System.out.println("Reversed [7]: " + Arrays.toString(arr3));
        
        int[] arr4 = {3, 6, 9, 12};
        reverseArray(arr4);
        System.out.println("Reversed [3,6,9,12]: " + Arrays.toString(arr4));
    }
}
