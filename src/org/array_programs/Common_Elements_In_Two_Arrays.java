package org.array_programs;

import java.util.ArrayList;


public class Common_Elements_In_Two_Arrays {

	public static void main(String[] args) {

		// Define two sample integer arrays
		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2 = {4, 5, 6, 7, 8};

		// 'list' will store all elements from the first array for easy searching
		ArrayList<Integer> list = new ArrayList<>();

		// 'commonList' will store the final overlapping elements found in both
		ArrayList<Integer> commonList = new ArrayList<>();

		// STEP 1: Add all elements from the first array (a1) into the ArrayList
		// This converts the primitive array into a collection we can search
		for(int num : a1) {
			list.add(num);
		}

		/* 
		 * STEP 2: Iterate through the second array (a2).
		 * For every number in a2, check if it exists in the 'list' (which holds a1's values).
		 */
		for(int num : a2) {
			// .contains() internally loops through 'list' to find a match
			if(list.contains(num)) {
				commonList.add(num); // If found, it's a common element
			}
		}

		// Print the resulting list of matches: [4, 5]
		System.out.println("Common Elements in Two Arrays are: " + commonList);
	}
}


/**
 public class Practice {
	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2 = {4, 5, 6, 7, 8};

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> commonList = new ArrayList<>();

		for(int num: a1) {
			list.add(num);
		}
		for(int num: a2) {
			commonList.add(num);
		}

		boolean retainAll = list.retainAll(commonList);
		System.out.println(retainAll);
		System.out.println(list);

	}
}

 */
