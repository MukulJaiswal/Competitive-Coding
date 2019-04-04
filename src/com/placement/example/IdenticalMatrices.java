package com.placement.example;

import java.util.Scanner;

public class IdenticalMatrices {

	static int isIdentical(int a[][], int b[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] != b[i][j])
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
		System.out.println(a.length);

		int b[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };

		if (isIdentical(a, b) == 1)
			System.out.print("Matrices are identical");
		else
			System.out.print("Matrices are not identical");

	}

}
