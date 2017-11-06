public class Solution {
    public int compareVersion(String version1, String version2) {
        String r1[]=version1.split("\\.");
        String r2[]=version2.split("\\.");
        for(int i=0;i<Math.max(r1.length,r2.length);i++)
        {
            if(i<Math.min(r1.length,r2.length))
            {
                if(Integer.parseInt(r1[i])<Integer.parseInt(r2[i]))
                    return -1;
                else
                    if(Integer.parseInt(r1[i])>Integer.parseInt(r2[i]))
                        return 1;
            }
            else
                if(i<r1.length)
                {
                    if(Integer.parseInt(r1[i])!=0)
                        return 1;
                }
                else
                    if(i<r2.length)
                        if(Integer.parseInt(r2[i])!=0)
                            return -1;
        }
        return 0;
    }
}