package HashMapsAndHash.TwoSum;
import java.util.*;
 class TwoSum {
     // create to find two indices whose values add up to the target sum
     public static int[] twoSum(int[] nums, int target) {
         // Hash map to store the value and its index
         HashMap<Integer, Integer> map = new HashMap<>();

         // iterate through the array
         for (int i = 0; i < nums.length; i++) {
             // Calculate the difference between the target and the current element
             int complement = target - nums[i];

             //  the complement is found in the hash map, return the indices
             if (map.containsKey(complement)) {
                 return new int[]{map.get(complement), i};
             }

             // Otherwise, add the current element and its index to the map
             map.put(nums[i], i);
         }

         // If no solution is found, return an empty array
         return new int[]{};
     }
}
