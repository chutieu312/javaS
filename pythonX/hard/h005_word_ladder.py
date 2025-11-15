"""
H005: Word Ladder

Summary:
Find shortest transformation sequence from start word to end word.

Requirements:
Transform start word to end word by changing one letter at a time.
Each intermediate word must be in word list.

Approach:
Use BFS to find shortest path. Each word is a node.

Data Structures:
- deque: for BFS queue
- set: for word list and visited tracking

Big O Analysis:
Time Complexity: O(n * m^2) where n=words, m=word length
Space Complexity: O(n)
"""

from collections import deque


def ladder_length(begin_word: str, end_word: str, word_list: list[str]) -> int:
    """
    TODO: Find shortest transformation sequence length
    1. Convert word_list to set
    2. If end_word not in set, return 0
    3. Create queue with (begin_word, 1)
    4. Create visited set
    5. BFS:
       - Pop word and level
       - If word == end_word, return level
       - Try changing each character (a-z):
         - If new word in word_list and not visited:
           - Add to queue with level + 1
           - Mark visited
    6. Return 0 if no path
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Path exists")
    word_list1 = ["hot", "dot", "dog", "lot", "log", "cog"]
    result1 = ladder_length("hit", "cog", word_list1)
    print(f"'hit' -> 'cog': {result1}")  # Expected: 5 (hit->hot->dot->dog->cog)
    
    print("\nTest 2: No path")
    word_list2 = ["hot", "dot", "dog", "lot", "log"]
    result2 = ladder_length("hit", "cog", word_list2)
    print(f"'hit' -> 'cog' (no path): {result2}")  # Expected: 0
    
    print("\nTest 3: Short transformation")
    word_list3 = ["a", "b", "c"]
    result3 = ladder_length("a", "c", word_list3)
    print(f"'a' -> 'c': {result3}")  # Expected: 2 (a->c)
    
    print("\nTest 4: Direct transformation")
    word_list4 = ["hot", "dot", "dog"]
    result4 = ladder_length("hot", "dot", word_list4)
    print(f"'hot' -> 'dot': {result4}")  # Expected: 2
    
    print("\nTest 5: Longer path")
    word_list5 = ["hot", "dot", "dog", "lot", "log"]
    result5 = ladder_length("hot", "log", word_list5)
    print(f"'hot' -> 'log': {result5}")  # Expected: 4 (hot->lot->log or hot->dot->dog->log)
