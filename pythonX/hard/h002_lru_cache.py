"""
H002: Design LRU Cache

Summary:
Design Least Recently Used (LRU) cache with O(1) operations.

Requirements:
Implement LRUCache class:
- __init__(capacity): Initialize with capacity
- get(key): Return value or -1
- put(key, value): Insert/update and evict LRU if needed

Approach:
Use OrderedDict which maintains insertion/access order.
Move accessed items to end to track recency.

Data Structures:
- OrderedDict: maintains order, supports O(1) operations

Big O Analysis:
Time Complexity: O(1) for both get and put
Space Complexity: O(capacity)
"""

from collections import OrderedDict


class LRUCache:
    
    def __init__(self, capacity: int):
        """
        TODO: Initialize cache
        1. Store capacity
        2. Create OrderedDict
        """
        pass
    
    def get(self, key: int) -> int:
        """
        TODO: Get value for key
        1. If key not in cache, return -1
        2. Move key to end (mark as recently used)
        3. Return value
        """
        pass
    
    def put(self, key: int, value: int) -> None:
        """
        TODO: Put key-value pair
        1. If key exists, move to end
        2. Set value
        3. If size > capacity, remove first (LRU) item
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic LRU operations")
    cache = LRUCache(2)
    cache.put(1, 100)
    cache.put(2, 200)
    print(f"Get 1: {cache.get(1)}")      # Expected: 100
    cache.put(3, 300)                    # Evicts key 2
    print(f"Get 2: {cache.get(2)}")      # Expected: -1
    cache.put(4, 400)                    # Evicts key 1
    print(f"Get 1: {cache.get(1)}")      # Expected: -1
    print(f"Get 3: {cache.get(3)}")      # Expected: 300
    print(f"Get 4: {cache.get(4)}")      # Expected: 400
    
    print("\nTest 2: Update existing key")
    cache2 = LRUCache(2)
    cache2.put(1, 1)
    cache2.put(2, 2)
    cache2.put(1, 10)                    # Update key 1
    print(f"Get 1: {cache2.get(1)}")     # Expected: 10
    cache2.put(3, 3)                     # Evicts key 2
    print(f"Get 2: {cache2.get(2)}")     # Expected: -1
    
    print("\nTest 3: Access pattern")
    cache3 = LRUCache(2)
    cache3.put(2, 1)
    cache3.put(1, 1)
    print(f"Get 2: {cache3.get(2)}")     # Expected: 1
    cache3.put(4, 1)                     # Evicts key 1
    print(f"Get 1: {cache3.get(1)}")     # Expected: -1
    print(f"Get 2: {cache3.get(2)}")     # Expected: 1
