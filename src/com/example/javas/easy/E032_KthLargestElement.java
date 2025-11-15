package com.example.javas.easy;

import java.util.PriorityQueue;
import java.util.Collections;

/**
 * E032: Kth Largest Element in an Array
 * Difficulty: Easy
 * Time Target: 15 minutes
 * 
 * Problem:
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * Note that it is the kth largest element in sorted order, not the kth distinct element.
 * 
 * Requirements:
 * - Find the kth largest element
 * - Can you solve it without sorting?
 * - 1 <= k <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * 
 * Examples:
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * 
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 * 
 * Approach:
 * Use a max-heap (PriorityQueue with reverse order) to keep track of the largest elements.
 * Add all elements to the max-heap, then poll k-1 times to get to the kth largest.
 * 
 * Data Structures:
 * - PriorityQueue<Integer> (max-heap using Collections.reverseOrder())
 * 
 * Time Complexity: O(n + k log n) where n is array length
 * - O(n) to add all elements to heap
 * - O(k log n) to poll k times
 * 
 * Space Complexity: O(n) for the heap
 */
public class E032_KthLargestElement {
    
    // TODO: Implement this method
    public static int findKthLargest(int[] nums, int k) {
        // Your code here
        return -1;
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic case
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        System.out.println("Test 1: " + findKthLargest(nums1, 2)); // Expected: 5
        
        // Test case 2: Duplicates
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println("Test 2: " + findKthLargest(nums2, 4)); // Expected: 4
        
        // Test case 3: k = 1 (largest element)
        int[] nums3 = {7, 10, 4, 3, 20, 15};
        System.out.println("Test 3: " + findKthLargest(nums3, 1)); // Expected: 20
        
        // Test case 4: k = length (smallest element)
        int[] nums4 = {5, 2, 8, 1, 9};
        System.out.println("Test 4: " + findKthLargest(nums4, 5)); // Expected: 1
    }
}
