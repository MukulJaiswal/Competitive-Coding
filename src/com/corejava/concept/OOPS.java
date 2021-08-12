package com.corejava.concept;
//https://www.youtube.com/watch?v=a199KZGMNxk&t=2774s&ab_channel=AnujBhaiyaAnujBhaiya
class Parent {
	
	//Inner class can be static 
	static class check{}
	
	void display() {
		System.out.println("In parent Class");
	}

	void area(int a, int b) {
		System.out.println(a * b);
	}
	
	//This is also polymorphism. Parameters might get changed.
	void area(double a, double b) {
		System.out.println(a * b);
	}
	
//	This is not overloading because it will create an ambiguity. The area(int, int) is of void as well as int
//	It will give compile time error.
//	int area(int a, int b) {
//		return a*b;
//	}
	
	//Return type might get changed only when there is a parameter difference.
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
	
	//Below methods are also example of polymorphism as there is a difference in parameters.
	//By default display(int a) is called. In order to call other we need to cast it while calling like display((short)100)
	void display(int a) { System.out.println("int : " + a); }
	void display(short a) { System.out.println("short : " +a); }
	void display(long a) { System.out.println("long : " +a); }
	
}

class Child extends Parent {
	/**Can we change the access modifier in method overriding. ? Yes, but with a condition
	 * https://www.tutorialspoint.com/java-access-modifiers-with-method-overriding
	 */
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
	/**
	 * http://javatechonline.com/default-method-in-interface/
	 */	
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
		obj4.area(10, 20);
		obj4.area(10.0, 20.0);

		obj4.circle(100);
		
		obj4.circle((Integer)100);
		
		abc multipleinheritance = new abc();
		multipleinheritance.display();
		multipleinheritance.show();
		
		//Using try with resource, we can omit catch as well as finally block
		try {
			// Try block must be attached with catch or finally
			// Finally is not given without try.
			// catch is not given without try.
			int a = 5 / 0;
		}
		//catch block must be most specific to most general.
		//Otherwise it will parse an compile time error..
		catch (ArithmeticException e) {

		} catch (Exception e) {

		} finally {

		}
		
//		Encapsulation lEncapsulation = new Encapsulation();
//		Encapsulation.main(args);
		
		
		//Static Block Implementation. Classes is declared downwards
		System.out.println("-------------------------");
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
	
	Double check locking
	https://www.geeksforgeeks.org/java-program-to-demonstrate-the-double-check-locking-for-singleton-class/
 */
class Singleton{
	
