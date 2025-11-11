/*
Summary

Given an ArrayList of integers, perform the following operations:
1. Remove all duplicate elements (keep only the first occurrence)
2. Sort the remaining elements in ascending order
3. Return the modified ArrayList

Input:
- An ArrayList of integers (may contain duplicates)

Output:
- An ArrayList with duplicates removed and elements sorted

Constraints:
- 0 ≤ ArrayList size ≤ 1000
- -10^6 ≤ element value ≤ 10^6

Approach Exploration

LinkedHashSet + Sort (chosen):
- Use LinkedHashSet to remove duplicates while preserving first occurrence
- Convert back to ArrayList
- Use Collections.sort() to sort in ascending order
- Time: O(n log n), Space: O(n)
- Simple and efficient

Two-pointer approach:
- Sort first, then remove adjacent duplicates
- Time: O(n log n), Space: O(1) if in-place
- More complex implementation

HashMap frequency tracking:
- Count frequencies, rebuild list with unique elements
- Then sort
- Time: O(n log n), Space: O(n)
- Unnecessary extra work

Plan (with Example)

Input: [5, 2, 8, 2, 9, 5, 3, 8]

Step 1: Remove duplicates (keep first occurrence)
- Add to LinkedHashSet: {5, 2, 8, 9, 3}
- Result: [5, 2, 8, 9, 3]

Step 2: Sort in ascending order
- Sort: [2, 3, 5, 8, 9]

Output: [2, 3, 5, 8, 9]

Example 2:
Input: [1, 1, 1, 1]
Output: [1]

Example 3:
Input: []
Output: []

Pseudocode
function removeDuplicatesAndSort(list):
    if list is empty:
        return list
    
    // Remove duplicates using LinkedHashSet
    set = new LinkedHashSet()
    for each element in list:
        set.add(element)
    
    // Convert back to ArrayList
    result = new ArrayList(set)
    
    // Sort in ascending order
    Collections.sort(result)
    
    return result

Big O Analysis

Time Complexity:
O(n) - Adding to LinkedHashSet (n elements)
O(n) - Converting set to ArrayList
O(n log n) - Sorting
Overall: O(n log n) - dominated by sorting

Space Complexity:
O(n) - LinkedHashSet stores at most n unique elements
O(n) - Result ArrayList
Overall: O(n)
*/

package com.example.javas.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class E005_ArrayListDuplicateSort {
    
    public static void main(String[] args) {
        // Test Case 1: Regular case with duplicates
        System.out.println("Test Case 1:");
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 2, 8, 2, 9, 5, 3, 8));
        System.out.println("Input: " + list1);
        ArrayList<Integer> result1 = solution(list1);
        System.out.println("Output: " + result1);
        System.out.println("Expected: [2, 3, 5, 8, 9]");
        System.out.println();
        
        // Test Case 2: All same elements
        System.out.println("Test Case 2:");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
        System.out.println("Input: " + list2);
        ArrayList<Integer> result2 = solution(list2);
        System.out.println("Output: " + result2);
        System.out.println("Expected: [1]");
        System.out.println();
        
        // Test Case 3: Empty list
        System.out.println("Test Case 3:");
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println("Input: " + list3);
        ArrayList<Integer> result3 = solution(list3);
        System.out.println("Output: " + result3);
        System.out.println("Expected: []");
        System.out.println();
        
        // Test Case 4: No duplicates
        System.out.println("Test Case 4:");
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(3, 1, 4, 2, 5));
        System.out.println("Input: " + list4);
        ArrayList<Integer> result4 = solution(list4);
        System.out.println("Output: " + result4);
        System.out.println("Expected: [1, 2, 3, 4, 5]");
        System.out.println();
        
        // Test Case 5: Negative numbers
        System.out.println("Test Case 5:");
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(-5, 3, -5, 0, 3, -1));
        System.out.println("Input: " + list5);
        ArrayList<Integer> result5 = solution(list5);
        System.out.println("Output: " + result5);
        System.out.println("Expected: [-5, -1, 0, 3]");
    }
    
    public static ArrayList<Integer> solution(ArrayList<Integer> list) {
        // DONE: Implement the remove duplicates and sort logic
        // 1. Use LinkedHashSet to remove duplicates while preserving first occurrence
        // 2. Convert the set back to ArrayList
        // 3. Sort the ArrayList using Collections.sort()
        // 4. Return the sorted ArrayList
        
        // Handle empty list
        if (list.isEmpty()) {
            return list;
        }
        
        // Remove duplicates using LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        
        // Convert back to ArrayList
        ArrayList<Integer> result = new ArrayList<>(set);
        
        // Sort in ascending order
        Collections.sort(result);
        
        return result;
    }
}
