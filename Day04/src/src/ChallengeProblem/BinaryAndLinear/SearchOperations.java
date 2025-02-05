package ChallengeProblem.BinaryAndLinear;

import java.util.Arrays;

public class SearchOperations {

     //Method to find first missing positive element
     static int findFirstMissingPositive(int[]arr) {
         int n = arr.length;
         for (int i = 0; i < n; i++) {
             while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                 int temp = arr[i];
                 arr[i] = arr[temp - 1];
                 arr[temp - 1] = temp;
             }
         }

         for (int i = 0; i < n; i++) {
             if (arr[i] != i + 1) {
                 return i + 1;
             }
         }
         return n + 1;
     }
     //Method to perform binary search operation
    public static int binarySearch(int[] arr,int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
