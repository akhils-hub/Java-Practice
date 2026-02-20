package org.array_programs;

public class Max_Sub_Array_Sum {
    // Sliding Window Technique
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3; // The size of the "window" or subarray
        int sum = 0;
        
        // Step 1: Calculate the sum of the very first window (first k elements)
        for (int i = 0; i < k; i++) {
            sum = sum + a[i];
        }
        
        // Initialize maxSum and minSum with the sum of the first window
        int maxSum = sum;
        int minSum = sum;
        
        // Step 2: Slide the window from index k to the end of the array
        for (int i = k; i < a.length; i++) {
            /* 
               The core of the Sliding Window:
               Add the current element (entering the window) 
               and subtract the element at (i - k) (leaving the window).
            */
            sum = sum + a[i];
            sum = sum - a[i - k];
            
            // Step 3: Update the overall Max and Min sums found so far
            if (maxSum < sum) {
                maxSum = sum;
            } else if (minSum > sum) {
                minSum = sum;
            }
        }
        
        // Output the results
        System.out.println("Maximum Sub Array Sum: " + maxSum);
        System.out.println("Minimum Sub Array Sum: " + minSum);
    }
}

