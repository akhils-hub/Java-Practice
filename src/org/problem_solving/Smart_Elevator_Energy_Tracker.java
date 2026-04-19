package org.problem_solving;

import java.util.Scanner;

/*
 A Smart elevator in a corporate building tracks its movement for a day to analyze energy usage.
 
 Each movement is recorded as an integer.
 
 Positive value(+) >> Elevator moves up x floors
 Negative value(-) >> Elevator moves down x floors
 Zero(0) >> Door open/idle (No Movement)
 
 Elevator Rules:
 Elevator starts at floor F.
 The Building has floors from 0 to maxFloor.
 If the elevator tries to go below floor 0 or above maxFloor. it stops immediately.
 Every 2nd upward movement consumes extra 5 energy units.
 Downward movements do not consume extra energy.
 Zero movements are ignored for counting but still processed.
 
 Inout Format:
 
 F - Starting floor
 MaxFloor - Highest floor in the building
 N - Number of movements
 m1 m2 m3 -- mN >> N space separated integers
 
 Output Format:
 
 Final Floor: ?
 Up Moves: ?
 Dowm Moves: ?
 Energy Used: ?
 Elevator Status: Stopped / Completed
 
 Example Input:
 5
 20
 4
 3 -2 0 4
 */

public class Smart_Elevator_Energy_Tracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentFloor = 5;
		int maxFloor = 20;
		int n = 4; //Number of Movements
		int upcount = 0;
		int downcount = 0;
		int energy = 0;
		
		boolean stopped = false;
		
		for(int i=1;i<=4;i++) {
			System.out.println("Enter Floor to travel ?");
			int move = sc.nextInt();
			
			if (move == 0) {
				continue;
			}
			int nextFloor = currentFloor + move;
			
			if(nextFloor < 0  || nextFloor > maxFloor) {
				stopped = true;
				break;
			}
			if(move > 0) {
				upcount++;
				energy = energy + move;
				if(upcount % 2 == 0) {
					energy = energy + 5;
					
				}
			}else {
				downcount++;
				
			}
			
			currentFloor = nextFloor;
		}
		
		System.out.println("Final Fool: " + currentFloor);
		System.out.println("Up moves: " + upcount);
		System.out.println("Down moves: " + downcount);
		System.out.println("Energy Used: " + energy);
		
		if(stopped) {
			System.out.println("Elevator Status: Stopped!");
		}else {
			System.out.println("Elevator Status: Completed!");
		}
	}

}
