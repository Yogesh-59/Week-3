package ArrayVsHashSetVsTreeSet;

import java.util.Random;

public class Main {
    public static int[] generateArr(int size,int bound){
        //getting random array
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

            int target= random.nextInt(1000000);
            long startTime = System.nanoTime();
            //creating the object of class and call
            Array array = new Array(data,target);
            array.arraySearch();
            //calculating total time taken by Array for searching
            long arraySearchTime = (System.nanoTime() - startTime) / 1000000;
            System.out.println("Array time is: "+arraySearchTime);


            startTime=System.nanoTime();
            //creating the object of HashSet Search class and call
            HashSetSearch hash = new HashSetSearch();
            hash.hashSetSearch(data,target);
            //Finding the total time hash set for Searching
            long hashSetTime = (System.nanoTime() - startTime) / 1000000;
            System.out.println("HashSet time is: "+hashSetTime);


            startTime = System.nanoTime();
            //Make the object of TreeSet Search class
            TreeSetSearch tree = new TreeSetSearch();
            //call the method of class
            tree.treeSerSearch(data, target);
            //finding the time of Tree Set for Searching
            long treeSerTime = (System.nanoTime() - startTime) / 1000000;
            System.out.println("TreeSet time is: "+treeSerTime);

            System.out.println(arraySearchTime+", " +hashSetTime+ ", " + treeSerTime);
        }
    }
}
