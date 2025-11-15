"""
M001: String Reverse

Summary:
Reverse a string using basic iteration.

Requirements:
Implement a function to reverse a string.

Approach:
Iterate through string backwards and build reversed string.

Data Structures:
- String/list

Big O Analysis:
Time Complexity: O(n)
Space Complexity: O(n) for result string
"""


def reverse_string(s: str) -> str:
    """
    TODO: Reverse the string
    1. Create list to build reversed string
    2. Iterate from end to beginning
    3. Append each character
    4. Join and return
    Or use Python slicing: return s[::-1]
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic string")
    input_str = "Hello World"
    reversed_str = reverse_string(input_str)
    print(f"Original: {input_str}")
    print(f"Reversed: {reversed_str}")    # Expected: dlroW olleH
    
    print("\nTest 2: Empty string")
    print(f"'{reverse_string('')}'")      # Expected: ''
    
    print("\nTest 3: Single character")
    print(f"'{reverse_string('a')}'")     # Expected: a
    
    print("\nTest 4: Palindrome")
    print(f"'{reverse_string('racecar')}'")  # Expected: racecar
