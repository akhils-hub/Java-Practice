package org.string_programs;
// Longest Word in a given String
public class Longest_Word_In_String {

	public static void main(String[] args) {
		String s = "Akhil Babu Malapolu";
		int maxLength = 0;
		String longest = "";
		String[] words = s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String string = words[i];
			if(string.length() > maxLength) {
				maxLength = string.length();
				longest = words[i];
			}
		}
		
		System.out.println("Longest Word in a given String: " + longest);

	}

}
