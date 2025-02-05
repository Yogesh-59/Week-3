package InputStreamReader.ConverByteStreamToChar;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        //Using String to put the file path of sample text
        String filePath="C:\\Users\\india\\OneDrive\\Desktop\\week\\Week-3\\Day04\\src\\src\\InputStreamReader\\ConverByteStreamToChar\\Note.txt";
        Charset charset= StandardCharsets.UTF_8;
        //Create the object of class and call
        ByteToCharStreamConvert byteToCharStreamConvert=new ByteToCharStreamConvert(filePath,charset);
        byteToCharStreamConvert.converStreams();
    }
}
