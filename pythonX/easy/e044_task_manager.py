"""
E044: Design Task Manager

Summary:
Design a task manager for creating and tracking tasks.

Requirements:
Implement the TaskManager class:
- add_task(task_id, description): Adds a task (initially incomplete)
- complete_task(task_id): Marks task as complete
- delete_task(task_id): Removes task
- get_incomplete_tasks(): Returns list of incomplete task IDs
- get_completed_tasks(): Returns list of completed task IDs
- get_description(task_id): Returns description or None
- is_completed(task_id): Returns completion status

Approach:
Use dict to map task_id -> Task with description and completed status

Data Structures:
- Task class with description and completed flag
- dict[int, Task]: task_id -> Task

Big O Analysis:
Time Complexity: 
- add_task, complete_task, delete_task, get_description, is_completed: O(1)
- get_incomplete_tasks, get_completed_tasks: O(n)
Space Complexity: O(n) where n is number of tasks
"""


class TaskManager:
    
    class Task:
        def __init__(self, description: str):
            """
            TODO: Initialize Task
            Set description and completed = False
            """
            pass
    
    def __init__(self):
        """
        TODO: Initialize the dict to store tasks
        """
        pass
    
    def add_task(self, task_id: int, description: str) -> bool:
        """
        TODO: Add new task
        1. Check if task_id exists
        2. If exists, return False
        3. Create Task and add to dict, return True
        """
        pass
    
    def complete_task(self, task_id: int) -> bool:
        """
        TODO: Mark task as completed
        1. Check if task exists
        2. If already completed, return False
        3. Mark as completed and return True
        """
        pass
    
    def delete_task(self, task_id: int) -> bool:
        """
        TODO: Delete task
        Return True if deleted, False if not exists
        """
        pass
    
    def get_incomplete_tasks(self) -> list[int]:
        """
        TODO: Get all incomplete task IDs
        Filter tasks where completed is False
        """
        pass
    
    def get_completed_tasks(self) -> list[int]:
        """
        TODO: Get all completed task IDs
        Filter tasks where completed is True
        """
        pass
    
    def get_description(self, task_id: int) -> str | None:
        """
        TODO: Get task description
        Return description if exists, None otherwise
        """
        pass
    
    def is_completed(self, task_id: int) -> bool:
        """
        TODO: Check if task is completed
        Return completed status or False if not exists
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic operations")
    tm1 = TaskManager()
    print(tm1.add_task(1, "Buy groceries"))      # Expected: True
    print(tm1.add_task(2, "Clean house"))        # Expected: True
    print(tm1.get_incomplete_tasks())            # Expected: [1, 2] or [2, 1]
    print(tm1.complete_task(1))                  # Expected: True
    print(tm1.get_incomplete_tasks())            # Expected: [2]
    print(tm1.get_completed_tasks())             # Expected: [1]
    
    print("\nTest 2: Already completed")
    tm2 = TaskManager()
    tm2.add_task(1, "Task 1")
    tm2.complete_task(1)
    print(tm2.complete_task(1))                  # Expected: False
    print(tm2.is_completed(1))                   # Expected: True
    
    print("\nTest 3: Delete task")
    tm3 = TaskManager()
    tm3.add_task(1, "Task 1")
    tm3.add_task(2, "Task 2")
    tm3.complete_task(1)
    print(tm3.delete_task(2))                    # Expected: True
    print(tm3.get_incomplete_tasks())            # Expected: []
    print(tm3.get_completed_tasks())             # Expected: [1]
    
    print("\nTest 4: Invalid operations")
    tm4 = TaskManager()
    print(tm4.complete_task(99))                 # Expected: False
    print(tm4.delete_task(99))                   # Expected: False
    print(tm4.get_description(99))               # Expected: None
    print(tm4.is_completed(99))                  # Expected: False
    
    print("\nTest 5: Multiple tasks")
    tm5 = TaskManager()
    tm5.add_task(1, "Task A")
    tm5.add_task(2, "Task B")
    tm5.add_task(3, "Task C")
    tm5.complete_task(1)
    tm5.complete_task(3)
    print(tm5.get_incomplete_tasks())            # Expected: [2]
    print(tm5.get_completed_tasks())             # Expected: [1, 3] or [3, 1]
    print(tm5.get_description(2))                # Expected: Task B
