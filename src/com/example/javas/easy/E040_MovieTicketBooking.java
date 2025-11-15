package com.example.javas.easy;

import java.util.*;

/**
 * E040: Design Movie Ticket Booking System
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a simple movie ticket booking system that can create screenings, book seats,
 * cancel bookings, and check seat availability.
 * 
 * Requirements:
 * Implement the TicketSystem class:
 * - TicketSystem() Initializes the ticket booking system
 * - boolean createScreening(int screeningId, int totalSeats) Creates a screening with 
 *   given screeningId and number of seats. Return false if screeningId exists, else true
 * - boolean bookSeat(int screeningId, int seatNumber) Books the specified seat for the 
 *   screening. Return false if screening doesn't exist, seat is invalid, or already booked,
 *   else return true
 * - boolean cancelBooking(int screeningId, int seatNumber) Cancels the booking for the 
 *   specified seat. Return false if screening doesn't exist, seat invalid, or not booked,
 *   else return true
 * - Integer getAvailableSeats(int screeningId) Returns number of available seats.
 *   Return null if screening doesn't exist
 * - boolean isSeatAvailable(int screeningId, int seatNumber) Returns true if seat is 
 *   available, false otherwise (or if screening/seat doesn't exist)
 * 
 * Constraints:
 * - 1 <= screeningId <= 1000
 * - 1 <= totalSeats <= 500
 * - 1 <= seatNumber <= totalSeats
 * - At most 5000 calls will be made to all functions combined
 * 
 * Examples:
 * TicketSystem ts = new TicketSystem();
 * ts.createScreening(1, 10);      // return true, screening 1 with 10 seats created
 * ts.getAvailableSeats(1);        // return 10
 * ts.bookSeat(1, 5);              // return true, seat 5 booked
 * ts.getAvailableSeats(1);        // return 9
 * ts.isSeatAvailable(1, 5);       // return false (seat 5 is booked)
 * ts.isSeatAvailable(1, 6);       // return true (seat 6 is available)
 * ts.bookSeat(1, 5);              // return false (seat 5 already booked)
 * ts.cancelBooking(1, 5);         // return true
 * ts.getAvailableSeats(1);        // return 10 (seat 5 available again)
 * ts.bookSeat(1, 15);             // return false (invalid seat number)
 * ts.createScreening(1, 20);      // return false (screening 1 exists)
 * 
 * Approach:
 * Use HashMap to store screening information:
 * 1. Create Screening class with totalSeats and a set of booked seats
 * 2. Use HashMap<Integer, Screening> to map screeningId -> Screening
 * 3. createScreening: add new Screening with empty booked set
 * 4. bookSeat: validate seat number, check if available, add to booked set
 * 5. cancelBooking: validate, check if booked, remove from booked set
 * 6. getAvailableSeats: totalSeats - booked.size()
 * 7. isSeatAvailable: check if seat not in booked set
 * 
 * Data Structures:
 * - Screening class with totalSeats (int) and booked seats (Set<Integer>)
 * - HashMap<Integer, Screening> to map screeningId -> Screening
 * 
 * Time Complexity: O(1) for all operations (HashSet add/remove/contains)
 * Space Complexity: O(n * m) where n is screenings, m is seats per screening
 */
public class E040_MovieTicketBooking {
    
    static class TicketSystem {
        
        // TODO: Create inner Screening class
        // - int totalSeats (maximum seats for this screening)
        // - Set<Integer> bookedSeats (set of booked seat numbers)
        // - Constructor to initialize
        
        // TODO: Declare HashMap to store screenings
        // Map from screeningId (Integer) to Screening object
        
        public TicketSystem() {
            // TODO: Initialize the HashMap
        }
        
        public boolean createScreening(int screeningId, int totalSeats) {
            // TODO: Create new screening
            // 1. Check if screeningId already exists
            // 2. If exists, return false
            // 3. Create new Screening with totalSeats and empty booked set
            // 4. Add to map and return true
            
            return false;
        }
        
