package org.java;

public class Practice {
    //Reverse String by Order.
	public static void main(String[] args) {
		
	String s = "Akhil babu DBS";
	System.out.println("Original String: " + s);
	System.out.println(s.length());
	String[] split = s.split(" ");
	
	String reverse = "";
	
	for(int i=split.length-1;i>=0;i--) {
		reverse = reverse + split[i];
		if(i !=0) {
			reverse = reverse + " ";
		}
	}
	
	System.out.println("Reverse String: " + reverse);
	System.out.println(reverse.length());
	
	}
}
