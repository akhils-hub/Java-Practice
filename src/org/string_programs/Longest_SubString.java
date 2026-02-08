package org.string_programs;

import java.util.LinkedHashMap;

public class Longest_SubString {
	//Longest SubString without repeating duplicate characters.
	public static void main(String[] args) {
		String s = "abdacbabcd";

		int longestL = 0;
		String longestS = "";
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

		for(int i=0;i<s.length();i++) {
			char key = s.charAt(i);
			if(!map.containsKey(key)) {
				map.put(key, i);
			}else {
				i = map.get(key);
				map.clear();

				if(longestL < map.size()) {
					longestL = map.size();
					longestS = map.toString();
				}
			} 
			if(longestL < map.size()) {
				longestL = map.size();
				longestS = map.toString();
			}

		}

		System.out.println(longestS.replaceAll("[^a-z]", ""));

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<longestS.length();i++) {
			char ch = longestS.charAt(i);
			if(ch >='a' && ch <='z') {
				sb.append(ch);
			}
		}

		System.out.println(sb.toString());

	}

}
