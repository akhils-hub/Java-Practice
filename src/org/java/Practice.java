package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
