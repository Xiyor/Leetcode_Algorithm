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
    int count,res;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
        helper(root);
        return res;
    }
    void helper(TreeNode r)
    {
        if(r==null)
            return;
        helper(r.left);
        count--;
        if(count==0)
            res=r.val;
        helper(r.right);
    }
}