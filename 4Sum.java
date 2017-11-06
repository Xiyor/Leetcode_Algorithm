public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        int low,high;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0&&nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<nums.length;j++)
            {
                if(j!=i+1&&nums[j]==nums[j-1])
                    continue;
                low=j+1;
                high=nums.length-1;
                while(low<high)
                {
                    if(low!=j+1&&nums[low]==nums[low-1])
                    {
                        low++;
                        continue;
                    }
                    if(high!=nums.length-1&&nums[high]==nums[high+1])
                    {
                        high--;
                        continue;
                    }
                    if(nums[i]+nums[j]+nums[low]+nums[high]>target)
                        high--;
                    else
                    {
                        if(nums[i]+nums[j]+nums[low]+nums[high]<target)
                            low++;
                        else
                        {
                            List<Integer> res_part=new ArrayList<Integer>();
                            res_part.add(nums[i]);
                            res_part.add(nums[j]);
                            res_part.add(nums[low]);
                            res_part.add(nums[high]);
                            res.add(res_part);
                            low++;
                            high--;
                        }
                    }
                }
            }
        }
        return res;
    }
}