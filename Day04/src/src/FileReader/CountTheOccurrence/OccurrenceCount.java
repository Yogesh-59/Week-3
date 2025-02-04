package FileReader.CountTheOccurrence;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class OccurrenceCount {
    //create the instance of class
    public String filePath;
    public String targetWord;
    //using constructor to initialize the instance
      OccurrenceCount(String filePath,String targetWord){
          this.filePath=filePath;
          this.targetWord=targetWord;
      }
      //Method to count the occurrence of target Word
      public int countOccurrence(){
          int count=0;

          try(BufferedReader buffer=new BufferedReader(new FileReader(filePath))){
              String line;
              // Read the file line by line
              while((line = buffer.readLine())!=null){
                  // Split the line into words
                String[] words=line.toLowerCase().split("\\s+");
                  //use for to Count occurrences of the target word in this line
                for (String word:words){
                    if(word.equals(targetWord.toLowerCase())){
                        count++;
                    }
                }
              }
          }
          catch (IOException e){
              System.err.println("Error while reading the file: "+ e.getMessage());
          }
          return count;
      }
      //Method to display the Result
      public void displayResult(){
          System.out.println("The word "+targetWord +" is appear "+countOccurrence()+" times in the file");
      }
}
