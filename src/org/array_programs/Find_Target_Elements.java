package org.array_programs;

public class Find_Target_Elements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int target = 6;

        // Label for the outer loop to allow breaking out of nested loops
        outerLoop:
        for (int i = 0; i < a.length; i++) {
            
            // Inner loop starts from i + 1 to avoid picking the same element twice
            // and to prevent redundant checks (like checking both [1,2] and [2,1])
            for (int j = i + 1; j < a.length; j++) {
                
                // Check if the sum of the two elements matches the target
                if (target == a[i] + a[j]) {
                    System.out.println("The index value for: " + target + " are: " + i + " and " + j);
                    
                    // Exit both loops as soon as the first pair is identified
                    break outerLoop;
                }
            }
        }
    }
}


/**
 public class Practice {

    // Method to find two numbers that sum to a target using two pointers
    public static int[] twoSum(int[] a, int target) {
        int left = 0;               // Start pointer at the beginning
        int right = a.length - 1;   // End pointer at the last element

        // Loop until the two pointers meet
        while (left <= right) {
            int sum = a[left] + a[right];

            // Case 1: Sum matches target
            if (sum == target) {
                return new int[] {a[left], a[right]};
            } 
            // Case 2: Sum is too large, move the right pointer left to decrease sum
            else if (sum > target) {
                right--;
            } 
            // Case 3: Sum is too small, move the left pointer right to increase sum
            else {
                left++;
            }
        }
        
        // Return -1 pair if no solution is found
        return new int[] {-1, -1};
    } 

    public static void main(String[] args) {
        // Note: This algorithm requires the array to be SORTED
        int[] a = {1, 2, 3, 4, 6};
        int target = 4;

        int[] result = twoSum(a, target);
        
        // Output the result as a string array
        System.out.println(Arrays.toString(result));
    }
}


Requirement: This logic only works on sorted arrays. If the array were {4, 1, 6, 2, 3}, the pointers wouldn't know which way to move to find the target.
 */
