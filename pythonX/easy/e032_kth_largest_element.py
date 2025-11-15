"""
E032: Kth Largest Element in an Array

Summary:
Kth Largest Element in an Array

Requirements:
- Given an integer array nums and an integer k, return the kth largest element
- Note that it is the kth largest element in sorted order, not the kth distinct element
- 1 <= k <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4

Approach:
Use a max-heap to keep track of the largest elements.
Add all elements to the max-heap, then pop k-1 times to get to the kth largest.

Data Structures:
- heapq: max-heap (use negative values)

Big O Analysis:
Time Complexity: O(n + k log n) where n is array length
- O(n) to add all elements to heap
- O(k log n) to pop k times

Space Complexity: O(n) for the heap
"""

import heapq


def find_kth_largest(nums: list[int], k: int) -> int:
    """
    TODO: Implement this method
    1. Create max-heap using negative values
    2. Add all elements from nums (as negative)
    3. Pop from heap k-1 times
    4. Return the negation of the top element (kth largest)
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    # Test case 1: Basic case
    nums1 = [3, 2, 1, 5, 6, 4]
    print(f"Test 1: {find_kth_largest(nums1, 2)}")  # Expected: 5
    
    # Test case 2: Duplicates
    nums2 = [3, 2, 3, 1, 2, 4, 5, 5, 6]
    print(f"Test 2: {find_kth_largest(nums2, 4)}")  # Expected: 4
    
    # Test case 3: k = 1 (largest element)
    nums3 = [7, 10, 4, 3, 20, 15]
    print(f"Test 3: {find_kth_largest(nums3, 1)}")  # Expected: 20
    
    # Test case 4: k = length (smallest element)
    nums4 = [5, 2, 8, 1, 9]
    print(f"Test 4: {find_kth_largest(nums4, 5)}")  # Expected: 1
