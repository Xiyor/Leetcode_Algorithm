public class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)
            return 0;
        int head=0,tail=nums[0],res=1,i,temp;
        while(tail<nums.length-1)
        {
            temp=tail;
            res++;
            for(i=head;i<=temp;i++)
                tail=Math.max(tail,i+nums[i]);
            head=temp;
            if(tail==temp&&tail<nums.length)
                break;
        }
        return res;
    }
}