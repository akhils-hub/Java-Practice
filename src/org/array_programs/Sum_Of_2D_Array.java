package org.array_programs;

public class Sum_Of_2D_Array {

    public static void main(String[] args) {
        // Initializing a 2D array with 2 rows and 3 columns
        // Row 0: {1, 2, 3}, Row 1: {4, 5, 6}
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        
        int sum = 0; // Variable to store the running total
        
        // Outer loop: Iterates through each row of the 2D array
        // a.length gives the number of rows (which is 2)
        for (int i = 0; i < a.length; i++) {
            
            // Inner loop: Iterates through each element in the current row (i)
            // a[i].length gives the number of columns in that specific row
            for (int j = 0; j < a[i].length; j++) {
                
                // Add the current element at row 'i' and column 'j' to the sum
                sum = sum + a[i][j];
            }
        }
        
        // Output for the given array will be: 1+2+3+4+5+6 = 21
        System.out.println("Sum_Of_2D_Array: " + sum);
    }
}

