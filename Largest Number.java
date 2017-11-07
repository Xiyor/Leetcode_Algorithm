public class Solution {
    public String largestNumber(int[] nums) {
        String[] numString=new String[nums.length];
        for(int i=0;i<numString.length;i++)
            numString[i]=String.valueOf(nums[i]);
        Arrays.sort(numString,new Comparator<String>()
        {
            public int compare(String s1,String s2)
            {
                String t1=s1+s2;
                String t2=s2+s1;
                return -t1.compareTo(t2);
            }
        });
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numString.length;i++)
            res.append(numString[i]);
        while(res.charAt(0)=='0' && res.length()>1)
        {
            res.deleteCharAt(0);
        }
        return res.toString();
    }
}