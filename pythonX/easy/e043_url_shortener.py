"""
E043: Design URL Shortener (Simple Version)

Summary:
Design a simple URL shortener service.

Requirements:
Implement the URLShortener class:
- shorten(long_url): Creates short code (returns same code for same URL)
- expand(short_code): Returns original URL or None
- get_total_urls(): Returns count of unique URLs

Approach:
Use two dicts for bidirectional mapping and counter for codes

Data Structures:
- dict[str, str]: short_code -> long_url
- dict[str, str]: long_url -> short_code
- int: counter for generating codes

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(n) where n is number of unique URLs
"""


class URLShortener:
    
    def __init__(self):
        """
        TODO: Initialize the dicts and counter
        Start counter at 1
        """
        pass
    
    def shorten(self, long_url: str) -> str:
        """
        TODO: Create or retrieve short code for URL
        1. Check if long_url exists in long_to_short
        2. If exists, return existing code
        3. Else, generate "url{counter}", add to both dicts, increment counter
        4. Return the code
        """
        pass
    
    def expand(self, short_code: str) -> str | None:
        """
        TODO: Retrieve original URL from short code
        Return URL if exists, None otherwise
        """
        pass
    
    def get_total_urls(self) -> int:
        """
        TODO: Return count of unique URLs
        Return size of either dict
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic operations")
    us1 = URLShortener()
    code1 = us1.shorten("https://www.example.com/page1")
    print(f"Short code: {code1}")                # Expected: url1
    print(us1.expand(code1))                     # Expected: https://www.example.com/page1
    
    print("\nTest 2: Multiple URLs")
    us2 = URLShortener()
    code2a = us2.shorten("https://www.example.com/page1")
    code2b = us2.shorten("https://www.example.com/page2")
    code2c = us2.shorten("https://www.example.com/page3")
    print(f"Code 1: {code2a}")                   # Expected: url1
    print(f"Code 2: {code2b}")                   # Expected: url2
    print(f"Code 3: {code2c}")                   # Expected: url3
    print(us2.get_total_urls())                  # Expected: 3
    
    print("\nTest 3: Duplicate URL")
    us3 = URLShortener()
    code3a = us3.shorten("https://www.example.com/page1")
    code3b = us3.shorten("https://www.example.com/page1")
    print(f"First: {code3a}")                    # Expected: url1
    print(f"Second: {code3b}")                   # Expected: url1
    print(us3.get_total_urls())                  # Expected: 1
    
    print("\nTest 4: Invalid code")
    us4 = URLShortener()
    us4.shorten("https://www.example.com/page1")
    print(us4.expand("url99"))                   # Expected: None
    print(us4.expand("invalid"))                 # Expected: None
    
    print("\nTest 5: Mixed operations")
    us5 = URLShortener()
    c1 = us5.shorten("https://google.com")
    c2 = us5.shorten("https://facebook.com")
    print(us5.expand(c1))                        # Expected: https://google.com
    print(us5.expand(c2))                        # Expected: https://facebook.com
    c3 = us5.shorten("https://google.com")
    print(f"c1 equals c3: {c1 == c3}")           # Expected: True
    print(us5.get_total_urls())                  # Expected: 2
