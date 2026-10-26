package org.string_programs;

public class Reverse_String_Word_By_Word {

	//Reverse String - Word by Word
	public static void main(String[] args) {

		String s = "Akhil babu DBS";
		System.out.println("Original String: " + s);
		System.out.println(s.length());

		String[] split = s.split(" ");

		String reverse = "";

		for(int i=0;i<split.length;i++) {
			String word = split[i];
			String innerReverse = "";
			for(int j=word.length()-1;j>=0;j--) {
				innerReverse += word.charAt(j);
			}

			reverse += innerReverse;
			if(i != split.length-1) {
				reverse +=" ";
			}
		}

		System.out.println("Reverse String: " + reverse);
		System.out.println(reverse.length());

	}
}



/*
 public class Practice {
	public static void reverse(char[] ch, int start, int end) {
		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		String s = "I Love India";
		char[] ch = s.toCharArray();
		int start = 0;
		for (int i = 0; i <= ch.length; i++) {
			if (i == ch.length || ch[i] == ' ') {
				reverse(ch, start, i-1);
				start = i + 1;
			}
		}
		System.out.println(new String(ch));
	}
}
 */
