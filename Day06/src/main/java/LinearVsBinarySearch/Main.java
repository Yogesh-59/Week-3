package LinearVsBinarySearch;

import java.util.Arrays;
import java.util.Random;

public class Main {
    //Method to generate the random array
    public static int[] generateArr(int size,int bound){
        //create random array
        Random random=new Random();
        int []arr=new int[size];
        for (int i=0;i<size;++i){
            arr[i]= random.nextInt(bound);
        }
        return arr;
    }
    public static void main(String[] args) {
        Random random=new Random();
        //Create array and put element for size of data
        int []arr={1000,10000,1000000};
        for (int size:arr){
            int []data=generateArr(size,1000000);
            int target= random.nextInt(size);

            long startTime=System.nanoTime();
            //Find out the time taken by linear Search to finding target
            LinearSearch linear=new LinearSearch(data,target);
            linear.linearSearch();
            long linearSearchTime=(System.nanoTime() -startTime)/1000000;
            System.out.println("linear Search Time: "+linearSearchTime);
            //Find out the time taken by Binary Search to finding target
            startTime=System.nanoTime();
            //Sort the data
            Arrays.sort(data);
            long sortTime=(System.nanoTime() -startTime)/1000000;
            //Creating object of class and call
            startTime=System.nanoTime();
            BinarySearch binary=new BinarySearch(data,target);
            //calling the binary search method
            binary.binarySearch();
            long binarySearchTime=(System.nanoTime() -startTime)/1000000;
            System.out.println("binary Search Time: "+binarySearchTime);
            //compare the both time linear Search or binary search
            //System.out.printf("%-15d%n",(binarySearchTime-linearSearchTime));
            System.out.println(linearSearchTime+"  "+ sortTime+"  "+binarySearchTime);

        }
    }
}
