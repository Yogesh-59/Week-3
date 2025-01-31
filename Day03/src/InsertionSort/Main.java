package InsertionSort;
import java.util.*;
public class Main {
    public static void main(String[]args){
        //using scanner to take user input
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        //create the array
        int []arr=new int[n];
        //using loop to take user input as array
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }

        //Creating the object of class and call
        SortEmployeeId sortEmp=new SortEmployeeId(arr);
        //call sort method
        sortEmp.sort();
        //call print display result method
        sortEmp.displayResult();
    }
}
