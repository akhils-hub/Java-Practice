package org.array_programs;

import java.util.Arrays;

import org.java.Practice;

public class Move_Zeros_To_End {

    public static void main(String[] args) {
        int[] a = {9, 6, 0, 3, 0, 1};
        System.out.println("Original Array: " + Arrays.toString(a));
        
        // 'count' keeps track of the next available index for a non-zero element
        int count = 0;
        
        // Step 1: Traverse from left to right
        for (int i = 0; i < a.length; i++) {
            // If we find a non-zero element, "push" it to the current 'count' position
            if (a[i] != 0) {
                a[count] = a[i];
                // Increment count only when a non-zero element is placed
                count++;
            }
        }
        
        // Step 2: After all non-zero elements are moved, 'count' is at the starting
        // index of where the trailing zeros should begin.
        while (count < a.length) {
            a[count] = 0;
            count++;
        }
        
        // Output for {9, 6, 0, 3, 0, 1} will be [9, 6, 3, 1, 0, 0]
        System.out.println("After Moving Zeros to End: " + Arrays.toString(a));
    }
}


/**
public class Practice {
	public void movingToEnd(int[] a) {
		int target = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] !=0) {
				int temp = a[i];
				a[i] = a[target];
				a[target] = temp;
				target++;
			}
		}
	}
	
	
	public static void main(String[] args) {
	 int[] a = {9, 6, 0, 3, 0, 1};
	 
	 System.out.println("Original Array: "+Arrays.toString(a));
	 
	 Practice p = new Practice();
	 p.movingToEnd(a);
	 System.out.println("After Moving Zeros to End: "+Arrays.toString(a));
	}
} 
*/
