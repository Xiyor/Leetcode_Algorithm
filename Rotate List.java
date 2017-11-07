/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)
            return head;
        int len=1;
        ListNode cur=head;
        while(cur.next!=null)
        {
            cur=cur.next;
            len++;
        }
        cur.next=head;
        k=k%len;
        cur=head;
        for(int i=1;i<len-k;i++)
        {
            cur=cur.next;
        }
        head=cur.next;
        cur.next=null;
        return head;
    }
}