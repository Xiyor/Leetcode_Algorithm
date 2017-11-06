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
    public boolean isBalanced(TreeNode root) {
        return balancedHeight(root)>=0;
    }
    int balancedHeight(TreeNode r)
    {
        if(r==null)
            return 0;
        int left=balancedHeight(r.left);
        int right=balancedHeight(r.right);
        if(left<0||right<0||Math.abs(left-right)>1)
            return -1;
        return Math.max(left,right)+1;
    }
}