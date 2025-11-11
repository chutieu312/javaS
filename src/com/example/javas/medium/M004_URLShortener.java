/*
SYSTEM DESIGN PROBLEM:
Design a simple URL Shortener (Simplified for 25 min interview)

REQUIREMENTS:
- Shorten a long URL to a short code
- Retrieve original URL from short code
- Track usage count for each URL

CONSTRAINTS:
- Short code: 6-character alphanumeric string
- Simple counter-based code generation
- Store mappings in memory (HashMap)

DESIGN APPROACH:
1. HashMap to store shortCode → original URL
2. HashMap to store shortCode → usage count
3. Counter to generate unique short codes

DATA STRUCTURES USED:
- HashMap<String, String>: shortCode → originalUrl
- HashMap<String, Integer>: shortCode → usageCount
- int counter: for generating unique codes

TIME COMPLEXITY:
- shorten(): O(1)
- getOriginal(): O(1)
- getUsageCount(): O(1)

SPACE COMPLEXITY: O(n) where n is number of URLs
*/

package com.example.javas.medium;

import java.util.*;

public class M004_URLShortener {
    
    static class URLShortener {
        private HashMap<String, String> shortToLong; // shortCode → originalUrl
        private HashMap<String, Integer> usageCount; // shortCode → count
        private int counter;
        
        public URLShortener() {
            // DONE: Initialize both HashMaps and counter (start at 1)
            this.shortToLong = new HashMap<>();
            this.usageCount = new HashMap<>();
            this.counter = 1;
        }
        
        public String shorten(String longUrl) {
            // DONE: Implement URL shortening
            // 1. Generate short code: "url" + counter (e.g., "url1", "url2")
            // 2. Store mapping in shortToLong
            // 3. Initialize usage count to 0
            // 4. Increment counter
            // 5. Return short code
            String shortCode = "url" + counter;
            shortToLong.put(shortCode, longUrl);
            usageCount.put(shortCode, 0);
            counter++;
            return shortCode;
        }
        
        public String getOriginal(String shortCode) {
            // DONE: Implement URL retrieval
            // 1. Check if shortCode exists in map
            // 2. If yes: increment usage count and return original URL
            // 3. If no: return null
            if (shortToLong.containsKey(shortCode)) {
                usageCount.put(shortCode, usageCount.get(shortCode) + 1);
                return shortToLong.get(shortCode);
            }
            return null;
        }
        
        public int getUsageCount(String shortCode) {
            // DONE: Return usage count for the short code
            // Return 0 if shortCode doesn't exist
            return usageCount.getOrDefault(shortCode, 0);
        }
    }
    
    // TEST CASES
    public static void main(String[] args) {
        URLShortener shortener = new URLShortener();
        
        String url1 = "https://www.example.com/very/long/url/path";
        String url2 = "https://www.github.com/user/repository";
        
        String short1 = shortener.shorten(url1);
        String short2 = shortener.shorten(url2);
        
        System.out.println("Shortened: " + url1 + " -> " + short1);
        System.out.println("Shortened: " + url2 + " -> " + short2);
        System.out.println();
        
        System.out.println("Get original: " + short1 + " -> " + shortener.getOriginal(short1));
        System.out.println("Get original: " + short1 + " -> " + shortener.getOriginal(short1));
        System.out.println("Usage count for " + short1 + ": " + shortener.getUsageCount(short1));
        System.out.println();
        
        System.out.println("Get original: " + short2 + " -> " + shortener.getOriginal(short2));
        System.out.println("Usage count for " + short2 + ": " + shortener.getUsageCount(short2));
        System.out.println();
        
        System.out.println("Get invalid: url999 -> " + shortener.getOriginal("url999"));
    }
}
