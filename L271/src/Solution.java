import java.util.*;

public class Solution {
    private Queue<Integer> words= new PriorityQueue<>();
    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int pointer=0;
        int length;
        for(String s:strs) {
            length=s.length();
            words.add(length+pointer);
            stringBuilder.append(s);
            pointer+=length;
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int startOfWord =0;
        String word;
        while(!words.isEmpty())
        {
            word=str.substring(startOfWord,words.poll());

            result.add(word);
            startOfWord+=word.length();
        }
        return result;
    }
}
