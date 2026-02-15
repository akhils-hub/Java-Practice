package org.number_programs;

public class Perfect_Number {
//A perfect number is a positive integer that is equal to the sum of its proper divisors.
	public static void main(String[] args) {
		int n = 6;
	    int sum = 0;
	    for(int i=1;i<n;i++) {
	    	if(n%i == 0) {
	    		sum = sum + i;
	    	}
	    }
	    
	    if (n == sum) {
	    	System.out.println(n + " is a Perfect Number!");
	    }else {
	    	System.out.println(n + " is not a Perfect Number!");
	    }
	}
}

/**

6  == Expected: true (1+2+3 =6)
28 == Expected: true (1+2+4+7+14 = 28)
496 == Expected: true (1+2+4+8+16+31+62+124+248 = 496)
12 == Expected: flase (1+2+3+4+6 = 16 != 12)
1  == Expected: false
0  == Expected: false

*/