/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode cur=head;
        int over=0,val_1,val_2;
        for(ListNode p1=l1,p2=l2;p1!=null||p2!=null;p1=p1!=null?p1.next:p1,p2=p2!=null?p2.next:p2)
        {
            val_1=p1!=null?p1.val:0;
            val_2=p2!=null?p2.val:0;
            cur.next=new ListNode((val_1+val_2+over)%10);
            over=(val_1+val_2+over)/10;
            cur=cur.next;
        }
        if(over==1)
            cur.next=new ListNode(1);
        return head.next;
    }
}