"""
M021: Minimum Window Subsequence

Summary:
Find shortest substring of s where t is a subsequence.

Requirements:
Find minimum window containing all characters of t in order.

Approach:
Two-pointer with forward matching and backward shrinking.

Data Structures:
- String pointers

Big O Analysis:
Time Complexity: O(s * t)
Space Complexity: O(1)
"""


def min_window(s: str, t: str) -> str:
    """
    TODO: Find minimum window subsequence
    1. Initialize min_len, min_start, s_index
    2. While s_index < len(s):
       a) Forward pass - find window end:
          - Match all chars in t sequentially
          - If can't match, break
       b) Backward pass - shrink to find minimum:
          - Go backwards matching t in reverse
       c) Update minimum if smaller
       d) Move s_index forward
    3. Return substring if found, else ""
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic case")
    print(f"'abcdebdde', 'bde': '{min_window('abcdebdde', 'bde')}'")  # Expected: bcde or bdde or bde
    
    print("\nTest 2: Character not found")
    print(f"'jmeqksfrsdcmsiwvaovztaqenprpvnbstl', 'u': '{min_window('jmeqksfrsdcmsiwvaovztaqenprpvnbstl', 'u')}'")  # Expected: ""
    
    print("\nTest 3: Entire string needed")
    print(f"'abcde', 'ace': '{min_window('abcde', 'ace')}'")  # Expected: abcde
    
    print("\nTest 4: Complex case")
    print(f"'fgrqsqsnodwmxzkzxwqegkndaa', 'kzed': '{min_window('fgrqsqsnodwmxzkzxwqegkndaa', 'kzed')}'")  # Expected: kzxwqegknd
    
    print("\nTest 5: Single character")
    print(f"'abc', 'c': '{min_window('abc', 'c')}'")  # Expected: c
