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
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        ListNode pFast=head.next.next;
        ListNode pSlow=head;
        int flag=0;
        while(pFast!=null&&pFast.next!=null)
        {
            if(pFast==pSlow)
            {
                flag=1;
                break;
            }
            pFast=pFast.next.next;
            pSlow=pSlow.next;
        }
        int circleLen=1;
        if(flag==0)
            return null;
        else
        {
            pSlow=pSlow.next;
            while(pSlow!=pFast)
            {
                circleLen++;
                pSlow=pSlow.next;
            }
        }
        pSlow=head;
        pFast=head;
        while(circleLen>0)
        {
            pFast=pFast.next;
            circleLen--;
        }
        while(pSlow!=pFast)
        {
            pSlow=pSlow.next;
            pFast=pFast.next;
        }
        return pSlow;
    }
}