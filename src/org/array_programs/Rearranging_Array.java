package org.array_programs;

import java.util.Arrays;

public class Rearranging_Array {
    
    public static void main(String[] args) {
        // Input array containing a mix of positive and negative integers
        int[] a = {1, -2, 3, -4, -5, 6, -7, 8};
        
        System.out.println("Original Array: " + Arrays.toString(a));
        
        // Create a new array 'b' to hold the rearranged elements
        int[] b = new int[a.length];
        
        // 'positive' pointer tracks even indices (0, 2, 4...) for positive numbers
        int positive = 0;
        // 'negative' pointer tracks odd indices (1, 3, 5...) for negative numbers
        int negative = 1;
        
        // Loop through the original array once
        for (int i = 0; i < a.length; i++) {
            
            // If the number is positive (or zero) and there's an even slot available
            if (a[i] >= 0 && positive < b.length) {
                b[positive] = a[i];
                // Jump to the next even index
                positive = positive + 2;
            } 
            // If the number is negative and there's an odd slot available
            else if (a[i] < 0 && negative < b.length) {
                b[negative] = a[i];
                // Jump to the next odd index
                negative = negative + 2;
            }
        }
        
        // Output for {1,-2,3,-4,-5,6,-7,8} will be [1, -2, 3, -4, 6, -5, 8, -7]
        System.out.println("Rearranging Array: " + Arrays.toString(b));
    }
}
