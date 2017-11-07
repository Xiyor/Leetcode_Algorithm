public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<String>();
        if(nums==null||nums.length==0)
            return res;
        int start=nums[0];
        int i;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]+1)
            {
                if(start==nums[i-1])
                    res.add(String.valueOf(start));
                else
                    res.add(String.valueOf(start+"->"+nums[i-1]));
                start=nums[i];
            }
        }
        if(nums[i-1]==start)
            res.add(String.valueOf(start));
        else
            res.add(String.valueOf(start+"->"+nums[i-1]));
        return res;
    }
}