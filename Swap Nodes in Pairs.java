/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode cur=head;
        ListNode temp=null;
        while(cur!=null&&cur.next!=null)
        {
            temp=cur;
            cur=cur.next.next;
            pre.next=temp.next;
            pre.next.next=temp;
            temp.next=cur;
            pre=pre.next.next;
        }
        return dummy.next;
    }
}