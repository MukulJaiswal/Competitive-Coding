package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 *  Input: candidates = [2,3,6,7], target = 7
	Output: [[2,2,3],[7]]
	Explanation:
	2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
	7 is a candidate, and 7 = 7.
	These are the only two combinations.
	
	
	Input: candidates = [2,3,5], target = 8
	Output: [[2,2,2,2],[2,3,3],[3,5]]
 */
public class CombinationSum39 {

	void dfs(List<List<Integer>> result, int index, int[] candidates, List<Integer> current, int target) {

		if (target < 0) {
			return;
		}
		if (target == 0) {
			result.add(new ArrayList<Integer>(current));
			return;
		}

		for (int i = index; i < candidates.length; i++) {
			current.add(candidates[i]);
			dfs(result, i, candidates, current, target - candidates[i]);
			current.remove(current.size() - 1);
		}
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		dfs(result, 0, candidates, list, target);
		return result;
	}

	public static void main(String[] args) {
		int candidates[] = { 2, 3, 6, 7 };
		int target = 7;
		CombinationSum39 ob = new CombinationSum39();
		System.out.println(ob.combinationSum(candidates, target));
	}
}









