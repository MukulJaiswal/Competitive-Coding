package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: nums = [1,2,3] Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 
 * @author Mukul
 *
 */
public class Subset78 {
	
	void dfs(List<List<Integer>> result, int index, int[] nums, List<Integer> current) {
		
		result.add(new ArrayList<Integer>(current));
		for(int i = index ; i < nums.length  ; i++) {
			current.add(nums[i]);
			dfs(result, i+1, nums, current);
			current.remove(current.size() -1);
		}
	}
	public List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> result =  new ArrayList<List<Integer>>();
		List<Integer> current = new ArrayList<Integer>();
		
		dfs(result, 0, nums, current);
		return result;

	}
	
	public static void main(String[] args) {
		int nums[] = {1,2,3};
		Subset78 ob = new Subset78();
		System.out.println(ob.subsets(nums));
	}
}
