package org.string_programs;

import java.util.Arrays;

public class Anagram_Check {
	//Anagram check
	// meaning both strings contain the exact same characters with the exact same frequency, just in a different order
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();


		if(ch1.length != ch2.length) {
			System.out.println(s1+ " and "+ s2+" are not Anagram");
		}else {

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));

			if(Arrays.equals(ch1, ch2)) {
				System.out.println(s1+ " and "+ s2+" are Anagram");
			}
			else {
				System.out.println(s1+ " and "+ s2+" are not Anagram");
			}

		}

	}

}


/**
 
 //Anagram check
	// using Map Concept
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

		for(int i=0;i<s1.length();i++) {
			char key = s1.charAt(i);
			if(map.containsKey(key)) {
				int prev = map.get(key);
				map.put(key, prev+1);
		
			} else {
				map.put(key,1);
			}
		}
		
		for(int i=0;i<s2.length();i++) {
			char key = s1.charAt(i);
			if(map.containsKey(key)) {
				int prev = map.get(key);
				map.put(key, prev-1);
				if(map.get(key) == 0) {
					map.remove(0);
				}

			}else {
				map.put(key,1);
			}
		}
		
		if(map.size() == 0) {
			System.out.println(s1+ " and "+ s2+" are Anagram");
		}
		else {
			System.out.println(s1+ " and "+ s2+" are not Anagram");
		}
		
	}
 
 */
