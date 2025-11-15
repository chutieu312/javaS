"""
M023: Design Hit Counter

Summary:
Design hit counter for past 5 minutes (300 seconds).

Requirements:
Implement HitCounter class:
- hit(timestamp): Record hit at timestamp
- get_hits(timestamp): Return hits in past 300 seconds

Approach:
Use deque to store hit timestamps, remove expired ones.

Data Structures:
- deque[int]: store hit timestamps

Big O Analysis:
Time Complexity: hit O(1), get_hits O(n) where n is hits in 300s
Space Complexity: O(n)
"""

from collections import deque


class HitCounter:
    
    def __init__(self):
        """
        TODO: Initialize deque to store timestamps
        """
        pass
    
    def hit(self, timestamp: int) -> None:
        """
        TODO: Add timestamp to deque
        """
        pass
    
    def get_hits(self, timestamp: int) -> int:
        """
        TODO: Remove expired hits and count valid ones
        1. Calculate cutoff time (timestamp - 300)
        2. Remove timestamps from front that are <= cutoff
        3. Return deque size
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic hits")
    counter1 = HitCounter()
    counter1.hit(1)
    counter1.hit(2)
    counter1.hit(3)
    print(f"Hits at t=4: {counter1.get_hits(4)}")    # Expected: 3
    counter1.hit(300)
    print(f"Hits at t=300: {counter1.get_hits(300)}")  # Expected: 4
    print(f"Hits at t=301: {counter1.get_hits(301)}")  # Expected: 3
    
    print("\nTest 2: Multiple hits at same time")
    counter2 = HitCounter()
    counter2.hit(1)
    counter2.hit(1)
    counter2.hit(1)
    print(f"Hits at t=2: {counter2.get_hits(2)}")    # Expected: 3
    
    print("\nTest 3: Expiration")
    counter3 = HitCounter()
    counter3.hit(1)
    counter3.hit(100)
    counter3.hit(200)
    counter3.hit(300)
    print(f"Hits at t=300: {counter3.get_hits(300)}")  # Expected: 4
    print(f"Hits at t=301: {counter3.get_hits(301)}")  # Expected: 3
    print(f"Hits at t=400: {counter3.get_hits(400)}")  # Expected: 2
    print(f"Hits at t=500: {counter3.get_hits(500)}")  # Expected: 1
    print(f"Hits at t=601: {counter3.get_hits(601)}")  # Expected: 0
