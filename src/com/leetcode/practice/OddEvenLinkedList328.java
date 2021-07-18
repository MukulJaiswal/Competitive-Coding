package com.leetcode.practice;

/**
 *  * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Input: 1->2->3->4->5->NULL Output: 1->3->5->2->4->NULL
 *
 */
public class OddEvenLinkedList328 {
	public ListNode oddEvenList(ListNode head) {

		if (head == null)
			return null;

		ListNode odd = head;  // 1->2->3->4->5
		ListNode even = head.next;  // 2->3->4->5
		ListNode evenHead = even; // 2->3->4->5

		while (even != null && even.next != null) {
			odd.next = even.next;  // 1-> 3 ->4->5 : pointer is at 1
			odd = odd.next;        //1 -> 3 ->4->5 : pointer is at 3
			even.next = odd.next;  // 2->4->5 : pointer is at 2
			even = even.next;       // 2->4->5 : pointer is at 4
		}
		odd.next = evenHead;
		return head;
	}
	
    public ListNode oddEvenListMethod2(ListNode head) {
        
    	   
        if(head == null)
            return null;
       ListNode odd = head, even = head.next, evenHead = even; 
     
        while (even != null && even.next != null) {
            odd.next = odd.next.next; 
            even.next = even.next.next; 
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

}
