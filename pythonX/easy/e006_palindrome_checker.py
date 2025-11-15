"""
EASY PROBLEM (Simplified for 15 min):
Check if a string is a palindrome (reads same forwards and backwards)

REQUIREMENTS:
- Return True if string is palindrome, False otherwise
- Case-sensitive, no special handling needed

APPROACH:
- Reverse the string using slicing
- Compare original with reversed

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n)
"""

def is_palindrome(s: str) -> bool:
    """
    TODO: Implement palindrome check
    1. Reverse the string using slicing [::-1]
    2. Compare original with reversed using ==
    """
    pass


# TEST CASES
if __name__ == "__main__":
    print(f'"racecar" -> {is_palindrome("racecar")}')  # Expected: True
    print(f'"hello" -> {is_palindrome("hello")}')      # Expected: False
    print(f'"level" -> {is_palindrome("level")}')      # Expected: True
    print(f'"abc" -> {is_palindrome("abc")}')          # Expected: False
