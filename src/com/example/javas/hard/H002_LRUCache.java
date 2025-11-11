/*
HARD PROBLEM (Simplified for 25 min interview):
Design a simple LRU (Least Recently Used) Cache

REQUIREMENTS:
- get(key): Return value if exists, else -1
- put(key, value): Insert or update key-value pair
- Evict least recently used item when capacity is reached

APPROACH:
Use Java's LinkedHashMap with accessOrder=true
- Built-in LRU ordering (access order tracking)
- Override removeEldestEntry() to enforce capacity

DATA STRUCTURES:
- LinkedHashMap<Integer, Integer> with accessOrder=true

TIME COMPLEXITY:
- get(): O(1)
- put(): O(1)

SPACE COMPLEXITY: O(capacity)
*/

package com.example.javas.hard;

import java.util.LinkedHashMap;
import java.util.Map;

public class H002_LRUCache {
    
    static class LRUCache {
        private LinkedHashMap<Integer, Integer> cache;
        private int capacity;
        
        public LRUCache(int capacity) {
            // DONE: Initialize LinkedHashMap with accessOrder=true
            // Use constructor: LinkedHashMap(capacity, 0.75f, true)
            // accessOrder=true means entries are ordered by access (LRU)
            this.capacity = capacity;
            this.cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return size() > capacity;
                }
            };
        }
        
        public int get(int key) {
            // DONE: Implement get operation
            // Use getOrDefault(key, -1) to return value or -1 if not found
            return cache.getOrDefault(key, -1);
        }
        
        public void put(int key, int value) {
            // DONE: Implement put operation
            // Simply call cache.put(key, value)
            // LinkedHashMap handles LRU eviction automatically
            cache.put(key, value);
        }
    }
    
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        
        cache.put(1, 100);
        cache.put(2, 200);
        System.out.println(cache.get(1));  // 100
        cache.put(3, 300);  // evicts key 2
        System.out.println(cache.get(2));  // -1
        cache.put(4, 400);  // evicts key 1
        System.out.println(cache.get(1));  // -1
        System.out.println(cache.get(3));  // 300
        System.out.println(cache.get(4));  // 400
    }
}
