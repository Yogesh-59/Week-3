package BinarySearch.SearchTargetValue;

public class MetrixSearch {
    //create instance of class
    public static int[][] arr;
    public static int target;
    //using constructor to initialize the instance
     MetrixSearch(int [][]arr,int target){
         this.arr=arr;
         this.target=target;
     }
     //Method to search key in given matrix
     static boolean searchMatrix(){
         int rows=arr.length;
         int cols=arr[0].length;
         int left=0,right= rows*cols -1;
         if(arr.length ==0 && arr[0].length==0){
             return false;
         }
         while (left <= right) {
             int mid = left + (right - left) / 2;
             int midElement = arr[mid / cols][mid % cols];

             if (midElement == target) {
                 return true;
             } else if (midElement < target) {
                 left = mid + 1;
             } else {
                 right = mid - 1;
             }
         }

         return false;
     }
}
