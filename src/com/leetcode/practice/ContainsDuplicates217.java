package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicates217 {

	public static boolean containsDuplicateNegative(int[] nums) {

		boolean result = false;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}

		return result;

	}

	public static boolean containsDuplicatesHashSet(int[] nums) {
		
		Set<Integer> sets = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(sets.contains(nums[i])) {
				return true;
			}
			sets.add(nums[i]);
		}
		return false;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		if (containsDuplicatesHashSet(a)) {
			System.out.println("true");
		}

		if (containsDuplicateNegative(a)) {
			System.out.println("true");
		} else
			System.out.println("false");

	}
}
