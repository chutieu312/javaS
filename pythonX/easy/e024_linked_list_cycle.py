"""
E024: Linked List Cycle Detection

Summary:
Linked List Cycle Detection

Requirements:
- Given head of a linked list
- Determine if the linked list has a cycle in it
- Return true if there is a cycle, false otherwise
- A cycle exists if a node can be reached again by following next pointers

Approach:
- Use Floyd's Cycle Detection (slow and fast pointers)
- Slow moves one step, fast moves two steps
- If they meet, there's a cycle

Big O Analysis:
Time Complexity: O(n) where n is number of nodes
Space Complexity: O(1)
"""

from typing import Optional


class ListNode:
    """Definition for singly-linked list node."""
    def __init__(self, val: int = 0, next: 'Optional[ListNode]' = None):
        self.val = val
        self.next = next


def has_cycle(head: Optional[ListNode]) -> bool:
    """
    TODO: Implement cycle detection
    1. If head is None or head.next is None, return False
    2. Initialize slow = head, fast = head
    3. While fast is not None and fast.next is not None:
       - Move slow one step: slow = slow.next
       - Move fast two steps: fast = fast.next.next
       - If slow == fast, return True (cycle found)
    4. Return False (no cycle)
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    # List with cycle: 3 -> 2 -> 0 -> -4 -> (back to 2)
    head1 = ListNode(3)
    node2 = ListNode(2)
    node3 = ListNode(0)
    node4 = ListNode(-4)
    head1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node2  # creates cycle
    print(f"List with cycle: {has_cycle(head1)}")
    
    # List without cycle: 1 -> 2
    head2 = ListNode(1)
    head2.next = ListNode(2)
    print(f"List without cycle: {has_cycle(head2)}")
    
    # Single node without cycle
    head3 = ListNode(1)
    print(f"Single node, no cycle: {has_cycle(head3)}")
    
    # None list
    print(f"None list: {has_cycle(None)}")
