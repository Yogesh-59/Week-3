package HashMapsAndHash.TwoSum;

public class Main {
    public static void main(String []args){
     TwoSum ts=new TwoSum();
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    // Call the twoSum method and print the result
    int[] result = ts.twoSum(nums, target);
        if (result.length > 0) {
        System.out.println("Indices: " + result[0] + ", " + result[1]);
       }
        else {
        System.out.println("No solution found");
    }
  }
}
