package BubbleSort;
import java.util.*;
public class Main {
    public static void main(String[]args){
        //create the array as Student marks
        int[] studentMarks = {78, 65, 90, 45, 88, 82, 71};
        //make the object of class and call
        SortStudentMarks stu = new SortStudentMarks(studentMarks);
        //call display marks method
        stu.displayMarks();
        //Than bubble sort is performed and call method
        stu.bubbleSort();
        stu.displayMarks();
    }
}
