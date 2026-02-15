package org.number_programs;

public class ArmStrong_Numbers {
	public static boolean isArmStrongNumber(int num) {
		int digits = 0;
		int sum =0;
		int temp = num;

		//Handle the case for n == 0 separately
		if(num ==0) {
			return true; // 0 is considered an Armstrong number of any order
		}

		while(temp != 0) {
			temp = temp/10;
			digits++;
		}
		//System.out.println("Number of digits in a given number: "+digits);
		temp=num;
		while(temp !=0) {
			int rem = temp%10;
			sum = sum + (int) Math.pow(rem,digits);
			temp = temp/10;
		}

		return sum == num;

	}


	//ArmStrong Number
	// is a positive number that equals the sum of it's own digits, each raised to the power of the total number of digits in that number.
	public static void main(String[] args) {

        System.out.println("ArmStrong Numbers from 10 to 1000 are:");
		for(int i=10;i<1000;i++) {
			if(isArmStrongNumber(i)) {
				System.out.println(i);
			}
		}
	}

}
