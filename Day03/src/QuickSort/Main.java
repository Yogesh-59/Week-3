package QuickSort;

public class Main {
    public static void main(String []args){
        //creating the integer type array and put the some value
        int []arr={7,5,25,6,8,1,3};
        int low=0;
        int high= arr.length -1;
        //Creating the object of class and call
        SortProductPrice spp=new SortProductPrice();
        //call the quick sort method
        spp.quickSort(arr,low,high);
        //call the display result method
        spp.displayResult(arr);
    }
}
