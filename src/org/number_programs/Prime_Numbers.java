package org.number_programs;

public class Prime_Numbers {
	 public static void main(String[] args) {
			int start =0;
			int end = 20;
			
			for(int i=start;i<end;i++) {
				boolean isPrime = true;
				if(i>1) {
					for(int j=2;j<i;j++){
						if(i%j==0) {
							isPrime = false;
						}
					}
				}else {
					isPrime = false;
				}
				if(isPrime) {
					System.out.print(i + " ");
				}
			}
		}
}


/**
 //Method 2.
public class Practice {
	
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int i=2;i<n;i++) {
			if(n%i ==0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
		
	  public static void main(String[] args) {
		int start =2;
		int end = 20;
		
		for(int i=start;i<end;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}

*/