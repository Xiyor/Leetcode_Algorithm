/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=head;
        ListNode pre=dummy;
        while(cur!=null)
        {
            if(cur.val==val)
            {
                pre.next=cur.next;
                cur=cur.next;
            }
            else
            {
               cur=cur.next;
               pre=pre.next;
            }
        }
        return dummy.next;
    }
}