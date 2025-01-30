package BubbleSort;

class SortStudentMarks {
    //create the instance of class
    public int[] marks;

    //using Constructor to initialize marks array
    public SortStudentMarks(int[] marks) {
        this.marks = marks;
    }

    // method to perform bubble sort
    public void bubbleSort() {
        //find out the length of marks
        int n = marks.length;
        //create the variable as boolean type and set is false
        boolean isSwapped=false;
        //using loop to sort the marks
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    isSwapped = true;
                }
            }

            // if no swapping occurred array is sorted
            if (!isSwapped) {
                break;
            }
        }
    }

    // method to display marks
    public void displayMarks() {

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // method to get sorted marks array
    public int[] getSortedMarks() {
        return marks;
    }
}
