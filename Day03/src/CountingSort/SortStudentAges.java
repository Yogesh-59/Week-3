package CountingSort;

public class SortStudentAges {
    //create the instance of class
    public int[] ages;
   //using parameterize constructor to initialize the instance
    SortStudentAges(int[] student) {
        this.ages = student;
    }
    //method to perform the counting sort
    public  void countingSortAges(){
        int maxAge = 18;
        int minAge = 10;
        int range = maxAge - minAge + 1;

        // Step 1: Create and populate count array
        int[] count = new int[range];
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in sorted order
        int[] sortedAges = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            sortedAges[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(sortedAges, 0, ages, 0, ages.length);

}
//method to display the result
    public void displayStuAge() {
         for (int it : ages) {
             System.out.print(it + " ");
         }
         System.out.println();
     }
}
