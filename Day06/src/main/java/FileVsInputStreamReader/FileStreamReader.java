package FileVsInputStreamReader;

import java.io.FileReader;
import java.io.IOException;

public class FileStreamReader {
    //Make the instance of class
    public String filePath;
    //Initialize the instance using constructor
     FileStreamReader(String filePath){
         this.filePath=filePath;
     }
     //Method to read the file using fileReader
    public long fileReader()
    {
        long startTime,endTime;
        startTime= System.nanoTime();
        String s="";
        int count =0;
        try (FileReader fr = new FileReader(filePath)) {
            int i;
            while ((i = fr.read()) != -1) {
                s+=((char)i);
                if((char)i == ' ')
                {
                    count+=1;
                }
                else if((char)i == '\n')
                {
                    count+=1;
                }
            }
        }
        //catch the exception
        catch (IOException e) {
            e.printStackTrace();
        }
        endTime = System.nanoTime();
        return endTime -startTime;
    }
}
