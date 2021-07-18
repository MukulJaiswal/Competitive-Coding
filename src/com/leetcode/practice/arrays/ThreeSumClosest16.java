package com.leetcode.practice.arrays;

import java.util.Arrays;

public class ThreeSumClosest16 {
	public static int threeSumClosest(int[] nums, int target) {

		int result = nums[0] + nums[1] + nums[nums.length - 1];
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1; i++) {

			int f_pointer = i + 1;
			int l_pointer = nums.length - 1;

			while (f_pointer < l_pointer) {
				int currSum = nums[i] + nums[f_pointer] + nums[l_pointer];

				if (currSum < target) {
					f_pointer++;
				} else {
					l_pointer--;
				}

				if (Math.abs(target - currSum) < Math.abs(target - result)) {
					result = currSum;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int a[] = {1,1,-1,-1,3};//[-1, -1, 1, 1, 3]
		int target  = -1;
		int res  = threeSumClosest(a, target);
		System.out.println(res);
				
	}
}
