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
class Solution {    //  2 ms    38.6 MB
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode();
        ListNode p;
        p=first;

        int present_num;
        int add_to_next_num=0;

        int l1_val=-1;
        int l2_val=-1;

        while(l1!=null||l2!=null){
            if(l1==null) {
                l1_val=0;
                l2_val=l2.val;
                l2=l2.next;
            }
            else if(l2==null) {
                l1_val=l1.val;
                l2_val=0;
                l1=l1.next;
            }
            else {
                l1_val=l1.val;
                l2_val=l2.val;
                l1=l1.next;
                l2=l2.next;
            }
            present_num=(l1_val+l2_val+add_to_next_num)%10;
            if(l1_val+l2_val+add_to_next_num>=10) add_to_next_num=1;
            else add_to_next_num=0;
            p.next = new ListNode(present_num);
            p=p.next;
        }

        if(add_to_next_num==1) p.next = new ListNode(1);
        return first.next;
    }
}