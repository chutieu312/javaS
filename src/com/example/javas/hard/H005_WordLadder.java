/*
HARD PROBLEM (Simplified for 25 min):
Word Ladder - Find shortest transformation sequence

REQUIREMENTS:
- Given a start word, end word, and word list
- Transform start word to end word by changing one letter at a time
- Each intermediate word must be in the word list
- Return the length of shortest transformation sequence (0 if impossible)

APPROACH:
- Use BFS (Breadth-First Search) to find shortest path
- Each word is a node, edges exist between words differing by one letter
- Use Queue for BFS and HashSet to track visited words

DATA STRUCTURES:
- Queue<String>: for BFS
- HashSet<String>: for word list and visited tracking

TIME COMPLEXITY: O(n * m^2) where n = words, m = word length
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.hard;

import java.util.*;

public class H005_WordLadder {
    
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // TODO: Implement word ladder using BFS
        // 1. Convert wordList to HashSet for O(1) lookup
        // 2. If endWord not in set, return 0
        // 3. Create Queue and add beginWord with level 1
        // 4. Create visited set
        // 5. BFS:
        //    - Poll word and level
        //    - If word equals endWord, return level
        //    - Try changing each character (a-z):
        //      - If new word in wordList and not visited:
        //        - Add to queue with level + 1
        //        - Mark as visited
        // 6. Return 0 if no path found
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        List<String> wordList1 = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        System.out.println("hit -> cog: " + ladderLength("hit", "cog", wordList1));
        
        List<String> wordList2 = Arrays.asList("hot", "dot", "dog", "lot", "log");
        System.out.println("hit -> cog (no path): " + ladderLength("hit", "cog", wordList2));
        
        List<String> wordList3 = Arrays.asList("a", "b", "c");
        System.out.println("a -> c: " + ladderLength("a", "c", wordList3));
    }
}
