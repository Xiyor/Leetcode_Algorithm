public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        res[0]=downBound(nums,target);
        res[1]=upBound(nums,target);
        return res;
    }
    int upBound(int[] nums,int target)
    {
        int lo=0,hi=nums.length-1,mi=-1,flag=0;
        while(lo<=hi)
        {
            mi=(lo+hi)/2;
            if(nums[mi]<target)
            {
                lo=mi+1;
            }
            else
            {
                if(nums[mi]>target)
                {
                    hi=mi-1;
                }
                else
                {
                    if(mi+1<nums.length&&nums[mi+1]==target)
                    {
                        lo=mi+1;
                    }
                    else
                    {
                        flag=1;
                        break;
                    }
                }
            }
        }
        return flag==1?mi:-1;
    }
    int downBound(int[] nums,int target)
    {
        int lo=0,hi=nums.length-1,mi=-1,flag=0;
        while(lo<=hi)
        {
            mi=(lo+hi)/2;
            if(nums[mi]<target)
            {
                lo=mi+1;
            }
            else
            {
                if(nums[mi]>target)
                {
                    hi=mi-1;
                }
                else
                {
                    if(mi-1>=0&&nums[mi-1]==target)
                    {
                        hi=mi-1;
                    }
                    else
                    {
                        flag=1;
                        break;
                    }
                }
            }
        }
        return flag==1?mi:-1;
    }
}