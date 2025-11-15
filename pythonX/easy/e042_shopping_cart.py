"""
E042: Design Shopping Cart System

Summary:
Design a shopping cart system for adding, removing, and updating items.

Requirements:
Implement the ShoppingCart class:
- add_item(product_id, name, price, quantity): Adds item (accumulates quantity)
- remove_item(product_id): Removes product completely
- update_quantity(product_id, new_quantity): Updates quantity (0 removes)
- get_total(): Returns total price
- get_item_count(): Returns number of unique products
- get_quantity(product_id): Returns quantity or None

Approach:
Use dict to map product_id -> CartItem with name, price, quantity

Data Structures:
- CartItem class with name, price, quantity
- dict[int, CartItem]: product_id -> CartItem

Big O Analysis:
Time Complexity: 
- add_item, remove_item, update_quantity, get_item_count: O(1)
- get_total: O(n)
Space Complexity: O(n) where n is number of unique products
"""


class ShoppingCart:
    
    class CartItem:
        def __init__(self, name: str, price: int, quantity: int):
            """
            TODO: Initialize CartItem
            Set name, price, and quantity
            """
            pass
    
    def __init__(self):
        """
        TODO: Initialize the dict to store cart items
        """
        pass
    
    def add_item(self, product_id: int, name: str, price: int, quantity: int) -> bool:
        """
        TODO: Add item to cart
        1. If product exists, add to quantity
        2. Else, create new CartItem
        3. Return True
        """
        pass
    
    def remove_item(self, product_id: int) -> bool:
        """
        TODO: Remove item from cart
        Return True if removed, False if not exists
        """
        pass
    
    def update_quantity(self, product_id: int, new_quantity: int) -> bool:
        """
        TODO: Update item quantity
        1. Check if product exists
        2. If new_quantity is 0, remove item
        3. Else, update quantity
        4. Return True if exists, False otherwise
        """
        pass
    
    def get_total(self) -> int:
        """
        TODO: Calculate total price
        Sum (price * quantity) for all items
        """
        pass
    
    def get_item_count(self) -> int:
        """
        TODO: Get number of unique products
        Return size of dict
        """
        pass
    
    def get_quantity(self, product_id: int) -> int | None:
        """
        TODO: Get quantity of specific product
        Return quantity if exists, None otherwise
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic operations")
    cart1 = ShoppingCart()
    cart1.add_item(1, "Apple", 2, 3)
    print(cart1.get_total())                     # Expected: 6
    cart1.add_item(2, "Banana", 1, 5)
    print(cart1.get_total())                     # Expected: 11
    print(cart1.get_item_count())                # Expected: 2
    
    print("\nTest 2: Add same product")
    cart2 = ShoppingCart()
    cart2.add_item(1, "Apple", 2, 3)
    cart2.add_item(1, "Apple", 2, 2)
    print(cart2.get_quantity(1))                 # Expected: 5
    print(cart2.get_total())                     # Expected: 10
    print(cart2.get_item_count())                # Expected: 1
    
    print("\nTest 3: Update quantity")
    cart3 = ShoppingCart()
    cart3.add_item(1, "Apple", 5, 10)
    print(cart3.get_total())                     # Expected: 50
    cart3.update_quantity(1, 3)
    print(cart3.get_total())                     # Expected: 15
    cart3.update_quantity(1, 0)
    print(cart3.get_item_count())                # Expected: 0
    
    print("\nTest 4: Remove item")
    cart4 = ShoppingCart()
    cart4.add_item(1, "A", 10, 2)
    cart4.add_item(2, "B", 5, 3)
    print(cart4.get_total())                     # Expected: 35
    print(cart4.remove_item(1))                  # Expected: True
    print(cart4.get_total())                     # Expected: 15
    print(cart4.get_item_count())                # Expected: 1
    print(cart4.remove_item(99))                 # Expected: False
    
    print("\nTest 5: Invalid operations")
    cart5 = ShoppingCart()
    print(cart5.update_quantity(99, 5))          # Expected: False
    print(cart5.get_quantity(99))                # Expected: None
    print(cart5.get_total())                     # Expected: 0
    print(cart5.get_item_count())                # Expected: 0
