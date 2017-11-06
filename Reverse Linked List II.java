/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=dummy;
        int count=0;
        while(count<m-1)
        {
            cur=cur.next;
            count++;
        }
        ListNode pre=cur;
        if(cur.next==null)
            return dummy.next;
        ListNode end=cur.next;
        cur=cur.next.next;
        ListNode temp=null;
        count=0;
        while(count<n-m)
        {
            temp=cur;
            cur=cur.next;
            temp.next=pre.next;
            end.next=cur;
            pre.next=temp;
            count++;
        }
        return dummy.next;
    }
}