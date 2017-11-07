public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=-1;
        Arrays.sort(nums);
        int low,high,gap=Integer.MAX_VALUE,temp;
        for(int i=0;i<nums.length;i++)
        {
            low=i+1;
            high=nums.length-1;
            while(low<high)
            {
                temp=nums[i]+nums[low]+nums[high];
                if(target-temp==0)
                    return target;
                if(temp-target>0)
                {
                    if(temp-target<gap)
                    {
                        gap=temp-target;
                        res=temp;
                    }
                    high--;
                }
                else
                {
                    if(target-temp<gap)
                    {
                        gap=target-temp;
                        res=temp;
                    }
                    low++;
                }
            }
        }
        return res;
    }
}