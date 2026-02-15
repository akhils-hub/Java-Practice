package org.array_programs;


public class Equilibrium_Index {
    // An equilibrium index is a position such that the sum of elements at lower indices is equal to the sum of elements at higher indices. 

    public static void main(String[] args) {
        // The input array to be checked
        int[] a = {1, 3, 5, 2, 2};
        
        /* 
         * OUTER LOOP: 
         * This iterates through every possible index 'i' to check 
         * if it behaves as an equilibrium point.
         */
        for(int i = 0; i < a.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            
            /* 
             * INNER LOOP 1: Calculate the sum of all elements 
             * to the LEFT of index 'i' (from 0 up to i-1).
             */
            for(int j = 0; j < i; j++) {
                leftSum = leftSum + a[j];
            }
            
            /* 
             * INNER LOOP 2: Calculate the sum of all elements 
             * to the RIGHT of index 'i' (from i+1 up to the end).
             */
            for(int j = i + 1; j < a.length; j++) {
                rightSum = rightSum + a[j];
            }
            
            /* 
             * Check if the two sums are equal.
             * If they match, we've found the equilibrium index.
             */
            if(leftSum == rightSum) {
                System.out.println("Equilibrium Index: " + i);
                // We break here to stop at the first equilibrium point found
                break;
            }
        }
    }
}

