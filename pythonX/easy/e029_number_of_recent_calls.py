"""
E029: Number of Recent Calls

Summary:
Number of Recent Calls

Requirements:
- Design a class RecentCounter to count recent requests
- Write RecentCounter class with ping(t) method:
  - Adds a new request at time t (in milliseconds)
  - Returns the number of requests in the past 3000 milliseconds (including current)
  - Time t is strictly increasing

Approach:
- Use deque to store request timestamps
- For each ping, add new timestamp and remove old ones (older than t - 3000)
- Return queue size

Data Structures:
- collections.deque: to store request timestamps

Big O Analysis:
Time Complexity: O(1) amortized per ping
Space Complexity: O(W) where W is window size (3000ms)
"""

from collections import deque


class RecentCounter:
    
    def __init__(self):
        """
        TODO: Initialize deque
        """
        pass
    
    def ping(self, t: int) -> int:
        """
        TODO: Implement ping
        1. Append t to queue
        2. Remove all timestamps older than (t - 3000) from front
        3. Return queue size
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    counter = RecentCounter()
    
    print(f"ping(1): {counter.ping(1)}")        # 1
    print(f"ping(100): {counter.ping(100)}")    # 2
    print(f"ping(3001): {counter.ping(3001)}")  # 3
    print(f"ping(3002): {counter.ping(3002)}")  # 3 (1 is outside window)
    
    print()
    
    counter2 = RecentCounter()
    print(f"ping(1): {counter2.ping(1)}")       # 1
    print(f"ping(2000): {counter2.ping(2000)}")  # 2
    print(f"ping(3000): {counter2.ping(3000)}")  # 3
    print(f"ping(4000): {counter2.ping(4000)}")  # 4
    print(f"ping(5000): {counter2.ping(5000)}")  # 3 (1 is outside)
