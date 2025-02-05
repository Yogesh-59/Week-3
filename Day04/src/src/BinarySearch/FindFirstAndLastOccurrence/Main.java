package BinarySearch.FindFirstAndLastOccurrence;

import BinarySearch.FindRotationPoint.BinarySearch;

public class Main {
    public static void main(String[] args) {
        //Create the array and pass the element
        int []arr={5,3,7,5,9,2,1,10,1, 2, 2, 2, 3, 4, 5};
        int target=2;
        //Make the object of class and call
        FindElementOccurrence findElementOccurrence=new FindElementOccurrence(arr,target);
        //call the method first occurrence
        int first = findElementOccurrence.findFirst();
        //call method last occurrence
        int last = findElementOccurrence.findLast();
        //Print the occurrence
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
