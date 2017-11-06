public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if((nums1.length+nums2.length)%2!=0)
            return helper(nums1,0,nums2,0,(nums1.length+nums2.length)/2+1);
        else
            return (helper(nums1,0,nums2,0,(nums1.length+nums2.length)/2)+helper(nums1,0,nums2,0,(nums1.length+nums2.length)/2+1))/2.0;
    }
    double helper(int nums1[],int start_1,int nums2[],int start_2,int k)
    {
        if(nums1.length<nums2.length)
            return helper(nums2,start_2,nums1,start_1,k);
        if(start_1>nums1.length-1)
        {
            return nums2[start_2+k-1];
        }
        if(start_2>nums2.length-1)
        {
            return nums1[start_1+k-1];
        }
        if(k==1)
        {
            return Math.min(nums1[start_1],nums2[start_2]);
        }
        int gap2=Math.min(k/2,nums2.length-start_2);
        int gap1=k-gap2;
        if(nums1[start_1+gap1-1]==nums2[start_2+gap2-1])
            return nums1[start_1+gap1-1];
        if(nums1[start_1+gap1-1]>nums2[start_2+gap2-1])
            return helper(nums1,start_1,nums2,start_2+gap2,k-gap2);
        else
            return helper(nums1,start_1+gap1,nums2,start_2,k-gap1);
        
    }
}