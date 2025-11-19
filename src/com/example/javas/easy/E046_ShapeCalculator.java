package com.example.javas.easy;

import java.util.*;

/**
 * E046: Shape Calculator (Inheritance & Polymorphism Practice)
 * Difficulty: Easy (OOP)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Create a simple shape calculator system to practice inheritance and polymorphism.
 * 
 * Requirements:
 * 1. Create a base class Shape with:
 *    - String name
 *    - Constructor
 *    - Method: double getArea() (to be overridden)
 *    - Method: String getInfo() that returns shape information
 * 
 * 2. Create subclasses:
 *    - Circle: has radius, area = π * r²
 *    - Rectangle: has width and height, area = width * height
 *    - Triangle: has base and height, area = 0.5 * base * height
 * 
 * 3. Each subclass should:
 *    - Override getArea() with correct formula
 *    - Override getInfo() to include specific dimensions
 * 
 * Examples:
 * Circle c = new Circle(5.0);
 * c.getArea();      // return 78.54 (approximately π * 5²)
 * c.getInfo();      // return "Circle with radius: 5.0"
 * 
 * Rectangle r = new Rectangle(4.0, 6.0);
 * r.getArea();      // return 24.0
 * r.getInfo();      // return "Rectangle with width: 4.0, height: 6.0"
 * 
 * Polymorphism example:
 * Shape s1 = new Circle(3.0);
 * Shape s2 = new Rectangle(5.0, 2.0);
 * List<Shape> shapes = Arrays.asList(s1, s2);
 * for (Shape s : shapes) {
 *     System.out.println(s.getInfo() + ", Area: " + s.getArea());
 * }
 * 
 * OOP Concepts:
 * - Inheritance: Subclasses extend Shape base class
 * - Polymorphism: Different shapes stored in same Shape reference
 * - Method Overriding: Each shape implements getArea() differently
 * - Encapsulation: Private fields with public methods
 * 
 * Time Complexity: O(1) for all operations
 * Space Complexity: O(1)
 */
public class E046_ShapeCalculator {
    
    // TODO: Create Shape base class
    // Fields:
    // - protected String name
    // 
    // Constructor:
    // - Shape(String name)
    // 
    // Methods:
    // - double getArea() - returns 0.0 (to be overridden)
    // - String getInfo() - returns "Shape: " + name
    
    
    // TODO: Create Circle class extending Shape
    // Fields:
    // - private double radius
    // 
    // Constructor:
    // - Circle(double radius) - call super("Circle")
    // 
    // Override:
    // - double getArea() - return Math.PI * radius * radius
    // - String getInfo() - return "Circle with radius: " + radius
    
    
    // TODO: Create Rectangle class extending Shape
    // Fields:
    // - private double width
    // - private double height
    // 
    // Constructor:
    // - Rectangle(double width, double height) - call super("Rectangle")
    // 
    // Override:
    // - double getArea() - return width * height
    // - String getInfo() - return "Rectangle with width: " + width + ", height: " + height
    
    
    // TODO: Create Triangle class extending Shape
    // Fields:
    // - private double base
    // - private double height
    // 
    // Constructor:
    // - Triangle(double base, double height) - call super("Triangle")
    // 
    // Override:
    // - double getArea() - return 0.5 * base * height
    // - String getInfo() - return "Triangle with base: " + base + ", height: " + height
    
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Circle
        System.out.println("Test 1: Circle");
        // Create circle with radius 5
        // Print area (should be ~78.54)
        // Print info
        
        // Test case 2: Rectangle
        System.out.println("\nTest 2: Rectangle");
        // Create rectangle 4x6
        // Print area (should be 24.0)
        // Print info
        
        // Test case 3: Triangle
        System.out.println("\nTest 3: Triangle");
        // Create triangle with base 10, height 5
        // Print area (should be 25.0)
        // Print info
        
        // Test case 4: Polymorphism
        System.out.println("\nTest 4: Polymorphism");
        // Create list of Shape references pointing to different types
        // Circle(3), Rectangle(5,2), Triangle(6,4)
        // Loop through and print info and area for each
        
        // Test case 5: Calculate total area
        System.out.println("\nTest 5: Total area");
        // Create multiple shapes
        // Calculate and print total area of all shapes
    }
}
