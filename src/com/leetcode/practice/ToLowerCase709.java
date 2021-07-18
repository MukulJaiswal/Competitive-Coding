package com.leetcode.practice;

import java.util.Scanner;

public class ToLowerCase709 {
	public static String toLowerCase(String str) {
		
		char ch[] = str.toCharArray();
		String lowerCase = "";
		for(int i=0;i<ch.length;i++) {
			if(ch[i] >=65 && ch[i] <= 90) {
				ch[i] = (char)(ch[i] + 32);
			}
			lowerCase = lowerCase + ch[i];
		}
		
		
		return lowerCase;
		
	
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		System.out.println(toLowerCase(s));
	}
}
