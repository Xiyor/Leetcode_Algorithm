public class Solution {
    public int titleToNumber(String s) {
        int res=0;
        int delta=1;
        for(int i=s.length()-1;i>=0;i--)
        {
            res+=(s.charAt(i)-'A'+1)*delta;
            delta*=26;
        }
        return res;
    }
}