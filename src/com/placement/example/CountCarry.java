package com.placement.example;

import java.util.Scanner;

/**
 * 
 * @author Mukul
 *
 */
public class CountCarry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int n = sc.nextInt();
			while (n-- != 0) {
				long n1 = sc.nextLong();
				long n2 = sc.nextLong();
				int count = 0;
				boolean flag = false;
				long sum = 0;

				while (n1 != 0 || n2 != 0) {
					long r1 = n1 % 10;
					long r2 = n2 % 10;

					if (flag == false)
						sum = r1 + r2;
					else {
						sum = r1 + r2 + 1;
						flag = false;
					}

					if (sum > 9) {
						flag = true;
						count = count + 1;
					}
					n1 = n1 / 10;
					n2 = n2 / 10;
				}
				if (count == 0)
					System.out.println("No carry operation");
				else if (count == 1)
					System.out.println("1 carry operation");
				else
					System.out.println(count + " carry operations");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/**
 * 555 454 : 2 carry operations
 * 
 * 
 * 
 */
