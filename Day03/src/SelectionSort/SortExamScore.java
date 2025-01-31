package SelectionSort;

public class SortExamScore {
    //create the instance of class
    public int []arr;
    //using constructor to initialize the instance
      SortExamScore(int []arr) {
          this.arr = arr;
      }
      //Method to perform the selection sort
      public void selectionSort(){
          int len=arr.length;
           for(int i=0;i<len-1;++i){
               int minIdx=i;
               for (int j=i+1;j<len;++j ){
                   if(arr[j] <arr[minIdx]){
                       minIdx=j;
                   }
               }
               //swap the element in array
               int temp=arr[i];
               arr[i]=arr[minIdx];
               arr[minIdx]=temp;
           }
      }
      //Method to display the result
      public void displayResult(){
          for (int num: arr){
              System.out.print(num +" ");
          }
          System.out.println();
      }
}

