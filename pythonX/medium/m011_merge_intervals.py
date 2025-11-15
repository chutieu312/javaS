"""
M011: Merge Overlapping Intervals

Summary:
Merge all overlapping intervals.

Requirements:
Given list of intervals, merge overlapping ones.

Approach:
Sort by start time, then iterate and merge.

Data Structures:
- list[list[int]]: intervals

Big O Analysis:
Time Complexity: O(n log n) due to sorting
Space Complexity: O(n) for result
"""


def merge(intervals: list[list[int]]) -> list[list[int]]:
    """
    TODO: Merge overlapping intervals
    1. If empty, return empty list
    2. Sort intervals by start time
    3. Create result list, add first interval
    4. For each remaining interval:
       - Get last interval in result
       - If current[0] <= last[1] (overlap):
         - Merge: update last[1] = max(last[1], current[1])
       - Else: add current to result
    5. Return result
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Multiple overlaps")
    intervals1 = [[1,3], [2,6], [8,10], [15,18]]
    print(f"Merge {intervals1}:")
    print(f"  -> {merge(intervals1)}")           # Expected: [[1,6], [8,10], [15,18]]
    
    print("\nTest 2: Adjacent intervals")
    intervals2 = [[1,4], [4,5]]
    print(f"Merge {intervals2}:")
    print(f"  -> {merge(intervals2)}")           # Expected: [[1,5]]
    
    print("\nTest 3: Unsorted input")
    intervals3 = [[1,4], [0,4]]
    print(f"Merge {intervals3}:")
    print(f"  -> {merge(intervals3)}")           # Expected: [[0,4]]
