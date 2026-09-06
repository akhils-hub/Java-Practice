package org.java;

import java.text.*;
import java.util.*;
import java.util.stream.IntStream;

public class Practice {

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
}
