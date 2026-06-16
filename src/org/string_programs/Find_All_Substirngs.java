package org.string_programs;
// To Find all SubStings of a given string.
public class Find_All_Substirngs {

	public static void main(String[] args) {
		String s = "abc";
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String substring = s.substring(i,j);
				System.out.println(substring);
			}
			
		}

	}

}
