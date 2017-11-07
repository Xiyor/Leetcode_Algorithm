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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    int helper(TreeNode r)
    {
        if(r==null)
            return 0;
        int left=Math.max(helper(r.left),0);
        int right=Math.max(helper(r.right),0);
        max=Math.max(max,left+right+r.val);
        return Math.max(left,right)+r.val;
    }
}