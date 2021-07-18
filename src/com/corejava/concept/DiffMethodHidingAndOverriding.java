package com.corejava.concept;

class Super {
	public static void foo() {
		System.out.println("I am foo in Super");
	}

	public void bar() {
		System.out.println("I am bar in Super");
	}
}

class Child1 extends Super {
	
//	@Override  -- This is giving an error.
	public static void foo() {
		System.out.println("I am foo in Child");
	}// Hiding

	@Override
	public void bar() {
		System.out.println("I am bar in Child");
	}// Overriding

}

public class DiffMethodHidingAndOverriding {

	public static void main(String[] args) {
		Super sup = new Child1();// Child object is reference by the variable of type Super
		Child1 child = new Child1();// Child object is referenced by the
									// variable of type Child
		sup.foo();// It will call the method of Super.
		child.foo();// It will call the method of Child.

		sup.bar();// It will call the method of Child.
		child.bar();// It will call the method of Child again.
	}
}

/**
Because, static methods are resolved statically (i.e. at compile time) based on the class they 
are called on and not dynamically as in the case with instance methods which are resolved 
polymorphically based on the runtime type of the object.
*/