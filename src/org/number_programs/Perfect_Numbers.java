package org.number_programs;

public class Perfect_Numbers {
    // Method to determine if a given number 'n' is a perfect number
    public static boolean isPerfect(int n) {
        int sum = 0;
        
        // Iterate through all numbers from 1 up to (but not including) n
        for(int i = 1; i < n; i++) {
            // If 'i' divides 'n' without a remainder, it is a proper divisor
            if(n % i == 0) {
                sum = sum + i;
            }
        }
		
        // Returns true if the sum of divisors equals the original number
        return n == sum;
    }
	
    public static void main(String[] args) {
        int start = 1;
        int end = 1000; // Search range: [1 to 999]
        
        System.out.println("Perfect Numbers are: ");
	
        // Loop through the range and check each number
        for(int i = start; i < end; i++) {
            if(isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
