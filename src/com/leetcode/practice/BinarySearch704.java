package com.leetcode.practice;

public class BinarySearch704 {
	public int search(int[] nums, int target) {

		int mid = 0;
		int start = 0;
		int end = nums.length-1;

		while (start <= end) {
			mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
