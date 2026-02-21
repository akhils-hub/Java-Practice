package org.pattern_programs;

public class Diamond_Pattern {

	public static void main(String[] args) {

		int row = 4;

		for(int i=0;i<row;i++) {

			for(int j=i;j<row-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for(int i=0;i<row;i++) {

			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<row;j++) {
				System.out.print("*");
			}
			for(int j=i;j<row-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}



/*

public class Practice {
	    public static void main(String[] args) {
	        int n = 4; // Rows in the top half (determines size)

	        // 1. TOP HALF (Regular Pyramid)
	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars: (2 * row - 1) gives odd number of stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // 2. BOTTOM HALF (Inverted Pyramid)
	        // We start from n-1 so we don't repeat the middle (widest) row
	        for (int i = n - 1; i >= 1; i--) {
	            // Print increasing spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Print decreasing stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}


 */
