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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res=new LinkedList<List<Integer>>();
        if(root==null)
            return res;
        LinkedList<TreeNode> storage=new LinkedList<TreeNode>();
        storage.add(root);
        int i,size;
        while(!storage.isEmpty())
        {
            size=storage.size();
            List<Integer> temp=new ArrayList<Integer>();
            for(i=0;i<size;i++)
            {
                TreeNode r=storage.poll();
                temp.add(r.val);
                if(r.left!=null)
                    storage.add(r.left);
                if(r.right!=null)
                    storage.add(r.right);
            }
            res.addFirst(temp);
        }
        return res;
    }
}