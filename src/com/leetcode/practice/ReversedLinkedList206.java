package com.leetcode.practice;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}


}

public class ReversedLinkedList206 {

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
