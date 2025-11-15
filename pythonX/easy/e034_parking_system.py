"""
E034: Design Parking System
Difficulty: Easy (System Design)
Time Target: 15 minutes

Problem:
Design a parking system for a parking lot. The parking lot has three kinds of parking 
spaces: big, medium, and small, with a fixed number of slots for each size.

Requirements:
Implement the ParkingSystem class:
- __init__(big, medium, small): Initializes object with the number of slots for each parking space
- add_car(car_type): Checks whether there is a parking space available for the car type.
  car_type can be 1 (big), 2 (medium), or 3 (small). A car can only park in a parking 
  space of its car_type. If there is no space available, return False, else park the car 
  and return True.

Constraints:
- 0 <= big, medium, small <= 1000
- car_type is 1, 2, or 3
- At most 1000 calls will be made to add_car

Examples:
parking_system = ParkingSystem(1, 1, 0)
parking_system.add_car(1)  # return True (park big car in big slot)
parking_system.add_car(2)  # return True (park medium car in medium slot)
parking_system.add_car(3)  # return False (no small slots available)
parking_system.add_car(1)  # return False (no more big slots available)

Approach:
Simple counter approach:
1. Store available slots for each car type
2. When a car arrives, check if slots available for its type
3. If yes, decrement counter and return True
4. If no, return False

Data Structures:
- Three integer variables to track available slots
- Or use a list of size 4 (ignoring index 0 for easier mapping)

Time Complexity: O(1) for add_car
Space Complexity: O(1)
"""

class ParkingSystem:
    
    def __init__(self, big: int, medium: int, small: int):
        """
        TODO: Initialize the available slots for each type
        - Store big, medium, small counts
        - Or use a list: [0, big, medium, small] for easier indexing
        """
        pass
    
    def add_car(self, car_type: int) -> bool:
        """
        TODO: Check and park car
        1. Based on car_type (1=big, 2=medium, 3=small):
           - Check if corresponding slot count > 0
           - If yes: decrement count and return True
           - If no: return False
        """
        return False


# Test cases
if __name__ == "__main__":
    # Test case 1: Basic parking
    print("Test 1: Basic parking")
    ps1 = ParkingSystem(1, 1, 0)
    print(ps1.add_car(1))  # Expected: True
    print(ps1.add_car(2))  # Expected: True
    print(ps1.add_car(3))  # Expected: False
    print(ps1.add_car(1))  # Expected: False
    
    # Test case 2: Multiple slots
    print("\\nTest 2: Multiple slots")
    ps2 = ParkingSystem(2, 0, 3)
    print(ps2.add_car(1))  # Expected: True
    print(ps2.add_car(1))  # Expected: True
    print(ps2.add_car(1))  # Expected: False
    print(ps2.add_car(3))  # Expected: True
    print(ps2.add_car(3))  # Expected: True
    print(ps2.add_car(3))  # Expected: True
    print(ps2.add_car(3))  # Expected: False
    
    # Test case 3: All zeros
    print("\\nTest 3: No slots")
    ps3 = ParkingSystem(0, 0, 0)
    print(ps3.add_car(1))  # Expected: False
    print(ps3.add_car(2))  # Expected: False
    print(ps3.add_car(3))  # Expected: False
    
    # Test case 4: Large capacity
    print("\\nTest 4: Large capacity")
    ps4 = ParkingSystem(100, 50, 25)
    print(ps4.add_car(1))  # Expected: True
    print(ps4.add_car(2))  # Expected: True
    print(ps4.add_car(3))  # Expected: True
