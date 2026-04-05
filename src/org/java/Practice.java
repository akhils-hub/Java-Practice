package org.java;

import java.util.Arrays;

// Intersection
public class Practice {
	
	
	public static void main(String[] args) {

		 int[] a1 = { 1, 2, 3, 4, 5,4 };
	     int[] a2 = { 4, 5, 6, 7, 8 };
		 
		for(int i=0;i<a1.length;i++) {
			
			boolean common = false;
			
			for(int j=0;j<a2.length;j++) {
				
				if(a1[i] == a2[j]) {
					
					common = true;
					
				}
				if(common) {
					System.out.println(a2[j]);
					break;
				}
			}
			
			
		}
	}

}
