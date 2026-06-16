package org.number_programs;

// GCD : Greatest Common Divisor
// LCM : Lowest Common Multiple
public class GCD_and_LCM {

	public static void main(String[] args) {

		int num1 = 12, num2 = 18;
		int gcd = 1;

		for(int i=1;i<num1 && i<num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd = i;
			}
		}

		int lcm = (num1 * num2)/gcd;

		System.out.println("Greatest Common Divisor: " + gcd);
		System.out.println("Lowest Common Multiple: " + lcm);

	}

}
