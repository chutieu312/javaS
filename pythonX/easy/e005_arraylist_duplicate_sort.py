"""
E005: ArrayList Duplicate Sort

Summary:
Given a list of integers, perform the following operations:
1. Remove all duplicate elements (keep only the first occurrence)
2. Sort the remaining elements in ascending order
3. Return the modified list

Input:
- lst: list[int] - A list of integers (may contain duplicates)
  Example: [5, 2, 8, 2, 9, 5, 3, 8]

Output:
- list[int] - A list with duplicates removed and elements sorted
  Example: [2, 3, 5, 8, 9]

Constraints:
- 0 ≤ list size ≤ 1000
- -10^6 ≤ element value ≤ 10^6

Approach:
Dict/Set + Sort:
- Use dict.fromkeys() to remove duplicates while preserving first occurrence
  (Or use set if order doesn't matter before sorting)
- Convert back to list
- Use sorted() to sort in ascending order
- Time: O(n log n), Space: O(n)

Big O Analysis:
Time Complexity: O(n log n) - dominated by sorting
Space Complexity: O(n) - for storing unique elements
"""

def solution(lst: list[int]) -> list[int]:
    """
    done: Implement the remove duplicates and sort logic
    1. Use dict.fromkeys() to remove duplicates while preserving order
    2. Convert dict keys to list
    3. Sort the list using sorted() or list.sort()
    4. Return the sorted list
    """
    return sorted(set(lst))


if __name__ == "__main__":
    # Test Case 1: Regular case with duplicates
    print("Test Case 1:")
    list1 = [5, 2, 8, 2, 9, 5, 3, 8]
    print(f"Input: {list1}")
    result1 = solution(list1.copy())
    print(f"Output: {result1}")
    print(f"Expected: [2, 3, 5, 8, 9]")
    print()
    
    # Test Case 2: All same elements
    print("Test Case 2:")
    list2 = [1, 1, 1, 1]
    print(f"Input: {list2}")
    result2 = solution(list2.copy())
    print(f"Output: {result2}")
    print(f"Expected: [1]")
    print()
    
    # Test Case 3: Empty list
    print("Test Case 3:")
    list3 = []
    print(f"Input: {list3}")
    result3 = solution(list3.copy())
    print(f"Output: {result3}")
    print(f"Expected: []")
    print()
    
    # Test Case 4: No duplicates
    print("Test Case 4:")
    list4 = [3, 1, 4, 2, 5]
    print(f"Input: {list4}")
    result4 = solution(list4.copy())
    print(f"Output: {result4}")
    print(f"Expected: [1, 2, 3, 4, 5]")
    print()
    
    # Test Case 5: Negative numbers
    print("Test Case 5:")
    list5 = [-5, 3, -5, 0, 3, -1]
    print(f"Input: {list5}")
    result5 = solution(list5.copy())
    print(f"Output: {result5}")
    print(f"Expected: [-5, -1, 0, 3]")
