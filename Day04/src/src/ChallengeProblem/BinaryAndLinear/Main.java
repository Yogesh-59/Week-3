package ChallengeProblem.BinaryAndLinear;

public class Main {
    public static void main(String[] args) {
        //Make array and pass the value
        int[] nums = {3, 4, -1, 1};
        //Make the object of class and call
        SearchOperations searchOperations=new SearchOperations();
        //call method find first missing positive
        int missing=searchOperations.findFirstMissingPositive(nums);
        //print the result
        System.out.println("First missing positive: " + missing);
        //create another array
        int[] arr = {11, 52, 38, 49, 75};
        //set target value
        int target = 38;
        //call Method binary Search
        int index = searchOperations.binarySearch(arr, target);
        //Display the result
        System.out.println("Target index: " + index);
    }
}
