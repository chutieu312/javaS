/*
EASY PROBLEM (Simplified for 15 min):
Linked List Cycle Detection

REQUIREMENTS:
- Given head of a linked list
- Determine if the linked list has a cycle in it
- Return true if there is a cycle, false otherwise
- A cycle exists if a node can be reached again by following next pointers

APPROACH:
- Use Floyd's Cycle Detection (slow and fast pointers)
- Slow moves one step, fast moves two steps
- If they meet, there's a cycle

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

public class E024_LinkedListCycle {
    
    // ListNode definition
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static boolean hasCycle(ListNode head) {
        // TODO: Implement cycle detection
        // 1. If head is null or head.next is null, return false
        // 2. Initialize slow = head, fast = head
        // 3. While fast != null and fast.next != null:
        //    - Move slow one step: slow = slow.next
        //    - Move fast two steps: fast = fast.next.next
        //    - If slow == fast, return true (cycle found)
        // 4. Return false (no cycle)
        
        return false;
    }
    
    // TEST CASES
    public static void main(String[] args) {
        // List with cycle: 3 -> 2 -> 0 -> -4 -> (back to 2)
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // creates cycle
        System.out.println("List with cycle: " + hasCycle(head1));
        
        // List without cycle: 1 -> 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println("List without cycle: " + hasCycle(head2));
        
        // Single node without cycle
        ListNode head3 = new ListNode(1);
        System.out.println("Single node, no cycle: " + hasCycle(head3));
        
        // Null list
        System.out.println("Null list: " + hasCycle(null));
    }
}
