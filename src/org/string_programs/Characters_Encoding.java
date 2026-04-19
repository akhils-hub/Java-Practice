package org.string_programs;

public class Characters_Encoding {
	public static void main(String[] args) {
	    // The input string to be processed
	    String s = "AkhilBabu";

	    // Loop through each character of the string based on its index
	    for(int i = 0; i < s.length(); i++) {
	        
	        // Extract the character at the current index 'i'
	        char ch = s.charAt(i);
	        
	        // Explicitly cast the character to an integer to get its decimal ASCII/Unicode value
	        int ascii = (int) ch;
	        
	        // Print the original character followed by its corresponding numeric ASCII value
	        System.out.println(ch + " " + ascii);
	    }
	}

}
