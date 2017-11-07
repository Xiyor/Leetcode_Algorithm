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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root==null)
            return res;
        LinkedList<TreeNode> storage=new LinkedList<TreeNode>();
        storage.add(root);
        int i,size;
        while(!storage.isEmpty())
        {
            size=storage.size();
            for(i=0;i<size;i++)
            {
                TreeNode temp=storage.poll();
                if(temp.left!=null)
                    storage.offer(temp.left);
                if(temp.right!=null)
                    storage.offer(temp.right);
                if(i==size-1)
                    res.add(temp.val);
            }
        }
        return res;
    }
}