package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII90 {

	void dfs(List<List<Integer>> result, int index, int[] nums, List<Integer> current) {
		
		Arrays.sort(nums);
		result.add(new ArrayList<Integer>(current));
		
		for (int i = index; i < nums.length; i++) {
			current.add(nums[i]);

			if (!result.contains(current)) {
				dfs(result, i + 1, nums, current);
			}

			current.remove(current.size() - 1);
		}
	}

	public List<List<Integer>> subsetsWithDup(int[] nums) {

		List<Integer> current = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		dfs(result, 0, nums, current);
		return result;

	}
	
	public static void main(String[] args) {
		int nums[] = {1,2,2};
		SubsetII90 ob = new SubsetII90();
		System.out.println(ob.subsetsWithDup(nums));
	}
}
