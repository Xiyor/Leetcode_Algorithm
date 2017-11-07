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
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        LinkedList<TreeNode> storage=new LinkedList<TreeNode>();
        storage.push(root);
        TreeNode pre=new TreeNode(0);
        while(!storage.isEmpty())
        {
            TreeNode cur=storage.pop();
            pre.left=null;
            pre.right=cur;
            pre=cur;
            if(cur.right!=null)
                storage.push(cur.right);
            if(cur.left!=null)
                storage.push(cur.left);
        }
    }
}