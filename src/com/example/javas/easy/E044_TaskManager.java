package com.example.javas.easy;

import java.util.*;

/**
 * E044: Design Task Manager
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a simple task manager that can create tasks, mark them as complete,
 * delete tasks, and list tasks by status.
 * 
 * Requirements:
 * Implement the TaskManager class:
 * - TaskManager() Initializes the task manager
 * - boolean addTask(int taskId, String description) Adds a new task with the given 
 *   taskId and description (initially incomplete). Return false if taskId exists, else true
 * - boolean completeTask(int taskId) Marks the task as complete. Return false if 
 *   task doesn't exist or already completed, else return true
 * - boolean deleteTask(int taskId) Removes the task. Return false if task doesn't 
 *   exist, else return true
 * - List<Integer> getIncompleteTasks() Returns list of all incomplete task IDs
 * - List<Integer> getCompletedTasks() Returns list of all completed task IDs
 * - String getDescription(int taskId) Returns the task description.
 *   Return null if task doesn't exist
 * - boolean isCompleted(int taskId) Returns true if task is completed, false if incomplete.
 *   Return false if task doesn't exist
 * 
 * Constraints:
 * - 1 <= taskId <= 10^5
 * - 1 <= description.length <= 200
 * - At most 5000 calls will be made to all functions combined
 * 
 * Examples:
 * TaskManager tm = new TaskManager();
 * tm.addTask(1, "Buy groceries");      // return true
 * tm.addTask(2, "Clean house");        // return true
 * tm.getIncompleteTasks();             // return [1, 2] (or [2, 1])
 * tm.completeTask(1);                  // return true
 * tm.getIncompleteTasks();             // return [2]
 * tm.getCompletedTasks();              // return [1]
 * tm.isCompleted(1);                   // return true
 * tm.isCompleted(2);                   // return false
 * tm.completeTask(1);                  // return false (already completed)
 * tm.deleteTask(2);                    // return true
 * tm.getIncompleteTasks();             // return []
 * tm.getDescription(1);                // return "Buy groceries"
 * 
 * Approach:
 * Use HashMap to store task information:
 * 1. Create Task class with description and completed status
 * 2. Use HashMap<Integer, Task> to map taskId -> Task
 * 3. addTask: add new Task to map
 * 4. completeTask: check if exists and not completed, mark as completed
 * 5. deleteTask: remove from map
 * 6. getIncompleteTasks/getCompletedTasks: iterate and filter by status
 * 7. getDescription: lookup and return description
 * 8. isCompleted: lookup and return status
 * 
 * Data Structures:
 * - Task class with description (String) and completed (boolean)
 * - HashMap<Integer, Task> to map taskId -> Task
 * 
 * Time Complexity: 
 * - addTask, completeTask, deleteTask, getDescription, isCompleted: O(1)
 * - getIncompleteTasks, getCompletedTasks: O(n) where n is total tasks
 * 
 * Space Complexity: O(n) where n is number of tasks
 */
public class E044_TaskManager {
    
    static class TaskManager {
        
        // TODO: Create inner Task class
        // - String description
        // - boolean completed (whether task is completed)
        // - Constructor to initialize
        
        // TODO: Declare HashMap to store tasks
        // Map from taskId (Integer) to Task object
        
        public TaskManager() {
            // TODO: Initialize the HashMap
        }
        
        public boolean addTask(int taskId, String description) {
            // TODO: Add new task
            // 1. Check if taskId already exists
            // 2. If exists, return false
            // 3. Create new Task with description and completed=false
            // 4. Add to map and return true
            
            return false;
        }
        
        public boolean completeTask(int taskId) {
            // TODO: Mark task as completed
            // 1. Check if task exists
            // 2. If not exists, return false
            // 3. Get the task
            // 4. If already completed, return false
            // 5. Mark as completed and return true
            
            return false;
        }
        
        public boolean deleteTask(int taskId) {
            // TODO: Delete task
            // 1. Check if task exists
            // 2. If not exists, return false
            // 3. Remove from map and return true
            
            return false;
        }
        
        public List<Integer> getIncompleteTasks() {
            // TODO: Get all incomplete task IDs
            // 1. Create empty list
            // 2. Iterate through all entries in map
            // 3. If task is not completed, add taskId to list
            // 4. Return list
            
            return new ArrayList<>();
        }
        
        public List<Integer> getCompletedTasks() {
            // TODO: Get all completed task IDs
            // 1. Create empty list
            // 2. Iterate through all entries in map
            // 3. If task is completed, add taskId to list
            // 4. Return list
            
            return new ArrayList<>();
        }
        
        public String getDescription(int taskId) {
            // TODO: Get task description
            // 1. Check if task exists
            // 2. If exists, return task's description
            // 3. If not exists, return null
            
            return null;
        }
        
        public boolean isCompleted(int taskId) {
            // TODO: Check if task is completed
            // 1. Check if task exists
            // 2. If exists, return task's completed status
            // 3. If not exists, return false
            
            return false;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic operations
        System.out.println("Test 1: Basic operations");
        TaskManager tm1 = new TaskManager();
        System.out.println(tm1.addTask(1, "Buy groceries"));     // Expected: true
        System.out.println(tm1.addTask(2, "Clean house"));       // Expected: true
        System.out.println(tm1.getIncompleteTasks());            // Expected: [1, 2] or [2, 1]
        System.out.println(tm1.completeTask(1));                 // Expected: true
        System.out.println(tm1.getIncompleteTasks());            // Expected: [2]
        System.out.println(tm1.getCompletedTasks());             // Expected: [1]
        
        // Test case 2: Complete already completed task
        System.out.println("\nTest 2: Already completed");
        TaskManager tm2 = new TaskManager();
        tm2.addTask(1, "Task 1");
        tm2.completeTask(1);
        System.out.println(tm2.completeTask(1));                 // Expected: false
        System.out.println(tm2.isCompleted(1));                  // Expected: true
        
        // Test case 3: Delete task
        System.out.println("\nTest 3: Delete task");
        TaskManager tm3 = new TaskManager();
        tm3.addTask(1, "Task 1");
        tm3.addTask(2, "Task 2");
        tm3.completeTask(1);
        System.out.println(tm3.deleteTask(2));                   // Expected: true
        System.out.println(tm3.getIncompleteTasks());            // Expected: []
        System.out.println(tm3.getCompletedTasks());             // Expected: [1]
        
        // Test case 4: Invalid operations
        System.out.println("\nTest 4: Invalid operations");
        TaskManager tm4 = new TaskManager();
        System.out.println(tm4.completeTask(99));                // Expected: false
        System.out.println(tm4.deleteTask(99));                  // Expected: false
        System.out.println(tm4.getDescription(99));              // Expected: null
        System.out.println(tm4.isCompleted(99));                 // Expected: false
        
        // Test case 5: Multiple tasks
        System.out.println("\nTest 5: Multiple tasks");
        TaskManager tm5 = new TaskManager();
        tm5.addTask(1, "Task A");
        tm5.addTask(2, "Task B");
        tm5.addTask(3, "Task C");
        tm5.completeTask(1);
        tm5.completeTask(3);
        System.out.println(tm5.getIncompleteTasks());            // Expected: [2]
        System.out.println(tm5.getCompletedTasks());             // Expected: [1, 3] or [3, 1]
        System.out.println(tm5.getDescription(2));               // Expected: Task B
    }
}
