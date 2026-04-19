package org.string_programs;

public class Count_Vowels_And_Consonents {
	public static void main(String[] args) {
		String s = "AkhilBabu123".toLowerCase();
	    int vowels = 0;
	    int consonents = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				}else {
					consonents++;
				}
			}
			
		}
		
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonents: " + consonents);
	}
}
