package org.array_programs;

import java.util.LinkedHashMap;

public class First_Non_Repeated_Element_Of_Array {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 1, 2, 3, 4, 5};
        
        // LinkedHashMap is used to maintain the order in which elements are added
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        
        // Step 1: Build the Frequency Map
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            if (map.containsKey(key)) {
                // If element exists, increment its count
                int prev = map.get(key);
                map.put(key, prev + 1);
            } else {
                // If element is new, add it with a count of 1
                map.put(key, 1);
            }
        }
        
        // Step 2: Iterate through the Map in insertion order
        for (int num : map.keySet()) {
            // The first key with a value of 1 is our answer
            if (map.get(num) == 1) {
                System.out.println("First Non Repeated Element: " + num);
                
                // Break after finding the first one to avoid printing others (like 5)
                break; 
            }
        }
    }
}




/**
//This is the brute-force approach to finding the first non-repeated element. While it is less efficient than the HashMap approach for very large arrays.
 public class Practice {
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 3, 1, 2, 3, 4, 5};
        
        // Outer loop: Pick each element one by one
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            
            // Inner loop: Compare the picked element with every other element in the array
            for (int j = 0; j < a.length; j++) {
                
                // Check if values match AND ensure we aren't comparing the element to itself (i != j)
                if (a[i] == a[j] && i != j) {
                    count++;
                    // Optimization: We found a duplicate, so we can stop checking the inner loop
                    break; 
                }
            }
            
            // If count remains 0, it means no duplicates were found for a[i]
            if (count == 0) {
                System.out.println("First Non-Repeated Element: " + a[i]);
                
                // Exit the outer loop immediately after finding the first unique element
                break;
            }
        }
    }
}

 */
