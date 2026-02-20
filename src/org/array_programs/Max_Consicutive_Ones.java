package org.array_programs;

public class Max_Consicutive_Ones {
    public static void main(String[] args) {
        // Input binary array containing only 0s and 1s
        int[] a = {1, 1, 0, 1, 1, 1};

        // 'count' tracks the current streak of 1s we are looking at
        int count = 0;
        
        // 'maxCount' stores the length of the longest streak found so far
        int maxCount = 0;
        
        // Traverse the array from start to finish
        for (int i = 0; i < a.length; i++) {
            
            // If the current element is a 1, increment our current streak count
            if (a[i] == 1) {
                count++;
            } 
            // If the current element is 0, the streak is broken! Reset count to 0.
            else {
                count = 0;
            }
            
            // After every step, check if our current streak is the new record
            if (maxCount < count) {
                maxCount = count;
            }
        }
        
        // Output the final result (for this array, it will be 3)
        System.out.println("Maximum Consecutive One's: " + maxCount);
    }
}

