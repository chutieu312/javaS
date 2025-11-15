"""
E023: Merge Two Sorted Linked Lists

Summary:
Merge Two Sorted Linked Lists

Requirements:
- Given the heads of two sorted linked lists list1 and list2
- Merge the two lists into one sorted list
- Return the head of the merged linked list

Approach:
- Use a dummy node to simplify edge cases
- Use two pointers to compare and merge nodes

Big O Analysis:
Time Complexity: O(n + m) where n, m are list lengths
Space Complexity: O(1)
"""

from typing import Optional


class ListNode:
    """Definition for singly-linked list node."""
    def __init__(self, val: int = 0, next: 'Optional[ListNode]' = None):
        self.val = val
        self.next = next


def merge_two_lists(list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
    """
    TODO: Implement merge two sorted lists
    1. Create dummy node: dummy = ListNode(0)
    2. Create current pointer: current = dummy
    3. While both list1 and list2 are not None:
       - If list1.val <= list2.val:
         - current.next = list1, move list1
       - Else:
         - current.next = list2, move list2
       - Move current
    4. Attach remaining nodes: current.next = list1 if list1 else list2
    5. Return dummy.next
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
    
    # List 1: 1 -> 2 -> 4
    list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next.next = ListNode(4)
    
    # List 2: 1 -> 3 -> 4
    list2 = ListNode(1)
    list2.next = ListNode(3)
    list2.next.next = ListNode(4)
    
    print("List 1: ", end="")
    print_list(list1)
    print("List 2: ", end="")
    print_list(list2)
    merged1 = merge_two_lists(list1, list2)
    print("Merged: ", end="")
    print_list(merged1)
    print()
    
    # Empty lists
    merged2 = merge_two_lists(None, None)
    print("Merge None + None: ", end="")
    print_list(merged2)
    
    # One empty list
    list3 = ListNode(0)
    merged3 = merge_two_lists(None, list3)
    print("Merge None + [0]: ", end="")
    print_list(merged3)
