package org.array_programs;

import java.util.Arrays;

public class Rotate_Array_By_K_Positions {
	
	public static void rotateKpostions(int[] a, int k) {
		int n= a.length;
		if(k>n) {
			k = k%n; //Effective Rotation to handle cases where k > n
		}
		
		//Step:1. Reverse the Entire Array
		reverse(a,0,n-1);
		//Step:2. Reverse the k elements(Position)
		reverse(a,0,k-1);
		//Step:3. Reverse Remaining Positions
		reverse(a,k,n-1);
		
	}
	
	// Helper method to reverse a specific portion of the array in-place.
	public static void reverse(int[] a,int start, int end) {
		
		while(start<end) {
			int temp;
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;end--;
		}
	} 

	public static void main(String[] args) {

     int[] a = {1,2,3,4,5};
     int k = 2;
     System.out.println("Before Rotation: "+Arrays.toString(a));
     rotateKpostions(a,k);
     System.out.println("After Rotaion: "+Arrays.toString(a));
	}

}
