"""
M025: Design Moving Average from Data Stream

Summary:
Calculate moving average of sliding window.

Requirements:
Implement MovingAverage class:
- __init__(size): Initialize with window size
- next(val): Return moving average after adding val

Approach:
Use deque to maintain sliding window, track running sum.

Data Structures:
- deque[int]: store values in window
- int: window size limit
- float: running sum

Big O Analysis:
Time Complexity: O(1) for next
Space Complexity: O(size)
"""

from collections import deque


class MovingAverage:
    
    def __init__(self, size: int):
        """
        TODO: Initialize data structures
        - Create deque
        - Store size limit
        - Initialize sum to 0
        """
        pass
    
    def next(self, val: int) -> float:
        """
        TODO: Add value and calculate average
        1. If queue size equals limit:
           - Remove oldest value
           - Subtract from sum
        2. Add new value to queue
        3. Add to sum
        4. Return average (sum / queue size)
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Window size 3")
    ma1 = MovingAverage(3)
    print(f"{ma1.next(1)}")     # Expected: 1.0
    print(f"{ma1.next(10)}")    # Expected: 5.5
    print(f"{ma1.next(3)}")     # Expected: 4.666...
    print(f"{ma1.next(5)}")     # Expected: 6.0
    
    print("\nTest 2: Window size 2")
    ma2 = MovingAverage(2)
    print(f"{ma2.next(1)}")     # Expected: 1.0
    print(f"{ma2.next(3)}")     # Expected: 2.0
    print(f"{ma2.next(5)}")     # Expected: 4.0
    print(f"{ma2.next(7)}")     # Expected: 6.0
    
    print("\nTest 3: Window size 1")
    ma3 = MovingAverage(1)
    print(f"{ma3.next(5)}")     # Expected: 5.0
    print(f"{ma3.next(10)}")    # Expected: 10.0
    print(f"{ma3.next(15)}")    # Expected: 15.0
    
    print("\nTest 4: Negative numbers")
    ma4 = MovingAverage(3)
    print(f"{ma4.next(-1)}")    # Expected: -1.0
    print(f"{ma4.next(2)}")     # Expected: 0.5
    print(f"{ma4.next(-3)}")    # Expected: -0.666...
    print(f"{ma4.next(4)}")     # Expected: 1.0
    
    print("\nTest 5: Window size 5")
    ma5 = MovingAverage(5)
    print(f"{ma5.next(1)}")     # Expected: 1.0
    print(f"{ma5.next(2)}")     # Expected: 1.5
    print(f"{ma5.next(3)}")     # Expected: 2.0
    print(f"{ma5.next(4)}")     # Expected: 2.5
    print(f"{ma5.next(5)}")     # Expected: 3.0
    print(f"{ma5.next(6)}")     # Expected: 4.0
