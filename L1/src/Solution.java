import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i =0;i< nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int comp = target-nums[i];
            if(map.containsKey(comp) && map.get(comp)!=i) return new int[]{i,map.get(comp)};
        }
        return new int[]{};
        //        int num1;
//        for(int i=0;i<nums.length-1;i++)
//        {
//            num1=nums[i];
//            if(num1>target) continue;
//            for(int j=i+1;j<nums.length;j++)
//            {
//                if(num1+nums[j]==target) return new int[]{i,j};
//            }
//        }
//        return new int[]{};
    }
}
