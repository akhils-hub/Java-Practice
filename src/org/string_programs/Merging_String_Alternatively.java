package org.string_programs;

public class Merging_String_Alternatively {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String result = "";
		
		int i=0,j=0;
		
		while(i<s1.length() && j<s2.length()) {
			result += s1.charAt(i);
			result += s2.charAt(j);
			i++; j++;
		}
		
		while(i<s1.length()) {
			result += s1.charAt(i);
			i++;
		}
		while(j<s2.length()) {
			result += s2.charAt(j);
			j++;
		}
		System.out.println(result);

	}

}
