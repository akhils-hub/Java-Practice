package org.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice {
	public static void main(String[] args) {
		 int[] a = {1, 5, 1, 4, 8, 8, 8, 1};
		 
		
		for(int i=0;i<a.length;i++) {

			int count = 1;
			for(int j=0;j<a.length;j++) {
				if(a[i] == a[j] && i!=j) {
					
					
					count++;
				}
			}
			if(count >= 1)
			System.out.println(a[i]+" --> " + count);
		}
	}
}
