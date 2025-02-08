package FileVsInputStreamReader;

import java.io.*;

public class StreamInputReader {
    //Make the instance of class
    public String filePath;
    //Initialize the instance using constructor
    StreamInputReader(String filePath){
        this.filePath=filePath;
    }
    //Method to read the file using Input Stream
    public long readUserInput()
    {
        long startTime,endTime;
        int count =0;
        try(InputStream is = new FileInputStream(filePath))
        {
            startTime = System.nanoTime();
            Reader isr = new InputStreamReader(is);
            int data = isr.read();

            while(data != -1){
                char theChar = (char) data;
                data = isr.read();
                if(theChar ==' ')
                {
                    count+=1;
                } else if (theChar=='\n')
                {
                    count+=1;

                }
            }

        }
        catch (RuntimeException e)
        {
            throw new RuntimeException(e);
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        endTime =System.nanoTime();
        return endTime-startTime;
    }
}
