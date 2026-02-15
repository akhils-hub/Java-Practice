package org.number_programs;

public class ArmStrong_Number {
	public static boolean isArmStrongNumber(int num) {
		boolean isArmStrongNumber = false;
		int digits = 0;
		int sum =0;
		int temp = num;
		while(temp != 0) {
			temp = temp/10;
			digits++;
		}
		System.out.println("Number of digits in a given number: "+digits);
		temp=num;
		while(temp !=0) {
			int rem = temp%10;
			sum = sum + (int) Math.pow(rem,digits); //Narrowing Casting == large data type to small data type.
			temp = temp/10;
		}
		
		if(sum == num) {
			isArmStrongNumber = true;
		}
		
		return isArmStrongNumber;
		
	}
	
	
	//ArmStrong Number
	// is a positive number that equals the sum of it's own digits, each raised to the power of the total number of digits in that number.
	public static void main(String[] args) {
		int num = 153;
		boolean armStrongNumber = isArmStrongNumber(num);
		System.out.println(num + " is a ArmStrong Number: " + armStrongNumber);
	}
}
