package com.placement.example;

import java.util.Scanner;

/**
 * https://www.geeksforgeeks.org/reverse-words-in-a-given-string/
 * 
 */
//geeks quiz practice code
//code practice quiz geeks

//Given an array of strings : { “Sdjksajd”, “Skjdasjj”, “Bjsdakja”, “Xhudhau”, “Eeeeggg”, “Chrome”}
//ABC - ABC ACB BAC BCA CBA CAB
public class ReverseStringAtOwnPlace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

	}

	void reverseString(String s) {
		String str[] = s.split(" ");

		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}

	void BubbleSortString() {
		String s[] = { "Sdjksajd", "Skjdasjj", "Bjsdakja", "Xhudhau", "Eeeeggg", "Chrome" };
		String temp = "";

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length - i - 1; j++) {
				if (s[j].compareTo(s[j + 1]) >= 0) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
}
