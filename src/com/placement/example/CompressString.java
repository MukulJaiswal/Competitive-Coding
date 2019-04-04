package com.placement.example;

import java.util.Scanner;
/**
 * Complexity O(n^2)
 * @author Mukul
 *
 */
public class CompressString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String s=sc.next();
		
		int i=0,p=0;
		int count =0;
		String str = "";
		while(p<s.length())
		{
			char ch = s.charAt(0);
			for(i=0;i<s.length();i++)
			{
				if(ch == s.charAt(i))
					count = count +1;
			}
			
			str = str + ch + count;
			count =0;
			s=s.replaceAll(Character.toString(ch), "");
		}
		System.out.println(str);
	}
}
