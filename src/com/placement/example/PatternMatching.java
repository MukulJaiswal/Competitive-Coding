package com.placement.example;

public class PatternMatching {
	public static void main(String[] args) {

		String s1 = "FINOITFINOIT";
		String s2 = "IT";

		int l1 = s1.length();
		int l2 = s2.length();
		int count = 0;

		String currString = "";

		for (int i = 0; i <= l1 - l2 ; i++) {
			for (int j = 0; j < l2; j++) {
				currString = currString + s1.charAt(i + j);
			}
			if (currString.equals(s2)) {
				count++;
			}
			currString  = "";
		}
		System.out.println(count);
	}
}
