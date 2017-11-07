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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root==null)
            return res;
        Stack<TreeNode> storage=new Stack<TreeNode>();
        leftToStack(storage,root);
        TreeNode temp=null;
        while(!storage.isEmpty())
        {
            temp=storage.pop();
            res.add(temp.val);
            leftToStack(storage,temp.right);
        }
        return res;
    }
    void leftToStack(Stack<TreeNode> storage,TreeNode r)
    {
        while(r!=null)
        {
            storage.push(r);
            r=r.left;
        }
    }
}
