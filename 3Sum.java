public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        int low,high;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0&&nums[i]==nums[i-1])
                continue;
            low=i+1;
            high=nums.length-1;
            while(low<high)
            {
                if(low!=i+1&&nums[low]==nums[low-1])
                {
                    low++;
                    continue;
                }
                if(high!=nums.length-1&&nums[high]==nums[high+1])
                {
                    high--;
                    continue;
                }
                if(nums[i]+nums[low]+nums[high]<0)
                {
                    low++;
                }
                else
                    if(nums[i]+nums[low]+nums[high]>0)
                    {
                        high--;
                    }
                    else
                    {
                        List<Integer> res_part=new ArrayList<Integer>();
                        res_part.add(nums[i]);
                        res_part.add(nums[low]);
                        res_part.add(nums[high]);
                        res.add(res_part);
                        low++;
                        high--;
                    }
            }
        }
        return res;
    }
}
