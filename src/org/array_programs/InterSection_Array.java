package org.array_programs;

public class InterSection_Array {
    //  between two arrays by comparing every element of the first array against every element of the second.
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2 = { 4, 5, 6, 7, 8 };

        // Outer loop: Iterate through each element of the first array
        for (int i = 0; i < a1.length; i++) {
            // Flag to track if the current element from a1 exists in a2
            boolean common = false;

            // Inner loop: Compare current element of a1 with all elements of a2
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    common = true;
                    // Optimization: Once a match is found, no need to keep checking a2
                    break; 
                }
            }
            
            // If the flag was set to true, it means the element is in both arrays
            if (common) {
                System.out.print(a1[i] + " ");
            }
        }
    }
}

