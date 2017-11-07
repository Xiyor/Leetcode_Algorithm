/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null)
            return;
        LinkedList<TreeLinkNode> storage=new LinkedList<TreeLinkNode>();
        storage.offer(root);
        int i,size;
        while(!storage.isEmpty())
        {
            size=storage.size();
            for(i=0;i<size;i++)
            {
                TreeLinkNode cur=storage.pop();
                if(cur.left!=null)
                storage.offer(cur.left);
                if(cur.right!=null)
                storage.offer(cur.right);
                if(i!=size-1)
                cur.next=storage.peek();
            }
        }
    }
}