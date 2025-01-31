package InsertionSort;

public class SortEmployeeId {
    //create the instance of class
    public static int [] empId;
    //using constructor to initialize the instance
    SortEmployeeId(int []empId){
        this.empId=empId;
    }
    //Method to performing sort operation
    public static void sort(){
        int len=empId.length;
        for (int i=1;i<len;++i){
            int key=empId[i];
            int j=i-1;
            while(j>=0 && key <empId[j]){
                empId[j+1] =empId[j];
                j=j-1;
            }
            empId[j+1]=key;
        }
    }
    //Method to display the result
    public static void displayResult(){
        //using nested for print each element of array
        for (int ans: empId){
            System.out.print(ans +" ");
        }
        System.out.println();
    }
}
