public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        helper(res,new ArrayList<Integer>(),1,k,n);
        return res;
    }
    void helper(List<List<Integer>> res,List<Integer> temp,int start,int k,int n)
    {
        if(n<0||k<0)
            return;
        if(n==0&&k==0)
        {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=start;i<=9;i++)
        {
            temp.add(i);
            helper(res,temp,i+1,k-1,n-i);
            temp.remove(temp.size()-1);
        }
    }
}