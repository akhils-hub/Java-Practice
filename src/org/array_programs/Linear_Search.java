package org.array_programs;

public class Linear_Search {
	public static void main(String[] args) {
		// Given array
		int[] a = {1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};

		int searchElement = 3;

		boolean found = false;
		System.out.print("Indices: ");

		//iterates through the array, tracks every index where the search element appears, and handles the "element not found" edge case cleanly
		
		// Loop through the array to find all occurrences
		for (int i = 0; i < a.length; i++) {
			if (a[i] == searchElement) {
				System.out.print(i + " ");
				found = true;
			}
		}

		// If the element wasn't found at all, print the error message
		if (!found) {
			System.out.print("element not found");
		}
	}
}
