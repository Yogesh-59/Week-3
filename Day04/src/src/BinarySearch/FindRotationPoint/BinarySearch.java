package BinarySearch.FindRotationPoint;
import java.util.*;
public class BinarySearch {
    //Create the instance of class
    public static int[] arr;
     //use constructor to initialize the instance
     BinarySearch(int[]arr){
         this.arr=arr;
     }
     //Method to find Rotation point of sorted array
     public static int findRotationPoint() {
         int left = 0;
         int right = arr.length - 1;
         while(left <right){
             int mid= left +(right -left) /2;
             if (arr[mid] <arr [right]){
                 right=mid;
             }
             else{
                 left=mid+1;
             }
         }
         return left;
     }

}
