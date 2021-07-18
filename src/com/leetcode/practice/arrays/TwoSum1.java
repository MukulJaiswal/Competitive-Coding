package com.leetcode.practice.arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Input: numbers = [2,7,11,15], target = 9 Output: [1,2]
 * 
 * @author Mukul
 *
 */
public class TwoSum1 {
	public static int[] twoSum(int[] numbers, int target) {

		int a[] = new int[2];
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] + numbers[j] == target) {
					a[0] = i;
					a[1] = j;
					return a;
				}
			}
		}
		throw new IllegalArgumentException("No match found");

	}

	// Using Hash Map. Complexity of O(n).
	public static int[] twoSum1(int[] numbers, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			int complement = target - numbers[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(numbers[i], i);
		}

		return null;

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
		int result1[] = twoSum1(a, target);
		for (int i : result1)
			System.out.println(i);
	}
}
