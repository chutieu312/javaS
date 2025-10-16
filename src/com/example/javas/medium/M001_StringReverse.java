package com.example.javas.medium;

public class M001_StringReverse {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}