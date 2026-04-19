package org.problem_solving;



/*
 The water tank fills 10 liters per minute.
 at every 5 minutes, a leak removes 15 liters.
 
 Given T minutes, find the total water in the tank
 
 Input:
 Enter Time in minutes: 10
 
 Output:
 Water = 70 liters
 
 Explanation:
 10 minutes filling = 100 liters
 Liked twice =  30 liters
 Remaining = 70 liters
 
 */
public class The_Water_Tank_Problem {

	public static void main(String[] args) {
		int t = 10;
		int filled = t * 10;
		int leaks = t/5;
		int lost = leaks * 15;
		
		int remaining = filled - lost;
		
		System.out.println("Remaining Water in the Tank: " + remaining + " liters.");
		

	}

}
