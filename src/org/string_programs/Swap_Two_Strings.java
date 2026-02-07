package org.string_programs;

public class Swap_Two_Strings {

	//Swap Two Strings
	public static void main(String[] args) {

		String s1 = "akhil";
		String s2 = "sai";
		System.out.println("Before Swap:");
		System.out.println("s1 is: \""  + s1+ "\" and s2 is: \"" + s2 +"\"");

		//Swap two Variables using Third Variable.
		swapStirng(s1,s2);

		//Swap two Variables without using third variable.
		swap(s1,s2);

	}

	//Swap two Variables without using third variable.
	public static void swap(String a, String b) {
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After Swap:");
		System.out.println("s1 is: \""  + a+ "\" and s2 is: \"" + b+"\"");

	}

	//Swap two Variables using Third Variable.
	public static void swapStirng(String s1, String s2) {
		String temp;
		temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println("After Swap:");
		System.out.println("s1 is: \""  + s1+ "\" and s2 is: \"" + s2 +"\"");

	}

}
