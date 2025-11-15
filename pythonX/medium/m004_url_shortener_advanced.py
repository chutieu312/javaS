"""
M004: Design URL Shortener (Advanced with Usage Tracking)

Summary:
Design a URL shortener service with usage tracking.

Requirements:
Implement the URLShortener class:
- shorten(long_url): Creates short code
- get_original(short_code): Returns original URL and increments usage
- get_usage_count(short_code): Returns usage count

Approach:
Use two dicts for mappings and counter for code generation.

Data Structures:
- dict[str, str]: short_code -> long_url
- dict[str, int]: short_code -> usage_count
- int: counter for generating codes

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(n) where n is number of URLs
"""


class URLShortener:
    
    def __init__(self):
        """
        TODO: Initialize dicts and counter
        Start counter at 1
        """
        pass
    
    def shorten(self, long_url: str) -> str:
        """
        TODO: Shorten URL
        1. Generate short code: "url" + counter
        2. Store in short_to_long dict
        3. Initialize usage count to 0
        4. Increment counter
        5. Return short code
        """
        pass
    
    def get_original(self, short_code: str) -> str | None:
        """
        TODO: Get original URL
        1. Check if short_code exists
        2. Increment usage count
        3. Return original URL or None
        """
        pass
    
    def get_usage_count(self, short_code: str) -> int:
        """
        TODO: Get usage count
        Return count or 0 if not exists
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic shortening")
    shortener = URLShortener()
    url1 = "https://www.example.com/very/long/url/path"
    url2 = "https://www.github.com/user/repository"
    
    short1 = shortener.shorten(url1)
    short2 = shortener.shorten(url2)
    print(f"Shortened: {url1} -> {short1}")        # Expected: url1
    print(f"Shortened: {url2} -> {short2}")        # Expected: url2
    
    print("\nTest 2: Get original and track usage")
    print(f"Get original: {short1} -> {shortener.get_original(short1)}")
    print(f"Get original: {short1} -> {shortener.get_original(short1)}")
    print(f"Usage count for {short1}: {shortener.get_usage_count(short1)}")  # Expected: 2
    
    print(f"\nGet original: {short2} -> {shortener.get_original(short2)}")
    print(f"Usage count for {short2}: {shortener.get_usage_count(short2)}")  # Expected: 1
    
    print("\nTest 3: Invalid code")
    print(f"Get invalid: url999 -> {shortener.get_original('url999')}")  # Expected: None
