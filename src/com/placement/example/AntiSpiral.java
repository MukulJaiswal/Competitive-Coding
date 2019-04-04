package com.placement.example;
/**
 * @author Mukul
 *
 */
public class AntiSpiral {
	public static void main(String args[])
	{
		int n=5;
		int a[][] = new int[n][n];
		int x = 1, mid = n / 2;
		int r = mid - 1, c = mid - 1;

		if (n % 2 != 0)
			a[n / 2][n / 2] = x++;

		for (int i = 2; i <= n - 1; i += 2) {
			for (int j = 0; j < i; j++)
				a[r][c++] = x++;

			for (int j = 0; j < i; j++)
				a[r++][c] = x++;

			for (int j = 0; j < i; j++)
				a[r][c--] = x++;

			for (int j = 0; j < i; j++)
				a[r--][c] = x++;
			r--;
			c--;
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}