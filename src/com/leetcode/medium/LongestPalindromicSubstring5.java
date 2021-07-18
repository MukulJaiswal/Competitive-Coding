package com.leetcode.medium;

/**
 * 01234 Input: s = "BABAD" Output: "bab" Note: "aba" is also a valid answer.
 * 
 * "ABBA" "racecar"
 */
public class LongestPalindromicSubstring5 {




	/**
	 * brute Force approach in which we are generating all the sub-string and then
	 * checking for palindrome. Generating all the sub-string just like generating
	 * all sub-arrays. Time Complexity : 0(n3) BABAD
	 */
	public static String longestPalindrome(String s) {

		String res = "";
		String result = "";
		for (int start = 0; start < s.length(); start++) {
			for (int end = start + 1; end <= s.length(); end++) {
				for (int i = start; i < end; i++) {
					res = res + s.charAt(i);
				}
				if (res.length() > result.length() && isPalindrome(res)) {
					result = res;
				}
				res = "";
			}
		}

		return result;
	}
	
	/**
	 * 
	 * Complexity - O(n2) Two pointer approach
	 */

	static boolean isPalindrome(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		if (s.equals(sb.toString())) {
			return true;
		}
		return false;
	}

	static int longestPalSubstr(String str) {
		// The result (length of LPS)
		int maxLength = 1;

		int start = 0;
		int len = str.length();

		int low, high;

		// One by one consider every
		// character as center
		// point of even and length
		// palindromes
		for (int i = 1; i < len; i++) {// DABABA
			// Find the longest even
			// length palindrome with
			// center points as i-1 and i.
			low = i - 1;
			high = i;
			while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}

			// Find the longest odd length
			// palindrome with center point as i
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}
		}

		System.out.print("Longest palindrome substring is: ");
		System.out.println(str.substring(start, start + maxLength));

		return maxLength;
	}

	static String longestPallindromicBSubString(String s) {

		int high = 0;
		int low = 0;
		int maxLength = 1;
		int n = s.length();
		int start = 0;

		for (int i = 1; i < s.length(); i++) {

			// Logic for even length substring
			low = i - 1;
			high = i;
			while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
				int currLength = high - low + 1;

				if (currLength > maxLength) {
					maxLength = currLength;
					start = low;
				}
				low--;
				high++;
			}

			// Logic for odd length substring
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
				int currLength = high - low + 1;
				if (currLength > maxLength) {
					maxLength = currLength;
					start = low;
				}
				low--;
				high++;
			}
		}

		System.out.println("Length of longest pallindromic substring is  : " + maxLength);

		return s.substring(start, start + maxLength);
	}

	public static void main(String[] args) {
		LongestPalindromicSubstring5 ob = new LongestPalindromicSubstring5();
		String str = "DABABA";
//		System.out.println(ob.longestPalindrome1(str));
//		System.out.println(isPalindrome(str));

		System.out.println(longestPallindromicBSubString(str));
	}
}
