package com.leetcode.practice;

import java.util.Stack;

public class PalindromeLinkedList234 {

	// Not working on leetcode but probably correct.Giving Timelimit exceeded.
	public boolean isPalindrome(ListNode head) {

		ListNode prev = null;
		ListNode next = null;
		ListNode curr = head;
		ListNode present = head;

		if (head != null || head.next != null) {
			while (head != null) {
				present.val = head.val;
				head = head.next;
				present = present.next;
			}
			while (curr != null) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			head = prev;
			while (head != null) {
				if (head.val != present.val) {
					return false;
				}
			}
		}
		return true;
	}

	// Working on leetcode.
	public boolean isPalindrome1(ListNode head) {

		ListNode slow = head;
		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null) {
			stack.push(slow.val);
			slow = slow.next;
		}
		while (head != null) {

			int i = stack.pop();
			if (head.val != i) {
				return false;
			}
			head = head.next;
		}
		return true;
	}

	// Most efficient.Complexity O(n)
	public boolean isPalindrome2(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		if (head != null || head.next != null) {
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			slow = reverseList(slow); // Reverses the second half of the linked List
			fast = head;

			while (slow != null) {
				if (slow.val != fast.val) {
					return false;
				}
				slow = slow.next;
				fast = fast.next;
			}
		}
		return true;
	}

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode next = null;
		ListNode curr;
		curr = head;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
}







