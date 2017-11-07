public class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||s.length()<=numRows)
            return s;
        String arr[]=new String[numRows];
        Arrays.fill(arr,"");
        String res="";
        int row=0,direction=1;
        for(int i=0;i<s.length();i++)
        {
            arr[row]+=s.charAt(i);
            if(direction==1)
            {
                row++;
                if(row>=numRows)
                {
                    row-=2;
                    direction=-1;
                }
            }
            else
            {
                row--;
                if(row==-1)
                {
                    row=1;
                    direction=1;
                }
            }
        }
        for(int i=0;i<numRows;i++)
        {
            res+=arr[i];
        }
        return res;
    }
}