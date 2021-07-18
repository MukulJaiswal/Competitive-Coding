package com.leetcode.practice;

import java.util.Scanner;
import java.util.Stack;

/**
 * S = "ab##", T = "c#d#"
 */
public class BackspaceStringCompare844 {
	public static boolean backspaceCompare(String S, String T) {

		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		char ch1[] = S.toCharArray();
		char ch2[] = T.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != '#')
				stack1.push(ch1[i]);
			else if (!stack1.isEmpty())
				stack1.pop();
		}

		for (int i = 0; i < ch2.length; i++) {
			if (ch2[i] != '#')
				stack2.push(ch2[i]);
			else if (!stack2.isEmpty())
				stack2.pop();
		}
		if (stack1.size() != stack2.size())
			return false;
		for (int i = 0; i < stack1.size(); i++) {
			if (!stack1.contains(stack2.get(i)))
				return false;
		}
		if (String.valueOf(stack1) != String.valueOf(stack2)) {
			return false;
		}
		return true;
	}
/**
 * Second Method
 * @param S
 * @param T
 * @return
 */
// StringBuffer can be used as a Stack.
	
	public boolean backspaceCompare2(String S, String T) {
		return buildString(S).equals(buildString(T));
	}
	private String buildString(String str) {

		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (ch != '#') {
				sb.append(ch);
			} else if (sb.length() != 0) {
				sb.deleteCharAt(sb.length() - 1);
			}
		}

		return sb.toString();
	}
	
    public static boolean backspaceCompareNew(String S, String T) {
    	
    	Stack<Character> s1= new Stack<Character>();
    	Stack<Character> s2= new Stack<Character>();
    	
    	for(int i=0;i<S.length();i++) {
    		if(S.charAt(i) != '#') {
    			s1.push(S.charAt(i));
    		}
    		else {
    			if(!s1.isEmpty()) {
    				s1.pop();
    			}
    		}
    	}
    	
    	for(int i=0;i<T.length();i++) {
    		if(T.charAt(i) != '#') {
    			s2.push(T.charAt(i));
    		}
    		else {
    			if(!s2.isEmpty()) {
    				s2.pop();
    			}
    			
    		}
    	}
    	System.out.println(s1);
    	System.out.println(s2);
    	
    	if(s1.equals(s2)) {
    		return true;
    	}
    	
		return false;
        
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		System.out.println(backspaceCompare(S, T));
	}
}
