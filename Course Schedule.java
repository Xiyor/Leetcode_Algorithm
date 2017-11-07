public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses==0||prerequisites==null||prerequisites.length==0)
            return true;
        int len=prerequisites.length;
        int[] pCount=new int[numCourses];
        int i;
        for(i=0;i<len;i++)
            pCount[prerequisites[i][0]]++;
        LinkedList<Integer> st=new LinkedList<Integer>();
        for(i=0;i<numCourses;i++)
            if(pCount[i]==0)
                st.offer(i);
        int numFinal=st.size();
        int cur;
        while(!st.isEmpty())
        {
            cur=st.poll();
            for(i=0;i<len;i++)
            {
                if(prerequisites[i][1]==cur)
                {
                    pCount[prerequisites[i][0]]--;
                    if(pCount[prerequisites[i][0]]==0)
                    {
                        st.offer(prerequisites[i][0]);
                        numFinal++;
                    }
                }
            }
        }
        return numFinal==numCourses;
    }
}