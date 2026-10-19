package org.java;

import java.util.Arrays;

// Reverse Vowels
public class Practice {
	
	public static String reverseVowels(String s) {
		char[] ch = s.toCharArray();
		int left = 0;
		int right = s.length()-1;

		while(left<=right) {
			while(left<right && !isVowel(s.charAt(left))) {
				left++;
			}
			while(left<right && !isVowel(s.charAt(right))) {
				right--;
			}
			char temp = s.charAt(left);
			ch[left] = s.charAt(right);
			ch[right] = temp;
			 
			left++; right--;
		}
		//String string = Arrays.toString(ch);
		
		return new String(ch);
	}
	
	
	public static boolean isVowel(char c) {
		char lower = Character.toLowerCase(c);
		return lower == 'a' || lower == 'e' || lower =='i' || lower =='o' || lower == 'u';
	}
	public static void main(String[] args) {
		String s = "IceCreAm";
		System.out.println(s);
		
		String reverseVowels = reverseVowels(s);
		System.out.println(reverseVowels);
	}
}
