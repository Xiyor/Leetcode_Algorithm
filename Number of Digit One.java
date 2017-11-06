public class Solution {
    public int countDigitOne(int n) {
        int n_copy=n;
        int res=0;
        int rNum=1;
        int digit;
        while(n>0)
        {
           digit=n%10;
           if(digit>1)
               res+=(n/10+1)*rNum;
           else
               if(digit==1)
                   res+=n/10*rNum+n_copy-n*rNum+1;
               else    
                   res+=n/10*rNum;
           n=n/10;
           rNum*=10;
        }
        return res;
    }
}