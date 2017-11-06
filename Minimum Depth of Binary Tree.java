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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int leftHeight=minDepth(root.left);
        int rightHeight=minDepth(root.right);
        return Math.min(leftHeight,rightHeight)>0?Math.min(leftHeight,rightHeight)+1:Math.max(leftHeight,rightHeight)+1;
    }
}