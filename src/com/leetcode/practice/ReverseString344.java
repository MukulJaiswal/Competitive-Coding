package com.leetcode.practice;

public class ReverseString344 {

	// Without using another array.
	public static void reverseString(char[] s) {
		char temp = ' ';
		for (int i = 0; i < s.length / 2; i++) {

			temp = s[i];
			s[i] = s[s.length - i - 1];
			s[s.length - i - 1] = temp;
		}
		System.out.println(String.valueOf(s));
	}

	public static void main(String[] args) {
		String str = "hello";
		reverseString(str.toCharArray());
	}
}
