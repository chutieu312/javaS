package com.example.javas.utils;

import java.util.Scanner;

/**
 * InputReader utility class for faster I/O operations
 * Useful for competitive programming and handling large inputs
 */
public class InputReader {
    private Scanner scanner;
    
    public InputReader() {
        this.scanner = new Scanner(System.in);
    }
    
    public InputReader(java.io.InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }
    
    public int nextInt() {
        return scanner.nextInt();
    }
    
    public long nextLong() {
        return scanner.nextLong();
    }
    
    public double nextDouble() {
        return scanner.nextDouble();
    }
    
    public String nextString() {
        return scanner.next();
    }
    
    public String nextLine() {
        return scanner.nextLine();
    }
    
    public int[] readIntArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        return arr;
    }
    
    public long[] readLongArray(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextLong();
        }
        return arr;
    }
    
    public void close() {
        scanner.close();
    }
}