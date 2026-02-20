package org.array_programs;

import java.util.HashSet;

public class Union_Array {

    public static void main(String[] args) {
        // Two input arrays with overlapping values and internal duplicates
        int[] a1 = { 1, 1, 2, 3, 3, 4, 5, 5 };
        int[] a2 = { 1, 2, 3, 4, 5, 6, 6, 7 };

        /* 
           A HashSet is used because it only allows unique elements.
           When you try to add a duplicate, the Set simply ignores it.
        */
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements from the first array to the set
        for (int num : a1) {
            set.add(num);
        }
        
        // Step 2: Add all elements from the second array to the same set
        // Any value already present (like 1, 2, 3, 4, 5) will not be added again.
        for (int num : a2) {
            set.add(num);
        }
        
        // Step 3: Print the unique collection (Union)
        // toString() provides a bracketed view: [1, 2, 3, 4, 5, 6, 7]
        System.out.println("Set Representation: " + set.toString());
        
        // Manual iteration to print elements separated by spaces
        System.out.print("Union Elements: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}


//int[] union = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).distinct().toArray();
