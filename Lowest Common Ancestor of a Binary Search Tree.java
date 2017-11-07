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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        if(p.val<root.val&&q.val>root.val||p.val>root.val&&q.val<root.val)
            return root;
        if(p==root)
            return p;
        if(q==root)
            return q;
        if(p.val<root.val&&q.val<root.val)
            return lowestCommonAncestor(root.left,p,q);
        if(p.val>root.val&&q.val>root.val)
            return lowestCommonAncestor(root.right,p,q);
        return null;
    }
}