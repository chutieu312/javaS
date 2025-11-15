"""
E007: Find Maximum

Summary:
Find the maximum number in an array.

Requirements:
- Given an array of integers, return the maximum value
- Array will have at least one element

Approach:
- Initialize max with first element
- Loop through array and update max if larger value found

Big O Analysis:
Time Complexity: O(n)
Space Complexity: O(1)
"""

def find_max(arr: list[int]) -> int:
    """
    TODO: Implement find maximum
    1. Initialize max with first element (arr[0])
    2. Loop through array starting from index 1
    3. Update max if current element is greater
    4. Return max
    """
    pass


if __name__ == "__main__":
    # Test Cases
    print(f"Max of [3, 7, 2, 9, 1]: {find_max([3, 7, 2, 9, 1])}")
    print(f"Max of [5]: {find_max([5])}")
    print(f"Max of [-3, -7, -2, -9]: {find_max([-3, -7, -2, -9])}")
    print(f"Max of [10, 10, 10]: {find_max([10, 10, 10])}")
