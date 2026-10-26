package org.problem_solving;

import java.util.Arrays;

public class Container_With_Most_Water {
	
	public static int mostWater(int[] a) {
		int left = 0;
		int right = a.length-1;
		int mostWater = 0;
		while(left<right) {
			int width = right-left;
			int height = Math.min(a[left],a[right]);
			int area = width * height;
			if(mostWater < area) {
				mostWater = area;
			}else if(a[left] < a[right]) {
				left++;
			}else {
				right--;
			}
		}
		return mostWater;
	}

	public static void main(String[] args) {
		int[] a = {1,6,2,8,4,3,7};
		
		System.out.println("Container: " + Arrays.toString(a));
		System.out.println("Most Water Contains: " + mostWater(a));
	}

}
