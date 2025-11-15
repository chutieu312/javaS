"""
M005: Design Task Scheduler

Summary:
Design a task scheduler with priority queue.

Requirements:
Implement the TaskScheduler class:
- add_task(task_name, priority): Adds task with priority (1=highest, 5=lowest)
- execute_next(): Executes and returns next highest priority task
- get_pending_count(): Returns pending task count

Approach:
Use heap (priority queue) to manage tasks by priority and insertion order.

Data Structures:
- heap: min-heap of (priority, insertion_order, task_name)
- int: counter for insertion order

Big O Analysis:
Time Complexity: O(log n) for add_task and execute_next
Space Complexity: O(n) where n is pending tasks
"""

import heapq


class TaskScheduler:
    
    def __init__(self):
        """
        TODO: Initialize heap and counter
        """
        pass
    
    def add_task(self, task_name: str, priority: int):
        """
        TODO: Add task to heap
        1. Push (priority, counter, task_name) to heap
        2. Increment counter
        """
        pass
    
    def execute_next(self) -> str:
        """
        TODO: Execute next task
        1. Pop from heap
        2. Return task name or "No tasks"
        """
        pass
    
    def get_pending_count(self) -> int:
        """
        TODO: Return heap size
        """
        pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Priority scheduling")
    scheduler = TaskScheduler()
    
    scheduler.add_task("Email Report", 3)
    scheduler.add_task("Fix Bug", 1)
    scheduler.add_task("Write Docs", 3)
    scheduler.add_task("Deploy App", 1)
    scheduler.add_task("Code Review", 2)
    
    print(f"Pending tasks: {scheduler.get_pending_count()}")  # Expected: 5
    
    print("\nExecuting tasks:")
    while scheduler.get_pending_count() > 0:
        print(f"- {scheduler.execute_next()}")
    # Expected order: Fix Bug, Deploy App, Code Review, Email Report, Write Docs
    
    print(f"\nExecute when empty: {scheduler.execute_next()}")  # Expected: No tasks
    print(f"Pending tasks: {scheduler.get_pending_count()}")    # Expected: 0
