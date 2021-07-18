package com.placement.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayUsingSet {
	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 2, 8, 10, 5, 2, 2, 1 };

		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int i : arr) {
			set.add(i);
		}

		for (int i : set) {
			System.out.print(i + " ");
		}
	}

}
