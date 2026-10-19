package org.string_programs;

import java.util.LinkedHashMap;

public class Occurance_Of_Each_Word {
    public static void main(String[] args) {
        // Input array containing the list of names/words to count
        String[] nameArray = {"Akhil", "Bhavana", "Sai", "Akhil"};
        
        // LinkedHashMap keeps track of the counts while preserving the insertion order
        LinkedHashMap<String, Integer> wordCountMap = new LinkedHashMap<>();
        
        // Loop through each element in the input array
        for (int i = 0; i < nameArray.length; i++) {
            String currentWord = nameArray[i];
            
            // If the word is already in the map, increment its existing count by 1
            if (wordCountMap.containsKey(currentWord)) {
                wordCountMap.put(currentWord, wordCountMap.get(currentWord) + 1);
            } 
            // If the word is encountered for the first time, add it to the map with a count of 1
            else {
                wordCountMap.put(currentWord, 1);
            }
        }
        
        // Print the raw map representation directly to the console
        System.out.println(wordCountMap.toString());

        // Iterate through all the unique keys (words) in the map and print their frequencies
        for (String uniqueWord : wordCountMap.keySet()) {
            System.out.println(uniqueWord + " --- " + wordCountMap.get(uniqueWord));
        }
    }
}


/**
 public class Practice {

	public static void main(String[] args) {
		String s = "Apples are apples Orange is green " + "nice taste Orange but color sun rise apples " + "Orange sun sun green green";
		
		String[] words = s.toLowerCase().split(" ");
		boolean[] visit = new boolean[words.length];
		for(int i=0;i<words.length;i++) {
			
		    String current = words[i];
			int count = 1;
			
			//visit[i] == true: Checks if the word at the current loop index i has already been counted in a previous iteration.
			if(visit[i] == true) {
				continue;
			}
			
			for(int j=1+i;j<words.length;j++) {
			 if(current.equals(words[j])) {
				 count++;
				 
				//• visit[j] = true: Marks the duplicate word found at index j as visited so it won't be counted again when the outer loop reaches it. 
				visit[j] = true;
			 }
			}
			
			if(count >=1) {
				System.out.println(current + " >>> " + count);
			}
		}
	}
}

*/