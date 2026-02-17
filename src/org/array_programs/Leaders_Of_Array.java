package org.array_programs;

public class Leaders_Of_Array {

    public static void main(String[] args) {
        int[] a = {16, 17, 3, 4, 5, 2};
        
        // Temporary array to store leaders found
        int[] leaders = new int[a.length];
        int k = 0; // Pointer to keep track of the number of leaders found
        
        // Outer loop: Pick each element one by one to check if it's a leader
        for (int i = 0; i < a.length; i++) {
            int j;
            
            // Inner loop: Check all elements to the right of the current element (a[i])
            for (j = i + 1; j < a.length; j++) {
                // If any element to the right is greater, then a[i] is NOT a leader
                if (a[j] > a[i]) {
                    break; // Exit inner loop early
                }
            }
            
            /* 
               If the inner loop finished naturally (j reached a.length),
               it means no element to the right was greater than a[i].
            */
            if (j == a.length) {
                leaders[k++] = a[i]; // Store the leader and increment the counter
            }
        }
        
        // Print only the elements that were stored in the leaders array
        for (int i = 0; i < k; i++) {
            System.out.print(leaders[i] + " ");
        }
    }
}
