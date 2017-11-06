public class Solution {
    public String reverseString(String s) {
        char[] sArray=s.toCharArray();
        int i=0,j=sArray.length-1;
        while(i<j)
        {
            swap(sArray,i,j);
            i++;
            j--;
        }
        return new String(sArray);
    }
    void swap(char[] Array,int i,int j)
    {
        char temp=Array[i];
        Array[i]=Array[j];
        Array[j]=temp;
    }
}