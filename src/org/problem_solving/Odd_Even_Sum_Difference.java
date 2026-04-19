package org.problem_solving;


/*
 Given a number N
 Find: Sum of even place digits, Sum of odd place digits
 Return: EvenSum - OddSum
 Example:
 input: 132431
 Output: 2
 */
public class Odd_Even_Sum_Difference {

	public static void main(String[] args) {
		int n = 132431;
		int rev = 0;
		
		while(n != 0) {
			int digit = n%10;
			rev  = rev * 10 + digit;
			n = n/10;
		}
		
		//System.out.println(rev);
		int evenSum = 0;
		int oddSum = 0;
		int position = 1;
		while(rev != 0) {
			int digit = rev %10;
			if(position%2 == 0) {
				evenSum = evenSum + digit;
			}else {
				oddSum = oddSum + digit;
			}
			rev = rev /10;
			position++;
		}
		System.out.print("EvenSum and OddSum Difference: ");
		System.out.print(evenSum-oddSum);

	}

}
