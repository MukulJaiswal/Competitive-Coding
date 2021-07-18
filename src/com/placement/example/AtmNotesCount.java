package com.placement.example;

import java.util.Scanner;

/**
 * https://www.geeksforgeeks.org/find-number-currency-notes-sum-upto-given-amount/
 * 
 * @author Mukul
 *
 */
public class AtmNotesCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		AtmNotesCount lAtmNotesCount = new AtmNotesCount();
		lAtmNotesCount.count(amount);
	}

	// 5452
	protected void count(int amt) {

		int notes[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
		int count[] = new int[9];

		for (int i = 0; i < 9; i++) {
			if (amt >= notes[i]) {
				count[i] = amt / notes[i];
				amt = amt - notes[i] * count[i];
			}
		}
		for (int i = 0; i < 9; i++) {
			if (count[i] != 0) {
				System.out.println(notes[i] + " : " + count[i]);
			}
		}
	}
}
