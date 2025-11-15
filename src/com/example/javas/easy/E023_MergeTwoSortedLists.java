/*
EASY PROBLEM (Simplified for 15 min):
Merge Two Sorted Linked Lists

REQUIREMENTS:
- Given the heads of two sorted linked lists list1 and list2
- Merge the two lists into one sorted list
- Return the head of the merged linked list

APPROACH:
- Use a dummy node to simplify edge cases
- Use two pointers to compare and merge nodes

TIME COMPLEXITY: O(n + m) where n, m are list lengths
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

public class E023_MergeTwoSortedLists {
    
    // ListNode definition
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TODO: Implement merge two sorted lists
        // 1. Create dummy node: dummy = new ListNode(0)
        // 2. Create current pointer: current = dummy
        // 3. While both list1 and list2 are not null:
        //    - If list1.val <= list2.val:
        //      - current.next = list1, move list1
        //    - Else:
        //      - current.next = list2, move list2
        //    - Move current
        // 4. Attach remaining nodes: current.next = (list1 != null) ? list1 : list2
        // 5. Return dummy.next
        
        return null;
    }
    
    // Helper to print list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // List 1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        
        // List 2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        
        System.out.print("List 1: ");
        printList(list1);
        System.out.print("List 2: ");
        printList(list2);
        ListNode merged1 = mergeTwoLists(list1, list2);
        System.out.print("Merged: ");
        printList(merged1);
        System.out.println();
        
        // Empty lists
        ListNode merged2 = mergeTwoLists(null, null);
        System.out.print("Merge null + null: ");
        printList(merged2);
        
        // One empty list
        ListNode list3 = new ListNode(0);
        ListNode merged3 = mergeTwoLists(null, list3);
        System.out.print("Merge null + [0]: ");
        printList(merged3);
    }
}
