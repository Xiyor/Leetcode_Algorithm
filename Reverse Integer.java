public class Solution {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE)
            return 0;
        if(x<0)
            return -1*reverse(-x);
        int res=0,digit;
        while(x>0)
        {
            digit=x%10;
            if(res>Integer.MAX_VALUE/10)
                return 0;
            x=x/10;
            res=digit+res*10;
        }
        return res;
    }
}