package com.example.javas.easy;

import java.util.*;

/**
 * E038: Design Student Grade System
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a student grade management system that allows teachers to add students,
 * record grades, and calculate average grades.
 * 
 * Requirements:
 * Implement the GradeBook class:
 * - GradeBook() Initializes the grade book
 * - boolean addStudent(int studentId, String name) Adds a student with the given 
 *   studentId and name. Return false if studentId already exists, otherwise return true
 * - boolean addGrade(int studentId, int grade) Adds a grade (0-100) to the student's 
 *   record. Return false if student doesn't exist or grade is invalid, otherwise return true
 * - Double getAverage(int studentId) Returns the average grade of the student. 
 *   Return null if student doesn't exist or has no grades
 * - String getName(int studentId) Returns the name of the student.
 *   Return null if student doesn't exist
 * 
 * Constraints:
 * - 1 <= studentId <= 10^5
 * - 1 <= name.length <= 50
 * - 0 <= grade <= 100
 * - At most 5000 calls will be made to all functions combined
 * 
 * Examples:
 * GradeBook gb = new GradeBook();
 * gb.addStudent(1, "Alice");     // return true
 * gb.addStudent(2, "Bob");       // return true
 * gb.getName(1);                 // return "Alice"
 * gb.addGrade(1, 90);            // return true
 * gb.addGrade(1, 85);            // return true
 * gb.getAverage(1);              // return 87.5 (90+85)/2
 * gb.addGrade(2, 100);           // return true
 * gb.getAverage(2);              // return 100.0
 * gb.addGrade(1, 95);            // return true
 * gb.getAverage(1);              // return 90.0 (90+85+95)/3
 * gb.addGrade(3, 80);            // return false (student 3 doesn't exist)
 * gb.addGrade(1, 150);           // return false (invalid grade)
 * gb.getAverage(2);              // return 100.0
 * gb.getName(99);                // return null (student doesn't exist)
 * 
 * Approach:
 * Use a HashMap to store student information:
 * 1. Create a Student class with name and list of grades
 * 2. Use HashMap<Integer, Student> to map studentId -> Student object
 * 3. addStudent: check if exists, create new Student if not
 * 4. addGrade: validate grade (0-100), add to student's grade list
 * 5. getAverage: calculate sum of grades / count
 * 6. getName: return student's name
 * 
 * Data Structures:
 * - Student class with name (String) and grades (List<Integer>)
 * - HashMap<Integer, Student> to map studentId -> Student
 * 
 * Time Complexity: 
 * - addStudent, addGrade, getName: O(1)
 * - getAverage: O(k) where k is number of grades for the student
 * 
 * Space Complexity: O(n * k) where n is students, k is avg grades per student
 */
public class E038_StudentGradeSystem {
    
    static class GradeBook {
        
        // TODO: Create inner Student class
        // - String name
        // - List<Integer> grades
        // - Constructor to initialize
        
        // TODO: Declare HashMap to store students
        // Map from studentId (Integer) to Student object
        
        public GradeBook() {
            // TODO: Initialize the HashMap
        }
        
        public boolean addStudent(int studentId, String name) {
            // TODO: Add new student
            // 1. Check if studentId already exists
            // 2. If exists, return false
            // 3. Create new Student with name and empty grade list
            // 4. Add to map and return true
            
            return false;
        }
        
        public boolean addGrade(int studentId, int grade) {
            // TODO: Add grade to student
            // 1. Validate grade is between 0 and 100
            // 2. Check if student exists
            // 3. If student doesn't exist or grade invalid, return false
            // 4. Add grade to student's grade list and return true
            
            return false;
        }
        
        public Double getAverage(int studentId) {
            // TODO: Calculate average grade
            // 1. Check if student exists
            // 2. If not exists, return null
            // 3. Get student's grade list
            // 4. If grade list is empty, return null
            // 5. Calculate sum of all grades
            // 6. Return sum / number of grades
            
            return null;
        }
        
        public String getName(int studentId) {
            // TODO: Get student name
            // 1. Check if student exists
            // 2. If exists, return student's name
            // 3. If not exists, return null
            
            return null;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic operations
        System.out.println("Test 1: Basic operations");
        GradeBook gb1 = new GradeBook();
        System.out.println(gb1.addStudent(1, "Alice"));    // Expected: true
        System.out.println(gb1.getName(1));                // Expected: Alice
        System.out.println(gb1.addGrade(1, 90));           // Expected: true
        System.out.println(gb1.addGrade(1, 85));           // Expected: true
        System.out.println(gb1.getAverage(1));             // Expected: 87.5
        
        // Test case 2: Multiple students
        System.out.println("\nTest 2: Multiple students");
        GradeBook gb2 = new GradeBook();
        gb2.addStudent(1, "Alice");
        gb2.addStudent(2, "Bob");
        gb2.addGrade(1, 90);
        gb2.addGrade(2, 100);
        gb2.addGrade(1, 80);
        System.out.println(gb2.getAverage(1));             // Expected: 85.0
        System.out.println(gb2.getAverage(2));             // Expected: 100.0
        
        // Test case 3: Duplicate student
        System.out.println("\nTest 3: Duplicate student");
        GradeBook gb3 = new GradeBook();
        System.out.println(gb3.addStudent(1, "Alice"));    // Expected: true
        System.out.println(gb3.addStudent(1, "Bob"));      // Expected: false
        System.out.println(gb3.getName(1));                // Expected: Alice
        
        // Test case 4: Invalid operations
        System.out.println("\nTest 4: Invalid operations");
        GradeBook gb4 = new GradeBook();
        gb4.addStudent(1, "Alice");
        System.out.println(gb4.addGrade(1, 150));          // Expected: false (invalid grade)
        System.out.println(gb4.addGrade(1, -10));          // Expected: false (invalid grade)
        System.out.println(gb4.addGrade(99, 90));          // Expected: false (student doesn't exist)
        System.out.println(gb4.getName(99));               // Expected: null
        System.out.println(gb4.getAverage(99));            // Expected: null
        
        // Test case 5: No grades yet
        System.out.println("\nTest 5: Student with no grades");
        GradeBook gb5 = new GradeBook();
        gb5.addStudent(1, "Alice");
        System.out.println(gb5.getAverage(1));             // Expected: null (no grades)
        gb5.addGrade(1, 100);
        System.out.println(gb5.getAverage(1));             // Expected: 100.0
    }
}
