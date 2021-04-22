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
class Solution {    //  error: integer number too large
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val==0&&l2.val==0) return l1;

        int result_l1 = calculate(l1);
        int result_l2 = calculate(l2);
        int add_result = result_l1+result_l2;

        ListNode first = new ListNode();
        ListNode p;
        p=first;
        while(add_result!=0){
            ListNode l_result = new ListNode(add_result%10);
            p.next=l_result;
            p=p.next;
            add_result=add_result/10;
        }

        return first.next;
    }

    public int calculate(ListNode l){
        int count = 0;
        int result = 0;
        while(l!=null){
            result=result+l.val*(int)Math.pow(10,count);
            count++;
            l=l.next;
        }
        return result;
    }
}

class Solution {    //  Out of memory limit
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val==0&&l2.val==0) return l1;

        ListNode first = new ListNode();
        ListNode p;
        p=first;
        ListNode new_node;
        while(l1!=null || l2!=null){
            if(l1==null) l1.val=0;
            if(l2==null) l2.val=0;
            int temp = l1.val+l2.val;
            if(temp>=10){
                l1.next.val=l1.next.val+1;
                new_node = new ListNode(temp-10);
            }
            else new_node = new ListNode(temp);
            p.next=new_node;
            p=p.next;
        }

        return first.next;
    }

}