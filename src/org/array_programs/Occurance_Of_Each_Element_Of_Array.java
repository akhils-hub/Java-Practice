package org.array_programs;

import java.util.TreeMap;

public class Occurance_Of_Each_Element_Of_Array {

    public static void main(String[] args) {
        int[] a = {1, 5, 1, 4, 8, 8, 8, 1};
        
        // LinkedHashMap is used to store <Number, Count> while preserving 
        // the order in which numbers first appear in the array.
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        // Step 1: Build the frequency map
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            
            // If the number is already in the map, increment its existing count
            if (map.containsKey(key)) {
                int prev = map.get(key);
                map.put(key, prev + 1);
            } 
            // If it's the first time seeing this number, initialize count to 1
            else {
                map.put(key, 1);
            }
        }
        
        // Step 2: Display the results
        // Printing the entire map object directly
        System.out.println("Full Map: " + map.toString());
        
        // Iterating through the keys to print in a custom format
        for (int num : map.keySet()) {
            System.out.println(num + " --> " + map.get(num));
        }
    }
}


/**
public class Practice {
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 3, 1, 2, 3, 4, 5};
        // This array keeps track of which elements we have already counted
        boolean[] visited = new boolean[a.length];
        
        for (int i = 0; i < a.length; i++) {
            
            // Skip this element if we have already counted it in a previous iteration
            if (visited[i] == true) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                // If we find a match...
                if (a[i] == a[j]) {
                    // Mark the duplicate as visited so the outer loop skips it later
                    visited[j] = true;
                    count++;
                }
            }
            
            // Print the result for this unique element
            System.out.println(a[i] + " --> " + count);
        }
    }
}

*/