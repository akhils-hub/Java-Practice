package org.pattern_programs;

public class Right_Angle_Triangle_Pattern_Star {

	public static void main(String[] args) {
		int rows = 4; // Total number of lines to print

		// Outer loop handles the number of rows
		for (int i = 1; i <= rows; i++) {

			// Inner loop handles the number of stars in each row
			// It runs from 1 up to the current row number 'i'
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// Move to the next line after printing all stars for the row
			System.out.println();
		}
	}
}


/**
public static void main(String[] args) {

		int row =4;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++){
				if(i>=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

 */