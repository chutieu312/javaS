"""
E021: Length of Last Word

Summary:
Length of Last Word

Requirements:
- Given a string s consisting of words and spaces
- Return the length of the last word in the string
- A word is a maximal substring consisting of non-space characters only

Approach:
- Trim trailing spaces
- Find the last space
- Calculate length from last space to end

Big O Analysis:
Time Complexity: O(n) where n is string length
Space Complexity: O(1)
"""

def length_of_last_word(s: str) -> int:
    """
    TODO: Implement last word length finder
    1. Trim trailing spaces: s = s.rstrip()
    2. Find index of last space: last_space = s.rfind(' ')
    3. Return length from last_space + 1 to end
       - If no space found (last_space = -1), return len(s)
       - Otherwise, return len(s) - last_space - 1
    """
    pass


if __name__ == "__main__":
    # Test Cases
    print(f'"Hello World" -> {length_of_last_word("Hello World")}')
    print(f'"   fly me   to   the moon  " -> {length_of_last_word("   fly me   to   the moon  ")}')
    print(f'"luffy is still joyboy" -> {length_of_last_word("luffy is still joyboy")}')
    print(f'"a" -> {length_of_last_word("a")}')
    print(f'"day" -> {length_of_last_word("day")}')
