/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)
           return false;
        ListNode pFast=head.next.next,pSlow=head;
        while(pFast!=null&&pFast.next!=null)
        {
            if(pFast==pSlow)
                return true;
            pFast=pFast.next.next;
            pSlow=pSlow.next;
        }
        return false;
    }
}