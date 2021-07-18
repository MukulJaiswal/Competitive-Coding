package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SubarrayProductLessThanK713 {

	/**
	 * Sliding window approach 
	 * @param nums
	 * @param k
	 * @return
	 */
	public int numSubarrayProductLessThanK1(int[] nums, int k) {

		if (k <= 1)
			return 0;
		int prod = 1, ans = 0, left = 0;
		for (int right = 0; right < nums.length; right++) {
			prod *= nums[right];
			while (prod >= k) {
				prod /= nums[left++];
			}
			/**
			 * If we start at the 0th index, [10,5,2,6], the number of intervals is obviously 1.
If we move to the 1st index, the window is now [10,5,2,6]. The new intervals created are [5] and [10,5], so we add 2.
Now, expand the window to the 2nd index: [10,5,2,6]. The new intervals are [2], [5,2], and [10,5,2], so we add 3.
			 */
			//This gives the total number of subarray generated
			ans += right - left + 1;
		}
		return ans;
	}

	/**
	 * Input: nums = [10, 5, 2, 6], k = 100 Output: 8 Explanation: The 8 subarrays
	 * that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2],
	 * [2, 6], [5, 2, 6]. Note that [10, 5, 2] is not included as the product of 100
	 * is not strictly less than k.
	 * 
	 * @param nums
	 * @param k
	 * @return
	 * 
	 *         [1,2,3] 0 [1,1,1] 1 [10,9,10,4,3,8,3,3,6,2,10,10,9,3] 19
	 * 
	 *         Below approach gives TLE in Leetcode.
	 */
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k == 0 || k == 1)
			return 0;

		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		long product = 1;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			product = 1;
			list.clear();
			for (int j = i; j < nums.length; j++) {
				product = product * nums[j];
				list.add(nums[j]);
				if (product < k) {
					count = count + 1;
					result.add(new ArrayList<Integer>(list));
				} else {
					break;
				}
			}
		}
		System.out.println(result);
		return count;

	}

	public static void main(String[] args) {
		SubarrayProductLessThanK713 ob = new SubarrayProductLessThanK713();
		int nums[] = {10, 5, 2, 6 };
		int k = 100;
		System.out.println(ob.numSubarrayProductLessThanK1(nums, k));
	}

}
