package org.array_programs;

import java.util.Arrays;

public class Remove_Element {

	public static void main(String[] args) {
		// Initial fixed-size array
		int[] a = {1, 2, 3, 4, 5};

		System.out.println("Original Array: " + Arrays.toString(a));

		int value = 3;    // The specific element we want to remove
		int position = 0; // Pointer to track the index for "kept" elements

		// Step 1: Traverse the array
		for (int i = 0; i < a.length; i++) {

			// If the current element is NOT the one we want to remove
			if (a[i] != value) {
				/* 
                   Move the "kept" element to the current 'position' index.
                   If we find '3', we skip this block, effectively 
                   overwriting '3' with the next valid number (4).
				 */
				a[position] = a[i];
				// Increment position to prepare for the next valid element
				position++;
			}
		}

		// Step 2: Display the results
		System.out.println("After Removing element: ");

		/* 
           Crucial: We only loop up to 'position'. 
           The elements beyond 'position' still exist in the 
           original array memory but are now ignored.
		 */
		for (int i = 0; i < position; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

/**
 // approach is for removing a specific location (like "remove the item at index 2").
 public class Practice {
    public static void main(String[] args) {
         int[] a = {1, 2, 3, 4, 5};
         int position = 2; // We want to remove the element at index 2 (the number 3)

         // Start from the position we want to delete
         // and shift every element to the left by one
         for (int i = position; i < a.length - 1; i++) {
            a[i] = a[i + 1]; // Current index takes the value of the next index
         }

         // After shifting, the last element is still there (a duplicate of the second to last)
         // We manually set the last element to 0 to "clean up"
         a[a.length - 1] = 0;

         // Result: [1, 2, 4, 5, 0]
         System.out.println(Arrays.toString(a));
    }
}

 */
