public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        permutation(res,0,nums);
        return res;
    }
    void permutation(List<List<Integer>> res,int start,int[] nums)
    {
        if(start==nums.length)
        {
            res.add(conver(nums));
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
            swap(nums,start,i);
            permutation(res,start+1,nums);
            swap(nums,start,i);
        }
    }
    void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    ArrayList<Integer> conver(int[] nums)
    {
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            res.add(nums[i]);
        }
        return res;
    }
}