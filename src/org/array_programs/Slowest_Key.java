package org.array_programs;

public class Slowest_Key {

	public static void main(String[] args) {
	
		String s = "cbcd";
		int[] a = {9,29,49,50}; // c=9,b=29.c=49,d=50.
		
		int maxDuration = a[0];
		char ch = s.charAt(0);
		
		for(int i=1;i<a.length;i++) {
			int duration = a[i] - a[i-1];
			if(duration >= maxDuration) {
				maxDuration = duration;
				ch = s.charAt(i);
			}
		}
		
		System.out.println("Max Duration is: " + maxDuration + " to press the key \"" + ch + "\"");
		
	}

}
