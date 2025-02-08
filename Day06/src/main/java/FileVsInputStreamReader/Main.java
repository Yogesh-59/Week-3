package FileVsInputStreamReader;

public class Main {
    public static void main(String[] args) {
        //Taking file path as String
        String filePath="C:\\Users\\india\\OneDrive\\Desktop\\week\\Week-3\\Day06\\src\\main\\java\\FileVsInputStreamReader\\Input.txt";
        //creating the object of class and call
        FileStreamReader file=new FileStreamReader(filePath);
        //call the method
        long fileStreamTime=file.fileReader();
        System.out.println("Total time Taken by FileReader: "+fileStreamTime/1000000);
        //creating the object of class and call
        StreamInputReader inputStream=new StreamInputReader(filePath);
        //call inputStream method
        long inputStreamTime=inputStream.readUserInput();
        System.out.println("Total time Taken by InputStream Reader: "+inputStreamTime/1000000);
    }
}
