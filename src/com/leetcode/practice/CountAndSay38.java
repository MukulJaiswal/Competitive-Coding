package com.leetcode.practice;

public class CountAndSay38 {
	// First one is set to "1", and we build using this
	public static void main(String[] args) {
		String result = "1";
		System.out.println(result);
		int n = 5;
		
		for (int i = 2; i <= n; i++) {

			// next is used to build the next one.
			StringBuffer next = new StringBuffer();

			// index is the one used to iterate over the characters in result (previous
			// value)
			int index = 0;
			int count = 1;

			while (index < result.length()) {

				// we write to next if it's the last character or the current character is not
				// equal to the next character
				if (index == result.length() - 1 || result.charAt(index) != result.charAt(index + 1)) {
					next.append(count).append(result.charAt(index));
					count = 1; 
				}

				// if current char is equal to next character just increment the counter
				else {
					count++;
				}
				index++;
			}

			result = next.toString();
			System.out.println(result);
		}
	}
}
