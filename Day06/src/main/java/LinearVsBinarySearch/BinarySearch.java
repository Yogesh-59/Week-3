package LinearVsBinarySearch;

public class BinarySearch {
    //creating the instance of cladd
    public int[] arr;
    public int target;
    //using constructor to initialize the instance
    BinarySearch(int [] arr,int target){
        this.arr=arr;
        this.target=target;
    }
    //Method to perform binary search operation
    public long binarySearch(){
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
