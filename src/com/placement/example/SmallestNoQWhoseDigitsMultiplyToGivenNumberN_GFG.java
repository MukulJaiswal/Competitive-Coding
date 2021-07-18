package com.placement.example;

import java.util.ArrayList;

/**
 * https://www.geeksforgeeks.org/find-smallest-number-whose-digits-multiply-given-number-n/
 * 
 * @author Mukul Input: n = 36 Output: p = 49 // Note that 4*9 = 36 and 49 is
 *         the smallest such number
 */
public class SmallestNoQWhoseDigitsMultiplyToGivenNumberN_GFG {

	public static void main(String[] args) {
		int num = 100;
		ArrayList<Integer> res = new ArrayList<Integer>();

		if (num < 9) {
			System.out.println((num + 10));
			return;
		}

		for (int i = 9; i > 1; i--) {
			
			while (num % i == 0) {
				res.add(i);
				num = num /i;
			}
		}
		
		if(num > 10 ) {
			System.out.println("Not Possible");
		}
		
		String resFinal = "";
		for (int i = res.size() -1 ; i >= 0 ; i--) {
			resFinal = resFinal + res.get(i);
		}
		System.out.println(resFinal);
	}
}
