package org.array_programs;

import java.util.Arrays;

public class Insert_Element {
	
	//array manipulation! 
    public static void main(String[] args) {
        // The original source array
        int[] a = {1, 2, 3, 4, 5}; 
        System.out.println("Original Array: " + Arrays.toString(a));
        
        // Create a new array with one extra slot to accommodate the new element
        int[] b = new int[a.length + 1];
        
        int element = 10; // The value we want to insert
        int position = 2; // The index where we want to insert it
        
        // Step 1: Copy elements from the original array up to the insertion position
        for (int i = 0; i < position; i++) {
            b[i] = a[i];
        }
        
        // Step 2: Insert the new element at the specified position
        b[position] = element;
        
        // Step 3: Copy the remaining elements from the original array
        // We start at position + 1 in the new array and pull from i - 1 in the old array
        for (int i = position + 1; i < b.length; i++) {
            b[i] = a[i - 1];
        }
        
        System.out.println("After Inserting: " + Arrays.toString(b));
    }
}
