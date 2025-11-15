package com.example.javas.easy;

import java.util.*;

/**
 * E043: Design URL Shortener (Simple Version)
 * Difficulty: Easy (System Design)
 * Time Target: 15 minutes
 * 
 * Problem:
 * Design a simple URL shortener service that can shorten URLs and expand them back.
 * 
 * Requirements:
 * Implement the URLShortener class:
 * - URLShortener() Initializes the URL shortener
 * - String shorten(String longUrl) Creates and returns a short code for the given long URL.
 *   If the same longUrl is shortened again, return the same short code
 * - String expand(String shortCode) Returns the original long URL for the given short code.
 *   Return null if short code doesn't exist
 * - int getTotalUrls() Returns the total number of unique URLs stored
 * 
 * For simplicity:
 * - Short codes can be sequential: "url1", "url2", "url3", etc.
 * - You don't need to worry about base62 encoding or real-world shortening
 * 
 * Constraints:
 * - 1 <= longUrl.length <= 500
 * - longUrl is a valid URL string
 * - At most 5000 calls will be made to all functions combined
 * 
 * Examples:
 * URLShortener us = new URLShortener();
 * String code1 = us.shorten("https://www.example.com/very/long/url/page1");
 * // returns "url1"
 * 
 * String code2 = us.shorten("https://www.example.com/another/long/url");
 * // returns "url2"
 * 
 * us.expand("url1");  // returns "https://www.example.com/very/long/url/page1"
 * us.expand("url2");  // returns "https://www.example.com/another/long/url"
 * us.expand("url99"); // returns null
 * 
 * String code3 = us.shorten("https://www.example.com/very/long/url/page1");
 * // returns "url1" (same URL, returns existing code)
 * 
 * us.getTotalUrls();  // returns 2 (url1 and url2)
 * 
 * Approach:
 * Use two HashMaps for bidirectional mapping:
 * 1. HashMap to map shortCode -> longUrl (for expand)
 * 2. HashMap to map longUrl -> shortCode (to check if URL already shortened)
 * 3. Counter to generate sequential short codes
 * 4. shorten: check if URL exists, if not create new code
 * 5. expand: lookup shortCode in map
 * 6. getTotalUrls: return size of either map
 * 
 * Data Structures:
 * - HashMap<String, String> for shortCode -> longUrl
 * - HashMap<String, String> for longUrl -> shortCode
 * - int counter for generating sequential codes
 * 
 * Time Complexity: O(1) for all operations
 * Space Complexity: O(n) where n is number of unique URLs
 */
public class E043_URLShortener {
    
    static class URLShortener {
        
        // TODO: Declare data structures
        // - HashMap for shortCode to longUrl mapping
        // - HashMap for longUrl to shortCode mapping (to avoid duplicates)
        // - int counter to generate sequential codes
        
        public URLShortener() {
            // TODO: Initialize the HashMaps and counter
            // Start counter at 1
        }
        
        public String shorten(String longUrl) {
            // TODO: Create or retrieve short code for URL
            // 1. Check if longUrl already exists in longToShort map
            // 2. If exists, return the existing short code
            // 3. If not exists:
            //    - Generate new short code ("url" + counter)
            //    - Add mappings to both maps
            //    - Increment counter
            //    - Return the new short code
            
            return null;
        }
        
        public String expand(String shortCode) {
            // TODO: Retrieve original URL from short code
            // 1. Look up shortCode in shortToLong map
            // 2. Return the long URL if exists, null otherwise
            
            return null;
        }
        
        public int getTotalUrls() {
            // TODO: Return count of unique URLs
            // Return the size of either map (both should be same size)
            
            return 0;
        }
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1: Basic shortening and expanding
        System.out.println("Test 1: Basic operations");
        URLShortener us1 = new URLShortener();
        String code1 = us1.shorten("https://www.example.com/page1");
        System.out.println("Short code: " + code1);              // Expected: url1
        System.out.println(us1.expand(code1));                   // Expected: https://www.example.com/page1
        
        // Test case 2: Multiple URLs
        System.out.println("\nTest 2: Multiple URLs");
        URLShortener us2 = new URLShortener();
        String code2a = us2.shorten("https://www.example.com/page1");
        String code2b = us2.shorten("https://www.example.com/page2");
        String code2c = us2.shorten("https://www.example.com/page3");
        System.out.println("Code 1: " + code2a);                 // Expected: url1
        System.out.println("Code 2: " + code2b);                 // Expected: url2
        System.out.println("Code 3: " + code2c);                 // Expected: url3
        System.out.println(us2.getTotalUrls());                  // Expected: 3
        
        // Test case 3: Duplicate URL
        System.out.println("\nTest 3: Duplicate URL");
        URLShortener us3 = new URLShortener();
        String code3a = us3.shorten("https://www.example.com/page1");
        String code3b = us3.shorten("https://www.example.com/page1");
        System.out.println("First: " + code3a);                  // Expected: url1
        System.out.println("Second: " + code3b);                 // Expected: url1 (same)
        System.out.println(us3.getTotalUrls());                  // Expected: 1
        
        // Test case 4: Expand non-existent code
        System.out.println("\nTest 4: Invalid code");
        URLShortener us4 = new URLShortener();
        us4.shorten("https://www.example.com/page1");
        System.out.println(us4.expand("url99"));                 // Expected: null
        System.out.println(us4.expand("invalid"));               // Expected: null
        
        // Test case 5: Multiple operations
        System.out.println("\nTest 5: Mixed operations");
        URLShortener us5 = new URLShortener();
        String c1 = us5.shorten("https://google.com");
        String c2 = us5.shorten("https://facebook.com");
        System.out.println(us5.expand(c1));                      // Expected: https://google.com
        System.out.println(us5.expand(c2));                      // Expected: https://facebook.com
        String c3 = us5.shorten("https://google.com");
        System.out.println("c1 equals c3: " + c1.equals(c3));    // Expected: true
        System.out.println(us5.getTotalUrls());                  // Expected: 2
    }
}
