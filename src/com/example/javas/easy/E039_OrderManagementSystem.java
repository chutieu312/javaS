package com.example.javas.easy;

import java.util.*;

/**
 * E039: Design Order Management System
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a simple order management system for a restaurant that can create orders,
 * add items to orders, mark orders as complete, and calculate order totals.
 * 
 * Requirements:
 * Implement the OrderSystem class:
 * - OrderSystem() Initializes the order system
 * - boolean createOrder(int orderId) Creates a new order with the given orderId.
 *   Return false if orderId already exists, otherwise return true
 * - boolean addItem(int orderId, String item, int price) Adds an item with price to 
 *   the order. Return false if order doesn't exist or order is already completed, 
 *   otherwise return true
 * - Integer getTotal(int orderId) Returns the total price of the order.
 *   Return null if order doesn't exist
 * - boolean completeOrder(int orderId) Marks the order as completed.
 *   Return false if order doesn't exist or already completed, otherwise return true
 * - boolean isCompleted(int orderId) Returns true if order is completed, false otherwise.
 *   Return false if order doesn't exist
 * 
 * Constraints:
 * - 1 <= orderId <= 10^5
 * - 1 <= item.length <= 30
 * - 1 <= price <= 10^4
 * - At most 5000 calls will be made to all functions combined
 * 
 * Examples:
 * OrderSystem os = new OrderSystem();
 * os.createOrder(1);           // return true, order 1 created
 * os.addItem(1, "Burger", 10); // return true
 * os.addItem(1, "Fries", 5);   // return true
 * os.getTotal(1);              // return 15
 * os.completeOrder(1);         // return true
 * os.isCompleted(1);           // return true
 * os.addItem(1, "Drink", 3);   // return false (order completed, can't add items)
 * os.getTotal(1);              // return 15 (unchanged)
 * os.completeOrder(1);         // return false (already completed)
 * os.createOrder(2);           // return true
 * os.addItem(2, "Pizza", 20);  // return true
 * os.getTotal(2);              // return 20
 * os.isCompleted(2);           // return false
 * 
 * Approach:
 * Use HashMap to store order information:
 * 1. Create an Order class with total price and completion status
 * 2. Use HashMap<Integer, Order> to map orderId -> Order object
 * 3. createOrder: add new Order to map
 * 4. addItem: check if order exists and not completed, add price to total
 * 5. getTotal: return order's total
 * 6. completeOrder: mark order as completed
 * 7. isCompleted: check order's completion status
 * 
 * Data Structures:
 * - Order class with total (int) and completed (boolean)
 * - HashMap<Integer, Order> to map orderId -> Order
 * 
 * Time Complexity: O(1) for all operations
 * Space Complexity: O(n) where n is number of orders
 */
public class E039_OrderManagementSystem {
    
    static class OrderSystem {
        
        // TODO: Create inner Order class
        // - int total (sum of all item prices)
        // - boolean completed (whether order is completed)
        // - Constructor to initialize
        
        // TODO: Declare HashMap to store orders
        // Map from orderId (Integer) to Order object
        
        public OrderSystem() {
            // TODO: Initialize the HashMap
        }
        
        public boolean createOrder(int orderId) {
            // TODO: Create new order
            // 1. Check if orderId already exists
            // 2. If exists, return false
            // 3. Create new Order (total=0, completed=false)
            // 4. Add to map and return true
            
            return false;
        }
        
        public boolean addItem(int orderId, String item, int price) {
            // TODO: Add item to order
            // 1. Check if order exists
            // 2. If not exists, return false
            // 3. Get the order
            // 4. If order is completed, return false
            // 5. Add price to order's total and return true
            
            return false;
        }
        
        public Integer getTotal(int orderId) {
            // TODO: Get order total
            // 1. Check if order exists
            // 2. If exists, return order's total
            // 3. If not exists, return null
            
            return null;
        }
        
        public boolean completeOrder(int orderId) {
            // TODO: Mark order as completed
            // 1. Check if order exists
            // 2. If not exists, return false
            // 3. Get the order
            // 4. If already completed, return false
            // 5. Mark as completed and return true
            
            return false;
        }
        
        public boolean isCompleted(int orderId) {
            // TODO: Check if order is completed
            // 1. Check if order exists
            // 2. If exists, return order's completed status
            // 3. If not exists, return false
            
            return false;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic operations
        System.out.println("Test 1: Basic operations");
        OrderSystem os1 = new OrderSystem();
        System.out.println(os1.createOrder(1));           // Expected: true
        System.out.println(os1.addItem(1, "Burger", 10)); // Expected: true
        System.out.println(os1.addItem(1, "Fries", 5));   // Expected: true
        System.out.println(os1.getTotal(1));              // Expected: 15
        System.out.println(os1.completeOrder(1));         // Expected: true
        System.out.println(os1.isCompleted(1));           // Expected: true
        
        // Test case 2: Can't modify completed order
        System.out.println("\nTest 2: Completed order");
        OrderSystem os2 = new OrderSystem();
        os2.createOrder(1);
        os2.addItem(1, "Item", 10);
        os2.completeOrder(1);
        System.out.println(os2.addItem(1, "Extra", 5));   // Expected: false
        System.out.println(os2.getTotal(1));              // Expected: 10
        System.out.println(os2.completeOrder(1));         // Expected: false (already completed)
        
        // Test case 3: Multiple orders
        System.out.println("\nTest 3: Multiple orders");
        OrderSystem os3 = new OrderSystem();
        os3.createOrder(1);
        os3.createOrder(2);
        os3.addItem(1, "A", 10);
        os3.addItem(2, "B", 20);
        os3.addItem(1, "C", 5);
        System.out.println(os3.getTotal(1));              // Expected: 15
        System.out.println(os3.getTotal(2));              // Expected: 20
        System.out.println(os3.isCompleted(1));           // Expected: false
        os3.completeOrder(2);
        System.out.println(os3.isCompleted(2));           // Expected: true
        
        // Test case 4: Invalid operations
        System.out.println("\nTest 4: Invalid operations");
        OrderSystem os4 = new OrderSystem();
        System.out.println(os4.addItem(99, "X", 10));     // Expected: false (order doesn't exist)
        System.out.println(os4.getTotal(99));             // Expected: null
        System.out.println(os4.completeOrder(99));        // Expected: false
        System.out.println(os4.isCompleted(99));          // Expected: false
        
        // Test case 5: Duplicate order
        System.out.println("\nTest 5: Duplicate order");
        OrderSystem os5 = new OrderSystem();
        System.out.println(os5.createOrder(1));           // Expected: true
        System.out.println(os5.createOrder(1));           // Expected: false
        os5.addItem(1, "Item", 25);
        System.out.println(os5.getTotal(1));              // Expected: 25
    }
}
