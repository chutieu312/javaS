"""
M006: First Non-Repeating Character

Summary:
Find the first character that appears only once in a string.

Requirements:
Return the first non-repeating character or '\0' if none exists.

Approach:
Use dict to count frequencies, then find first char with count = 1.

Data Structures:
- dict[str, int]: character -> frequency

Big O Analysis:
Time Complexity: O(n)
Space Complexity: O(n)
"""


def first_non_repeating(s: str) -> str:
    """
    TODO: Find first non-repeating character
    1. Create dict to count frequencies
    2. First pass: count each character
    3. Second pass: find first char with count = 1
    4. Return char or '\0' if none
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic cases")
    print(f"'leetcode' -> '{first_non_repeating('leetcode')}'")      # Expected: l
    print(f"'loveleetcode' -> '{first_non_repeating('loveleetcode')}'")  # Expected: v
    print(f"'aabb' -> '{first_non_repeating('aabb')}'")              # Expected: \0
    
    print("\nTest 2: All unique")
    print(f"'abcdef' -> '{first_non_repeating('abcdef')}'")          # Expected: a
    
    print("\nTest 3: Empty string")
    print(f"'' -> '{first_non_repeating('')}'")                      # Expected: \0
