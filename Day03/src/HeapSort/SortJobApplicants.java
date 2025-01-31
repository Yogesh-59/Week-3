package HeapSort;

public class SortJobApplicants {
    //creating the instance of class
    public int [] arr;
    //using constructor to initialize the instance
       SortJobApplicants(int[] arr){
           this.arr=arr;
       }
       //Method to heapify a subtree with root at given index
       public void heapify(int []arr ,int len,int i){
           int largest=i;
           int left=2 * i+1;
           int right=2 *i+2;
           if(left < len && arr[left] >arr[largest]){
               largest=left;
           }
           if(right < len && arr[right] >arr[largest]){
               largest=right;
           }
           if (largest !=i){
               int temp=arr[i];
               arr[i]=arr[largest];
               arr[largest]=temp;
                heapify(arr,len,largest);
           }
    }
    //Method to sort an array using Heap Sort
       public void heapSort(){
           int len=arr.length;
           for (int i=len/2 -1;i>=0;i--){
               heapify(arr, len, i);
           }
           for (int i=len-1 ;i>0;--i){
               int temp=arr[0];
               arr[0]=arr[i];
               arr[i]=temp;
               heapify(arr ,i,0);
           }
       }
       //Method to print the result
       public void displayArray(){
           for(int num :arr){
               System.out.print(num +" ");
           }
           System.out.println();
       }
}
