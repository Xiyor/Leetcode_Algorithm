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
    public boolean isValidBST(TreeNode root) {
        helper(root);
        return flag;
    }
    TreeNode pre;
    boolean flag=true;
    void helper(TreeNode r)
    {
        if(r!=null)
        {
            helper(r.left);
            if(pre!=null)
            {
                if(pre.val>=r.val)
                {
                    flag=false;
                    return;
                }
            }
            pre=r;
            helper(r.right);
        }
    }
}