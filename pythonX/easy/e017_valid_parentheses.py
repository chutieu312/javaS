"""
E017: Valid Parentheses

Summary:
Valid Parentheses

Requirements:
- Given a string containing just the characters '(', ')', '{', '}', '[' and ']'
- Determine if the input string is valid
- Valid means:
  1. Open brackets must be closed by the same type of brackets
  2. Open brackets must be closed in the correct order

Approach:
- Use a Stack to track opening brackets
- Push opening brackets onto stack
- For closing brackets, check if they match the top of stack

Data Structures:
- list: to use as stack (append/pop)

Big O Analysis:
Time Complexity: O(n) where n is string length
Space Complexity: O(n)
"""

def is_valid(s: str) -> bool:
    """
    TODO: Implement valid parentheses checker
    1. Create a list to use as stack
    2. Loop through each character:
       - If opening bracket '(', '[', '{': append to stack
       - If closing bracket:
         - If stack is empty, return False (no match)
         - Pop from stack and check if it matches
         - If not matching, return False
    3. After loop, return True if stack is empty, False otherwise
    """
    pass


if __name__ == "__main__":
    # Test Cases
    print(f'"()" -> {is_valid("()")}')
    print(f'"()[]{{}}") -> {is_valid("()[]{}")}')
    print(f'"(]" -> {is_valid("(]")}')
    print(f'"([)]" -> {is_valid("([)]")}')
    print(f'"{{[]}}" -> {is_valid("{[]}")}')
    print(f'"((" -> {is_valid("((")}')
    print(f'"))" -> {is_valid("))")}')
