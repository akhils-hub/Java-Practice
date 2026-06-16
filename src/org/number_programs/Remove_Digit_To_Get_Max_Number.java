package org.number_programs;

public class Remove_Digit_To_Get_Max_Number {

	public static void main(String[] args) {
		String s = "512315";
		char digit = '5';
		int maxNumber = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == digit) {
				String temp = s.substring(0,i) + s.substring(i+1);
				int current = Integer.parseInt(temp);
				if(current > maxNumber) {
					maxNumber = current;
				}
			}
			
		}

		System.out.println("Maximum Number \"" + maxNumber + "\" after removing \"" + digit + "\"");
	}

}
