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
    public int sumNumbers(TreeNode root) {
        helper(root);
        return sum;
    }
    int sum=0;
    int cur=0;
    void helper(TreeNode r)
    {
        if(r==null)
            return;
        cur=cur*10+r.val;
        if(r.left==null&&r.right==null)
        {
            sum+=cur;
        }
        helper(r.left);
        helper(r.right);
        cur=cur/10;
    }
}