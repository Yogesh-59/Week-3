package BinarySearch.SearchTargetValue;

public class Main {
    public static void main(String[] args) {
        //creating 2D array
        int [][]arr={{1,2,3},{8,7,6},{4,8,9}};
        //set target value
        int target=7;
        //create the object of class and call
        MetrixSearch matrix=new MetrixSearch(arr,target);
        System.out.println("Target found: "+matrix.searchMatrix());
    }
}
