public class Solution {
    public String addBinary(String a, String b) {
        if(a.length()<b.length())
            return addBinary(b,a);
        String res="";
        int j=b.length()-1,up,down,over=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            up=a.charAt(i)-'0';
            down=j>=0?b.charAt(j)-'0':0;
            res=String.valueOf(up^down^over)+res;
            over=up+down+over>=2?1:0;
            j--;
        }
        if(over==1)
            return "1"+res;
        else
            return res;
    }
}