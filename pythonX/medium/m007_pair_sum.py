"""
M007: Find Pairs with Target Sum

Summary:
Find all unique pairs in array that sum to target value.

Requirements:
Given an array and target, return all unique pairs that sum to target.

Approach:
Use set to track seen numbers, another set to avoid duplicate pairs.

Data Structures:
- set[int]: seen numbers
- set[str]: added pairs (to avoid duplicates)
- list[tuple[int, int]]: result pairs

Big O Analysis:
Time Complexity: O(n)
Space Complexity: O(n)
"""


def find_pairs(arr: list[int], target: int) -> list[list[int]]:
    """
    TODO: Find all pairs that sum to target
    1. Create result list, seen set, pairs set
    2. Loop through array:
       - Calculate complement = target - current
       - If complement in seen and pair not added:
         - Add pair to result
         - Mark pair as added (use sorted tuple as key)
       - Add current to seen
    3. Return result
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Multiple pairs")
    arr1 = [2, 7, 11, 15, 3]
    result1 = find_pairs(arr1, 9)
    print(f"Array [2,7,11,15,3], target 9: {result1}")  # Expected: [[2,7]]
    
    print("\nTest 2: Duplicate values")
    arr2 = [1, 5, 7, -1, 5]
    result2 = find_pairs(arr2, 6)
    print(f"Array [1,5,7,-1,5], target 6: {result2}")  # Expected: [[1,5], [7,-1]]
    
    print("\nTest 3: No pairs")
    arr3 = [1, 2, 3, 4]
    result3 = find_pairs(arr3, 10)
    print(f"Array [1,2,3,4], target 10: {result3}")    # Expected: []
