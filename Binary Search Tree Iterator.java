/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    Stack<TreeNode> storage=new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        while(root!=null)
        {
            storage.push(root);
            root=root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !storage.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp=storage.pop();
        TreeNode t=temp.right;
        while(t!=null)
        {
            storage.push(t);
            t=t.left; 
        }
        return temp.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */