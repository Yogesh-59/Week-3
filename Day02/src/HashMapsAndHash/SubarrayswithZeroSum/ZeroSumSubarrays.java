package HashMapsAndHash.SubarrayswithZeroSum;
import java.util.*;
 class ZeroSumSubarrays {
     public static void findZeroSumSubarrays(int[] arr) {
         Map<Integer, List<Integer>> sumMap = new HashMap<>();
         int sum = 0;

         sumMap.put(0, new ArrayList<>());
         sumMap.get(0).add(-1);

         for (int i = 0; i < arr.length; i++) {
             sum += arr[i];

             if (sumMap.containsKey(sum)) {
                 for (int start : sumMap.get(sum)) {
                     System.out.println("Subarray found from index " + (start + 1) + " to " + i);
                 }
             }

             sumMap.putIfAbsent(sum, new ArrayList<>());
             sumMap.get(sum).add(i);
         }
     }
     public static void main(String[]args){
         int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
         findZeroSumSubarrays(arr);
     }
}
