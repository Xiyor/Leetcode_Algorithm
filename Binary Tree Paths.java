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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<String>();
        if(root==null)
            return res;
        if(root.left==null&&root.right==null)
            res.add(String.valueOf(root.val));
        helper(res,String.valueOf(root.val),root.left);
        helper(res,String.valueOf(root.val),root.right);
        return res;
    }
    void helper(List<String> res,String temp,TreeNode r)
    {
        if(r==null)
            return;
        if(r.left==null&&r.right==null)
        {
            res.add(new String(temp+"->"+r.val));
            return;
        }
        helper(res,temp+"->"+r.val,r.left);
        helper(res,temp+"->"+r.val,r.right);
    }
}