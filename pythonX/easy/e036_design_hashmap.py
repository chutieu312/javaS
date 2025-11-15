"""
E036: Design HashMap

Summary:
Design a HashMap without using any built-in hash table libraries.

Requirements:
Implement MyHashMap class:
- put(key, value): Inserts a (key, value) pair. If key exists, update value
- get(key): Returns the value for key, or -1 if key doesn't exist
- remove(key): Removes the key and its value if it exists

Constraints:
- 0 <= key, value <= 10^6
- At most 10^4 calls will be made to put, get, and remove

Approach:
Simple approach using two arrays:
1. Use two arrays of size 10^6 + 1
2. One boolean array to track if key exists
3. One int array to store values

Data Structures:
- list[bool]: to track key existence
- list[int]: to store values

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(10^6)
"""


class MyHashMap:
    
    def __init__(self):
        """
        TODO: Initialize the data structures
        Create boolean array and int array of size 1000001
        """
        pass
    
    def put(self, key: int, value: int) -> None:
        """
        TODO: Insert or update key-value pair
        1. Mark key as existing
        2. Store value at key index
        """
        pass
    
    def get(self, key: int) -> int:
        """
        TODO: Get value for key
        1. Check if key exists
        2. If yes, return value; if no, return -1
        """
        pass
    
    def remove(self, key: int) -> None:
        """
        TODO: Remove key
        Mark key as not existing
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    # Test case 1: Basic functionality
    print("Test 1: Basic operations")
    map1 = MyHashMap()
    map1.put(1, 1)
    map1.put(2, 2)
    print(map1.get(1))     # Expected: 1
    print(map1.get(3))     # Expected: -1
    map1.put(2, 1)
    print(map1.get(2))     # Expected: 1
    map1.remove(2)
    print(map1.get(2))     # Expected: -1
    
    # Test case 2: Update existing key
    print("\nTest 2: Update values")
    map2 = MyHashMap()
    map2.put(5, 100)
    print(map2.get(5))     # Expected: 100
    map2.put(5, 200)
    print(map2.get(5))     # Expected: 200
    map2.put(5, 300)
    print(map2.get(5))     # Expected: 300
    
    # Test case 3: Remove non-existent key
    print("\nTest 3: Remove non-existent")
    map3 = MyHashMap()
    map3.remove(100)  # Should not crash
    print(map3.get(100))   # Expected: -1
    
    # Test case 4: Multiple keys
    print("\nTest 4: Multiple keys")
    map4 = MyHashMap()
    map4.put(1, 10)
    map4.put(2, 20)
    map4.put(3, 30)
    print(map4.get(1))     # Expected: 10
    print(map4.get(2))     # Expected: 20
    print(map4.get(3))     # Expected: 30
    map4.remove(2)
    print(map4.get(2))     # Expected: -1
    print(map4.get(1))     # Expected: 10
    print(map4.get(3))     # Expected: 30
    
    # Test case 5: Zero values
    print("\nTest 5: Zero values")
    map5 = MyHashMap()
    map5.put(0, 0)
    print(map5.get(0))     # Expected: 0
    map5.put(10, 0)
    print(map5.get(10))    # Expected: 0
