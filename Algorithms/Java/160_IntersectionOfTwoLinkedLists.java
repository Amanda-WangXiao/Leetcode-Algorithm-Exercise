/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {	//	8 ms	43.6 MB
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode ta=headA;
		ListNode tb=headB;
		var s=new HashSet<ListNode>();
		while(ta!=null){
		   s.add(ta);
		   ta=ta.next;
		}
		while(tb!=null){
			if(s.contains(tb)) return tb;
			tb=tb.next;
		}
		return null;
	}
}