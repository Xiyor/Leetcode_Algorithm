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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root==null)
            return res;
        Stack<TreeNode> storage=new Stack<TreeNode>();
        storage.push(root);
        TreeNode temp=null;
        while(!storage.isEmpty())
        {
            temp=storage.pop();
            res.add(temp.val);
            if(temp.left!=null)
                storage.push(temp.left);
            if(temp.right!=null)
                storage.push(temp.right);
        }
        Collections.reverse(res);
        return res;
    }
}