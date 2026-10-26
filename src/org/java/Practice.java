package org.java;

// 
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

		String s = "I Love India akhilmalapolu";
		System.out.println(s);

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
