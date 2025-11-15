"""
E028: Implement Queue using Stacks

Summary:
Implement Queue using Stacks

Requirements:
- Implement a first in first out (FIFO) queue using only two stacks
- Implement MyQueue class with:
  - push(x): Push element x to the back of queue
  - pop(): Remove element from front of queue and return it
  - peek(): Get the front element
  - empty(): Return whether the queue is empty

Approach:
- Use two stacks (lists): input stack and output stack
- Push operations go to input stack
- Pop/peek operations use output stack (transfer if needed)

Data Structures:
- list: input stack
- list: output stack

Big O Analysis:
Time Complexity: 
- push: O(1)
- pop/peek: O(1) amortized
Space Complexity: O(n)
"""


class MyQueue:
    
    def __init__(self):
        """
        TODO: Initialize both stacks (lists)
        """
        pass
    
    def push(self, x: int) -> None:
        """
        TODO: Implement push
        Simply append to input_stack
        """
        pass
    
    def pop(self) -> int:
        """
        TODO: Implement pop
        1. Call peek() to ensure output_stack has elements
        2. Pop and return from output_stack
        """
        pass
    
    def peek(self) -> int:
        """
        TODO: Implement peek
        1. If output_stack is empty:
           - Transfer all elements from input_stack to output_stack
        2. Return top of output_stack (without removing)
        """
        pass
    
    def empty(self) -> bool:
        """
        TODO: Check if both stacks are empty
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    queue = MyQueue()
    
    queue.push(1)
    queue.push(2)
    print(f"Peek: {queue.peek()}")   # 1
    print(f"Pop: {queue.pop()}")     # 1
    print(f"Empty: {queue.empty()}")  # False
    print(f"Peek: {queue.peek()}")   # 2
    
    print()
    
    queue2 = MyQueue()
    queue2.push(1)
    queue2.push(2)
    queue2.push(3)
    print(f"Pop: {queue2.pop()}")    # 1
    queue2.push(4)
    print(f"Pop: {queue2.pop()}")    # 2
    print(f"Pop: {queue2.pop()}")    # 3
    print(f"Pop: {queue2.pop()}")    # 4
    print(f"Empty: {queue2.empty()}")  # True
