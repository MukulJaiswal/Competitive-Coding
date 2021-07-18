package com.placement.example;

import java.util.*;

/**
 * https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/the-best-internet-browser-3/
 * 
 * @author Mukul
 *
 */
 class BestInternetBrowser {

	static boolean isVowel(char ch) {
		if ("aeiouAEIOU".indexOf(ch) != -1) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) throws Exception {

		try {
			Scanner sc = new Scanner(System.in);
			int tc, num = 0;
			tc = sc.nextInt();
			sc.nextLine();

			while (tc-- != 0) {
				String str = sc.nextLine();
				String s = str.substring(4, str.lastIndexOf("."));
				System.out.println(s);

				char ch[] = s.toCharArray();
				int count = 0;
				for (int i = 0; i < ch.length; i++) {
					if (isVowel(ch[i]) == false) {
						count += 1;
					}
				}
				num = count + 4;
				System.out.print(num + "/" + str.length());

			}
			

			BalancedParenthesis.isMatchingPair('a', 'b');
			

		} catch (Exception e) {

		}
	}
}
