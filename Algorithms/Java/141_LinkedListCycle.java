/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {	//	4 ms	40.6 MB
	public boolean hasCycle(ListNode head) {
		var s=new HashSet<ListNode>();
		ListNode cur=head;
		while(cur!=null){
			if(s.contains(cur)==false) s.add(cur);
			else return true;
			cur=cur.next;
		}
		return false;
	}
}

public class Solution {	//	0 ms	39.7 MB
	public boolean hasCycle(ListNode head) {
		if(head==null||head.next==null) return false;
		ListNode slow=head;
		ListNode fast=head.next;
		while(slow!=fast){
			if(fast==null||fast.next==null) return false;
			slow=slow.next;
			fast=fast.next.next;
		}
		return true;
	}
}