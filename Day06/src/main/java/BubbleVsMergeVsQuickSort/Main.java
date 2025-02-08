package BubbleVsMergeVsQuickSort;

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
        for (int size:arr) {
            int[] data = generateArr(size, 1000000);


           long startTime = System.nanoTime();
           //creating the object of class and call
           BubbleSort sorting = new BubbleSort(data);
           sorting.bubbleSort();
           //calculating total time taken by bubble sort
           long bubbleSortTime = (System.nanoTime() - startTime) / 1000000;
           System.out.println("bubble sort time is: "+bubbleSortTime);


           startTime=System.nanoTime();
           //creating the object of Merge Sort class and call
            MergeSort merge = new MergeSort();
            merge.mergeSort(data, 0, data.length - 1);
            //Finding the total time taken by sorting
            long mergeSortTime = (System.nanoTime() - startTime) / 1000000;
            System.out.println("merge sort time is: "+mergeSortTime);


            startTime = System.nanoTime();
            //Make the object of quick sort class
            QuickSort quick = new QuickSort();
            //call the method of class
            quick.quickSort(data, 0, data.length - 1);
            //finding the time of quick sort
            long quickSortTime = (System.nanoTime() - startTime) / 1000000;
            System.out.println("quick sort time is: "+quickSortTime);

            System.out.println(bubbleSortTime+", " +mergeSortTime+ ", " + quickSortTime);
        }
    }
}
