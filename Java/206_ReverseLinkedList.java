/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {	//	1 ms	39.1 MB
	public ListNode reverseList(ListNode head) {
		var s=new Stack<ListNode>();
		ListNode temp=head;
		while(temp!=null){
			s.push(temp);
			temp=temp.next;
		}
		ListNode pre=new ListNode(0);
		temp=pre;
		ListNode cur=new ListNode(0);
		while(s.empty()!=true){
			cur=s.pop();
			temp.next=cur;
			temp=cur;
		}
		temp.next=null;
		return pre.next;
	}
}

class Solution {	//	0 ms	38.8 MB
	public ListNode reverseList(ListNode head) {
		if(head==null) return null;
		if(head.next==null) return head;
		ListNode pre=null;
		ListNode temp=null;
		ListNode cur=head;
		while(cur.next!=null){
			temp=cur.next;
			cur.next=pre;
			pre=cur;
			cur=temp;
		}
		cur.next=pre;
		pre=null;
		return cur;
	}
}