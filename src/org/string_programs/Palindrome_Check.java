package org.string_programs;

public class Palindrome_Check {
	//palindrome string is a sequence of characters that reads the same backward as it does forward
	public static void main(String[] args) {
		String s = "Madam".toLowerCase();
		boolean isPalindrome = true;
		int start =0;
		int end = s.length()-1;

		while(start<end) {

			if(s.charAt(start) != s.charAt(end)) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}

		if(isPalindrome) {
			System.out.println("\"" + s + "\" is a palindrome");
		}else {
			System.out.println("\"" + s + "\" is not a palindrome");
		}


	}
}
