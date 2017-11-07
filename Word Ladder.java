public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        int count=1,flag=0;
        LinkedList<String> storage=new LinkedList<String>();
        storage.offer(beginWord);
        wordList.remove(beginWord);
        int size;
        while(!storage.isEmpty())
        {
            size=storage.size();
            for(int i=0;i<size;i++)
            {
                char[] wordArray=storage.poll().toCharArray();
                for(int j=0;j<wordArray.length;j++)
                {
                    char temp=wordArray[j];
                    for(char c='a';c<='z';c++)
                    {
                        if(c!=temp)
                        {
                            wordArray[j]=c;
                            String word=String.valueOf(wordArray);
                            if(word.equals(endWord))
                            {
                                flag=1;
                                return count+1;
                            }
                            if(wordList.contains(word))
                            {
                                storage.offer(word);
                                wordList.remove(word);
                            }
                            wordArray[j]=temp;
                        }
                    }
                }
            }
            count++;
        }
        return 0;
    }
}