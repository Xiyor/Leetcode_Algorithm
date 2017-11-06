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
    public int rob(TreeNode root) {
        int[] max=helper(root);
        return Math.max(max[0],max[1]);
    }
    int[] helper(TreeNode r)
    {
        int[] max=new int[2];
        if(r==null)
            return max;
        int[] left=helper(r.left);
        int[] right=helper(r.right);
        max[0]=r.val+left[1]+right[1];
        max[1]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return max;
    }
}