	public String s;
	public static  Singleton getInstance = null;
	
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

//-------------------------------------Serialization in Java ----------------------

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
 *  
 * It is a Marker Interface(no data members and methods)
 *  What is serialVersionUID and what will happen if we don't define it. --https://www.geeksforgeeks.org/serialversionuid-in-java/
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
   /**
    * The value of a volatile variable will never be stored in the cache. 
    * All read and write will be done from and to the main memory.This enables thread to take the correct values
    * during multithreading.
    */
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
 * Can we use object as a key in hashmap in Java? ==--https://howtodoinjava.com/java/collections/hashmap/design-good-key-for-hashmap/
 * Internal Working of Hashmap- https://www.geeksforgeeks.org/internal-working-of-hashmap-java/
 */

/**
 * Design Pattern
 * SOLID Principles -https://www.youtube.com/watch?v=yxf2spbpTSw&t=351s
 * https://www.baeldung.com/solid-principles
 */

/**
 * L&T Infotech Interview Questions and Answers - https://www.youtube.com/watch?v=LShvkFrU5xk&ab_channel=DrunkenEngineer
 * Features of Java 8
 * Lambda Expression, Streams, Funtional Interface, Date/Time Apis
 * try-with-resources - https://www.javatpoint.com/java-try-with-resources --All resources implementing AutoClosable is gets closed with this
 * In a try-with-resources statement, catch or finally block executes after closing of the declared resources.
 * Can we use Stream in a try with resource
 * What is method hiding : https://stackoverflow.com/questions/16313649/what-is-method-hiding-in-java-even-the-javadoc-explanation-is-confusing#:~:text=Method%20hiding%20means%20subclass%20has,is%20used%20to%20invoke%20it.
 * Why static methods are not overridden?
 * Can we have constructor inside an interface and abstract class --- https://www.geeksforgeeks.org/why-java-interfaces-cannot-have-constructor-but-abstract-classes-can-have/#:~:text=The%20methods%20inside%20the%20interface,a%20constructor%20inside%20the%20interface.
 * Internal working of hashmap --https://www.geeksforgeeks.org/internal-working-of-hashmap-java/
 * Hash collision
 * Can we store object as a key in hashmap - https://howtodoinjava.com/java/collections/hashmap/design-good-key-for-hashmap/
 * How to sort the HashMap based on the values.
 * Concurrent HashMap
 * Can we use object as a key in HashMap
 * What is Executor framework in Multithreading
 * wait notify and notifyAll
 * Can we call a static method with a null object in Java? If so, how?  Yes ->--https://stackoverflow.com/questions/24800309/can-we-call-a-static-method-with-a-null-object-in-java-if-so-how
 *
 */

/**
 * Orange Business Solutions
 * Difference between == and equals - https://www.geeksforgeeks.org/difference-equals-method-java/
 * Can we use extends and implements together - https://stackoverflow.com/questions/38302935/can-i-use-implements-and-extends-at-the-same-time
 * Can we use try without catch and finally - Yes by using try with resource.
 * Can we remove an element from an ArrayList while iterating - Yes using Iterator otherwise it gives ConcurrentModificationException
 * 
 */

/**Interview Youtube video
 * https://www.youtube.com/watch?v=RMORHpRqBqk&ab_channel=apnauniversity
 * https://www.youtube.com/watch?v=LShvkFrU5xk&ab_channel=DrunkenEngineer   --L&T infotech	
 */

/**
 * Ameriprise Financials
 * How to make a immutable class - It is good for caching purpose and it is thread safe. - https://www.geeksforgeeks.org/create-immutable-class-java/
 * Immutable class : 5:42 to check  -> https://www.youtube.com/watch?v=i5eZHUDbMiA&ab_channel=JavaGuidesJavaGuides
 * Is Java a pass by value or pass by reference.
 * https://www.geeksforgeeks.org/static-class-in-java/
 * Super Keyword in Constructor  : -> https://www.youtube.com/watch?v=IPJYL18NCpw&t=51s&ab_channel=Telusko
 * 
 */

/**
 * What is AssertionError ?  -> https://stackoverflow.com/questions/24863185/what-is-an-assertionerror-in-which-case-should-i-throw-it-from-my-own-code
 */

/**
 * Finoit
 * Deep copy and Shallow copy difference
 * https://www.geeksforgeeks.org/difference-between-shallow-and-deep-copy-of-a-class/
 * static binding and dynamic binding -https://www.geeksforgeeks.org/static-vs-dynamic-binding-in-java/
 * Internal Working of the Sets and Complexity it takes to insert the value.
 * Bean scope in Spring - https://www.geeksforgeeks.org/singleton-and-prototype-bean-scopes-in-java-spring/
 * Class loader in Java - https://www.geeksforgeeks.org/classloader-in-java/
 */

/**
 * Digilytics
 * 
 * Bean life cycle -- https://www.geeksforgeeks.org/bean-life-cycle-in-java-spring/
 * Thread life cycle.
 * Collections complexity of Insertion and deletion
 * Functional Interface and does it has more than one abstarct method  - https://www.geeksforgeeks.org/functional-interfaces-java/#:~:text=A%20functional%20interface%20has%20only,more%20than%20one%20abstract%20method.
 * Runnable, ActionListener and Comparable are functional Interfaces.
 * CopyOnWriteArrayList - https://www.geeksforgeeks.org/copyonwritearraylist-in-java/
 * https://www.geeksforgeeks.org/difference-arraylist-copyonwritearraylist/
 * Methods of Object Class -> hashcode, clone, finalize, toString, equals, wait, notify and notifyall - https://www.javatpoint.com/object-class
 * Thread implemention and why it is good to do with implementing Runnable Interface. -- Because we can extend only one class in Java --https://www.javatpoint.com/java-multithreading-interview-questions
 * Constructor cannot be final - Yes cannot be final because contructors cannot be inherited in java- https://www.geeksforgeeks.org/why-a-constructor-can-not-be-final-static-or-abstract-in-java/
 * 
 */

/**
 * Altran
 * 
 * Internal Implementation of ArrayList --https://www.geeksforgeeks.org/internal-working-of-arraylist-in-java/
 * Immutable concept in depth. - https://www.geeksforgeeks.org/create-immutable-class-java/	
 * Runnable is used instead of thread because - https://stackoverflow.com/questions/15471432/why-implements-runnable-is-preferred-over-extends-thread
 * In the first approach, Our class always extends Thread class. There is no chance of extending any other class. Hence we are missing Inheritance benefits
 */


/**
 * Times Internet
 * Can we use final with interfaces
 * Three ways to iterate the HashMap
 * If we use HashMap in synchronize block then it is a HashTable or not
 * Remove duplicates from an array.
 * Sort the list containing the Employee Object on empid and empid name.
 * PriorityQueue in Java by default produces the Min Heap.
 * Can we declare interface as a final in Java? No
 * Does arraylist maintains the insertion order ? Yes it is a ordered collection.
 * When to use arraylist and linkedlist? --https://www.geeksforgeeks.org/applications-of-linked-list-data-structure/
 * Can we use private final together with function?Yes, but it does not make any sense.But no compilation error.
 */




