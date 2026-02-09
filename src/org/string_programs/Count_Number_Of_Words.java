package org.string_programs;

public class Count_Number_Of_Words {
	//Count Numbers of Words
	public static void main(String[] args) {
		String s = "  akhil babu malapolu ";
		String trim = s.trim();
		int count = 1;

		for(int i=0;i<trim.length();i++) {

			if(trim.charAt(i) == ' ' && trim.charAt(i+1) != ' ') {
				count++;
			}

		}
		System.out.println(count);
	}
}
