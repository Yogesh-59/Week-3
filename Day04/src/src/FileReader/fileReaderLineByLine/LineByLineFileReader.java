package FileReader.fileReaderLineByLine;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class LineByLineFileReader {
    public String filePath;
    //initialize using constructor
    LineByLineFileReader(String str){
        this.filePath=filePath;
    }
    //Method to read the file
    public String fileReader() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        StringBuilder sb=new StringBuilder();
        //using try catch to handle exception

        try {
            // Create FileReader and BufferedReader objects
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            // Read the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                // Print each line to the console
                sb.append(line).append("n");
            }


        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            // Handling exceptions
        }
        return sb.toString();
    }
    //method to display result
    public void displayResult(){
        String result=fileReader();
        System.out.println("After File Reader :" + result);
    }
}
