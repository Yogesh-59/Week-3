package BinarySearch.FindthePeakElement;

public class PeakElementFinder {
    //creating the instance of class
    public static int[] arr;
    //Using constructor to initialize the instance
      PeakElementFinder(int []arr){
          this.arr=arr;
      }
      //Method to find the peak element in Array using binary search
      static int peakElement(){
          int left=0;
          int right=arr.length -1;
          while(left < right) {
              int mid= left +(right -left) /2;
              if(arr[mid]>arr[mid+1]){
                  right=mid;
              }
              else {
                  left=mid+1;
              }
          }
          return left;
      }
}
