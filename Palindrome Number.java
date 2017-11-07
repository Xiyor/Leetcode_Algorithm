public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int len=0;
        int x_copy=x;
        while(x_copy>0)
        {
            len++;
            x_copy/=10;
        }
        int lo,hi;
        while(len>1)
        {
            lo=x/(int)Math.pow(10,len-1);
            hi=x%10;
            if(lo!=hi)
                return false;
            x=x-lo*(int)Math.pow(10,len-1);
            x=x/10;
            len-=2;
        }
        return true;
    }
}