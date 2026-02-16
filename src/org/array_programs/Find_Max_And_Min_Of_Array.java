package org.array_programs;

public class Find_Max_And_Min_Of_Array {
	public static void main(String[] args) {

		// Initialize the array with a set of integers
		int[] a = { 2, 4, 1, 7, 8, 0, -1 };

		// Assume the first element is both the minimum and maximum initially
		int min = a[0];
		int max = a[0];

		// Iterate through the array starting from the first element
		for (int i = 0; i < a.length; i++) {

			// If the current element is smaller than our current min, update min
			if (min > a[i]) {
				min = a[i];
			}
			// Otherwise, check if the current element is larger than our current max
			else if (max < a[i]) {
				max = a[i];
			}
		}

		// Output the final results to the console
		System.out.println("Minimum Element of an Array: " + min);
		System.out.println("Maximum Element of an Array: " + max);
	}
}
