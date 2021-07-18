package com.leetcode.practice.arrays;

import java.util.Scanner;

/**
 * Input: numbers = [2,7,11,15], target = 9 Output: [1,2]
 * 
 * @author Mukul
 *
 */
public class TwoSum167 {

	public static int[] twoSum(int[] numbers, int target) {

		int a[] = new int[2];
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] + numbers[j] == target) {
					a[0] = i + 1;
					a[1] = j + 1;
				}
			}
		}

		return a;
	}

	/**
	 * Making an use of Two-pointer Solution.
	 */
	// Whenever array is sorted, always thinks of 2-pointer solution
	public static int[] twoSum2(int[] numbers, int target) {

		int a_pointer = 0;
		int b_pointer = numbers.length - 1;

		while (a_pointer <= b_pointer) {

			int sum = numbers[a_pointer] + numbers[b_pointer];

			if (sum > target) {
				b_pointer -= 1;
			} else if (sum < target) {
				a_pointer += 1;
			} else {
				return new int[] { a_pointer + 1, b_pointer + 1 };
			}

		}

		return new int[] {};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int a[] = new int[size];
		int b[] = { 1, 2 };
		int c[] = b;
		for (int i : c) {
			System.out.println();
		}

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();

		int result[] = twoSum(a, target);
		for (int i : result)
			System.out.println(i);

	}
}
