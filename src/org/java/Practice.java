package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Practice {

	public static int[] twoSum(int[] a, int target) {
		int left =0;
		int right = a.length-1;

		while(left<=right) {
			int sum = a[left] + a[right];
			if(sum == target) {
				return new int[] {a[left],a[right]};
			}else if(sum>target){
				right--;
			}else {
				left++;
			}
		}
		return new int[] {-1,-1};
	} 

	public static void main(String[] args) {
		int[] a = {1,2,3,4,6};
		int target = 4;

		int[] twoSum = twoSum(a,target);
		System.out.println(Arrays.toString(twoSum));

	}
}
