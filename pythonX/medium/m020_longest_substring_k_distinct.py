"""
M020: Longest Substring with At Most K Distinct Characters

Summary:
Find length of longest substring with at most k distinct characters.

Requirements:
Return length of longest substring with <= k distinct chars.

Approach:
Use sliding window with dict to track character frequencies.

Data Structures:
- dict[str, int]: character frequencies in window
- Two pointers for sliding window

Big O Analysis:
Time Complexity: O(n)
Space Complexity: O(k)
"""


def length_of_longest_substring_k_distinct(s: str, k: int) -> int:
    """
    TODO: Find longest substring with at most k distinct chars
    1. Handle edge cases (empty string or k = 0)
    2. Initialize dict for frequencies, left pointer, max_length
    3. Iterate with right pointer:
       - Add current char to window
       - While distinct chars > k: shrink from left
       - Update max_length
    4. Return max_length
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic case")
    print(f"'eceba', k=2: {length_of_longest_substring_k_distinct('eceba', 2)}")  # Expected: 3 (ece)
    
    print("\nTest 2: All same characters")
    print(f"'aa', k=1: {length_of_longest_substring_k_distinct('aa', 1)}")  # Expected: 2
    
    print("\nTest 3: Longer string")
    print(f"'abcadcacacaca', k=3: {length_of_longest_substring_k_distinct('abcadcacacaca', 3)}")  # Expected: 11
    
    print("\nTest 4: k larger than distinct")
    print(f"'a', k=2: {length_of_longest_substring_k_distinct('a', 2)}")  # Expected: 1
    
    print("\nTest 5: k = 0")
    print(f"'abc', k=0: {length_of_longest_substring_k_distinct('abc', 0)}")  # Expected: 0
    
    print("\nTest 6: Complex pattern")
    print(f"'aaabbccd', k=2: {length_of_longest_substring_k_distinct('aaabbccd', 2)}")  # Expected: 5 (aabbc)
