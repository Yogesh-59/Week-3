package MergeSort;
import java.util.*;
public class Main {
    public static void main(String[] args){
        //create the array and pass the elements
        int [] arr={25,5,7,1,9,16,18,10};
        int low =0;
        int high= arr.length -1;
        //Make the object of class and call
        SortBookPrices book= new SortBookPrices(arr);
        //call sort method
        book.sort(arr,low,high);
        //call print Array method
        book.printArray();
    }
}
