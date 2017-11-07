public class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        String res="11";
        int count;
        for(int i=3;i<=n;i++)
        {
            String temp="";
            count=1;
            for(int j=1;j<res.length();j++)
            {
                if(res.charAt(j)!=res.charAt(j-1))
                {
                    temp+=String.valueOf(count)+res.charAt(j-1);
                    count=1;
                }
                else
                {
                    count++;
                }
                if(j==res.length()-1)
                {
                    temp+=String.valueOf(count)+res.charAt(j);
                }
            }
            res=new String(temp);
        }
        return res;
    }
}