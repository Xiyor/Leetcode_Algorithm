/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null)
            return head;
        RandomListNode cur=head;
        while(cur!=null)
        {
            RandomListNode p=new RandomListNode(cur.label);
            p.next=cur.next;
            cur.next=p;
            cur=cur.next.next;
        }
        cur=head;
        while(cur!=null)
        {
            if(cur.random!=null)
                cur.next.random=cur.random.next;
            cur=cur.next.next;
        }
        cur=head;
        RandomListNode dummy=new RandomListNode(-1),newCur=dummy;
        while(cur!=null)
        {
            newCur.next=cur.next;
            cur.next=cur.next.next;
            cur=cur.next;
            newCur=newCur.next;
        }
        return dummy.next;
    }
}