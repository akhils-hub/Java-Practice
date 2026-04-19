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





/*

// Occurance of given String!
public class Practice {

    public static void main(String[] args) {
        String s = "akhilbabu";
        
        // Create a boolean array to keep track of characters we have already counted.
        // This prevents the same character (like 'a') from being processed twice.
        boolean[] visited = new boolean[256];
        
        for(int i=0; i<s.length(); i++) {
            
            int count = 1; // Start count at 1 for the current character at index i
            
            // If we have already counted this character, skip the rest of the loop
            if(visited[s.charAt(i)] == true) {
                continue;
            }
            
            // Compare the character at 'i' with all subsequent characters in the string
            for(int j=i+1; j<s.length(); j++) {
                
                // If a match is found, increment the count and mark it as visited
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                    visited[s.charAt(i)] = true;
                }
            }
            
            // Print the final frequency for the character
            if(count > 0) {
                System.out.println(s.charAt(i) + " --> " + count);
            }
        }
    }
}

*/