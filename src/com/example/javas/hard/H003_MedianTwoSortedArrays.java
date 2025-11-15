/*
HARD PROBLEM (Simplified for 25 min):
Find the median of two sorted arrays

REQUIREMENTS:
- Given two sorted arrays, find the median of the combined sorted array
- Do NOT merge the arrays explicitly (efficient solution required)
- Return median as double (average of two middle elements if even length)

APPROACH:
- Use binary search on the smaller array
- Partition both arrays such that left half has median
- Handle edge cases for empty partitions

TIME COMPLEXITY: O(log(min(m,n)))
SPACE COMPLEXITY: O(1)

NOTE: Simplified approach - merge and find median (easier for interview)
*/

package com.example.javas.hard;

public class H003_MedianTwoSortedArrays {
    
    public static double findMedian(int[] arr1, int[] arr2) {
        // TODO: Implement median finder (simplified merge approach)
        // 1. Create merged array of size arr1.length + arr2.length
        // 2. Use two pointers to merge both arrays in sorted order
        // 3. Find median:
        //    - If total length is odd: return middle element
        //    - If even: return average of two middle elements
        
        return 0.0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        System.out.println("Median of [1,3] and [2]: " + findMedian(arr1, arr2));
        
        int[] arr3 = {1, 2};
        int[] arr4 = {3, 4};
        System.out.println("Median of [1,2] and [3,4]: " + findMedian(arr3, arr4));
        
        int[] arr5 = {0, 0};
        int[] arr6 = {0, 0};
        System.out.println("Median of [0,0] and [0,0]: " + findMedian(arr5, arr6));
        
        int[] arr7 = {};
        int[] arr8 = {1};
        System.out.println("Median of [] and [1]: " + findMedian(arr7, arr8));
        
        int[] arr9 = {2};
        int[] arr10 = {};
        System.out.println("Median of [2] and []: " + findMedian(arr9, arr10));
    }
}
