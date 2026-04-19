package org.problem_solving;

import java.util.Scanner;

/*
A bus starts with 0 passengers

At each stop:

A people get in
B people get out
Given data for N Stops, Find the passengers left in the bus

Example:
Stop1: 10 in, 3 out
Stop2: 5 in, 2 out
Stop3: 3 in, 5 out

Output:

Passengers = 8
*/
public class The_Bus_Stop_Problem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int passengers = 0;
		
		System.out.println("Enter No.of Stops in the bus: ?");
		
		int stops = sc.nextInt();
		
		for(int i=1;i<=stops;i++) {
			
			System.out.println("Enter passengers are in at stop " + i);
			int passIn = sc.nextInt();
			System.out.println("Enter Passengers are out at stop " + i);
			int passOut = sc.nextInt();
			
			passengers = passengers + passIn - passOut;
		}
		
		System.out.println("Remaining Passengers in the bus: " + passengers);
		}
}
