public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        helper(res,new LinkedList<Integer>(),1,k,n);
        return res;
    }
    void helper(List<List<Integer>> res,List<Integer> temp,int start,int k,int n)
    {
        if(k==0)
        {
            res.add(new LinkedList<Integer>(temp));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            temp.add(i);
            helper(res,temp,i+1,k-1,n);
            temp.remove(temp.size()-1);
        }
    }
}

