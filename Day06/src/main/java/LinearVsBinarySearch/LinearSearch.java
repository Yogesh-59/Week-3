package LinearVsBinarySearch;

public class LinearSearch {
    //create the instance of class
    public int[] arr;
    public int target;
    //Initialize instance using constructor
     LinearSearch(int [] arr,int target){
         this.arr=arr;
         this.target=target;
     }
     //Method to perform linear Search
     public long linearSearch(){
         int len=arr.length;
         for (int i = 0; i <len; i++) {
             if (arr[i] == target) {
                 return i;
             }
         }
         return -1; // Not found

     }
}
