package com.leetcode.medium;

public class DiagonalTraverse498 {

	public int[] findDiagonalOrder(int[][] matrix) {

		if (matrix.length == 0) {
			return new int[0];
		}

		int m = matrix.length;// length of row
		int n = matrix[0].length;// length of column

		int[] result = new int[m * n];
		int r = 0, c = 0;

		for (int i = 0; i < result.length; i++) {
			result[i] = matrix[r][c];

			if ((r + c) % 2 == 0) {

				if (c == n - 1) {
					r++;
				} else if (r == 0) {
					c++;
				} else {
					r--;
					c++;
				}

			} else {

				if (r == m - 1) {
					c++;
				} else if (c == 0) {
					r++;
				} else {
					r++;
					c--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		DiagonalTraverse498 ob = new DiagonalTraverse498();
		int result[] = ob.findDiagonalOrder(matrix);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
