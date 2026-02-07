package org.string_programs;

public class Reverse_String_Word_By_Word {

	//Reverse String - Word by Word
	public static void main(String[] args) {

		String s = "Akhil babu DBS";
		System.out.println("Original String: " + s);
		System.out.println(s.length());

		String[] split = s.split(" ");

		String reverse = "";

		for(int i=0;i<split.length;i++) {
			String word = split[i];
			String innerReverse = "";
			for(int j=word.length()-1;j>=0;j--) {
				innerReverse += word.charAt(j);
			}

			reverse += innerReverse;
			if(i != split.length-1) {
				reverse +=" ";
			}
		}

		System.out.println("Reverse String: " + reverse);
		System.out.println(reverse.length());

	}
}
