/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode cur=head.next;
        ListNode pre=head;
        pre.next=null;
        ListNode temp=null;
        while(cur!=null)
        {
            temp=cur;
            cur=cur.next;
            temp.next=pre;
            pre=temp;
        }
        return pre;
    }
}