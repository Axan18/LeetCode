import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[nums.length];
        Arrays.fill(result,1);
        int curr=1;
        for(int i=0;i< size;i++)
        {
            result[i]*=curr;
            curr*=nums[i];
        }
        curr=1;
        for(int i=size-1;i>=0;i--)
        {
            result[i]*=curr;
            curr*=nums[i];
        }
        return result;
    }
    //***BETTER***
//    Map<Integer,Integer> partialProductsPre = new HashMap<>();
//    int[] result = new int[nums.length];
//        partialProductsPre.put(0,1);
//        for(int i=1;i<nums.length;i++) {
//        partialProductsPre.put(i,nums[i-1]*partialProductsPre.get(i-1));
//    }
//    Map<Integer,Integer> partialProductsPost = new HashMap<>();
//        partialProductsPost.put(nums.length-1, 1);
//        for(int i=nums.length-2;i>=0;i--)
//    {
//        partialProductsPost.put(i, nums[i+1]*partialProductsPost.get(i+1));
//    }
//        for(int i=0; i<nums.length;i++)
//    {
//        result[i]=partialProductsPre.get(i)*partialProductsPost.get(i);
//    }
//        return result;

        //*****NAIVE*****//
//        int product=1;
//        int[] result = new int[nums.length];
//        for(int i=0;i<nums.length;i++)
//        {
//            for(int j=0;j<i;j++)
//            {
//                product*=nums[j];
//            }
//            for(int j=i+1;j<nums.length;j++)
//            {
//                product*=nums[j];
//            }
//            result[i]=product;
//            product=1;
//        }
//        return result;
//    }
}
