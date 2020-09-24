/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {	//	5 ms	42.6 MB
	public boolean isPalindrome(ListNode head) {
		ListNode temp=head;
		var s=new Stack<ListNode>();
		while(temp!=null){
			s.push(temp);
			temp=temp.next;
		}
		ListNode node_1=head;
		while(s.empty()!=true){
			ListNode node_2=s.pop();
			if(node_1.val!=node_2.val) return false; 
			node_1=node_1.next;
		}
		return true;
	}
}


class Solution {	//	6 ms	42.8 MB
	public boolean isPalindrome(ListNode head) {
		var l=new ArrayList<Integer>();
		ListNode temp=head;
		while(temp!=null){
			l.add(temp.val);
			temp=temp.next;
		}
		int left=0;
		int right=l.size()-1;
		while(left<right){
			if(l.get(left).equals(l.get(right))==false) return false;
			left++;
			right--;
		}
		return true;
	}
}