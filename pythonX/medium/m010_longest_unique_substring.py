"""
M010: Longest Substring Without Repeating Characters

Summary:
Find length of longest substring without repeating characters.

Requirements:
Return the length (not the substring itself).

Approach:
Use sliding window technique with set.

Data Structures:
- set[str]: characters in current window

Big O Analysis:
Time Complexity: O(n)
Space Complexity: O(min(n, m)) where m is character set size
"""


def longest_unique_substring(s: str) -> int:
    """
    TODO: Find longest substring without repeating chars
    1. Create set and initialize max_length = 0, left = 0
    2. Loop with right pointer:
       - While s[right] in set:
         - Remove s[left] from set
         - Increment left
       - Add s[right] to set
       - Update max_length
    3. Return max_length
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Mixed characters")
    print(f"'abcabcbb' -> {longest_unique_substring('abcabcbb')}")  # Expected: 3 (abc)
    
    print("\nTest 2: All same")
    print(f"'bbbbb' -> {longest_unique_substring('bbbbb')}")        # Expected: 1 (b)
    
    print("\nTest 3: Complex pattern")
    print(f"'pwwkew' -> {longest_unique_substring('pwwkew')}")      # Expected: 3 (wke)
    
    print("\nTest 4: Empty string")
    print(f"'' -> {longest_unique_substring('')}")                  # Expected: 0
    
    print("\nTest 5: All unique")
    print(f"'abcdef' -> {longest_unique_substring('abcdef')}")      # Expected: 6
