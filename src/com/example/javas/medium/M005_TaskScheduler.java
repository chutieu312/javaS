/*
SYSTEM DESIGN PROBLEM:
Design a simple Task Scheduler (Simplified for 25 min interview)

REQUIREMENTS:
- Add tasks with priority (1=highest, 5=lowest)
- Execute next task (highest priority first, FIFO if same priority)
- Get pending task count

CONSTRAINTS:
- Priority range: 1-5
- Simple in-memory storage
- Tasks are just strings with priority

DESIGN APPROACH:
1. Use PriorityQueue to store tasks by priority
2. Custom Task class with priority and order tracking
3. Counter for insertion order (to maintain FIFO for same priority)

DATA STRUCTURES USED:
- PriorityQueue<Task>: Auto-sorts by priority then insertion order
- Task class: id, name, priority, insertionOrder

TIME COMPLEXITY:
- addTask(): O(log n)
- executeNext(): O(log n)
- getPendingCount(): O(1)

SPACE COMPLEXITY: O(n) where n is number of pending tasks
*/

package com.example.javas.medium;

import java.util.*;

public class M005_TaskScheduler {
    
    static class Task {
        String name;
        int priority;
        int insertionOrder;
        
        public Task(String name, int priority, int insertionOrder) {
            // DONE: Initialize task fields
            this.name = name;
            this.priority = priority;
            this.insertionOrder = insertionOrder;
        }
    }
    
    static class TaskScheduler {
        private PriorityQueue<Task> taskQueue;
        private int counter;
        
        public TaskScheduler() {
            // DONE: Initialize PriorityQueue with custom comparator
            // Comparator logic:
            // 1. Compare by priority (lower number = higher priority)
            // 2. If same priority, compare by insertionOrder (FIFO)
            this.counter = 0;
            this.taskQueue = new PriorityQueue<>((t1, t2) -> {
                if (t1.priority != t2.priority) {
                    return t1.priority - t2.priority; // Lower priority number = higher priority
                }
                return t1.insertionOrder - t2.insertionOrder; // FIFO for same priority
            });
        }
        
        public void addTask(String taskName, int priority) {
            // DONE: Implement add task
            // 1. Create new Task with counter as insertionOrder
            // 2. Add to taskQueue
            // 3. Increment counter
            Task task = new Task(taskName, priority, counter);
            taskQueue.offer(task);
            counter++;
        }
        
        public String executeNext() {
            // DONE: Implement execute next task
            // 1. Poll from taskQueue (gets highest priority)
            // 2. Return task name or "No tasks" if empty
            Task task = taskQueue.poll();
            return task != null ? task.name : "No tasks";
        }
        
        public int getPendingCount() {
            // DONE: Return number of pending tasks in queue
            return taskQueue.size();
        }
    }
    
    // TEST CASES
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        
        scheduler.addTask("Email Report", 3);
        scheduler.addTask("Fix Bug", 1);
        scheduler.addTask("Write Docs", 3);
        scheduler.addTask("Deploy App", 1);
        scheduler.addTask("Code Review", 2);
        
        System.out.println("Pending tasks: " + scheduler.getPendingCount());
        System.out.println();
        
        System.out.println("Executing tasks:");
        while (scheduler.getPendingCount() > 0) {
            System.out.println("- " + scheduler.executeNext());
        }
        System.out.println();
        
        System.out.println("Execute when empty: " + scheduler.executeNext());
        System.out.println("Pending tasks: " + scheduler.getPendingCount());
    }
}
