public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null||haystack==null)
            return -1;
        int i,j,temp_i;
        for(i=0;i<=haystack.length()-needle.length();i++)
        {
            j=0;
            temp_i=i;
            while(j<needle.length())
            {
                if(haystack.charAt(temp_i)==needle.charAt(j))
                {
                    temp_i++;
                    j++;
                }
                else
                    break;
            }
            if(j==needle.length())
                return i;
        }
        return -1;
    }
}