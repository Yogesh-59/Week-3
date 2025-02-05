package LinearSearch.FirstNegativeNumber;

public class FindNegativeNumber {
    //creating the instance of class
    public int[] arr;
    //using constructor to initialize the instance
     FindNegativeNumber(int []arr){
         this.arr=arr;
     }
     //Method to find out the negative number index in array
     public int negativeNumberIndx(){
         int len=arr.length;
         for(int i=0;i<len;++i){
             if(arr[i] <0){
                 return i;
             }

         }
         return -1;
     }
}
