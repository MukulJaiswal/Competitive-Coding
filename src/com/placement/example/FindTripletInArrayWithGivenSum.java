package com.placement.example;

import java.util.HashMap;

/**
 * {12,3,4,1,6,9};
 * 
 * @author Mukul
 *
 *         {12,3,4,1,6,9} N=24 Output :: {12, 3, 9} -> 12 + 3 + 9 =24
 *
 */
public class FindTripletInArrayWithGivenSum {

	static boolean find3Numbers(int A[], int arr_size, int target) {
		
// Fix the first element as A[i] 
		for (int i = 0; i < arr_size - 2; i++) {

			// Find pair in subarray A[i+1..n-1] 
			// with sum equal to sum - A[i] 
			HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();
			int curr_sum = target - A[i];
			for (int j = i + 1; j < arr_size; j++) {
				if (s.containsKey(curr_sum - A[j])) {
					System.out.printf("Triplet is %d,   %d, %d", A[i], A[j], curr_sum - A[j]);
					return true;
				}
				s.put(A[j], 0);
			}
		}

// If we reach here, then no triplet was found 
		return false;
	}

	public static void main(String[] args) {

		int a[] = { 12, 3, 4, 1, 6, 9 };
		int N = 24;
		int sum = 0;
		int i, j, k;

		end: for (i = 0; i < a.length; i++) {

			for (j = i + 1; j < a.length; j++) {

				for (k = j + 1; k < a.length; k++) {
					
					System.out.println(a[i] + " " + a[j] + " " + a[k]);
					if (a[i] + a[j] + a[k] == N) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						break end; // return can also be used. break is used just for learning.
					}
				}
			}
		}
		System.out.println(find3Numbers(a, a.length, N));
		
	}
}
