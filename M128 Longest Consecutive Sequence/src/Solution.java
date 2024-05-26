import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        int longestSequence=1;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        if(set.size()==1 || set.size()==0) return set.size();
        int counter=1;
        for(Integer num:set)
        {
            if(set.contains(num-1)) continue;
            int nextValue=num+1;
            counter=1;
            if(set.contains(nextValue))
            {
                while(set.contains(nextValue))
                {
                    counter++;
                    nextValue++;
                }
                if(counter>longestSequence) longestSequence=counter;
            }
        }
        return longestSequence;
    }
}
