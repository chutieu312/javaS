package com.example.javas.easy;

import java.util.*;

/**
 * E034: Design Parking System
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a parking system for a parking lot. The parking lot has three kinds of parking 
 * spaces: big, medium, and small, with a fixed number of slots for each size.
 * 
 * Requirements:
 * Implement the ParkingSystem class:
 * - ParkingSystem(int big, int medium, int small) Initializes object with the number 
 *   of slots for each parking space
 * - boolean addCar(int carType) Checks whether there is a parking space available for 
 *   the car type. carType can be 1 (big), 2 (medium), or 3 (small). A car can only 
 *   park in a parking space of its carType. If there is no space available, return false, 
 *   else park the car and return true.
 * 
 * Constraints:
 * - 0 <= big, medium, small <= 1000
 * - carType is 1, 2, or 3
 * - At most 1000 calls will be made to addCar
 * 
 * Examples:
 * ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
 * parkingSystem.addCar(1); // return true (park big car in big slot)
 * parkingSystem.addCar(2); // return true (park medium car in medium slot)
 * parkingSystem.addCar(3); // return false (no small slots available)
 * parkingSystem.addCar(1); // return false (no more big slots available)
 * 
 * Example 2:
 * ParkingSystem ps = new ParkingSystem(2, 0, 3);
 * ps.addCar(1); // true (big car, 1 big slot left)
 * ps.addCar(1); // true (big car, 0 big slots left)
 * ps.addCar(1); // false (no big slots)
 * ps.addCar(3); // true (small car)
 * 
 * Approach:
 * Simple counter approach:
 * 1. Store available slots for each car type
 * 2. When a car arrives, check if slots available for its type
 * 3. If yes, decrement counter and return true
 * 4. If no, return false
 * 
 * Data Structures:
 * - Three integer variables to track available slots
 * - Or use an array of size 3 (for big, medium, small)
 * 
 * Time Complexity: O(1) for addCar
 * Space Complexity: O(1)
 */
public class E034_ParkingSystem {
    
    static class ParkingSystem {
        
        // Array-based approach: slots[1]=big, slots[2]=medium, slots[3]=small
        // Index 0 is unused to match carType values (1, 2, 3)
        private int[] slots;
        
        public ParkingSystem(int big, int medium, int small) {
            // Initialize array with index 0 unused, then big, medium, small
            // This allows direct indexing: carType 1->big, 2->medium, 3->small
            slots = new int[]{0, big, medium, small};
        }
        
        public boolean addCar(int carType) {
            // Check if slots available for this carType
            if (slots[carType] > 0) {
                slots[carType]--;  // Decrement available slots
                return true;       // Car parked successfully
            }
            return false;  // No slots available
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic functionality
        System.out.println("Test 1: Basic parking");
        ParkingSystem ps1 = new ParkingSystem(1, 1, 0);
        System.out.println(ps1.addCar(1)); // Expected: true
        System.out.println(ps1.addCar(2)); // Expected: true
        System.out.println(ps1.addCar(3)); // Expected: false
        System.out.println(ps1.addCar(1)); // Expected: false
        
        // Test case 2: Multiple slots
        System.out.println("\nTest 2: Multiple slots");
        ParkingSystem ps2 = new ParkingSystem(2, 0, 3);
        System.out.println(ps2.addCar(1)); // Expected: true
        System.out.println(ps2.addCar(1)); // Expected: true
        System.out.println(ps2.addCar(1)); // Expected: false
        System.out.println(ps2.addCar(3)); // Expected: true
        System.out.println(ps2.addCar(3)); // Expected: true
        System.out.println(ps2.addCar(3)); // Expected: true
        System.out.println(ps2.addCar(3)); // Expected: false
        
        // Test case 3: All zeros
        System.out.println("\nTest 3: No slots");
        ParkingSystem ps3 = new ParkingSystem(0, 0, 0);
        System.out.println(ps3.addCar(1)); // Expected: false
        System.out.println(ps3.addCar(2)); // Expected: false
        System.out.println(ps3.addCar(3)); // Expected: false
        
        // Test case 4: Large capacity
        System.out.println("\nTest 4: Large capacity");
        ParkingSystem ps4 = new ParkingSystem(100, 50, 25);
        System.out.println(ps4.addCar(1)); // Expected: true
        System.out.println(ps4.addCar(2)); // Expected: true
        System.out.println(ps4.addCar(3)); // Expected: true
    }
}
