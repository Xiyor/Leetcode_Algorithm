public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(numRows==0)
            return res;
        List<Integer> firstList=new ArrayList<Integer>();
        firstList.add(1);
        res.add(firstList);
        for(int i=1;i<numRows;i++)
        {
            int subListLen=i+1;
            List<Integer> subList=new ArrayList<Integer>();
            subList.add(1);
            for(int j=1;j<subListLen-1;j++)
            {
                subList.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            subList.add(1);
            res.add(subList);
        }
        return res;
    }
}