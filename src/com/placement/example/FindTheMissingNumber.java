package com.placement.example;

// Java program to find missing Number
import java.util.ArrayList;
import java.util.List;

class FindTheMissingNumber {

	public static int findDisappearedNumbers(int[] nums) {

		int n = nums.length;
		int size = (n * (n + 1)) / 2;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}

		return (sum - size);
	}

	// a represents the array
	// n : Number of elements in array a
	static int getMissingNo(int a[], int n) {
		int total = 1;
		for (int i = 2; i <= (n + 1); i++) {
			total += i;
			total -= a[i - 2];
		}
		return total;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 7, 8 };
//		System.out.println(findDisappearedNumbers(a));
		System.out.println(getMissingNo(a, a.length));
	}
}