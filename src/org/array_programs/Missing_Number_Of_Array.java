package org.array_programs;

import java.util.HashSet;
import java.util.Set;

public class Missing_Number_Of_Array {

	public static int missingNumber(int[] a) {
		// Initial assumption: the first element is both min and max
		int min = a[0];
		int max = a[0];

		// Use a Set to store all existing numbers for fast "contains" checks
		Set<Integer> set = new HashSet<>();

		// Single pass to populate the Set and find the range (min/max)
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			if (min > a[i]) {
				min = a[i];
			} else if (max < a[i]) {
				max = a[i];
			}
		}

		// Iterate through the identified range from min to max
		for (int i = min; i < max; i++) {
			// If the set doesn't contain a number in the sequence, it's missing
			if (!set.contains(i)) {
				return i;
			}
		}

		// If no numbers are missing within the range, return the next logical number
		return max + 1;
	}

	public static void main(String[] args) {
		int[] a = {2, 3, 5, 6};
		int missingNumber = missingNumber(a);
		// Output for {2, 3, 5, 6} will be 4
		System.out.println("Missing Number of an Array: " + missingNumber);
	}
}

/**

//Gauss's Formula: finding a single missing number in a sequence of 0 to n

public class Practice {

	public static int missingNumber(int[] a) {
		int n = a.length;

		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		for(int num: a) {
			actualSum = actualSum + num;
		}
		return expectedSum-actualSum;
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 3, };
		int missingNumber = missingNumber(a);
		System.out.println("MissingNumber is: " + missingNumber);
	}
} 


 */
