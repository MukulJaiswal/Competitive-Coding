package com.placement.example;

class Parent {
	void display() {
		System.out.println("In parent Class");
	}

	void area(int a, int b) {
		System.out.println(a * b);
	}
	
//	For overloading parameters must be changed.Return Type doesn't matters
//	int area(int a, int b) {
//		return a*b;
//	}

	int area(int a, int b, int c) {
		return a * b * c;
	}

	void circle(int a) {
		System.out.println(a);
	}

	// to call this , we have to typecast Int value
	void circle(Integer a) {
		System.out.println(a);
	}
}

class Child extends Parent {
	@Override
	void display() {
		System.out.println("In child class");
	}
	
}

abstract class P{
	/**
	 * We cannot create object of abstract class. We can use only by
	 * inheriting it. i.e It cannot be instantiated.
	 * Abstract class contains abstract as well as non abstract method.
	 */
	abstract void show();
	void display() {
		System.out.println("Abstract method.");
	}
}

//Multiple Inheritance example - Class Q, R and abc : https://www.geeksforgeeks.org/java-and-multiple-inheritance/
interface Q{
	
	/**
	 * In interfaces, all variables declared are public static final by default.
	 */
	 String COMPANY = "Apple";
	 
	 void show();
	/**
	 * How interface helps to achieve multiple inheritance.
	 * https://www.youtube.com/watch?v=t4GstSJcD4Y
	 */
	  default void display() {
		//If we want to give body of function in interface then
		//that function must be declared as default or static
		System.out.println("In Q");
	}
}
interface R{
	void show();
	
	default void display() {
		System.out.println("In R");
	}
}

class abc implements Q,R{

	@Override
	public void show() {
		//Below code gives an error because by default interfaces variables are public static final by default.
		//COMPANY = "MICROSOFT";
//		System.out.println(COMPANY);
		System.out.println("Multiple Inheritance");
		
	}
	
	//Multiple inheritance concept.
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Q.super.display();
	}
	
}

public class OOPS  extends P {
	public static void main(String[] args) {

		Child obj1 = new Child();
		obj1.display();

		//Run time polymorphism (Method Overriding)
		Parent obj2 = new Child();
		obj2.display();

		Parent obj3 = new Parent();
		obj3.display();

//		 Runtime Error
//		Child obj31 = (Child) new Parent();
//		obj31.display();

		// Overloading Checking
		Parent obj4 = new Parent();
		System.out.println(obj4.area(10, 20, 30));

		// For overloading parameters must be different.
		// Return type might get changed.
		obj4.area(10, 20);

		obj4.circle(100);
		
		obj4.circle((Integer)100);
		
		abc multipleinheritance = new abc();
		multipleinheritance.display();
		multipleinheritance.show();
		

		try {
			// Try block must be attached with catch or finally
			// Finally is not given without try.
			// catch is not given without try.
			int a = 5 / 0;
		}
		//catch block must be most specific to most general.
		//Otherwise it will parse an error..
		catch (ArithmeticException e) {

		} catch (Exception e) {

		} finally {

		}
		
//		Encapsulation lEncapsulation = new Encapsulation();
//		Encapsulation.main(args);
		
		
		//Static Block Implementation. Classes is declared downwards
		StaticBlock obj = new StaticBlock();
		StaticBlock obj11 = new StaticBlock();
		System.out.println(StaticBlock.a);
		
		
		//Singleton Class Implementation
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		singleton.s = (singleton.s).toUpperCase(); 
		System.out.println(singleton.s);
		System.out.println(singleton1.s);
		//Both objects would be exactly same
		System.out.println(singleton + "\n" + singleton1);

	}
	
	//Class is extending P which is a abstract class, so it responsibility of this class to declare show() method.
	@Override
	void show() {
		System.out.println("Hello world");
		
	}
}

//---------------Encapsulation------------------------------------------------------------------

class Laptop {
	private int ram;
	private int price;

	public void setPrice(int price) {
		boolean manager = false;

		if (!manager) {
			System.out.println("You are not authorised to modify the price");
		} else {
			this.price = price;
		}
	}

	public int getPrice() {
		return price;
	}
}

class EncapsultationIntro {

	// If we make below function private then Encapsulation class function will give
	// an error of visibility
	void doWork() {
		System.out.println("Do work..");
	}
}

class Encapsulation {

	void doWork() {
		EncapsultationIntro obj = new EncapsultationIntro();
		obj.doWork();
	}

	void Specification() {
		
		Laptop lLaptop = new Laptop();

		//lLaptop.price = 10;
		//Here price of laptop can be changes by everyone, which is not good.
		//So declare the variable as private and access that with the help of getters and setters.
		//This we are hiding the data in the protected manner. This is called Encapsulation
		
		//Here laptop price is set only by manager. No one else can modify that. In above case it can be changed
		// by everyone.
		lLaptop.setPrice(10);
		
	}

}

//-------------------------Static block-----------------------

/**
 * The static block contains following three features:: 
 * 
 * 1. It is used for initialising the static variable.
 * 2. Static block is executed only once. The very first time when the class is loaded into the memory.
 * 3. The Static block is executed even before the constructors
 * 
 * A class can have multiple static block and which is executed in the same sequence in which it is written
 * 
 * Opposite of Static block is inilialiser block which is always executed whenever a instance of class is made.
 *https://www.geeksforgeeks.org/g-fact-26-the-initializer-block-in-java/
 */
