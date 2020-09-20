/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public boolean isPalindrome(ListNode head) {
		ListNode temp=head;
		var s=new Stack<ListNode>();
		while(temp!=null){
			s.push(temp);
			temp=temp.next;
		}
		temp=head;
		while(s.empty()!=false){
			ListNode cur=s.pop();
			if(temp.val!=cur.val) return false; 
			temp=temp.next;
		}
		return true;
	}
}