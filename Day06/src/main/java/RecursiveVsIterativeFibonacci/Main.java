package RecursiveVsIterativeFibonacci;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //creating the object of Random class
        Random random=new Random();
        //take the random number
        int n= random.nextInt(50);
        //set the start time
        long startTime = System.nanoTime();
        //create the object of class and call
        RecursiveFibonacci recursive=new RecursiveFibonacci();
        recursive.fibonacciRecursive(n);
        //calculating the total time taken the recursive fibonacci
        long recursiveTime=(System.nanoTime() -startTime)/1000000 ;
        System.out.println("Recursive Time is: "+ recursiveTime);

        startTime=System.nanoTime();
        //Creating the object of iterative fibinacci class and call
        IterativeFibonacci iterative =new IterativeFibonacci();
        //calculate the total time taken by iterative fibonacci
        long iterativeTime=(System.nanoTime() -startTime) /1000000;
        System.out.println("Iterative Time is: "+ iterativeTime);

        System.out.println(recursiveTime+", "+ iterativeTime);
    }
}
