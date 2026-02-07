package org.string_programs;

public class Reverse_String_By_Order {

	//Reverse String by Order.
	public static void main(String[] args) {

		String s = "Akhil babu DBS";
		System.out.println("Original String: " + s);

		String[] split = s.split(" ");

		String reverse = "";

		for(int i=split.length-1;i>=0;i--) {
			reverse = reverse + split[i];
			if(i !=0) {
				reverse = reverse + " ";
			}
		}

		System.out.println("Reverse String: " + reverse);

	}
}
