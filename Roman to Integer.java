public class Solution {
    public int romanToInt(String s) {
        int res=0;
        String label[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int digit[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i=0,j=0;
        while(i<s.length())
        {
            if(i+2<=s.length()&&s.substring(i,i+2).equals(label[j]))
            {
                i=i+2;
                res+=digit[j];
            }
            else
                if(i+1<=s.length()&&s.substring(i,i+1).equals(label[j]))
                {
                    i=i+1;
                    res+=digit[j];
                }
                else
                {
                    j++;
                }
        }
        return res;
    }
}