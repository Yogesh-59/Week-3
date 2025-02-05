package BinarySearch.FindthePeakElement;

import BinarySearch.FindRotationPoint.BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []arr={5,3,7,5,9,2,1,10};
        //Make the object of class and call
        Arrays.sort(arr);
        PeakElementFinder peakElementFinder=new PeakElementFinder(arr);
        int index=peakElementFinder.peakElement();
        //Printing the index of largest element index
        System.out.println("The largest element index is: "+index);
    }
}
