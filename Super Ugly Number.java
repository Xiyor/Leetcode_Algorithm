public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        List<Integer> st=new ArrayList<Integer>();
        int[] index=new int[primes.length];
        st.add(1);
        while(st.size()<n)
        {
            st.add(findMin(st,index,primes));
        }
        return st.get(st.size()-1);
    }
    int findMin(List<Integer> st,int[] index,int[] primes)
    {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<index.length;i++)
        {
            res=Math.min(res,st.get(index[i])*primes[i]);
        }
        for(int i=0;i<index.length;i++)
        {
            if(res==st.get(index[i])*primes[i])
                index[i]++;
        }
        return res;
    }
}