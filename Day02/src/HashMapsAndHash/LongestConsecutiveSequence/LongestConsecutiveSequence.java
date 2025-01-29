package HashMapsAndHash.LongestConsecutiveSequence;
import java.util.*;
public class LongestConsecutiveSequence {
    // Method to find the longest consecutive sequence length
    public static int longestConsecutive(int[] arr) {
        // Hash set to store unique elements
        Set<Integer> numSet = new HashSet<>();
        int maxLength = 0;

        // add all elements to the set
        for (int num : arr) {
            numSet.add(num);
        }
        for (int num : arr) {
            // Check if it's the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength;
        // Return longest sequence length
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 20, 1, 3, 2, 7, 4, 9};

        // Find and print the longest consecutive sequence length
        System.out.println("Longest consecutive sequence length: " + longestConsecutive(arr));
    }
}
