package com.leetcode.practice;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class FirstBadVersion {
	public int firstBadVersion(int n) {

		int start = 1, end = n;
		int mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;   //New way to find mid of array. It number is very
												//large then it will overflow Integer.MAX_VALU
			if (isBadVersion(mid)) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
