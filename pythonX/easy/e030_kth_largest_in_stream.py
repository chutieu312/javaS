"""
E030: Kth Largest Element in a Stream

Summary:
Kth Largest Element in a Stream

Requirements:
- Design a class KthLargest to find the kth largest element in a stream
- Implement KthLargest class with:
  - KthLargest(int k, int[] nums): Initialize with k and initial numbers
  - add(int val): Add value to stream and return kth largest element

Approach:
- Use Min Heap of size k
- Keep only k largest elements in heap
- Top of heap is the kth largest

Data Structures:
- heapq: min-heap to maintain k largest elements

Big O Analysis:
Time Complexity: 
- Constructor: O(n log k)
- add: O(log k)
Space Complexity: O(k)
"""

import heapq


class KthLargest:
    
    def __init__(self, k: int, nums: list[int]):
        """
        TODO: Initialize kth largest finder
        1. Set self.k = k
        2. Create min-heap: self.min_heap = []
        3. For each num in nums, call add(num)
        """
        pass
    
    def add(self, val: int) -> int:
        """
        TODO: Implement add
        1. Add val to min_heap using heapq.heappush
        2. If len(min_heap) > k:
           - Remove smallest element: heapq.heappop(min_heap)
        3. Return top of heap: min_heap[0]
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    nums1 = [4, 5, 8, 2]
    kth_largest = KthLargest(3, nums1)
    
    print(f"add(3): {kth_largest.add(3)}")    # 4
    print(f"add(5): {kth_largest.add(5)}")    # 5
    print(f"add(10): {kth_largest.add(10)}")  # 5
    print(f"add(9): {kth_largest.add(9)}")    # 8
    print(f"add(4): {kth_largest.add(4)}")    # 8
    
    print()
    
    nums2 = [1]
    kth_largest2 = KthLargest(1, nums2)
    print(f"add(2): {kth_largest2.add(2)}")   # 2
    print(f"add(3): {kth_largest2.add(3)}")   # 3
