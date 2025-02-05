package InputStreamReader.ConverByteStreamToChar;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public class ByteToCharStreamConvert {
    //Create the instance of class
    public String filePath;
    public Charset charset;
    //Using constructor to initialize the instance
     ByteToCharStreamConvert(String filePath,Charset charset){
         this.filePath=filePath;
         this.charset=charset;
     }
     //Method to convert Byte Stream to Char Stream
     public void converStreams(){
         // Use try with resources to automatically close the streams
         try(FileInputStream fileStream=new FileInputStream(filePath); InputStreamReader inputStream=new InputStreamReader(fileStream,charset);
         BufferedReader bufferedReader=new BufferedReader(inputStream)){
           String line;
             // read the file line by line
           while((line=bufferedReader.readLine())!=null){
               System.out.println(line);
               // Print the line to the console
           }
         } catch (IOException e) {
             // Handle any IO exceptions is occure
             System.out.println("Error is occurred while reading file "+e.getMessage());
         }
     }
}
