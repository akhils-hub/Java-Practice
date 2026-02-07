package org.string_programs;

import java.util.LinkedHashMap;

public class Occurance_Of_Each_Element {
	//Occurance of each element in a given String
	public static void main(String[] args) {
		String s = "akhilbabu".toLowerCase();

		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

		for(int i=0;i<s.length();i++) {
			char key = s.charAt(i);
			//map.put(key, map.getOrDefault(key, 0)+1);
			if(map.containsKey(key)) {
				int prev = map.get(key);
				map.put(key, prev+1);
			}else {
				map.put(key, 1);
			}
		}

		System.out.println(map.toString());

		/**
		 for(int i=0;i<s.length();i++) {
			char key = s.charAt(i);
			if(map.containsKey(key)) {
				System.out.println(key+ " --> " + map.get(key) );
				map.remove(key);
			}
		}
		 */

		for (char ch:map.keySet()) {
			System.out.println(ch+ " --> " + map.get(ch));
		}
	}
}

//map.get(key); -- used to retrive the value associate with a specific key.
//if 'key' does not exist in the map, it will return NULL.