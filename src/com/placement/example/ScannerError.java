package com.placement.example;

import java.util.Scanner;

public class ScannerError {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/**
		 * If we want to scan string after integer, then use sc.nextLine() extra after nextInt()
		 * the problem do not occur with sc.next() function.
		 */
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int m = sc.nextInt();

		System.out.println(n);
		System.out.println(s);
		System.out.println(m);

	}
}
