package org.array_programs;

import java.util.Arrays;

public class Array_Right_Rotation {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		System.out.println("Original Array: " + Arrays.toString(a));

		/* 
		 * STEP 1: Save the LAST element.
		 * Since we are shifting everything to the right, index 0 will 
		 * eventually be overwritten, and the last element has nowhere to go.
		 */
		int temp = a[a.length - 1]; // temp = 5

		/* 
		 * STEP 2: Shift elements to the right.
		 * We start from the second-to-last element (length - 2) and move backwards.
		 * This ensures we don't lose the value of a[i] before moving it to a[i+1].
		 */
		for(int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i]; // Move element at 'i' to the right ('i+1')
		}

		/* 
		 * STEP 3: Place the saved last element into the first position.
		 */
		a[0] = temp; // a[0] = 5

		System.out.println("Right Rotation: " + Arrays.toString(a));
	}
}

/**
 Save 5 in temp.
The Loop (Backwards):
a[4] = a[3] = Array: [1, 2, 3, 4, 4]
a[3] = a[2] = Array: [1, 2, 3, 3, 4]
a[2] = a[1] = Array: [1, 2, 2, 3, 4]
a[1] = a[0] = Array: [1, 1, 2, 3, 4]
Final step:
a[0] = temp = Array: [5, 1, 2, 3, 4]
 */


/**
 //Rotate the Array Multiple times (e.g., rotating it left 3 times)
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; // o/p: [3, 4, 5, 1, 2]
		System.out.println("Original Array: " + Arrays.toString(a));

		int k=3;

		for(int rotation = 0; rotation <k;rotation++) {
		int temp = a[a.length-1];
		for(int i = a.length-2;i>=0;i--) {
			a[i+1] = a[i];
		}
		a[0] = temp;

		System.out.println("After Rotation: " +(rotation + 1)+": "+ Arrays.toString(a));
		}
		System.out.println("Final Results: " + Arrays.toString(a));
	} 
 */
