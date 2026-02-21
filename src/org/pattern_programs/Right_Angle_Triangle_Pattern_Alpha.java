package org.pattern_programs;

public class Right_Angle_Triangle_Pattern_Alpha {

	public static void main(String[] args) {
		int row = 4;
		char ch = 'A';
		for(int i=0;i<row;i++) {
			//char ch = 'A';
			for(int j=0;j<=i;j++) {
				System.out.print(ch + " ");
				ch++;
			}
			
			System.out.println();
		}

	}

}
