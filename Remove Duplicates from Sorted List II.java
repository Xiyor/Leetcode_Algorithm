/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode cur=head,dummy=new ListNode(-1),p1=dummy;
        dummy.next=head;
        int len=1;
        while(cur!=null)
        {
            while(cur.next!=null&&cur.val==cur.next.val)
            {
                len++;
                cur=cur.next;
            }
            if(len>1)
            {
                if(cur!=null)
                {
                    cur=cur.next;
                    len=1;
                }
            }
            else
            {
                if(cur!=null)
                {
                    p1.next.val=cur.val;
                    p1=p1.next;
                }
                cur=cur.next;
            }
        }
        p1.next=null;
        return dummy.next;
    }
}