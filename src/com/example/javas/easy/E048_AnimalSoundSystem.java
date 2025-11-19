package com.example.javas.easy;

import java.util.*;

/**
 * E048: Animal Sound System (Abstract Class Practice)
 * Difficulty: Easy (OOP)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Create an animal sound system to practice abstract classes.
 * 
 * Requirements:
 * 1. Create abstract class Animal with:
 *    - protected String name
 *    - protected int age
 *    - Constructor
 *    - Abstract method: String makeSound()
 *    - Concrete method: String getInfo() that returns basic animal info
 *    - Concrete method: boolean isAdult() returns true if age >= 2
 * 
 * 2. Create concrete classes:
 *    - Dog: makeSound() returns "Woof! Woof!"
 *    - Cat: makeSound() returns "Meow! Meow!"
 *    - Cow: makeSound() returns "Moo! Moo!"
 * 
 * 3. Create AnimalFarm class:
 *    - void addAnimal(Animal animal)
 *    - List<String> getAllSounds() - return list of all animal sounds
 *    - int countAdults() - count animals with age >= 2
 *    - List<String> getAnimalInfo() - return list of all animal info
 * 
 * Examples:
 * Dog dog = new Dog("Buddy", 3);
 * dog.makeSound();    // return "Woof! Woof!"
 * dog.getInfo();      // return "Dog named Buddy, age 3"
 * dog.isAdult();      // return true
 * 
 * Cat cat = new Cat("Whiskers", 1);
 * cat.makeSound();    // return "Meow! Meow!"
 * cat.isAdult();      // return false
 * 
 * AnimalFarm farm = new AnimalFarm();
 * farm.addAnimal(new Dog("Max", 5));
 * farm.addAnimal(new Cat("Luna", 1));
 * farm.getAllSounds();  // return ["Woof! Woof!", "Meow! Meow!"]
 * farm.countAdults();   // return 1
 * 
 * OOP Concepts:
 * - Abstract Class: Animal provides partial implementation
 * - Abstract Methods: makeSound() must be implemented by subclasses
 * - Concrete Methods: getInfo() and isAdult() are shared by all animals
 * - Inheritance: Dog, Cat, Cow extend Animal
 * - Polymorphism: Store different animals in Animal references
 * 
 * Time Complexity: O(1) for single operations, O(n) for list operations
 * Space Complexity: O(n) where n is number of animals
 */
public class E048_AnimalSoundSystem {
    
    // TODO: Create abstract Animal class
    // Fields:
    // - protected String name
    // - protected int age
    // 
    // Constructor:
    // - Animal(String name, int age)
    // 
    // Abstract method:
    // - abstract String makeSound()
    // 
    // Concrete methods:
    // - String getInfo(): return animal type + " named " + name + ", age " + age
    //   Note: Use this.getClass().getSimpleName() to get class name (Dog, Cat, etc.)
    // - boolean isAdult(): return age >= 2
    
    
    // TODO: Create Dog class extending Animal
    // Constructor:
    // - Dog(String name, int age): call super(name, age)
    // 
    // Override:
    // - String makeSound(): return "Woof! Woof!"
    
    
    // TODO: Create Cat class extending Animal
    // Constructor:
    // - Cat(String name, int age): call super(name, age)
    // 
    // Override:
    // - String makeSound(): return "Meow! Meow!"
    
    
    // TODO: Create Cow class extending Animal
    // Constructor:
    // - Cow(String name, int age): call super(name, age)
    // 
    // Override:
    // - String makeSound(): return "Moo! Moo!"
    
    
    // TODO: Create AnimalFarm class
    // Fields:
    // - private List<Animal> animals
    // 
    // Constructor:
    // - AnimalFarm(): initialize empty list
    // 
    // Methods:
    // - void addAnimal(Animal animal): add to list
    // - List<String> getAllSounds(): return list of all animal sounds
    // - int countAdults(): count animals where isAdult() is true
    // - List<String> getAnimalInfo(): return list of all animal info strings
    
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Dog
        System.out.println("Test 1: Dog");
        // Create dog "Buddy" age 3
        // Print sound, info, and isAdult
        
        // Test case 2: Cat
        System.out.println("\nTest 2: Cat");
        // Create cat "Whiskers" age 1
        // Print sound, info, and isAdult
        
        // Test case 3: Cow
        System.out.println("\nTest 3: Cow");
        // Create cow "Bessie" age 4
        // Print sound, info, and isAdult
        
        // Test case 4: Animal Farm
        System.out.println("\nTest 4: Animal Farm");
        // Create farm
        // Add Dog("Max", 5), Cat("Luna", 1), Cow("Daisy", 3)
        // Print all sounds
        // Print count of adults (should be 2)
        
        // Test case 5: Polymorphism
        System.out.println("\nTest 5: Polymorphism");
        // Create list of Animal references
        // Add different animal types
        // Loop and call makeSound() on each
    }
}
