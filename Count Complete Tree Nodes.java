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
    public int countNodes(TreeNode root) {
        return helper(root);
    }
    int helper(TreeNode root)
    {
        TreeNode cur=root;
        int leftLen=0;
        while(cur!=null)
        {
            leftLen++;
            cur=cur.left;
        }
        cur=root;
        int rightLen=0;
        while(cur!=null)
        {
            rightLen++;
            cur=cur.right;
        }
        if(leftLen==rightLen)
            return (1<<leftLen)-1;
        return helper(root.left)+helper(root.right)+1;
    }
}