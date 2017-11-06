/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode oddHead=head;
        ListNode evenHead=head.next;
        ListNode preOdd=oddHead;
        ListNode preEven=evenHead;
        ListNode cur=head.next.next;
        while(cur!=null&&cur.next!=null)
        {
            preOdd.next=cur;
            cur=cur.next;
            preEven.next=cur;
            cur=cur.next;
            preOdd=preOdd.next;
            preEven=preEven.next;
        }
        if(cur==null)
        {
            preOdd.next=evenHead.next;
        }
        else
        {
            preOdd.next=cur;
            preEven.next=null;
            preOdd=preOdd.next;
        }
        preOdd.next=evenHead;
        return oddHead;
    }
}