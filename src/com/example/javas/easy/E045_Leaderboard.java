package com.example.javas.easy;

import java.util.*;

/**
 * E045: Design Leaderboard System
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a leaderboard system for a game that can add players, update scores,
 * and retrieve top players.
 * 
 * Requirements:
 * Implement the Leaderboard class:
 * - Leaderboard() Initializes the leaderboard
 * - boolean addPlayer(int playerId, String name) Adds a player with initial score of 0.
 *   Return false if playerId already exists, else return true
 * - boolean addScore(int playerId, int score) Adds score points to the player's total.
 *   Return false if player doesn't exist, else return true
 * - Integer getScore(int playerId) Returns the player's total score.
 *   Return null if player doesn't exist
 * - String getName(int playerId) Returns the player's name.
 *   Return null if player doesn't exist
 * - boolean resetScore(int playerId) Resets the player's score to 0.
 *   Return false if player doesn't exist, else return true
 * - List<Integer> getTopPlayers(int k) Returns list of top k player IDs sorted by 
 *   score (highest first). If tie, order doesn't matter. Return fewer if less than k players
 * 
 * Constraints:
 * - 1 <= playerId <= 10^5
 * - 1 <= name.length <= 50
 * - -1000 <= score <= 1000 (can be negative)
 * - 1 <= k <= 100
 * - At most 5000 calls will be made to all functions combined
 * 
 * Examples:
 * Leaderboard lb = new Leaderboard();
 * lb.addPlayer(1, "Alice");        // return true
 * lb.addPlayer(2, "Bob");          // return true
 * lb.addPlayer(3, "Charlie");      // return true
 * lb.addScore(1, 100);             // Alice: 100
 * lb.addScore(2, 150);             // Bob: 150
 * lb.addScore(3, 80);              // Charlie: 80
 * lb.getTopPlayers(2);             // return [2, 1] (Bob, Alice)
 * lb.addScore(1, 60);              // Alice: 160
 * lb.getTopPlayers(3);             // return [1, 2, 3] (Alice, Bob, Charlie)
 * lb.resetScore(1);                // Alice: 0
 * lb.getTopPlayers(2);             // return [2, 3] (Bob, Charlie)
 * lb.getScore(1);                  // return 0
 * 
 * Approach:
 * Use HashMap to store player information:
 * 1. Create Player class with name and score
 * 2. Use HashMap<Integer, Player> to map playerId -> Player
 * 3. addPlayer: add new Player with score 0
 * 4. addScore: add to player's score
 * 5. resetScore: set player's score to 0
 * 6. getTopPlayers: collect all players, sort by score, return top k IDs
 * 
 * Data Structures:
 * - Player class with name (String) and score (int)
 * - HashMap<Integer, Player> to map playerId -> Player
 * 
 * Time Complexity: 
 * - addPlayer, addScore, getScore, getName, resetScore: O(1)
 * - getTopPlayers: O(n log n) where n is total players (for sorting)
 * 
 * Space Complexity: O(n) where n is number of players
 */
public class E045_Leaderboard {
    
    static class Leaderboard {
        
        // TODO: Create inner Player class
        // - String name
        // - int score
        // - Constructor to initialize
        
        // TODO: Declare HashMap to store players
        // Map from playerId (Integer) to Player object
        
        public Leaderboard() {
            // TODO: Initialize the HashMap
        }
        
        public boolean addPlayer(int playerId, String name) {
            // TODO: Add new player
            // 1. Check if playerId already exists
            // 2. If exists, return false
            // 3. Create new Player with name and score=0
            // 4. Add to map and return true
            
            return false;
        }
        
        public boolean addScore(int playerId, int score) {
            // TODO: Add score to player
            // 1. Check if player exists
            // 2. If not exists, return false
            // 3. Add score to player's current score
            // 4. Return true
            
            return false;
        }
        
        public Integer getScore(int playerId) {
            // TODO: Get player's score
            // 1. Check if player exists
            // 2. If exists, return player's score
            // 3. If not exists, return null
            
            return null;
        }
        
        public String getName(int playerId) {
            // TODO: Get player's name
            // 1. Check if player exists
            // 2. If exists, return player's name
            // 3. If not exists, return null
            
            return null;
        }
        
        public boolean resetScore(int playerId) {
            // TODO: Reset player's score
            // 1. Check if player exists
            // 2. If not exists, return false
            // 3. Set player's score to 0
            // 4. Return true
            
            return false;
        }
        
        public List<Integer> getTopPlayers(int k) {
            // TODO: Get top k players by score
            // 1. Create list to store player IDs with their scores
            // 2. Iterate through all players and collect (playerId, score) pairs
            // 3. Sort by score in descending order
            // 4. Take first k player IDs
            // 5. Return the list
            
            return new ArrayList<>();
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic operations
        System.out.println("Test 1: Basic operations");
        Leaderboard lb1 = new Leaderboard();
        lb1.addPlayer(1, "Alice");
        lb1.addPlayer(2, "Bob");
        lb1.addPlayer(3, "Charlie");
        lb1.addScore(1, 100);
        lb1.addScore(2, 150);
        lb1.addScore(3, 80);
        System.out.println(lb1.getTopPlayers(2));                // Expected: [2, 1]
        
        // Test case 2: Update scores
        System.out.println("\nTest 2: Update scores");
        Leaderboard lb2 = new Leaderboard();
        lb2.addPlayer(1, "Alice");
        lb2.addPlayer(2, "Bob");
        lb2.addScore(1, 50);
        lb2.addScore(2, 40);
        System.out.println(lb2.getTopPlayers(2));                // Expected: [1, 2]
        lb2.addScore(2, 20);
        System.out.println(lb2.getTopPlayers(2));                // Expected: [2, 1] (Bob: 60, Alice: 50)
        
        // Test case 3: Reset score
        System.out.println("\nTest 3: Reset score");
        Leaderboard lb3 = new Leaderboard();
        lb3.addPlayer(1, "Alice");
        lb3.addScore(1, 100);
        System.out.println(lb3.getScore(1));                     // Expected: 100
        lb3.resetScore(1);
        System.out.println(lb3.getScore(1));                     // Expected: 0
        
        // Test case 4: Top k with fewer players
        System.out.println("\nTest 4: Fewer than k players");
        Leaderboard lb4 = new Leaderboard();
        lb4.addPlayer(1, "Alice");
        lb4.addPlayer(2, "Bob");
        lb4.addScore(1, 50);
        lb4.addScore(2, 30);
        System.out.println(lb4.getTopPlayers(5));                // Expected: [1, 2] (only 2 players)
        
        // Test case 5: Negative scores
        System.out.println("\nTest 5: Negative scores");
        Leaderboard lb5 = new Leaderboard();
        lb5.addPlayer(1, "Alice");
        lb5.addPlayer(2, "Bob");
        lb5.addScore(1, 50);
        lb5.addScore(2, 60);
        lb5.addScore(1, -30);                                    // Alice: 20
        System.out.println(lb5.getScore(1));                     // Expected: 20
        System.out.println(lb5.getTopPlayers(2));                // Expected: [2, 1] (Bob: 60, Alice: 20)
        
        // Test case 6: Invalid operations
        System.out.println("\nTest 6: Invalid operations");
        Leaderboard lb6 = new Leaderboard();
        System.out.println(lb6.addScore(99, 50));                // Expected: false
        System.out.println(lb6.getScore(99));                    // Expected: null
        System.out.println(lb6.getName(99));                     // Expected: null
        System.out.println(lb6.resetScore(99));                  // Expected: false
    }
}
