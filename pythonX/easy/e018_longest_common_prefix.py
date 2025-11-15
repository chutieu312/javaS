"""
E018: Longest Common Prefix

Summary:
Longest Common Prefix

Requirements:
- Given an array of strings
- Find the longest common prefix string amongst all strings
- Return empty string "" if there is no common prefix

Approach:
- Use the first string as reference
- Compare each character position across all strings
- Stop when mismatch found or end of any string reached

Big O Analysis:
Time Complexity: O(n * m) where n = number of strings, m = length of shortest string
Space Complexity: O(1)
"""

def longest_common_prefix(strs: list[str]) -> str:
    """
    TODO: Implement longest common prefix finder
    1. If array is empty, return ""
    2. Use first string as reference
    3. Loop through each character position i in reference string:
       - For each string in array:
         - If i >= string length OR char doesn't match reference[i]:
           - Return reference[:i]
    4. Return entire reference string (all match)
    """
    pass


if __name__ == "__main__":
    # Test Cases
    strs1 = ["flower", "flow", "flight"]
    print(f'Common prefix of ["flower", "flow", "flight"]: "{longest_common_prefix(strs1)}"')
    
    strs2 = ["dog", "racecar", "car"]
    print(f'Common prefix of ["dog", "racecar", "car"]: "{longest_common_prefix(strs2)}"')
    
    strs3 = ["interspecies", "interstellar", "interstate"]
    print(f'Common prefix of ["interspecies", "interstellar", "interstate"]: "{longest_common_prefix(strs3)}"')
    
    strs4 = ["a"]
    print(f'Common prefix of ["a"]: "{longest_common_prefix(strs4)}"')
    
    strs5 = ["", "b"]
    print(f'Common prefix of ["", "b"]: "{longest_common_prefix(strs5)}"')
