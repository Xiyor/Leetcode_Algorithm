public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res=new ArrayList<Integer>();
        res.add(0);
        int size;
        for(int i=1;i<=n;i++)
        {
            size=res.size()-1;
            for(int j=size;j>=0;j--)
            {
                res.add(res.get(j)+(int)Math.pow(2,i-1));
            }
        }
        return res;
    }
}