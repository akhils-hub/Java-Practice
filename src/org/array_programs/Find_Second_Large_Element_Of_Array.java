package org.array_programs;

public class Find_Second_Large_Element_Of_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 9, 3, 4, 8};
        
        // Initialize both to the lowest possible integer value
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE; // Fix: Use MIN_VALUE here
        
        for (int i = 0; i < a.length; i++) {
            
            // If current element is greater than the largest found so far
            if (a[i] > large) {
                // The old 'large' now becomes the 'secondLarge'
                secondLarge = large;
                // Update 'large' to the current element
                large = a[i];
            } 
            /* 
               If current element is between 'secondLarge' and 'large'
               and is not a duplicate of the largest
            */
            else if (a[i] > secondLarge && a[i] != large) {
                secondLarge = a[i];
            }
        }
        
        // Check if secondLarge was ever updated from its initial value
        if (secondLarge == Integer.MIN_VALUE) {
            System.out.println("There is no Second Largest Element in the given Array!");
        } else {
            System.out.println("Largest Element: " + large);
            System.out.println("Second Largest Element: " + secondLarge);
        }
    }
}
