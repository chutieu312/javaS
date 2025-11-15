"""
E038: Design Student Grade System

Summary:
Design a student grade management system for tracking students and grades.

Requirements:
Implement the GradeBook class:
- add_student(student_id, name): Adds a student
- add_grade(student_id, grade): Adds a grade (0-100)
- get_average(student_id): Returns average grade or None
- get_name(student_id): Returns student name or None

Approach:
Use dict to map student_id -> Student object with name and grades list

Data Structures:
- Student class with name and grades list
- dict[int, Student]: student_id -> Student

Big O Analysis:
Time Complexity: 
- add_student, add_grade, get_name: O(1)
- get_average: O(k) where k is number of grades
Space Complexity: O(n * k) where n is students, k is avg grades per student
"""


class GradeBook:
    
    class Student:
        def __init__(self, name: str):
            """
            TODO: Initialize Student
            Set name and create empty grades list
            """
            pass
    
    def __init__(self):
        """
        TODO: Initialize the dict to store students
        """
        pass
    
    def add_student(self, student_id: int, name: str) -> bool:
        """
        TODO: Add new student
        1. Check if student_id exists
        2. If exists, return False
        3. Create Student and add to dict, return True
        """
        pass
    
    def add_grade(self, student_id: int, grade: int) -> bool:
        """
        TODO: Add grade to student
        1. Validate grade (0-100)
        2. Check if student exists
        3. Add grade to student's list and return True
        """
        pass
    
    def get_average(self, student_id: int) -> float | None:
        """
        TODO: Calculate average grade
        1. Check if student exists
        2. If no grades, return None
        3. Return sum / count
        """
        pass
    
    def get_name(self, student_id: int) -> str | None:
        """
        TODO: Get student name
        Return name if exists, None otherwise
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic operations")
    gb1 = GradeBook()
    print(gb1.add_student(1, "Alice"))     # Expected: True
    print(gb1.get_name(1))                 # Expected: Alice
    print(gb1.add_grade(1, 90))            # Expected: True
    print(gb1.add_grade(1, 85))            # Expected: True
    print(gb1.get_average(1))              # Expected: 87.5
    
    print("\nTest 2: Multiple students")
    gb2 = GradeBook()
    gb2.add_student(1, "Alice")
    gb2.add_student(2, "Bob")
    gb2.add_grade(1, 90)
    gb2.add_grade(2, 100)
    gb2.add_grade(1, 80)
    print(gb2.get_average(1))              # Expected: 85.0
    print(gb2.get_average(2))              # Expected: 100.0
    
    print("\nTest 3: Duplicate student")
    gb3 = GradeBook()
    print(gb3.add_student(1, "Alice"))     # Expected: True
    print(gb3.add_student(1, "Bob"))       # Expected: False
    print(gb3.get_name(1))                 # Expected: Alice
    
    print("\nTest 4: Invalid operations")
    gb4 = GradeBook()
    gb4.add_student(1, "Alice")
    print(gb4.add_grade(1, 150))           # Expected: False
    print(gb4.add_grade(1, -10))           # Expected: False
    print(gb4.add_grade(99, 90))           # Expected: False
    print(gb4.get_name(99))                # Expected: None
    print(gb4.get_average(99))             # Expected: None
    
    print("\nTest 5: Student with no grades")
    gb5 = GradeBook()
    gb5.add_student(1, "Alice")
    print(gb5.get_average(1))              # Expected: None
    gb5.add_grade(1, 100)
    print(gb5.get_average(1))              # Expected: 100.0
