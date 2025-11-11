/*
SYSTEM DESIGN PROBLEM:
Design a simple Parking Lot System (Simplified for 25 min interview)

REQUIREMENTS:
- Park a vehicle (assign next available spot)
- Remove a vehicle from a parking spot
- Check available spots

CONSTRAINTS:
- Fixed capacity (e.g., 10 spots)
- Simple sequential spot assignment (no need for min-heap)
- Use HashMap for O(1) operations

DESIGN APPROACH:
1. Use HashMap to store vehicle ID → spot number
2. Use simple counter for next available spot
3. Track occupied spots count

DATA STRUCTURES USED:
- HashMap<String, Integer>: vehicleId → spotNumber
- int nextSpot: next available spot to assign

TIME COMPLEXITY:
- park(): O(1)
- remove(): O(1)
- getAvailableSpots(): O(1)

SPACE COMPLEXITY: O(n) where n is capacity
*/

package com.example.javas.medium;

import java.util.*;

public class M003_ParkingLotSystem {
    
    // Simplified Parking Lot System
    static class ParkingLot {
        private int capacity;
        private int occupiedSpots;
        private HashMap<String, Integer> vehicleToSpot; // vehicleId → spot number
        
        public ParkingLot(int capacity) {
            // DONE: Initialize capacity, occupiedSpots (0), and HashMap
            this.capacity = capacity;
            this.occupiedSpots = 0;
            this.vehicleToSpot = new HashMap<>();
        }
        
        public int park(String vehicleId) {
            // DONE: Implement park operation
            // 1. Check if parking lot is full (occupiedSpots >= capacity)
            // 2. Check if vehicle already parked (vehicleId exists in map)
            // 3. Assign spot (occupiedSpots + 1), add to map, increment occupiedSpots
            // 4. Return spot number (or -1 if full/duplicate)
            
            if (occupiedSpots >= capacity) {
                return -1; // Parking lot is full
            }
            
            if (vehicleToSpot.containsKey(vehicleId)) {
                return -1; // Vehicle already parked
            }
            
            int spotNumber = occupiedSpots + 1;
            vehicleToSpot.put(vehicleId, spotNumber);
            occupiedSpots++;
            
            return spotNumber;
        }
        
        public boolean remove(String vehicleId) {
            // DONE: Implement remove operation
            // 1. Check if vehicle exists in map
            // 2. If yes: remove from map, decrement occupiedSpots, return true
            // 3. If no: return false
            
            if (!vehicleToSpot.containsKey(vehicleId)) {
                return false; // Vehicle not found
            }
            
            vehicleToSpot.remove(vehicleId);
            occupiedSpots--;
            
            return true;
        }
        
        public int getAvailableSpots() {
            // DONE: Return capacity - occupiedSpots
            return capacity - occupiedSpots;
        }
        
        public void displayStatus() {
            System.out.println("Occupied: " + occupiedSpots + "/" + capacity);
            System.out.println("Available: " + getAvailableSpots());
            System.out.println("Vehicles: " + vehicleToSpot);
        }
    }
    
    // TEST CASES
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(3);
        
        System.out.println("Park CAR-1: " + lot.park("CAR-1"));
        System.out.println("Park CAR-2: " + lot.park("CAR-2"));
        System.out.println("Park CAR-3: " + lot.park("CAR-3"));
        System.out.println("Park CAR-4 (full): " + lot.park("CAR-4")); // Should be -1
        System.out.println("Available: " + lot.getAvailableSpots());
        System.out.println();
        
        System.out.println("Remove CAR-2: " + lot.remove("CAR-2"));
        System.out.println("Available: " + lot.getAvailableSpots());
        System.out.println("Remove CAR-999: " + lot.remove("CAR-999")); // Should be false
    }
}
