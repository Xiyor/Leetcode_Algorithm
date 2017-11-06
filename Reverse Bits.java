public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
        int digit;
        for(int i=0;i<32;i++)
        {
            digit=n&1;
            n=n>>1;
            res=(res<<1)+digit;
        }
        return res;
    }
}