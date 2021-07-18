package com.placement.example;

import java.util.Scanner;

public class SumPresent {

	static boolean isPresent(int a[], int val) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == val)
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				int sum = a[i] + a[j];
				if(isPresent(a,sum))
					System.out.println(a[i] + " "+" "+a[j]);
					
			}
		}
	}
}
