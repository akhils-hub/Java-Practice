package org.array_programs;

import java.util.Arrays;

public class Move_Zeros_To_Begining {

	public static void moveZerosToBegin(int[] a) {
		// 'count' acts as a pointer for the position where the next non-zero 
		// element should be placed, starting from the very end.
		int count = a.length - 1;

		// Step 1: Traverse the array from right to left
		for (int i = a.length - 1; i >= 0; i--) {
			// If the current element is NOT a zero
			if (a[i] != 0) {
				// Move the non-zero element to the 'count' position
				a[count] = a[i];
				// Move the 'count' pointer one step to the left
				count--;
			} 
		}

		// Step 2: After all non-zero elements are shifted to the right,
		// fill the remaining leftmost positions with zeros.
		while (count >= 0) {
			a[count] = 0;
			count--;
		}
	}

	public static void main(String[] args) {
		int[] a = {9, 6, 3, 0, 0, 1};

		System.out.println("Original Array: " + Arrays.toString(a));

		moveZerosToBegin(a);

		// Output for {9,6,3,0,0,1} will be [0, 0, 9, 6, 3, 1]
		System.out.println("After Zeros Moving to Beginning: " + Arrays.toString(a));
	}
}


/**

import java.util.Arrays;

public class Move_Zeros_Advanced {
    public static void moveZerosToBegin(int[] a) {
        // Pointer tracking where the next non-zero should be swapped
        int target = a.length - 1;

        // One single pass from right to left
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                // Swap the current non-zero element with the target position
                int temp = a[i];
                a[i] = a[target];
                a[target] = temp;
                
                // Move target pointer to the left
                target--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 6, 0, 3, 0, 1};
        moveZerosToBegin(a);
        System.out.println("Advanced Swap Result: " + Arrays.toString(a));
    }
}

 
*/
