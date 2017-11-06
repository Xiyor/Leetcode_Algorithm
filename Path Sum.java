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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        return helper(root,0,sum);
    }
    boolean helper(TreeNode r,int curSum,int sum)
    {
        if(r.left==null&&r.right==null)
        {
            if(curSum+r.val==sum)
                return true;
            else
                return false;
        }
        if(r.left==null)
            return helper(r.right,curSum+r.val,sum);
        if(r.right==null)
            return helper(r.left,curSum+r.val,sum);
        return helper(r.right,curSum+r.val,sum)||helper(r.left,curSum+r.val,sum);
    }
}