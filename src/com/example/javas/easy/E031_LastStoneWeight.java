/*
EASY PROBLEM (Simplified for 15 min):
Last Stone Weight

REQUIREMENTS:
- Given an array of stone weights
- Each turn, choose the two heaviest stones and smash them together:
  - If both have same weight, both are destroyed
  - If different weights, the lighter one is destroyed and the heavier becomes (heavy - light)
- Continue until at most one stone remains
- Return the weight of the last remaining stone, or 0 if none remain

APPROACH:
- Use Max Heap (PriorityQueue with reverse order) to always get heaviest stones
- Simulate the smashing process

DATA STRUCTURES:
- PriorityQueue<Integer>: max-heap (using Collections.reverseOrder())

TIME COMPLEXITY: O(n log n)
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.easy;

import java.util.*;

public class E031_LastStoneWeight {
    
    public static int lastStoneWeight(int[] stones) {
        // TODO: Implement last stone weight
        // 1. Create max-heap: PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder())
        // 2. Add all stones to maxHeap
        // 3. While maxHeap has more than 1 stone:
        //    - Poll two heaviest: stone1 = maxHeap.poll(), stone2 = maxHeap.poll()
        //    - If stone1 > stone2:
        //      - Add difference back: maxHeap.offer(stone1 - stone2)
        // 4. Return maxHeap.isEmpty() ? 0 : maxHeap.peek()
        
        return 0;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        int[] stones1 = {2, 7, 4, 1, 8, 1};
        System.out.println("Last stone weight [2,7,4,1,8,1]: " + lastStoneWeight(stones1)); // 1
        
        int[] stones2 = {1};
        System.out.println("Last stone weight [1]: " + lastStoneWeight(stones2)); // 1
        
        int[] stones3 = {2, 2};
        System.out.println("Last stone weight [2,2]: " + lastStoneWeight(stones3)); // 0
        
        int[] stones4 = {3, 7, 2};
        System.out.println("Last stone weight [3,7,2]: " + lastStoneWeight(stones4)); // 2
    }
}
