/*
EASY PROBLEM (Simplified for 15 min):
Find the Town Judge

REQUIREMENTS:
- In a town, there are n people labeled from 1 to n
- There is a rumor that one person is secretly the town judge
- The town judge:
  1. Trusts nobody
  2. Is trusted by everybody else (except themselves)
- Given array of trust relationships [a, b] meaning "a trusts b"
- Return the label of the town judge, or -1 if no such person exists

APPROACH:
- Count trust given and trust received for each person
- Judge has: trust given = 0, trust received = n - 1

DATA STRUCTURES:
- int[]: array to track trust count (positive = received, negative = given)

TIME COMPLEXITY: O(E) where E = number of trust relationships
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.easy;

public class E011_FindTownJudge {
    
    public static int findJudge(int n, int[][] trust) {
        // TODO: Implement judge finder
        // 1. Create array of size n+1 to track trust count for each person
        // 2. For each trust relationship [a, b]:
        //    - Decrement count[a] (a gives trust)
        //    - Increment count[b] (b receives trust)
        // 3. Loop through people 1 to n:
        //    - If count[i] == n - 1, return i (judge found)
        // 4. Return -1 if no judge found
        
        return -1;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // Test 1: Person 2 is judge (1 trusts 2)
        int[][] trust1 = {{1, 2}};
        System.out.println("Judge in town of 2: " + findJudge(2, trust1));
        
        // Test 2: Person 3 is judge (1->3, 2->3)
        int[][] trust2 = {{1, 3}, {2, 3}};
        System.out.println("Judge in town of 3: " + findJudge(3, trust2));
        
        // Test 3: No judge (1->3, 2->3, 3->1 - judge can't trust anyone)
        int[][] trust3 = {{1, 3}, {2, 3}, {3, 1}};
        System.out.println("Judge in town of 3 (no judge): " + findJudge(3, trust3));
        
        // Test 4: Single person is judge
        int[][] trust4 = {};
        System.out.println("Judge in town of 1: " + findJudge(1, trust4));
        
        // Test 5: Not everyone trusts candidate
        int[][] trust5 = {{1, 2}};
        System.out.println("Judge in town of 3 (incomplete trust): " + findJudge(3, trust5));
    }
}
