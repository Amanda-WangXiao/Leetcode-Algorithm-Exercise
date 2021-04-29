/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {	//	1 ms	39.7 MB
	public ListNode removeElements(ListNode head, int val) {
		ListNode prehead=new ListNode(val+1);
		prehead.next=head;
		ListNode temp=prehead;
		while(temp.next!=null){
			if(temp.next.val==val) temp.next=temp.next.next;
			else temp=temp.next;
		}
		return prehead.next;
	}
}