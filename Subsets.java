public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++)
        {
            helper(res,new ArrayList<Integer>(),nums,0,i);
        }
        return res;
    }
    void helper(List<List<Integer>> res,List<Integer> temp,int nums[],int start,int k)
    {
        if(temp.size()==k)
        {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
            temp.add(nums[i]);
            helper(res,temp,nums,i+1,k);
            temp.remove(temp.size()-1);
        }
    }
}