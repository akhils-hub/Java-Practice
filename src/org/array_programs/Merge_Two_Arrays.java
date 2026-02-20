package org.array_programs;

import java.util.Arrays;

public class Merge_Two_Arrays {

	//merging two arrays by first combining them into one large array and then using a Bubble Sort style approach to sort the final result.
	public static void main(String[] args) {
		int[] a1 = {1, 3, 5};
		int[] a2 = {2, 4, 6};

		System.out.println("Array 1: " + Arrays.toString(a1));
		System.out.println("Array 2: " + Arrays.toString(a2));

		// Create a new array with the combined size of both input arrays
		int[] merge = new int[a1.length + a2.length];

		int k = 0, i = 0, j = 0;

		// Step 1: Copy all elements from the first array (a1) into the merge array
		while (i < a1.length) {
			merge[k++] = a1[i++];
		}

		// Step 2: Copy all elements from the second array (a2) into the merge array
		while (j < a2.length) {
			merge[k++] = a2[j++];
		}

		// Step 3: Sort the merged array using nested loops (Selection/Bubble Sort logic)
		for (int m = 0; m < merge.length; m++) {
			for (int n = m + 1; n < merge.length; n++) {
				// If the current element is greater than the next element, swap them
				if (merge[m] > merge[n]) {
					int temp = merge[m];
					merge[m] = merge[n];
					merge[n] = temp;
				}
			}
		}

		// Output the final sorted and merged array
		System.out.println("Sorted and Merged Array: "+ Arrays.toString(merge));
	}
}


/**
// Two-Pointer Merge technique.
 public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 10}; // Sorted array 1
        int[] a2 = {2, 4, 6};     // Sorted array 2

        int[] merge = new int[a1.length + a2.length];

        int i = 0; // Pointer for a1
        int j = 0; // Pointer for a2
        int k = 0; // Pointer for merge array

        // Step 1: Compare elements from both arrays and pick the smaller one
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                merge[k++] = a1[i++];
            } else {
                merge[k++] = a2[j++];
            }
        }

        // Step 2: If elements remain in a1, copy them (a2 is finished)
        while (i < a1.length) {
            merge[k++] = a1[i++];
        }

        // Step 3: If elements remain in a2, copy them (a1 is finished)
        while (j < a2.length) {
            merge[k++] = a2[j++];
        }

        System.out.println("Optimized Merged Array: " + Arrays.toString(merge));
    }
 */


/**

//Using Streams
public class Practice {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 10}; // Sorted array 1
        int[] a2 = {2, 4, 6};     // Sorted array 2
        
        int[] merged = IntStream.concat(Arrays.stream(a1),Arrays.stream(a2)).sorted().toArray();
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}

*/