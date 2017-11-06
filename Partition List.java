/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left_dummy=new ListNode(-1);
        ListNode right_dummy=new ListNode(-1);
        ListNode cur_left=left_dummy,cur_right=right_dummy;
        while(head!=null)
        {
            if(head.val<x)
            {
                cur_left.next=head;
                head=head.next;
                cur_left=cur_left.next;
                cur_left.next=null;
            }
            else
            {
                cur_right.next=head;
                head=head.next;
                cur_right=cur_right.next;
                cur_right.next=null;
            }
        }
        cur_left.next=right_dummy.next;
        return left_dummy.next;
    }
}