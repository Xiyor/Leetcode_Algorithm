public class Solution {
    public int myAtoi(String str) {
        int num=0,sign=1,i=0;
        while(i<str.length())
        {
            if(str.charAt(i)==' ')
                i++;
            else
                break;
        }
        if(i<str.length()&&str.charAt(i)=='+')
            i++;
        else
            if(i<str.length()&&str.charAt(i)=='-')
            {
                sign=-1;
                i++;
            }
        while(i<str.length())
        {
            if(str.charAt(i)>'9'||str.charAt(i)<'0')
                break;
            if(num>Integer.MAX_VALUE/10||num==Integer.MAX_VALUE/10&&str.charAt(i)-'0'>Integer.MAX_VALUE%10)
                return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            num=num*10+str.charAt(i)-'0';
            i++;
        }
        return num*sign;
    }
}