class StaticBlock{
	static int a;
	
	static {
		a=10;
		System.out.println("Static block is executed");
	}
	
//	static {
//		a=50;
//		System.out.println("Static block is executed");
//	}
	
	StaticBlock(){
		System.out.println("I am inside the constructor of Static block");
	}
}



//------------------------------------Singleton Class-----------------------------

/**
 *A singleton class is a class that can only have one instance of an object of a class.
 *So whatever modifications we do to any variable inside the class through any instance,
 * it affects the variable of the single instance created and is visible if we access that variable 
 * through any variable of that class type defined.
 * 
 * To design a singleton class:
	
	Make constructor as private.
	Write a static method that has return type object of this singleton class. 
	Here, the concept of Lazy initialization is used to write this static method.
 */
class Singleton{
	
	public String s;
	public static Singleton getInstance = null;
	
	private Singleton() {
//		System.out.println("Singleton Constructor");
		s = "I am a Singleton variable";
	}
	
	static Singleton getInstance() {
		if(getInstance == null) {
			getInstance = new Singleton();
		}
		return getInstance;
	}
}

//-------------------------Serialization in Java ----------------------

/**
 * Serialization is a mechanism of converting the state of an object into a byte stream.
 *  Deserialization is the reverse process where the byte stream is used to 
 *  recreate the actual Java object in memory. This mechanism is used to persist the object.
 *  
 *  Read points to remember section from below link ::
 *  https://www.geeksforgeeks.org/serialization-in-java/
 *  
 *  The ObjectOutputStream class contains writeObject() method for serializing an Object.
 *  The ObjectInputStream class contains readObject() method for deserializing an object.
 *  
 *  Transient Keyword in Java
 *  https://www.geeksforgeeks.org/transient-keyword-java/
 */


//-------------------------Volatile keyword in Java ----------------------

/**
 * https://www.geeksforgeeks.org/volatile-keyword-in-java/
 */
class SharedObj
{
   // volatile keyword here makes sure that
   // the changes made in one thread are 
   // immediately reflect in other thread
   static volatile int sharedVar = 6;
}

//-------------------------Synchronization in Java-----------------------
//Only one thread can execute at a time. 
//sync_object is a reference to an object
//whose lock associates with the monitor. 
//The code is said to be synchronized on
//the monitor object
//synchronized(sync_object){
// Access shared variables and other
// shared resources
//}
/**
 * https://www.geeksforgeeks.org/synchronized-in-java/
 */

/**
 * This synchronization is implemented in Java with a concept called monitors. 
 * Only one thread can own a monitor at a given time. When a thread acquires a lock, 
 * it is said to have entered the monitor. All other threads attempting to enter the locked 
 * monitor will be suspended until the first thread exits the monitor.
 */

//-------------------------Multi-threading Interview Questions ----------------------

/**
* https://www.javatpoint.com/java-multithreading-interview-questions
*/

//----------------------Java Reflections------------------------------------
//marker interface?


/**
* Asked in NEWGEN Softwares
* Difference between Compile time and Runtime polymorphism
* Singleton
* serialization
* Transit Class
* String vs StringBuffer
* difference between wait() and sleep()
* Methods in which wait and sleep is used.
* Data structure used in HashMap and implement it (Asked in Zoho also)
* finalize keyword
* try catch final
* Checked and unchecked exception in Java.
* Difference between HashMap and Concurrent Hash Map
 */

/**
 * Deloitte Interview
 * Logging -- debug, Info, Error
 * Compile time and runtime polymorphism
 * Joins in SQL
 * How to declare an User Defined exception
 * Annotations and define your own annotations
 * 
 */

/**
 * Can we use object as a key in hashmap in Java?
 * Internal Working of Hashmap- https://www.geeksforgeeks.org/internal-working-of-hashmap-java/
 */

/**
 * L&T Infotech Interview Questions and Answers - https://www.youtube.com/watch?v=LShvkFrU5xk&ab_channel=DrunkenEngineer
 * Features of Java 8
 * Lambda Expression, Streams, Funtional Interface
 * try-with-resources - https://www.javatpoint.com/java-try-with-resources --resource class implementing AutoClosable is gets closed with this
 * Can we use Stream in a try with resource
 * What is method hiding : https://stackoverflow.com/questions/16313649/what-is-method-hiding-in-java-even-the-javadoc-explanation-is-confusing#:~:text=Method%20hiding%20means%20subclass%20has,is%20used%20to%20invoke%20it.
 * Why static methods are not overridden?
 * Can we have constructor inside an interface and abstract class
 * Internal working of hashmap
 * Hash collision
 * How to sort the HashMap based on the values.
 * Concurrent HashMap
 * Can we use object as a key in HashMap
 * What is Executor framework in Multithreading
 * wait notify and notifyAll
 */


/**Interview Youtube video
 * https://www.youtube.com/watch?v=RMORHpRqBqk&ab_channel=apnauniversity
 * https://www.youtube.com/watch?v=LShvkFrU5xk&ab_channel=DrunkenEngineer   --L&T infotech	
 */









