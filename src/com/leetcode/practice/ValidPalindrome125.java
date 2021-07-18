package com.leetcode.practice;

/**
 * Input: "A man, a plan, a canal: Panama" Output: true
 *
 */
public class ValidPalindrome125 {
	public boolean isPalindrome(String s) {
		
		s= s.toLowerCase();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				str = str + s.charAt(i);
			}
		}
		char temp =' ';
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			
			temp = ch[i];
			ch[i] = ch[str.length() -i -1];
			ch[str.length() -i -1] = temp;
		}
		if(String.valueOf(ch).equals(s)) {
			return true;
		}
		return false;
	}
}
