package com.corejava.concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

interface check1 {}

interface check2 {}

class A {
	
	public void display(int x ) {
		System.out.println("Hello");
	}
	
	protected void display(int x, int y  ) {
		System.out.println("Hello 2 ");
	}
	
}

class B {}

class check3 extends A implements check1, check2 {}

public class Test{

	public static void main(String[] args) {
		
		String s = "I am   good    ";
		String after = s.trim().replaceAll(" +", " ");
		String str[] = after.split(" ");
		System.out.println(Arrays.toString(str));
		
	}
}
















