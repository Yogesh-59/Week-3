package HeapSort;

public class Main {
    public static void main(String[]args){
        //creating the array as integer type and put some value
        int []arr={67,45,89,25,81,76,49,50};
        //Make the object of class and call
        SortJobApplicants sortJob=new SortJobApplicants(arr);
        //call heap sort method
        sortJob.heapSort();
        //call the display method
        sortJob.displayArray();
    }
}
