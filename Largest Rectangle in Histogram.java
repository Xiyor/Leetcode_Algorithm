public class Solution {
    public int largestRectangleArea(int[] height) {
        if(height==null||height.length==0)
            return 0;
        LinkedList<Integer> storage=new LinkedList<Integer>();
        int i=0,res=0,len=height.length;
        while(i<len)
        {
            while(!storage.isEmpty()&&height[i]<height[storage.peek()])
            {
                res=Math.max(res,height[storage.pop()]*(i-(storage.isEmpty()?0:storage.peek()+1)));
            }
            storage.push(i);
            i++;
        }
        while(!storage.isEmpty())
        {
            res=Math.max(res,height[storage.pop()]*(len-(storage.isEmpty()?0:storage.peek()+1)));
        }
        return res;
    }
}