package session30;

public class linkedlistcycle {
	
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	public class Solution {
	    public boolean hasCycle(ListNode head) {
	        if(head== null) return false;
	       ListNode slow = head;
	       ListNode fast = head;
	       while(fast.next != null && fast.next.next != null){
	           fast = fast.next.next;
	           slow = slow.next;
	           if(slow == fast){
	               return true;
	           }
	       }
	       return false;
	        
	    }
	}
}
