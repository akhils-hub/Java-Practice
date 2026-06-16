package org.java;

import java.util.Scanner;

// The Bus Stop Probleml

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
public class Practice {

	  public static void main(String[] args) {
		   
		    int[] a = {10,20,30,40,50,60,70,80,90};
		    int first = 0;
		    int last = a.length-1;
		    
		    int target = 60;
		    int index = 0;
		    
		    while(first<=last){
		        int mid = (first+last)/2;
		        if(a[mid] == target){
		            index = mid;
		            break;
		        }else if(target > a[mid]){
		            first = mid+1;
		        }else{
		            last = mid-1;
		        }
		    }
		    
		    System.out.println("target found at: " + index);
		   
		    }}
