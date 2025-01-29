package HashMapsAndHash.PairwithGivenSum;
import java.util.*;
public class PairWithGivenSum {
    // method to find if a pair with given sum exists
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        // nested loop through the array
        for (int num : arr) {
            int complement = target - num;

            // check if complement exists in set
            if (seenNumbers.contains(complement)) {
                return true;
            }

            seenNumbers.add(num);
            // Add number to set
        }

        return false; // No pair found
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 12, 5};
        int target = 9;

        // check for pair and print result
        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair with given sum exists");
        } else {
            System.out.println("No pair with given sum found");
        }
    }
}
