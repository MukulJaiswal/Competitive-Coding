package com.leetcode.practice;

import java.util.Scanner;

public class ReverseInteger7 {

	public static int reverse(int x) {

		long rev = 0;
		boolean flag = false;
		if (x < 0) {
			x = x * -1;
			flag = true;
		}	
		while (x != 0) {
			rev = rev * 10 + x % 10;
			x = x / 10;

			if (rev > Integer.MAX_VALUE)
				return 0;

		}
		rev = flag ? rev * -1 : rev;
		return (int) rev;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ret = reverse(n);

		System.out.print(ret);
	}

}
