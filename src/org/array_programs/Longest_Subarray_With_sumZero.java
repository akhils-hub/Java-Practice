package org.array_programs;

import java.util.LinkedHashMap;

public class Longest_Subarray_With_sumZero {

	public static int longestSubArray(int[] a) {
		int sum = 0;
		int maxLen = 0;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < a.length; i++) {
			sum += a[i];

			// If the running sum itself is 0, the subarray starts from index 0
			if (sum == 0) {
				maxLen = i + 1;
			}

			if (map.containsKey(sum)) {
				int length = i - map.get(sum);

				maxLen = Math.max(maxLen, length);
			} else {
				map.put(sum, i);
			}

		}
		return maxLen;
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 9, -3, 3, -1, 6, -5 };
		System.out.println(longestSubArray(a));
	}

}
