/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=head.next;
        ListNode p;
        ListNode pre=head;
        ListNode temp1,temp2;
        int flag;
        while(cur!=null)
        {
            flag=0;
            p=dummy;
            while(p!=cur)
            {
                if(cur.val<p.next.val)
                {
                    temp2=cur;
                    cur=cur.next;
                    temp1=p.next;
                    p.next=temp2;
                    temp2.next=temp1;
                    pre.next=cur;
                    flag=1;
                    break;
                }
                else
                {
                    p=p.next;
                }
            }
            if(flag==0)
            {
                cur=cur.next;
                pre=pre.next;
            }
        }
        return dummy.next;
    }
}