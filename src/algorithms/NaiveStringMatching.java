package algorithms;

import java.util.Scanner;

/**
 * 
 * @author Mukul
 * String Matching Algorithm
 */
public class NaiveStringMatching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		String pattern = sc.nextLine();
		int j;

		for (int i = 0; i < string.length(); i++) {
			for (j = 0; j < pattern.length(); j++) {
				if (pattern.charAt(j) != string.charAt(i + j)) {
					break;

				}
			}
			if (j == pattern.length())
				System.out.println("Pattern is found at : " + (i + 1));
		}
	}
}
