package org.array_programs;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) {
		int[] a = { 2, 4, 1, 7, 8, 0 };
		System.out.println("Original Array: " + Arrays.toString(a));

		// Outer loop: Determines the current position we are trying to fill with the
		// correct value
		for (int i = 0; i < a.length; i++) {

			// Inner loop: Compares the value at index 'i' with every element following it
			for (int j = i + 1; j < a.length; j++) {

				/*
				 * If the element at the current 'i' is larger than a later element 'j', swap
				 * them. This ensures the smaller value moves to the front.
				 */
				//Ascending vs. Descending: Simply changing a[i] > a[j] to a[i] < a[j] would sort the array in descending order.
				if (a[i] > a[j]) {
					// Swapping using a temporary variable
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// Output for {2, 4, 1, 7, 8, 0} will be [0, 1, 2, 4, 7, 8]
		System.out.println("Sorted Array: " + Arrays.toString(a));
	}
}


//you should use the built-in Arrays.sort() method