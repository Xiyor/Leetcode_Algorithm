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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    TreeNode helper(int[] nums,int left,int right)
    {
        if(left>right)
            return null;
        int center=(left+right)/2;
        TreeNode res=new TreeNode(nums[center]);
        res.left=helper(nums,left,center-1);
        res.right=helper(nums,center+1,right);
        return res;
    }
}