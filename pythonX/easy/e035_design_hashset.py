"""
E035: Design HashSet

Summary:
Design a HashSet without using any built-in hash table libraries.

Requirements:
Implement MyHashSet class:
- add(key): Inserts the value key into the HashSet
- contains(key): Returns whether the value key exists in the HashSet or not
- remove(key): Removes the value key in the HashSet. If key does not exist, do nothing

Constraints:
- 0 <= key <= 10^6
- At most 10^4 calls will be made to add, remove, and contains

Approach:
Simple approach using a boolean array:
1. Use a boolean array of size 10^6 + 1
2. add(key): set array[key] = True
3. remove(key): set array[key] = False
4. contains(key): return array[key]

Data Structures:
- list[bool]: boolean array

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(10^6)
"""


class MyHashSet:
    
    def __init__(self):
        """
        TODO: Initialize the data structure
        Create boolean list of size 1000001
        """
        pass
    
    def add(self, key: int) -> None:
        """
        TODO: Add key to the set
        Set array[key] = True
        """
        pass
    
    def remove(self, key: int) -> None:
        """
        TODO: Remove key from the set
        Set array[key] = False
        """
        pass
    
    def contains(self, key: int) -> bool:
        """
        TODO: Check if key exists
        Return array[key]
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    # Test case 1: Basic functionality
    print("Test 1: Basic operations")
    set1 = MyHashSet()
    set1.add(1)
    set1.add(2)
    print(set1.contains(1))  # Expected: True
    print(set1.contains(3))  # Expected: False
    set1.add(2)
    print(set1.contains(2))  # Expected: True
    set1.remove(2)
    print(set1.contains(2))  # Expected: False
    
    # Test case 2: Multiple adds and removes
    print("\nTest 2: Multiple operations")
    set2 = MyHashSet()
    set2.add(1)
    set2.add(2)
    set2.add(3)
    print(set2.contains(1))  # Expected: True
    print(set2.contains(2))  # Expected: True
    print(set2.contains(3))  # Expected: True
    set2.remove(1)
    print(set2.contains(1))  # Expected: False
    set2.remove(2)
    print(set2.contains(2))  # Expected: False
    
    # Test case 3: Remove non-existent key
    print("\nTest 3: Remove non-existent")
    set3 = MyHashSet()
    set3.remove(100)  # Should not crash
    print(set3.contains(100))  # Expected: False
    
    # Test case 4: Add duplicate
    print("\nTest 4: Add duplicate")
    set4 = MyHashSet()
    set4.add(5)
    set4.add(5)
    set4.add(5)
    print(set4.contains(5))  # Expected: True
    set4.remove(5)
    print(set4.contains(5))  # Expected: False
    
    # Test case 5: Large keys
    print("\nTest 5: Large keys")
    set5 = MyHashSet()
    set5.add(1000000)
    print(set5.contains(1000000))  # Expected: True
    set5.remove(1000000)
    print(set5.contains(1000000))  # Expected: False
