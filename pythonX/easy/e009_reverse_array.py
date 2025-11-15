"""
E009: Reverse Array

Summary:
Reverse an array in-place.

Requirements:
- Reverse the given array without creating a new array
- Modify the original array

Approach:
- Use two pointers: one at start, one at end
- Swap elements and move pointers towards center
- Stop when pointers meet

Big O Analysis:
Time Complexity: O(n)
Space Complexity: O(1)
"""

def reverse_array(arr: list[int]) -> None:
    """
    TODO: Implement array reversal
    1. Initialize left = 0, right = len(arr) - 1
    2. While left < right:
       - Swap arr[left] and arr[right]
       - Increment left, decrement right
    """
    pass


if __name__ == "__main__":
    # Test Cases
    arr1 = [1, 2, 3, 4, 5]
    reverse_array(arr1)
    print(f"Reversed [1,2,3,4,5]: {arr1}")
    
    arr2 = [10, 20]
    reverse_array(arr2)
    print(f"Reversed [10,20]: {arr2}")
    
    arr3 = [7]
    reverse_array(arr3)
    print(f"Reversed [7]: {arr3}")
    
    arr4 = [3, 6, 9, 12]
    reverse_array(arr4)
    print(f"Reversed [3,6,9,12]: {arr4}")
