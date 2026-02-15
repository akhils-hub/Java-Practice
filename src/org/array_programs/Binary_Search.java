package org.array_programs;

public class Binary_Search {
	//Binary Search is a highly efficient algorithm that finds the position of a target value within a sorted array. Instead of checking every element (Linear Search).
	//The "Half" Logic: Every time the loop runs, you discard half of the remaining numbers.
	public static void main(String[] args) {
		// Binary Search REQUIRES a sorted array to work
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int target = 70;

		int index = -1;    // Variable to store the result (-1 means not found)
		int first = 0;     // Starting index of the search range
		int last = a.length - 1; // Ending index of the search range

		// Loop continues as long as the search range is valid
		while(first <= last) {
			// Calculate the middle index of the current range
			int mid = (first + last) / 2;

			// Case 1: Target is found exactly at the middle
			if(a[mid] == target) {
				index = mid;
				break; // Exit the loop immediately
			}
			// Case 2: Target is greater than the middle element
			// Ignore the left half and move the 'first' pointer
			else if(a[mid] < target) {
				first = mid + 1;
			}
			// Case 3: Target is smaller than the middle element
			// Ignore the right half and move the 'last' pointer
			else {
				last = mid - 1;
			}
		}

		// Final Output
		if(index == -1) {
			System.out.println("Target Index not found!");
		} else {
			System.out.println("Target Index found at: " + index);
		}
	}
}
