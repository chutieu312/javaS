/*
MEDIUM PROBLEM (Simplified for 25 min):
Merge overlapping intervals

REQUIREMENTS:
- Given a list of intervals, merge all overlapping intervals
- Return the merged intervals
- Each interval is [start, end]

APPROACH:
- Sort intervals by start time
- Iterate and merge overlapping intervals

DATA STRUCTURES:
- List<int[]>: to store result intervals

TIME COMPLEXITY: O(n log n) due to sorting
SPACE COMPLEXITY: O(n) for result list
*/

package com.example.javas.medium;

import java.util.*;

public class M011_MergeIntervals {
    
    public static List<int[]> merge(int[][] intervals) {
        // TODO: Implement interval merging
        // 1. If empty, return empty list
        // 2. Sort intervals by start time: Arrays.sort(intervals, (a, b) -> a[0] - b[0])
        // 3. Create result list, add first interval
        // 4. For each remaining interval:
        //    - Get last interval in result
        //    - If current.start <= last.end (overlap):
        //      - Merge: update last.end = Math.max(last.end, current.end)
        //    - Else: add current interval to result
        // 5. Return result
        
        return new ArrayList<>();
    }
    
    // TEST CASES
    public static void main(String[] args) {
        int[][] intervals1 = {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.print("Merge [[1,3],[2,6],[8,10],[15,18]]: ");
        printIntervals(merge(intervals1));
        
        int[][] intervals2 = {{1,4}, {4,5}};
        System.out.print("Merge [[1,4],[4,5]]: ");
        printIntervals(merge(intervals2));
        
        int[][] intervals3 = {{1,4}, {0,4}};
        System.out.print("Merge [[1,4],[0,4]]: ");
        printIntervals(merge(intervals3));
    }
    
    private static void printIntervals(List<int[]> intervals) {
        System.out.print("[");
        for (int i = 0; i < intervals.size(); i++) {
            System.out.print("[" + intervals.get(i)[0] + "," + intervals.get(i)[1] + "]");
            if (i < intervals.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
