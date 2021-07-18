package com.leetcode.practice;

import java.util.Arrays;

public class TwoSumLessThanK1099 {
	/**
	 * Pair with largest sum which is less than K in the array
	 * 
	 * @param A
	 * @param K
	 * @return
	 * 
	 * 	int A[] = { 34,23,1,24,75,33,54,8 };
		int K = 60;
		
	 * A= [1, 8, 23, 24, 33, 34, 54, 75]
	 */
	public int twoSumLessThanK(int A[], int K) {

		Arrays.sort(A);

		int left = 0;
		int right = A.length - 1;
		int maxSum = Integer.MIN_VALUE, sum = 0;

		while (left <= right) {
			sum = A[left] + A[right];

			if (sum > maxSum && sum < K) {
				maxSum = sum;
			} else if (sum >= K) {
				right--;
			} else {
				left++;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int A[] = { 34,23,1,24,75,33,54,8 };
		int K = 60;
		TwoSumLessThanK1099 ob = new TwoSumLessThanK1099();

		System.out.println(ob.twoSumLessThanK(A, K));
	}
}









