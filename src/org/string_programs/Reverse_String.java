package org.string_programs;

import java.util.Scanner;

public class Reverse_String {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String to reverse ?");
	String original = sc.next();
	System.out.println("Original String: " + original);
	String reverse = "";
	for(int i=original.length()-1;i>=0;i--) {
		char ch = original.charAt(i);
		reverse = reverse + ch;
	}
	System.out.println("Reverse String: " + reverse);
}
}


/**
  //Two-Pointer Approach to Reverse String.
	public static void main(String[] args) {
		String s = "akhil";
		System.out.println("Original String: " + s);

		char[] ch = s.toCharArray();

		int start = 0;
		int end = ch.length-1;

		while(start < end) {
			char temp;
			temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++; 
			end--;
		}

		StringBuilder reverse = new StringBuilder();

		for(char c:ch) {
			reverse.append(c);
		}

		System.out.println("Reverse String: " + reverse.toString());		
	} 
 */
