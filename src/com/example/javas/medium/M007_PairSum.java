/*
MEDIUM PROBLEM (Simplified for 25 min):
Find all pairs in an array that sum to a target value

REQUIREMENTS:
- Given an array and a target sum, find all unique pairs that sum to target
- Return pairs as a list of arrays
- Each pair should appear only once (avoid duplicates)

APPROACH:
- Use HashSet to track seen numbers
- For each number, check if (target - number) exists in set
- Use another HashSet to track already added pairs

DATA STRUCTURES:
- HashSet<Integer>: to track seen numbers
- HashSet<String>: to track added pairs (avoid duplicates)
- List<int[]>: to store result pairs

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n)
*/

package com.example.javas.medium;

import java.util.*;

public class M007_PairSum {
    
    public static List<int[]> findPairs(int[] arr, int target) {
        // TODO: Implement pair sum finder
        // 1. Create result list, seen set, and pairs set
        // 2. Loop through array:
        //    - Calculate complement = target - current
        //    - If complement in seen set and pair not added yet:
        //      - Add pair to result
        //      - Mark pair as added
        //    - Add current to seen set
        // 3. Return result list
        
        return new ArrayList<>();
    }
    
    // TEST CASES
    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15, 3};
        List<int[]> result1 = findPairs(arr1, 9);
        System.out.print("Array [2,7,11,15,3], target 9: ");
        printPairs(result1);
        
        int[] arr2 = {1, 5, 7, -1, 5};
        List<int[]> result2 = findPairs(arr2, 6);
        System.out.print("Array [1,5,7,-1,5], target 6: ");
        printPairs(result2);
        
        int[] arr3 = {1, 2, 3, 4};
        List<int[]> result3 = findPairs(arr3, 10);
        System.out.print("Array [1,2,3,4], target 10: ");
        printPairs(result3);
    }
    
    private static void printPairs(List<int[]> pairs) {
        if (pairs.isEmpty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < pairs.size(); i++) {
            System.out.print("[" + pairs.get(i)[0] + "," + pairs.get(i)[1] + "]");
            if (i < pairs.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
