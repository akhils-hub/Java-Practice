package org.java;

public class String_Reverse {

	public static void main(String[] args) {
		String original = "akhil";
		String reverse = "";
		System.out.println("Orginal:" + original);
		for(int i=original.length()-1;i>=0;i--) {
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("Reverse: " + reverse);
		
	}
}
