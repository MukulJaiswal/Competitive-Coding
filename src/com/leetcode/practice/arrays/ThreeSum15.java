package com.leetcode.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum15 {

	public List<List<Integer>> threeSum(int[] nums) {

		int n = nums.length;
		if (n < 3) {
			return new ArrayList<List<Integer>>();
		}

		Set<List<Integer>> set = new HashSet();
		Arrays.sort(nums);

		for (int i = 0; i < n - 2; i++) {
			int fpointer = i + 1;
			int lpointer = n - 1;

			while (fpointer < lpointer) {
				int sum = nums[i] + nums[fpointer] + nums[lpointer];

				if (sum == 0) {
					set.add(Arrays.asList(nums[i], nums[fpointer], nums[lpointer]));
					// moving the pointer inorder to find the other triplet.
					fpointer++;
					lpointer--;
				} else if (sum > 0) {
					lpointer--;
				} else {
					fpointer++;
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

	public static void main(String[] args) {
//		https://leetcode.com/problems/3sum/
	}
}










