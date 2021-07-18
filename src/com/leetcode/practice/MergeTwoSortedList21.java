package com.leetcode.practice;

public class MergeTwoSortedList21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		// Inorder to initialise new linkedlist we use concept of dummy.
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		while (l1 != null && l2 != null) {

			if (l1.val < l2.val) {
				dummy.next = l1;
				l1 = l1.next;
			} else {
				dummy.next = l2;
				l2 = l2.next;
			}
			dummy = dummy.next;
		}
		if (l1 != null) {
			dummy.next = l1;
			l1 = l1.next;
		}
		if (l2 != null) {
			dummy.next = l2;
			l2 = l2.next;
		}

		return head.next;
	}
}
