package QuickSort;

public class SortProductPrice {
    //creating the instance of class
    public int [] arr;
    //using constructor in initialize the instance
      SortProductPrice(){
          this.arr=arr;
      }
      //method to use to swap the array element
     public static void  swap( int[]arr ,int i,int j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
     }
     //Method to divide array into multiple parts
     public static int partition(int []arr ,int low ,int high){
         int pivot=arr[high];
         int i=low -1;
         for (int j=low ; j<=high -1;++j){
             if (arr[j]< pivot){
                 i++;
                 swap(arr,i,j);
             }
         }
         swap(arr ,i+1,high);
         return i+1;
     }
     //Method to performing the quick sort
     public static void quickSort(int []arr , int low ,int high){
         int len=arr.length;
         if(low < high){
             int part= partition(arr,low, high);
               quickSort(arr ,low , part-1);
               quickSort(arr ,low+1,high);
         }
     }
     //method to display the result
     public static void displayResult(int []arr){
        for(int num: arr){
            System.out.print(num +" ");
        }
        System.out.println();
     }

}
