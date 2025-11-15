/*
MEDIUM PROBLEM (Simplified for 25 min):
Rotate an array to the right by k positions

REQUIREMENTS:
- Rotate array to the right by k positions
- Modify array in-place
- Handle k larger than array length

APPROACH:
- Use array reversal trick:
  1. Reverse entire array
  2. Reverse first k elements
  3. Reverse remaining elements

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.medium;

import java.util.Arrays;

public class M009_RotateArray {
    
    public static void rotate(int[] arr, int k) {
        // TODO: Implement array rotation
        // 1. Handle k > arr.length: k = k % arr.length
        // 2. Reverse entire array: reverse(arr, 0, arr.length - 1)
        // 3. Reverse first k elements: reverse(arr, 0, k - 1)
        // 4. Reverse remaining elements: reverse(arr, k, arr.length - 1)
        
    }
    
    // Helper: reverse array from index start to end
    private static void reverse(int[] arr, int start, int end) {
        // TODO: Implement reversal
        // Use two pointers to swap elements
        
    }
    
    // TEST CASES
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rotate(arr1, 2);
        System.out.println("Rotate [1,2,3,4,5] by 2: " + Arrays.toString(arr1));
        
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr2, 3);
        System.out.println("Rotate [1,2,3,4,5,6,7] by 3: " + Arrays.toString(arr2));
        
        int[] arr3 = {1, 2};
        rotate(arr3, 5);
        System.out.println("Rotate [1,2] by 5: " + Arrays.toString(arr3));
        
        int[] arr4 = {1, 2, 3};
        rotate(arr4, 0);
        System.out.println("Rotate [1,2,3] by 0: " + Arrays.toString(arr4));
    }
}
