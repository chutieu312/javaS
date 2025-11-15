package com.example.javas.easy;

import java.util.*;

/**
 * E041: Design Library Book System
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a simple library book management system that can add books, borrow books,
 * return books, and check book availability.
 * 
 * Requirements:
 * Implement the Library class:
 * - Library() Initializes the library system
 * - boolean addBook(int bookId, String title, int copies) Adds a book with the given 
 *   bookId, title, and number of copies. Return false if bookId exists, else true
 * - boolean borrowBook(int bookId) Borrows one copy of the book. Return false if 
 *   book doesn't exist or no copies available, else return true
 * - boolean returnBook(int bookId) Returns one copy of the book. Return false if 
 *   book doesn't exist or all copies already in library, else return true
 * - Integer getAvailableCopies(int bookId) Returns number of available copies.
 *   Return null if book doesn't exist
 * - String getTitle(int bookId) Returns the title of the book.
 *   Return null if book doesn't exist
 * 
 * Constraints:
 * - 1 <= bookId <= 10^5
 * - 1 <= title.length <= 100
 * - 1 <= copies <= 1000
 * - At most 5000 calls will be made to all functions combined
 * 
 * Examples:
 * Library lib = new Library();
 * lib.addBook(1, "Java Programming", 3);  // return true
 * lib.getTitle(1);                        // return "Java Programming"
 * lib.getAvailableCopies(1);              // return 3
 * lib.borrowBook(1);                      // return true, 2 copies left
 * lib.getAvailableCopies(1);              // return 2
 * lib.borrowBook(1);                      // return true, 1 copy left
 * lib.borrowBook(1);                      // return true, 0 copies left
 * lib.borrowBook(1);                      // return false (no copies available)
 * lib.getAvailableCopies(1);              // return 0
 * lib.returnBook(1);                      // return true, 1 copy available
 * lib.getAvailableCopies(1);              // return 1
 * lib.addBook(1, "Another Book", 5);      // return false (bookId 1 exists)
 * lib.borrowBook(99);                     // return false (book doesn't exist)
 * 
 * Approach:
 * Use HashMap to store book information:
 * 1. Create Book class with title, totalCopies, and availableCopies
 * 2. Use HashMap<Integer, Book> to map bookId -> Book
 * 3. addBook: add new Book to map
 * 4. borrowBook: check availability, decrement availableCopies
 * 5. returnBook: check if can return, increment availableCopies (up to totalCopies)
 * 6. getAvailableCopies: return availableCopies
 * 7. getTitle: return book's title
 * 
 * Data Structures:
 * - Book class with title (String), totalCopies (int), availableCopies (int)
 * - HashMap<Integer, Book> to map bookId -> Book
 * 
 * Time Complexity: O(1) for all operations
 * Space Complexity: O(n) where n is number of books
 */
public class E041_LibraryBookSystem {
    
    static class Library {
        
        // TODO: Create inner Book class
        // - String title
        // - int totalCopies (total number of copies in library)
        // - int availableCopies (currently available copies)
        // - Constructor to initialize all fields
        
        // TODO: Declare HashMap to store books
        // Map from bookId (Integer) to Book object
        
        public Library() {
            // TODO: Initialize the HashMap
        }
        
        public boolean addBook(int bookId, String title, int copies) {
            // TODO: Add new book
            // 1. Check if bookId already exists
            // 2. If exists, return false
            // 3. Create new Book with title, totalCopies=copies, availableCopies=copies
            // 4. Add to map and return true
            
            return false;
        }
        
        public boolean borrowBook(int bookId) {
            // TODO: Borrow a book copy
            // 1. Check if book exists
            // 2. If not exists, return false
            // 3. Get the book
            // 4. If availableCopies is 0, return false
            // 5. Decrement availableCopies and return true
            
            return false;
        }
        
        public boolean returnBook(int bookId) {
            // TODO: Return a book copy
            // 1. Check if book exists
            // 2. If not exists, return false
            // 3. Get the book
            // 4. If availableCopies already equals totalCopies, return false (all copies already in library)
            // 5. Increment availableCopies and return true
            
            return false;
        }
        
        public Integer getAvailableCopies(int bookId) {
            // TODO: Get available copies count
            // 1. Check if book exists
            // 2. If exists, return book's availableCopies
            // 3. If not exists, return null
            
            return null;
        }
        
        public String getTitle(int bookId) {
            // TODO: Get book title
            // 1. Check if book exists
            // 2. If exists, return book's title
            // 3. If not exists, return null
            
            return null;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic operations
        System.out.println("Test 1: Basic borrow and return");
        Library lib1 = new Library();
        System.out.println(lib1.addBook(1, "Java Programming", 3));  // Expected: true
        System.out.println(lib1.getTitle(1));                        // Expected: Java Programming
        System.out.println(lib1.getAvailableCopies(1));              // Expected: 3
        System.out.println(lib1.borrowBook(1));                      // Expected: true
        System.out.println(lib1.getAvailableCopies(1));              // Expected: 2
        System.out.println(lib1.returnBook(1));                      // Expected: true
        System.out.println(lib1.getAvailableCopies(1));              // Expected: 3
        
        // Test case 2: Borrow all copies
        System.out.println("\nTest 2: Borrow all copies");
        Library lib2 = new Library();
        lib2.addBook(1, "Book A", 2);
        System.out.println(lib2.borrowBook(1));                      // Expected: true
        System.out.println(lib2.borrowBook(1));                      // Expected: true
        System.out.println(lib2.borrowBook(1));                      // Expected: false (no copies)
        System.out.println(lib2.getAvailableCopies(1));              // Expected: 0
        
        // Test case 3: Return when all copies in library
        System.out.println("\nTest 3: Return excess");
        Library lib3 = new Library();
        lib3.addBook(1, "Book B", 2);
        System.out.println(lib3.returnBook(1));                      // Expected: false (all copies already in library)
        System.out.println(lib3.getAvailableCopies(1));              // Expected: 2
        lib3.borrowBook(1);
        System.out.println(lib3.returnBook(1));                      // Expected: true
        System.out.println(lib3.getAvailableCopies(1));              // Expected: 2
        
        // Test case 4: Invalid operations
        System.out.println("\nTest 4: Invalid operations");
        Library lib4 = new Library();
        System.out.println(lib4.borrowBook(99));                     // Expected: false (book doesn't exist)
        System.out.println(lib4.returnBook(99));                     // Expected: false
        System.out.println(lib4.getAvailableCopies(99));             // Expected: null
        System.out.println(lib4.getTitle(99));                       // Expected: null
        
        // Test case 5: Multiple books
        System.out.println("\nTest 5: Multiple books");
        Library lib5 = new Library();
        lib5.addBook(1, "Book A", 5);
        lib5.addBook(2, "Book B", 3);
        lib5.borrowBook(1);
        lib5.borrowBook(1);
        lib5.borrowBook(2);
        System.out.println(lib5.getAvailableCopies(1));              // Expected: 3
        System.out.println(lib5.getAvailableCopies(2));              // Expected: 2
        System.out.println(lib5.getTitle(1));                        // Expected: Book A
        System.out.println(lib5.getTitle(2));                        // Expected: Book B
    }
}
