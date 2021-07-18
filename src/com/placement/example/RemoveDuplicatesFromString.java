package com.placement.example;
import java.util.LinkedHashSet;
import java.util.Set;
//Input: Java1234
//
//Output: Jav1234 (Remove the second ‘a’ as it is duplicated)
public class RemoveDuplicatesFromString {
	
	/**
	 * LinkedHashSet can be used for storing unique characters and it maintains the order as well.
	 */
	static void removeDuplicates() {
		String string = "Java123";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		
		System.out.println(charSet.toString());
		
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		
		String str = "Java1234";
		String result  = "";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<=i;j++) {
				if(str.charAt(i) ==str.charAt(j))
				{
					count = count +1;
				}
			}
			if(count == 1) {
				result = result + str.charAt(i);
			}
			count =0;
		}
		System.out.println(result);
		removeDuplicates();
	}
}
