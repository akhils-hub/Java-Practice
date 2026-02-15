package org.array_programs;

import java.util.LinkedHashSet;

public class Find_Duplicate_Elements_Of_Array {

	public static void main(String[] args) {

		int[] a = {1, 1, 2, 3, 4, 5, 5, 6, 3, 1};

		// A flag to track if the array is completely unique
		boolean isNotDuplicate = true;

		// LinkedHashSet stores unique values and maintains insertion order.
		// It prevents the same duplicate from being added multiple times.
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		/* 
		 * OUTER LOOP: Picks an element to check for duplicates.
		 */
		for(int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;

			/* 
			 * INNER LOOP: Compares the current element (a[i]) with 
			 * everything that comes AFTER it in the array.
			 */
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] == a[j]) {
					isDuplicate = true;
					break; // Stop looking for the current 'i' once a match is found
				}
			}

			// If a duplicate was found during the inner loop
			if(isDuplicate) {
				set.add(a[i]);        // Add to set (duplicates in 'set' are automatically ignored)
				isNotDuplicate = false; // Update flag since we found at least one duplicate
			}
		}

		// Print the set containing the duplicate numbers
		System.out.println("Duplicate set: " + set);

		// Use StringBuilder to concatenate the numbers into a single String
		StringBuilder sb = new StringBuilder();
		for(int num : set) {
			sb.append(num);
		}

		System.out.println("Concatenated Duplicates: " + sb.toString());

		// Final message if the array was unique
		if(isNotDuplicate) {
			System.out.println("There is no duplicate in the given array");
		}
	}
}


/**

public class Practice {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 5, 5, 6, 3, 1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : a) {
            // If we can't add it to 'seen', it's a duplicate!
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // This will print [1, 3, 5]
        System.out.println("Unique Duplicates: " + duplicates);
    }
}

 */

/**
public class Practice {
	public static void main(String[] args) {
		int[] a = {1, 1, 2, 3, 4, 5, 5, 6, 3, 1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j] && i!=j) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}

*/