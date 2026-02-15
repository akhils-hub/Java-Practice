package org.number_programs;

public class Happy_Number {
    //A positive integer that eventually reaches 1 when replaced by the sum of the squares of its digits repeatedly.
	public static void main(String[] args) {
		int num =19;
		int n =num;
		int sum=0;
		while(n>9) {
			while(n>0) {
				int rem = n%10;
				sum = sum + (rem*rem);
				n = n/10;
			}
			n=sum;
			sum=0;
		}
		
		if(n==1) {
			System.out.println(num  + " is a Happy Number");
		} else {
			System.out.println(num + " is not a Happy Number!");
		}
	}
}
