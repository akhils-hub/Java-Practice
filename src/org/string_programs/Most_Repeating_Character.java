package org.string_programs;

import java.util.LinkedHashMap;

public class Most_Repeating_Character {
	public static void main(String[] args) {
		String s = "akhilbabu";
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			 char key = s.charAt(i);
			 map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		int max = 0;
		char ch = ' ';
		
		for(char key:map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				ch = key;
			}
		}
		
		/*
		 for(int i=0;i<s.length();i++) {
			char key = s.charAt(i);
			if(map.get(key) > max) {
				max = map.get(key);
				ch = key;
			}
		}

		 */
		
		System.out.println("Most Repeating Character in a given Stirng: \"" + ch + "\" and count: " + max );
	}
}
