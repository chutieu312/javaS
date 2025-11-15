"""
E040: Design Movie Ticket Booking System

Summary:
Design a ticket booking system for movie screenings.

Requirements:
Implement the TicketSystem class:
- create_screening(screening_id, total_seats): Creates screening
- book_seat(screening_id, seat_number): Books a seat
- cancel_booking(screening_id, seat_number): Cancels booking
- get_available_seats(screening_id): Returns available seat count
- is_seat_available(screening_id, seat_number): Checks availability

Approach:
Use dict to map screening_id -> Screening with total seats and booked set

Data Structures:
- Screening class with total_seats and booked seats set
- dict[int, Screening]: screening_id -> Screening

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(n * m) where n is screenings, m is seats
"""


class TicketSystem:
    
    class Screening:
        def __init__(self, total_seats: int):
            """
            TODO: Initialize Screening
            Set total_seats and create empty booked set
            """
            pass
    
    def __init__(self):
        """
        TODO: Initialize the dict to store screenings
        """
        pass
    
    def create_screening(self, screening_id: int, total_seats: int) -> bool:
        """
        TODO: Create new screening
        1. Check if screening_id exists
        2. If exists, return False
        3. Create Screening and add to dict, return True
        """
        pass
    
    def book_seat(self, screening_id: int, seat_number: int) -> bool:
        """
        TODO: Book a seat
        1. Check if screening exists
        2. Validate seat_number (1 to total_seats)
        3. If already booked, return False
        4. Add to booked set and return True
        """
        pass
    
    def cancel_booking(self, screening_id: int, seat_number: int) -> bool:
        """
        TODO: Cancel a booking
        1. Check if screening exists
        2. Validate seat_number
        3. If not booked, return False
        4. Remove from booked set and return True
        """
        pass
    
    def get_available_seats(self, screening_id: int) -> int | None:
        """
        TODO: Get count of available seats
        Return total_seats - len(booked) or None
        """
        pass
    
    def is_seat_available(self, screening_id: int, seat_number: int) -> bool:
        """
        TODO: Check if specific seat is available
        Return True if seat not in booked set
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic booking")
    ts1 = TicketSystem()
    print(ts1.create_screening(1, 10))      # Expected: True
    print(ts1.get_available_seats(1))       # Expected: 10
    print(ts1.book_seat(1, 5))              # Expected: True
    print(ts1.get_available_seats(1))       # Expected: 9
    print(ts1.is_seat_available(1, 5))      # Expected: False
    print(ts1.is_seat_available(1, 6))      # Expected: True
    
    print("\nTest 2: Double booking")
    ts2 = TicketSystem()
    ts2.create_screening(1, 5)
    print(ts2.book_seat(1, 3))              # Expected: True
    print(ts2.book_seat(1, 3))              # Expected: False
    print(ts2.get_available_seats(1))       # Expected: 4
    
    print("\nTest 3: Cancel booking")
    ts3 = TicketSystem()
    ts3.create_screening(1, 5)
    ts3.book_seat(1, 2)
    print(ts3.get_available_seats(1))       # Expected: 4
    print(ts3.cancel_booking(1, 2))         # Expected: True
    print(ts3.get_available_seats(1))       # Expected: 5
    print(ts3.cancel_booking(1, 2))         # Expected: False
    
    print("\nTest 4: Invalid operations")
    ts4 = TicketSystem()
    ts4.create_screening(1, 10)
    print(ts4.book_seat(1, 15))             # Expected: False
    print(ts4.book_seat(1, 0))              # Expected: False
    print(ts4.book_seat(99, 5))             # Expected: False
    print(ts4.get_available_seats(99))      # Expected: None
    
    print("\nTest 5: Multiple screenings")
    ts5 = TicketSystem()
    ts5.create_screening(1, 10)
    ts5.create_screening(2, 20)
    ts5.book_seat(1, 5)
    ts5.book_seat(2, 5)
    print(ts5.get_available_seats(1))       # Expected: 9
    print(ts5.get_available_seats(2))       # Expected: 19
    print(ts5.is_seat_available(1, 5))      # Expected: False
    print(ts5.is_seat_available(2, 5))      # Expected: False
    print(ts5.is_seat_available(1, 6))      # Expected: True
