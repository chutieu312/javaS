"""
H003: Median of Two Sorted Arrays

Summary:
Find median of two sorted arrays without merging.

Requirements:
Given two sorted arrays, find median efficiently.

Approach (Simplified):
Merge arrays using two pointers, then find median.
For optimal O(log(min(m,n))), use binary search (advanced).

Data Structures:
- List for merged array

Big O Analysis:
Time Complexity: O(m + n) for merge approach
Space Complexity: O(m + n)
"""


def find_median(arr1: list[int], arr2: list[int]) -> float:
    """
    TODO: Find median of two sorted arrays
    1. Merge arrays using two pointers
    2. Calculate median:
       - If odd length: middle element
       - If even length: average of two middle elements
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Odd total length")
    arr1 = [1, 3]
    arr2 = [2]
    print(f"Median of {arr1} and {arr2}: {find_median(arr1, arr2)}")  # Expected: 2.0
    
    print("\nTest 2: Even total length")
    arr3 = [1, 2]
    arr4 = [3, 4]
    print(f"Median of {arr3} and {arr4}: {find_median(arr3, arr4)}")  # Expected: 2.5
    
    print("\nTest 3: Same elements")
    arr5 = [0, 0]
    arr6 = [0, 0]
    print(f"Median of {arr5} and {arr6}: {find_median(arr5, arr6)}")  # Expected: 0.0
    
    print("\nTest 4: One empty array")
    arr7 = []
    arr8 = [1]
    print(f"Median of {arr7} and {arr8}: {find_median(arr7, arr8)}")  # Expected: 1.0
    
    print("\nTest 5: Other empty array")
    arr9 = [2]
    arr10 = []
    print(f"Median of {arr9} and {arr10}: {find_median(arr9, arr10)}")  # Expected: 2.0
    
    print("\nTest 6: Different lengths")
    arr11 = [1, 2, 3, 4, 5]
    arr12 = [6, 7, 8]
    print(f"Median of {arr11} and {arr12}: {find_median(arr11, arr12)}")  # Expected: 4.5
