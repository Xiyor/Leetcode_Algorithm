public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return;
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    void reverse(int nums[],int l,int r)
    {
        int tmp;
        while(l<r)
        {
            tmp=nums[l];
            nums[l]=nums[r];
            nums[r]=tmp;
            l++;
            r--;
        }
    }
}