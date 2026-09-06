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

/**
// Without using Temperary or 3rd variable.
public static void main(String[] args) {
		int[] a = { 2, 4, 1, 7, 8, 0 };
		System.out.println("Original Array: " + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					// Swapping without using a temporary variable
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
					
			       // using XOR 
				   // a[i] = a[i] ^ a[j];
				   // a[j] = a[i] ^ a[j];
				   // a[i] = a[i] ^ a[j];
					 
				}
			}
		}

		System.out.println("Sorted Array: " + Arrays.toString(a));
	}
**/



/**
// When we have known elements.
	public static void main(String[] args) {
		int[] a = { 2,0,1,2,1,0,2,1,0 };
		System.out.println("Original Array: " + Arrays.toString(a));
        
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < a.length; i++) {

		if(a[i] == 0) {count0++;}
		else if(a[i] == 1) {count1++;}
		else {count2++;}
		}
		int index = 0;
        for(int i=0;i<count0;i++) {
        	a[index++] = 0;
        }
        for(int i=0;i<count1;i++) {
        	a[index++] = 1;
        }
        for(int i=0;i<count2;i++) {
        	a[index++] = 2;
        }
		System.out.println("Sorted Array: " + Arrays.toString(a));
	}
**/