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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,postorder,inorder.length-1,postorder.length-1,inorder.length);
    }
    TreeNode helper(int[] inorder,int[] postorder,int postEnd,int inEnd,int inLen)
    {
        if(inLen<=0)
            return null;
        int i;
        for(i=inEnd;i>inEnd-inLen;i--)
        {
            if(inorder[i]==postorder[postEnd])
                break;
        }
        TreeNode root=new TreeNode(inorder[i]);
        root.left=helper(inorder,postorder,postEnd-inEnd+i-1,i-1,inLen-inEnd+i-1);
        root.right=helper(inorder,postorder,postEnd-1,inEnd,inEnd-i);
        return root;
    }
}