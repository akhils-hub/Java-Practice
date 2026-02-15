package org.number_programs;

public class Prime_Number {

	//A prime number is a natural number greater than 1 that has exactly two distinct factors: 1 and the number itself
	public static void main(String[] args) {
		
		int n = 13;
		boolean isPrime = true;
		
		//0,1 is not prime numbers
		//0 it does not fit the mathematical criteria used to define them  (Zero has an infinite number of factors)
		//1 is not a prime number because it only has one factor.
		
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(n + " is a Prime number!");
		}else {
			System.out.println(n + " is not a Prime number!");
		}
	}
}
