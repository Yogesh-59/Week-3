package CountingSort;

import HeapSort.SortJobApplicants;

public class Main {
    public static void main(String []args){
        //make the array that stor the students age
        int [] arr={ 12,13,14,18,15,14,15,18,16,17};
        //make the object of class and call
        SortStudentAges sortAge =new SortStudentAges(arr);
        //call the counting sort method
        sortAge.countingSortAges();
        //call display method
        sortAge.displayStuAge();

    }
}
