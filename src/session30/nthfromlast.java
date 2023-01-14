package session30;

public class nthfromlast {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head==null) return null;
	        if(head.next== null && n==1) return null;
	        ListNode a = head;
	        ListNode b= head;
	        for(int i=0;i<n;i++){
	            b= b.next;
	        }
	        if(b==null) return head.next;
	        while(b.next != null){
	            b= b.next;
	            a= a.next;
	        }
	        a.next = a.next.next;
	        return head;


	        
	    }
	}
}
