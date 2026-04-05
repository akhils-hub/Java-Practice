package org.problem_solving;

public class Electricity_Bill_Calculation {

	public static void main(String[] args) {
		/*
		 CONDITIONS:
		 1. First 100 units the charge is $1 per unit.
		 2. Next 100 units (101 to 200) the charge is $2 per unit
		 3. Any unit above 200 the charge is $3 per unit.
		 */

		int units = 250;
		int bill =0;
		if(units <=100) {
			bill = units*1;
		}else if(units > 100 && units <=200) {
			bill = (100*1) + (units-100)*2;
		}else {
			bill = (100*1) + (100*2) + (units-200)*3;
		}
		
		System.out.println("Electricity Bill: " + bill);
	}

}
