package org.array_programs;

import java.util.Arrays;

public class Move_Negative_Numbers_Left {

	public static void main(String[] args) {

		int[] a = {3,-1,2,-5,-4,6};
		int left = 0;
		int right = a.length-1;
		while(left<=right) {

			if(a[left] < 0) {
				left++;
			}else if(a[right] > 0) {
				right--;
			}else {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
		}

		System.out.println(Arrays.toString(a));
	}
}
