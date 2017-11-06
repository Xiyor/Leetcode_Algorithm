public class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> storage=new LinkedList<Integer>();
        int fac=1,i;
        for(i=1;i<=n;i++)
        {
            storage.add(i);
            fac*=i;
        }
        k=k-1;
        String res="";
        while(true)
        {
            fac=fac/storage.size();
            res+=storage.get(k/fac);
            storage.remove(k/fac);
            if(storage.isEmpty())
            {
                break;
            }
            k=k%fac;
        }
        return res;
    }
}