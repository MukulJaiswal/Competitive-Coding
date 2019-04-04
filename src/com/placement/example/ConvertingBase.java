package com.placement.example;

public class ConvertingBase {
	public static void main(String[] args) {

		/** By using Library */
		int a = 10;
		String decimalBinary = Integer.toBinaryString(a);
		System.out.println(decimalBinary);

		/** By using Library */
		String binaryNumber = "1010";
		int c = Integer.parseInt(binaryNumber, 2);
		System.out.println(c);

		/** Decimal to binary */
		String num = "";
		while (a != 0) {
			int r = a % 2;
			num = r + num;
			a = a / 2;
		}
		System.out.println(num);

		/** binary to decimal. */
		int binNum = 1010;
		int decimalNum = 0;
		int p = 0;
		while (binNum != 0) {
			int rem = binNum % 10;
			decimalNum = decimalNum + rem * (int) Math.pow(2, p++);
			binNum = binNum / 10;
		}
		System.out.println(decimalNum);
	}

}
