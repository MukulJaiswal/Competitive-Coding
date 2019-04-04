package com.placement.example;

public class BoundarySort

{
	static void sort(int a[]) {
		int n = a.length, tmp = 0;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {

					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
	}

	public static void main(String args[]) {

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int m = a.length, n = a[0].length;
		int z = n * 2 + (m - 2) * 2;
		int b[] = new int[z], p = 0;
		int r = 0, c = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
					b[p++] = a[i][j];
				System.out.print(a[i][j] + "\t");

			}
			System.out.println();

		}
		sort(b);
		p = 0;
		for (int i = 0; i < n - 1; i++)
			a[r][c++] = b[p++];
		for (int i = 0; i < m - 1; i++)
			a[r++][c] = b[p++];
		for (int i = 0; i < n - 1; i++)
			a[r][c--] = b[p++];
		for (int i = 0; i < m - 1; i++)
			a[r--][c] = b[p++];
		System.out.println("matrix after sorting-----------");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
