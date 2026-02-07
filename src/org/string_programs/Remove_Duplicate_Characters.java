package org.string_programs;

import java.util.LinkedHashSet;

public class Remove_Duplicate_Characters {
	//Remove Duplicate Characters in a given String.
	public static void main(String[] args) {
		String s = "Akhilbabu".toLowerCase();

		//Set is used to store unique characters
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		//here, all unique characters stored in set variable
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			set.add(ch);
		}

		//here, it will print all unique characters
		System.out.println(set.toString());

		//StringBuilder used to store all unique characters in a String
		StringBuilder sb = new StringBuilder();

		//here, it will store all unique character in sb variable
		for(char c:set) {
			sb.append(c);
		}

		//here, it will print all unique characters in the form of String
		//toString() method to get the String representation of the object
		//toString() method to convert the StingBuilder object into  a String
		System.out.println(sb.toString());

	}
}


/**
 //Remove Duplicate Characters without using Collection Framework!.
	public static void main(String[] args) {
		String s = "Akhilbabu".toLowerCase();
		System.out.println("Original String: " + s);

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			boolean uni = true;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					uni = false;
				}

			}
			if(uni) {
				//System.out.print(s.charAt(i));
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

 */
