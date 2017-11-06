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
    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }
    void helper(TreeNode r)
    {
        if(r==null)
            return;
        TreeNode temp=r.left;
        r.left=r.right;
        r.right=temp;
        helper(r.left);
        helper(r.right);
    }
}