package com.example.javas.easy;

import java.util.*;

/**
 * E046: Vehicle Rental System (OOP Practice)
 * Difficulty: Easy (System Design + OOP)
 * Time Target: 25 minutes
 * 
 * Problem:
 * Design a vehicle rental system that demonstrates object-oriented programming concepts
 * including abstract classes, interfaces, inheritance, and polymorphism.
 * 
 * Requirements:
 * 1. Create an interface Rentable with methods:
 *    - double calculateRentalCost(int days)
 *    - String getVehicleInfo()
 * 
 * 2. Create an abstract class Vehicle that implements Rentable:
 *    - Fields: String licensePlate, String model, double basePricePerDay
 *    - Abstract method: double getMaintenanceFee()
 *    - Concrete method: getVehicleInfo() that returns formatted vehicle details
 * 
 * 3. Create concrete classes that extend Vehicle:
 *    - Car: has additional field 'numDoors', maintenance fee is 10% of base price
 *    - Motorcycle: has additional field 'engineSize', maintenance fee is 5% of base price
 *    - Truck: has additional field 'cargoCapacity', maintenance fee is 15% of base price
 * 
 * 4. Implement RentalSystem class:
 *    - addVehicle(Vehicle vehicle): Add vehicle to inventory
 *    - rentVehicle(String licensePlate, int days): Calculate and return rental cost
 *    - getVehicleInfo(String licensePlate): Get vehicle information
 *    - listAllVehicles(): Return list of all vehicle info strings
 * 
 * Formula:
 * Total Rental Cost = (basePricePerDay * days) + maintenanceFee
 * 
 * Constraints:
 * - 1 <= days <= 365
 * - 1 <= basePricePerDay <= 1000
 * - License plates are unique
 * 
 * Examples:
 * RentalSystem system = new RentalSystem();
 * Car car = new Car("ABC123", "Toyota Camry", 50.0, 4);
 * system.addVehicle(car);
 * system.rentVehicle("ABC123", 3);  // return 155.0 (50*3 + 5.0 maintenance)
 * system.getVehicleInfo("ABC123");  // return "Car: Toyota Camry (ABC123), Doors: 4"
 * 
 * OOP Concepts Practiced:
 * - Interface: Rentable defines contract
 * - Abstract Class: Vehicle provides partial implementation
 * - Inheritance: Car, Motorcycle, Truck extend Vehicle
 * - Polymorphism: Store different vehicle types in same collection
 * - Encapsulation: Private fields with getters
 * 
 * Time Complexity: O(1) for add/rent/get, O(n) for list
 * Space Complexity: O(n) where n is number of vehicles
 */
public class E046_VehicleRentalSystem {
    
    // TODO: Create Rentable interface
    // - double calculateRentalCost(int days)
    // - String getVehicleInfo()
    
    
    // TODO: Create abstract Vehicle class implementing Rentable
    // Fields:
    // - protected String licensePlate
    // - protected String model
    // - protected double basePricePerDay
    // 
    // Constructor to initialize fields
    // 
    // Abstract method:
    // - abstract double getMaintenanceFee()
    // 
    // Concrete methods:
    // - calculateRentalCost(int days): return basePricePerDay * days + getMaintenanceFee()
    // - getVehicleInfo(): return basic vehicle info (to be overridden)
    
    
    // TODO: Create Car class extending Vehicle
    // Additional field:
    // - private int numDoors
    // 
    // Constructor: initialize all fields including parent fields
    // 
    // Override getMaintenanceFee(): return basePricePerDay * 0.10
    // Override getVehicleInfo(): return "Car: [model] ([licensePlate]), Doors: [numDoors]"
    
    
    // TODO: Create Motorcycle class extending Vehicle
    // Additional field:
    // - private int engineSize (in cc)
    // 
    // Constructor: initialize all fields
    // 
    // Override getMaintenanceFee(): return basePricePerDay * 0.05
    // Override getVehicleInfo(): return "Motorcycle: [model] ([licensePlate]), Engine: [engineSize]cc"
    
    
    // TODO: Create Truck class extending Vehicle
    // Additional field:
    // - private double cargoCapacity (in tons)
    // 
    // Constructor: initialize all fields
    // 
    // Override getMaintenanceFee(): return basePricePerDay * 0.15
    // Override getVehicleInfo(): return "Truck: [model] ([licensePlate]), Cargo: [cargoCapacity]t"
    
    
    // TODO: Create RentalSystem class
    // Field:
    // - private HashMap<String, Vehicle> vehicles (licensePlate -> Vehicle)
    // 
    // Methods:
    // - void addVehicle(Vehicle vehicle): add to map
    // - Double rentVehicle(String licensePlate, int days): calculate cost, return null if not found
    // - String getVehicleInfo(String licensePlate): return vehicle info, null if not found
    // - List<String> listAllVehicles(): return list of all vehicle info strings
    
    
    // Test cases
    public static void main(String[] args) {
        System.out.println("Test 1: Basic rental");
        // Create rental system
        // Add a car with 4 doors, base price 50/day
        // Rent for 3 days
        // Expected: 155.0 (150 + 5 maintenance)
        
        System.out.println("\nTest 2: Different vehicle types");
        // Create system with car, motorcycle, truck
        // Test rental cost for each type
        // Car (50/day, 3 days): 155.0
        // Motorcycle (30/day, 2 days): 61.5
        // Truck (100/day, 5 days): 515.0
        
        System.out.println("\nTest 3: Polymorphism");
        // Store different vehicle types in same list
        // Iterate and display info for each
        
        System.out.println("\nTest 4: Non-existent vehicle");
        // Try to rent non-existent vehicle
        // Expected: null
        
        System.out.println("\nTest 5: List all vehicles");
        // Add multiple vehicles
        // List all and verify output
    }
}
