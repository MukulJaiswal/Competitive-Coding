package com.placement.example;

/**
 * 
 * @author Mukul
 *
 */
public class CountFreqOfVowels {
	public static void main(String[] args) {

		String s = "Hello i am mmmukul";

		// Calculates Number of Words
		String str[] = s.split(" ");
		System.out.println("Number of Words : " + str.length);
		
		int count = 0;
		int n = 0;
		int max = -1;
		char character = ' ';

		// Calculates number of vowels.
		for (int i = 0; i < s.length(); i++) {
			if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
				count++;
			}
		}
		System.out.println("Number of vowels : " + count);

		// Count frequency of all characters.
		int freq[] = new int[256];
		int freq1[] = new int[256];

		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)]++;

		}

		for (int i = 1; i < 256; i++) {

			if (freq[i] != 0 && (char) i != ' ') {
				System.out.println((char) i + " -> " + freq[i]);
			}
		}

		// Count frequency of vowels.

		for (int i = 0; i < s.length(); i++) {
			if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
				freq1[s.charAt(i)]++;
			}
		}
		System.out.println("Vowels frequency");
		for (int i = 1; i < 256; i++) {

			if (freq1[i] != 0 && (char) i != ' ') {
				System.out.println((char) i + " -> " + freq1[i]);
			}
		}

		// Find maximum occurring of character in a String.
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i)] > max && s.charAt(i) != ' ') {
				max = freq[s.charAt(i)];
				character = s.charAt(i);
			}
		}
		System.out.println("Max Frequency : " + character);

	}

}
