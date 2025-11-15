"""
M022: Group Anagrams

Summary:
Group strings that are anagrams of each other.

Requirements:
Given array of strings, group anagrams together.

Approach:
Use dict where key is sorted string (signature), value is list of anagrams.

Data Structures:
- dict[str, list[str]]: signature -> list of anagrams

Big O Analysis:
Time Complexity: O(n * k log k) where n is strings, k is max length
Space Complexity: O(n * k)
"""


def group_anagrams(strs: list[str]) -> list[list[str]]:
    """
    TODO: Group anagrams
    1. Create dict to map signature -> list of anagrams
    2. For each string:
       - Compute signature (sort characters)
       - Add string to list for that signature
    3. Return all values from dict
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Multiple anagram groups")
    strs1 = ["eat", "tea", "tan", "ate", "nat", "bat"]
    print(f"Groups: {group_anagrams(strs1)}")
    # Expected: [["bat"],["nat","tan"],["ate","eat","tea"]] (order may vary)
    
    print("\nTest 2: Empty string")
    strs2 = [""]
    print(f"Groups: {group_anagrams(strs2)}")  # Expected: [[""]]
    
    print("\nTest 3: Single string")
    strs3 = ["a"]
    print(f"Groups: {group_anagrams(strs3)}")  # Expected: [["a"]]
    
    print("\nTest 4: Two groups")
    strs4 = ["abc", "bca", "cab", "xyz", "zyx", "yxz"]
    print(f"Groups: {group_anagrams(strs4)}")
    # Expected: [["abc","bca","cab"],["xyz","zyx","yxz"]]
    
    print("\nTest 5: All different")
    strs5 = ["a", "b", "c"]
    print(f"Groups: {group_anagrams(strs5)}")  # Expected: [["a"],["b"],["c"]]
