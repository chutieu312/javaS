"""
H004: Minimum Window Substring

Summary:
Find minimum window in s containing all characters from t.

Requirements:
Return shortest substring of s that contains all chars from t.

Approach:
Use sliding window with two dicts for character frequencies.

Data Structures:
- dict[str, int]: frequency maps for t and window
- Two pointers for sliding window

Big O Analysis:
Time Complexity: O(m + n) where m=len(s), n=len(t)
Space Complexity: O(m + n)
"""

from collections import Counter


def min_window(s: str, t: str) -> str:
    """
    TODO: Find minimum window substring
    1. Create frequency map for t
    2. Initialize window map, left=0, min_len, min_start
    3. Track required chars and have chars
    4. Expand with right pointer:
       - Add char to window
       - If frequency matches, increment have
    5. When have == required, shrink with left:
       - Update minimum if smaller
       - Remove chars from left
    6. Return substring or ""
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic case")
    print(f"s='ADOBECODEBANC', t='ABC': '{min_window('ADOBECODEBANC', 'ABC')}'")  # Expected: BANC
    
    print("\nTest 2: Exact match")
    print(f"s='a', t='a': '{min_window('a', 'a')}'")  # Expected: a
    
    print("\nTest 3: No solution")
    print(f"s='a', t='aa': '{min_window('a', 'aa')}'")  # Expected: ""
    
    print("\nTest 4: Single char window")
    print(f"s='ab', t='b': '{min_window('ab', 'b')}'")  # Expected: b
    
    print("\nTest 5: Multiple valid windows")
    print(f"s='cabwefgewcwaefgcf', t='cae': '{min_window('cabwefgewcwaefgcf', 'cae')}'")  # Expected: cwae or similar
