package com.corejava.concept;

import java.util.ArrayList;
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
		int x = 0;
		A a = new A();
		
		a.display(x);
		a.display(x,x);

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		for (Integer i : list) {
			list.add(1000);
			System.out.println(i);
		}
		System.out.println("------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("------------AAA");
		Iterator<Integer> iter = list.iterator();

		while (iter.hasNext()) {
			Integer str = iter.next();
			
			if(str == 50) {
				iter.remove();
				System.out.println(str  + "is removed");
			}
		}
		
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
















