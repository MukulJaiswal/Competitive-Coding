package com.recursion;

import java.util.ListIterator;
import java.util.Stack;

//https://www.geeksforgeeks.org/delete-middle-element-stack/
//https://www.youtube.com/watch?v=oCcUNRMl7dA&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=8&ab_channel=AdityaVermaAdityaVerma

/**
 * Input : Stack[] = [1, 2, 3, 4, 5] 
 * Output :Stack[] = [1, 2, 4, 5]
 * 
 * Input : Stack[] = [1, 2, 3, 4, 5, 6] 
 * Output :Stack[] = [1, 2, 4, 5, 6]
 *
 */
public class DeleteMiddleFromStack {
	static int p =0;
	static void deleteMiddle(Stack<Integer> stack, int size) {
		
		if(stack.isEmpty()) {
			return;
		}
		
		int element = stack.pop();
		deleteMiddle(stack, size);
		size =  (size % 2 == 0) ? size -1 : size; //For even length,we have to delete the mid-1 element
		if(p++ != size/2)
			stack.push(element);
		
	}
	static void printStack(Stack<Integer> stack) {
		ListIterator<Integer> iter = stack.listIterator();
		
		while(iter.hasNext()) {
			iter.next();
		}
		while(iter.hasPrevious()) {
			System.out.print(iter.previous() + " ");
		}
		
 	}
	//20 59 42 94 12 46 51 40 67 41 7 56
	//56 7 41 67 40 51 12 94 42 59 20
	//56 7 41 67 40 51 12 94 42 59 20 
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.add(20);
		stack.add(59);
		stack.add(42);
		stack.add(94);
		stack.add(12);
		stack.add(46);
		stack.add(51);
		stack.add(40);
		stack.add(67);
		stack.add(41);
		stack.add(7);
		stack.add(56);
		deleteMiddle(stack , stack.size());
		printStack(stack);
	}
}
