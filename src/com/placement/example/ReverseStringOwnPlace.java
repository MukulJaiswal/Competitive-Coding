package com.placement.example;

import java.util.Scanner;

public class ReverseStringOwnPlace {
	static String reverse(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str[] = s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			str[i] = reverse(str[i]);
		}
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i] + " ");
		}

	}
}
