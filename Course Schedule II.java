public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res=new int[numCourses];
        if(prerequisites==null||prerequisites.length==0||prerequisites[0].length==0)
        {
            for(int i=0;i<numCourses;i++)
                res[i]=i;
            return res;
        }
        int[] pCount=new int[numCourses];
        int len=prerequisites.length;
        for(int i=0;i<len;i++)
            pCount[prerequisites[i][0]]++;
        LinkedList<Integer> st=new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++)
            if(pCount[i]==0)
                st.offer(i);
        int index=0;
        while(!st.isEmpty())
        {
            int cur=st.poll();
            res[index]=cur;
            index++;
            for(int i=0;i<len;i++)
            {
                if(prerequisites[i][1]==cur)
                {
                    pCount[prerequisites[i][0]]--;
                    if(pCount[prerequisites[i][0]]==0)
                        st.offer(prerequisites[i][0]);
                }
            }
        }
        if(index<numCourses)
            return new int[0];
        return res;
    }
}