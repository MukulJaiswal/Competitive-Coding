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

			for (int i = 0; i < arr.length; i++)
				System.out.println(arr[i]);
			r++;
			c++;
		}
		System.out.println(arr.length);

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
