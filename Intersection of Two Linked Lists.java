/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur=headA;
        int lenA=0;
        while(cur!=null)
        {
            cur=cur.next;
            lenA++;
        }
        int lenB=0;
        cur=headB;
        while(cur!=null)
        {
            cur=cur.next;
            lenB++;
        }
        cur=headA;
        ListNode cur2=headB;
        if(lenA>=lenB)
        {
            for(int i=0;i<lenA-lenB;i++)
                cur=cur.next;
        }
        else
        {
            for(int i=0;i<lenB-lenA;i++)
                cur2=cur2.next;
        }
        while(cur!=cur2)
        {
            cur=cur.next;
            cur2=cur2.next;
        }
        return cur;
    }
}