package org.number_programs;

public class Palindrome_Check {
	//an integer that remains the same when its digits are reversed, reading identically from left-to-right and right-to-left
	public static void main(String[] args) {

		int n = 121;

		// Converting Int to String
		String string = Integer.toString(n);
		System.out.println(string);

		String r = "";

		for (int i = string.length() - 1; i >= 0; i--) {
			r = r + string.charAt(i);
		}

		// Converting String to Int
		int parseInt = Integer.parseInt(r);

		if (n == parseInt) {
			System.out.println(n+ " is a Palindrome Number");
		} else {
			System.out.println(n + " is not a Palindrome Number");
		}
	}

}


/**
 public class Practice {

	public static void main(String[] args) {
		int n = 125;
		int temp = n;
		System.out.println("Original Number: " + n);

		int r = 0;
		while (temp != 0) {
			int rem = temp % 10;
			r = r * 10 + rem;
			temp = temp / 10;
		}
		System.out.println("Reversed Number: " + r);
		
		if(n == r)
			System.out.println(n + " is a Palindrome Number");
		else 
			System.out.println(n + " is not a Palindrome Number");
	}

}

 */
