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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        LinkedList<TreeNode> storage=new LinkedList<TreeNode>();
        storage.push(p);
        storage.push(q);
        while(!storage.isEmpty())
        {
            TreeNode r1=storage.pop();
            TreeNode r2=storage.pop();
            if(r1==null&&r2==null)
                continue;
            if(r1==null&&r2!=null||r1!=null&&r2==null)
                return false;
            if(r1.val!=r2.val)
                return false;
            storage.push(r1.left);
            storage.push(r2.left);
            storage.push(r1.right);
            storage.push(r2.right);
        }
        return true;
    }
}