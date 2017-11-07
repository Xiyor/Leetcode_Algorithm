public class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo=0,hi=nums.length-1,mi=-1;
        while(lo<=hi)
        {
            mi=(lo+hi)/2;
            if(nums[mi]<target)
            {
                if(mi+1<nums.length&&nums[mi+1]<=target)
                {
                    lo=mi+1;
                }
                else
                    return mi+1;
            }
            else
            {
                if(nums[mi]>target)
                {
                    if(mi-1>=0&&nums[mi-1]>=target)
                    {
                        hi=mi-1;
                    }
                    else
                        return mi;
                }
                else
                    return mi;
            }
        }
        return -1;
    }
}