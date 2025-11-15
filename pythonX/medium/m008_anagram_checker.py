"""
M008: Anagram Checker

Summary:
Check if two strings are anagrams of each other.

Requirements:
Return True if strings are anagrams (same chars, same frequency).
Case-insensitive, ignore spaces.

Approach:
Clean strings, count character frequencies, compare.

Data Structures:
- dict[str, int]: character -> frequency

Big O Analysis:
Time Complexity: O(n + m) where n, m are string lengths
Space Complexity: O(n + m)
"""


def is_anagram(s1: str, s2: str) -> bool:
    """
    TODO: Check if strings are anagrams
    1. Clean both strings: remove spaces, convert to lowercase
    2. If lengths differ, return False
    3. Create frequency map for both strings
    4. Compare the two maps
    """
    pass


def get_frequency_map(s: str) -> dict[str, int]:
    """
    TODO: Create frequency map for string
    1. Create dict
    2. Loop through string
    3. Count each character
    4. Return dict
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic anagrams")
    print(f"'listen' & 'silent' -> {is_anagram('listen', 'silent')}")  # Expected: True
    print(f"'hello' & 'world' -> {is_anagram('hello', 'world')}")      # Expected: False
    
    print("\nTest 2: With spaces")
    print(f"'The Eyes' & 'They See' -> {is_anagram('The Eyes', 'They See')}")  # Expected: True
    
    print("\nTest 3: Not anagrams")
    print(f"'abc' & 'def' -> {is_anagram('abc', 'def')}")              # Expected: False
    
    print("\nTest 4: Same character")
    print(f"'a' & 'a' -> {is_anagram('a', 'a')}")                      # Expected: True
