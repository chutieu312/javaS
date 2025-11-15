"""
M024: Design Logger Rate Limiter

Summary:
Design logger that prints messages at most every 10 seconds.

Requirements:
Implement Logger class:
- should_print_message(timestamp, message): Return True if should print

Approach:
Use dict to track last print timestamp for each message.

Data Structures:
- dict[str, int]: message -> last print timestamp

Big O Analysis:
Time Complexity: O(1)
Space Complexity: O(M) where M is unique messages
"""


class Logger:
    
    def __init__(self):
        """
        TODO: Initialize dict to store message -> last timestamp
        """
        pass
    
    def should_print_message(self, timestamp: int, message: str) -> bool:
        """
        TODO: Check if message should be printed
        1. Check if message in dict
        2. If not in dict OR (timestamp - last_timestamp) >= 10:
           - Update dict with timestamp
           - Return True
        3. Otherwise return False
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic rate limiting")
    logger1 = Logger()
    print(logger1.should_print_message(1, "foo"))   # True
    print(logger1.should_print_message(2, "bar"))   # True
    print(logger1.should_print_message(3, "foo"))   # False (only 2 sec)
    print(logger1.should_print_message(8, "bar"))   # False (only 6 sec)
    print(logger1.should_print_message(10, "foo"))  # False (only 9 sec)
    print(logger1.should_print_message(11, "foo"))  # True (10 sec passed)
    
    print("\nTest 2: Multiple messages")
    logger2 = Logger()
    print(logger2.should_print_message(0, "a"))     # True
    print(logger2.should_print_message(0, "b"))     # True
    print(logger2.should_print_message(0, "c"))     # True
    print(logger2.should_print_message(5, "a"))     # False
    print(logger2.should_print_message(10, "a"))    # True
    print(logger2.should_print_message(10, "b"))    # True
    
    print("\nTest 3: Exact 10 second boundary")
    logger3 = Logger()
    print(logger3.should_print_message(5, "test"))  # True
    print(logger3.should_print_message(14, "test")) # False (9 sec)
    print(logger3.should_print_message(15, "test")) # True (exactly 10)
    
    print("\nTest 4: Same timestamp")
    logger4 = Logger()
    print(logger4.should_print_message(1, "x"))     # True
    print(logger4.should_print_message(1, "x"))     # False (same time)
    print(logger4.should_print_message(1, "y"))     # True (different msg)
