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
    public List<TreeNode> generateTrees(int n) {
        if(n==0)
            return new ArrayList<TreeNode>();
        return helper(1,n);
    }
    List<TreeNode> helper(int start,int end)
    {
        List<TreeNode> res=new ArrayList<TreeNode>();
        if(start>end)
        {
            res.add(null);
            return res;
        }
        for(int k=start;k<=end;k++)
        {
            List<TreeNode> leftTree=helper(start,k-1);
            List<TreeNode> rightTree=helper(k+1,end);
            for(int i=0;i<leftTree.size();i++)
                for(int j=0;j<rightTree.size();j++)
                {
                    TreeNode cur=new TreeNode(k);
                    cur.left=leftTree.get(i);
                    cur.right=rightTree.get(j);
                    res.add(cur);
                }
        }
        return res;
    }
}