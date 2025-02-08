package ArrayVsHashSetVsTreeSet;

public class Array {
    //creating the instance of class
    public static int []arr;
    public static int target;
    //using constructor to initialize the instance
     Array(int [] data,int target){
         this.arr=data;
         this.target=target;
     }
     //Method to find out the target element in given array
     public static int arraySearch(){
         int len=arr.length;
         for(int it :arr){
             if (it==target)
                 return it;
         }
         return -1;
     }
}
