package com.recursion;

public class Print1toN {
	
	static void print(int n) {
		if(n == 0 )
			return;
		System.out.println(n + " ");
		print(n-1);
		
	}
	
	static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		int fact  = n * factorial(n-1);
		return fact;
	}
	
	public static void main(String[] args) {
//		print(10);
		System.out.println(factorial(5));
	}
}
