package org.pattern_programs;

public class Pyramid_Pattern_Star {
public static void main(String[] args) {
        
        int row = 4;
        
        // Outer loop: Manages the vertical height (4 rows)
        for(int i = 0; i < row; i++) {
           
            // 1. Inner Loop for Spaces: 
            // Prints (row - i - 1) spaces to center the stars
            for(int j = i; j < row - 1; j++) {
                System.out.print(" ");
            }
            
            // 2. Inner Loop for Left Half:
            // Prints (i + 1) stars
            for(int j = 0; j <i; j++) {
                System.out.print("*");
            }
            
            // 3. Inner Loop for Right Half:
            // Prints 'i' stars (the side that completes the pyramid)
            for(int j = 0; j <=i; j++) {
            	 System.out.print("*");
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}



/*
1. The Space Loop (j=i; j<row-1; j++): Prints decreasing spaces to push the stars toward the center.
2. The First Star Loop (j=0; j<i; j++): Prints the left half of the pyramid .
3. The Second Star Loop (j=0; j<=i; j++): Prints the right half of the pyramid(including the middle column)

*/