package com.placement.example;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	 public static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			if ((ch == ')' || ch == '}' || ch == ']')) {

				try {
					if (isMatchingPair(stack.peek(), ch))
						stack.pop();
				} catch (Exception e) {
					stack.push(ch);
				}
			}
		}
		if (stack.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");
	}

}
