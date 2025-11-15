"""
M009: Rotate Array

Summary:
Rotate an array to the right by k positions.

Requirements:
Rotate array in-place, handle k larger than array length.

Approach:
Use array reversal trick:
1. Reverse entire array
2. Reverse first k elements
3. Reverse remaining elements

Data Structures:
- list[int]: array to rotate

Big O Analysis:
Time Complexity: O(n)
Space Complexity: O(1) - in-place
"""


def rotate(arr: list[int], k: int) -> None:
    """
    TODO: Rotate array to the right by k positions
    1. Handle k > len(arr): k = k % len(arr)
    2. Reverse entire array
    3. Reverse first k elements
    4. Reverse remaining elements
    """
    pass


def reverse(arr: list[int], start: int, end: int) -> None:
    """
    TODO: Reverse array from start to end (inclusive)
    Use two pointers to swap elements
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic rotation")
    arr1 = [1, 2, 3, 4, 5]
    rotate(arr1, 2)
    print(f"Rotate [1,2,3,4,5] by 2: {arr1}")    # Expected: [4,5,1,2,3]
    
    print("\nTest 2: Larger rotation")
    arr2 = [1, 2, 3, 4, 5, 6, 7]
    rotate(arr2, 3)
    print(f"Rotate [1,2,3,4,5,6,7] by 3: {arr2}")  # Expected: [5,6,7,1,2,3,4]
    
    print("\nTest 3: k > array length")
    arr3 = [1, 2]
    rotate(arr3, 5)
    print(f"Rotate [1,2] by 5: {arr3}")          # Expected: [2,1]
    
    print("\nTest 4: k = 0")
    arr4 = [1, 2, 3]
    rotate(arr4, 0)
    print(f"Rotate [1,2,3] by 0: {arr4}")        # Expected: [1,2,3]
