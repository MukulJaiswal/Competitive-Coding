package com.placement.example;

import java.util.Scanner;

public class Permutation {

	/**
	 * Swap Characters at position
	 * 
	 * @param a string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	static String swap(String s, int l, int r) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char charArray[] = s.toCharArray();
			char temp = charArray[l];
			charArray[l] = charArray[r];
			charArray[r] = temp;
			str = new String(charArray);
		}
		return str;
	}

	/**
	 * permutation function
	 * 
	 * @param str string to calculate permutation for
	 * @param l   starting index
	 * @param r   end index
	 */

	static void permute(String s, int l, int r) {
		if (l == r)
			System.out.println(s);
		for (int i = l; i <= r; i++) {
			s = swap(s, l, i);
			permute(s, l + 1, r);
			s = swap(s, l, i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		permute(s, 0, s.length() - 1);
	}
}
