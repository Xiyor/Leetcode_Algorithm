/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1)
            return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fast=head;
        int i;
        boolean flag=false;
        for(i=0;i<k;i++)
        {
            if(fast==null)
                return dummy.next;
            fast=fast.next;
        }
        ListNode pre=dummy,cur=head,temp=null;
        while(!flag)
        {
            for(i=1;i<k;i++)
            {
                temp=pre.next;
                pre.next=cur.next;
                cur.next=cur.next.next;
                pre.next.next=temp;
            }
            pre=cur;
            cur=pre.next;
            for(i=0;i<k;i++)
            {
                if(fast==null)
                {
                    flag=true;
                    break;
                }
                fast=fast.next;
            }
        }
        return dummy.next;
    }
}