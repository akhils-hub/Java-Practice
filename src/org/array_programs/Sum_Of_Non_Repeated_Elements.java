package org.array_programs;

public class Sum_Of_Non_Repeated_Elements {
public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 3, 1, 2, 3, 4, 5};
        int sum  = 0;
        // Outer loop: Pick each element one by one
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            
            // Inner loop: Compare the picked element with every other element in the array
            for (int j = 0; j < a.length; j++) {
                
                // Check if values match AND ensure we aren't comparing the element to itself (i != j)
                if (a[i] == a[j] && i != j) {
                    count++;
                    // Optimization: We found a duplicate, so we can stop checking the inner loop
                    break; 
                }
            }
            
            // If count remains 0, it means no duplicates were found for a[i]
            if (count == 0) {
               // System.out.println("First Non-Repeated Element: " + a[i]);
                
               sum = sum + a[i];
            }
        }
        System.out.println("Sum Of Non Repeated Elements: "+sum);
    }
}
