package com.example.javas.easy;

import java.util.*;

/**
 * E047: Payment System (Interface Practice)
 * Difficulty: Easy (OOP)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Create a payment processing system to practice interfaces.
 * 
 * Requirements:
 * 1. Create interface Payable with methods:
 *    - boolean processPayment(double amount)
 *    - String getPaymentMethod()
 *    - double getTransactionFee(double amount)
 * 
 * 2. Create classes that implement Payable:
 *    - CreditCard: 
 *      * Fields: cardNumber, cardHolder
 *      * Transaction fee: 2% of amount
 *      * Always successful if amount > 0
 *    
 *    - PayPal:
 *      * Fields: email
 *      * Transaction fee: 3% of amount
 *      * Always successful if amount > 0
 *    
 *    - Cash:
 *      * No transaction fee (0%)
 *      * Always successful if amount > 0
 * 
 * 3. Create PaymentProcessor class:
 *    - void addPaymentMethod(Payable payment)
 *    - double calculateTotalFees(double amount) - sum fees from all methods
 *    - List<String> listPaymentMethods() - return list of all payment method names
 * 
 * Examples:
 * CreditCard cc = new CreditCard("1234-5678", "John Doe");
 * cc.processPayment(100.0);        // return true
 * cc.getTransactionFee(100.0);     // return 2.0 (2% of 100)
 * cc.getPaymentMethod();           // return "Credit Card"
 * 
 * PayPal pp = new PayPal("john@email.com");
 * pp.getTransactionFee(100.0);     // return 3.0 (3% of 100)
 * 
 * Cash cash = new Cash();
 * cash.getTransactionFee(100.0);   // return 0.0
 * 
 * OOP Concepts:
 * - Interface: Payable defines contract for all payment methods
 * - Multiple implementations: Different classes implement same interface
 * - Polymorphism: Store different payment types in same collection
 * 
 * Time Complexity: O(1) for single operations, O(n) for list operations
 * Space Complexity: O(n) where n is number of payment methods
 */
public class E047_PaymentSystem {
    
    // TODO: Create Payable interface
    // Methods:
    // - boolean processPayment(double amount)
    // - String getPaymentMethod()
    // - double getTransactionFee(double amount)
    
    
    // TODO: Create CreditCard class implementing Payable
    // Fields:
    // - private String cardNumber
    // - private String cardHolder
    // 
    // Constructor: CreditCard(String cardNumber, String cardHolder)
    // 
    // Implement:
    // - processPayment(amount): return true if amount > 0, else false
    // - getPaymentMethod(): return "Credit Card"
    // - getTransactionFee(amount): return amount * 0.02 (2%)
    
    
    // TODO: Create PayPal class implementing Payable
    // Fields:
    // - private String email
    // 
    // Constructor: PayPal(String email)
    // 
    // Implement:
    // - processPayment(amount): return true if amount > 0, else false
    // - getPaymentMethod(): return "PayPal"
    // - getTransactionFee(amount): return amount * 0.03 (3%)
    
    
    // TODO: Create Cash class implementing Payable
    // No fields needed
    // 
    // Constructor: Cash()
    // 
    // Implement:
    // - processPayment(amount): return true if amount > 0, else false
    // - getPaymentMethod(): return "Cash"
    // - getTransactionFee(amount): return 0.0 (no fee)
    
    
    // TODO: Create PaymentProcessor class
    // Fields:
    // - private List<Payable> paymentMethods
    // 
    // Constructor: PaymentProcessor()
    // 
    // Methods:
    // - void addPaymentMethod(Payable payment): add to list
    // - double calculateTotalFees(double amount): sum all transaction fees
    // - List<String> listPaymentMethods(): return list of all payment method names
    
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Credit Card
        System.out.println("Test 1: Credit Card");
        // Create credit card
        // Process payment of 100
        // Print transaction fee (should be 2.0)
        
        // Test case 2: PayPal
        System.out.println("\nTest 2: PayPal");
        // Create PayPal
        // Process payment of 100
        // Print transaction fee (should be 3.0)
        
        // Test case 3: Cash
        System.out.println("\nTest 3: Cash");
        // Create cash
        // Process payment of 100
        // Print transaction fee (should be 0.0)
        
        // Test case 4: Payment Processor
        System.out.println("\nTest 4: Payment Processor");
        // Create processor
        // Add all three payment methods
        // Calculate total fees for 100 (should be 5.0)
        // List all payment methods
        
        // Test case 5: Invalid payment
        System.out.println("\nTest 5: Invalid payment");
        // Try to process payment with amount 0 or negative
        // Should return false
    }
}
