package com.leetcode.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListCycle141 {

	/**
	 * Using Two pointers soultion
	 */
	// Concept is :
	// Slow pointer and fast pointer will definitely meet at one Node if it is a
	// loop.

	public boolean hasCycle(ListNode head) {
		
		if (head == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;

		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
	
	//Second Method
	//Doubt is 1->2->2->3->-4
	public static boolean hasCycleNew(ListNode head) {
	    Set<ListNode> nodesSeen = new HashSet<>();
	    while (head != null) {
	        if (nodesSeen.contains(head)) {
	            return true;
	        } else {
	            nodesSeen.add(head);
	        }
	        head = head.next;
	    }
	    return false;
	}
	
	
	public static void main(String[] args) {

	}
}











