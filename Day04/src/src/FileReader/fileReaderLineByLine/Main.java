package FileReader.fileReaderLineByLine;

public class Main {
    public static void main(String[] args) {
        //Make the string
        String str="Hello world";
        //Create the object of class and call
        LineByLineFileReader fileread=new LineByLineFileReader(str);
        //displaying result
        fileread.displayResult();
    }
}
