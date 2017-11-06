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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<List<Integer>> res=new LinkedList<List<Integer>>();
        if(root==null)
            return res;
        LinkedList<TreeNode> storage=new LinkedList<TreeNode>();
        storage.offer(root);
        int i,size;
        boolean levelFlag=true;
        while(!storage.isEmpty())
        {
            size=storage.size();
            LinkedList<Integer> temp=new LinkedList<Integer>();
            for(i=0;i<size;i++)
            {
                TreeNode r=storage.poll();
                if(levelFlag)
                    temp.add(r.val);
                else
                    temp.addFirst(r.val);
                if(r.left!=null)
                    storage.offer(r.left);
                if(r.right!=null)
                    storage.offer(r.right);
            }
            res.add(temp);
            levelFlag=!levelFlag;
        }
        return res;
    }
}