package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        //The key (Integer) is the number from the array. The value (Integer) is the index of that number. 
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,8,6};
        int target = 10;
        int[] result = twoSum(nums, target);
        System.out.println("[" +result[0]+" "+result[1]+ "]");
    }
    
}
