public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<Integer>();
        int num1=0,num2=0;
        int count1=0,count2=0;
        for(int i:nums)
        {
            if(i==num1)
                count1++;
            else
                if(i==num2)
                    count2++;
                else
                    if(count1==0)
                    {
                        num1=i;
                        count1=1;
                    }
                    else
                        if(count2==0)
                        {
                            num2=i;
                            count2=1;
                        }
                        else
                        {
                            count1--;
                            count2--;
                        }
        }
        count1=0;
        count2=0;
        for(int i:nums)
        {
            if(i==num1)
                count1++;
            else
                if(i==num2)
                    count2++;
        }
        if(count1>nums.length/3)
            res.add(num1);
        if(count2>nums.length/3)
            res.add(num2);
        return res;
    }
}