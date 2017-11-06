public class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> re=new ArrayList<Integer>();
        re.add(1);
        int i1=0,i2=0,i3=0;
        int candidate;
        while(re.size()<n)
        {
            candidate=Math.min(Math.min(re.get(i1)*2,re.get(i2)*3),re.get(i3)*5);
            if(candidate==re.get(i1)*2)
                i1++;
            if(candidate==re.get(i2)*3)
                i2++;
            if(candidate==re.get(i3)*5)
                i3++;
            re.add(candidate);
        }
        return re.get(re.size()-1);
    }
}