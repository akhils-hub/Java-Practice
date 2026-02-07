package org.java;

public class Practice {
	//Separate Alphabetic, Numeric and Special Characters in a given String.
		public static void main(String[] args) {
			String s = "Akhil123@#$babu%^456";
			System.out.println("Original Stirng: " + s);
			StringBuilder alpha = new StringBuilder();
			StringBuilder num = new StringBuilder();
			StringBuilder sp = new StringBuilder();

			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch >='a' && ch <='z' || ch >='A' && ch <='Z') {
					alpha.append(ch);
				}else if(ch >='0' && ch <='9') {
					num.append(ch);
				}else {
					sp.append(ch);
				}
			}

			System.out.println("Alphabetic Characters: " + alpha.toString());
			System.out.println("Numeric Characters: " + num.toString());
			System.out.println("Special Characters: " + sp.toString());
		}
		
}
