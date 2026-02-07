package org.string_programs;

public class Longest_Common_Prefix {

	public static String longestCommonPrefix(String[] s) {
		for(int i=0;i<s[0].length();i++) {
			for(int j=1;j<s.length;j++) {
				if(i == s[j].length() || s[0].charAt(i) != s[j].charAt(i)) {
					String substring = s[0].substring(0, i);
					return substring;
				}
			}
		}
		return s[0];
	}

	//Longest Common Prefix
	public static void main(String[] args) {
		String[] s = {"flower","flow","flight"};
		String longestCommonPrefix = longestCommonPrefix(s);
		System.out.println(longestCommonPrefix);
	}
}
