package com.placement.example;

import java.util.Scanner;
/**
 * Replace all occurrences of string AB with C without using extra space
 * @author Mukul
 *
 */
public class ReplaceOccurences {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char str[] = s.toCharArray();
		int j;
		for (int i = 1; i < str.length; i++) {
			if (str[i - 1] == 'A' && str[i] == 'B') {
				str[i - 1] = 'C';
				for ( j = i; j < str.length - 1; j++) {
					str[j] = str[j + 1];
				}
				str[j] = ' ';
			}

		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	}
}
