public class Solution {
    public boolean increasingTriplet(int[] nums) {
       int m1=Integer.MAX_VALUE,m2=Integer.MAX_VALUE;
       for(int n:nums)
       {
           if(n<=m1)
               m1=n;
           else if(n<=m2)
               m2=n;
           else 
               return true;
       }
       return false;
    }
}