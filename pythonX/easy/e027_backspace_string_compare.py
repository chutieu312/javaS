"""
E027: Backspace String Compare

Summary:
Backspace String Compare

Requirements:
- Given two strings s and t containing lowercase letters and '#' characters
- '#' means a backspace character
- Return true if they are equal after processing backspaces

Approach:
- Use stack (list) to process each string (simulating backspace)
- Append characters, pop when encountering '#'
- Compare final results

Data Structures:
- list: to process backspaces (used as stack)

Big O Analysis:
Time Complexity: O(n + m) where n, m are string lengths
Space Complexity: O(n + m)
"""

def backspace_compare(s: str, t: str) -> bool:
    """
    TODO: Implement backspace string compare
    1. Process both strings with helper function
    2. Compare the results using ==
    """
    pass


def process_string(string: str) -> str:
    """
    TODO: Implement string processor with stack
    1. Create list to use as stack
    2. For each char in string:
       - If char is '#':
         - If stack not empty, pop
       - Otherwise: append char to stack
    3. Build string from stack and return
    """
    pass


if __name__ == "__main__":
    # Test Cases
    print(f'"ab#c" vs "ad#c": {backspace_compare("ab#c", "ad#c")}')  # True
    print(f'"ab##" vs "c#d#": {backspace_compare("ab##", "c#d#")}')  # True
    print(f'"a#c" vs "b": {backspace_compare("a#c", "b")}')  # False
    print(f'"a##c" vs "#a#c": {backspace_compare("a##c", "#a#c")}')  # True
    print(f'"abc" vs "abc": {backspace_compare("abc", "abc")}')  # True
