package org.array_programs;

public class Find_Second_Small_Element_Of_Array {
    
    public static void main(String[] args) {
        int[] a = {2, 2, 3, 5, 7, 8};
        
        // Initialize both to the highest possible integer value 
        // so that any array element will be smaller than these.
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        
        for (int i = 0; i < a.length; i++) {
            // If current element is strictly smaller than the smallest found so far
            if (small > a[i]) {
                // The old 'small' is pushed down to become the 'secondSmall'
                secondSmall = small;
                // Update 'small' to the new minimum
                small = a[i];
            } 
            /* 
               Check if current element is smaller than 'secondSmall' 
               BUT is not the same value as 'small' (ignores duplicates)
            */
            else if (secondSmall > a[i] && small != a[i]) {
                secondSmall = a[i];
            }
        }

        // Verification: If secondSmall is still MAX_VALUE, it means no 
        // distinct second-place value was found.
        if (secondSmall == Integer.MAX_VALUE) {
            System.out.println("There is no Second Small Element in the given Array!");
        } else {
            System.out.println("Smallest Element: " + small);
            System.out.println("Second Smallest Element: " + secondSmall);
        }
    }
}
