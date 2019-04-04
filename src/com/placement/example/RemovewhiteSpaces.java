package com.placement.example;

import java.util.Scanner;

public class RemovewhiteSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String word = "";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				count = 0;
				word = word + ch;
			} else {
				if (count == 0) {
					word = word + " ";
				}
				count = count + 1;
			}
		}
		System.out.println(word);

		
		//  This regex removes white spaces between the strings.
		//  \\s : Matches single whitespace character 
		// \\s+ :Matches more than one whitespace character.
		 
		String nameWithProperSpacing = str.replaceAll("\\s+", " ");
		System.out.println(nameWithProperSpacing);
	}
}
