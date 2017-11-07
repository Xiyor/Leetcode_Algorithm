public class Solution {
    public int candy(int[] ratings) {
        int storage[]=new int[ratings.length];
        Arrays.fill(storage,1);
        int i,sum=0;
        for(i=1;i<ratings.length;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                storage[i]=storage[i-1]+1;
            }
        }
        for(i=ratings.length-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                storage[i]=storage[i]>storage[i+1]+1?storage[i]:storage[i+1]+1;
            }
        }
        for(i=0;i<ratings.length;i++)
        {
            sum+=storage[i];
        }
        return sum;
    }
}