/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)
            return;
        int len=0;
        ListNode cur=head;
        while(cur!=null)
        {
            len++;
            cur=cur.next;
        }
        cur=head;
        for(int i=0;i<len/2;i++)
            cur=cur.next;
        if(len%2!=0)
        {
            cur=cur.next;
        }
        ListNode pre=null;
        ListNode temp=null;
        while(cur!=null)
        {
            temp=cur;
            cur=cur.next;
            temp.next=pre;
            pre=temp;
        }
        cur=head;
        ListNode temp2;
        while(pre!=null)
        {
            temp=cur;
            temp2=pre;
            cur=cur.next;
            pre=pre.next;
            temp.next=temp2;
            temp2.next=cur;
        }
        if(cur!=null)
            cur.next=null;
    }
}