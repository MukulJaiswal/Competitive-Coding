package com.placement.example;

import java.util.Scanner;

/**
 * Complexity O(n)
 * 
 * @author Mukul
 *
 */
public class CompressedStringNew {

	static int[] countFrequency(char a[]) {

		int b[] = new int[123];
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		char ch[] = s.toCharArray();

		int count[] = countFrequency(ch);

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.print((char) (i) + "" + count[i]);
			}
		}
	}
}
//public class CompressedStringNew{
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		String s= sc.nextLine();
//		int a[] = new int[122];
//		for(int i=0;i<s.length();i++)
//		{
//			a[s.charAt(i)]++;	
//		}
//		
//		for(int i=0;i<122;i++) {
//			if(a[i] != 0) {
//				System.out.print((char)(i) + "" + a[i]);
//			}
//		}
//		
//	}
//}




