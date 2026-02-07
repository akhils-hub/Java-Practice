package org.string_programs;

public class Remove_Special_Characters {
	//Remove Special Characters in a given String.
	public static void main(String[] args) {
		String s = "Akhilbabu123@#$%^456";

		String removeSP = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(removeSP);

		//	String onlySP = s.replaceAll("[a-zA-Z0-9]","");
		//	System.out.println(onlySP);
	}
}
