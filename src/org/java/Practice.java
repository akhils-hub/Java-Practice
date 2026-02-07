package org.java;

import java.util.LinkedHashMap;

public class Practice {

	//Occurance of each element in a given String
	public static void main(String[] args) {
		String s = "akhilbabu".toLowerCase();

		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

		for(int i=0;i<s.length();i++) {
			char key = s.charAt(i);
			map.put(key, map.getOrDefault(key, 0)+1);
		}

		System.out.println(map.toString());

		for (char ch:map.keySet()) {
			System.out.println(ch+ " --> " + map.get(ch));
		}
	}

}


// map.get(key); -- used to retrive the value associate with a specific key.
// if 'key' does not exist in the map, it will return NULL.