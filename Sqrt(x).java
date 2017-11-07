public class Solution {
    public int mySqrt(int x) {
        if(x<=1)
           return x;
        int left=1,right=x,res=left;
        int mid;
        while(left<right)
        {
            mid=(left+right)/2;
            if(x/mid<mid)
            {
               right=mid;
            }
            else
            {
                res=mid;
                left=mid+1;
            }
        }
        return res;
    }
}