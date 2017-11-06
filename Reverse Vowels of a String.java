public class Solution {
    public String reverseVowels(String s) {
        char[] sArray=s.toCharArray();
        int i=0,j=sArray.length-1;
        while(i<j)
        {
            while(i<j&&!judge(sArray[i]))
                i++;
            while(i<j&&!judge(sArray[j]))
                j--;
            if(i<j)
            {
                swap(sArray,i,j);
                i++;
                j--;
            }
        }
        return new String(sArray);
    }
    boolean judge(char c)
    {
        if(c=='a'||c=='A'||c=='o'||c=='O'||c=='u'||c=='U'||c=='i'||c=='I'||c=='e'||c=='E')
            return true;
        return false;
    }
    void swap(char[] array,int i,int j)
    {
        char temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}