package org.number_programs;

public class Reverse_Number {

	public static void main(String[] args) {
		int n = 125; // The number we want to reverse
		int temp = n; // Create a temporary copy to preserve the original value of 'n'

		System.out.println("Original Number: " + n);

		int r = 0; // This variable will store the reversed number as we build it

		// Continue the loop until all digits have been processed
		while (temp != 0) {
			// 1. Get the last digit of the current number using the remainder operator
			// Example: 125 % 10 = 5
			int rem = temp % 10;

			// 2. Shift 'r' one decimal place to the left and add the new digit
			// Example: (0 * 10) + 5 = 5. On next loop: (5 * 10) + 2 = 52.
			r = r * 10 + rem;

			// 3. Remove the last digit from 'temp' using integer division
			// Example: 125 / 10 = 12
			temp = temp / 10;
		}

		System.out.println("Reversed Number: " + r);

	}

}
