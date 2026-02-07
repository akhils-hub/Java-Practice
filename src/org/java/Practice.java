package org.java;

import java.util.LinkedHashSet;

public class Practice {
	//Remove Duplicate Characters in a given String.
	public static void main(String[] args) {
		String s = "Akhilbabu".toLowerCase();
		System.out.println("Original String: " + s);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			boolean uni = true;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					uni = false;
				}
			
			}
			if(uni) {
				//System.out.print(s.charAt(i));
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
