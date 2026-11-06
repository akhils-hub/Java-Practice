package org.java;

import java.util.Arrays;

// 
public class Practice {
	
	public static void main(String[] args) {
      String s1 = "listen";
      String s2 = "silent";
      boolean isAnagram = true;
      // Assuming standard ASCII characters (256 possibilities)
      int[] charCount = new int[256];
      
      for(int i=0;i<s1.length();i++) {
    	  charCount[s1.charAt(i)]++;
    	  charCount[s2.charAt(i)]--;
      }
	System.out.println("Akhil");
     for(int x: charCount) {
    	 if(x != 0) {
    		 isAnagram = false;
    	 }
     }
	}
}
