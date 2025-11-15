"""
E031: Last Stone Weight

Summary:
Last Stone Weight

Requirements:
- Given an array of stone weights
- Each turn, choose the two heaviest stones and smash them together:
  - If both have same weight, both are destroyed
  - If different weights, the lighter one is destroyed and the heavier becomes (heavy - light)
- Continue until at most one stone remains
- Return the weight of the last remaining stone, or 0 if none remain

Approach:
- Use Max Heap to always get heaviest stones
- Simulate the smashing process

Data Structures:
- heapq: max-heap (use negative values for max heap)

Big O Analysis:
Time Complexity: O(n log n)
Space Complexity: O(n)
"""

import heapq


def last_stone_weight(stones: list[int]) -> int:
    """
    TODO: Implement last stone weight
    1. Create max-heap using negative values (heapq is min-heap by default)
    2. Add all stones to heap as negative values
    3. While heap has more than 1 stone:
       - Pop two heaviest (remember to negate back to positive)
       - If stone1 > stone2:
         - Add difference back to heap (as negative)
    4. Return abs(heap[0]) if heap not empty, else 0
    """
    pass


if __name__ == "__main__":
    # Test Cases
    stones1 = [2, 7, 4, 1, 8, 1]
    print(f"Last stone weight [2,7,4,1,8,1]: {last_stone_weight(stones1)}")  # 1
    
    stones2 = [1]
    print(f"Last stone weight [1]: {last_stone_weight(stones2)}")  # 1
    
    stones3 = [2, 2]
    print(f"Last stone weight [2,2]: {last_stone_weight(stones3)}")  # 0
    
    stones4 = [3, 7, 2]
    print(f"Last stone weight [3,7,2]: {last_stone_weight(stones4)}")  # 2
