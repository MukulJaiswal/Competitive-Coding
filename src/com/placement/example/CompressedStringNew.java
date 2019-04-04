package com.placement.example;

import java.util.Scanner;

/**
 * Complexity O(n)
 * 
 * @author Mukul
 *
 */
public class CompressedStringNew {

	static int[] countFrequency(char a[]) {

		int b[] = new int[123];
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		char ch[] = s.toCharArray();

		int count[] = countFrequency(ch);

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.print((char) (i) + "" + count[i]);
			}
		}
	}
}
