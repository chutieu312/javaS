"""
E020: Roman to Integer

Summary:
Roman to Integer

Requirements:
- Given a Roman numeral string, convert it to an integer
- Roman numerals: I=1, V=5, X=10, L=50, C=100, D=500, M=1000
- Subtraction cases: IV=4, IX=9, XL=40, XC=90, CD=400, CM=900
- When smaller value appears before larger, subtract it

Approach:
- Use dict to map Roman characters to values
- Iterate through string, compare current with next
- If current < next, subtract; otherwise add

Data Structures:
- dict[str, int]: Roman char -> value mapping

Big O Analysis:
Time Complexity: O(n) where n is string length
Space Complexity: O(1)
"""

def roman_to_int(s: str) -> int:
    """
    TODO: Implement Roman to Integer converter
    1. Create dict with Roman numeral mappings
    2. Initialize result = 0
    3. Loop through string (i from 0 to len-1):
       - Get current value from dict
       - If i < len-1 and current < next value:
         - Subtract current from result
       - Else:
         - Add current to result
    4. Return result
    """
    pass


if __name__ == "__main__":
    # Test Cases
    print(f'"III" -> {roman_to_int("III")}')
    print(f'"IV" -> {roman_to_int("IV")}')
    print(f'"IX" -> {roman_to_int("IX")}')
    print(f'"LVIII" -> {roman_to_int("LVIII")}')
    print(f'"MCMXCIV" -> {roman_to_int("MCMXCIV")}')
    print(f'"CDXLIV" -> {roman_to_int("CDXLIV")}')
