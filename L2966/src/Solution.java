import java.util.*;

public class Solution {
//    public int[][] divideArray(int[] nums, int k) {
//        HashMap<Integer,Integer> numbers = new HashMap<>();
//        int[][] result;
//        for(int i=0;i<nums.length;i++)
//        {
//            int temp = nums[i];
//            numbers.put(temp,numbers.get(temp)+1);
//        }
//        for(int j=1;j<numbers.size()-2;j++)
//        {
//            for(int i =0;i<2;i++)
//            {
//                result[j][i]=numbers.get(j)
//            }
//        }
//    }
    public int[][] divideArray(int[] nums, int k) {
        nums = Arrays.stream(nums).sorted().toArray();
        int[][] result = new int[nums.length/3][3];
        int id=0;
        for(int i=0;i<nums.length;i+=3)
        {
            for(int j=0;j<3;j++)
            {
                result[id][j]=nums[i+j];
            }
            if(result[id][2]-result[id][0]>k) return new int[0][0];
            id++;
        }
        return result;
    }
}
