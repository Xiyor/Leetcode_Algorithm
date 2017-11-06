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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,0,inorder.length);
    }
    TreeNode helper(int[] preorder,int[] inorder,int preStart,int inStart,int inLen)
    {
        if(inLen<=0)
            return null;
        int i;
        for(i=inStart;i<inStart+inLen;i++)
        {
            if(preorder[preStart]==inorder[i])
            {
                break;
            }
        }
        TreeNode root=new TreeNode(inorder[i]);
        root.left=helper(preorder,inorder,preStart+1,inStart,i-inStart);
        root.right=helper(preorder,inorder,preStart+i-inStart+1,i+1,inLen-i+inStart-1);
        return root;
    }
}