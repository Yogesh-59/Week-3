package FileReader.Compare;

import java.io.*;

public class FileAndInputStream {
    //creating the instance of class
    public String filePath;
    //using constructor to initialize the instance
    FileAndInputStream(String filePath){
        this.filePath=filePath;
    }
    //Method to resd the file
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
        System.out.println(count);
        return endTime -startTime;
    }
    //method to read the user input
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
        System.out.println(count);
        return endTime-startTime;
    }
}
