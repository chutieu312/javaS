"""
E041: Design Library Book System

Summary:
Design a library book management system for borrowing and returning books.

Requirements:
Implement the Library class:
- add_book(book_id, title, copies): Adds a book
- borrow_book(book_id): Borrows one copy
- return_book(book_id): Returns one copy
- get_available_copies(book_id): Returns available count
- get_title(book_id): Returns book title

Approach:
Use dict to map book_id -> Book with title, total_copies, available_copies

Data Structures:
- Book class with title, total_copies, available_copies
- dict[int, Book]: book_id -> Book

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(n) where n is number of books
"""


class Library:
    
    class Book:
        def __init__(self, title: str, copies: int):
            """
            TODO: Initialize Book
            Set title, total_copies = copies, available_copies = copies
            """
            pass
    
    def __init__(self):
        """
        TODO: Initialize the dict to store books
        """
        pass
    
    def add_book(self, book_id: int, title: str, copies: int) -> bool:
        """
        TODO: Add new book
        1. Check if book_id exists
        2. If exists, return False
        3. Create Book and add to dict, return True
        """
        pass
    
    def borrow_book(self, book_id: int) -> bool:
        """
        TODO: Borrow a book copy
        1. Check if book exists
        2. If no copies available, return False
        3. Decrement available_copies and return True
        """
        pass
    
    def return_book(self, book_id: int) -> bool:
        """
        TODO: Return a book copy
        1. Check if book exists
        2. If all copies already in library, return False
        3. Increment available_copies and return True
        """
        pass
    
    def get_available_copies(self, book_id: int) -> int | None:
        """
        TODO: Get available copies count
        Return available_copies if exists, None otherwise
        """
        pass
    
    def get_title(self, book_id: int) -> str | None:
        """
        TODO: Get book title
        Return title if exists, None otherwise
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic borrow and return")
    lib1 = Library()
    print(lib1.add_book(1, "Java Programming", 3))   # Expected: True
    print(lib1.get_title(1))                         # Expected: Java Programming
    print(lib1.get_available_copies(1))              # Expected: 3
    print(lib1.borrow_book(1))                       # Expected: True
    print(lib1.get_available_copies(1))              # Expected: 2
    print(lib1.return_book(1))                       # Expected: True
    print(lib1.get_available_copies(1))              # Expected: 3
    
    print("\nTest 2: Borrow all copies")
    lib2 = Library()
    lib2.add_book(1, "Book A", 2)
    print(lib2.borrow_book(1))                       # Expected: True
    print(lib2.borrow_book(1))                       # Expected: True
    print(lib2.borrow_book(1))                       # Expected: False
    print(lib2.get_available_copies(1))              # Expected: 0
    
    print("\nTest 3: Return excess")
    lib3 = Library()
    lib3.add_book(1, "Book B", 2)
    print(lib3.return_book(1))                       # Expected: False
    print(lib3.get_available_copies(1))              # Expected: 2
    lib3.borrow_book(1)
    print(lib3.return_book(1))                       # Expected: True
    print(lib3.get_available_copies(1))              # Expected: 2
    
    print("\nTest 4: Invalid operations")
    lib4 = Library()
    print(lib4.borrow_book(99))                      # Expected: False
    print(lib4.return_book(99))                      # Expected: False
    print(lib4.get_available_copies(99))             # Expected: None
    print(lib4.get_title(99))                        # Expected: None
    
    print("\nTest 5: Multiple books")
    lib5 = Library()
    lib5.add_book(1, "Book A", 5)
    lib5.add_book(2, "Book B", 3)
    lib5.borrow_book(1)
    lib5.borrow_book(1)
    lib5.borrow_book(2)
    print(lib5.get_available_copies(1))              # Expected: 3
    print(lib5.get_available_copies(2))              # Expected: 2
    print(lib5.get_title(1))                         # Expected: Book A
    print(lib5.get_title(2))                         # Expected: Book B
