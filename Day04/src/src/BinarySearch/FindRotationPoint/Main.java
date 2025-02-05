package BinarySearch.FindRotationPoint;

public class Main {
    public static void main(String[] args) {
        //Create the array and pass the element
        int []arr={5,3,7,5,9,2,1,10};
        //Make the object of class and call
        BinarySearch binarySearch=new BinarySearch(arr);
        int index=binarySearch.findRotationPoint();
        //Printing the index of smallest element index
        System.out.println("The smallest element index is: "+index);
    }
}
