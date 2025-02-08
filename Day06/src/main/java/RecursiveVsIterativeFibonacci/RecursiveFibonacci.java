package RecursiveVsIterativeFibonacci;
public class RecursiveFibonacci {
    //Make the instance of class
    public int num;
    //Method to perform the Recursive fibonacci
    public static int fibonacciRecursive(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
        //call back to method
    }

}
