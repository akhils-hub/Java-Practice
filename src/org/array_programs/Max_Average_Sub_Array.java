package org.array_programs;

public class Max_Average_Sub_Array {
	public static void main(String[] args) {
		int[] a = {1, 12, -5, -6, 50, 3};
		int k = 4;

		double sum = 0;
		// Step 1: Initial window sum
		for (int i = 0; i < k; i++) {
			sum += a[i];
		}

		double maxSum = sum;

		// Step 2: Slide the window
		for (int i = k; i < a.length; i++) {
			sum = sum + a[i] - a[i - k];
			maxSum = Math.max(maxSum, sum);
		}

		System.out.println(maxSum);

		// Step 3: Average is the maxSum divided by k
		System.out.println("Maximum Average: " + (maxSum / k));
	}
}
