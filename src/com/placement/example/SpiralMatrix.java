package com.placement.example;

/**
 * Incorrect Output
 */
import java.util.Scanner;

public class SpiralMatrix {

	static void convertSpiral(int a[][]) {
		int m = a.length;
		int arr[] = new int[m * m];

		int r = 0, c = 0, p = 0;

		for (int j = m-1 ; j >= 0; j -= 2) {
			
			for (int i = 0; i < j ; i++)
				arr[p++] = a[r][c++];

			for (int i = 0; i < j ; i++)
				arr[p++] = a[r++][c];

			for (int i = 0; i < j ; i++)
				arr[p++] = a[r][c--];

			for (int i = 0; i < j ; i++)
				arr[p++] = a[r--][c];
			r++;
			c++;
		}
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[][] = { { 1, 2, 3, 4 }, 
					{ 5, 6, 7, 8 },
					{ 9, 10, 11, 12 },
					{ 13, 14, 15, 16 } };
		convertSpiral(a);

	}
}
