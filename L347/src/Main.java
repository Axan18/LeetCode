import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,2}, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet())
        {
            int frequency = map.get(key);
            if(bucket[frequency] == null)
            {
                bucket[frequency]= new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] result = new int[k];
        int counter=0;
        for(int i = bucket.length-1; i>=0 && counter<k;i--)
        {
            if(bucket[i]!=null)
                for(int j=0;j<bucket[i].size() && counter<k;j++)
                    result[counter++]=bucket[i].get(j);
        }
        return result;
    }
}
