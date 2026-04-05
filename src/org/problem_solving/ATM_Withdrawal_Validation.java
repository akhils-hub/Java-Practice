package org.problem_solving;

public class ATM_Withdrawal_Validation {

	public static void main(String[] args) {
	/*
	 CONDITIONS:
	 1. WithDrawal Amount must be multiple of 100
	 2. WithDrawal Amount must be greater than 0
	 3. Account balance greater than equals to withdrawal amount
	 4. Any rules fails, print exact reason.
	 */

		
	int a = 2000; //accountBalance
	int n = 500;//withdrawalAmount
	
	if(n<0 || n%100 !=0) {
		System.out.println("Invalid Amount!");
	}else if(n>a) {
		System.out.println("Insufficient Amount!");
	}else {
		int remainingAmount = a-n;
		System.out.println("Withdrawal Successful!. Remaining Account Balance: " + remainingAmount);
	}
	
	}

}
