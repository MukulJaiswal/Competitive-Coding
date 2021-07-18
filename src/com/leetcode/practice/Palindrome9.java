package com.leetcode.practice;

public class Palindrome9 {
	public boolean isPalindrome(int x) {
		int number = x;
		int rev = 0;

		if (Integer.toString(x).charAt(0) != '-') {

			while (x != 0) {
				int rem = x % 10;
				rev = rev * 10 + rem;
				x = x / 10;
			}
			if (number == rev)
				return true;
		}
		return false;
	}
}
