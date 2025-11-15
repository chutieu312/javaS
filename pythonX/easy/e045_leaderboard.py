"""
E045: Design Leaderboard System

Summary:
Design a leaderboard system for game scores.

Requirements:
Implement the Leaderboard class:
- add_player(player_id, name): Adds player with score 0
- add_score(player_id, score): Adds points to player's total
- get_score(player_id): Returns score or None
- get_name(player_id): Returns name or None
- reset_score(player_id): Resets score to 0
- get_top_players(k): Returns top k player IDs sorted by score

Approach:
Use dict to map player_id -> Player with name and score

Data Structures:
- Player class with name and score
- dict[int, Player]: player_id -> Player

Big O Analysis:
Time Complexity: 
- add_player, add_score, get_score, get_name, reset_score: O(1)
- get_top_players: O(n log n)
Space Complexity: O(n) where n is number of players
"""


class Leaderboard:
    
    class Player:
        def __init__(self, name: str):
            """
            TODO: Initialize Player
            Set name and score = 0
            """
            pass
    
    def __init__(self):
        """
        TODO: Initialize the dict to store players
        """
        pass
    
    def add_player(self, player_id: int, name: str) -> bool:
        """
        TODO: Add new player
        1. Check if player_id exists
        2. If exists, return False
        3. Create Player and add to dict, return True
        """
        pass
    
    def add_score(self, player_id: int, score: int) -> bool:
        """
        TODO: Add score to player
        1. Check if player exists
        2. Add score to player's total
        3. Return True if exists, False otherwise
        """
        pass
    
    def get_score(self, player_id: int) -> int | None:
        """
        TODO: Get player's score
        Return score if exists, None otherwise
        """
        pass
    
    def get_name(self, player_id: int) -> str | None:
        """
        TODO: Get player's name
        Return name if exists, None otherwise
        """
        pass
    
    def reset_score(self, player_id: int) -> bool:
        """
        TODO: Reset player's score
        Set score to 0, return True if exists, False otherwise
        """
        pass
    
    def get_top_players(self, k: int) -> list[int]:
        """
        TODO: Get top k players by score
        1. Create list of (player_id, score) tuples
        2. Sort by score descending
        3. Return first k player IDs
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic operations")
    lb1 = Leaderboard()
    lb1.add_player(1, "Alice")
    lb1.add_player(2, "Bob")
    lb1.add_player(3, "Charlie")
    lb1.add_score(1, 100)
    lb1.add_score(2, 150)
    lb1.add_score(3, 80)
    print(lb1.get_top_players(2))                 # Expected: [2, 1]
    
    print("\nTest 2: Update scores")
    lb2 = Leaderboard()
    lb2.add_player(1, "Alice")
    lb2.add_player(2, "Bob")
    lb2.add_score(1, 50)
    lb2.add_score(2, 40)
    print(lb2.get_top_players(2))                 # Expected: [1, 2]
    lb2.add_score(2, 20)
    print(lb2.get_top_players(2))                 # Expected: [2, 1]
    
    print("\nTest 3: Reset score")
    lb3 = Leaderboard()
    lb3.add_player(1, "Alice")
    lb3.add_score(1, 100)
    print(lb3.get_score(1))                       # Expected: 100
    lb3.reset_score(1)
    print(lb3.get_score(1))                       # Expected: 0
    
    print("\nTest 4: Fewer than k players")
    lb4 = Leaderboard()
    lb4.add_player(1, "Alice")
    lb4.add_player(2, "Bob")
    lb4.add_score(1, 50)
    lb4.add_score(2, 30)
    print(lb4.get_top_players(5))                 # Expected: [1, 2]
    
    print("\nTest 5: Negative scores")
    lb5 = Leaderboard()
    lb5.add_player(1, "Alice")
    lb5.add_player(2, "Bob")
    lb5.add_score(1, 50)
    lb5.add_score(2, 60)
    lb5.add_score(1, -30)                         # Alice: 20
    print(lb5.get_score(1))                       # Expected: 20
    print(lb5.get_top_players(2))                 # Expected: [2, 1]
    
    print("\nTest 6: Invalid operations")
    lb6 = Leaderboard()
    print(lb6.add_score(99, 50))                  # Expected: False
    print(lb6.get_score(99))                      # Expected: None
    print(lb6.get_name(99))                       # Expected: None
    print(lb6.reset_score(99))                    # Expected: False
