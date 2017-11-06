/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        int len=0;
        ListNode cur=head;
        while(cur!=null)
        {
            len++;
            cur=cur.next;
        }
        if(len<=1)
            return true;
        ListNode pre=null;
        ListNode temp;
        cur=head;
        int i=0;
        while(i<len/2)
        {
            temp=cur;
            cur=cur.next;
            temp.next=pre;
            pre=temp;
            i++;
        }
        if(len%2!=0)
            cur=cur.next;
        for(i=0;i<len/2;i++)
        {
            if(pre.val!=cur.val)
                return false;
            pre=pre.next;
            cur=cur.next;
        }
        return true;
    }
}