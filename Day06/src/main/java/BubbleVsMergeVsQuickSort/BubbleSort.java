package BubbleVsMergeVsQuickSort;

public class BubbleSort {
    //creating instance of class
    public int[] arr;
    //using constructor to initialize instance
    BubbleSort(int []arr){

        this.arr=arr;
    }
    //Method to Perform the bubble sort operation
    public void bubbleSort(){
        //find out the length of marks
        int n = arr.length;
        //using loop to sort the marks
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap marks
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
