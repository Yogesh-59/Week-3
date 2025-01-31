package MergeSort;

public class SortBookPrices {
    //creating the instance of class
    public int [] arr;
    //using constructor to initialize the instance
    SortBookPrices(int [] arr){
        this.arr=arr;
    }
    //method to merge the two subArrays
    public void merge(int []arr , int low , int mid , int high){
        // Find size of two subArrays to be merged
        int subArr1= mid- low +1;
        int subArr2=high -mid;
        // create temp array
        int [] temp1=new int[subArr1];
        int [] temp2=new int[subArr2];
        // Copy data to temp arrays
        for (int i=0;i<subArr1 ;++i){
            temp1[i]=arr[low+i];
        }
        for (int j=0;j<subArr2 ;++j){
            temp2[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k=low;
        // Merge the temp arrays
        while(i <subArr1 && j<subArr2){
            if(temp1[i] <= temp2[j]){
                arr[k]=temp1[i];
                i++;
                k++;
            }
            else{
                arr[k]=temp2[j];
                j++;
                k++;
            }
        }
        // Copy remaining elements in temp1 array
        while(i < subArr1 ){
            arr[k]=temp1[i];
            i++;
            k++;
        }
        // Copy remaining elements in temp2 array
        while (j < subArr2) {
            arr[k] = temp2[j];
            j++;
            k++;
        }
    }
    //Method to sort the given array
    public void sort(int [] arr ,int low , int high){
        int len=arr.length;

        while(low < high){
            int mid=low + (high- low)/2;
            sort(arr ,low ,mid);
            sort(arr, mid +1, high);
            merge(arr , low , mid ,high);
        }
    }
    //Method to print the sorted Array
    public  void printArray(){
        int len=arr.length;
         for(int it : arr){
             System.out.print(it +" ");
         }
        System.out.println();
    }
}
