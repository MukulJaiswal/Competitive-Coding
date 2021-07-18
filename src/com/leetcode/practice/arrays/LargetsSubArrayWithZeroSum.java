package com.leetcode.practice.arrays;

import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1#
public class LargetsSubArrayWithZeroSum {

	static int maxLen(int arr[], int n) {
		
		// We wil be storing a sum in hAshmap and its index along with it.
		
		// HashMap<Sum, Index> and (i - hmap.get(sum) ) will give the length of the
		// subarray
		
		HashMap<Integer, Integer> hmap = new HashMap();
		int sum = 0;
		int maxSum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];

			if (sum == 0) {
				maxSum = i + 1;
			} else {
				if (hmap.containsKey(sum)) {
					maxSum = Math.max(maxSum, i - hmap.get(sum));
				} else {
					hmap.put(sum, i);
				}
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {

		int A[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int n = 8;
		System.out.println(maxLen(A, n));
	}
}
