package org.string_programs;

import java.util.TreeSet;

public class Find_Duplicate_Characters {
	//Find Duplicate Characters
	public static void main(String[] args) {
		String s = "akhil babu malapolu";
		boolean isNotDuplicate = true;
		TreeSet<Character> set = new TreeSet<>();
		for(int i=0;i<s.length();i++) {
			boolean isDuplicate = false;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
					isDuplicate = true;
					break;
				}
			}
			if(isDuplicate) {
				//System.out.print(s.charAt(i) + " ");

				set.add(s.charAt(i));
				isNotDuplicate = false;
			}
		}
		System.out.println(set.toString());
		StringBuilder sb = new StringBuilder();
		for(char ch:set) {
			sb.append(ch);
		}
		System.out.println(sb.toString());
		if(isNotDuplicate) {
			System.out.println("There is not duplicate charactes!");
		}

	}
}
