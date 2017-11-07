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
    public void recoverTree(TreeNode root) {
        if(root==null)
            return;
        TreeNode pre=null;
        TreeNode first=null;
        TreeNode second=null;
        LinkedList<TreeNode> storage=new LinkedList<TreeNode>();
        leftToStack(root,storage);
        while(!storage.isEmpty())
        {
            TreeNode t=storage.pop();
            leftToStack(t.right,storage);
            if(pre!=null&&pre.val>t.val)
            {
                if(first==null)
                {
                    first=pre;
                }
                second=t;
            }
            pre=t;
        }
        int temp;
        temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    void leftToStack(TreeNode r,LinkedList<TreeNode> s)
    {
        while(r!=null)
        {
            s.push(r);
            r=r.left;
        }
    }
}
