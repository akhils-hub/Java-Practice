package org.number_programs;

public class Happy_Numbers {
	
	public static boolean isHappy(int n) {
		int sum=0;
		while(n>9) { // Continue as long as n is more than one digit
			while(n>0) {
				int rem = n%10;
				sum = sum + (rem*rem);
				n = n/10;
			}
			n = sum; // set n to new sum
			sum = 0; // Reset sum for each new iteration of outer loop
		}
		return n==1; // If n eventually becames 1, it's a happy number.
	}
	
	//A positive integer that eventually reaches 1 when replaced by the sum of the squares of its digits repeatedly.
public static void main(String[] args) {
	int start =0;
	int end = 100;
	for(int i=start;i<end;i++) {
		if(isHappy(i)) {
			System.out.println(i);
		}
	}
}

}
