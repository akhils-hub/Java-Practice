package org.string_programs;

public class RunLengthEncoding_a2b3c4 {
	public static void main(String[] args) {

		String s = "a2b3c4";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i+=2) {
			char ch = s.charAt(i);
			int count = s.charAt(i + 1) - '0';
			for (int j = 0; j < count; j++) {
				sb.append(ch);
			}
		}
		System.out.println("Original String: " + s);
		System.out.println("After Encoding: " + sb.toString());
	}
}
