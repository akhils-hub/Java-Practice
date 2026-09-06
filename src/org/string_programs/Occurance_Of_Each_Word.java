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
