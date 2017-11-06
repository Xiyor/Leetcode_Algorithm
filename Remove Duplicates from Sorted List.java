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
            return null;
        for(ListNode pre=head,cur=head.next;cur!=null;pre=cur,cur=cur.next)
        {
            if(cur.val==pre.val)
            {
                pre.next=cur.next;
                cur=pre;
            }
        }
        return head;
    }
}