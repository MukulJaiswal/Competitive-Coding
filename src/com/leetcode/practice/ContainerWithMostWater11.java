package com.leetcode.practice;

public class ContainerWithMostWater11 {
	public static int maxArea(int[] height) {

		int max = Integer.MIN_VALUE;
		int aPointer = 0;
		int bPointer = height.length - 1;

		while (aPointer < bPointer) {
			int min = Math.min(height[aPointer], height[bPointer]);
			max = Math.max(max, min * (bPointer - aPointer));

			if (height[aPointer] < height[bPointer]) {
				aPointer++;
			} else {
				bPointer--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 8
		int a[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int max = maxArea(a);
		System.out.println(max);
	}
}
