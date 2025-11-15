/*
EASY PROBLEM (Simplified for 15 min):
Reverse Linked List

REQUIREMENTS:
- Given the head of a singly linked list
- Reverse the list and return the new head

APPROACH:
- Use three pointers: prev, current, next
- Iterate through list, reversing pointers

TIME COMPLEXITY: O(n) where n is number of nodes
SPACE COMPLEXITY: O(1)
*/

package com.example.javas.easy;

public class E022_ReverseLinkedList {
    
    // ListNode definition
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static ListNode reverseList(ListNode head) {
        // TODO: Implement linked list reversal
        // 1. Initialize prev = null, current = head
        // 2. While current is not null:
        //    - Save next: next = current.next
        //    - Reverse pointer: current.next = prev
        //    - Move prev: prev = current
        //    - Move current: current = next
        // 3. Return prev (new head)
        
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
        // List 1: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        
        System.out.print("Original list: ");
        printList(head1);
        ListNode reversed1 = reverseList(head1);
        System.out.print("Reversed list: ");
        printList(reversed1);
        System.out.println();
        
        // List 2: 1 -> 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.print("Original list: ");
        printList(head2);
        ListNode reversed2 = reverseList(head2);
        System.out.print("Reversed list: ");
        printList(reversed2);
        System.out.println();
        
        // List 3: null
        System.out.print("Reversed null list: ");
        printList(reverseList(null));
    }
}
