"""
E037: Design Bank Account System

Summary:
Design a bank account system for deposits, withdrawals, and balance checks.

Requirements:
Implement the Bank class:
- create_account(account_id, initial_deposit): Creates new account
- deposit(account_id, amount): Deposits money
- withdraw(account_id, amount): Withdraws money
- get_balance(account_id): Returns balance or None

Approach:
Use dict to map account_id -> balance

Data Structures:
- dict[int, int]: account_id -> balance

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(n) where n is number of accounts
"""


class Bank:
    
    def __init__(self):
        """
        TODO: Initialize the dict to store accounts
        """
        pass
    
    def create_account(self, account_id: int, initial_deposit: int) -> bool:
        """
        TODO: Create new account
        1. Check if account_id already exists
        2. If exists, return False
        3. Add to dict with initial_deposit and return True
        """
        pass
    
    def deposit(self, account_id: int, amount: int) -> bool:
        """
        TODO: Deposit money
        1. Check if account exists
        2. If not, return False
        3. Add amount to balance and return True
        """
        pass
    
    def withdraw(self, account_id: int, amount: int) -> bool:
        """
        TODO: Withdraw money
        1. Check if account exists
        2. If not or insufficient funds, return False
        3. Subtract amount and return True
        """
        pass
    
    def get_balance(self, account_id: int) -> int | None:
        """
        TODO: Get account balance
        Return balance if exists, None otherwise
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic operations")
    bank1 = Bank()
    print(bank1.create_account(1, 1000))   # Expected: True
    print(bank1.get_balance(1))            # Expected: 1000
    print(bank1.deposit(1, 500))           # Expected: True
    print(bank1.get_balance(1))            # Expected: 1500
    print(bank1.withdraw(1, 200))          # Expected: True
    print(bank1.get_balance(1))            # Expected: 1300
    
    print("\nTest 2: Insufficient balance")
    bank2 = Bank()
    bank2.create_account(1, 500)
    print(bank2.withdraw(1, 1000))         # Expected: False
    print(bank2.get_balance(1))            # Expected: 500
    
    print("\nTest 3: Duplicate account")
    bank3 = Bank()
    print(bank3.create_account(1, 100))    # Expected: True
    print(bank3.create_account(1, 200))    # Expected: False
    print(bank3.get_balance(1))            # Expected: 100
    
    print("\nTest 4: Non-existent account")
    bank4 = Bank()
    print(bank4.get_balance(99))           # Expected: None
    print(bank4.deposit(99, 100))          # Expected: False
    print(bank4.withdraw(99, 50))          # Expected: False
    
    print("\nTest 5: Multiple accounts")
    bank5 = Bank()
    bank5.create_account(1, 1000)
    bank5.create_account(2, 2000)
    bank5.create_account(3, 3000)
    print(bank5.get_balance(1))            # Expected: 1000
    print(bank5.get_balance(2))            # Expected: 2000
    print(bank5.get_balance(3))            # Expected: 3000
    bank5.deposit(1, 100)
    bank5.withdraw(2, 500)
    print(bank5.get_balance(1))            # Expected: 1100
    print(bank5.get_balance(2))            # Expected: 1500
