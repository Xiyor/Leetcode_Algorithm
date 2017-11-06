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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> cur=new ArrayList<Integer>();
        helper(root,res,cur,sum);
        return res;
    }
    void helper(TreeNode r,List<List<Integer>> res,List<Integer> cur,int sum)
    {
        if(r==null)
            return;
        cur.add(r.val);
        if(r.left==null&&r.right==null)
        {
            if(sum==r.val)
                res.add(new ArrayList<Integer>(cur));
        }
        helper(r.left,res,cur,sum-r.val);
        helper(r.right,res,cur,sum-r.val);
        cur.remove(cur.size()-1);
    }
}