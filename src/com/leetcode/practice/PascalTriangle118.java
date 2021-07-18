package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class PascalTriangle118 {
	public static List<List<Integer>> generate(int numRows) {

		List<Integer> lastRow = new ArrayList<Integer>();
		List<List<Integer>> finalList = new ArrayList();

		if (numRows == 0)
			return finalList;

		lastRow.add(1);
		finalList.add(lastRow);

		for (int i = 1; i < numRows; i++) {

			List<Integer> newRow = new ArrayList<Integer>();

			newRow.add(1);

			// New row is calculated with the help of lastRow.
			for (int j = 0; j < lastRow.size() - 1; j++) {
				newRow.add(lastRow.get(j) + lastRow.get(j + 1));
			}
			
			newRow.add(1);
			finalList.add(newRow);
			lastRow = newRow;
		}

		return finalList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numRows = sc.nextInt();
		List<List<Integer>> list = generate(numRows);

		System.out.print(list);
		System.out.println();

	}
}