/*
EASY PROBLEM (Simplified for 15 min):
Kth Largest Element in a Stream

REQUIREMENTS:
- Design a class KthLargest to find the kth largest element in a stream
- Implement KthLargest class with:
  - KthLargest(int k, int[] nums): Initialize with k and initial numbers
  - add(int val): Add value to stream and return kth largest element

APPROACH:
- Use Min Heap (PriorityQueue) of size k
- Keep only k largest elements in heap
- Top of heap is the kth largest

DATA STRUCTURES:
- PriorityQueue<Integer>: min-heap to maintain k largest elements

TIME COMPLEXITY: 
- Constructor: O(n log k)
- add: O(log k)
SPACE COMPLEXITY: O(k)
*/

package com.example.javas.easy;

import java.util.*;

public class E030_KthLargestInStream {
    
    static class KthLargest {
        private PriorityQueue<Integer> minHeap;
        private int k;
        
        public KthLargest(int k, int[] nums) {
            // TODO: Initialize kth largest finder
            // 1. Set this.k = k
            // 2. Create min-heap: minHeap = new PriorityQueue<>()
            // 3. For each num in nums, call add(num)
            
        }
        
        public int add(int val) {
            // TODO: Implement add
            // 1. Add val to minHeap
            // 2. If minHeap.size() > k:
            //    - Remove smallest element: minHeap.poll()
            // 3. Return top of heap: minHeap.peek()
            
            return 0;
        }
    }
    
    // TEST CASES
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, nums1);
        
        System.out.println("add(3): " + kthLargest.add(3));   // 4
        System.out.println("add(5): " + kthLargest.add(5));   // 5
        System.out.println("add(10): " + kthLargest.add(10)); // 5
        System.out.println("add(9): " + kthLargest.add(9));   // 8
        System.out.println("add(4): " + kthLargest.add(4));   // 8
        
        System.out.println();
        
        int[] nums2 = {1};
        KthLargest kthLargest2 = new KthLargest(1, nums2);
        System.out.println("add(2): " + kthLargest2.add(2));  // 2
        System.out.println("add(3): " + kthLargest2.add(3));  // 3
    }
}
