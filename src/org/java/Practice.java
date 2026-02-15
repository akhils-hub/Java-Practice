package org.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		int[] a = {1, 1, 2, 3, 4, 5, 5, 6, 3, 1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j] && i!=j) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
