public class Solution {
    public String intToRoman(int num) {
        String res="";
        String label[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int digit[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i=0;
        while(num>0&&i<13)
        {
            if(num-digit[i]>=0)
            {
                res+=label[i];
                num-=digit[i];
            }
            else
            {
                i++;
            }
        }
        return res;
    }
}