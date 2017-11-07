public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int bitShift=0;
        while(m!=n)
        {
            bitShift++;
            m=m>>1;
            n=n>>1;
        }
        return m<<bitShift;
    }
}