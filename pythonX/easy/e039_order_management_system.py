"""
E039: Design Order Management System

Summary:
Design a simple order management system for creating orders and adding items.

Requirements:
Implement the OrderSystem class:
- create_order(order_id): Creates new order
- add_item(order_id, item, price): Adds item to order
- get_total(order_id): Returns total price or None
- complete_order(order_id): Marks order as completed
- is_completed(order_id): Checks if order is completed

Approach:
Use dict to map order_id -> Order object with total and completed status

Data Structures:
- Order class with total and completed flag
- dict[int, Order]: order_id -> Order

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(n) where n is number of orders
"""


class OrderSystem:
    
    class Order:
        def __init__(self):
            """
            TODO: Initialize Order
            Set total = 0 and completed = False
            """
            pass
    
    def __init__(self):
        """
        TODO: Initialize the dict to store orders
        """
        pass
    
    def create_order(self, order_id: int) -> bool:
        """
        TODO: Create new order
        1. Check if order_id exists
        2. If exists, return False
        3. Create Order and add to dict, return True
        """
        pass
    
    def add_item(self, order_id: int, item: str, price: int) -> bool:
        """
        TODO: Add item to order
        1. Check if order exists
        2. If completed, return False
        3. Add price to total and return True
        """
        pass
    
    def get_total(self, order_id: int) -> int | None:
        """
        TODO: Get order total
        Return total if exists, None otherwise
        """
        pass
    
    def complete_order(self, order_id: int) -> bool:
        """
        TODO: Mark order as completed
        1. Check if order exists
        2. If already completed, return False
        3. Mark as completed and return True
        """
        pass
    
    def is_completed(self, order_id: int) -> bool:
        """
        TODO: Check if order is completed
        Return completed status or False if not exists
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic operations")
    os1 = OrderSystem()
    print(os1.create_order(1))             # Expected: True
    print(os1.add_item(1, "Burger", 10))   # Expected: True
    print(os1.add_item(1, "Fries", 5))     # Expected: True
    print(os1.get_total(1))                # Expected: 15
    print(os1.complete_order(1))           # Expected: True
    print(os1.is_completed(1))             # Expected: True
    
    print("\nTest 2: Completed order")
    os2 = OrderSystem()
    os2.create_order(1)
    os2.add_item(1, "Item", 10)
    os2.complete_order(1)
    print(os2.add_item(1, "Extra", 5))     # Expected: False
    print(os2.get_total(1))                # Expected: 10
    print(os2.complete_order(1))           # Expected: False
    
    print("\nTest 3: Multiple orders")
    os3 = OrderSystem()
    os3.create_order(1)
    os3.create_order(2)
    os3.add_item(1, "A", 10)
    os3.add_item(2, "B", 20)
    os3.add_item(1, "C", 5)
    print(os3.get_total(1))                # Expected: 15
    print(os3.get_total(2))                # Expected: 20
    print(os3.is_completed(1))             # Expected: False
    os3.complete_order(2)
    print(os3.is_completed(2))             # Expected: True
    
    print("\nTest 4: Invalid operations")
    os4 = OrderSystem()
    print(os4.add_item(99, "X", 10))       # Expected: False
    print(os4.get_total(99))               # Expected: None
    print(os4.complete_order(99))          # Expected: False
    print(os4.is_completed(99))            # Expected: False
    
    print("\nTest 5: Duplicate order")
    os5 = OrderSystem()
    print(os5.create_order(1))             # Expected: True
    print(os5.create_order(1))             # Expected: False
    os5.add_item(1, "Item", 25)
    print(os5.get_total(1))                # Expected: 25
