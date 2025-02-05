package BinarySearch.FindFirstAndLastOccurrence;

public class FindElementOccurrence {
    //Make instance of class
    public static int []arr;
    public static int target;
    //Use constructor to initialize the instance
     FindElementOccurrence(int []arr,int target){
         this.arr=arr;
         this.target=target;
     }
     //Method to find first occurrence
     static int findFirst(){
         int left = 0, right = arr.length - 1, result = -1;
         while (left <= right) {
             int mid = left + (right - left) / 2;
             if (arr[mid] == target) {
                 result = mid;
                 right = mid - 1;
             } else if (arr[mid] < target) {
                 left = mid + 1;
             } else {
                 right = mid - 1;
             }
         }
         return result;
     }
     //Method to find last occurrence
    public static int findLast() {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Search in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
