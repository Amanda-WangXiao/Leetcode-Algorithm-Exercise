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

        int x1,x2;

        while(l1!=null || l2!=null){
            if(l1==null) x1 = 0;
            else x1 = l1.val;
            if(l2==null) x2 = 0;
            else x2 = l2.val;
            int temp = x1+x2;

            if(temp>=10){
                if(l1.next!=null) {
                    l1.next.val=l1.next.val+1;
                    new_node = new ListNode(temp-10);
                }
                else if(l2.next!=null){
                    l2.next.val=l2.next.val+1;
                    new_node = new ListNode(temp-10);
                }
                else new_node = new ListNode(1);
            }
            else new_node = new ListNode(temp);

            p.next=new_node;
            p=p.next;
            if(l1.next!=null) l1=l1.next;
            if(l2.next!=null) l2=l2.next;
        }

        return first.next;
    }

}