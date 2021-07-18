package com.leetcode.practice.arrays;

import java.util.HashMap;

public class SubArraySumDivisibleByK974 {

	public int subarraysDivByK(int[] nums, int k) {

		int sum = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				if (sum % k == 0) {
					count++;
				}
			}
			sum = 0;
		}
		return count;
	}

	public int subarraysDivByK_New(int[] nums, int k) {

		// HashMap<Sum , Remainder>
		// If remainder repeats itself then sum is divisible by k
		HashMap<Integer, Integer> hmap = new HashMap();

		int sum = 0;
		int rem = 0;
		int count = 0;

		hmap.put(0, 1);

		for (int i = 0; i < nums.length; i++) {

			sum = sum + nums[i];
			rem = sum % k;

			if (rem < 0) {
				rem = rem + k;
			}

			if (hmap.containsKey(rem)) {
				count = count + hmap.get(rem);
				hmap.put(rem, hmap.get(rem) + 1);
			} else {
				hmap.put(rem, 1);
			}
		}
		System.out.println(hmap);
		return count;
	}

	public static void main(String[] args) {

	}

}
