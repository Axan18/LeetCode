import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        containsDuplicate();
    }
    public static boolean containsDuplicate() {
        int[] nums = new int[]{1,2,3,1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i],0);
        }
        return false;

//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (!set.add(num)) {
//                return true;
//            }
//        }
//        return false;
    }
}
