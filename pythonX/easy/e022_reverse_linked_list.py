"""
E022: Reverse Linked List

Summary:
Reverse Linked List

Requirements:
- Given the head of a singly linked list
- Reverse the list and return the new head

Approach:
- Use three pointers: prev, current, next
- Iterate through list, reversing pointers

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


def reverse_list(head: Optional[ListNode]) -> Optional[ListNode]:
    """
    TODO: Implement linked list reversal
    1. Initialize prev = None, current = head
    2. While current is not None:
       - Save next: next_node = current.next
       - Reverse pointer: current.next = prev
       - Move prev: prev = current
       - Move current: current = next_node
    3. Return prev (new head)
    """
    pass


def print_list(head: Optional[ListNode]) -> None:
    """Helper to print list."""
    current = head
    while current:
        print(current.val, end="")
        if current.next:
            print(" -> ", end="")
        current = current.next
    print()


if __name__ == "__main__":
    # Test Cases
    
    # List 1: 1 -> 2 -> 3 -> 4 -> 5
    head1 = ListNode(1)
    head1.next = ListNode(2)
    head1.next.next = ListNode(3)
    head1.next.next.next = ListNode(4)
    head1.next.next.next.next = ListNode(5)
    
    print("Original list: ", end="")
    print_list(head1)
    reversed1 = reverse_list(head1)
    print("Reversed list: ", end="")
    print_list(reversed1)
    print()
    
    # List 2: 1 -> 2
    head2 = ListNode(1)
    head2.next = ListNode(2)
    print("Original list: ", end="")
    print_list(head2)
    reversed2 = reverse_list(head2)
    print("Reversed list: ", end="")
    print_list(reversed2)
    print()
    
    # List 3: None
    print("Reversed null list: ", end="")
    print_list(reverse_list(None))
