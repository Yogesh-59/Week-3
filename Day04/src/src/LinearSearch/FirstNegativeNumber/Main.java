package LinearSearch.FirstNegativeNumber;

public class Main {
    public static void main(String[] args) {
        //Take integer type array
        int []arr={2,6,3,5,-4,7};
        //Make the object of class and call
        FindNegativeNumber findNumber=new FindNegativeNumber(arr);
        int ans=findNumber.negativeNumberIndx();
        //check the number is occured or not
        if(ans <0){
            System.out.println("Negative number is not present in arr : "+ans);
        }
        else{
            System.out.println("Negative number is occured index: "+ans);
        }
    }
}
