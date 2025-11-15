"""
E025: Min Stack - Design a Stack with Min Operation

Summary:
Min Stack

Requirements:
- Design a stack that supports push, pop, top, and retrieving the minimum element
- All operations must run in O(1) time
- Implement MinStack class with:
  - push(val): Push element val onto stack
  - pop(): Remove the element on top of the stack
  - top(): Get the top element
  - get_min(): Retrieve the minimum element in the stack

Approach:
- Use two lists: one for values, one for minimums
- Track minimum at each level

Data Structures:
- list: main stack for values
- list: auxiliary stack for minimums

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(n)
"""


class MinStack:
    
    def __init__(self):
        """
        TODO: Initialize both stacks (lists)
        """
        pass
    
    def push(self, val: int) -> None:
        """
        TODO: Implement push
        1. Append val to main stack
        2. If min_stack is empty or val <= current min:
           - Append val to min_stack
        """
        pass
    
    def pop(self) -> None:
        """
        TODO: Implement pop
        1. Pop from main stack
        2. If popped value equals top of min_stack:
           - Pop from min_stack too
        """
        pass
    
    def top(self) -> int:
        """
        TODO: Return top element from main stack
        """
        pass
    
    def get_min(self) -> int:
        """
        TODO: Return top element from min_stack
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    min_stack = MinStack()
    
    min_stack.push(-2)
    min_stack.push(0)
    min_stack.push(-3)
    print(f"Get min: {min_stack.get_min()}")  # -3
    
    min_stack.pop()
    print(f"Top: {min_stack.top()}")          # 0
    print(f"Get min: {min_stack.get_min()}")  # -2
    
    print()
    
    min_stack2 = MinStack()
    min_stack2.push(1)
    min_stack2.push(2)
    min_stack2.push(-1)
    print(f"Get min: {min_stack2.get_min()}")  # -1
    min_stack2.pop()
    print(f"Get min: {min_stack2.get_min()}")  # 1
