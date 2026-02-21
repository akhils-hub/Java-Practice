package org.pattern_programs;

public class Butterfly_Pattern {

	public static void main(String[] args) {
		int row = 4;

		// 1. TOP HALF
		for(int i = 0; i < row; i++) {
			// Left Stars
			for(int j = 0; j <= i; j++) { System.out.print("*"); }

			// Middle Spaces (Combining the two space loops into one for clarity)
			for(int j = i; j < row - 1; j++) { System.out.print(" "); }
			for(int j = i; j < row - 1; j++) { System.out.print(" "); }

			// Right Stars
			for(int j = 0; j <= i; j++) { System.out.print("*"); }
			System.out.println();
		}

		// 2. BOTTOM HALF 
		// FIX: Start i at 1 to avoid repeating the 8-star middle line
		for(int i = 1; i < row; i++) {

			// Left Stars (Decreasing)
			for(int j = i; j < row; j++) { System.out.print("*"); }

			// Middle Spaces (Increasing)
			for(int j = 0; j < i; j++) { System.out.print(" "); }
			for(int j = 0; j < i; j++) { System.out.print(" "); }

			// Right Stars (Decreasing)
			for(int j = i; j < row; j++) { System.out.print("*"); }
			System.out.println();
		}
	}

}