        public boolean bookSeat(int screeningId, int seatNumber) {
            // TODO: Book a seat
            // 1. Check if screening exists
            // 2. If not exists, return false
            // 3. Get the screening
            // 4. Validate seatNumber (1 to totalSeats)
            // 5. If invalid or already in booked set, return false
            // 6. Add seatNumber to booked set and return true
            
            return false;
        }
        
        public boolean cancelBooking(int screeningId, int seatNumber) {
            // TODO: Cancel a booking
            // 1. Check if screening exists
            // 2. If not exists, return false
            // 3. Get the screening
            // 4. Validate seatNumber (1 to totalSeats)
            // 5. If invalid or not in booked set, return false
            // 6. Remove seatNumber from booked set and return true
            
            return false;
        }
        
        public Integer getAvailableSeats(int screeningId) {
            // TODO: Get count of available seats
            // 1. Check if screening exists
            // 2. If not exists, return null
            // 3. Return totalSeats - bookedSeats.size()
            
            return null;
        }
        
        public boolean isSeatAvailable(int screeningId, int seatNumber) {
            // TODO: Check if specific seat is available
            // 1. Check if screening exists
            // 2. If not exists, return false
            // 3. Get the screening
            // 4. Validate seatNumber (1 to totalSeats)
            // 5. Return true if seat not in booked set, false otherwise
            
            return false;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic operations
        System.out.println("Test 1: Basic booking");
        TicketSystem ts1 = new TicketSystem();
        System.out.println(ts1.createScreening(1, 10));     // Expected: true
        System.out.println(ts1.getAvailableSeats(1));       // Expected: 10
        System.out.println(ts1.bookSeat(1, 5));             // Expected: true
        System.out.println(ts1.getAvailableSeats(1));       // Expected: 9
        System.out.println(ts1.isSeatAvailable(1, 5));      // Expected: false
        System.out.println(ts1.isSeatAvailable(1, 6));      // Expected: true
        
        // Test case 2: Double booking
        System.out.println("\nTest 2: Double booking");
        TicketSystem ts2 = new TicketSystem();
        ts2.createScreening(1, 5);
        System.out.println(ts2.bookSeat(1, 3));             // Expected: true
        System.out.println(ts2.bookSeat(1, 3));             // Expected: false
        System.out.println(ts2.getAvailableSeats(1));       // Expected: 4
        
        // Test case 3: Cancel booking
        System.out.println("\nTest 3: Cancel booking");
        TicketSystem ts3 = new TicketSystem();
        ts3.createScreening(1, 5);
        ts3.bookSeat(1, 2);
        System.out.println(ts3.getAvailableSeats(1));       // Expected: 4
        System.out.println(ts3.cancelBooking(1, 2));        // Expected: true
        System.out.println(ts3.getAvailableSeats(1));       // Expected: 5
        System.out.println(ts3.cancelBooking(1, 2));        // Expected: false (not booked)
        
        // Test case 4: Invalid operations
        System.out.println("\nTest 4: Invalid operations");
        TicketSystem ts4 = new TicketSystem();
        ts4.createScreening(1, 10);
        System.out.println(ts4.bookSeat(1, 15));            // Expected: false (invalid seat)
        System.out.println(ts4.bookSeat(1, 0));             // Expected: false (invalid seat)
        System.out.println(ts4.bookSeat(99, 5));            // Expected: false (screening doesn't exist)
        System.out.println(ts4.getAvailableSeats(99));      // Expected: null
        
        // Test case 5: Multiple screenings
        System.out.println("\nTest 5: Multiple screenings");
        TicketSystem ts5 = new TicketSystem();
        ts5.createScreening(1, 10);
        ts5.createScreening(2, 20);
        ts5.bookSeat(1, 5);
        ts5.bookSeat(2, 5);
        System.out.println(ts5.getAvailableSeats(1));       // Expected: 9
        System.out.println(ts5.getAvailableSeats(2));       // Expected: 19
        System.out.println(ts5.isSeatAvailable(1, 5));      // Expected: false
        System.out.println(ts5.isSeatAvailable(2, 5));      // Expected: false
        System.out.println(ts5.isSeatAvailable(1, 6));      // Expected: true
    }
}
