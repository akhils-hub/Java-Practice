package org.number_programs;

public class Fibonacci_Series {
	
	public static void main(String[] args) {
		// Variable 'count' determines how many iterations the while loop will run.
		// Since we print two terms manually first, this will result in 8 terms total.
		int count = 5; 
		
		// n1 and n2 are the first two 'seeds' of the Fibonacci series.
		// n3 will be used to store the sum of the previous two numbers.
		int n1 = 0, n2 = 1, n3;
		
		// Print the first two terms manually as they are the starting point.
		System.out.print("Fibonacci Series are: " + n1 + " " + n2 + " ");
		
		// The loop continues as long as count is 0 or greater.
		while(count >= 0) {
			// Step 1: Calculate the next number by adding the two previous ones.
			n3 = n1 + n2;
			
			// Step 2: Print the newly calculated number.
			System.out.print(n3);
			
			// Step 3: adds a space after the number unless it's the very last iteration.
			if(count > 0) {
				System.out.print(" ");
			}
			
			// Step 4: Shift the values to the left to prepare for the next sum.
			// The old second number (n2) now becomes the first number (n1).
			n1 = n2;
			// The newly calculated sum (n3) becomes the second number (n2).
			n2 = n3;
			
			// Step 5: Decrease count by 1 to eventually exit the loop.
			count--;
		}	
	}
}

/**
 public class Practice {	
	public static void main(String[] args) {

      int count =5;
      int n1=0,n2=1,n3;
      
      System.out.print("Fibonacci Series are: " + n1 + " " + n2 + " ");
		
      for(int i=0;i<count;i++) {
    	  n3 = n1+n2;
    	  System.out.print(n3);
    	  if(i<count-1) {
    		  System.out.print(" ");
    	  }
    	  n1=n2;n2=n3;
      }
		
	}

}
 */


