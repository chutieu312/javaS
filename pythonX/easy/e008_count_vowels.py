"""
E008: Count Vowels

Summary:
Count the number of vowels in a string.

Requirements:
- Count vowels (a, e, i, o, u) in a given string
- Case-insensitive (both 'A' and 'a' count as vowels)

Approach:
- Loop through each character in the string
- Check if it's a vowel (ignoring case)
- Increment counter if it is

Big O Analysis:
Time Complexity: O(n)
Space Complexity: O(1)
"""

def count_vowels(s: str) -> int:
    """
    TODO: Implement vowel counter
    1. Initialize count = 0
    2. Loop through each character
    3. Convert to lowercase and check if it's a vowel (in 'aeiou')
    4. Increment count if vowel found
    5. Return count
    """
    pass


if __name__ == "__main__":
    # Test Cases
    print(f'"hello" -> {count_vowels("hello")}')
    print(f'"AEIOU" -> {count_vowels("AEIOU")}')
    print(f'"Java Programming" -> {count_vowels("Java Programming")}')
    print(f'"xyz" -> {count_vowels("xyz")}')
    print(f'"" -> {count_vowels("")}')
