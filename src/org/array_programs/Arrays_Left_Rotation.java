package org.array_programs;

import java.util.Arrays;

public class Arrays_Left_Rotation {
	//Left Rotation, where every element shifts one position to the left, and the first element moves to the very end.
	public static void main(String[] args) {
		// Initialize the array with sample values
		int[] a = {1, 2, 3, 4, 5}; 

		System.out.println("Original Array: " + Arrays.toString(a));

		/* 
		 * STEP 1: Store the first element in a temporary variable.
		 * We do this because it will be overwritten during the shift.
		 */
		int temp = a[0]; // temp = 1

		/* 
		 * STEP 2: Shift elements to the left.
		 * We start the loop from index 1 and move each element to (i-1).
		 */
		for(int i = 1; i < a.length; i++) {
			a[i - 1] = a[i]; // The value at index 'i' moves to index 'i-1'
		}

		/* 
		 * STEP 3: Move the original first element to the last position.
		 * The loop leaves the last index vacant/duplicated; we fill it with 'temp'.
		 */
		a[a.length - 1] = temp; // a[4] = 1

		// Output the result: [2, 3, 4, 5, 1]
		System.out.println("Left Rotation:  " + Arrays.toString(a));
	}
}


/**
Save 1 in temp.
Loop starts:
a[0] = a[1] == Array becomes [2, 2, 3, 4, 5]
a[1] = a[2] == Array becomes [2, 3, 3, 4, 5]
a[2] = a[3] == Array becomes [2, 3, 4, 4, 5]
a[3] = a[4] == Array becomes [2, 3, 4, 5, 5]
Final step:
a[4] = temp == Array becomes [2, 3, 4, 5, 1]
 */


/**
 //rotate the array multiple times (e.g., rotating it left 3 times)
	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5}; // o/p: [4, 5, 1, 2, 3]
	        int k = 3; // Number of rotations

	        System.out.println("Original Array: " + Arrays.toString(a));

	        // Outer loop: Repeats the rotation logic 'k' times
	        for (int rotation = 0; rotation < k; rotation++) {

	            // --- Standard Left Rotation Logic Starts ---
	            int temp = a[0];
	            for (int i = 1; i < a.length; i++) {
	                a[i - 1] = a[i];
	            }
	            a[a.length - 1] = temp;
	            // --- Standard Left Rotation Logic Ends ---

	            System.out.println("After Rotation " + (rotation + 1) + ": " + Arrays.toString(a));
	        }

	        System.out.println("Final Result: " + Arrays.toString(a));
	    }

 */
