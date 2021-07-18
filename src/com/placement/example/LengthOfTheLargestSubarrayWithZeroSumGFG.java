package com.placement.example;

import java.util.HashMap;

public class LengthOfTheLargestSubarrayWithZeroSumGFG {
	/**
	 * Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23}; Output: 5 Explanation: The
	 * longest sub-array with elements summing up-to 0 is {-2, 2, -8, 1, 7}
	 * 
	 * @param nums
	 * @return https://www.geeksforgeeks.org/find-the-largest-subarray-with-0-sum/
	 */
	public int lengthSubarray1(int nums[]) {

		int count = 0, maxCount = Integer.MIN_VALUE;
		int sum = 0;

		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		// 1, 0, 3
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (hmap.containsKey(sum)) {
				count = count + (i - hmap.get(sum));
				maxCount = Math.max(count, maxCount);
				count = 0;
			} else {
				hmap.put(nums[i], i);
			}
		}

		return maxCount == Integer.MIN_VALUE ? 0 : maxCount;
	}

	public int lengthSubarray(int nums[]) {

		int count = 0;
		int maxCount = Integer.MIN_VALUE, sum = 0;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i; j < nums.length; j++) {

				sum = sum + nums[j];
				count += 1;
				if (sum == 0) {
					if (count > maxCount) {
						maxCount = count;
					}
				}
			}
			sum = 0;
			count = 0;
		}
		return maxCount == Integer.MIN_VALUE ? 0 : maxCount;
	}

	public static void main(String[] args) {
		LengthOfTheLargestSubarrayWithZeroSumGFG ob = new LengthOfTheLargestSubarrayWithZeroSumGFG();
		int nums[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println(ob.lengthSubarray1(nums));
	}
}
