package com.example.javas.easy;

import java.util.*;

/**
 * E037: Design Bank Account System
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a bank account system that allows customers to create accounts, deposit money,
 * withdraw money, and check balance.
 * 
 * Requirements:
 * Implement the Bank class:
 * - Bank() Initializes the bank system
 * - boolean createAccount(int accountId, long initialDeposit) Creates a new account with 
 *   the given accountId and initial deposit. Return false if accountId already exists, 
 *   otherwise return true
 * - boolean deposit(int accountId, long amount) Deposits amount into the account. 
 *   Return false if account doesn't exist, otherwise return true
 * - boolean withdraw(int accountId, long amount) Withdraws amount from the account. 
 *   Return false if account doesn't exist or balance is insufficient, otherwise return true
 * - Long getBalance(int accountId) Returns the balance of the account. 
 *   Return null if account doesn't exist
 * 
 * Constraints:
 * - 1 <= accountId <= 10^5
 * - 0 <= initialDeposit, amount <= 10^9
 * - At most 5000 calls will be made to all functions combined
 * 
 * Examples:
 * Bank bank = new Bank();
 * bank.createAccount(1, 1000);  // return true, account 1 created with balance 1000
 * bank.getBalance(1);           // return 1000
 * bank.deposit(1, 500);         // return true, balance = 1500
 * bank.getBalance(1);           // return 1500
 * bank.withdraw(1, 200);        // return true, balance = 1300
 * bank.getBalance(1);           // return 1300
 * bank.withdraw(1, 2000);       // return false, insufficient balance
 * bank.getBalance(1);           // return 1300 (unchanged)
 * bank.createAccount(1, 5000);  // return false, account 1 already exists
 * bank.createAccount(2, 2000);  // return true, account 2 created
 * bank.getBalance(2);           // return 2000
 * bank.getBalance(99);          // return null, account doesn't exist
 * 
 * Approach:
 * Use a HashMap to store account information:
 * 1. Key: accountId
 * 2. Value: account balance (Long)
 * 3. createAccount: check if exists, if not add to map
 * 4. deposit: check if exists, add to balance
 * 5. withdraw: check if exists and sufficient balance, subtract
 * 6. getBalance: check if exists, return balance or null
 * 
 * Data Structures:
 * - HashMap<Integer, Long> to map accountId -> balance
 * 
 * Time Complexity: O(1) for all operations
 * Space Complexity: O(n) where n is number of accounts
 */
public class E037_BankAccountSystem {
    
    static class Bank {
        
        
        // Map from accountId (Integer) to balance (Long)
        private HashMap<Integer, Long> accounts;
        
        public Bank() {
            accounts = new HashMap<>();
        }
        
        public boolean createAccount(int accountId, long initialDeposit) {
            
            // 1. Check if accountId already exists in map
            // 2. If exists, return false
            // 3. If not exists, add to map with initialDeposit and return true

            if (this.accounts.containsKey(accountId)) {
                return false;
            }
            
            this.accounts.put(accountId, initialDeposit);

            return true;
        }
        
        public boolean deposit(int accountId, long amount) {
            
            // 1. Check if accountId exists
            // 2. If not exists, return false
            // 3. Get current balance, add amount, update map, return true
            if (!accounts.containsKey(accountId)) {
                return false;
            }
            long currentBalance = accounts.get(accountId);
            accounts.put(accountId, currentBalance + amount);
            
            return true;
        }
        
        public boolean withdraw(int accountId, long amount) {
            
            // 1. Check if accountId exists
            // 2. If not exists, return false
            // 3. Get current balance
            // 4. If balance < amount, return false (insufficient funds)
            // 5. Subtract amount from balance, update map, return true
            if (!accounts.containsKey(accountId)) {
                return false;
            }
            long currentBalance = accounts.get(accountId);
            if (currentBalance < amount) {
                return false;  // Insufficient funds
            }   
            accounts.put(accountId, currentBalance - amount);
            return false;
        }
        
        public Long getBalance(int accountId) {
            
            // 1. Check if accountId exists in map
            // 2. If exists, return balance
            // 3. If not exists, return null
            
            return accounts.get(accountId);
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic operations
        System.out.println("Test 1: Basic operations");
        Bank bank1 = new Bank();
        System.out.println(bank1.createAccount(1, 1000));  // Expected: true
        System.out.println(bank1.getBalance(1));           // Expected: 1000
        System.out.println(bank1.deposit(1, 500));         // Expected: true
        System.out.println(bank1.getBalance(1));           // Expected: 1500
        System.out.println(bank1.withdraw(1, 200));        // Expected: true
        System.out.println(bank1.getBalance(1));           // Expected: 1300
        
        // Test case 2: Insufficient balance
        System.out.println("\nTest 2: Insufficient balance");
        Bank bank2 = new Bank();
        bank2.createAccount(1, 500);
        System.out.println(bank2.withdraw(1, 1000));       // Expected: false
        System.out.println(bank2.getBalance(1));           // Expected: 500
        
        // Test case 3: Duplicate account
        System.out.println("\nTest 3: Duplicate account");
        Bank bank3 = new Bank();
        System.out.println(bank3.createAccount(1, 100));   // Expected: true
        System.out.println(bank3.createAccount(1, 200));   // Expected: false
        System.out.println(bank3.getBalance(1));           // Expected: 100
        
        // Test case 4: Non-existent account
        System.out.println("\nTest 4: Non-existent account");
        Bank bank4 = new Bank();
        System.out.println(bank4.getBalance(99));          // Expected: null
        System.out.println(bank4.deposit(99, 100));        // Expected: false
        System.out.println(bank4.withdraw(99, 50));        // Expected: false
        
        // Test case 5: Multiple accounts
        System.out.println("\nTest 5: Multiple accounts");
        Bank bank5 = new Bank();
        bank5.createAccount(1, 1000);
        bank5.createAccount(2, 2000);
        bank5.createAccount(3, 3000);
        System.out.println(bank5.getBalance(1));           // Expected: 1000
        System.out.println(bank5.getBalance(2));           // Expected: 2000
        System.out.println(bank5.getBalance(3));           // Expected: 3000
        bank5.deposit(1, 100);
        bank5.withdraw(2, 500);
        System.out.println(bank5.getBalance(1));           // Expected: 1100
        System.out.println(bank5.getBalance(2));           // Expected: 1500
    }
}
