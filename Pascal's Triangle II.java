public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<Integer>();
        if(rowIndex==0)
        {
            res.add(1);
            return res;
        }
        int resLen=rowIndex+1;
        int i;
        int m=rowIndex,n=1;
        res.add(1);
        for(i=1;i<resLen/2;i++)
        {
            res.add((int)(1.0*res.get(i-1)*m/n));
            m--;
            n++;
        }
        if(resLen%2!=0)
        {
            res.add((int)(1.0*res.get(i-1)*m/n));
            i++;
        }
        while(i<resLen)
        {
            res.add(res.get(resLen-i-1));
            i++;
        }
        return res;
    }
}