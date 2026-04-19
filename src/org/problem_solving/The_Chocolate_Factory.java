package org.problem_solving;


/*
 A Chocolate Factory packs chocolates in boxes.
 Each box can hold 10 chocalates.
 
 Ravi Produced N chocolates in a day.
 
 Task:
 Write a program to find:
 
 Number of full boxes ?
 Number of remaining chocolates ?
 
 Input:
  Produced Chocolates (N)= 57
  
  Number of full boxes = 5;
  Number of remainging chocolates = 7
 
 */

public class The_Chocolate_Factory {

	public static void main(String[] args) {
		
		int n = 57;
		
		int boxes = n/10;
		int remainingChocolates = n%10;
		
		System.out.println("Number of full boxes: " + boxes);
		System.out.println("Number of remainging chocolates: " + remainingChocolates);
		
	}

}
