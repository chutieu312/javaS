"""
E026: Baseball Game - Calculate Score

Summary:
Baseball Game

Requirements:
- You're keeping score for a baseball game with special rules
- Given a list of strings ops, apply the following operations:
  - Integer (like "5" or "-2"): Record a new score of that value
  - "+": Record sum of previous two scores
  - "D": Record double of previous score
  - "C": Remove previous score (invalidate)
- Return the sum of all scores after all operations

Approach:
- Use a list as stack to track valid scores
- Process each operation and update stack accordingly
- Sum all remaining scores in stack

Data Structures:
- list: to track scores (used as stack)

Big O Analysis:
Time Complexity: O(n) where n is number of operations
Space Complexity: O(n)
"""

def cal_points(operations: list[str]) -> int:
    """
    TODO: Implement baseball game scorer
    1. Create list to use as stack
    2. For each operation:
       - If "+": append (stack[-1] + stack[-2]) to stack
       - If "D": append (stack[-1] * 2) to stack
       - If "C": pop from stack
       - Otherwise: append int(operation) to stack
    3. Sum all values in stack and return
    """
    pass


if __name__ == "__main__":
    # Test Cases
    ops1 = ["5", "2", "C", "D", "+"]
    print(f"Operations ['5','2','C','D','+']: {cal_points(ops1)}")  # 30
    
    ops2 = ["5", "-2", "4", "C", "D", "9", "+", "+"]
    print(f"Operations ['5','-2','4','C','D','9','+','+']: {cal_points(ops2)}")  # 27
    
    ops3 = ["1", "C"]
    print(f"Operations ['1','C']: {cal_points(ops3)}")  # 0
    
    ops4 = ["1"]
    print(f"Operations ['1']: {cal_points(ops4)}")  # 1
