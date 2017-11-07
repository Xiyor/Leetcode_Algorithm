/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0)
            return null;
        return partition(lists,0,lists.length-1);
    }
    ListNode partition(ListNode[] l,int left,int right)
    {
        if(left==right)
            return l[left];
        int center=(left+right)/2;
        ListNode first=partition(l,left,center);
        ListNode second=partition(l,center+1,right);
        return mergeTwoLists(first,second);
    }
    ListNode mergeTwoLists(ListNode l1,ListNode l2)
    {
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<l2.val)
            {
                cur.next=l1;
                l1=l1.next;
            }
            else
            {
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        while(l1!=null)
        {
            cur.next=l1;
            l1=l1.next;
            cur=cur.next;
        }
        while(l2!=null)
        {
            cur.next=l2;
            l2=l2.next;
            cur=cur.next;
        }
        return dummy.next;
    }
}