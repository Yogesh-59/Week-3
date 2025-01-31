package SelectionSort;

public class Main {
    public static void main(String[]args){
        //creating the array of score and put some value
        int [] array= {6,2,8,9,3,5,1,7};
        //Make the object of class and call
        SortExamScore score=new SortExamScore(array);
        //call the selection sort method
        score.selectionSort();
        //call the display result method
        score.displayResult();
    }
}
