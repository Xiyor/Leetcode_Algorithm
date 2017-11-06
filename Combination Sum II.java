public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        helper(res,new ArrayList<Integer>(),candidates,0,target);
        return res;
    }
    void helper(List<List<Integer>> res,List<Integer> temp,int candidates[],int start,int target)
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
            if(i==start||candidates[i]!=candidates[i-1])
            {
                temp.add(candidates[i]);
                helper(res,temp,candidates,i+1,target-candidates[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
}