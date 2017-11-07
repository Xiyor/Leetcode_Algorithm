public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        helper(res,new ArrayList<Integer>(),0,target,candidates);
        return res;
    }
    void helper(List<List<Integer>> res,List<Integer> temp,int start,int target,int candidates[])
    {
        if(target==0)
        {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        if(target<0)
            return;
        for(int i=start;i<candidates.length;i++)
        {
            temp.add(candidates[i]);
            helper(res,temp,i,target-candidates[i],candidates);
            temp.remove(temp.size()-1);
        }
    }
}