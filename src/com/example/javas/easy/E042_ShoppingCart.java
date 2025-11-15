package com.example.javas.easy;

import java.util.*;

/**
 * E042: Design Shopping Cart System
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a simple shopping cart system that can add items, remove items, update quantities,
 * and calculate the total price.
 * 
 * Requirements:
 * Implement the ShoppingCart class:
 * - ShoppingCart() Initializes the shopping cart
 * - boolean addItem(int productId, String name, int price, int quantity) Adds a product 
 *   to the cart. If product already exists, add to quantity. Return true on success
 * - boolean removeItem(int productId) Removes the product completely from cart.
 *   Return false if product doesn't exist, else return true
 * - boolean updateQuantity(int productId, int newQuantity) Updates the quantity of a product.
 *   If newQuantity is 0, remove the product. Return false if product doesn't exist, else true
 * - Integer getTotal() Returns the total price of all items in cart (price * quantity for each)
 * - Integer getItemCount() Returns the total number of unique products in cart
 * - Integer getQuantity(int productId) Returns the quantity of the product.
 *   Return null if product doesn't exist
 * 
 * Constraints:
 * - 1 <= productId <= 10^5
 * - 1 <= name.length <= 50
 * - 1 <= price <= 10^4
 * - 0 <= quantity, newQuantity <= 1000
 * - At most 5000 calls will be made to all functions combined
 * 
 * Examples:
 * ShoppingCart cart = new ShoppingCart();
 * cart.addItem(1, "Apple", 2, 3);      // add 3 apples at $2 each
 * cart.getTotal();                     // return 6 (3 * 2)
 * cart.addItem(2, "Banana", 1, 5);     // add 5 bananas at $1 each
 * cart.getTotal();                     // return 11 (6 + 5)
 * cart.getItemCount();                 // return 2 (Apple and Banana)
 * cart.addItem(1, "Apple", 2, 2);      // add 2 more apples (total 5)
 * cart.getQuantity(1);                 // return 5
 * cart.getTotal();                     // return 15 (5*2 + 5*1)
 * cart.updateQuantity(1, 3);           // update apples to 3
 * cart.getTotal();                     // return 11 (3*2 + 5*1)
 * cart.removeItem(2);                  // return true, remove bananas
 * cart.getTotal();                     // return 6 (3*2)
 * cart.getItemCount();                 // return 1
 * 
 * Approach:
 * Use HashMap to store cart items:
 * 1. Create CartItem class with name, price, and quantity
 * 2. Use HashMap<Integer, CartItem> to map productId -> CartItem
 * 3. addItem: if exists, add to quantity; else create new CartItem
 * 4. removeItem: remove from map
 * 5. updateQuantity: update quantity or remove if 0
 * 6. getTotal: sum up (price * quantity) for all items
 * 7. getItemCount: return map size
 * 
 * Data Structures:
 * - CartItem class with name (String), price (int), quantity (int)
 * - HashMap<Integer, CartItem> to map productId -> CartItem
 * 
 * Time Complexity: 
 * - addItem, removeItem, updateQuantity, getItemCount: O(1)
 * - getTotal: O(n) where n is number of unique products
 * 
 * Space Complexity: O(n) where n is number of unique products
 */
public class E042_ShoppingCart {
    
    static class ShoppingCart {
        
        // TODO: Create inner CartItem class
        // - String name
        // - int price (price per unit)
        // - int quantity
        // - Constructor to initialize all fields
        
        // TODO: Declare HashMap to store cart items
        // Map from productId (Integer) to CartItem object
        
        public ShoppingCart() {
            // TODO: Initialize the HashMap
        }
        
        public boolean addItem(int productId, String name, int price, int quantity) {
            // TODO: Add item to cart
            // 1. Check if productId already exists in cart
            // 2. If exists, add quantity to existing item's quantity
            // 3. If not exists, create new CartItem and add to map
            // 4. Return true
            
            return true;
        }
        
        public boolean removeItem(int productId) {
            // TODO: Remove item from cart
            // 1. Check if productId exists
            // 2. If not exists, return false
            // 3. Remove from map and return true
            
            return false;
        }
        
        public boolean updateQuantity(int productId, int newQuantity) {
            // TODO: Update item quantity
            // 1. Check if productId exists
            // 2. If not exists, return false
            // 3. If newQuantity is 0, remove item from cart
            // 4. Otherwise, update the item's quantity
            // 5. Return true
            
            return false;
        }
        
        public Integer getTotal() {
            // TODO: Calculate total price
            // 1. Initialize total to 0
            // 2. Iterate through all items in map
            // 3. For each item, add (price * quantity) to total
            // 4. Return total
            
            return 0;
        }
        
        public Integer getItemCount() {
            // TODO: Get number of unique products
            // Return the size of the map
            
            return 0;
        }
        
        public Integer getQuantity(int productId) {
            // TODO: Get quantity of specific product
            // 1. Check if productId exists
            // 2. If exists, return item's quantity
            // 3. If not exists, return null
            
            return null;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic operations
        System.out.println("Test 1: Basic operations");
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(1, "Apple", 2, 3);
        System.out.println(cart1.getTotal());                    // Expected: 6
        cart1.addItem(2, "Banana", 1, 5);
        System.out.println(cart1.getTotal());                    // Expected: 11
        System.out.println(cart1.getItemCount());                // Expected: 2
        
        // Test case 2: Add same product multiple times
        System.out.println("\nTest 2: Add same product");
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem(1, "Apple", 2, 3);
        cart2.addItem(1, "Apple", 2, 2);
        System.out.println(cart2.getQuantity(1));                // Expected: 5
        System.out.println(cart2.getTotal());                    // Expected: 10
        System.out.println(cart2.getItemCount());                // Expected: 1
        
        // Test case 3: Update quantity
        System.out.println("\nTest 3: Update quantity");
        ShoppingCart cart3 = new ShoppingCart();
        cart3.addItem(1, "Apple", 5, 10);
        System.out.println(cart3.getTotal());                    // Expected: 50
        cart3.updateQuantity(1, 3);
        System.out.println(cart3.getTotal());                    // Expected: 15
        cart3.updateQuantity(1, 0);
        System.out.println(cart3.getItemCount());                // Expected: 0
        
        // Test case 4: Remove item
        System.out.println("\nTest 4: Remove item");
        ShoppingCart cart4 = new ShoppingCart();
        cart4.addItem(1, "A", 10, 2);
        cart4.addItem(2, "B", 5, 3);
        System.out.println(cart4.getTotal());                    // Expected: 35
        System.out.println(cart4.removeItem(1));                 // Expected: true
        System.out.println(cart4.getTotal());                    // Expected: 15
        System.out.println(cart4.getItemCount());                // Expected: 1
        System.out.println(cart4.removeItem(99));                // Expected: false
        
        // Test case 5: Invalid operations
        System.out.println("\nTest 5: Invalid operations");
        ShoppingCart cart5 = new ShoppingCart();
        System.out.println(cart5.updateQuantity(99, 5));         // Expected: false
        System.out.println(cart5.getQuantity(99));               // Expected: null
        System.out.println(cart5.getTotal());                    // Expected: 0
        System.out.println(cart5.getItemCount());                // Expected: 0
    }
}
