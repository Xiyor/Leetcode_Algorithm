/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head);
    }
    TreeNode helper(ListNode head)
    {
        if(head==null)
           return null;
        if(head.next==null)
           return new TreeNode(head.val);   
        ListNode fastP=head.next.next;
        ListNode slowP=head;
        while(fastP!=null&&fastP.next!=null)
        {
            slowP=slowP.next;
            fastP=fastP.next.next;
        }
        TreeNode root=new TreeNode(slowP.next.val);
        root.right=helper(slowP.next.next);
        slowP.next=null;
        root.left=helper(head);
        return root;
    }
}